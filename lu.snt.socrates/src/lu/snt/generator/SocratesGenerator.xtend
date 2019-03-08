/*
 * generated by Xtext 2.10.0
 */
package lu.snt.generator

import java.io.StringWriter
import java.nio.file.Paths
import java.util.HashMap
import lu.snt.rsfol.EObject2RSFOL
import lu.snt.rsfol.shifting.intervalshif.IntevalShiftingVisitor
import lu.snt.rsfol.shifting.timeshifting.TimeShiftVisitor
import lu.snt.rsfol.visitors.RSFOL2NumberOfBlocks
import lu.snt.rsfol.visitors.RSFOL2NumberOfConnections
import lu.snt.rsfol.visitors.RSFOL2Simulink
import lu.snt.rsfol.visitors.RSFOL2Size
import lu.snt.rsfol.visitors.RSFOLGetSignals
import lu.snt.rsfol.visitors.RSFOLPushNegations
import lu.snt.rsfol.wellformedness.TimedVariableUsedOnceCheck
import lu.snt.socrates.Oracle
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import lu.snt.rsfol.visitors.RSFOL2MaximumExistBound
import lu.snt.rsfol.preprocessing.Preprocess

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SocratesGenerator extends AbstractGenerator {

	static HashMap<String, Integer> mapModelNumReq = new HashMap<String, Integer>();
	static HashMap<String, Integer> mapModelRequirementSize = new HashMap<String, Integer>();

	static int numReq = 0;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		numReq = 0;
		mapModelNumReq = new HashMap<String, Integer>();
		mapModelRequirementSize = new HashMap<String, Integer>();

		val writer = new StringWriter();

		
		for (o : resource.allContents.toIterable.filter(Oracle)) {
			if (!mapModelNumReq.containsKey(o.modelName)) {
				mapModelNumReq.put(o.modelName, 0);
				mapModelRequirementSize.put(o.modelName, 0);
			}

			mapModelNumReq.put(o.modelName, mapModelNumReq.get(o.modelName) + 1);
			System.out.println(o.modelName)
			System.out.println(o.reqname);

			writer.append(o.modelName + ",");
			writer.append(o.reqname + ",");

			val startTime = System.nanoTime();

			Socrates2Simulink(o, fsa, writer);
			val endTime = System.nanoTime();

			val duration = (endTime - startTime) / 1000000.0; // ms
			writer.append(duration + "\n");

		}
		writer.close;
		fsa.generateFile("statistics.txt", writer.toString);
		val generalStatisticswriter = new StringWriter();
		for (String e : mapModelNumReq.keySet) {
			numReq = numReq + mapModelNumReq.get(e);
			generalStatisticswriter.write(
				e + "\t" + mapModelNumReq.get(e) + "\t" +
					((mapModelRequirementSize.get(e) as float) / (mapModelNumReq.get(e))) + "\n");
		}
		generalStatisticswriter.write("Total Number of Requirements:\t" + numReq + "\n");

		fsa.generateFile("GeneralStatistics.txt", generalStatisticswriter.toString);
	}

	def Socrates2Simulink(Oracle m, IFileSystemAccess2 fsa, StringWriter writer) {

		val StringWriter w = new StringWriter();
		val voriginal = new EObject2RSFOL().eObject2RSFOL(m);
		
		w.write("% original requirement\n");
		w.write("% " + voriginal + "\n");
		if (!voriginal.accept(new TimedVariableUsedOnceCheck())) {
			throw new IllegalArgumentException("Each timed variable should be used once in the formula");
		}
		val vpushed=voriginal.accept(new RSFOLPushNegations(false));
		
		val fafterpushing = vpushed.accept(new Preprocess());


		val v1=fafterpushing.accept(new TimeShiftVisitor(fafterpushing));
		

		println("Time shifted requirement:")
		System.out.println(v1);
		
		val visitor = new IntevalShiftingVisitor(v1)
		val v2 = v1.accept(visitor);
		println("Interval shifted requirement:")
		System.out.println(v2);

		System.out.println(
			"By running the simulator up to t_fin you compute the results up to t_fin-" + visitor.simulationShifting +
				" due to the shifting procedure\n");
		System.out.println("You have to run the simulator at least for " + visitor.maximumLowerBound);

		if (visitor.maximumUpperBound == -1) {
			System.out.println(
				"You have to run the simulator up t_fin for completing the evaluation of the formula "
			);
		} else {
			System.out.println(
				"You have to run the simulator at up to t_fin="+visitor.maximumUpperBound+" for completing the evaluation of the formula "
			);
		}

		w.write("% shifted requirement\n");
		w.write("% " + v2 + "\n");
		w.write(
			"% By running the simulator up to t_fin you compute the results up to t_fin-" + visitor.simulationShifting +
				" due to the shifting procedure\n");

//		w.write("delete '" + m.name + ".slx'\n")
//		w.write("open_system(new_system('" + m.name + "'))\n");
//		w.write("add_block('simulink/Ports & Subsystems/Subsystem','" + m.modelName + "/" + m.name + "')\n");
		
		w.write("delete_block('" + m.modelName + "/" + m.reqname + "')\n");
		w.write("add_block('simulink/Commonly Used Blocks/Subsystem','" + m.modelName + "/" + m.reqname + "')\n");

		w.write("delete_line('" + m.modelName + "/" + m.reqname + "', 'In1/1', 'Out1/1')\n");

		w.write("delete_block('" + m.modelName + "/" + m.reqname + "/In1')\n");
		w.write("delete_block('" + m.modelName + "/" + m.reqname + "/Out1')\n");

		// updates blocks and connections
		writer.write(v2.accept(new RSFOL2NumberOfBlocks()) + ",");
		writer.write(v2.accept(new RSFOL2NumberOfConnections()) + ",");
		writer.write(v2.accept(new RSFOL2Size())+",");
		
		val String line=v2.accept(new RSFOL2Simulink(m.modelName, m.reqname));
		
		val existupperbound=v2.accept(new RSFOL2MaximumExistBound());
		
		
		w.write(line);

		w.write("% miscellaneous\n")
		w.write("add_block('simulink/Ports & Subsystems/Out1', '" + m.modelName + "/" + m.reqname + "/OutRes')\n")

		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "/1', 'OutRes/1')\n");
		w.write(
			"add_block('simulink/Commonly Used Blocks/Constant', '" + m.modelName + "/" + m.reqname + "/" + v2.hashCode +
				"finalone')\n");
		w.write("set_param('" + m.modelName + "/" + m.reqname + "/" + v2.hashCode + "finalone', 'Value', '1')\n");

		// counting time
		// checking that time is over
		val int formulaSize=v2.accept(new RSFOL2Size());
		mapModelRequirementSize.put(
			m.modelName,
			(formulaSize+mapModelRequirementSize.get(m.modelName))
		);

		w.append("add_block('simulink/Ports & Subsystems/In1','" + m.modelName + "/" + m.reqname + "/tollerablerisk')\n");

		w.write(
			"add_block('simulink/Logic and Bit Operations/Relational Operator', '" + m.modelName + "/" + m.reqname + "/" +
				v2.hashCode + "timespan')\n");
		w.write("set_param('" +  m.modelName + "/" + m.reqname + "/" +
				v2.hashCode + "timespan', 'Operator', '>=')\n");

		w.write("add_line('" + m.modelName + "/" + m.reqname + "', 'tollerablerisk/1', '" + v2.hashCode +
			"timespan/1')\n");

		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "/1', '" + v2.hashCode +
			"timespan/2')\n");

		// creating the switch
		w.write("add_block('simulink/Signal Routing/Switch', '" + m.modelName + "/" + m.reqname + "/" + v2.hashCode +
			"Switchfinal')\n");
		w.write("set_param('"+ m.modelName + "/" + m.reqname + "/" + v2.hashCode + "Switchfinal', 'Criteria', 'u2 > Threshold')\n");

		w.write(
			"add_block('simulink/Commonly Used Blocks/Constant', '" + m.modelName + "/" + m.reqname + "/" + v2.hashCode +
				"finalzero')\n");

		w.write("set_param('" + m.modelName + "/" + m.reqname + "/" + v2.hashCode + "finalzero', 'Value', '0')\n");
		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "finalzero/1', '" + v2.hashCode +
			"Switchfinal/3')\n");
			

		w.write("add_block('simulink/Signal Routing/Switch', '" + m.modelName + "/" + m.reqname + "/" + v2.hashCode +
			"Switchexists')\n");
		w.write("set_param('"+ m.modelName + "/" + m.reqname + "/" + v2.hashCode + "Switchexists', 'Criteria', 'u2 > Threshold')\n");

		w.write("add_block('simulink/Commonly Used Blocks/Constant', '" + m.modelName + "/" + m.reqname + "/" + v2.hashCode + "timec')\n");
		w.write("add_block('simulink/Commonly Used Blocks/Integrator',  '" + m.modelName + "/" + m.reqname + "/" + v2.hashCode + "timeintegrator')\n");
		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "timec/1', '" + v2.hashCode + "timeintegrator/1')\n");

		w.write("add_block('simulink/Commonly Used Blocks/Constant', '" + m.modelName + "/" + m.reqname + "/" + v2.hashCode + "existupperbound')\n");
		w.write("set_param('" + m.modelName + "/" + m.reqname + "/" + v2.hashCode + "existupperbound', 'Value', '"+existupperbound+"')\n");		

		w.write(
			"add_block('simulink/Logic and Bit Operations/Relational Operator', '" + m.modelName + "/" + m.reqname + "/" + v2.hashCode + "stoppingenables')\n");
		w.write("set_param('" +  m.modelName + "/" + m.reqname + "/" + v2.hashCode + "stoppingenables', 'Operator', '>=')\n");

		w.write("add_line('" + m.modelName + "/" + m.reqname + "','" + v2.hashCode + "timeintegrator/1','" + v2.hashCode + "stoppingenables/1')\n");
		w.write("add_line('" + m.modelName + "/" + m.reqname + "','"  + v2.hashCode + "existupperbound/1','" + v2.hashCode + "stoppingenables/2')\n");
		
				
		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "stoppingenables/1', '" + v2.hashCode +
			"Switchexists/2')\n");
		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "finalzero/1', '" + v2.hashCode +
			"Switchexists/3')\n");
		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "timespan/1', '" + v2.hashCode +
			"Switchexists/1')\n");
		
			
			
		
		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "finalone/1', '" + v2.hashCode +
			"Switchfinal/1')\n");
	
		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "Switchexists/1', '" + v2.hashCode +
			"Switchfinal/2')\n");
		
		
		w.write("add_block('simulink/Sinks/To Workspace','"+m.modelName+ "/" + m.reqname +"/stoppingvalue"+m.reqname+"')\n");
		w.write("set_param('"+m.modelName + "/" + m.reqname + "/stoppingvalue"+m.reqname+"','MaxDataPoints','1')\n");
		w.write("set_param('"+m.modelName + "/" + m.reqname + "/stoppingvalue"+m.reqname+"','VariableName','result_"+m.reqname+"')\n");
		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "/1', 'stoppingvalue"+m.reqname+"/1')\n");
			
		// creating the stopping block
		w.write("add_block('simulink/Sinks/Stop Simulation', '" + m.modelName + "/" + m.reqname + "/" + v2.hashCode +
			"stop')\n");
		w.write("add_line('" + m.modelName + "/" + m.reqname + "', '" + v2.hashCode + "Switchfinal/1', '" + v2.hashCode +
			"stop/1')\n");
		
		w.write("% connecting the model and the requirement \n");
		
		var num=1;
		for(s: v2.accept(new RSFOLGetSignals())){
			w.write("set_param('"+m.modelName + "/Model/"+s.name+"','Port','"+num+"')\n");
			w.write("set_param('"+m.modelName + "/" + m.reqname + "/"+s.name+"','Port','"+num+"')\n");
			w.write("add_line('"+m.modelName + "', 'Model/"+ num+"','"+ m.reqname + "/"+num+"')\n");
			
			num=num+1;
		}
		w.write("add_block('simulink/Sources/Constant','"+m.modelName+"/tollerablerisk"+m.reqname+"')\n");
		w.write("set_param('"+m.modelName +"/tollerablerisk"+m.reqname+"','Value','tollerablerisk"+m.reqname+"')\n");
		w.write("add_line('"+m.modelName + "', 'tollerablerisk"+m.reqname+"/1','"+m.reqname+"/"+ num+"')\n");
	
		w.write("add_block('simulink/Sinks/To Workspace','"+m.modelName+"/outsignal"+m.reqname+"')\n");
		w.write("set_param('"+m.modelName + "/outsignal" + m.reqname + "','MaxDataPoints','1')\n");
		w.write("set_param('"+m.modelName+"/outsignal"+m.reqname+"','Variablename','out_"+m.reqname+"')\n");
		w.write("add_line('"+m.modelName + "', '"+m.reqname+"/1','outsignal"+m.reqname+"/1')\n");
	
		
		//w.write("disp('By running the simulator up to t_fin you compute the results up to t_fin-" +visitor.simulationShifting + " due to the shifting procedure')\n");

		// w.write("save_system('" + m.modelName + "');\n")
		if(m.path!==null){

			System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
			println("Saving the file on the path")
			println(m.path+m.reqname + ".m")
			fsa.generateFile(m.path+m.reqname + ".m", w.toString);	
			
		}
		else{
			fsa.generateFile(m.reqname + ".m", w.toString);	
		}
		
	}
}
