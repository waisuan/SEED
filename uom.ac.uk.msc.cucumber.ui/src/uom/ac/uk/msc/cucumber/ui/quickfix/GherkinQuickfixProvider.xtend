/*
 * generated by Xtext
 */
package uom.ac.uk.msc.cucumber.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.Fix
import uom.ac.uk.msc.cucumber.validation.GherkinValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.ui.editor.model.edit.IModification
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.model.IXtextDocument
import org.eclipse.jface.text.FindReplaceDocumentAdapter
import org.eclipse.jface.text.IRegion
import java.util.HashSet
import java.util.Set
import java.util.TreeSet
import java.util.LinkedHashSet
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.emf.ecore.EObject
import uom.ac.uk.msc.cucumber.gherkin.Step
import uom.ac.uk.msc.cucumber.gherkin.Scenario
import uom.ac.uk.msc.cucumber.gherkin.impl.GherkinFactoryImpl
import java.util.List
import java.util.ArrayList
import uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline
import uom.ac.uk.msc.cucumber.gherkin.Background
import uom.ac.uk.msc.cucumber.gherkin.Feature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import uom.ac.uk.msc.cucumber.gherkin.Examples
import uom.ac.uk.msc.cucumber.gherkin.Table

//import org.eclipse.xtext.ui.editor.quickfix.Fix
//import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
//import org.eclipse.xtext.validation.Issue
/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#quick-fixes
 */
class GherkinQuickfixProvider extends org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider {

