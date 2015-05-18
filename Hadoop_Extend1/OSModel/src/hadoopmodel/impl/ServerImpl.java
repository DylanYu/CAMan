/**
 */
package hadoopmodel.impl;

import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.Server;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.ServerImpl#getServer_name <em>Server name</em>}</li>
 *   <li>{@link hadoopmodel.impl.ServerImpl#getServer_id <em>Server id</em>}</li>
 *   <li>{@link hadoopmodel.impl.ServerImpl#getServer_status <em>Server status</em>}</li>
 *   <li>{@link hadoopmodel.impl.ServerImpl#getServer_adminpass <em>Server adminpass</em>}</li>
 *   <li>{@link hadoopmodel.impl.ServerImpl#getServer_host <em>Server host</em>}</li>
 *   <li>{@link hadoopmodel.impl.ServerImpl#getServer_vm_state <em>Server vm state</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerImpl extends MinimalEObjectImpl.Container implements Server {
	/**
	 * The default value of the '{@link #getServer_name() <em>Server name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_NAME_EDEFAULT = "vm";

	/**
	 * The cached value of the '{@link #getServer_name() <em>Server name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_name()
	 * @generated
	 * @ordered
	 */
	protected String server_name = SERVER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer_id() <em>Server id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServer_id() <em>Server id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_id()
	 * @generated
	 * @ordered
	 */
	protected String server_id = SERVER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer_status() <em>Server status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_status()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServer_status() <em>Server status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_status()
	 * @generated
	 * @ordered
	 */
	protected String server_status = SERVER_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer_adminpass() <em>Server adminpass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_adminpass()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_ADMINPASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServer_adminpass() <em>Server adminpass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_adminpass()
	 * @generated
	 * @ordered
	 */
	protected String server_adminpass = SERVER_ADMINPASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer_host() <em>Server host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_host()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServer_host() <em>Server host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_host()
	 * @generated
	 * @ordered
	 */
	protected String server_host = SERVER_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer_vm_state() <em>Server vm state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_vm_state()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_VM_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServer_vm_state() <em>Server vm state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_vm_state()
	 * @generated
	 * @ordered
	 */
	protected String server_vm_state = SERVER_VM_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer_name() {
		return server_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_name(String newServer_name) {
		String oldServer_name = server_name;
		server_name = newServer_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.SERVER__SERVER_NAME, oldServer_name, server_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer_id() {
		return server_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_id(String newServer_id) {
		String oldServer_id = server_id;
		server_id = newServer_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.SERVER__SERVER_ID, oldServer_id, server_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer_status() {
		return server_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_status(String newServer_status) {
		String oldServer_status = server_status;
		server_status = newServer_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.SERVER__SERVER_STATUS, oldServer_status, server_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer_adminpass() {
		return server_adminpass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_adminpass(String newServer_adminpass) {
		String oldServer_adminpass = server_adminpass;
		server_adminpass = newServer_adminpass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.SERVER__SERVER_ADMINPASS, oldServer_adminpass, server_adminpass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer_host() {
		return server_host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_host(String newServer_host) {
		String oldServer_host = server_host;
		server_host = newServer_host;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.SERVER__SERVER_HOST, oldServer_host, server_host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer_vm_state() {
		return server_vm_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_vm_state(String newServer_vm_state) {
		String oldServer_vm_state = server_vm_state;
		server_vm_state = newServer_vm_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.SERVER__SERVER_VM_STATE, oldServer_vm_state, server_vm_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.SERVER__SERVER_NAME:
				return getServer_name();
			case HadoopmodelPackage.SERVER__SERVER_ID:
				return getServer_id();
			case HadoopmodelPackage.SERVER__SERVER_STATUS:
				return getServer_status();
			case HadoopmodelPackage.SERVER__SERVER_ADMINPASS:
				return getServer_adminpass();
			case HadoopmodelPackage.SERVER__SERVER_HOST:
				return getServer_host();
			case HadoopmodelPackage.SERVER__SERVER_VM_STATE:
				return getServer_vm_state();
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
			case HadoopmodelPackage.SERVER__SERVER_NAME:
				setServer_name((String)newValue);
				return;
			case HadoopmodelPackage.SERVER__SERVER_ID:
				setServer_id((String)newValue);
				return;
			case HadoopmodelPackage.SERVER__SERVER_STATUS:
				setServer_status((String)newValue);
				return;
			case HadoopmodelPackage.SERVER__SERVER_ADMINPASS:
				setServer_adminpass((String)newValue);
				return;
			case HadoopmodelPackage.SERVER__SERVER_HOST:
				setServer_host((String)newValue);
				return;
			case HadoopmodelPackage.SERVER__SERVER_VM_STATE:
				setServer_vm_state((String)newValue);
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
			case HadoopmodelPackage.SERVER__SERVER_NAME:
				setServer_name(SERVER_NAME_EDEFAULT);
				return;
			case HadoopmodelPackage.SERVER__SERVER_ID:
				setServer_id(SERVER_ID_EDEFAULT);
				return;
			case HadoopmodelPackage.SERVER__SERVER_STATUS:
				setServer_status(SERVER_STATUS_EDEFAULT);
				return;
			case HadoopmodelPackage.SERVER__SERVER_ADMINPASS:
				setServer_adminpass(SERVER_ADMINPASS_EDEFAULT);
				return;
			case HadoopmodelPackage.SERVER__SERVER_HOST:
				setServer_host(SERVER_HOST_EDEFAULT);
				return;
			case HadoopmodelPackage.SERVER__SERVER_VM_STATE:
				setServer_vm_state(SERVER_VM_STATE_EDEFAULT);
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
			case HadoopmodelPackage.SERVER__SERVER_NAME:
				return SERVER_NAME_EDEFAULT == null ? server_name != null : !SERVER_NAME_EDEFAULT.equals(server_name);
			case HadoopmodelPackage.SERVER__SERVER_ID:
				return SERVER_ID_EDEFAULT == null ? server_id != null : !SERVER_ID_EDEFAULT.equals(server_id);
			case HadoopmodelPackage.SERVER__SERVER_STATUS:
				return SERVER_STATUS_EDEFAULT == null ? server_status != null : !SERVER_STATUS_EDEFAULT.equals(server_status);
			case HadoopmodelPackage.SERVER__SERVER_ADMINPASS:
				return SERVER_ADMINPASS_EDEFAULT == null ? server_adminpass != null : !SERVER_ADMINPASS_EDEFAULT.equals(server_adminpass);
			case HadoopmodelPackage.SERVER__SERVER_HOST:
				return SERVER_HOST_EDEFAULT == null ? server_host != null : !SERVER_HOST_EDEFAULT.equals(server_host);
			case HadoopmodelPackage.SERVER__SERVER_VM_STATE:
				return SERVER_VM_STATE_EDEFAULT == null ? server_vm_state != null : !SERVER_VM_STATE_EDEFAULT.equals(server_vm_state);
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
		result.append(" (server_name: ");
		result.append(server_name);
		result.append(", server_id: ");
		result.append(server_id);
		result.append(", server_status: ");
		result.append(server_status);
		result.append(", server_adminpass: ");
		result.append(server_adminpass);
		result.append(", server_host: ");
		result.append(server_host);
		result.append(", server_vm_state: ");
		result.append(server_vm_state);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
