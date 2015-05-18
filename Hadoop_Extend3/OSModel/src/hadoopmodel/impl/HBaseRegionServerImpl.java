/**
 */
package hadoopmodel.impl;

import hadoopmodel.HBaseMaster;
import hadoopmodel.HBaseRegionServer;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.Server;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HBase Region Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.HBaseRegionServerImpl#getHbaseregionserver_name <em>Hbaseregionserver name</em>}</li>
 *   <li>{@link hadoopmodel.impl.HBaseRegionServerImpl#getHbaseregionserver_connectTo <em>Hbaseregionserver connect To</em>}</li>
 *   <li>{@link hadoopmodel.impl.HBaseRegionServerImpl#getHbaseregionserver_hostOn <em>Hbaseregionserver host On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HBaseRegionServerImpl extends MinimalEObjectImpl.Container implements HBaseRegionServer {
	/**
	 * The default value of the '{@link #getHbaseregionserver_name() <em>Hbaseregionserver name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbaseregionserver_name()
	 * @generated
	 * @ordered
	 */
	protected static final String HBASEREGIONSERVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHbaseregionserver_name() <em>Hbaseregionserver name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbaseregionserver_name()
	 * @generated
	 * @ordered
	 */
	protected String hbaseregionserver_name = HBASEREGIONSERVER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHbaseregionserver_connectTo() <em>Hbaseregionserver connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbaseregionserver_connectTo()
	 * @generated
	 * @ordered
	 */
	protected HBaseMaster hbaseregionserver_connectTo;

	/**
	 * The cached value of the '{@link #getHbaseregionserver_hostOn() <em>Hbaseregionserver host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbaseregionserver_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server hbaseregionserver_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBaseRegionServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.HBASE_REGION_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHbaseregionserver_name() {
		return hbaseregionserver_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbaseregionserver_name(String newHbaseregionserver_name) {
		String oldHbaseregionserver_name = hbaseregionserver_name;
		hbaseregionserver_name = newHbaseregionserver_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_NAME, oldHbaseregionserver_name, hbaseregionserver_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HBaseMaster getHbaseregionserver_connectTo() {
		if (hbaseregionserver_connectTo != null && hbaseregionserver_connectTo.eIsProxy()) {
			InternalEObject oldHbaseregionserver_connectTo = (InternalEObject)hbaseregionserver_connectTo;
			hbaseregionserver_connectTo = (HBaseMaster)eResolveProxy(oldHbaseregionserver_connectTo);
			if (hbaseregionserver_connectTo != oldHbaseregionserver_connectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_CONNECT_TO, oldHbaseregionserver_connectTo, hbaseregionserver_connectTo));
			}
		}
		return hbaseregionserver_connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HBaseMaster basicGetHbaseregionserver_connectTo() {
		return hbaseregionserver_connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbaseregionserver_connectTo(HBaseMaster newHbaseregionserver_connectTo) {
		HBaseMaster oldHbaseregionserver_connectTo = hbaseregionserver_connectTo;
		hbaseregionserver_connectTo = newHbaseregionserver_connectTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_CONNECT_TO, oldHbaseregionserver_connectTo, hbaseregionserver_connectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getHbaseregionserver_hostOn() {
		if (hbaseregionserver_hostOn != null && hbaseregionserver_hostOn.eIsProxy()) {
			InternalEObject oldHbaseregionserver_hostOn = (InternalEObject)hbaseregionserver_hostOn;
			hbaseregionserver_hostOn = (Server)eResolveProxy(oldHbaseregionserver_hostOn);
			if (hbaseregionserver_hostOn != oldHbaseregionserver_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_HOST_ON, oldHbaseregionserver_hostOn, hbaseregionserver_hostOn));
			}
		}
		return hbaseregionserver_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetHbaseregionserver_hostOn() {
		return hbaseregionserver_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbaseregionserver_hostOn(Server newHbaseregionserver_hostOn) {
		Server oldHbaseregionserver_hostOn = hbaseregionserver_hostOn;
		hbaseregionserver_hostOn = newHbaseregionserver_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_HOST_ON, oldHbaseregionserver_hostOn, hbaseregionserver_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_NAME:
				return getHbaseregionserver_name();
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_CONNECT_TO:
				if (resolve) return getHbaseregionserver_connectTo();
				return basicGetHbaseregionserver_connectTo();
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_HOST_ON:
				if (resolve) return getHbaseregionserver_hostOn();
				return basicGetHbaseregionserver_hostOn();
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
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_NAME:
				setHbaseregionserver_name((String)newValue);
				return;
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_CONNECT_TO:
				setHbaseregionserver_connectTo((HBaseMaster)newValue);
				return;
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_HOST_ON:
				setHbaseregionserver_hostOn((Server)newValue);
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
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_NAME:
				setHbaseregionserver_name(HBASEREGIONSERVER_NAME_EDEFAULT);
				return;
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_CONNECT_TO:
				setHbaseregionserver_connectTo((HBaseMaster)null);
				return;
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_HOST_ON:
				setHbaseregionserver_hostOn((Server)null);
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
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_NAME:
				return HBASEREGIONSERVER_NAME_EDEFAULT == null ? hbaseregionserver_name != null : !HBASEREGIONSERVER_NAME_EDEFAULT.equals(hbaseregionserver_name);
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_CONNECT_TO:
				return hbaseregionserver_connectTo != null;
			case HadoopmodelPackage.HBASE_REGION_SERVER__HBASEREGIONSERVER_HOST_ON:
				return hbaseregionserver_hostOn != null;
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
		result.append(" (hbaseregionserver_name: ");
		result.append(hbaseregionserver_name);
		result.append(')');
		return result.toString();
	}

} //HBaseRegionServerImpl
