/**
 */
package AGSN.impl;

import AGSN.AGSNPackage;
import AGSN.Goal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AGSN.impl.GoalImpl#isUndeveloped <em>Undeveloped</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends BasicNodeImpl implements Goal {
	/**
	 * The default value of the '{@link #isUndeveloped() <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndeveloped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDEVELOPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUndeveloped() <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndeveloped()
	 * @generated
	 * @ordered
	 */
	protected boolean undeveloped = UNDEVELOPED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AGSNPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUndeveloped() {
		return undeveloped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndeveloped(boolean newUndeveloped) {
		boolean oldUndeveloped = undeveloped;
		undeveloped = newUndeveloped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AGSNPackage.GOAL__UNDEVELOPED, oldUndeveloped, undeveloped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AGSNPackage.GOAL__UNDEVELOPED:
				return isUndeveloped();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AGSNPackage.GOAL__UNDEVELOPED:
				setUndeveloped((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AGSNPackage.GOAL__UNDEVELOPED:
				setUndeveloped(UNDEVELOPED_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AGSNPackage.GOAL__UNDEVELOPED:
				return undeveloped != UNDEVELOPED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (undeveloped: ");
		result.append(undeveloped);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
