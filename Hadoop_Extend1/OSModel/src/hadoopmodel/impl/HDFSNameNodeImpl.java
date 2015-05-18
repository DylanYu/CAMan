/**
 */
package hadoopmodel.impl;

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
 * An implementation of the model object '<em><b>HDFS Name Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.HDFSNameNodeImpl#getHdfsnamenode_data_dir <em>Hdfsnamenode data dir</em>}</li>
 *   <li>{@link hadoopmodel.impl.HDFSNameNodeImpl#getHdfsnamenode_hostOn <em>Hdfsnamenode host On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HDFSNameNodeImpl extends MinimalEObjectImpl.Container implements HDFSNameNode {
	/**
	 * The default value of the '{@link #getHdfsnamenode_data_dir() <em>Hdfsnamenode data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsnamenode_data_dir()
	 * @generated
	 * @ordered
	 */
	protected static final String HDFSNAMENODE_DATA_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdfsnamenode_data_dir() <em>Hdfsnamenode data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsnamenode_data_dir()
	 * @generated
	 * @ordered
	 */
	protected String hdfsnamenode_data_dir = HDFSNAMENODE_DATA_DIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHdfsnamenode_hostOn() <em>Hdfsnamenode host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsnamenode_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server hdfsnamenode_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDFSNameNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.HDFS_NAME_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHdfsnamenode_data_dir() {
		return hdfsnamenode_data_dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdfsnamenode_data_dir(String newHdfsnamenode_data_dir) {
		String oldHdfsnamenode_data_dir = hdfsnamenode_data_dir;
		hdfsnamenode_data_dir = newHdfsnamenode_data_dir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR, oldHdfsnamenode_data_dir, hdfsnamenode_data_dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getHdfsnamenode_hostOn() {
		if (hdfsnamenode_hostOn != null && hdfsnamenode_hostOn.eIsProxy()) {
			InternalEObject oldHdfsnamenode_hostOn = (InternalEObject)hdfsnamenode_hostOn;
			hdfsnamenode_hostOn = (Server)eResolveProxy(oldHdfsnamenode_hostOn);
			if (hdfsnamenode_hostOn != oldHdfsnamenode_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON, oldHdfsnamenode_hostOn, hdfsnamenode_hostOn));
			}
		}
		return hdfsnamenode_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetHdfsnamenode_hostOn() {
		return hdfsnamenode_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdfsnamenode_hostOn(Server newHdfsnamenode_hostOn) {
		Server oldHdfsnamenode_hostOn = hdfsnamenode_hostOn;
		hdfsnamenode_hostOn = newHdfsnamenode_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON, oldHdfsnamenode_hostOn, hdfsnamenode_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR:
				return getHdfsnamenode_data_dir();
			case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON:
				if (resolve) return getHdfsnamenode_hostOn();
				return basicGetHdfsnamenode_hostOn();
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
			case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR:
				setHdfsnamenode_data_dir((String)newValue);
				return;
			case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON:
				setHdfsnamenode_hostOn((Server)newValue);
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
			case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR:
				setHdfsnamenode_data_dir(HDFSNAMENODE_DATA_DIR_EDEFAULT);
				return;
			case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON:
				setHdfsnamenode_hostOn((Server)null);
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
			case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR:
				return HDFSNAMENODE_DATA_DIR_EDEFAULT == null ? hdfsnamenode_data_dir != null : !HDFSNAMENODE_DATA_DIR_EDEFAULT.equals(hdfsnamenode_data_dir);
			case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON:
				return hdfsnamenode_hostOn != null;
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
		result.append(" (hdfsnamenode_data_dir: ");
		result.append(hdfsnamenode_data_dir);
		result.append(')');
		return result.toString();
	}

} //HDFSNameNodeImpl
