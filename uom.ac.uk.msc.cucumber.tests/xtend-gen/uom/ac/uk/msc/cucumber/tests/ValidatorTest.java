package uom.ac.uk.msc.cucumber.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uom.ac.uk.msc.cucumber.GherkinInjectorProvider;
import uom.ac.uk.msc.cucumber.gherkin.Feature;
import uom.ac.uk.msc.cucumber.gherkin.Scenario;
import uom.ac.uk.msc.cucumber.gherkin.Step;

@InjectWith(GherkinInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ValidatorTest {
  @Inject
  private ParseHelper<Feature> parser;
  
  @Inject
  private ValidationTestHelper validationTestHelper;
  
  @Test
  public void parseGherkin() {
    try {
      final Feature model = this.parser.parse("Feature: MyFeature \n\n Scenario: MyScenario \n\n Given this is a step");
      String _title = model.getTitle();
      Assert.assertEquals(_title, "MyFeature");
      EList<EObject> _scenarios = model.getScenarios();
      EObject _get = _scenarios.get(0);
      Scenario scenario = ((Scenario) _get);
      String _title_1 = scenario.getTitle();
      Assert.assertEquals(_title_1, "MyScenario");
      EList<Step> _steps = scenario.getSteps();
      Step _get_1 = _steps.get(0);
      Step step = ((Step) _get_1);
      String _description = step.getDescription();
      Assert.assertEquals(_description, "this is a step");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateScenario() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n Given this is a step \n\n \r\n\t\t\t\tScenario: MyScenario \n\n Given this is also a step");
      this.validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateScenarioOutline() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario Outline: MyScenarioOutline \n\n Given this is a step \n\n \r\n\t\t\t\tExamples: \n\n\r\n\t\t\t\t| a | b | \n\n\r\n\t\t\t\tScenario Outline: MyScenarioOutline \n\n Given this is also a step \n\n\r\n\t\t\t\tExamples: \n\n\r\n\t\t\t\t| a | b | \n\n");
      this.validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateStepInScenario() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n Given this is a step \n \r\n\t\t\t\tGiven this is a step \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateStepInScenarioOutline() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario Outline: MyScenarioOutline \n\n Given this is a step \n\n \r\n\t\t\t\tGiven this is a step \n\n\r\n\t\t\t\tExamples: \n\n\r\n\t\t\t\t| a | b | \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateStepInBackground() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tBackground: \n\n Given this is a step \n \r\n\t\t\t\tGiven this is a step \n\n\r\n\t\t\t\tScenario: MyScenario \n\n Given this is also a step \n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testStepAlreadyExistsInBackground() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tBackground: \n\n Given this is a step \n \r\n\t\t\t\tScenario: MyScenario \n\n Given this is a step \n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateGivenStepsAcrossScenarios() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n Given this is a step \n\n\r\n\t\t\t\tScenario: MyScenario1 \n\n Given this is a step \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateGivenAndButStepsAcrossScenarios() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n Given this is a step \n\r\n\t\t\t\tAnd this is also a step \n\r\n\t\t\t\tBut this is not \n\n\r\n\t\t\t\tScenario: MyScenario1 \n\n Given this is a step \n\r\n\t\t\t\tAnd this is also a step \n\r\n\t\t\t\tBut this is not \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testConsecutiveGivenWhenThenSteps() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n Given this is a step \n\r\n\t\t\t\tGiven this is also a step \n\r\n\t\t\t\tGiven this is not \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfScenarioIsTooLong() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n \r\n\t\t\t\tGiven this is a step \n\r\n\t\t\t\tWhen this is also a step \n\r\n\t\t\t\tThen this is not \n\r\n\t\t\t\tAnd this is extra stuff \n\r\n\t\t\t\tAnd something else \n\r\n\t\t\t\tAnd something more \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfScenarioIsTooShort() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n \r\n\t\t\t\tGiven this is a step \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfBackgroundIsTooLong() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tBackground: \n\n \r\n\t\t\t\tGiven this is a bg step \n\r\n\t\t\t\tAnd this is a bg step1 \n\r\n\t\t\t\tAnd this is a bg step2 \n\r\n\t\t\t\tAnd this is a bg step3 \n\r\n\t\t\t\tAnd this is a bg step4 \n\n\r\n\t\t\t\tScenario: MyScenario \n\n \r\n\t\t\t\tGiven this is a step \n\r\n\t\t\t\tWhen this is also a step \n\r\n\t\t\t\tThen this is not \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfThereAreMoreThanOneWhenStep() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n \r\n\t\t\t\tGiven this is a step \n\r\n\t\t\t\tWhen this is also a step \n\r\n\t\t\t\tWhen this is another \'When\' step \n\r\n\t\t\t\tThen this is not \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfStepConsistsOfTheWordAnd() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n \r\n\t\t\t\tGiven this is a step and this is also a step \n\r\n\t\t\t\tWhen this is a Cucumber test \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfStepConsistsOfTheWordBut() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: MyScenario \n\n \r\n\t\t\t\tGiven this is a step but this is also a step \n\r\n\t\t\t\tWhen this is a Cucumber test \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfRowsInExamplesTableAreUnique() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario Outline: MyScenarioOutline \n\n Given this is a step \n\n \r\n\t\t\t\tExamples: \n\n\r\n\t\t\t\t| a | b |\n| a | b |\n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIfScenariosCanBeAlteredToScenarioOutline() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: eat 5 out of 12 \n\r\n\t\t\t\t\tGiven there are 12 cucumbers \n\r\n  \t\t\t\t\tWhen I eat 5 cucumbers \n\r\n  \t\t\t\t\tThen I should have 7 cucumbers \n\n\r\n\t\t\t\tScenario: eat 5 out of 20 \n\r\n\t\t\t\t\tGiven there are 20 cucumbers \n\r\n  \t\t\t\t\tWhen I eat 5 cucumbers \n\r\n  \t\t\t\t\tThen I should have 15 cucumbers \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAScenarioThatShouldHaveNoWarningsOrErrors() {
    try {
      final Feature model = this.parser.parse(
        "Feature: MyFeature \n\n \r\n\t\t\t\tScenario: eat 5 out of 12 \n\r\n\t\t\t\t\tGiven there are 12 cucumbers \n\r\n  \t\t\t\t\tWhen I eat 5 cucumbers \n\r\n  \t\t\t\t\tThen I should have 7 cucumbers \n\n");
      this.validationTestHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
