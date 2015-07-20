# SEED
SEED is an Eclipse IDE plugin that aims to ease users in writing Cucumber tests. Its main duty is to flag for repeated Cucumber Features, Scenarios, and Steps as the user is writing these tests. Cucumber tests can grow to be at a significantly large scale in a project and could potentially make maintaining/writing of these tests to be difficult i.e. prone to human mistakes. Manually discovering these inconsistent tests and having to refactor them could create a significant impact on a software development project especially if it is done late in the project timeline.

Features include:-
- Discovering duplicate Feature titles.
- Discovering duplicate Scenario descriptions.
- Discovering duplicate Steps.
- Provide QuickFix for 'Given' steps that have been repeated across all of the scenarios and migrate them into the 'Background'.
- Provide QuickFix for consecutive Given/When/Then steps and refactor them into 'And' or 'But' steps.
- Format Cucumber tests as soon as they are saved.

BONUS: Able to work side-by-side with the Cucumber JVM Eclipse Plugin.
