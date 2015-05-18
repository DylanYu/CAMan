/**
 */
package hadoopmodel.impl;

import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.Java;
import hadoopmodel.Server;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.JavaImpl#getJava_jdk_version <em>Java jdk version</em>}</li>
 *   <li>{@link hadoopmodel.impl.JavaImpl#getJava_install_flavor <em>Java install flavor</em>}</li>
 *   <li>{@link hadoopmodel.impl.JavaImpl#getJava_hostOn <em>Java host On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaImpl extends MinimalEObjectImpl.Container implements Java {
	/**
	 * The default value of the '{@link #getJava_jdk_version() <em>Java jdk version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava_jdk_version()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_JDK_VERSION_EDEFAULT = "6";

	/**
	 * The cached value of the '{@link #getJava_jdk_version() <em>Java jdk version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava_jdk_version()
	 * @generated
	 * @ordered
	 */
	protected String java_jdk_version = JAVA_JDK_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJava_install_flavor() <em>Java install flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava_install_flavor()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_INSTALL_FLAVOR_EDEFAULT = "oracle";

	/**
	 * The cached value of the '{@link #getJava_install_flavor() <em>Java install flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava_install_flavor()
	 * @generated
	 * @ordered
	 */
	protected String java_install_flavor = JAVA_INSTALL_FLAVOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJava_hostOn() <em>Java host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server java_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.JAVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJava_jdk_version() {
		return java_jdk_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJava_jdk_version(String newJava_jdk_version) {
		String oldJava_jdk_version = java_jdk_version;
		java_jdk_version = newJava_jdk_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.JAVA__JAVA_JDK_VERSION, oldJava_jdk_version, java_jdk_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJava_install_flavor() {
		return java_install_flavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJava_install_flavor(String newJava_install_flavor) {
		String oldJava_install_flavor = java_install_flavor;
		java_install_flavor = newJava_install_flavor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.JAVA__JAVA_INSTALL_FLAVOR, oldJava_install_flavor, java_install_flavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getJava_hostOn() {
		if (java_hostOn != null && java_hostOn.eIsProxy()) {
			InternalEObject oldJava_hostOn = (InternalEObject)java_hostOn;
			java_hostOn = (Server)eResolveProxy(oldJava_hostOn);
			if (java_hostOn != oldJava_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.JAVA__JAVA_HOST_ON, oldJava_hostOn, java_hostOn));
			}
		}
		return java_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetJava_hostOn() {
		return java_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJava_hostOn(Server newJava_hostOn) {
		Server oldJava_hostOn = java_hostOn;
		java_hostOn = newJava_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.JAVA__JAVA_HOST_ON, oldJava_hostOn, java_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.JAVA__JAVA_JDK_VERSION:
				return getJava_jdk_version();
			case HadoopmodelPackage.JAVA__JAVA_INSTALL_FLAVOR:
				return getJava_install_flavor();
			case HadoopmodelPackage.JAVA__JAVA_HOST_ON:
				if (resolve) return getJava_hostOn();
				return basicGetJava_hostOn();
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
			case HadoopmodelPackage.JAVA__JAVA_JDK_VERSION:
				setJava_jdk_version((String)newValue);
				return;
			case HadoopmodelPackage.JAVA__JAVA_INSTALL_FLAVOR:
				setJava_install_flavor((String)newValue);
				return;
			case HadoopmodelPackage.JAVA__JAVA_HOST_ON:
				setJava_hostOn((Server)newValue);
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
			case HadoopmodelPackage.JAVA__JAVA_JDK_VERSION:
				setJava_jdk_version(JAVA_JDK_VERSION_EDEFAULT);
				return;
			case HadoopmodelPackage.JAVA__JAVA_INSTALL_FLAVOR:
				setJava_install_flavor(JAVA_INSTALL_FLAVOR_EDEFAULT);
				return;
			case HadoopmodelPackage.JAVA__JAVA_HOST_ON:
				setJava_hostOn((Server)null);
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
			case HadoopmodelPackage.JAVA__JAVA_JDK_VERSION:
				return JAVA_JDK_VERSION_EDEFAULT == null ? java_jdk_version != null : !JAVA_JDK_VERSION_EDEFAULT.equals(java_jdk_version);
			case HadoopmodelPackage.JAVA__JAVA_INSTALL_FLAVOR:
				return JAVA_INSTALL_FLAVOR_EDEFAULT == null ? java_install_flavor != null : !JAVA_INSTALL_FLAVOR_EDEFAULT.equals(java_install_flavor);
			case HadoopmodelPackage.JAVA__JAVA_HOST_ON:
				return java_hostOn != null;
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
		result.append(" (java_jdk_version: ");
		result.append(java_jdk_version);
		result.append(", java_install_flavor: ");
		result.append(java_install_flavor);
		result.append(')');
		return result.toString();
	}

} //JavaImpl
