/**
 */
package hadoopmodel.impl;

import hadoopmodel.Cloud;
import hadoopmodel.HBaseMaster;
import hadoopmodel.HBaseRegionServer;
import hadoopmodel.HDFSDataNode;
import hadoopmodel.HDFSNameNode;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.Java;
import hadoopmodel.JobTracker;
import hadoopmodel.Server;
import hadoopmodel.TaskTracker;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getCloud_name <em>Cloud name</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getCloud_owner <em>Cloud owner</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getCloud_description <em>Cloud description</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getServer <em>Server</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getJava <em>Java</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getJobtracker <em>Jobtracker</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getTasktracker <em>Tasktracker</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getHdfsnamenode <em>Hdfsnamenode</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getHdfsdatanode <em>Hdfsdatanode</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getHbasemaster <em>Hbasemaster</em>}</li>
 *   <li>{@link hadoopmodel.impl.CloudImpl#getHbaseregionserver <em>Hbaseregionserver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudImpl extends MinimalEObjectImpl.Container implements Cloud {
	/**
	 * The default value of the '{@link #getCloud_name() <em>Cloud name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud_name()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUD_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCloud_name() <em>Cloud name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud_name()
	 * @generated
	 * @ordered
	 */
	protected String cloud_name = CLOUD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloud_owner() <em>Cloud owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud_owner()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUD_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloud_owner() <em>Cloud owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud_owner()
	 * @generated
	 * @ordered
	 */
	protected String cloud_owner = CLOUD_OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloud_description() <em>Cloud description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud_description()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUD_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloud_description() <em>Cloud description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud_description()
	 * @generated
	 * @ordered
	 */
	protected String cloud_description = CLOUD_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> server;

	/**
	 * The cached value of the '{@link #getJava() <em>Java</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJava()
	 * @generated
	 * @ordered
	 */
	protected EList<Java> java;

	/**
	 * The cached value of the '{@link #getJobtracker() <em>Jobtracker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobtracker()
	 * @generated
	 * @ordered
	 */
	protected EList<JobTracker> jobtracker;

	/**
	 * The cached value of the '{@link #getTasktracker() <em>Tasktracker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasktracker()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskTracker> tasktracker;

	/**
	 * The cached value of the '{@link #getHdfsnamenode() <em>Hdfsnamenode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsnamenode()
	 * @generated
	 * @ordered
	 */
	protected EList<HDFSNameNode> hdfsnamenode;

	/**
	 * The cached value of the '{@link #getHdfsdatanode() <em>Hdfsdatanode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsdatanode()
	 * @generated
	 * @ordered
	 */
	protected EList<HDFSDataNode> hdfsdatanode;

	/**
	 * The cached value of the '{@link #getHbasemaster() <em>Hbasemaster</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbasemaster()
	 * @generated
	 * @ordered
	 */
	protected EList<HBaseMaster> hbasemaster;

	/**
	 * The cached value of the '{@link #getHbaseregionserver() <em>Hbaseregionserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbaseregionserver()
	 * @generated
	 * @ordered
	 */
	protected EList<HBaseRegionServer> hbaseregionserver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopmodelPackage.Literals.CLOUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloud_name() {
		return cloud_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloud_name(String newCloud_name) {
		String oldCloud_name = cloud_name;
		cloud_name = newCloud_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.CLOUD__CLOUD_NAME, oldCloud_name, cloud_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloud_owner() {
		return cloud_owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloud_owner(String newCloud_owner) {
		String oldCloud_owner = cloud_owner;
		cloud_owner = newCloud_owner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.CLOUD__CLOUD_OWNER, oldCloud_owner, cloud_owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloud_description() {
		return cloud_description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloud_description(String newCloud_description) {
		String oldCloud_description = cloud_description;
		cloud_description = newCloud_description;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopmodelPackage.CLOUD__CLOUD_DESCRIPTION, oldCloud_description, cloud_description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Server> getServer() {
		if (server == null) {
			server = new EObjectContainmentEList<Server>(Server.class, this, HadoopmodelPackage.CLOUD__SERVER);
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Java> getJava() {
		if (java == null) {
			java = new EObjectContainmentEList<Java>(Java.class, this, HadoopmodelPackage.CLOUD__JAVA);
		}
		return java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobTracker> getJobtracker() {
		if (jobtracker == null) {
			jobtracker = new EObjectContainmentEList<JobTracker>(JobTracker.class, this, HadoopmodelPackage.CLOUD__JOBTRACKER);
		}
		return jobtracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskTracker> getTasktracker() {
		if (tasktracker == null) {
			tasktracker = new EObjectContainmentEList<TaskTracker>(TaskTracker.class, this, HadoopmodelPackage.CLOUD__TASKTRACKER);
		}
		return tasktracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HDFSNameNode> getHdfsnamenode() {
		if (hdfsnamenode == null) {
			hdfsnamenode = new EObjectContainmentEList<HDFSNameNode>(HDFSNameNode.class, this, HadoopmodelPackage.CLOUD__HDFSNAMENODE);
		}
		return hdfsnamenode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HDFSDataNode> getHdfsdatanode() {
		if (hdfsdatanode == null) {
			hdfsdatanode = new EObjectContainmentEList<HDFSDataNode>(HDFSDataNode.class, this, HadoopmodelPackage.CLOUD__HDFSDATANODE);
		}
		return hdfsdatanode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HBaseMaster> getHbasemaster() {
		if (hbasemaster == null) {
			hbasemaster = new EObjectContainmentEList<HBaseMaster>(HBaseMaster.class, this, HadoopmodelPackage.CLOUD__HBASEMASTER);
		}
		return hbasemaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HBaseRegionServer> getHbaseregionserver() {
		if (hbaseregionserver == null) {
			hbaseregionserver = new EObjectContainmentEList<HBaseRegionServer>(HBaseRegionServer.class, this, HadoopmodelPackage.CLOUD__HBASEREGIONSERVER);
		}
		return hbaseregionserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HadoopmodelPackage.CLOUD__SERVER:
				return ((InternalEList<?>)getServer()).basicRemove(otherEnd, msgs);
			case HadoopmodelPackage.CLOUD__JAVA:
				return ((InternalEList<?>)getJava()).basicRemove(otherEnd, msgs);
			case HadoopmodelPackage.CLOUD__JOBTRACKER:
				return ((InternalEList<?>)getJobtracker()).basicRemove(otherEnd, msgs);
			case HadoopmodelPackage.CLOUD__TASKTRACKER:
				return ((InternalEList<?>)getTasktracker()).basicRemove(otherEnd, msgs);
			case HadoopmodelPackage.CLOUD__HDFSNAMENODE:
				return ((InternalEList<?>)getHdfsnamenode()).basicRemove(otherEnd, msgs);
			case HadoopmodelPackage.CLOUD__HDFSDATANODE:
				return ((InternalEList<?>)getHdfsdatanode()).basicRemove(otherEnd, msgs);
			case HadoopmodelPackage.CLOUD__HBASEMASTER:
				return ((InternalEList<?>)getHbasemaster()).basicRemove(otherEnd, msgs);
			case HadoopmodelPackage.CLOUD__HBASEREGIONSERVER:
				return ((InternalEList<?>)getHbaseregionserver()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopmodelPackage.CLOUD__CLOUD_NAME:
				return getCloud_name();
			case HadoopmodelPackage.CLOUD__CLOUD_OWNER:
				return getCloud_owner();
			case HadoopmodelPackage.CLOUD__CLOUD_DESCRIPTION:
				return getCloud_description();
			case HadoopmodelPackage.CLOUD__SERVER:
				return getServer();
			case HadoopmodelPackage.CLOUD__JAVA:
				return getJava();
			case HadoopmodelPackage.CLOUD__JOBTRACKER:
				return getJobtracker();
			case HadoopmodelPackage.CLOUD__TASKTRACKER:
				return getTasktracker();
			case HadoopmodelPackage.CLOUD__HDFSNAMENODE:
				return getHdfsnamenode();
			case HadoopmodelPackage.CLOUD__HDFSDATANODE:
				return getHdfsdatanode();
			case HadoopmodelPackage.CLOUD__HBASEMASTER:
				return getHbasemaster();
			case HadoopmodelPackage.CLOUD__HBASEREGIONSERVER:
				return getHbaseregionserver();
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
			case HadoopmodelPackage.CLOUD__CLOUD_NAME:
				setCloud_name((String)newValue);
				return;
			case HadoopmodelPackage.CLOUD__CLOUD_OWNER:
				setCloud_owner((String)newValue);
				return;
			case HadoopmodelPackage.CLOUD__CLOUD_DESCRIPTION:
				setCloud_description((String)newValue);
				return;
			case HadoopmodelPackage.CLOUD__SERVER:
				getServer().clear();
				getServer().addAll((Collection<? extends Server>)newValue);
				return;
			case HadoopmodelPackage.CLOUD__JAVA:
				getJava().clear();
				getJava().addAll((Collection<? extends Java>)newValue);
				return;
			case HadoopmodelPackage.CLOUD__JOBTRACKER:
				getJobtracker().clear();
				getJobtracker().addAll((Collection<? extends JobTracker>)newValue);
				return;
			case HadoopmodelPackage.CLOUD__TASKTRACKER:
				getTasktracker().clear();
				getTasktracker().addAll((Collection<? extends TaskTracker>)newValue);
				return;
			case HadoopmodelPackage.CLOUD__HDFSNAMENODE:
				getHdfsnamenode().clear();
				getHdfsnamenode().addAll((Collection<? extends HDFSNameNode>)newValue);
				return;
			case HadoopmodelPackage.CLOUD__HDFSDATANODE:
				getHdfsdatanode().clear();
				getHdfsdatanode().addAll((Collection<? extends HDFSDataNode>)newValue);
				return;
			case HadoopmodelPackage.CLOUD__HBASEMASTER:
				getHbasemaster().clear();
				getHbasemaster().addAll((Collection<? extends HBaseMaster>)newValue);
				return;
			case HadoopmodelPackage.CLOUD__HBASEREGIONSERVER:
				getHbaseregionserver().clear();
				getHbaseregionserver().addAll((Collection<? extends HBaseRegionServer>)newValue);
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
			case HadoopmodelPackage.CLOUD__CLOUD_NAME:
				setCloud_name(CLOUD_NAME_EDEFAULT);
				return;
			case HadoopmodelPackage.CLOUD__CLOUD_OWNER:
				setCloud_owner(CLOUD_OWNER_EDEFAULT);
				return;
			case HadoopmodelPackage.CLOUD__CLOUD_DESCRIPTION:
				setCloud_description(CLOUD_DESCRIPTION_EDEFAULT);
				return;
			case HadoopmodelPackage.CLOUD__SERVER:
				getServer().clear();
				return;
			case HadoopmodelPackage.CLOUD__JAVA:
				getJava().clear();
				return;
			case HadoopmodelPackage.CLOUD__JOBTRACKER:
				getJobtracker().clear();
				return;
			case HadoopmodelPackage.CLOUD__TASKTRACKER:
				getTasktracker().clear();
				return;
			case HadoopmodelPackage.CLOUD__HDFSNAMENODE:
				getHdfsnamenode().clear();
				return;
			case HadoopmodelPackage.CLOUD__HDFSDATANODE:
				getHdfsdatanode().clear();
				return;
			case HadoopmodelPackage.CLOUD__HBASEMASTER:
				getHbasemaster().clear();
				return;
			case HadoopmodelPackage.CLOUD__HBASEREGIONSERVER:
				getHbaseregionserver().clear();
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
			case HadoopmodelPackage.CLOUD__CLOUD_NAME:
				return CLOUD_NAME_EDEFAULT == null ? cloud_name != null : !CLOUD_NAME_EDEFAULT.equals(cloud_name);
			case HadoopmodelPackage.CLOUD__CLOUD_OWNER:
				return CLOUD_OWNER_EDEFAULT == null ? cloud_owner != null : !CLOUD_OWNER_EDEFAULT.equals(cloud_owner);
			case HadoopmodelPackage.CLOUD__CLOUD_DESCRIPTION:
				return CLOUD_DESCRIPTION_EDEFAULT == null ? cloud_description != null : !CLOUD_DESCRIPTION_EDEFAULT.equals(cloud_description);
			case HadoopmodelPackage.CLOUD__SERVER:
				return server != null && !server.isEmpty();
			case HadoopmodelPackage.CLOUD__JAVA:
				return java != null && !java.isEmpty();
			case HadoopmodelPackage.CLOUD__JOBTRACKER:
				return jobtracker != null && !jobtracker.isEmpty();
			case HadoopmodelPackage.CLOUD__TASKTRACKER:
				return tasktracker != null && !tasktracker.isEmpty();
			case HadoopmodelPackage.CLOUD__HDFSNAMENODE:
				return hdfsnamenode != null && !hdfsnamenode.isEmpty();
			case HadoopmodelPackage.CLOUD__HDFSDATANODE:
				return hdfsdatanode != null && !hdfsdatanode.isEmpty();
			case HadoopmodelPackage.CLOUD__HBASEMASTER:
				return hbasemaster != null && !hbasemaster.isEmpty();
			case HadoopmodelPackage.CLOUD__HBASEREGIONSERVER:
				return hbaseregionserver != null && !hbaseregionserver.isEmpty();
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
		result.append(" (cloud_name: ");
		result.append(cloud_name);
		result.append(", cloud_owner: ");
		result.append(cloud_owner);
		result.append(", cloud_description: ");
		result.append(cloud_description);
		result.append(')');
		return result.toString();
	}

} //CloudImpl
