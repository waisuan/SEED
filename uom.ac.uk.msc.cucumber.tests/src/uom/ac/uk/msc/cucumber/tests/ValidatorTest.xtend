package uom.ac.uk.msc.cucumber.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import uom.ac.uk.msc.cucumber.GherkinInjectorProvider
import org.eclipse.xtext.junit4.util.ParseHelper
import com.google.inject.Inject
import uom.ac.uk.msc.cucumber.gherkin.Feature
import org.junit.Test
import static org.junit.Assert.*
import uom.ac.uk.msc.cucumber.gherkin.Scenario
import uom.ac.uk.msc.cucumber.gherkin.Step
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import uom.ac.uk.msc.cucumber.gherkin.impl.GherkinFactoryImpl

@InjectWith(GherkinInjectorProvider)
@RunWith(XtextRunner)
class ValidatorTest {

	@Inject
	ParseHelper<Feature> parser

	@Inject
	ValidationTestHelper validationTestHelper

	@Test
	def void parseGherkin() {
		val model = parser.parse("Feature: MyFeature \n\n Scenario: MyScenario \n\n Given this is a step");
		assertEquals(model.getTitle(), "MyFeature");
		var scenario = model.getScenarios().get(0) as Scenario;
		assertEquals(scenario.getTitle(), "MyScenario");
		var step = scenario.getSteps().get(0) as Step;
		assertEquals(step.getDescription(), "this is a step");
	}

	@Test
	def void testDuplicateScenario() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n Given this is a step \n\n 
				Scenario: MyScenario \n\n Given this is also a step"
		);
		validationTestHelper.assertNoErrors(model);
	}

	@Test
	def void testDuplicateScenarioOutline() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario Outline: MyScenarioOutline \n\n Given this is a step \n\n 
				Examples: \n\n
				| a | b | \n\n
				Scenario Outline: MyScenarioOutline \n\n Given this is also a step \n\n
				Examples: \n\n
				| a | b | \n\n"
		);
		validationTestHelper.assertNoErrors(model);
	}

	@Test
	def void testDuplicateStepInScenario() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n Given this is a step \n 
				Given this is a step \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testDuplicateStepInScenarioOutline() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario Outline: MyScenarioOutline \n\n Given this is a step \n\n 
				Given this is a step \n\n
				Examples: \n\n
				| a | b | \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testDuplicateStepInBackground() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Background: \n\n Given this is a step \n 
				Given this is a step \n\n
				Scenario: MyScenario \n\n Given this is also a step \n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testStepAlreadyExistsInBackground() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Background: \n\n Given this is a step \n 
				Scenario: MyScenario \n\n Given this is a step \n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testDuplicateGivenStepsAcrossScenarios() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n Given this is a step \n\n
				Scenario: MyScenario1 \n\n Given this is a step \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testDuplicateGivenAndButStepsAcrossScenarios() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n Given this is a step \n
				And this is also a step \n
				But this is not \n\n
				Scenario: MyScenario1 \n\n Given this is a step \n
				And this is also a step \n
				But this is not \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testConsecutiveGivenWhenThenSteps() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n Given this is a step \n
				Given this is also a step \n
				Given this is not \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testIfScenarioIsTooLong() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n 
				Given this is a step \n
				When this is also a step \n
				Then this is not \n
				And this is extra stuff \n
				And something else \n
				And something more \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testIfScenarioIsTooShort() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n 
				Given this is a step \n\n"
		);
		validationTestHelper.assertNoIssues(model)
//		validationTestHelper.assertIssue(model, model.getScenarios().get(0).eClass, "tooLongScenario", null,
//			"Try to keep the number of steps in a scenario between 3 - 5 in order for it to be meaningful. "
//					+ "Maybe separate them into multiple scenarios?");
	}

	@Test
	def void testIfBackgroundIsTooLong() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Background: \n\n 
				Given this is a bg step \n
				And this is a bg step1 \n
				And this is a bg step2 \n
				And this is a bg step3 \n
				And this is a bg step4 \n\n
				Scenario: MyScenario \n\n 
				Given this is a step \n
				When this is also a step \n
				Then this is not \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testIfThereAreMoreThanOneWhenStep() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n 
				Given this is a step \n
				When this is also a step \n
				When this is another 'When' step \n
				Then this is not \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testIfStepConsistsOfTheWordAnd() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n 
				Given this is a step and this is also a step \n
				When this is a Cucumber test \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testIfStepConsistsOfTheWordBut() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: MyScenario \n\n 
				Given this is a step but this is also a step \n
				When this is a Cucumber test \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testIfRowsInExamplesTableAreUnique() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario Outline: MyScenarioOutline \n\n Given this is a step \n\n 
				Examples: \n\n
				| a | b |\n| a | b |\n\n"
		);

		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testIfScenariosCanBeAlteredToScenarioOutline() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: eat 5 out of 12 \n
					Given there are 12 cucumbers \n
  					When I eat 5 cucumbers \n
  					Then I should have 7 cucumbers \n\n
				Scenario: eat 5 out of 20 \n
					Given there are 20 cucumbers \n
  					When I eat 5 cucumbers \n
  					Then I should have 15 cucumbers \n\n"
		);

		validationTestHelper.assertNoIssues(model)
	}

	@Test
	def void testAScenarioThatShouldHaveNoWarningsOrErrors() {
		val model = parser.parse(
			"Feature: MyFeature \n\n 
				Scenario: eat 5 out of 12 \n
					Given there are 12 cucumbers \n
  					When I eat 5 cucumbers \n
  					Then I should have 7 cucumbers \n\n"
		);
		validationTestHelper.assertNoIssues(model)
	}
}
