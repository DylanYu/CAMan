/**
 */
package hadoopmodel.impl;

import hadoopmodel.HDFSNameNode;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.JobTracker;
import hadoopmodel.Server;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Tracker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.JobTrackerImpl#getJobtracker_data_dir <em>Jobtracker data dir</em>}</li>
 *   <li>{@link hadoopmodel.impl.JobTrackerImpl#getJobtracker_dependOn <em>Jobtracker depend On</em>}</li>
 *   <li>{@link hadoopmodel.impl.JobTrackerImpl#getJobtracker_hostOn <em>Jobtracker host On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobTrackerImpl extends MinimalEObjectImpl.Container implements JobTracker {
	/**
	 * The default value of the '{@link #getJobtracker_data_dir() <em>Jobtracker data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobtracker_data_dir()
	 * @generated
	 * @ordered
	 */
	protected static final String JOBTRACKER_DATA_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobtracker_data_dir() <em>Jobtracker data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobtracker_data_dir()
	 * @generated
	 * @ordered
	 */
	protected String jobtracker_data_dir = JOBTRACKER_DATA_DIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJobtracker_dependOn() <em>Jobtracker depend On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobtracker_dependOn()
	 * @generated
	 * @ordered
	 */
	protected HDFSNameNode jobtracker_dependOn;

	/**
	 * The cached value of the '{@link #getJobtracker_hostOn() <em>Jobtracker host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobtracker_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server jobtracker_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobTrackerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.JOB_TRACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobtracker_data_dir() {
		return jobtracker_data_dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobtracker_data_dir(String newJobtracker_data_dir) {
		String oldJobtracker_data_dir = jobtracker_data_dir;
		jobtracker_data_dir = newJobtracker_data_dir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DATA_DIR, oldJobtracker_data_dir, jobtracker_data_dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSNameNode getJobtracker_dependOn() {
		if (jobtracker_dependOn != null && jobtracker_dependOn.eIsProxy()) {
			InternalEObject oldJobtracker_dependOn = (InternalEObject)jobtracker_dependOn;
			jobtracker_dependOn = (HDFSNameNode)eResolveProxy(oldJobtracker_dependOn);
			if (jobtracker_dependOn != oldJobtracker_dependOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DEPEND_ON, oldJobtracker_dependOn, jobtracker_dependOn));
			}
		}
		return jobtracker_dependOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSNameNode basicGetJobtracker_dependOn() {
		return jobtracker_dependOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobtracker_dependOn(HDFSNameNode newJobtracker_dependOn) {
		HDFSNameNode oldJobtracker_dependOn = jobtracker_dependOn;
		jobtracker_dependOn = newJobtracker_dependOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DEPEND_ON, oldJobtracker_dependOn, jobtracker_dependOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getJobtracker_hostOn() {
		if (jobtracker_hostOn != null && jobtracker_hostOn.eIsProxy()) {
			InternalEObject oldJobtracker_hostOn = (InternalEObject)jobtracker_hostOn;
			jobtracker_hostOn = (Server)eResolveProxy(oldJobtracker_hostOn);
			if (jobtracker_hostOn != oldJobtracker_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_HOST_ON, oldJobtracker_hostOn, jobtracker_hostOn));
			}
		}
		return jobtracker_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetJobtracker_hostOn() {
		return jobtracker_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobtracker_hostOn(Server newJobtracker_hostOn) {
		Server oldJobtracker_hostOn = jobtracker_hostOn;
		jobtracker_hostOn = newJobtracker_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_HOST_ON, oldJobtracker_hostOn, jobtracker_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DATA_DIR:
				return getJobtracker_data_dir();
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DEPEND_ON:
				if (resolve) return getJobtracker_dependOn();
				return basicGetJobtracker_dependOn();
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_HOST_ON:
				if (resolve) return getJobtracker_hostOn();
				return basicGetJobtracker_hostOn();
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
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DATA_DIR:
				setJobtracker_data_dir((String)newValue);
				return;
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DEPEND_ON:
				setJobtracker_dependOn((HDFSNameNode)newValue);
				return;
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_HOST_ON:
				setJobtracker_hostOn((Server)newValue);
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
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DATA_DIR:
				setJobtracker_data_dir(JOBTRACKER_DATA_DIR_EDEFAULT);
				return;
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DEPEND_ON:
				setJobtracker_dependOn((HDFSNameNode)null);
				return;
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_HOST_ON:
				setJobtracker_hostOn((Server)null);
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
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DATA_DIR:
				return JOBTRACKER_DATA_DIR_EDEFAULT == null ? jobtracker_data_dir != null : !JOBTRACKER_DATA_DIR_EDEFAULT.equals(jobtracker_data_dir);
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DEPEND_ON:
				return jobtracker_dependOn != null;
			case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_HOST_ON:
				return jobtracker_hostOn != null;
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
		result.append(" (jobtracker_data_dir: ");
		result.append(jobtracker_data_dir);
		result.append(')');
		return result.toString();
	}

} //JobTrackerImpl
