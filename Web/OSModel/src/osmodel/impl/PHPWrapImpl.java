/**
 */
package osmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import osmodel.ApacheWrap;
import osmodel.OsmodelPackage;
import osmodel.PHPWrap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PHP Wrap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link osmodel.impl.PHPWrapImpl#getPhp_dependOn <em>Php depend On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PHPWrapImpl extends SoftwareImpl implements PHPWrap {
	/**
	 * The cached value of the '{@link #getPhp_dependOn() <em>Php depend On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhp_dependOn()
	 * @generated
	 * @ordered
	 */
	protected ApacheWrap php_dependOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PHPWrapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsmodelPackage.Literals.PHP_WRAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApacheWrap getPhp_dependOn() {
		if (php_dependOn != null && php_dependOn.eIsProxy()) {
			InternalEObject oldPhp_dependOn = (InternalEObject)php_dependOn;
			php_dependOn = (ApacheWrap)eResolveProxy(oldPhp_dependOn);
			if (php_dependOn != oldPhp_dependOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsmodelPackage.PHP_WRAP__PHP_DEPEND_ON, oldPhp_dependOn, php_dependOn));
			}
		}
		return php_dependOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApacheWrap basicGetPhp_dependOn() {
		return php_dependOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhp_dependOn(ApacheWrap newPhp_dependOn) {
		ApacheWrap oldPhp_dependOn = php_dependOn;
		php_dependOn = newPhp_dependOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.PHP_WRAP__PHP_DEPEND_ON, oldPhp_dependOn, php_dependOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsmodelPackage.PHP_WRAP__PHP_DEPEND_ON:
				if (resolve) return getPhp_dependOn();
				return basicGetPhp_dependOn();
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
			case OsmodelPackage.PHP_WRAP__PHP_DEPEND_ON:
				setPhp_dependOn((ApacheWrap)newValue);
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
			case OsmodelPackage.PHP_WRAP__PHP_DEPEND_ON:
				setPhp_dependOn((ApacheWrap)null);
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
			case OsmodelPackage.PHP_WRAP__PHP_DEPEND_ON:
				return php_dependOn != null;
		}
		return super.eIsSet(featureID);
	}

} //PHPWrapImpl
