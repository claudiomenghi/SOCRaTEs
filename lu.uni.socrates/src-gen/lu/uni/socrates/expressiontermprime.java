/**
 * generated by Xtext 2.19.0
 */
package lu.uni.socrates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expressiontermprime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.uni.socrates.expressiontermprime#getOp <em>Op</em>}</li>
 *   <li>{@link lu.uni.socrates.expressiontermprime#getT2 <em>T2</em>}</li>
 *   <li>{@link lu.uni.socrates.expressiontermprime#getF <em>F</em>}</li>
 * </ul>
 *
 * @see lu.uni.socrates.SocratesPackage#getexpressiontermprime()
 * @model
 * @generated
 */
public interface expressiontermprime extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see lu.uni.socrates.SocratesPackage#getexpressiontermprime_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link lu.uni.socrates.expressiontermprime#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' containment reference.
   * @see #setT2(expressionterm)
   * @see lu.uni.socrates.SocratesPackage#getexpressiontermprime_T2()
   * @model containment="true"
   * @generated
   */
  expressionterm getT2();

  /**
   * Sets the value of the '{@link lu.uni.socrates.expressiontermprime#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(expressionterm value);

  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(expressiontermprime)
   * @see lu.uni.socrates.SocratesPackage#getexpressiontermprime_F()
   * @model containment="true"
   * @generated
   */
  expressiontermprime getF();

  /**
   * Sets the value of the '{@link lu.uni.socrates.expressiontermprime#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(expressiontermprime value);

} // expressiontermprime
