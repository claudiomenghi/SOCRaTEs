/**
 * generated by Xtext 2.17.0.M1
 */
package lu.uni.socrates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.uni.socrates.ConstantDefinition#getConstantid <em>Constantid</em>}</li>
 *   <li>{@link lu.uni.socrates.ConstantDefinition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lu.uni.socrates.SocratesPackage#getConstantDefinition()
 * @model
 * @generated
 */
public interface ConstantDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Constantid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constantid</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constantid</em>' containment reference.
   * @see #setConstantid(ConstantId)
   * @see lu.uni.socrates.SocratesPackage#getConstantDefinition_Constantid()
   * @model containment="true"
   * @generated
   */
  ConstantId getConstantid();

  /**
   * Sets the value of the '{@link lu.uni.socrates.ConstantDefinition#getConstantid <em>Constantid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constantid</em>' containment reference.
   * @see #getConstantid()
   * @generated
   */
  void setConstantid(ConstantId value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see lu.uni.socrates.SocratesPackage#getConstantDefinition_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link lu.uni.socrates.ConstantDefinition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ConstantDefinition