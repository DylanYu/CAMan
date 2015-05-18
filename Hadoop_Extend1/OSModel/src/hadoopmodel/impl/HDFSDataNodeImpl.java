/**
 */
package hadoopmodel.impl;

import hadoopmodel.HDFSDataNode;
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
 * An implementation of the model object '<em><b>HDFS Data Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.HDFSDataNodeImpl#getHdfsdatanode_data_dir <em>Hdfsdatanode data dir</em>}</li>
 *   <li>{@link hadoopmodel.impl.HDFSDataNodeImpl#getHdfsdatanode_connectTo <em>Hdfsdatanode connect To</em>}</li>
 *   <li>{@link hadoopmodel.impl.HDFSDataNodeImpl#getHdfsdatanode_hostOn <em>Hdfsdatanode host On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HDFSDataNodeImpl extends MinimalEObjectImpl.Container implements HDFSDataNode {
	/**
	 * The default value of the '{@link #getHdfsdatanode_data_dir() <em>Hdfsdatanode data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsdatanode_data_dir()
	 * @generated
	 * @ordered
	 */
	protected static final String HDFSDATANODE_DATA_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdfsdatanode_data_dir() <em>Hdfsdatanode data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsdatanode_data_dir()
	 * @generated
	 * @ordered
	 */
	protected String hdfsdatanode_data_dir = HDFSDATANODE_DATA_DIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHdfsdatanode_connectTo() <em>Hdfsdatanode connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsdatanode_connectTo()
	 * @generated
	 * @ordered
	 */
	protected HDFSNameNode hdfsdatanode_connectTo;

	/**
	 * The cached value of the '{@link #getHdfsdatanode_hostOn() <em>Hdfsdatanode host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsdatanode_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server hdfsdatanode_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDFSDataNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.HDFS_DATA_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHdfsdatanode_data_dir() {
		return hdfsdatanode_data_dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdfsdatanode_data_dir(String newHdfsdatanode_data_dir) {
		String oldHdfsdatanode_data_dir = hdfsdatanode_data_dir;
		hdfsdatanode_data_dir = newHdfsdatanode_data_dir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR, oldHdfsdatanode_data_dir, hdfsdatanode_data_dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSNameNode getHdfsdatanode_connectTo() {
		if (hdfsdatanode_connectTo != null && hdfsdatanode_connectTo.eIsProxy()) {
			InternalEObject oldHdfsdatanode_connectTo = (InternalEObject)hdfsdatanode_connectTo;
			hdfsdatanode_connectTo = (HDFSNameNode)eResolveProxy(oldHdfsdatanode_connectTo);
			if (hdfsdatanode_connectTo != oldHdfsdatanode_connectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO, oldHdfsdatanode_connectTo, hdfsdatanode_connectTo));
			}
		}
		return hdfsdatanode_connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSNameNode basicGetHdfsdatanode_connectTo() {
		return hdfsdatanode_connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdfsdatanode_connectTo(HDFSNameNode newHdfsdatanode_connectTo) {
		HDFSNameNode oldHdfsdatanode_connectTo = hdfsdatanode_connectTo;
		hdfsdatanode_connectTo = newHdfsdatanode_connectTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO, oldHdfsdatanode_connectTo, hdfsdatanode_connectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getHdfsdatanode_hostOn() {
		if (hdfsdatanode_hostOn != null && hdfsdatanode_hostOn.eIsProxy()) {
			InternalEObject oldHdfsdatanode_hostOn = (InternalEObject)hdfsdatanode_hostOn;
			hdfsdatanode_hostOn = (Server)eResolveProxy(oldHdfsdatanode_hostOn);
			if (hdfsdatanode_hostOn != oldHdfsdatanode_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_HOST_ON, oldHdfsdatanode_hostOn, hdfsdatanode_hostOn));
			}
		}
		return hdfsdatanode_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetHdfsdatanode_hostOn() {
		return hdfsdatanode_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdfsdatanode_hostOn(Server newHdfsdatanode_hostOn) {
		Server oldHdfsdatanode_hostOn = hdfsdatanode_hostOn;
		hdfsdatanode_hostOn = newHdfsdatanode_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_HOST_ON, oldHdfsdatanode_hostOn, hdfsdatanode_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR:
				return getHdfsdatanode_data_dir();
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO:
				if (resolve) return getHdfsdatanode_connectTo();
				return basicGetHdfsdatanode_connectTo();
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_HOST_ON:
				if (resolve) return getHdfsdatanode_hostOn();
				return basicGetHdfsdatanode_hostOn();
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
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR:
				setHdfsdatanode_data_dir((String)newValue);
				return;
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO:
				setHdfsdatanode_connectTo((HDFSNameNode)newValue);
				return;
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_HOST_ON:
				setHdfsdatanode_hostOn((Server)newValue);
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
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR:
				setHdfsdatanode_data_dir(HDFSDATANODE_DATA_DIR_EDEFAULT);
				return;
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO:
				setHdfsdatanode_connectTo((HDFSNameNode)null);
				return;
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_HOST_ON:
				setHdfsdatanode_hostOn((Server)null);
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
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR:
				return HDFSDATANODE_DATA_DIR_EDEFAULT == null ? hdfsdatanode_data_dir != null : !HDFSDATANODE_DATA_DIR_EDEFAULT.equals(hdfsdatanode_data_dir);
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO:
				return hdfsdatanode_connectTo != null;
			case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_HOST_ON:
				return hdfsdatanode_hostOn != null;
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
		result.append(" (hdfsdatanode_data_dir: ");
		result.append(hdfsdatanode_data_dir);
		result.append(')');
		return result.toString();
	}

} //HDFSDataNodeImpl
