package uom.ac.uk.msc.cucumber.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import uom.ac.uk.msc.cucumber.gherkin.Background;
import uom.ac.uk.msc.cucumber.gherkin.DocString;
import uom.ac.uk.msc.cucumber.gherkin.Feature;
import uom.ac.uk.msc.cucumber.gherkin.GherkinPackage;
import uom.ac.uk.msc.cucumber.gherkin.Scenario;
import uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline;
import uom.ac.uk.msc.cucumber.gherkin.Step;
import uom.ac.uk.msc.cucumber.gherkin.Table;

public class CucumberBackgrounder {
	public static ArrayList<CucumberWrapper> checkForGivenStepsThatCanBeMovedIntoTheBackground(
			Feature feature) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();
		List<String> listOfOffsets = new ArrayList<String>();
		List<String> listOfAllDuplicateSteps = new ArrayList<String>();
		HashMap<EObject, List<Integer>> duplicateStepTracker = new HashMap<EObject, List<Integer>>();
		HashSet<String> backgroundSteps = new HashSet<String>();
		Background background = feature.getBackground();

		if (background != null) {

			for (Step step : background.getSteps()) {
				backgroundSteps.add(step.getStepKeyword().trim()
						+ CucumberDuplicateChecker.removeExtraSpacing(step
								.getDescription()));
			}

			// Subtract by 2 because of line by index (i.e. 0..N) and getting
			// the line right after the final step instead of the additional
			// space.
			listOfOffsets.add(String.valueOf(NodeModelUtils.getNode(background)
					.getEndLine() - 2));
			listOfOffsets.add("");
		} else {
			listOfOffsets.add("");

			if (feature.getScenarios().size() > 0) {
				listOfOffsets.add(String.valueOf(NodeModelUtils.getNode(
						feature.getScenarios().get(0)).getOffset()));
			} else
				listOfOffsets.add("");

		}

		listOfOffsets.add(String.valueOf(feature.getScenarios().size()));

