/**
 * generated by Xtext 2.19.0
 */
package lu.uni.socrates;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Socrates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.uni.socrates.Socrates#getOracles <em>Oracles</em>}</li>
 * </ul>
 *
 * @see lu.uni.socrates.SocratesPackage#getSocrates()
 * @model
 * @generated
 */
public interface Socrates extends EObject
{
  /**
   * Returns the value of the '<em><b>Oracles</b></em>' containment reference list.
   * The list contents are of type {@link lu.uni.socrates.Oracle}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oracles</em>' containment reference list.
   * @see lu.uni.socrates.SocratesPackage#getSocrates_Oracles()
   * @model containment="true"
   * @generated
   */
  EList<Oracle> getOracles();

} // Socrates
