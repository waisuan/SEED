/*
 * generated by Xtext
 */
package uom.ac.uk.msc.cucumber.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GherkinAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("uom/ac/uk/msc/cucumber/parser/antlr/internal/InternalGherkin.tokens");
	}
}
