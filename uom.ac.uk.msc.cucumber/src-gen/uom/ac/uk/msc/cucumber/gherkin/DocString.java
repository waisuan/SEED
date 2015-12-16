/**
 */
package uom.ac.uk.msc.cucumber.gherkin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uom.ac.uk.msc.cucumber.gherkin.DocString#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see uom.ac.uk.msc.cucumber.gherkin.GherkinPackage#getDocString()
 * @model
 * @generated
 */
public interface DocString extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see uom.ac.uk.msc.cucumber.gherkin.GherkinPackage#getDocString_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link uom.ac.uk.msc.cucumber.gherkin.DocString#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // DocString
