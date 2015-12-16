package uom.ac.uk.msc.cucumber.java;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import uom.ac.uk.msc.cucumber.gherkin.Background;
import uom.ac.uk.msc.cucumber.gherkin.Feature;
import uom.ac.uk.msc.cucumber.gherkin.GherkinPackage;
import uom.ac.uk.msc.cucumber.gherkin.Scenario;
import uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline;
import uom.ac.uk.msc.cucumber.gherkin.Step;

public class CucumberAdviser {
	public static ArrayList<CucumberWrapper> checkForConsecutiveGivenWhenThenSteps(
			Feature feature) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();

		if (feature.getBackground() != null) {
			List<Step> steps = feature.getBackground().getSteps();
			listOfWrappers
					.addAll(collectStepIfItIsFollowedByConsecutiveGivenWhenThenSteps(steps));
		}

		for (EObject scenario : feature.getScenarios()) {
			List<Step> steps = new ArrayList<Step>();

			if (scenario instanceof Scenario) {
				steps = ((Scenario) scenario).getSteps();
			} else if (scenario instanceof ScenarioOutline) {
				steps = ((ScenarioOutline) scenario).getSteps();
			}

			listOfWrappers
					.addAll(collectStepIfItIsFollowedByConsecutiveGivenWhenThenSteps(steps));
		}

