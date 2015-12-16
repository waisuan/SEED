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

import uom.ac.uk.msc.cucumber.gherkin.Background;
import uom.ac.uk.msc.cucumber.gherkin.GherkinPackage;
import uom.ac.uk.msc.cucumber.gherkin.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.BackgroundImpl#getBackgroundKeyword <em>Background Keyword</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.BackgroundImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.BackgroundImpl#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.BackgroundImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BackgroundImpl extends MinimalEObjectImpl.Container implements Background
{
  /**
   * The default value of the '{@link #getBackgroundKeyword() <em>Background Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundKeyword()
   * @generated
   * @ordered
   */
  protected static final String BACKGROUND_KEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBackgroundKeyword() <em>Background Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundKeyword()
   * @generated
   * @ordered
   */
  protected String backgroundKeyword = BACKGROUND_KEYWORD_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BackgroundImpl()
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
    return GherkinPackage.Literals.BACKGROUND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBackgroundKeyword()
  {
    return backgroundKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackgroundKeyword(String newBackgroundKeyword)
  {
    String oldBackgroundKeyword = backgroundKeyword;
    backgroundKeyword = newBackgroundKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.BACKGROUND__BACKGROUND_KEYWORD, oldBackgroundKeyword, backgroundKeyword));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.BACKGROUND__TITLE, oldTitle, title));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.BACKGROUND__NARRATIVE, oldNarrative, narrative));
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
      steps = new EObjectContainmentEList<Step>(Step.class, this, GherkinPackage.BACKGROUND__STEPS);
    }
    return steps;
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
      case GherkinPackage.BACKGROUND__STEPS:
        return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
      case GherkinPackage.BACKGROUND__BACKGROUND_KEYWORD:
        return getBackgroundKeyword();
      case GherkinPackage.BACKGROUND__TITLE:
        return getTitle();
      case GherkinPackage.BACKGROUND__NARRATIVE:
        return getNarrative();
      case GherkinPackage.BACKGROUND__STEPS:
        return getSteps();
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
      case GherkinPackage.BACKGROUND__BACKGROUND_KEYWORD:
        setBackgroundKeyword((String)newValue);
        return;
      case GherkinPackage.BACKGROUND__TITLE:
        setTitle((String)newValue);
        return;
      case GherkinPackage.BACKGROUND__NARRATIVE:
        setNarrative((String)newValue);
        return;
      case GherkinPackage.BACKGROUND__STEPS:
        getSteps().clear();
        getSteps().addAll((Collection<? extends Step>)newValue);
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
      case GherkinPackage.BACKGROUND__BACKGROUND_KEYWORD:
        setBackgroundKeyword(BACKGROUND_KEYWORD_EDEFAULT);
        return;
      case GherkinPackage.BACKGROUND__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case GherkinPackage.BACKGROUND__NARRATIVE:
        setNarrative(NARRATIVE_EDEFAULT);
        return;
      case GherkinPackage.BACKGROUND__STEPS:
        getSteps().clear();
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
      case GherkinPackage.BACKGROUND__BACKGROUND_KEYWORD:
        return BACKGROUND_KEYWORD_EDEFAULT == null ? backgroundKeyword != null : !BACKGROUND_KEYWORD_EDEFAULT.equals(backgroundKeyword);
      case GherkinPackage.BACKGROUND__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case GherkinPackage.BACKGROUND__NARRATIVE:
        return NARRATIVE_EDEFAULT == null ? narrative != null : !NARRATIVE_EDEFAULT.equals(narrative);
      case GherkinPackage.BACKGROUND__STEPS:
        return steps != null && !steps.isEmpty();
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
    result.append(" (backgroundKeyword: ");
    result.append(backgroundKeyword);
    result.append(", title: ");
    result.append(title);
    result.append(", narrative: ");
    result.append(narrative);
    result.append(')');
    return result.toString();
  }

} //BackgroundImpl
