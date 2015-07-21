# SEED
SEED is an Eclipse IDE plugin that aims to ease users in writing clean and consistent Cucumber tests. Its main duty is to flag for repeated Cucumber Features, Scenarios, and Steps as the user is writing these tests. Cucumber tests can grow to be at a significantly large scale in a project and could potentially make maintaining/writing of these tests to be difficult i.e. prone to human mistakes. Manually discovering these inconsistent tests and having to refactor them could create a significant impact on a software development project especially if it is done late in the project timeline. In addition, it tries to guide users towards following the best practices of writing Cucumber tests.

Features include:-
* Discovering duplicate Feature titles.
* Discovering duplicate Scenario descriptions.
* Discovering duplicate Steps.
* Provide QuickFix for 'Given' steps that have been repeated across all of the scenarios and migrate them into the 'Background'.
* Provide QuickFix for consecutive Given/When/Then steps and refactor them into 'And' or 'But' steps.
* Format Cucumber tests as soon as they are saved (or through CTRL-SHIFT-F).
* Cucumber grammar/syntax validation -- Before writing neat tests, they have to be valid beforehand!
* Outline view of Cucumber tests.

BONUS: Able to work side-by-side with the Cucumber JVM Eclipse Plugin.

DIRECT DOWNLOAD: http://waisuan.github.io/SEED

DOWNLOAD THROUGH ECLIPSE MARKETPLACE: <a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=2445802" class="drag" title="Drag to your running Eclipse workspace to install SEED"><img src="https://marketplace.eclipse.org/sites/all/themes/solstice/_themes/solstice_marketplace/public/images/btn-install.png" alt="Drag to your running Eclipse workspace to install SEED" /></a>

Keep track of SEED's <a href="https://github.com/waisuan/SEED/releases">releases</a>!

## Refer to <a href="https://github.com/waisuan/SEED/wiki">WIKI</a> for more information on features, installation instructions, and etc.

## Feel free to drop any sort of feedback or issues in <a href="https://github.com/waisuan/SEED/issues">here!</a>

** Source code will be pushed to repository as soon as plugin has been approved on the Eclipse Marketplace. **

