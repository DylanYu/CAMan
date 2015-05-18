/**
 */
package hadoopmodel.impl;

import hadoopmodel.HDFSNameNode;
import hadoopmodel.HadoopMaster;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.JobTracker;
import hadoopmodel.Server;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hadoop Master</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.HadoopMasterImpl#getHdfsnamenode_data_dir <em>Hdfsnamenode data dir</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopMasterImpl#getHdfsnamenode_hostOn <em>Hdfsnamenode host On</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopMasterImpl#getJobtracker_data_dir <em>Jobtracker data dir</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopMasterImpl#getJobtracker_dependOn <em>Jobtracker depend On</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopMasterImpl#getJobtracker_hostOn <em>Jobtracker host On</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopMasterImpl#getHadoopmaster_hostOn <em>Hadoopmaster host On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HadoopMasterImpl extends JavaImpl implements HadoopMaster {
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
	 * The cached value of the '{@link #getHadoopmaster_hostOn() <em>Hadoopmaster host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHadoopmaster_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server hadoopmaster_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HadoopMasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.HADOOP_MASTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_DATA_DIR, oldHdfsnamenode_data_dir, hdfsnamenode_data_dir));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_HOST_ON, oldHdfsnamenode_hostOn, hdfsnamenode_hostOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_HOST_ON, oldHdfsnamenode_hostOn, hdfsnamenode_hostOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DATA_DIR, oldJobtracker_data_dir, jobtracker_data_dir));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DEPEND_ON, oldJobtracker_dependOn, jobtracker_dependOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DEPEND_ON, oldJobtracker_dependOn, jobtracker_dependOn));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_HOST_ON, oldJobtracker_hostOn, jobtracker_hostOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_HOST_ON, oldJobtracker_hostOn, jobtracker_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getHadoopmaster_hostOn() {
		if (hadoopmaster_hostOn != null && hadoopmaster_hostOn.eIsProxy()) {
			InternalEObject oldHadoopmaster_hostOn = (InternalEObject)hadoopmaster_hostOn;
			hadoopmaster_hostOn = (Server)eResolveProxy(oldHadoopmaster_hostOn);
			if (hadoopmaster_hostOn != oldHadoopmaster_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_MASTER__HADOOPMASTER_HOST_ON, oldHadoopmaster_hostOn, hadoopmaster_hostOn));
			}
		}
		return hadoopmaster_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetHadoopmaster_hostOn() {
		return hadoopmaster_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHadoopmaster_hostOn(Server newHadoopmaster_hostOn) {
		Server oldHadoopmaster_hostOn = hadoopmaster_hostOn;
		hadoopmaster_hostOn = newHadoopmaster_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_MASTER__HADOOPMASTER_HOST_ON, oldHadoopmaster_hostOn, hadoopmaster_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_DATA_DIR:
				return getHdfsnamenode_data_dir();
			case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_HOST_ON:
				if (resolve) return getHdfsnamenode_hostOn();
				return basicGetHdfsnamenode_hostOn();
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DATA_DIR:
				return getJobtracker_data_dir();
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DEPEND_ON:
				if (resolve) return getJobtracker_dependOn();
				return basicGetJobtracker_dependOn();
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_HOST_ON:
				if (resolve) return getJobtracker_hostOn();
				return basicGetJobtracker_hostOn();
			case HadoopmodelPackage.HADOOP_MASTER__HADOOPMASTER_HOST_ON:
				if (resolve) return getHadoopmaster_hostOn();
				return basicGetHadoopmaster_hostOn();
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
			case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_DATA_DIR:
				setHdfsnamenode_data_dir((String)newValue);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_HOST_ON:
				setHdfsnamenode_hostOn((Server)newValue);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DATA_DIR:
				setJobtracker_data_dir((String)newValue);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DEPEND_ON:
				setJobtracker_dependOn((HDFSNameNode)newValue);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_HOST_ON:
				setJobtracker_hostOn((Server)newValue);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__HADOOPMASTER_HOST_ON:
				setHadoopmaster_hostOn((Server)newValue);
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
			case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_DATA_DIR:
				setHdfsnamenode_data_dir(HDFSNAMENODE_DATA_DIR_EDEFAULT);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_HOST_ON:
				setHdfsnamenode_hostOn((Server)null);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DATA_DIR:
				setJobtracker_data_dir(JOBTRACKER_DATA_DIR_EDEFAULT);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DEPEND_ON:
				setJobtracker_dependOn((HDFSNameNode)null);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_HOST_ON:
				setJobtracker_hostOn((Server)null);
				return;
			case HadoopmodelPackage.HADOOP_MASTER__HADOOPMASTER_HOST_ON:
				setHadoopmaster_hostOn((Server)null);
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
			case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_DATA_DIR:
				return HDFSNAMENODE_DATA_DIR_EDEFAULT == null ? hdfsnamenode_data_dir != null : !HDFSNAMENODE_DATA_DIR_EDEFAULT.equals(hdfsnamenode_data_dir);
			case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_HOST_ON:
				return hdfsnamenode_hostOn != null;
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DATA_DIR:
				return JOBTRACKER_DATA_DIR_EDEFAULT == null ? jobtracker_data_dir != null : !JOBTRACKER_DATA_DIR_EDEFAULT.equals(jobtracker_data_dir);
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DEPEND_ON:
				return jobtracker_dependOn != null;
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_HOST_ON:
				return jobtracker_hostOn != null;
			case HadoopmodelPackage.HADOOP_MASTER__HADOOPMASTER_HOST_ON:
				return hadoopmaster_hostOn != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HDFSNameNode.class) {
			switch (derivedFeatureID) {
				case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_DATA_DIR: return HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR;
				case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_HOST_ON: return HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON;
				default: return -1;
			}
		}
		if (baseClass == JobTracker.class) {
			switch (derivedFeatureID) {
				case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DATA_DIR: return HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DATA_DIR;
				case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DEPEND_ON: return HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DEPEND_ON;
				case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_HOST_ON: return HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_HOST_ON;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HDFSNameNode.class) {
			switch (baseFeatureID) {
				case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR: return HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_DATA_DIR;
				case HadoopmodelPackage.HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON: return HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_HOST_ON;
				default: return -1;
			}
		}
		if (baseClass == JobTracker.class) {
			switch (baseFeatureID) {
				case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DATA_DIR: return HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DATA_DIR;
				case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_DEPEND_ON: return HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DEPEND_ON;
				case HadoopmodelPackage.JOB_TRACKER__JOBTRACKER_HOST_ON: return HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_HOST_ON;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", jobtracker_data_dir: ");
		result.append(jobtracker_data_dir);
		result.append(')');
		return result.toString();
	}

} //HadoopMasterImpl
