package uom.ac.uk.msc.cucumber.java;

public enum CucumberCodeConstants {
	FEATURES_HAVE_TO_BE_UNIQUE("duplicateFeature"), SIMILAR_FEATURE_TITLES(
			"similarFeatureTitles"), SCENARIOS_HAVE_TO_BE_UNIQUE(
			"duplicateScenario"), STEP_EXISTS_IN_BACKGROUND(
			"stepExistsInBackground"), CONSECUTIVE_STEPS("consecutiveSteps"), DUPLICATE_STEP(
			"duplicateStep"), STEP_REPEATED_IN_EVERY_SCENARIO(
			"potentialBackgroundStep"), TOO_LONG_SCENARIOS("tooLongScenario"), TOO_MANY_WHEN_STEPS(
			"tooManyWhenSteps"), SEPARATE_TO_AND_STEPS("splitToAndStep"), SIMILAR_SCENARIOS(
			"changeToScenarioOutline"), SIMILAR_SCENARIO_TITLES(
			"similarScenarioTitle"), REPEATED_EXAMPLES_TABLE_ROWS(
			"repeatedExamplesTableRows"), SIMILAR_STEPS("similarSteps"), SIMILAR_STEP_EXISTS_IN_BACKGROUND(
			"similarStepExistsInBackground"), SEPARATE_TO_BUT_STEPS(
			"splitToButStep");

	private final String code;

	CucumberCodeConstants(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
}
