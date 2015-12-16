/**
 */
package uom.ac.uk.msc.cucumber.gherkin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.Table#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see uom.ac.uk.msc.cucumber.gherkin.GherkinPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject
{
  /**
   * Returns the value of the '<em><b>Rows</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' attribute list.
   * @see uom.ac.uk.msc.cucumber.gherkin.GherkinPackage#getTable_Rows()
   * @model unique="false"
   * @generated
   */
  EList<String> getRows();

} // Table
