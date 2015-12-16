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

import uom.ac.uk.msc.cucumber.gherkin.DocString;
import uom.ac.uk.msc.cucumber.gherkin.GherkinPackage;
import uom.ac.uk.msc.cucumber.gherkin.Step;
import uom.ac.uk.msc.cucumber.gherkin.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.StepImpl#getStepKeyword <em>Step Keyword</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.StepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.StepImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.impl.StepImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step
{
  /**
   * The default value of the '{@link #getStepKeyword() <em>Step Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStepKeyword()
   * @generated
   * @ordered
   */
  protected static final String STEP_KEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStepKeyword() <em>Step Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStepKeyword()
   * @generated
   * @ordered
   */
  protected String stepKeyword = STEP_KEYWORD_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<Table> tables;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected DocString code;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StepImpl()
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
    return GherkinPackage.Literals.STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStepKeyword()
  {
    return stepKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStepKeyword(String newStepKeyword)
  {
    String oldStepKeyword = stepKeyword;
    stepKeyword = newStepKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.STEP__STEP_KEYWORD, oldStepKeyword, stepKeyword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.STEP__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Table> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<Table>(Table.class, this, GherkinPackage.STEP__TABLES);
    }
    return tables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocString getCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCode(DocString newCode, NotificationChain msgs)
  {
    DocString oldCode = code;
    code = newCode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GherkinPackage.STEP__CODE, oldCode, newCode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(DocString newCode)
  {
    if (newCode != code)
    {
      NotificationChain msgs = null;
      if (code != null)
        msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.STEP__CODE, null, msgs);
      if (newCode != null)
        msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.STEP__CODE, null, msgs);
      msgs = basicSetCode(newCode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.STEP__CODE, newCode, newCode));
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
      case GherkinPackage.STEP__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case GherkinPackage.STEP__CODE:
        return basicSetCode(null, msgs);
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
      case GherkinPackage.STEP__STEP_KEYWORD:
        return getStepKeyword();
      case GherkinPackage.STEP__DESCRIPTION:
        return getDescription();
      case GherkinPackage.STEP__TABLES:
        return getTables();
      case GherkinPackage.STEP__CODE:
        return getCode();
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
      case GherkinPackage.STEP__STEP_KEYWORD:
        setStepKeyword((String)newValue);
        return;
      case GherkinPackage.STEP__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case GherkinPackage.STEP__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends Table>)newValue);
        return;
      case GherkinPackage.STEP__CODE:
        setCode((DocString)newValue);
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
      case GherkinPackage.STEP__STEP_KEYWORD:
        setStepKeyword(STEP_KEYWORD_EDEFAULT);
        return;
      case GherkinPackage.STEP__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case GherkinPackage.STEP__TABLES:
        getTables().clear();
        return;
      case GherkinPackage.STEP__CODE:
        setCode((DocString)null);
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
      case GherkinPackage.STEP__STEP_KEYWORD:
        return STEP_KEYWORD_EDEFAULT == null ? stepKeyword != null : !STEP_KEYWORD_EDEFAULT.equals(stepKeyword);
      case GherkinPackage.STEP__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case GherkinPackage.STEP__TABLES:
        return tables != null && !tables.isEmpty();
      case GherkinPackage.STEP__CODE:
        return code != null;
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
    result.append(" (stepKeyword: ");
    result.append(stepKeyword);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //StepImpl
