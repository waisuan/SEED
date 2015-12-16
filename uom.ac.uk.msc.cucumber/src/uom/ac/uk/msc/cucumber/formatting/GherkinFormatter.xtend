/*
 * generated by Xtext
 */
package uom.ac.uk.msc.cucumber.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import javax.inject.Inject
import uom.ac.uk.msc.cucumber.services.GherkinGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

// import com.google.inject.Inject;
// import uom.ac.uk.msc.cucumber.services.GherkinGrammarAccess
/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class GherkinFormatter extends AbstractDeclarativeFormatter {

	@Inject extension GherkinGrammarAccess

	override protected void configureFormatting(FormattingConfig c) {
		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)

		var access = (super.getGrammarAccess() as GherkinGrammarAccess) as GherkinGrammarAccess;

		// c.setIndentationDecrement().before(access.getFeatureRule());
		c.setIndentationIncrement().before(access.getFeatureRule());
		c.setIndentationDecrement().after(access.getFeatureRule());

		// c.setIndentationDecrement().before(access.getBackgroundRule());
		c.setIndentationIncrement().before(access.getBackgroundRule());
		c.setIndentationDecrement().after(access.getBackgroundRule());
		
		//c.setLinewrap(1,1,Integer.MAX_VALUE).before(access.scenarioRule)

		// c.setIndentationDecrement().before(access.getScenarioRule());
		c.setIndentationIncrement().before(access.getScenarioRule());
		c.setIndentationDecrement().after(access.getScenarioRule());

		// c.setIndentationDecrement().before(access.getScenarioOutlineRule());
		c.setIndentationIncrement().before(access.getScenarioOutlineRule());
		c.setIndentationDecrement().after(access.getScenarioOutlineRule());

		// c.setIndentationDecrement().before(access.getNarrativeRule());
		c.setIndentationIncrement().before(access.getNarrativeRule());
		c.setIndentationDecrement().after(access.getNarrativeRule());

		// c.setIndentationDecrement().before(access.getStepRule());
		c.setIndentationIncrement().before(access.getStepRule());
		c.setIndentationDecrement().after(access.getStepRule());

		c.setNoSpace().after(access.getStepKeywordRule());

		// c.setIndentationDecrement().before(access.getExamplesRule());
		c.setIndentationIncrement().before(access.getExamplesRule());
		c.setIndentationDecrement().after(access.getExamplesRule());

		// c.setIndentationDecrement().before(access.getTableRule());
		c.setIndentationIncrement().before(access.getTableRule());
		c.setIndentationDecrement().after(access.getTableRule());

		// c.setIndentationDecrement().before(access.getDocStringRule());
		c.setIndentationIncrement().before(access.getDocStringRule());
		c.setIndentationDecrement().after(access.getDocStringRule());
		
	}
}