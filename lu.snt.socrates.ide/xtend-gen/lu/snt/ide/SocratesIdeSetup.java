/**
 * generated by Xtext 2.16.0
 */
package lu.snt.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lu.snt.SocratesRuntimeModule;
import lu.snt.SocratesStandaloneSetup;
import lu.snt.ide.SocratesIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SocratesIdeSetup extends SocratesStandaloneSetup {
  @Override
  public Injector createInjector() {
    SocratesRuntimeModule _socratesRuntimeModule = new SocratesRuntimeModule();
    SocratesIdeModule _socratesIdeModule = new SocratesIdeModule();
    return Guice.createInjector(Modules2.mixin(_socratesRuntimeModule, _socratesIdeModule));
  }
}