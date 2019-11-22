/**
 * generated by Xtext 2.19.0
 */
package lu.uni.socrates.impl;

import lu.uni.socrates.SocratesPackage;
import lu.uni.socrates.timedterm;
import lu.uni.socrates.value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>timedterm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.uni.socrates.impl.timedtermImpl#getInf <em>Inf</em>}</li>
 *   <li>{@link lu.uni.socrates.impl.timedtermImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link lu.uni.socrates.impl.timedtermImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link lu.uni.socrates.impl.timedtermImpl#getOp <em>Op</em>}</li>
 *   <li>{@link lu.uni.socrates.impl.timedtermImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class timedtermImpl extends MinimalEObjectImpl.Container implements timedterm
{
  /**
   * The default value of the '{@link #getInf() <em>Inf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInf()
   * @generated
   * @ordered
   */
  protected static final String INF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInf() <em>Inf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInf()
   * @generated
   * @ordered
   */
  protected String inf = INF_EDEFAULT;

  /**
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected String number = NUMBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected EObject ref;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected value value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected timedtermImpl()
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
    return SocratesPackage.Literals.TIMEDTERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInf()
  {
    return inf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInf(String newInf)
  {
    String oldInf = inf;
    inf = newInf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.TIMEDTERM__INF, oldInf, inf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumber(String newNumber)
  {
    String oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.TIMEDTERM__NUMBER, oldNumber, number));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SocratesPackage.TIMEDTERM__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(EObject newRef)
  {
    EObject oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.TIMEDTERM__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.TIMEDTERM__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(value newValue, NotificationChain msgs)
  {
    value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocratesPackage.TIMEDTERM__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.TIMEDTERM__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.TIMEDTERM__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.TIMEDTERM__VALUE, newValue, newValue));
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
      case SocratesPackage.TIMEDTERM__VALUE:
        return basicSetValue(null, msgs);
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
      case SocratesPackage.TIMEDTERM__INF:
        return getInf();
      case SocratesPackage.TIMEDTERM__NUMBER:
        return getNumber();
      case SocratesPackage.TIMEDTERM__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case SocratesPackage.TIMEDTERM__OP:
        return getOp();
      case SocratesPackage.TIMEDTERM__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SocratesPackage.TIMEDTERM__INF:
        setInf((String)newValue);
        return;
      case SocratesPackage.TIMEDTERM__NUMBER:
        setNumber((String)newValue);
        return;
      case SocratesPackage.TIMEDTERM__REF:
        setRef((EObject)newValue);
        return;
      case SocratesPackage.TIMEDTERM__OP:
        setOp((String)newValue);
        return;
      case SocratesPackage.TIMEDTERM__VALUE:
        setValue((value)newValue);
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
      case SocratesPackage.TIMEDTERM__INF:
        setInf(INF_EDEFAULT);
        return;
      case SocratesPackage.TIMEDTERM__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case SocratesPackage.TIMEDTERM__REF:
        setRef((EObject)null);
        return;
      case SocratesPackage.TIMEDTERM__OP:
        setOp(OP_EDEFAULT);
        return;
      case SocratesPackage.TIMEDTERM__VALUE:
        setValue((value)null);
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
      case SocratesPackage.TIMEDTERM__INF:
        return INF_EDEFAULT == null ? inf != null : !INF_EDEFAULT.equals(inf);
      case SocratesPackage.TIMEDTERM__NUMBER:
        return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
      case SocratesPackage.TIMEDTERM__REF:
        return ref != null;
      case SocratesPackage.TIMEDTERM__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case SocratesPackage.TIMEDTERM__VALUE:
        return value != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (inf: ");
    result.append(inf);
    result.append(", number: ");
    result.append(number);
    result.append(", op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //timedtermImpl
