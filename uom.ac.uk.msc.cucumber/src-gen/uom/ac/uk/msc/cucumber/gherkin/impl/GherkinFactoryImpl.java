/**
 */
package uom.ac.uk.msc.cucumber.gherkin.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uom.ac.uk.msc.cucumber.gherkin.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GherkinFactoryImpl extends EFactoryImpl implements GherkinFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GherkinFactory init()
  {
    try
    {
      GherkinFactory theGherkinFactory = (GherkinFactory)EPackage.Registry.INSTANCE.getEFactory(GherkinPackage.eNS_URI);
      if (theGherkinFactory != null)
      {
        return theGherkinFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GherkinFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GherkinFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GherkinPackage.FEATURE: return createFeature();
      case GherkinPackage.BACKGROUND: return createBackground();
      case GherkinPackage.SCENARIO: return createScenario();
      case GherkinPackage.SCENARIO_OUTLINE: return createScenarioOutline();
      case GherkinPackage.STEP: return createStep();
      case GherkinPackage.EXAMPLES: return createExamples();
      case GherkinPackage.TABLE: return createTable();
      case GherkinPackage.DOC_STRING: return createDocString();
      case GherkinPackage.TAG: return createTag();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Background createBackground()
  {
    BackgroundImpl background = new BackgroundImpl();
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioOutline createScenarioOutline()
  {
    ScenarioOutlineImpl scenarioOutline = new ScenarioOutlineImpl();
    return scenarioOutline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Examples createExamples()
  {
    ExamplesImpl examples = new ExamplesImpl();
    return examples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocString createDocString()
  {
    DocStringImpl docString = new DocStringImpl();
    return docString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tag createTag()
  {
    TagImpl tag = new TagImpl();
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GherkinPackage getGherkinPackage()
  {
    return (GherkinPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GherkinPackage getPackage()
  {
    return GherkinPackage.eINSTANCE;
  }

} //GherkinFactoryImpl