		return listOfWrappers;
	}

	private static ArrayList<CucumberWrapper> collectStepIfItIsFollowedByConsecutiveGivenWhenThenSteps(
			List<Step> steps) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();

		for (int i = 0; i < steps.size(); i++) {

			if (steps.get(i).getStepKeyword().trim().equals("Given")
					|| steps.get(i).getStepKeyword().trim().equals("When")
					|| steps.get(i).getStepKeyword().trim().equals("Then")) {
				Step currentStep = steps.get(i);
				String currentStepKeyword = currentStep.getStepKeyword().trim();
				int next = i + 1;
				ArrayList<String> keywordOffsets = new ArrayList<String>();
				ArrayList<CucumberWrapper> temp = new ArrayList<CucumberWrapper>();

				while (next < steps.size()
						&& steps.get(next).getStepKeyword().trim()
								.equals(currentStepKeyword)) {
					Step nextStep = steps.get(next);
					CucumberWrapper wrapper = new CucumberWrapper(nextStep,
							GherkinPackage.Literals.STEP__STEP_KEYWORD,
							CucumberCodeConstants.CONSECUTIVE_STEPS.getCode(),
							CucumberMessageConstants.CONSECUTIVE_STEPS.getMsg());
					keywordOffsets.add((String.valueOf(NodeModelUtils.getNode(
							nextStep).getOffset()))
							+ " " + nextStep.getStepKeyword().trim().length());
					temp.add(wrapper);
					next++;
				}

				for (CucumberWrapper wrapper : temp) {
					wrapper.setData(keywordOffsets);
				}

				listOfWrappers.addAll(temp);

				if (next != i + 1)
					i = next - 1;

			}

		}

		return listOfWrappers;
	}

	public static ArrayList<CucumberWrapper> checkIfScenarioIsTooLongOrTooShort(
			Scenario scenario) {
		int numOfBackgroundSteps = 0;
		if (null != ((Feature) scenario.eContainer()).getBackground())
			numOfBackgroundSteps = ((Feature) scenario.eContainer())
					.getBackground().getSteps().size();

		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();
		int numOfSteps = scenario.getSteps().size();

		if (isScenarioTooShortOrLong(numOfSteps, numOfBackgroundSteps)) {
			CucumberWrapper wrapper = new CucumberWrapper(scenario,
					GherkinPackage.Literals.SCENARIO__TITLE,
					CucumberCodeConstants.TOO_LONG_SCENARIOS.getCode(),
					CucumberMessageConstants.TOO_LONG_SCENARIOS.getMsg());
			listOfWrappers.add(wrapper);
		}

		return listOfWrappers;
	}

	public static ArrayList<CucumberWrapper> checkIfScenarioOutlineIsTooLongOrTooShort(
			ScenarioOutline scenarioOutline) {
		int numOfBackgroundSteps = 0;
		if (null != ((Feature) scenarioOutline.eContainer()).getBackground())
			numOfBackgroundSteps = ((Feature) scenarioOutline.eContainer())
					.getBackground().getSteps().size();

		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();
		int numOfSteps = scenarioOutline.getSteps().size();

		if (isScenarioTooShortOrLong(numOfSteps, numOfBackgroundSteps)) {
			CucumberWrapper wrapper = new CucumberWrapper(scenarioOutline,
					GherkinPackage.Literals.SCENARIO_OUTLINE__TITLE,
					CucumberCodeConstants.TOO_LONG_SCENARIOS.getCode(),
					CucumberMessageConstants.TOO_LONG_SCENARIOS.getMsg());
			listOfWrappers.add(wrapper);
		}

		return listOfWrappers;
	}

	public static ArrayList<CucumberWrapper> checkIfBackgroundIsTooLong(
			Background background) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();
		int numOfSteps = background.getSteps().size();

		if (isBackgroundTooLong(numOfSteps)) {
			CucumberWrapper wrapper = new CucumberWrapper(background,
					GherkinPackage.Literals.BACKGROUND__BACKGROUND_KEYWORD,
					CucumberCodeConstants.TOO_LONG_SCENARIOS.getCode(),
					CucumberMessageConstants.TOO_LONG_BACKGROUND.getMsg());
			listOfWrappers.add(wrapper);
		}

		return listOfWrappers;
	}

	private static boolean isScenarioTooShortOrLong(int numOfSteps,
			int numOfBackgroundSteps) {
		if (numOfSteps < 3 && numOfBackgroundSteps + numOfSteps < 3)
			return true;
		if (numOfSteps > 5)
			return true;
		return false;
	}

	private static boolean isBackgroundTooLong(int numOfSteps) {
		if (numOfSteps > 4)
			return true;
		return false;
	}

	public static ArrayList<CucumberWrapper> checkIfThereAreMoreThanOneWhenStepInAScenario(
			Scenario scenario) {
		List<Step> listOfSteps = scenario.getSteps();
		return collectStepIfThereAreMoreThanOneWhenStepInAScenario(listOfSteps);
	}

	public static ArrayList<CucumberWrapper> checkIfThereAreMoreThanOneWhenStepInAScenarioOutline(
			ScenarioOutline scenarioOutline) {
		List<Step> listOfSteps = scenarioOutline.getSteps();
		return collectStepIfThereAreMoreThanOneWhenStepInAScenario(listOfSteps);
	}

	private static ArrayList<CucumberWrapper> collectStepIfThereAreMoreThanOneWhenStepInAScenario(
			List<Step> listOfSteps) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();
		int numOfSteps = listOfSteps.size();

		for (int i = 0; i < numOfSteps; i++) {
			Step step = listOfSteps.get(i);

			if (step.getStepKeyword().trim().equals("When")) {

				if (i + 1 < numOfSteps) {
					String nextStepKeyword = listOfSteps.get(i + 1)
							.getStepKeyword().trim();

					if (nextStepKeyword.equals("When")
							|| nextStepKeyword.equals("And")
							|| nextStepKeyword.equals("But")) {
						CucumberWrapper wrapper = new CucumberWrapper(step,
								GherkinPackage.Literals.STEP__STEP_KEYWORD,
								CucumberCodeConstants.TOO_MANY_WHEN_STEPS
										.getCode(),
								CucumberMessageConstants.TOO_MANY_WHEN_STEPS
										.getMsg());
						listOfWrappers.add(wrapper);

						while ((nextStepKeyword.equals("When")
								|| nextStepKeyword.equals("And") || nextStepKeyword
									.equals("But"))) {
							i += 1;

							if (i + 1 >= numOfSteps)
								break;

							nextStepKeyword = listOfSteps.get(i + 1)
									.getStepKeyword().trim();
						}

					}

				}

			}

		}

		return listOfWrappers;
	}

	public static ArrayList<CucumberWrapper> checkIfStepContainsTheWordAnd(
			Step step) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();

		String description = step.getDescription() + " ";

		if (description.toLowerCase().contains(" and ")) {
			List<String> listOfStringTokens = new ArrayList<String>();

			while (description.toLowerCase().indexOf(" and ") != -1) {
				String subString = description.substring(0,
						description.toLowerCase().indexOf(" and ")).trim();

				if (subString.length() > 0)
					listOfStringTokens.add(subString);
				description = " "
						+ description.substring(description.toLowerCase()
								.indexOf(" and ") + 5, description.length());
			}

			if (description.trim().length() > 0)
				listOfStringTokens.add(description.trim());

			if (listOfStringTokens.size() > 1) {
				CucumberWrapper wrapper = new CucumberWrapper(step,
						listOfStringTokens,
						GherkinPackage.Literals.STEP__DESCRIPTION,
						CucumberCodeConstants.SEPARATE_TO_AND_STEPS.getCode(),
						CucumberMessageConstants.SEPARATE_TO_AND_STEPS.getMsg());
				listOfWrappers.add(wrapper);
			}

		}

		return listOfWrappers;
	}

	public static ArrayList<CucumberWrapper> checkIfStepContainsTheWordBut(
			Step step) {
		ArrayList<CucumberWrapper> listOfWrappers = new ArrayList<CucumberWrapper>();

		String description = step.getDescription() + " ";

		if (description.toLowerCase().contains(" but ")) {
			List<String> listOfStringTokens = new ArrayList<String>();

			while (description.toLowerCase().indexOf(" but ") != -1) {
				String subString = description.substring(0,
						description.toLowerCase().indexOf(" but ")).trim();

				if (subString.length() > 0)
					listOfStringTokens.add(subString);
				description = " "
						+ description.substring(description.toLowerCase()
								.indexOf(" but ") + 5, description.length());
			}

			if (description.trim().length() > 0)
				listOfStringTokens.add(description.trim());

			if (listOfStringTokens.size() > 1) {
				CucumberWrapper wrapper = new CucumberWrapper(step,
						listOfStringTokens,
						GherkinPackage.Literals.STEP__DESCRIPTION,
						CucumberCodeConstants.SEPARATE_TO_BUT_STEPS.getCode(),
						CucumberMessageConstants.SEPARATE_TO_BUT_STEPS.getMsg());
				listOfWrappers.add(wrapper);
			}

		}

		return listOfWrappers;
	}
}
