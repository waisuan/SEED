/**
 */
package uom.ac.uk.msc.cucumber.gherkin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examples</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.Examples#getTitle <em>Title</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.Examples#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.Examples#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see uom.ac.uk.msc.cucumber.gherkin.GherkinPackage#getExamples()
 * @model
 * @generated
 */
public interface Examples extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see uom.ac.uk.msc.cucumber.gherkin.GherkinPackage#getExamples_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link uom.ac.uk.msc.cucumber.gherkin.Examples#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Narrative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Narrative</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Narrative</em>' attribute.
   * @see #setNarrative(String)
   * @see uom.ac.uk.msc.cucumber.gherkin.GherkinPackage#getExamples_Narrative()
   * @model
   * @generated
   */
  String getNarrative();

  /**
   * Sets the value of the '{@link uom.ac.uk.msc.cucumber.gherkin.Examples#getNarrative <em>Narrative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Narrative</em>' attribute.
   * @see #getNarrative()
   * @generated
   */
  void setNarrative(String value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(Table)
   * @see uom.ac.uk.msc.cucumber.gherkin.GherkinPackage#getExamples_Table()
   * @model containment="true"
   * @generated
   */
  Table getTable();

  /**
   * Sets the value of the '{@link uom.ac.uk.msc.cucumber.gherkin.Examples#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(Table value);

} // Examples
