/*
 * generated by Xtext
 */
package uom.ac.uk.msc.cucumber.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import uom.ac.uk.msc.cucumber.ui.internal.GherkinActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GherkinExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GherkinActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GherkinActivator.getInstance().getInjector(GherkinActivator.UOM_AC_UK_MSC_CUCUMBER_GHERKIN);
	}
	
}
