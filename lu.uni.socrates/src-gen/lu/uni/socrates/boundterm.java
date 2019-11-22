/**
 * generated by Xtext 2.19.0
 */
package lu.uni.socrates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>boundterm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.uni.socrates.boundterm#getRef <em>Ref</em>}</li>
 *   <li>{@link lu.uni.socrates.boundterm#getL <em>L</em>}</li>
 *   <li>{@link lu.uni.socrates.boundterm#getLeftbound <em>Leftbound</em>}</li>
 *   <li>{@link lu.uni.socrates.boundterm#getRightbound <em>Rightbound</em>}</li>
 *   <li>{@link lu.uni.socrates.boundterm#getR <em>R</em>}</li>
 * </ul>
 *
 * @see lu.uni.socrates.SocratesPackage#getboundterm()
 * @model
 * @generated
 */
public interface boundterm extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(Tvariable)
   * @see lu.uni.socrates.SocratesPackage#getboundterm_Ref()
   * @model containment="true"
   * @generated
   */
  Tvariable getRef();

  /**
   * Sets the value of the '{@link lu.uni.socrates.boundterm#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Tvariable value);

  /**
   * Returns the value of the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' attribute.
   * @see #setL(String)
   * @see lu.uni.socrates.SocratesPackage#getboundterm_L()
   * @model
   * @generated
   */
  String getL();

  /**
   * Sets the value of the '{@link lu.uni.socrates.boundterm#getL <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' attribute.
   * @see #getL()
   * @generated
   */
  void setL(String value);

  /**
   * Returns the value of the '<em><b>Leftbound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leftbound</em>' containment reference.
   * @see #setLeftbound(timedterm)
   * @see lu.uni.socrates.SocratesPackage#getboundterm_Leftbound()
   * @model containment="true"
   * @generated
   */
  timedterm getLeftbound();

  /**
   * Sets the value of the '{@link lu.uni.socrates.boundterm#getLeftbound <em>Leftbound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Leftbound</em>' containment reference.
   * @see #getLeftbound()
   * @generated
   */
  void setLeftbound(timedterm value);

  /**
   * Returns the value of the '<em><b>Rightbound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rightbound</em>' containment reference.
   * @see #setRightbound(timedterm)
   * @see lu.uni.socrates.SocratesPackage#getboundterm_Rightbound()
   * @model containment="true"
   * @generated
   */
  timedterm getRightbound();

  /**
   * Sets the value of the '{@link lu.uni.socrates.boundterm#getRightbound <em>Rightbound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rightbound</em>' containment reference.
   * @see #getRightbound()
   * @generated
   */
  void setRightbound(timedterm value);

  /**
   * Returns the value of the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' attribute.
   * @see #setR(String)
   * @see lu.uni.socrates.SocratesPackage#getboundterm_R()
   * @model
   * @generated
   */
  String getR();

  /**
   * Sets the value of the '{@link lu.uni.socrates.boundterm#getR <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' attribute.
   * @see #getR()
   * @generated
   */
  void setR(String value);

} // boundterm
