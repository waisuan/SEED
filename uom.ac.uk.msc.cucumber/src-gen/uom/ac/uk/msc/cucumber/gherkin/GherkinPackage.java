/**
 */
package uom.ac.uk.msc.cucumber.gherkin;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uom.ac.uk.msc.cucumber.gherkin.GherkinFactory
 * @model kind="package"
 * @generated
 */
public interface GherkinPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gherkin";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uom/uk/msc/cucumber/Gherkin";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gherkin";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GherkinPackage eINSTANCE = uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl.init();

  /**
   * The meta object id for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.FeatureImpl
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 0;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TAGS = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TITLE = 1;

  /**
   * The feature id for the '<em><b>Narrative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NARRATIVE = 2;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__BACKGROUND = 3;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__SCENARIOS = 4;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.BackgroundImpl <em>Background</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.BackgroundImpl
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getBackground()
   * @generated
   */
  int BACKGROUND = 1;

  /**
   * The feature id for the '<em><b>Background Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__BACKGROUND_KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__TITLE = 1;

  /**
   * The feature id for the '<em><b>Narrative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__NARRATIVE = 2;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__STEPS = 3;

  /**
   * The number of structural features of the '<em>Background</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioImpl
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 2;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__TAGS = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__TITLE = 1;

  /**
   * The feature id for the '<em><b>Narrative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NARRATIVE = 2;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__STEPS = 3;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioOutlineImpl <em>Scenario Outline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioOutlineImpl
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getScenarioOutline()
   * @generated
   */
  int SCENARIO_OUTLINE = 3;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE__TAGS = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE__TITLE = 1;

  /**
   * The feature id for the '<em><b>Narrative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE__NARRATIVE = 2;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE__STEPS = 3;

  /**
   * The feature id for the '<em><b>Examples</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE__EXAMPLES = 4;

  /**
   * The number of structural features of the '<em>Scenario Outline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.StepImpl
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getStep()
   * @generated
   */
  int STEP = 4;

  /**
   * The feature id for the '<em><b>Step Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__STEP_KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TABLES = 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__CODE = 3;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.ExamplesImpl <em>Examples</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.ExamplesImpl
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getExamples()
   * @generated
   */
  int EXAMPLES = 5;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLES__TITLE = 0;

  /**
   * The feature id for the '<em><b>Narrative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLES__NARRATIVE = 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLES__TABLE = 2;

  /**
   * The number of structural features of the '<em>Examples</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.TableImpl
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getTable()
   * @generated
   */
  int TABLE = 6;

  /**
   * The feature id for the '<em><b>Rows</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__ROWS = 0;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.DocStringImpl <em>Doc String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.DocStringImpl
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getDocString()
   * @generated
   */
  int DOC_STRING = 7;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_STRING__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Doc String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_STRING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.TagImpl
   * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getTag()
   * @generated
   */
  int TAG = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__ID = 0;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link uom.ac.uk.msc.cucumber.gherkin.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the containment reference list '{@link uom.ac.uk.msc.cucumber.gherkin.Feature#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tags</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Feature#getTags()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Tags();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Feature#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Feature#getTitle()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Title();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Feature#getNarrative <em>Narrative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Narrative</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Feature#getNarrative()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Narrative();

  /**
   * Returns the meta object for the containment reference '{@link uom.ac.uk.msc.cucumber.gherkin.Feature#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Feature#getBackground()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Background();

  /**
   * Returns the meta object for the containment reference list '{@link uom.ac.uk.msc.cucumber.gherkin.Feature#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Feature#getScenarios()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Scenarios();

  /**
   * Returns the meta object for class '{@link uom.ac.uk.msc.cucumber.gherkin.Background <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Background</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Background
   * @generated
   */
  EClass getBackground();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Background#getBackgroundKeyword <em>Background Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background Keyword</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Background#getBackgroundKeyword()
   * @see #getBackground()
   * @generated
   */
  EAttribute getBackground_BackgroundKeyword();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Background#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Background#getTitle()
   * @see #getBackground()
   * @generated
   */
  EAttribute getBackground_Title();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Background#getNarrative <em>Narrative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Narrative</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Background#getNarrative()
   * @see #getBackground()
   * @generated
   */
  EAttribute getBackground_Narrative();

  /**
   * Returns the meta object for the containment reference list '{@link uom.ac.uk.msc.cucumber.gherkin.Background#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Background#getSteps()
   * @see #getBackground()
   * @generated
   */
  EReference getBackground_Steps();

  /**
   * Returns the meta object for class '{@link uom.ac.uk.msc.cucumber.gherkin.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the containment reference list '{@link uom.ac.uk.msc.cucumber.gherkin.Scenario#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tags</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Scenario#getTags()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Tags();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Scenario#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Scenario#getTitle()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Title();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Scenario#getNarrative <em>Narrative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Narrative</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Scenario#getNarrative()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Narrative();

  /**
   * Returns the meta object for the containment reference list '{@link uom.ac.uk.msc.cucumber.gherkin.Scenario#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Scenario#getSteps()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Steps();

  /**
   * Returns the meta object for class '{@link uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline <em>Scenario Outline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario Outline</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline
   * @generated
   */
  EClass getScenarioOutline();

  /**
   * Returns the meta object for the containment reference list '{@link uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tags</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getTags()
   * @see #getScenarioOutline()
   * @generated
   */
  EReference getScenarioOutline_Tags();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getTitle()
   * @see #getScenarioOutline()
   * @generated
   */
  EAttribute getScenarioOutline_Title();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getNarrative <em>Narrative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Narrative</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getNarrative()
   * @see #getScenarioOutline()
   * @generated
   */
  EAttribute getScenarioOutline_Narrative();

  /**
   * Returns the meta object for the containment reference list '{@link uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getSteps()
   * @see #getScenarioOutline()
   * @generated
   */
  EReference getScenarioOutline_Steps();

  /**
   * Returns the meta object for the containment reference '{@link uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getExamples <em>Examples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Examples</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline#getExamples()
   * @see #getScenarioOutline()
   * @generated
   */
  EReference getScenarioOutline_Examples();

  /**
   * Returns the meta object for class '{@link uom.ac.uk.msc.cucumber.gherkin.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Step#getStepKeyword <em>Step Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Step Keyword</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Step#getStepKeyword()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_StepKeyword();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Step#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Step#getDescription()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Description();

  /**
   * Returns the meta object for the containment reference list '{@link uom.ac.uk.msc.cucumber.gherkin.Step#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Step#getTables()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Tables();

  /**
   * Returns the meta object for the containment reference '{@link uom.ac.uk.msc.cucumber.gherkin.Step#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Step#getCode()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Code();

  /**
   * Returns the meta object for class '{@link uom.ac.uk.msc.cucumber.gherkin.Examples <em>Examples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Examples</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Examples
   * @generated
   */
  EClass getExamples();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Examples#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Examples#getTitle()
   * @see #getExamples()
   * @generated
   */
  EAttribute getExamples_Title();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Examples#getNarrative <em>Narrative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Narrative</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Examples#getNarrative()
   * @see #getExamples()
   * @generated
   */
  EAttribute getExamples_Narrative();

  /**
   * Returns the meta object for the containment reference '{@link uom.ac.uk.msc.cucumber.gherkin.Examples#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Examples#getTable()
   * @see #getExamples()
   * @generated
   */
  EReference getExamples_Table();

  /**
   * Returns the meta object for class '{@link uom.ac.uk.msc.cucumber.gherkin.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute list '{@link uom.ac.uk.msc.cucumber.gherkin.Table#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rows</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Table#getRows()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Rows();

  /**
   * Returns the meta object for class '{@link uom.ac.uk.msc.cucumber.gherkin.DocString <em>Doc String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Doc String</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.DocString
   * @generated
   */
  EClass getDocString();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.DocString#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.DocString#getContent()
   * @see #getDocString()
   * @generated
   */
  EAttribute getDocString_Content();

  /**
   * Returns the meta object for class '{@link uom.ac.uk.msc.cucumber.gherkin.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for the attribute '{@link uom.ac.uk.msc.cucumber.gherkin.Tag#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see uom.ac.uk.msc.cucumber.gherkin.Tag#getId()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_Id();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GherkinFactory getGherkinFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.FeatureImpl
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TAGS = eINSTANCE.getFeature_Tags();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__TITLE = eINSTANCE.getFeature_Title();

    /**
     * The meta object literal for the '<em><b>Narrative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NARRATIVE = eINSTANCE.getFeature_Narrative();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__BACKGROUND = eINSTANCE.getFeature_Background();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__SCENARIOS = eINSTANCE.getFeature_Scenarios();

    /**
     * The meta object literal for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.BackgroundImpl <em>Background</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.BackgroundImpl
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getBackground()
     * @generated
     */
    EClass BACKGROUND = eINSTANCE.getBackground();

    /**
     * The meta object literal for the '<em><b>Background Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BACKGROUND__BACKGROUND_KEYWORD = eINSTANCE.getBackground_BackgroundKeyword();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BACKGROUND__TITLE = eINSTANCE.getBackground_Title();

    /**
     * The meta object literal for the '<em><b>Narrative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BACKGROUND__NARRATIVE = eINSTANCE.getBackground_Narrative();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BACKGROUND__STEPS = eINSTANCE.getBackground_Steps();

    /**
     * The meta object literal for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioImpl
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__TAGS = eINSTANCE.getScenario_Tags();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__TITLE = eINSTANCE.getScenario_Title();

    /**
     * The meta object literal for the '<em><b>Narrative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NARRATIVE = eINSTANCE.getScenario_Narrative();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__STEPS = eINSTANCE.getScenario_Steps();

    /**
     * The meta object literal for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioOutlineImpl <em>Scenario Outline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioOutlineImpl
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getScenarioOutline()
     * @generated
     */
    EClass SCENARIO_OUTLINE = eINSTANCE.getScenarioOutline();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO_OUTLINE__TAGS = eINSTANCE.getScenarioOutline_Tags();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO_OUTLINE__TITLE = eINSTANCE.getScenarioOutline_Title();

    /**
     * The meta object literal for the '<em><b>Narrative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO_OUTLINE__NARRATIVE = eINSTANCE.getScenarioOutline_Narrative();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO_OUTLINE__STEPS = eINSTANCE.getScenarioOutline_Steps();

    /**
     * The meta object literal for the '<em><b>Examples</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO_OUTLINE__EXAMPLES = eINSTANCE.getScenarioOutline_Examples();

    /**
     * The meta object literal for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.StepImpl
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Step Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__STEP_KEYWORD = eINSTANCE.getStep_StepKeyword();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__DESCRIPTION = eINSTANCE.getStep_Description();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__TABLES = eINSTANCE.getStep_Tables();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__CODE = eINSTANCE.getStep_Code();

    /**
     * The meta object literal for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.ExamplesImpl <em>Examples</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.ExamplesImpl
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getExamples()
     * @generated
     */
    EClass EXAMPLES = eINSTANCE.getExamples();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXAMPLES__TITLE = eINSTANCE.getExamples_Title();

    /**
     * The meta object literal for the '<em><b>Narrative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXAMPLES__NARRATIVE = eINSTANCE.getExamples_Narrative();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLES__TABLE = eINSTANCE.getExamples_Table();

    /**
     * The meta object literal for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.TableImpl
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__ROWS = eINSTANCE.getTable_Rows();

    /**
     * The meta object literal for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.DocStringImpl <em>Doc String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.DocStringImpl
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getDocString()
     * @generated
     */
    EClass DOC_STRING = eINSTANCE.getDocString();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_STRING__CONTENT = eINSTANCE.getDocString_Content();

    /**
     * The meta object literal for the '{@link uom.ac.uk.msc.cucumber.gherkin.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.TagImpl
     * @see uom.ac.uk.msc.cucumber.gherkin.impl.GherkinPackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__ID = eINSTANCE.getTag_Id();

  }

} //GherkinPackage