		for (int scenarioIndex = 0; scenarioIndex < feature.getScenarios()
				.size(); scenarioIndex++) {
			int numOfSteps = 0;

			if (feature.getScenarios().get(scenarioIndex) instanceof Scenario) {
				numOfSteps = ((Scenario) feature.getScenarios().get(
						scenarioIndex)).getSteps().size();
			} else if (feature.getScenarios().get(scenarioIndex) instanceof ScenarioOutline) {
				numOfSteps = ((ScenarioOutline) feature.getScenarios().get(
						scenarioIndex)).getSteps().size();
			}

			for (int stepIndex = 0; stepIndex < numOfSteps; stepIndex++) {
				Step step = null;

				if (feature.getScenarios().get(scenarioIndex) instanceof Scenario) {
					step = ((Scenario) feature.getScenarios()
							.get(scenarioIndex)).getSteps().get(stepIndex);
				} else if (feature.getScenarios().get(scenarioIndex) instanceof ScenarioOutline) {
					step = ((ScenarioOutline) feature.getScenarios().get(
							scenarioIndex)).getSteps().get(stepIndex);
				}

				String stepKeyword = step.getStepKeyword().trim();
				int stepCounter = 0;

				if (!backgroundSteps.contains(stepKeyword
						+ CucumberDuplicateChecker.removeExtraSpacing(step
								.getDescription()))) {

					if (stepKeyword.equals("Given")) {

						for (int k = 0; k < feature.getScenarios().size(); k++) {

							if (feature.getScenarios().get(scenarioIndex) != feature
									.getScenarios().get(k)) {
								int anotherNumOfSteps = 0;

								if (feature.getScenarios().get(k) instanceof Scenario) {
									anotherNumOfSteps = ((Scenario) feature
											.getScenarios().get(k)).getSteps()
											.size();
								} else if (feature.getScenarios().get(k) instanceof ScenarioOutline) {
									anotherNumOfSteps = ((ScenarioOutline) feature
											.getScenarios().get(k)).getSteps()
											.size();
								}

								boolean duplicateFound = false;

								for (int l = 0; l < anotherNumOfSteps; l++) {
									Step anotherStep = null;

									if (feature.getScenarios().get(k) instanceof Scenario) {
										anotherStep = ((Scenario) feature
												.getScenarios().get(k))
												.getSteps().get(l);
									} else if (feature.getScenarios().get(k) instanceof ScenarioOutline) {
										anotherStep = ((ScenarioOutline) feature
												.getScenarios().get(k))
												.getSteps().get(l);
									}

									String anotherStepKeyword = anotherStep
											.getStepKeyword().trim();

									if (anotherStepKeyword.equals("Given")) {

										if (CucumberDuplicateChecker
												.removeExtraSpacing(
														step.getDescription())
												.equalsIgnoreCase(
														CucumberDuplicateChecker
																.removeExtraSpacing(anotherStep
																		.getDescription()))) {
											duplicateFound = areStepsIdentical(
													step, anotherStep);
										} else if (CucumberDuplicateChecker
												.isSimilar(
														CucumberDuplicateChecker
																.removeExtraSpacing(step
																		.getDescription()),
														CucumberDuplicateChecker
																.removeExtraSpacing(anotherStep
																		.getDescription()))) {
											duplicateFound = areStepsIdentical(
													step, anotherStep);
										}

									}

								}

								if (duplicateFound)
									stepCounter += 1;

							}

						}

					}

				}

				if (stepCounter > 0
						&& stepCounter == feature.getScenarios().size() - 1) {

					if (!duplicateStepTracker.containsKey(feature
							.getScenarios().get(scenarioIndex))) {
						ArrayList<Integer> tempList = new ArrayList<Integer>();
						tempList.add(stepIndex);
						duplicateStepTracker.put(
								feature.getScenarios().get(scenarioIndex),
								tempList);
					} else {
						duplicateStepTracker.get(
								feature.getScenarios().get(scenarioIndex)).add(
								stepIndex);
					}

					listOfAllDuplicateSteps.add(String.valueOf(NodeModelUtils
							.getNode(step).getStartLine())
							+ " "
							+ String.valueOf(NodeModelUtils.getNode(step)
									.getEndLine()
									- NodeModelUtils.getNode(step)
											.getStartLine())
							+ " "
							+ String.valueOf(NodeModelUtils.getNode(step)
									.getTotalLength()));
				}

			}
		}

		List<String> listOfAndButSteps = checkIfGivenStepIsFollowedByAndButSteps(duplicateStepTracker);
		listOfAllDuplicateSteps.addAll(listOfAndButSteps);

