package uom.ac.uk.msc.cucumber.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import uom.ac.uk.msc.cucumber.gherkin.Background;
import uom.ac.uk.msc.cucumber.gherkin.Examples;
import uom.ac.uk.msc.cucumber.gherkin.Feature;
import uom.ac.uk.msc.cucumber.gherkin.GherkinPackage;
import uom.ac.uk.msc.cucumber.gherkin.Scenario;
import uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline;
import uom.ac.uk.msc.cucumber.gherkin.Step;
import uom.ac.uk.msc.cucumber.gherkin.Table;

public class CucumberDuplicateChecker {

	public static ArrayList<CucumberWrapper> checkIfScenarioIsUnique(
			Feature feature) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();

		for (int i = 0; i < feature.getScenarios().size(); i++) {
			boolean isScenario = true;
			String title = "";
			int numOfSteps = 0;

			if (feature.getScenarios().get(i) instanceof Scenario) {
				title = removeExtraSpacing(((Scenario) feature.getScenarios()
						.get(i)).getTitle());
				numOfSteps = ((Scenario) feature.getScenarios().get(i))
						.getSteps().size();
			} else if (feature.getScenarios().get(i) instanceof ScenarioOutline) {
				title = ((ScenarioOutline) feature.getScenarios().get(i))
						.getTitle().replaceAll("\\s+", " ").trim();
				numOfSteps = ((ScenarioOutline) feature.getScenarios().get(i))
						.getSteps().size();
				isScenario = false;
			}

			String lineNumber = String.valueOf(NodeModelUtils.getNode(
					feature.getScenarios().get(i)).getStartLine());

			String finalDuplicationMessage = "";
			String finalSimilarityMessage = "";
			boolean areThereDuplicates = false;
			boolean areThereSimilarities = false;
			boolean areTheySharingSteps = false;

			for (int j = 0; j < feature.getScenarios().size(); j++) {
				boolean isOtherScenario = true;
				String otherTitle = "";
				int numOfOtherSteps = 0;

				if (feature.getScenarios().get(j) instanceof Scenario) {
					otherTitle = ((Scenario) feature.getScenarios().get(j))
							.getTitle().replaceAll("\\s+", " ").trim();
					numOfOtherSteps = ((Scenario) feature.getScenarios().get(j))
							.getSteps().size();
				} else if (feature.getScenarios().get(j) instanceof ScenarioOutline) {
					otherTitle = ((ScenarioOutline) feature.getScenarios().get(
							j)).getTitle().replaceAll("\\s+", " ").trim();
					numOfOtherSteps = ((ScenarioOutline) feature.getScenarios()
							.get(j)).getSteps().size();
					isOtherScenario = false;
				}

				String otherLineNumber = String.valueOf(NodeModelUtils.getNode(
						feature.getScenarios().get(j)).getStartLine());

				if (feature.getScenarios().get(j) != feature.getScenarios()
						.get(i)) {

					if (title.equalsIgnoreCase(otherTitle)) {
						if (!areThereDuplicates) {
							finalDuplicationMessage += CucumberMessageConstants.SCENARIOS_HAVE_TO_BE_UNIQUE
									.getMsg() + "line " + lineNumber;
						}

						finalDuplicationMessage += ", line " + otherLineNumber;

						areThereDuplicates = true;
					} else if (!areThereDuplicates
							&& isSimilar(title, otherTitle)) {
						if (!areThereSimilarities) {
							finalSimilarityMessage += CucumberMessageConstants.SIMILAR_SCENARIO_TITLES
									.getMsg() + "line " + lineNumber;
						}

						finalSimilarityMessage += ", line " + otherLineNumber;

						areThereSimilarities = true;
					} else if (!areThereSimilarities
							&& (numOfSteps == numOfOtherSteps)
							&& (isScenario == isOtherScenario)
							&& checkIfScenariosAreSharingTheSameListOfSteps(
									isScenario, feature.getScenarios().get(i),
									feature.getScenarios().get(j))) {
						if (!areTheySharingSteps) {
							finalSimilarityMessage += CucumberMessageConstants.SCENARIOS_SHARING_STEPS
									.getMsg() + "line " + lineNumber;
						}

						finalSimilarityMessage += ", line " + otherLineNumber;

						areTheySharingSteps = true;
					}

				}

			}

			if (areThereDuplicates) {
				CucumberWrapper wrapper = new CucumberWrapper(feature
						.getScenarios().get(i), title, null,
						CucumberCodeConstants.SCENARIOS_HAVE_TO_BE_UNIQUE
								.getCode(), finalDuplicationMessage);

				if (isScenario)
					wrapper.setLiteral(GherkinPackage.Literals.SCENARIO__TITLE);
				else
					wrapper.setLiteral(GherkinPackage.Literals.SCENARIO_OUTLINE__TITLE);

				listOfWrappers.add(wrapper);
			} else if (areThereSimilarities || areTheySharingSteps) {
				CucumberWrapper wrapper = new CucumberWrapper(
						feature.getScenarios().get(i),
						title,
						null,
						CucumberCodeConstants.SIMILAR_SCENARIO_TITLES.getCode(),
						finalSimilarityMessage);

				if (isScenario)
					wrapper.setLiteral(GherkinPackage.Literals.SCENARIO__TITLE);
				else
					wrapper.setLiteral(GherkinPackage.Literals.SCENARIO_OUTLINE__TITLE);

				listOfWrappers.add(wrapper);
			}

		}

