package uom.ac.uk.msc.cucumber.java;

public enum CucumberMessageConstants {
	FEATURES_HAVE_TO_BE_UNIQUE("Duplicate feature titles found at: "), SIMILAR_FEATURE_TITLES(
			"Similar feature titles found at: "), SCENARIOS_HAVE_TO_BE_UNIQUE(
			"Duplicate scenario titles found at: "), STEP_EXISTS_IN_BACKGROUND(
			"This step already exists in the background. "), CONSECUTIVE_STEPS(
			"Suggestion: Use 'And' or 'But' keywords instead for when more than one 'Given', 'When', or 'Then' steps are needed."), DUPLICATE_STEPS(
			"Duplicate steps found at: "), STEP_REPEATED_IN_EVERY_SCENARIO(
			"This step has been repeated in every scenario. Do you want to move it into the Background?"), TOO_LONG_SCENARIOS(
			"Try to keep the number of steps in a scenario between 3 - 5 in order for it to be meaningful. "
					+ "Maybe separate them into multiple scenarios?"), TOO_LONG_BACKGROUND(
			"Try to keep the number of steps in a background less than 5 to avoid from being too complex. "
					+ "Maybe convert some into step definitions?"), TOO_MANY_WHEN_STEPS(
			"Are you sure that you need more than one 'When' step? "
					+ "Maybe separate them into multiple scenarios?"), SEPARATE_TO_AND_STEPS(
			"Each step should generally only do one thing. Do you want to split this into 'And' steps?"), SIMILAR_SCENARIOS(
			"Similar scenarios are found. Do you want to convert them into a single Scenario Outline?"), SIMILAR_SCENARIO_TITLES(
			"Similar scenario titles found at: "), SCENARIOS_SHARING_STEPS(
			"Scenarios seem to be having equal same/similar steps at: "), REPEATED_EXAMPLES_TABLE_ROWS(
			"Repeated Examples table rows found at: "), SIMILAR_STEPS(
			"Similar steps found at: "), SIMILAR_STEP_EXISTS_IN_BACKGROUND(
			"Similar step found in the background. "), SEPARATE_TO_BUT_STEPS(
			"Each step should generally only do one thing. Do you want to split this into 'But' steps?");

	private final String msg;

	CucumberMessageConstants(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}
}
