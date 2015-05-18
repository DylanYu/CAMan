/**
 */
package hadoopmodel.impl;

import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.JobTracker;
import hadoopmodel.Server;
import hadoopmodel.TaskTracker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Tracker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.TaskTrackerImpl#getTasktracker_data_dir <em>Tasktracker data dir</em>}</li>
 *   <li>{@link hadoopmodel.impl.TaskTrackerImpl#getTasktracker_connectTo <em>Tasktracker connect To</em>}</li>
 *   <li>{@link hadoopmodel.impl.TaskTrackerImpl#getTasktracker_hostOn <em>Tasktracker host On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskTrackerImpl extends MinimalEObjectImpl.Container implements TaskTracker {
	/**
	 * The default value of the '{@link #getTasktracker_data_dir() <em>Tasktracker data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasktracker_data_dir()
	 * @generated
	 * @ordered
	 */
	protected static final String TASKTRACKER_DATA_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTasktracker_data_dir() <em>Tasktracker data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasktracker_data_dir()
	 * @generated
	 * @ordered
	 */
	protected String tasktracker_data_dir = TASKTRACKER_DATA_DIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasktracker_connectTo() <em>Tasktracker connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasktracker_connectTo()
	 * @generated
	 * @ordered
	 */
	protected JobTracker tasktracker_connectTo;

	/**
	 * The cached value of the '{@link #getTasktracker_hostOn() <em>Tasktracker host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasktracker_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server tasktracker_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTrackerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.TASK_TRACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTasktracker_data_dir() {
		return tasktracker_data_dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTasktracker_data_dir(String newTasktracker_data_dir) {
		String oldTasktracker_data_dir = tasktracker_data_dir;
		tasktracker_data_dir = newTasktracker_data_dir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_DATA_DIR, oldTasktracker_data_dir, tasktracker_data_dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobTracker getTasktracker_connectTo() {
		if (tasktracker_connectTo != null && tasktracker_connectTo.eIsProxy()) {
			InternalEObject oldTasktracker_connectTo = (InternalEObject)tasktracker_connectTo;
			tasktracker_connectTo = (JobTracker)eResolveProxy(oldTasktracker_connectTo);
			if (tasktracker_connectTo != oldTasktracker_connectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_CONNECT_TO, oldTasktracker_connectTo, tasktracker_connectTo));
			}
		}
		return tasktracker_connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobTracker basicGetTasktracker_connectTo() {
		return tasktracker_connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTasktracker_connectTo(JobTracker newTasktracker_connectTo) {
		JobTracker oldTasktracker_connectTo = tasktracker_connectTo;
		tasktracker_connectTo = newTasktracker_connectTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_CONNECT_TO, oldTasktracker_connectTo, tasktracker_connectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getTasktracker_hostOn() {
		if (tasktracker_hostOn != null && tasktracker_hostOn.eIsProxy()) {
			InternalEObject oldTasktracker_hostOn = (InternalEObject)tasktracker_hostOn;
			tasktracker_hostOn = (Server)eResolveProxy(oldTasktracker_hostOn);
			if (tasktracker_hostOn != oldTasktracker_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_HOST_ON, oldTasktracker_hostOn, tasktracker_hostOn));
			}
		}
		return tasktracker_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetTasktracker_hostOn() {
		return tasktracker_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTasktracker_hostOn(Server newTasktracker_hostOn) {
		Server oldTasktracker_hostOn = tasktracker_hostOn;
		tasktracker_hostOn = newTasktracker_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_HOST_ON, oldTasktracker_hostOn, tasktracker_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_DATA_DIR:
				return getTasktracker_data_dir();
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_CONNECT_TO:
				if (resolve) return getTasktracker_connectTo();
				return basicGetTasktracker_connectTo();
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_HOST_ON:
				if (resolve) return getTasktracker_hostOn();
				return basicGetTasktracker_hostOn();
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
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_DATA_DIR:
				setTasktracker_data_dir((String)newValue);
				return;
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_CONNECT_TO:
				setTasktracker_connectTo((JobTracker)newValue);
				return;
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_HOST_ON:
				setTasktracker_hostOn((Server)newValue);
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
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_DATA_DIR:
				setTasktracker_data_dir(TASKTRACKER_DATA_DIR_EDEFAULT);
				return;
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_CONNECT_TO:
				setTasktracker_connectTo((JobTracker)null);
				return;
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_HOST_ON:
				setTasktracker_hostOn((Server)null);
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
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_DATA_DIR:
				return TASKTRACKER_DATA_DIR_EDEFAULT == null ? tasktracker_data_dir != null : !TASKTRACKER_DATA_DIR_EDEFAULT.equals(tasktracker_data_dir);
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_CONNECT_TO:
				return tasktracker_connectTo != null;
			case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_HOST_ON:
				return tasktracker_hostOn != null;
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
		result.append(" (tasktracker_data_dir: ");
		result.append(tasktracker_data_dir);
		result.append(')');
		return result.toString();
	}

} //TaskTrackerImpl