		return listOfWrappers;
	}

	// Didn't do similarity checking for docStrings and dataTables -- don't
	// wanna lose precision.
	private static boolean checkIfScenariosAreSharingTheSameListOfSteps(
			boolean isScenario, EObject scenario, EObject otherScenario) {
		EList<Step> steps = null;
		EList<Step> otherSteps = null;
		if (isScenario) {
			steps = ((Scenario) scenario).getSteps();
			otherSteps = ((Scenario) otherScenario).getSteps();
		} else {
			steps = ((ScenarioOutline) scenario).getSteps();
			otherSteps = ((ScenarioOutline) otherScenario).getSteps();
		}

		for (int i = 0, j = 0; i < steps.size() && j < otherSteps.size(); i++, j++) {
			Step step = steps.get(i);
			Step otherStep = otherSteps.get(j);

			String description = removeExtraSpacing(step.getDescription());
			String otherDescription = removeExtraSpacing(otherStep
					.getDescription());
			if (!step.getStepKeyword().equals(otherStep.getStepKeyword())) {
				return false;
			} else if (!description.equalsIgnoreCase(otherDescription)
					&& !isSimilar(description, otherDescription)) {
				return false;
			} else {
				if (step.getCode() != null && otherStep.getCode() != null) {
					if (!removeExtraSpacing(step.getCode().getContent())
							.equalsIgnoreCase(
									removeExtraSpacing(otherStep.getCode()
											.getContent()))) {
						return false;
					}
				} else if ((step.getCode() == null) != (otherStep.getCode() == null)) {
					return false;
				}

				if (step.getTables() != null && otherStep.getTables() != null) {
					if (step.getTables().size() != otherStep.getTables().size()) {
						return false;
					} else {
						String tableString = "";
						for (Table table : step.getTables()) {
							tableString += table.getRows().toString();
						}

						String otherTableString = "";
						for (Table table : otherStep.getTables()) {
							otherTableString += table.getRows().toString();
						}

						if (!removeExtraSpacing(tableString).equalsIgnoreCase(
								removeExtraSpacing(otherTableString))) {
							return false;
						}
					}
				} else if ((step.getTables() != null) != (otherStep.getTables() != null)) {
					return false;
				}

			}

		}

		if (!isScenario) {
			Examples examples = ((ScenarioOutline) scenario).getExamples();
			Examples otherExamples = ((ScenarioOutline) otherScenario)
					.getExamples();
			String tableString = examples.getTable().getRows().toString();
			String otherTableString = otherExamples.getTable().getRows()
					.toString();
			if (!removeExtraSpacing(tableString).equalsIgnoreCase(
					removeExtraSpacing(otherTableString))) {
				return false;
			}
		}

		return true;
	}

	public static ArrayList<CucumberWrapper> checkIfStepsInScenarioAreUnique(
			Scenario scenario) {
		return collectStepIfStepsAreNotUnique(scenario.getSteps());
	}

	public static ArrayList<CucumberWrapper> checkIfStepsInScenarioOutlineAreUnique(
			ScenarioOutline scenarioOutline) {
		return collectStepIfStepsAreNotUnique(scenarioOutline.getSteps());
	}

	public static ArrayList<CucumberWrapper> checkIfStepsInBackgroundAreUnique(
			Background background) {
		return collectStepIfStepsAreNotUnique(background.getSteps());
	}

	private static ArrayList<CucumberWrapper> collectStepIfStepsAreNotUnique(
			List<Step> listOfSteps) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();

		for (Step step : listOfSteps) {
			String stepString = removeExtraSpacing(step.getDescription());

			String lineNumber = String.valueOf(NodeModelUtils.getNode(step)
					.getStartLine());

			String finalDuplicationMessage = "";
			String finalSimilarityMessage = "";
			boolean areThereDuplicates = false;
			boolean areThereSimilarities = false;

			for (Step otherStep : listOfSteps) {
				String otherStepString = removeExtraSpacing(otherStep
						.getDescription());

				String otherLineNumber = String.valueOf(NodeModelUtils.getNode(
						otherStep).getStartLine());

				if (step != otherStep) {
					if (stepString.equalsIgnoreCase(otherStepString)) {

						if (checkIfStepHasDocStringOrTable(step, otherStep)) {
							continue;
						}

						if (!areThereDuplicates) {
							finalDuplicationMessage += CucumberMessageConstants.DUPLICATE_STEPS
									.getMsg() + "line " + lineNumber;
						}

						finalDuplicationMessage += ", line " + otherLineNumber;

						areThereDuplicates = true;

					} else if (isSimilar(stepString, otherStepString)) {

						if (checkIfStepHasDocStringOrTable(step, otherStep)) {
							continue;
						}

						if (!areThereSimilarities) {
							finalSimilarityMessage += CucumberMessageConstants.SIMILAR_STEPS
									.getMsg() + "line " + lineNumber;
						}

						finalSimilarityMessage += ", line " + otherLineNumber;

						areThereSimilarities = true;

					}
				}

			}

			if (areThereDuplicates) {
				CucumberWrapper wrapper = new CucumberWrapper(step,
						GherkinPackage.Literals.STEP__DESCRIPTION,
						CucumberCodeConstants.DUPLICATE_STEP.getCode(),
						finalDuplicationMessage);
				wrapper.setData(step.getStepKeyword());
				wrapper.setData(step.getDescription());
				wrapper.setData(step.getStepKeyword() + step.getDescription());
				listOfWrappers.add(wrapper);
			} else if (areThereSimilarities) {
				CucumberWrapper wrapper = new CucumberWrapper(step,
						step.getStepKeyword() + step.getDescription(),
						GherkinPackage.Literals.STEP__DESCRIPTION,
						CucumberCodeConstants.SIMILAR_STEPS.getCode(),
						finalSimilarityMessage);
				listOfWrappers.add(wrapper);
			}

		}

		return listOfWrappers;
	}

	public static ArrayList<CucumberWrapper> checkIfStepsAreAlreadyInBackground(
			Feature feature) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();
		Background background = feature.getBackground();

		if (background.getSteps().size() > 0) {

			for (Step backgroundStep : background.getSteps()) {
				String backgroundStepString = backgroundStep.getStepKeyword()
						.trim()
						+ removeExtraSpacing(backgroundStep.getDescription());

				String lineNumber = String.valueOf(NodeModelUtils.getNode(
						backgroundStep).getStartLine());

				for (EObject scenario : feature.getScenarios()) {
					int numOfSteps = 0;

					if (scenario instanceof Scenario)
						numOfSteps = ((Scenario) scenario).getSteps().size();
					else
						numOfSteps = ((ScenarioOutline) scenario).getSteps()
								.size();

					for (int i = 0; i < numOfSteps; i++) {
						Step step = null;

						if (scenario instanceof Scenario)
							step = ((Scenario) scenario).getSteps().get(i);
						else
							step = ((ScenarioOutline) scenario).getSteps().get(
									i);

						String stepString = step.getStepKeyword().trim()
								+ removeExtraSpacing(step.getDescription());

						if (backgroundStepString.equalsIgnoreCase(stepString)) {

							if (checkIfStepHasDocStringOrTable(step,
									backgroundStep)) {
								continue;
							}

							CucumberWrapper wrapper = new CucumberWrapper(
									step,
									step.getStepKeyword()
											+ step.getDescription(),
									GherkinPackage.Literals.STEP__DESCRIPTION,
									CucumberCodeConstants.STEP_EXISTS_IN_BACKGROUND
											.getCode(),
									CucumberMessageConstants.STEP_EXISTS_IN_BACKGROUND
											.getMsg()
											+ "(line no.: "
											+ lineNumber + ")");
							listOfWrappers.add(wrapper);
						} else if (isSimilar(backgroundStepString, stepString)) {

							if (checkIfStepHasDocStringOrTable(step,
									backgroundStep)) {
								continue;
							}

							CucumberWrapper wrapper = new CucumberWrapper(
									step,
									step.getStepKeyword()
											+ step.getDescription(),
									GherkinPackage.Literals.STEP__DESCRIPTION,
									CucumberCodeConstants.SIMILAR_STEP_EXISTS_IN_BACKGROUND
											.getCode(),
									CucumberMessageConstants.SIMILAR_STEP_EXISTS_IN_BACKGROUND
											.getMsg()
											+ "(line no.: "
											+ lineNumber + ")");
							listOfWrappers.add(wrapper);
						}

					}

				}

			}

		}

		return listOfWrappers;
	}

	private static boolean checkIfStepHasDocStringOrTable(Step step,
			Step otherStep) {
		if (step.getCode() != null && otherStep.getCode() != null) {
			if (!removeExtraSpacing(step.getCode().getContent())
					.equalsIgnoreCase(
							removeExtraSpacing(otherStep.getCode().getContent()))) {
				return true;
			}
		} else if ((step.getCode() == null) != (otherStep.getCode() == null)) {
			return true;
		}

		if (step.getTables() != null && otherStep.getTables() != null) {
			if (step.getTables().size() != otherStep.getTables().size()) {
				return true;
			} else {
				String tableString = "";
				for (Table table : step.getTables()) {
					tableString += table.getRows().toString();
				}

				String otherTableString = "";
				for (Table table : otherStep.getTables()) {
					otherTableString += table.getRows().toString();
				}

				if (!removeExtraSpacing(tableString).equalsIgnoreCase(
						removeExtraSpacing(otherTableString))) {
					return true;
				}
			}
		} else if ((step.getTables() != null) != (otherStep.getTables() != null)) {
			return true;
		}

		return false;
	}

	public static ArrayList<CucumberWrapper> checkIfScenariosCanBeAlteredToScenarioOutline(
			Feature feature) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();

		List<Scenario> allScenarios = getAllScenariosFromFeature(feature);

		boolean[] possibleScenarioOutlineTracker = new boolean[allScenarios
				.size()];
		HashMap<Scenario, List<Scenario>> possibleScenarioOutlineCandidates = new HashMap<Scenario, List<Scenario>>();
		HashMap<Scenario, LinkedHashSet<String>> differenceBetweenScenarioTitles = new HashMap<Scenario, LinkedHashSet<String>>();

		filterOutScenariosForPossibleScenarioOutlineCandidates(allScenarios,
				possibleScenarioOutlineTracker,
				possibleScenarioOutlineCandidates,
				differenceBetweenScenarioTitles);

		for (Map.Entry<Scenario, List<Scenario>> entry : possibleScenarioOutlineCandidates
				.entrySet()) {

			if (!entry.getValue().isEmpty()) {
				Scenario scenario = entry.getKey();
				possibleScenarioOutlineTracker = new boolean[entry.getValue()
						.size()];
				Arrays.fill(possibleScenarioOutlineTracker, true);
				List<List<String>> differenceBetweenStepTokens = new ArrayList<List<String>>();
				int currentStepIndex = 0;

				for (Step step : scenario.getSteps()) {
					String[] tokens = step.getDescription()
							.replaceAll("\\s+", " ").split(" ");

					int currScenarioIndex = 0;
					for (Scenario otherScenario : entry.getValue()) {

						if (possibleScenarioOutlineTracker[currScenarioIndex]) {
							Step otherStep = otherScenario.getSteps().get(
									currentStepIndex);

							generateScenarioOutlineSteps(step, otherStep,
									tokens, possibleScenarioOutlineTracker,
									currScenarioIndex, currentStepIndex,
									differenceBetweenStepTokens);

						}

						currScenarioIndex++;
					}

					currentStepIndex++;
				}

				listOfWrappers.addAll(createScenarioOutlineTemplate(
						possibleScenarioOutlineTracker, entry.getValue(),
						scenario, feature, differenceBetweenStepTokens,
						differenceBetweenScenarioTitles));
			}

		}

		return listOfWrappers;
	}

	private static List<Scenario> getAllScenariosFromFeature(Feature feature) {
		List<Scenario> allScenarios = new ArrayList<Scenario>();

		for (EObject obj : feature.getScenarios()) {

			if (obj instanceof Scenario)
				allScenarios.add((Scenario) obj);

		}

		return allScenarios;
	}

	private static boolean assertScenarioIsUnique(Scenario scenario,
			List<Scenario> allScenarios) {

		int counter = 0;
		for (Scenario scenarioToCompareWith : allScenarios) {
			if (scenarioToCompareWith
					.getTitle()
					.replaceAll("\\s+", " ")
					.trim()
					.equalsIgnoreCase(
							scenario.getTitle().replaceAll("\\s+", " ").trim()))
				counter++;
			if (counter > 1)
				return false;
		}

		return true;
	}

	private static void filterOutScenariosForPossibleScenarioOutlineCandidates(
			List<Scenario> allScenarios,
			boolean[] possibleScenarioOutlineTracker,
			HashMap<Scenario, List<Scenario>> possibleScenarioOutlineCandidates,
			HashMap<Scenario, LinkedHashSet<String>> differenceBetweenScenarioTitles) {

		for (int i = 0; i < allScenarios.size(); i++) {
			Scenario scenario = allScenarios.get(i);

			if (!assertScenarioIsUnique(scenario, allScenarios))
				continue;

			possibleScenarioOutlineCandidates.put(scenario,
					new ArrayList<Scenario>());
			differenceBetweenScenarioTitles.put(scenario,
					new LinkedHashSet<String>());
			String[] tokens = scenario.getTitle().replaceAll("\\s+", " ")
					.split(" ");

			for (int j = i + 1; j < allScenarios.size(); j++) {

				if (!possibleScenarioOutlineTracker[j]) {
					Scenario otherScenario = allScenarios.get(j);

					if (!assertScenarioIsUnique(otherScenario, allScenarios))
						continue;

					if (scenario.getSteps().size() == otherScenario.getSteps()
							.size()) {
						String[] otherTokens = otherScenario.getTitle()
								.replaceAll("\\s+", " ").split(" ");

						if (tokens.length == otherTokens.length) {

							List<String> tokensAsList = Arrays.asList(tokens);
							List<String> otherTokensAsList = Arrays
									.asList(otherTokens);
							List<String> union = getDifferencesBetweenTwoString(
									tokensAsList, otherTokensAsList);

							if (union.size() == 2
									&& tokensAsList.indexOf(union.get(0)) == otherTokensAsList
											.indexOf(union.get(1))) {
								possibleScenarioOutlineCandidates.get(scenario)
										.add(otherScenario);
								differenceBetweenScenarioTitles.get(scenario)
										.addAll(union);
								possibleScenarioOutlineTracker[j] = true;
							}

						}

					}

				}

			}

		}
	}

	private static void generateScenarioOutlineSteps(Step step, Step otherStep,
			String[] tokens, boolean[] possibleScenarioOutlineTracker,
			int currScenarioIndex, int currentStepIndex,
			List<List<String>> differenceBetweenStepTokens) {

		if (doStepsMatch(step, otherStep)) {
			String[] otherTokens = otherStep.getDescription()
					.replaceAll("\\s+", " ").split(" ");

			if (tokens.length == otherTokens.length) {

				List<String> tokenAsList = Arrays.asList(tokens);
				List<String> otherTokenAsList = Arrays.asList(otherTokens);
				List<String> union = getDifferencesBetweenTwoString(
						tokenAsList, otherTokenAsList);

				if (areStepsValid(step, union)
						|| areTheDiffBetweenStepsAtTheSamePosition(tokenAsList,
								otherTokenAsList, union)) {
					possibleScenarioOutlineTracker[currScenarioIndex] = false;

					removeAllOccurrencesOfScenario(currentStepIndex,
							currScenarioIndex, differenceBetweenStepTokens);

				} else {
					if (currentStepIndex >= differenceBetweenStepTokens.size()) {
						differenceBetweenStepTokens
								.add(new ArrayList<String>());
					}

					if (differenceBetweenStepTokens.get(currentStepIndex)
							.isEmpty())
						differenceBetweenStepTokens.get(currentStepIndex)
								.addAll(union);
					else {

						if (!union.isEmpty()) {
							differenceBetweenStepTokens.get(currentStepIndex)
									.add(union.get(1));
						} else if (union.isEmpty()
								&& !differenceBetweenStepTokens.get(
										currentStepIndex).isEmpty()) {

							// We know that we have found duplicates but we
							// still wanna include it since we have at least 1
							// distinct data for the examples table.
							differenceBetweenStepTokens.get(currentStepIndex)
									.add(differenceBetweenStepTokens.get(
											currentStepIndex).get(0));
						}

					}
				}

			} else {
				possibleScenarioOutlineTracker[currScenarioIndex] = false;

				removeAllOccurrencesOfScenario(currentStepIndex,
						currScenarioIndex, differenceBetweenStepTokens);
			}

		} else {
			possibleScenarioOutlineTracker[currScenarioIndex] = false;

			removeAllOccurrencesOfScenario(currentStepIndex, currScenarioIndex,
					differenceBetweenStepTokens);
		}
	}

	private static boolean doStepsMatch(Step step, Step otherStep) {
		return step.getStepKeyword().equals(otherStep.getStepKeyword())
				&& step.getCode() == null && otherStep.getCode() == null
				&& step.getTables().isEmpty()
				&& otherStep.getTables().isEmpty();
	}

	private static boolean areStepsValid(Step step, List<String> union) {
		return union.size() != 2 && union.size() != 0;
	}

	private static boolean areTheDiffBetweenStepsAtTheSamePosition(
			List<String> tokenAsList, List<String> otherTokenAsList,
			List<String> union) {
		return (union.size() == 2 && tokenAsList.indexOf(union.get(0)) != otherTokenAsList
				.indexOf(union.get(1)));
	}

	private static void removeAllOccurrencesOfScenario(int currentStepIndex,
			int currScenarioIndex,
			List<List<String>> differenceBetweenStepTokens) {
		for (int i = 0; i < currentStepIndex; i++) {
			if (currScenarioIndex + 1 < differenceBetweenStepTokens.get(i)
					.size())
				differenceBetweenStepTokens.get(i)
						.remove(currScenarioIndex + 1);
		}
	}

	private static List<CucumberWrapper> createScenarioOutlineTemplate(
			boolean[] possibleScenarioOutlineTracker,
			List<Scenario> otherScenarios,
			Scenario scenario,
			Feature feature,
			List<List<String>> differenceBetweenStepTokens,
			HashMap<Scenario, LinkedHashSet<String>> differenceBetweenScenarioTitles) {

		List<String> toBeDeletedScenarioIndices = new ArrayList<String>();
		List<CucumberWrapper> toBeDeletedScenarios = new ArrayList<CucumberWrapper>();

		int numOfColumns = getNumberOfTableColumns(differenceBetweenStepTokens);

		if (numOfColumns <= 1)
			return toBeDeletedScenarios;

		for (int i = 0; i < possibleScenarioOutlineTracker.length; i++) {

			if (possibleScenarioOutlineTracker[i]) {
				CucumberWrapper wrapper = new CucumberWrapper(
						otherScenarios.get(i),
						GherkinPackage.Literals.SCENARIO__TITLE,
						CucumberCodeConstants.SIMILAR_SCENARIOS.getCode(),
						CucumberMessageConstants.SIMILAR_SCENARIOS.getMsg());
				toBeDeletedScenarios.add(wrapper);
				toBeDeletedScenarioIndices.add(String.valueOf(feature
						.getScenarios().indexOf(otherScenarios.get(i))));
			}

		}

		if (!toBeDeletedScenarios.isEmpty()) {
			CucumberWrapper wrapper = new CucumberWrapper(scenario,
					GherkinPackage.Literals.SCENARIO__TITLE,
					CucumberCodeConstants.SIMILAR_SCENARIOS.getCode(),
					CucumberMessageConstants.SIMILAR_SCENARIOS.getMsg());
			toBeDeletedScenarios.add(0, wrapper);
			toBeDeletedScenarioIndices.add(0,
					String.valueOf(toBeDeletedScenarios.size()));
			toBeDeletedScenarioIndices.add(1,
					String.valueOf(feature.getScenarios().indexOf(scenario)));
			List<String> scenarioOutlineTemplate = new ArrayList<String>();
			LinkedHashSet<String> differenceBetweenScenarioTitleTokens = differenceBetweenScenarioTitles
					.get(scenario);

			// title | numOfSteps | stepKeyword | stepDescription | tableHeader
			// | tableCells
			scenarioOutlineTemplate.add(createScenarioOutlineTitle(scenario,
					differenceBetweenScenarioTitleTokens));

			removeInvalidScenarioOutlineSteps(differenceBetweenStepTokens,
					toBeDeletedScenarios);

			scenarioOutlineTemplate.add(String
					.valueOf(differenceBetweenStepTokens.size()));

			createScenarioOutlineSteps(scenario, differenceBetweenStepTokens,
					scenarioOutlineTemplate);

			createScenarioOutlineExamplesTable(numOfColumns,
					differenceBetweenStepTokens, scenarioOutlineTemplate,
					toBeDeletedScenarios.size());

			toBeDeletedScenarioIndices.addAll(scenarioOutlineTemplate);
		}

		for (CucumberWrapper wrapper : toBeDeletedScenarios) {
			wrapper.setData(toBeDeletedScenarioIndices);
		}

		return toBeDeletedScenarios;
	}

	private static int getNumberOfTableColumns(
			List<List<String>> differenceBetweenStepTokens) {
		int numOfColumns = 0;

		for (List<String> stepToken : differenceBetweenStepTokens) {

			if (!stepToken.isEmpty())
				numOfColumns++;

		}

		return numOfColumns;
	}

	private static String createScenarioOutlineTitle(Scenario scenario,
			LinkedHashSet<String> differenceBetweenScenarioTitleTokens) {
		StringBuilder scenarioOutlineTitle = new StringBuilder();

		for (String token : differenceBetweenScenarioTitleTokens) {
			String[] words = scenario.getTitle().replaceAll("\\s+", " ")
					.split(" ");

			for (String word : words) {

				if (!word.equalsIgnoreCase(token))
					scenarioOutlineTitle.append(word + " ");

			}

			break;
		}

		return scenarioOutlineTitle.toString();
	}

	private static void removeInvalidScenarioOutlineSteps(
			List<List<String>> differenceBetweenStepTokens,
			List<CucumberWrapper> toBeDeletedScenarios) {
		for (int j = 0; j < differenceBetweenStepTokens.size(); j++) {

			if (!differenceBetweenStepTokens.get(j).isEmpty()
					&& differenceBetweenStepTokens.get(j).size() != toBeDeletedScenarios
							.size()) {

				// We found an uneven number of cell values. That means that
				// there are some duplicates that we ignored. It's time to put
				// them back in since we do have at least 1 distinct value in
				// the examples table.
				while (differenceBetweenStepTokens.get(j).size() != toBeDeletedScenarios
						.size()) {
					differenceBetweenStepTokens.get(j).add(1,
							differenceBetweenStepTokens.get(j).get(0));
				}

			}

		}
	}

	private static void createScenarioOutlineSteps(Scenario scenario,
			List<List<String>> differenceBetweenStepTokens,
			List<String> scenarioOutlineTemplate) {
		int stepCounter = 0;

		for (List<String> stepToken : differenceBetweenStepTokens) {
			StringBuilder step = new StringBuilder();
			Step currStep = scenario.getSteps().get(stepCounter);

			for (String token : stepToken) {
				String[] words = currStep.getDescription()
						.replaceAll("\\s+", " ").split(" ");

				for (String word : words) {

					if (!word.equalsIgnoreCase(token))
						step.append(word + " ");
					else
						step.append("<?> ");

				}

				break;
			}

			if (stepToken.isEmpty()) {
				step.append(currStep.getDescription());
			}

			stepCounter++;
			scenarioOutlineTemplate.add(currStep.getStepKeyword());
			scenarioOutlineTemplate.add(step.toString());
		}
	}

	private static void createScenarioOutlineExamplesTable(int numOfColumns,
			List<List<String>> differenceBetweenStepTokens,
			List<String> scenarioOutlineTemplate, int numOfRows) {
		StringBuilder row = new StringBuilder();
		row.append("| ");

		for (int i = 0; i < numOfColumns; i++) {
			row.append("? | ");
		}

		scenarioOutlineTemplate.add(row.toString());

		for (int i = 0; i < numOfRows; i++) {

			row.setLength(0);
			row.append("|");

			for (int j = 0; j < differenceBetweenStepTokens.size(); j++) {

				if (!differenceBetweenStepTokens.get(j).isEmpty()) {
					row.append(differenceBetweenStepTokens.get(j).get(i) + "|");
				}

			}

			scenarioOutlineTemplate.add(row.toString());
		}
	}

	private static List<String> getDifferencesBetweenTwoString(
			List<String> tokens, List<String> otherTokens) {
		Set<String> union = new LinkedHashSet<String>(tokens);
		union.addAll(otherTokens);

		Set<String> intersection = new LinkedHashSet<String>(tokens);
		intersection.retainAll(otherTokens);

		union.removeAll(intersection);

		List<String> unionList = new ArrayList<String>(union);

		return unionList;
	}

	public static CucumberWrapper checkIfRowsInExamplesTableAreUnique(
			ScenarioOutline scenarioOutline) {

		Table table = scenarioOutline.getExamples().getTable();
		HashMap<String, Integer> tracker = new HashMap<String, Integer>();
		int counter = 0;
		StringBuilder finalDuplicationMessage = new StringBuilder();
		StringBuilder repeatedRowsInString = new StringBuilder();

		for (String row : table.getRows()) {

			if (tracker.containsKey(row)) {

				if (finalDuplicationMessage.length() == 0) {
					finalDuplicationMessage
							.append(CucumberMessageConstants.REPEATED_EXAMPLES_TABLE_ROWS
									.getMsg() + "row " + (tracker.get(row)));
					// repeatedRowsInString.append(tracker.get(row) - 1);
					tracker.put(row, -1);
				} else if (tracker.get(row) != -1) {
					finalDuplicationMessage.append(", row " + tracker.get(row));
					// repeatedRowsInString.append(" " + (tracker.get(row) -
					// 1));
					tracker.put(row, -1);
				}

				finalDuplicationMessage.append(", row " + (counter + 1));
				repeatedRowsInString.append((counter) + " ");

			} else {
				tracker.put(row, counter + 1);
			}

			counter++;
		}

		if (tracker.size() != table.getRows().size()) {
			CucumberWrapper wrapper = new CucumberWrapper(scenarioOutline,
					repeatedRowsInString.toString(),
					GherkinPackage.Literals.SCENARIO_OUTLINE__TITLE,
					CucumberCodeConstants.REPEATED_EXAMPLES_TABLE_ROWS
							.getCode(), finalDuplicationMessage.toString());

			return wrapper;
		}

		return null;
	}

	public static boolean isSimilar(String s1, String s2) {
		return DiceCoefficient.compareStrings(s1, s2) * 100 >= 73.0;
	}

	public static String removeExtraSpacing(String text) {
		return text.replaceAll("\\s+", " ").trim();
	}
}