		Collections.sort(listOfAllDuplicateSteps, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				String[] arr1 = str1.split(" ");
				String[] arr2 = str2.split(" ");
				Integer intVal1 = Integer.valueOf(arr1[0]);
				Integer intVal2 = Integer.valueOf(arr2[0]);
				return intVal1.compareTo(intVal2);
			}
		});

		listOfOffsets.addAll(listOfAllDuplicateSteps);
		for (Entry<EObject, List<Integer>> currentEntry : duplicateStepTracker
				.entrySet()) {

			for (int index : currentEntry.getValue()) {
				Step step = null;

				if (currentEntry.getKey() instanceof Scenario) {
					step = ((Scenario) currentEntry.getKey()).getSteps().get(
							index);
				} else if (currentEntry.getKey() instanceof ScenarioOutline) {
					step = ((ScenarioOutline) currentEntry.getKey()).getSteps()
							.get(index);
				}

				CucumberWrapper wrapper = new CucumberWrapper(
						step,
						listOfOffsets,
						GherkinPackage.Literals.STEP__DESCRIPTION,
						CucumberCodeConstants.STEP_REPEATED_IN_EVERY_SCENARIO
								.getCode(),
						CucumberMessageConstants.STEP_REPEATED_IN_EVERY_SCENARIO
								.getMsg());
				listOfWrappers.add(wrapper);
			}

		}

		return listOfWrappers;
	}

	private static List<String> checkIfGivenStepIsFollowedByAndButSteps(
			HashMap<EObject, List<Integer>> duplicateStepTracker) {
		List<String> listOfAndButSteps = new ArrayList<String>();

		for (Entry<EObject, List<Integer>> currentEntry : duplicateStepTracker
				.entrySet()) {
			ArrayList<Integer> listOfStepIndices = (ArrayList<Integer>) currentEntry
					.getValue();
			boolean isScenario = false;
			int numOfSteps = 0;

			if (currentEntry.getKey() instanceof Scenario) {
				Scenario scenario = (Scenario) currentEntry.getKey();
				numOfSteps = scenario.getSteps().size();
				isScenario = true;
			} else if (currentEntry.getKey() instanceof ScenarioOutline) {
				ScenarioOutline scenario = (ScenarioOutline) currentEntry
						.getKey();
				numOfSteps = scenario.getSteps().size();
				isScenario = false;
			}

			for (int stepIndex : listOfStepIndices) {
				Step givenStep = null;
				int nextIndex = 0;

				if (isScenario) {
					Scenario scenario = (Scenario) currentEntry.getKey();
					givenStep = scenario.getSteps().get(stepIndex);
					nextIndex = numOfSteps;
				} else {
					ScenarioOutline scenario = (ScenarioOutline) currentEntry
							.getKey();
					givenStep = scenario.getSteps().get(stepIndex);
					nextIndex = numOfSteps;
				}

				if (listOfStepIndices.indexOf(stepIndex) + 1 < listOfStepIndices
						.size())
					nextIndex = listOfStepIndices.get(listOfStepIndices
							.indexOf(stepIndex) + 1);

				int counter = stepIndex + 1;

				while (counter < numOfSteps && counter < nextIndex) {
					int scenarioCounter = 0;
					Step step = null;

					if (isScenario) {
						Scenario scenario = (Scenario) currentEntry.getKey();
						step = scenario.getSteps().get(counter);
					} else {
						ScenarioOutline scenario = (ScenarioOutline) currentEntry
								.getKey();
						step = scenario.getSteps().get(counter);
					}

					if (step.getStepKeyword().trim().equals("And")
							|| step.getStepKeyword().trim().equals("But")) {

						for (Entry<EObject, List<Integer>> otherEntry : duplicateStepTracker
								.entrySet()) {
							boolean duplicateFound = false;

							if (otherEntry != currentEntry) {
								List<Step> otherSteps = null;

								if (otherEntry.getKey() instanceof Scenario) {
									Scenario otherScenario = (Scenario) otherEntry
											.getKey();
									otherSteps = otherScenario.getSteps();
								} else if (otherEntry.getKey() instanceof ScenarioOutline) {
									ScenarioOutline otherScenario = (ScenarioOutline) otherEntry
											.getKey();
									otherSteps = otherScenario.getSteps();
								}

								Step currGivenStep = null;

								for (Step otherStep : otherSteps) {

									if (otherStep.getStepKeyword().trim()
											.equals("Given")) {
										currGivenStep = otherStep;
									} else if (currGivenStep != null
											&& (CucumberDuplicateChecker
													.removeExtraSpacing(
															currGivenStep
																	.getDescription())
													.equalsIgnoreCase(
															CucumberDuplicateChecker
																	.removeExtraSpacing(givenStep
																			.getDescription())) || CucumberDuplicateChecker
													.isSimilar(
															CucumberDuplicateChecker
																	.removeExtraSpacing(currGivenStep
																			.getDescription()),
															CucumberDuplicateChecker
																	.removeExtraSpacing(givenStep
																			.getDescription())))
											&& otherStep
													.getStepKeyword()
													.trim()
													.equals(step
															.getStepKeyword()
															.trim())) {

										if (CucumberDuplicateChecker
												.removeExtraSpacing(
														otherStep
																.getDescription())
												.equalsIgnoreCase(
														CucumberDuplicateChecker
																.removeExtraSpacing(step
																		.getDescription()))) {
											duplicateFound = areStepsIdentical(
													step, otherStep);
										}

									}

								}

							}

							if (duplicateFound) {
								scenarioCounter += 1;
							}

						}

					} else if (step.getStepKeyword().trim().equals("Given")
							|| step.getStepKeyword().trim().equals("When")
							|| step.getStepKeyword().trim().equals("Then")) {
						break;
					}

					if (scenarioCounter > 0
							&& scenarioCounter == duplicateStepTracker.size() - 1) {
						listOfAndButSteps.add(String.valueOf(NodeModelUtils
								.getNode(step).getStartLine())
								+ " "
								+ String.valueOf(NodeModelUtils.getNode(step)
										.getEndLine()
										- NodeModelUtils.getNode(step)
												.getStartLine())
								+ " "
								+ String.valueOf(NodeModelUtils.getNode(step)
										.getTotalLength()));
					}

					counter += 1;
				}

			}

		}

		return listOfAndButSteps;
	}

	private static boolean areStepsIdentical(Step step, Step anotherStep) {
		boolean duplicateFound = false;
		if ((step.getCode() != null && anotherStep.getCode() != null)
				|| (step.getTables() != null && anotherStep.getTables() != null)) {

			boolean areDocStringIdentical = true;
			if ((step.getCode() != null && anotherStep.getCode() != null)) {
				DocString docString = step.getCode();
				DocString anotherDocString = anotherStep.getCode();

				if (!CucumberDuplicateChecker.removeExtraSpacing(
						docString.getContent()).equalsIgnoreCase(
						CucumberDuplicateChecker
								.removeExtraSpacing(anotherDocString
										.getContent()))) {
					return false;
				}

			} else if (step.getCode() != null || anotherStep.getCode() != null) {
				return false;
			}

			boolean areAllTablesIdentical = true;
			if (step.getTables() != null && anotherStep.getTables() != null) {
				EList<Table> stepTable = step.getTables();
				EList<Table> anotherStepTable = anotherStep.getTables();

				if (stepTable.size() == anotherStepTable.size()) {

					int numOfTableMatches = 0;
					for (int tableIndex = 0, anotherTableIndex = 0; tableIndex < stepTable
							.size()
							&& anotherTableIndex < anotherStepTable.size(); tableIndex++, anotherTableIndex++) {

						if (stepTable.get(tableIndex).getRows().size() == anotherStepTable
								.get(anotherTableIndex).getRows().size()) {

							boolean areTablesIdentical = true;
							for (int rowIndex = 0, anotherRowIndex = 0; rowIndex < stepTable
									.get(tableIndex).getRows().size()
									&& anotherRowIndex < anotherStepTable
											.get(anotherTableIndex).getRows()
											.size(); rowIndex++, anotherRowIndex++) {

								if (!CucumberDuplicateChecker
										.removeExtraSpacing(
												stepTable.get(tableIndex)
														.getRows()
														.get(rowIndex))
										.equalsIgnoreCase(
												CucumberDuplicateChecker
														.removeExtraSpacing(anotherStepTable
																.get(anotherTableIndex)
																.getRows()
																.get(anotherRowIndex)))) {
									areTablesIdentical = false;
									break;
								}

							}

							if (areTablesIdentical) {
								numOfTableMatches++;
							}

						} else {
							return false;
						}
					}

					if (numOfTableMatches == stepTable.size()) {
						areAllTablesIdentical = true;
					} else {
						return false;
					}

				} else
					return false;

			} else if (step.getTables() != null
					|| anotherStep.getTables() != null) {
				return false;
			}

			if (areAllTablesIdentical && areDocStringIdentical)
				duplicateFound = true;

		}

		if (step.getCode() == null && anotherStep.getCode() == null
				&& step.getTables() == null && anotherStep.getTables() == null)
			duplicateFound = true;

		return duplicateFound;
	}
}
