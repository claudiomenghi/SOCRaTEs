/**
 * generated by Xtext 2.19.0
 */
package lu.uni.socrates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.uni.socrates.ExpressionAtom#getExp <em>Exp</em>}</li>
 *   <li>{@link lu.uni.socrates.ExpressionAtom#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see lu.uni.socrates.SocratesPackage#getExpressionAtom()
 * @model
 * @generated
 */
public interface ExpressionAtom extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(EObject)
   * @see lu.uni.socrates.SocratesPackage#getExpressionAtom_Exp()
   * @model containment="true"
   * @generated
   */
  EObject getExp();

  /**
   * Sets the value of the '{@link lu.uni.socrates.ExpressionAtom#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(EObject value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see lu.uni.socrates.SocratesPackage#getExpressionAtom_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link lu.uni.socrates.ExpressionAtom#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // ExpressionAtom