	@Fix(GherkinValidator::STEP_REPEATED_IN_EVERY_SCENARIO)
	def moveStepsIntoBackground(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Put step(s) into background.', '', null,
			new ISemanticModification() {

				override apply(EObject element, IModificationContext context) throws Exception {

					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					var numOfScenarios = Integer.valueOf(issue.getData().get(2)) as int;
					// totalNumOfRepeatedSteps / numOfScenarios == numOfRepeatedStepsPerScenario
					var int numOfSteps = (issue.getData().size - 3) / numOfScenarios;
					var counter = 3 as int;
					var numOfLinesReplaced = 0 as int;
					var builder = "" as String;
					var uniqueBackgroundSteps = new LinkedHashSet<String>() as Set<String>;

					while (counter < issue.getData().size) {
						var String[] lineNumAndLength = issue.getData().get(counter).split(" ");

						var int lineNumber = Integer.valueOf(lineNumAndLength.get(0));
						var int numOfLines = Integer.valueOf(lineNumAndLength.get(1));
						var int lineLength = Integer.valueOf(lineNumAndLength.get(2));

						// to accommodate for the lines that have already been removed -- shift up.
						lineNumber -= numOfLinesReplaced;

						if (numOfSteps > 0) {
							uniqueBackgroundSteps.add(xtextDocument.get(xtextDocument.getLineOffset(lineNumber - 1),
								lineLength));
							numOfSteps -= 1;
						}

						xtextDocument.replace(xtextDocument.getLineOffset(lineNumber - 1), lineLength, "");
						counter += 1;
						numOfLinesReplaced += numOfLines; // - 1
					}

					for (uniqueBackgroundStep : uniqueBackgroundSteps) {
						builder += uniqueBackgroundStep;
					}

					if (!issue.getData().get(0).equals("")) {
						var int backgroundEndLine = Integer.valueOf(issue.getData().get(0));
						xtextDocument.replace(xtextDocument.getLineOffset(backgroundEndLine), 0, builder); // + System.lineSeparator()
					} else {
						var int firstScenarioOffset = Integer.valueOf(issue.getData().get(1));
						xtextDocument.replace(firstScenarioOffset, 0,
							"Background:" + System.lineSeparator + builder + System.lineSeparator());
					}
				}

			});
	}

	@Fix(GherkinValidator::CONSECUTIVE_STEPS)
	def changeStepKeywordsIntoAndBut(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			'Change into a "And" step',
			'',
			null,
			new IModification() {

				override apply(IModificationContext context) throws Exception {
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					var deductions = 0 as int;

					for (offsets : issue.getData()) {
						var String[] tokens = offsets.split(" ");
						xtextDocument.replace(Integer.valueOf(tokens.get(0)) + deductions,
							Integer.valueOf(tokens.get(1)), "And");
						deductions -= Integer.valueOf(tokens.get(1)) - 3;
					}

				}

			}
		)

		acceptor.accept(
			issue,
			'Change into a "But" step',
			'',
			null,
			new IModification() {

				override apply(IModificationContext context) throws Exception {
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					var deductions = 0 as int;

					for (offsets : issue.getData()) {
						var String[] tokens = offsets.split(" ");
						xtextDocument.replace(Integer.valueOf(tokens.get(0)) + deductions,
							Integer.valueOf(tokens.get(1)), "But");
						deductions -= Integer.valueOf(tokens.get(1)) - 3;
					}

				}

			}
		)

	}

	@Fix(GherkinValidator::SEPARATE_TO_AND_STEPS)
	def splitStepIntoAndSteps(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			'Split step into "And" steps',
			'',
			null,
			new ISemanticModification() {

				override apply(EObject element, IModificationContext context) throws Exception {
					var Step step = element as Step;
					var List<Step> listOfSteps = new ArrayList<Step>();

					if (step.eContainer instanceof Scenario) {
						var Scenario scenario = step.eContainer as Scenario;
						listOfSteps = scenario.getSteps();
					} else if (step.eContainer instanceof ScenarioOutline) {
						var ScenarioOutline scenarioOutline = step.eContainer as ScenarioOutline;
						listOfSteps = scenarioOutline.getSteps();
					} else if (step.eContainer instanceof Background) {
						var Background background = step.eContainer as Background;
						listOfSteps = background.getSteps();
					}

					var int numOfSteps = listOfSteps.size;
					var boolean switchLater = false;
					var int originIndex = listOfSteps.indexOf(step);
					var int nextIndex = originIndex + 1;

					if (nextIndex >= numOfSteps) {
						nextIndex = originIndex;
						switchLater = true;
					}

					step.setDescription(issue.getData().get(0));
					var int counter = 1;
					while (counter < issue.getData().size) {
						var Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
						newStep.setStepKeyword("\t" + "And ");
						newStep.setDescription(issue.getData().get(counter) + System.lineSeparator);
						listOfSteps.add(nextIndex++, newStep);
						counter += 1;
					}

					if (!switchLater && nextIndex < listOfSteps.size) {
						var String keyword = listOfSteps.get(nextIndex).getStepKeyword();
						listOfSteps.get(nextIndex).setStepKeyword("\t" + keyword);
					}

					if (switchLater) {
						var Step firstStep = listOfSteps.get(originIndex);
						var Step lastStep = listOfSteps.get(listOfSteps.size() - 1);
						var Step secondLastStep = listOfSteps.get(listOfSteps.size() - 2);

						var String firstStepKeyword = firstStep.getStepKeyword();
						var String lastStepKeyword = lastStep.getStepKeyword();
						var String firstStepDescription = firstStep.getDescription();
						var String lastStepDescription = lastStep.getDescription();
						var String secondLastStepDescription = secondLastStep.getDescription();

						firstStep.setStepKeyword(lastStepKeyword);
						lastStep.setStepKeyword(firstStepKeyword);
						lastStep.setDescription(" ");
						firstStep.setDescription(lastStepDescription + System.lineSeparator);
						lastStep.setDescription(firstStepDescription); // .trim()
						if (secondLastStep != firstStep) {
							var Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
							newStep.setStepKeyword(lastStep.getStepKeyword());
							newStep.setDescription(lastStep.getDescription());
							lastStep.setDescription(" ");
							listOfSteps.add(originIndex + 1, newStep);
							listOfSteps.remove(lastStep);
							secondLastStep.setDescription(secondLastStepDescription + System.lineSeparator);
						} else {
							firstStep.setStepKeyword("\t" + lastStepKeyword);
							lastStep.setDescription(firstStepDescription.trim());
						}
					}
				}

			}
		)
	}

	@Fix(GherkinValidator::SEPARATE_TO_BUT_STEPS)
	def splitStepIntoButSteps(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			'Split step into "But" steps',
			'',
			null,
			new ISemanticModification() {

				override apply(EObject element, IModificationContext context) throws Exception {
					var Step step = element as Step;
					var List<Step> listOfSteps = new ArrayList<Step>();

					if (step.eContainer instanceof Scenario) {
						var Scenario scenario = step.eContainer as Scenario;
						listOfSteps = scenario.getSteps();
					} else if (step.eContainer instanceof ScenarioOutline) {
						var ScenarioOutline scenarioOutline = step.eContainer as ScenarioOutline;
						listOfSteps = scenarioOutline.getSteps();
					} else if (step.eContainer instanceof Background) {
						var Background background = step.eContainer as Background;
						listOfSteps = background.getSteps();
					}

					var int numOfSteps = listOfSteps.size;
					var boolean switchLater = false;
					var int originIndex = listOfSteps.indexOf(step);
					var int nextIndex = originIndex + 1;

					if (nextIndex >= numOfSteps) {
						nextIndex = originIndex;
						switchLater = true;
					}

					step.setDescription(issue.getData().get(0));
					var int counter = 1;
					while (counter < issue.getData().size) {
						var Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
						newStep.setStepKeyword("\t" + "But ");
						newStep.setDescription(issue.getData().get(counter) + System.lineSeparator);
						listOfSteps.add(nextIndex++, newStep);
						counter += 1;
					}

					if (!switchLater && nextIndex < listOfSteps.size) {
						var String keyword = listOfSteps.get(nextIndex).getStepKeyword();
						listOfSteps.get(nextIndex).setStepKeyword("\t" + keyword);
					}

					if (switchLater) {
						var Step firstStep = listOfSteps.get(originIndex);
						var Step lastStep = listOfSteps.get(listOfSteps.size() - 1);
						var Step secondLastStep = listOfSteps.get(listOfSteps.size() - 2);

						var String firstStepKeyword = firstStep.getStepKeyword();
						var String lastStepKeyword = lastStep.getStepKeyword();
						var String firstStepDescription = firstStep.getDescription();
						var String lastStepDescription = lastStep.getDescription();
						var String secondLastStepDescription = secondLastStep.getDescription();

						firstStep.setStepKeyword(lastStepKeyword);
						lastStep.setStepKeyword(firstStepKeyword);
						lastStep.setDescription(" ");
						firstStep.setDescription(lastStepDescription + System.lineSeparator);
						lastStep.setDescription(firstStepDescription); // .trim()
						if (secondLastStep != firstStep) {
							var Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
							newStep.setStepKeyword(lastStep.getStepKeyword());
							newStep.setDescription(lastStep.getDescription());
							lastStep.setDescription(" ");
							listOfSteps.add(originIndex + 1, newStep);
							listOfSteps.remove(lastStep);
							secondLastStep.setDescription(secondLastStepDescription + System.lineSeparator);
						} else {
							firstStep.setStepKeyword("\t" + lastStepKeyword);
							lastStep.setDescription(firstStepDescription.trim());
						}
					}
				}

			}
		)
	}

	@Fix(GherkinValidator::SIMILAR_SCENARIOS)
	def changeScenariosIntoScenarioOutline(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			'Convert scenario(s) into a Scenario Outline',
			'',
			null,
			new ISemanticModification() {

				override apply(EObject element, IModificationContext context) throws Exception {
					var Scenario scenario = element as Scenario;
					var Feature feature = scenario.eContainer as Feature;
					var int numOfScenarios = Integer.valueOf(issue.getData().get(0));

					for (var int i = numOfScenarios; i >= 1; i--) {
						var Scenario toBeRemoved = (feature.getScenarios().get(
							Integer.valueOf(issue.getData().get(i))) as Scenario);
						feature.getScenarios().remove(toBeRemoved);
					}

					var String scenarioOutlineTitle = issue.getData().get(numOfScenarios + 1);
					var ScenarioOutline scenarioOutline = GherkinFactoryImpl.eINSTANCE.createScenarioOutline();
					scenarioOutline.setTitle(scenarioOutlineTitle + System.lineSeparator);
					feature.getScenarios().add(scenarioOutline);
					var int numOfSteps = Integer.valueOf(issue.getData().get(numOfScenarios + 2));
					var int start = Integer.valueOf(numOfScenarios + 3);

					for (var int i = 0; i < numOfSteps; i++) {
						var Step newStep = GherkinFactoryImpl.eINSTANCE.createStep();
						newStep.setStepKeyword(issue.getData().get(start++));
						newStep.setDescription(issue.getData().get(start++) + System.lineSeparator);
						scenarioOutline.getSteps().add(newStep);
					}

					var Examples example = GherkinFactoryImpl.eINSTANCE.createExamples();
					example.setTitle(System.lineSeparator);
					var Table table = GherkinFactoryImpl.eINSTANCE.createTable();

					table.getRows().add(issue.getData().get(start++) + System.lineSeparator);

					for (var int i = start; i < issue.getData().size; i++) {
						table.getRows().add(issue.getData().get(i) + System.lineSeparator);
					}

					example.setTable(table);
					scenarioOutline.setExamples(example);

				}

			}
		)
	}

	@Fix(GherkinValidator::SCENARIOS_HAVE_TO_BE_UNIQUE)
	def fixDuplicateScenario(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			'Rename "' + issue.getData().get(0) + '"',
			'',
			null,
			new IModification() {

				override apply(IModificationContext context) throws Exception {
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					xtextDocument.replace(issue.getOffset(), issue.getLength(),
						issue.getData().get(0) + issue.getLineNumber());
				}

			}
		)

		acceptor.accept(
			issue,
			'Remove "' + issue.getData().get(0) + '"',
			'',
			null,
			new IModification() {

				override apply(IModificationContext context) throws Exception {
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					xtextDocument.replace(issue.getOffset(), issue.getLength(), "");
				}

			}
		)
	}

	@Fix(GherkinValidator::FEATURES_HAVE_TO_BE_UNIQUE)
	def fixDuplicateFeature(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			'Rename "' + issue.getData().get(0) + '"',
			'',
			null,
			new IModification() {

				override apply(IModificationContext context) throws Exception {
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					xtextDocument.replace(issue.getOffset(), issue.getLength(),
						issue.getData().get(0) + issue.getLineNumber());
				}

			}
		)

		acceptor.accept(
			issue,
			'Remove "' + issue.getData().get(0) + '"',
			'',
			null,
			new IModification() {

				override apply(IModificationContext context) throws Exception {
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					xtextDocument.replace(issue.getOffset(), issue.getLength(), "");
				}

			}
		)
	}

	@Fix(GherkinValidator::DUPLICATE_STEP)
	def fixDuplicateSteps(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			'Rename "' + issue.getData().get(1) + '"',
			'',
			null,
			new ISemanticModification() {
				override apply(EObject element, IModificationContext context) throws Exception{
					var Step step = element as Step;
					step.setDescription(step.getDescription() + issue.getLineNumber());
				}
			}
		)

		acceptor.accept(
			issue,
			'Remove "' + issue.getData().get(2) + '"',
			'',
			null,
			new ISemanticModification() {

				override apply(EObject element, IModificationContext context) throws Exception {
					var Step step = element as Step;
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					xtextDocument.replace(issue.getOffset() - step.getStepKeyword().length,
						issue.getData().get(2).length, "");
				}

			}
		)
	}

	@Fix(GherkinValidator::STEP_EXISTS_IN_BACKGROUND)
	def fixStepsAlreadyExistsInBackground(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			'Remove "' + issue.getData().get(0) + '"',
			'',
			null,
			new ISemanticModification() {

				override apply(EObject element, IModificationContext context) throws Exception {
					var Step step = element as Step;
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					xtextDocument.replace(issue.getOffset() - step.getStepKeyword().length, issue.getData().get(0).length, "");
				}

			}
		)
	}

	@Fix(GherkinValidator::REPEATED_EXAMPLES_TABLE_ROWS)
	def fixRepeatedExamplesTableRows(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(
			issue,
			'Remove table row(s)',
			'',
			null,
			new ISemanticModification() {

				override apply(EObject element, IModificationContext context) throws Exception {
					var String issue = issue.getData().get(0);
					var String[] rows = issue.split("\\s");
					rows.sort();
					var int counter = rows.length - 1;

					var ScenarioOutline scenarioOutline = element as ScenarioOutline;
					var Examples examples = scenarioOutline.getExamples();
					for (var int index = examples.getTable().getRows().size - 1; index >= 0; index--) {
						if (counter >= 0 && rows.get(counter).equals("")) {
							counter--;
						}

						if (counter >= 0 && index == Integer.valueOf(rows.get(counter))) {
							examples.getTable().getRows().remove(index);
							counter--;
						}
					}
				}

			}
		)
	}
	
	@Fix(GherkinValidator::SIMILAR_SCENARIO_TITLES)
	def fixSimilarScenarioTitles(Issue issue, IssueResolutionAcceptor acceptor){
		acceptor.accept(
			issue,
			'Remove "' + issue.getData().get(0) + '"',
			'',
			null,
			new IModification() {

				override apply(IModificationContext context) throws Exception {
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					xtextDocument.replace(issue.getOffset(), issue.getLength(), "");
				}

			}
		)
	}
	
	@Fix(GherkinValidator::SIMILAR_STEPS)
	def fixSimilarSteps(Issue issue, IssueResolutionAcceptor acceptor){
		acceptor.accept(
			issue,
			'Remove "' + issue.getData().get(0) + '"',
			'',
			null,
			new ISemanticModification() {

				override apply(EObject element, IModificationContext context) throws Exception {
					var Step step = element as Step;
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					xtextDocument.replace(issue.getOffset() - step.getStepKeyword().length,
						issue.getData().get(0).length, "");
				}

			}
		)
	}
	
	@Fix(GherkinValidator::SIMILAR_STEP_EXISTS_IN_BACKGROUND)
	def fixSimilarStepsExistInBackground(Issue issue, IssueResolutionAcceptor acceptor){
		acceptor.accept(
			issue,
			'Remove "' + issue.getData().get(0) + '"',
			'',
			null,
			new ISemanticModification() {

				override apply(EObject element, IModificationContext context) throws Exception {
					var Step step = element as Step;
					var xtextDocument = context.getXtextDocument() as IXtextDocument;
					xtextDocument.replace(issue.getOffset() - step.getStepKeyword().length,
						issue.getData().get(0).length, "");
				}

			}
		)
	}
}
