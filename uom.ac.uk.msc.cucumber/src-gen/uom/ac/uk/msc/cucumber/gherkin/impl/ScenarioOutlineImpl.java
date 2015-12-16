/**
 */
package uom.ac.uk.msc.cucumber.gherkin.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uom.ac.uk.msc.cucumber.gherkin.Examples;
import uom.ac.uk.msc.cucumber.gherkin.GherkinPackage;
import uom.ac.uk.msc.cucumber.gherkin.ScenarioOutline;
import uom.ac.uk.msc.cucumber.gherkin.Step;
import uom.ac.uk.msc.cucumber.gherkin.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Outline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioOutlineImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioOutlineImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioOutlineImpl#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioOutlineImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.ScenarioOutlineImpl#getExamples <em>Examples</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioOutlineImpl extends MinimalEObjectImpl.Container implements ScenarioOutline
{
  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<Tag> tags;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getNarrative() <em>Narrative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNarrative()
   * @generated
   * @ordered
   */
  protected static final String NARRATIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNarrative() <em>Narrative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNarrative()
   * @generated
   * @ordered
   */
  protected String narrative = NARRATIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSteps()
   * @generated
   * @ordered
   */
  protected EList<Step> steps;

  /**
   * The cached value of the '{@link #getExamples() <em>Examples</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExamples()
   * @generated
   * @ordered
   */
  protected Examples examples;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioOutlineImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GherkinPackage.Literals.SCENARIO_OUTLINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tag> getTags()
  {
    if (tags == null)
    {
      tags = new EObjectContainmentEList<Tag>(Tag.class, this, GherkinPackage.SCENARIO_OUTLINE__TAGS);
    }
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.SCENARIO_OUTLINE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNarrative()
  {
    return narrative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNarrative(String newNarrative)
  {
    String oldNarrative = narrative;
    narrative = newNarrative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.SCENARIO_OUTLINE__NARRATIVE, oldNarrative, narrative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Step> getSteps()
  {
    if (steps == null)
    {
      steps = new EObjectContainmentEList<Step>(Step.class, this, GherkinPackage.SCENARIO_OUTLINE__STEPS);
    }
    return steps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Examples getExamples()
  {
    return examples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExamples(Examples newExamples, NotificationChain msgs)
  {
    Examples oldExamples = examples;
    examples = newExamples;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GherkinPackage.SCENARIO_OUTLINE__EXAMPLES, oldExamples, newExamples);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExamples(Examples newExamples)
  {
    if (newExamples != examples)
    {
      NotificationChain msgs = null;
      if (examples != null)
        msgs = ((InternalEObject)examples).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.SCENARIO_OUTLINE__EXAMPLES, null, msgs);
      if (newExamples != null)
        msgs = ((InternalEObject)newExamples).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.SCENARIO_OUTLINE__EXAMPLES, null, msgs);
      msgs = basicSetExamples(newExamples, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.SCENARIO_OUTLINE__EXAMPLES, newExamples, newExamples));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GherkinPackage.SCENARIO_OUTLINE__TAGS:
        return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
      case GherkinPackage.SCENARIO_OUTLINE__STEPS:
        return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
      case GherkinPackage.SCENARIO_OUTLINE__EXAMPLES:
        return basicSetExamples(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GherkinPackage.SCENARIO_OUTLINE__TAGS:
        return getTags();
      case GherkinPackage.SCENARIO_OUTLINE__TITLE:
        return getTitle();
      case GherkinPackage.SCENARIO_OUTLINE__NARRATIVE:
        return getNarrative();
      case GherkinPackage.SCENARIO_OUTLINE__STEPS:
        return getSteps();
      case GherkinPackage.SCENARIO_OUTLINE__EXAMPLES:
        return getExamples();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GherkinPackage.SCENARIO_OUTLINE__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends Tag>)newValue);
        return;
      case GherkinPackage.SCENARIO_OUTLINE__TITLE:
        setTitle((String)newValue);
        return;
      case GherkinPackage.SCENARIO_OUTLINE__NARRATIVE:
        setNarrative((String)newValue);
        return;
      case GherkinPackage.SCENARIO_OUTLINE__STEPS:
        getSteps().clear();
        getSteps().addAll((Collection<? extends Step>)newValue);
        return;
      case GherkinPackage.SCENARIO_OUTLINE__EXAMPLES:
        setExamples((Examples)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GherkinPackage.SCENARIO_OUTLINE__TAGS:
        getTags().clear();
        return;
      case GherkinPackage.SCENARIO_OUTLINE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case GherkinPackage.SCENARIO_OUTLINE__NARRATIVE:
        setNarrative(NARRATIVE_EDEFAULT);
        return;
      case GherkinPackage.SCENARIO_OUTLINE__STEPS:
        getSteps().clear();
        return;
      case GherkinPackage.SCENARIO_OUTLINE__EXAMPLES:
        setExamples((Examples)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GherkinPackage.SCENARIO_OUTLINE__TAGS:
        return tags != null && !tags.isEmpty();
      case GherkinPackage.SCENARIO_OUTLINE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case GherkinPackage.SCENARIO_OUTLINE__NARRATIVE:
        return NARRATIVE_EDEFAULT == null ? narrative != null : !NARRATIVE_EDEFAULT.equals(narrative);
      case GherkinPackage.SCENARIO_OUTLINE__STEPS:
        return steps != null && !steps.isEmpty();
      case GherkinPackage.SCENARIO_OUTLINE__EXAMPLES:
        return examples != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (title: ");
    result.append(title);
    result.append(", narrative: ");
    result.append(narrative);
    result.append(')');
    return result.toString();
  }

} //ScenarioOutlineImpl
