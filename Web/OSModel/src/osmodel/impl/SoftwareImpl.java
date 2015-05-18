/**
 */
package osmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import osmodel.ClusterWrap;
import osmodel.OsmodelPackage;
import osmodel.ServerWrap;
import osmodel.Software;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link osmodel.impl.SoftwareImpl#getSoftware_name <em>Software name</em>}</li>
 *   <li>{@link osmodel.impl.SoftwareImpl#getSoftware_status <em>Software status</em>}</li>
 *   <li>{@link osmodel.impl.SoftwareImpl#getSoftware_hostOn <em>Software host On</em>}</li>
 *   <li>{@link osmodel.impl.SoftwareImpl#getSoftware_belongTo <em>Software belong To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SoftwareImpl extends EObjectImpl implements Software {
	/**
	 * The default value of the '{@link #getSoftware_name() <em>Software name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSoftware_name() <em>Software name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware_name()
	 * @generated
	 * @ordered
	 */
	protected String software_name = SOFTWARE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftware_status() <em>Software status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware_status()
	 * @generated
	 * @ordered
	 */
	protected static final int SOFTWARE_STATUS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSoftware_status() <em>Software status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware_status()
	 * @generated
	 * @ordered
	 */
	protected int software_status = SOFTWARE_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoftware_hostOn() <em>Software host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware_hostOn()
	 * @generated
	 * @ordered
	 */
	protected ServerWrap software_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsmodelPackage.Literals.SOFTWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoftware_name() {
		return software_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware_name(String newSoftware_name) {
		String oldSoftware_name = software_name;
		software_name = newSoftware_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SOFTWARE__SOFTWARE_NAME, oldSoftware_name, software_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSoftware_status() {
		return software_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware_status(int newSoftware_status) {
		int oldSoftware_status = software_status;
		software_status = newSoftware_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SOFTWARE__SOFTWARE_STATUS, oldSoftware_status, software_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerWrap getSoftware_hostOn() {
		if (software_hostOn != null && software_hostOn.eIsProxy()) {
			InternalEObject oldSoftware_hostOn = (InternalEObject)software_hostOn;
			software_hostOn = (ServerWrap)eResolveProxy(oldSoftware_hostOn);
			if (software_hostOn != oldSoftware_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsmodelPackage.SOFTWARE__SOFTWARE_HOST_ON, oldSoftware_hostOn, software_hostOn));
			}
		}
		return software_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerWrap basicGetSoftware_hostOn() {
		return software_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware_hostOn(ServerWrap newSoftware_hostOn) {
		ServerWrap oldSoftware_hostOn = software_hostOn;
		software_hostOn = newSoftware_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SOFTWARE__SOFTWARE_HOST_ON, oldSoftware_hostOn, software_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterWrap getSoftware_belongTo() {
		if (eContainerFeatureID() != OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO) return null;
		return (ClusterWrap)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware_belongTo(ClusterWrap newSoftware_belongTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSoftware_belongTo, OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware_belongTo(ClusterWrap newSoftware_belongTo) {
		if (newSoftware_belongTo != eInternalContainer() || (eContainerFeatureID() != OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO && newSoftware_belongTo != null)) {
			if (EcoreUtil.isAncestor(this, newSoftware_belongTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSoftware_belongTo != null)
				msgs = ((InternalEObject)newSoftware_belongTo).eInverseAdd(this, OsmodelPackage.CLUSTER_WRAP__SOFTWARES, ClusterWrap.class, msgs);
			msgs = basicSetSoftware_belongTo(newSoftware_belongTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO, newSoftware_belongTo, newSoftware_belongTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSoftware_belongTo((ClusterWrap)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO:
				return basicSetSoftware_belongTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO:
				return eInternalContainer().eInverseRemove(this, OsmodelPackage.CLUSTER_WRAP__SOFTWARES, ClusterWrap.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsmodelPackage.SOFTWARE__SOFTWARE_NAME:
				return getSoftware_name();
			case OsmodelPackage.SOFTWARE__SOFTWARE_STATUS:
				return getSoftware_status();
			case OsmodelPackage.SOFTWARE__SOFTWARE_HOST_ON:
				if (resolve) return getSoftware_hostOn();
				return basicGetSoftware_hostOn();
			case OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO:
				return getSoftware_belongTo();
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
			case OsmodelPackage.SOFTWARE__SOFTWARE_NAME:
				setSoftware_name((String)newValue);
				return;
			case OsmodelPackage.SOFTWARE__SOFTWARE_STATUS:
				setSoftware_status((Integer)newValue);
				return;
			case OsmodelPackage.SOFTWARE__SOFTWARE_HOST_ON:
				setSoftware_hostOn((ServerWrap)newValue);
				return;
			case OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO:
				setSoftware_belongTo((ClusterWrap)newValue);
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
			case OsmodelPackage.SOFTWARE__SOFTWARE_NAME:
				setSoftware_name(SOFTWARE_NAME_EDEFAULT);
				return;
			case OsmodelPackage.SOFTWARE__SOFTWARE_STATUS:
				setSoftware_status(SOFTWARE_STATUS_EDEFAULT);
				return;
			case OsmodelPackage.SOFTWARE__SOFTWARE_HOST_ON:
				setSoftware_hostOn((ServerWrap)null);
				return;
			case OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO:
				setSoftware_belongTo((ClusterWrap)null);
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
			case OsmodelPackage.SOFTWARE__SOFTWARE_NAME:
				return SOFTWARE_NAME_EDEFAULT == null ? software_name != null : !SOFTWARE_NAME_EDEFAULT.equals(software_name);
			case OsmodelPackage.SOFTWARE__SOFTWARE_STATUS:
				return software_status != SOFTWARE_STATUS_EDEFAULT;
			case OsmodelPackage.SOFTWARE__SOFTWARE_HOST_ON:
				return software_hostOn != null;
			case OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO:
				return getSoftware_belongTo() != null;
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
		result.append(" (software_name: ");
		result.append(software_name);
		result.append(", software_status: ");
		result.append(software_status);
		result.append(')');
		return result.toString();
	}

} //SoftwareImpl
