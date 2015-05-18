/**
 */
package hadoopmodel.impl;

import hadoopmodel.HDFSDataNode;
import hadoopmodel.HDFSNameNode;
import hadoopmodel.HadoopCluster;
import hadoopmodel.HadoopMaster;
import hadoopmodel.HadoopSlave;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.JobTracker;
import hadoopmodel.Server;
import hadoopmodel.TaskTracker;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hadoop Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getHdfsdatanode_data_dir <em>Hdfsdatanode data dir</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getHdfsdatanode_connectTo <em>Hdfsdatanode connect To</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getHdfsdatanode_hostOn <em>Hdfsdatanode host On</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getTasktracker_data_dir <em>Tasktracker data dir</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getTasktracker_connectTo <em>Tasktracker connect To</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getTasktracker_hostOn <em>Tasktracker host On</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getHadoopslave_connectTo <em>Hadoopslave connect To</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getHadoopslave_hostOn <em>Hadoopslave host On</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getHadoopcluster_master_hostOn <em>Hadoopcluster master host On</em>}</li>
 *   <li>{@link hadoopmodel.impl.HadoopClusterImpl#getHadoopcluster_slave_hostOn <em>Hadoopcluster slave host On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HadoopClusterImpl extends HadoopMasterImpl implements HadoopCluster {
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
	 * The cached value of the '{@link #getHadoopslave_connectTo() <em>Hadoopslave connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHadoopslave_connectTo()
	 * @generated
	 * @ordered
	 */
	protected HadoopMaster hadoopslave_connectTo;

	/**
	 * The cached value of the '{@link #getHadoopslave_hostOn() <em>Hadoopslave host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHadoopslave_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server hadoopslave_hostOn;

	/**
	 * The cached value of the '{@link #getHadoopcluster_master_hostOn() <em>Hadoopcluster master host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHadoopcluster_master_hostOn()
	 * @generated
	 * @ordered
	 */
	protected Server hadoopcluster_master_hostOn;

	/**
	 * The cached value of the '{@link #getHadoopcluster_slave_hostOn() <em>Hadoopcluster slave host On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHadoopcluster_slave_hostOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> hadoopcluster_slave_hostOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HadoopClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.HADOOP_CLUSTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_DATA_DIR, oldHdfsdatanode_data_dir, hdfsdatanode_data_dir));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_CONNECT_TO, oldHdfsdatanode_connectTo, hdfsdatanode_connectTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_CONNECT_TO, oldHdfsdatanode_connectTo, hdfsdatanode_connectTo));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_HOST_ON, oldHdfsdatanode_hostOn, hdfsdatanode_hostOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_HOST_ON, oldHdfsdatanode_hostOn, hdfsdatanode_hostOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_DATA_DIR, oldTasktracker_data_dir, tasktracker_data_dir));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_CONNECT_TO, oldTasktracker_connectTo, tasktracker_connectTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_CONNECT_TO, oldTasktracker_connectTo, tasktracker_connectTo));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_HOST_ON, oldTasktracker_hostOn, tasktracker_hostOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_HOST_ON, oldTasktracker_hostOn, tasktracker_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopMaster getHadoopslave_connectTo() {
		if (hadoopslave_connectTo != null && hadoopslave_connectTo.eIsProxy()) {
			InternalEObject oldHadoopslave_connectTo = (InternalEObject)hadoopslave_connectTo;
			hadoopslave_connectTo = (HadoopMaster)eResolveProxy(oldHadoopslave_connectTo);
			if (hadoopslave_connectTo != oldHadoopslave_connectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_CONNECT_TO, oldHadoopslave_connectTo, hadoopslave_connectTo));
			}
		}
		return hadoopslave_connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopMaster basicGetHadoopslave_connectTo() {
		return hadoopslave_connectTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHadoopslave_connectTo(HadoopMaster newHadoopslave_connectTo) {
		HadoopMaster oldHadoopslave_connectTo = hadoopslave_connectTo;
		hadoopslave_connectTo = newHadoopslave_connectTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_CONNECT_TO, oldHadoopslave_connectTo, hadoopslave_connectTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getHadoopslave_hostOn() {
		if (hadoopslave_hostOn != null && hadoopslave_hostOn.eIsProxy()) {
			InternalEObject oldHadoopslave_hostOn = (InternalEObject)hadoopslave_hostOn;
			hadoopslave_hostOn = (Server)eResolveProxy(oldHadoopslave_hostOn);
			if (hadoopslave_hostOn != oldHadoopslave_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_HOST_ON, oldHadoopslave_hostOn, hadoopslave_hostOn));
			}
		}
		return hadoopslave_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetHadoopslave_hostOn() {
		return hadoopslave_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHadoopslave_hostOn(Server newHadoopslave_hostOn) {
		Server oldHadoopslave_hostOn = hadoopslave_hostOn;
		hadoopslave_hostOn = newHadoopslave_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_HOST_ON, oldHadoopslave_hostOn, hadoopslave_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getHadoopcluster_master_hostOn() {
		if (hadoopcluster_master_hostOn != null && hadoopcluster_master_hostOn.eIsProxy()) {
			InternalEObject oldHadoopcluster_master_hostOn = (InternalEObject)hadoopcluster_master_hostOn;
			hadoopcluster_master_hostOn = (Server)eResolveProxy(oldHadoopcluster_master_hostOn);
			if (hadoopcluster_master_hostOn != oldHadoopcluster_master_hostOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_MASTER_HOST_ON, oldHadoopcluster_master_hostOn, hadoopcluster_master_hostOn));
			}
		}
		return hadoopcluster_master_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetHadoopcluster_master_hostOn() {
		return hadoopcluster_master_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHadoopcluster_master_hostOn(Server newHadoopcluster_master_hostOn) {
		Server oldHadoopcluster_master_hostOn = hadoopcluster_master_hostOn;
		hadoopcluster_master_hostOn = newHadoopcluster_master_hostOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_MASTER_HOST_ON, oldHadoopcluster_master_hostOn, hadoopcluster_master_hostOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Server> getHadoopcluster_slave_hostOn() {
		if (hadoopcluster_slave_hostOn == null) {
			hadoopcluster_slave_hostOn = new EObjectResolvingEList<Server>(Server.class, this, HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_SLAVE_HOST_ON);
		}
		return hadoopcluster_slave_hostOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_DATA_DIR:
				return getHdfsdatanode_data_dir();
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_CONNECT_TO:
				if (resolve) return getHdfsdatanode_connectTo();
				return basicGetHdfsdatanode_connectTo();
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_HOST_ON:
				if (resolve) return getHdfsdatanode_hostOn();
				return basicGetHdfsdatanode_hostOn();
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_DATA_DIR:
				return getTasktracker_data_dir();
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_CONNECT_TO:
				if (resolve) return getTasktracker_connectTo();
				return basicGetTasktracker_connectTo();
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_HOST_ON:
				if (resolve) return getTasktracker_hostOn();
				return basicGetTasktracker_hostOn();
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_CONNECT_TO:
				if (resolve) return getHadoopslave_connectTo();
				return basicGetHadoopslave_connectTo();
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_HOST_ON:
				if (resolve) return getHadoopslave_hostOn();
				return basicGetHadoopslave_hostOn();
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_MASTER_HOST_ON:
				if (resolve) return getHadoopcluster_master_hostOn();
				return basicGetHadoopcluster_master_hostOn();
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_SLAVE_HOST_ON:
				return getHadoopcluster_slave_hostOn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_DATA_DIR:
				setHdfsdatanode_data_dir((String)newValue);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_CONNECT_TO:
				setHdfsdatanode_connectTo((HDFSNameNode)newValue);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_HOST_ON:
				setHdfsdatanode_hostOn((Server)newValue);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_DATA_DIR:
				setTasktracker_data_dir((String)newValue);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_CONNECT_TO:
				setTasktracker_connectTo((JobTracker)newValue);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_HOST_ON:
				setTasktracker_hostOn((Server)newValue);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_CONNECT_TO:
				setHadoopslave_connectTo((HadoopMaster)newValue);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_HOST_ON:
				setHadoopslave_hostOn((Server)newValue);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_MASTER_HOST_ON:
				setHadoopcluster_master_hostOn((Server)newValue);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_SLAVE_HOST_ON:
				getHadoopcluster_slave_hostOn().clear();
				getHadoopcluster_slave_hostOn().addAll((Collection<? extends Server>)newValue);
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
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_DATA_DIR:
				setHdfsdatanode_data_dir(HDFSDATANODE_DATA_DIR_EDEFAULT);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_CONNECT_TO:
				setHdfsdatanode_connectTo((HDFSNameNode)null);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_HOST_ON:
				setHdfsdatanode_hostOn((Server)null);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_DATA_DIR:
				setTasktracker_data_dir(TASKTRACKER_DATA_DIR_EDEFAULT);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_CONNECT_TO:
				setTasktracker_connectTo((JobTracker)null);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_HOST_ON:
				setTasktracker_hostOn((Server)null);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_CONNECT_TO:
				setHadoopslave_connectTo((HadoopMaster)null);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_HOST_ON:
				setHadoopslave_hostOn((Server)null);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_MASTER_HOST_ON:
				setHadoopcluster_master_hostOn((Server)null);
				return;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_SLAVE_HOST_ON:
				getHadoopcluster_slave_hostOn().clear();
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
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_DATA_DIR:
				return HDFSDATANODE_DATA_DIR_EDEFAULT == null ? hdfsdatanode_data_dir != null : !HDFSDATANODE_DATA_DIR_EDEFAULT.equals(hdfsdatanode_data_dir);
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_CONNECT_TO:
				return hdfsdatanode_connectTo != null;
			case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_HOST_ON:
				return hdfsdatanode_hostOn != null;
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_DATA_DIR:
				return TASKTRACKER_DATA_DIR_EDEFAULT == null ? tasktracker_data_dir != null : !TASKTRACKER_DATA_DIR_EDEFAULT.equals(tasktracker_data_dir);
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_CONNECT_TO:
				return tasktracker_connectTo != null;
			case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_HOST_ON:
				return tasktracker_hostOn != null;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_CONNECT_TO:
				return hadoopslave_connectTo != null;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_HOST_ON:
				return hadoopslave_hostOn != null;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_MASTER_HOST_ON:
				return hadoopcluster_master_hostOn != null;
			case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPCLUSTER_SLAVE_HOST_ON:
				return hadoopcluster_slave_hostOn != null && !hadoopcluster_slave_hostOn.isEmpty();
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
		if (baseClass == HDFSDataNode.class) {
			switch (derivedFeatureID) {
				case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_DATA_DIR: return HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR;
				case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_CONNECT_TO: return HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO;
				case HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_HOST_ON: return HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_HOST_ON;
				default: return -1;
			}
		}
		if (baseClass == TaskTracker.class) {
			switch (derivedFeatureID) {
				case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_DATA_DIR: return HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_DATA_DIR;
				case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_CONNECT_TO: return HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_CONNECT_TO;
				case HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_HOST_ON: return HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_HOST_ON;
				default: return -1;
			}
		}
		if (baseClass == HadoopSlave.class) {
			switch (derivedFeatureID) {
				case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_CONNECT_TO: return HadoopmodelPackage.HADOOP_SLAVE__HADOOPSLAVE_CONNECT_TO;
				case HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_HOST_ON: return HadoopmodelPackage.HADOOP_SLAVE__HADOOPSLAVE_HOST_ON;
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
		if (baseClass == HDFSDataNode.class) {
			switch (baseFeatureID) {
				case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR: return HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_DATA_DIR;
				case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO: return HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_CONNECT_TO;
				case HadoopmodelPackage.HDFS_DATA_NODE__HDFSDATANODE_HOST_ON: return HadoopmodelPackage.HADOOP_CLUSTER__HDFSDATANODE_HOST_ON;
				default: return -1;
			}
		}
		if (baseClass == TaskTracker.class) {
			switch (baseFeatureID) {
				case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_DATA_DIR: return HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_DATA_DIR;
				case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_CONNECT_TO: return HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_CONNECT_TO;
				case HadoopmodelPackage.TASK_TRACKER__TASKTRACKER_HOST_ON: return HadoopmodelPackage.HADOOP_CLUSTER__TASKTRACKER_HOST_ON;
				default: return -1;
			}
		}
		if (baseClass == HadoopSlave.class) {
			switch (baseFeatureID) {
				case HadoopmodelPackage.HADOOP_SLAVE__HADOOPSLAVE_CONNECT_TO: return HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_CONNECT_TO;
				case HadoopmodelPackage.HADOOP_SLAVE__HADOOPSLAVE_HOST_ON: return HadoopmodelPackage.HADOOP_CLUSTER__HADOOPSLAVE_HOST_ON;
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
		result.append(" (hdfsdatanode_data_dir: ");
		result.append(hdfsdatanode_data_dir);
		result.append(", tasktracker_data_dir: ");
		result.append(tasktracker_data_dir);
		result.append(')');
		return result.toString();
	}

} //HadoopClusterImpl
