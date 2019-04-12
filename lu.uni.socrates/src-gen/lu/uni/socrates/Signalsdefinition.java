/**
 * generated by Xtext 2.17.0.M1
 */
package lu.uni.socrates;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signalsdefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.uni.socrates.Signalsdefinition#getSignals <em>Signals</em>}</li>
 * </ul>
 *
 * @see lu.uni.socrates.SocratesPackage#getSignalsdefinition()
 * @model
 * @generated
 */
public interface Signalsdefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link lu.uni.socrates.SignalID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see lu.uni.socrates.SocratesPackage#getSignalsdefinition_Signals()
   * @model containment="true"
   * @generated
   */
  EList<SignalID> getSignals();

} // Signalsdefinition