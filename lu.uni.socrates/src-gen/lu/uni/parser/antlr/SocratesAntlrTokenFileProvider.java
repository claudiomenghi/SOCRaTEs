/*
 * generated by Xtext 2.17.0.M1
 */
package lu.uni.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SocratesAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("lu/uni/parser/antlr/internal/InternalSocrates.tokens");
	}
}