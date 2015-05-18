/**
 */
package hadoopmodel.impl;

import hadoopmodel.HBaseMaster;
import hadoopmodel.HDFSNameNode;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.Server;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HBase Master</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.HBaseMasterImpl#getHbasemaster_rootdir <em>Hbasemaster rootdir</em>}</li>
 *   <li>{@link hadoopmodel.impl.HBaseMasterImpl#getHbasemaster_dependOn <em>Hbasemaster depend On</em>}</li>
 *   <li>{@link hadoopmodel.impl.HBaseMasterImpl#getHbasemaster_hostOn <em>Hbasemaster host On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HBaseMasterImpl extends MinimalEObjectImpl.Container implements HBaseMaster {
	/**
	 * The default value of the '{@link #getHbasemaster_rootdir() <em>Hbasemaster rootdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbasemaster_rootdir()
	 * @generated
	 * @ordered
	 */
	protected static final String HBASEMASTER_ROOTDIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHbasemaster_rootdir() <em>Hbasemaster rootdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbasemaster_rootdir()
	 * @generated
	 * @ordered
	 */
	protected String hbasemaster_rootdir = HBASEMASTER_ROOTDIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHbasemaster_dependOn() <em>Hbasemaster depend On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbasemaster_dependOn()
	 * @generated
	 * @ordered
	 */
	protected HDFSNameNode hbasemaster_dependOn;

	/**
	 * The cached value of the '{@link #getHbasemaster_hostOn() <em>Hbasemaster host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbasemaster_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server hbasemaster_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBaseMasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.HBASE_MASTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHbasemaster_rootdir() {
		return hbasemaster_rootdir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbasemaster_rootdir(String newHbasemaster_rootdir) {
		String oldHbasemaster_rootdir = hbasemaster_rootdir;
		hbasemaster_rootdir = newHbasemaster_rootdir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_ROOTDIR, oldHbasemaster_rootdir, hbasemaster_rootdir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSNameNode getHbasemaster_dependOn() {
		if (hbasemaster_dependOn != null && hbasemaster_dependOn.eIsProxy()) {
			InternalEObject oldHbasemaster_dependOn = (InternalEObject)hbasemaster_dependOn;
			hbasemaster_dependOn = (HDFSNameNode)eResolveProxy(oldHbasemaster_dependOn);
			if (hbasemaster_dependOn != oldHbasemaster_dependOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_DEPEND_ON, oldHbasemaster_dependOn, hbasemaster_dependOn));
			}
		}
		return hbasemaster_dependOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSNameNode basicGetHbasemaster_dependOn() {
		return hbasemaster_dependOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbasemaster_dependOn(HDFSNameNode newHbasemaster_dependOn) {
		HDFSNameNode oldHbasemaster_dependOn = hbasemaster_dependOn;
		hbasemaster_dependOn = newHbasemaster_dependOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_DEPEND_ON, oldHbasemaster_dependOn, hbasemaster_dependOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getHbasemaster_hostOn() {
		if (hbasemaster_hostOn != null && hbasemaster_hostOn.eIsProxy()) {
			InternalEObject oldHbasemaster_hostOn = (InternalEObject)hbasemaster_hostOn;
			hbasemaster_hostOn = (Server)eResolveProxy(oldHbasemaster_hostOn);
			if (hbasemaster_hostOn != oldHbasemaster_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_HOST_ON, oldHbasemaster_hostOn, hbasemaster_hostOn));
			}
		}
		return hbasemaster_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetHbasemaster_hostOn() {
		return hbasemaster_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbasemaster_hostOn(Server newHbasemaster_hostOn) {
		Server oldHbasemaster_hostOn = hbasemaster_hostOn;
		hbasemaster_hostOn = newHbasemaster_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_HOST_ON, oldHbasemaster_hostOn, hbasemaster_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_ROOTDIR:
				return getHbasemaster_rootdir();
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_DEPEND_ON:
				if (resolve) return getHbasemaster_dependOn();
				return basicGetHbasemaster_dependOn();
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_HOST_ON:
				if (resolve) return getHbasemaster_hostOn();
				return basicGetHbasemaster_hostOn();
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
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_ROOTDIR:
				setHbasemaster_rootdir((String)newValue);
				return;
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_DEPEND_ON:
				setHbasemaster_dependOn((HDFSNameNode)newValue);
				return;
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_HOST_ON:
				setHbasemaster_hostOn((Server)newValue);
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
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_ROOTDIR:
				setHbasemaster_rootdir(HBASEMASTER_ROOTDIR_EDEFAULT);
				return;
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_DEPEND_ON:
				setHbasemaster_dependOn((HDFSNameNode)null);
				return;
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_HOST_ON:
				setHbasemaster_hostOn((Server)null);
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
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_ROOTDIR:
				return HBASEMASTER_ROOTDIR_EDEFAULT == null ? hbasemaster_rootdir != null : !HBASEMASTER_ROOTDIR_EDEFAULT.equals(hbasemaster_rootdir);
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_DEPEND_ON:
				return hbasemaster_dependOn != null;
			case HadoopmodelPackage.HBASE_MASTER__HBASEMASTER_HOST_ON:
				return hbasemaster_hostOn != null;
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
		result.append(" (hbasemaster_rootdir: ");
		result.append(hbasemaster_rootdir);
		result.append(')');
		return result.toString();
	}

} //HBaseMasterImpl
