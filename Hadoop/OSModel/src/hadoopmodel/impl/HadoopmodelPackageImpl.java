/**
 */
package hadoopmodel.impl;

import hadoopmodel.Cloud;
import hadoopmodel.HDFSDataNode;
import hadoopmodel.HDFSNameNode;
import hadoopmodel.HadoopmodelFactory;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.Java;
import hadoopmodel.JobTracker;
import hadoopmodel.Server;
import hadoopmodel.TaskTracker;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HadoopmodelPackageImpl extends EPackageImpl implements HadoopmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobTrackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTrackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdfsNameNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdfsDataNodeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hadoopmodel.HadoopmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HadoopmodelPackageImpl() {
		super(eNS_URI, HadoopmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HadoopmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HadoopmodelPackage init() {
		if (isInited) return (HadoopmodelPackage)EPackage.Registry.INSTANCE.getEPackage(HadoopmodelPackage.eNS_URI);

		// Obtain or create and register package
		HadoopmodelPackageImpl theHadoopmodelPackage = (HadoopmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HadoopmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HadoopmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theHadoopmodelPackage.createPackageContents();

		// Initialize created meta-data
		theHadoopmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHadoopmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HadoopmodelPackage.eNS_URI, theHadoopmodelPackage);
		return theHadoopmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloud() {
		return cloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloud_Cloud_name() {
		return (EAttribute)cloudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloud_Cloud_owner() {
		return (EAttribute)cloudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloud_Cloud_description() {
		return (EAttribute)cloudEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloud_Server() {
		return (EReference)cloudEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloud_Java() {
		return (EReference)cloudEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloud_Jobtracker() {
		return (EReference)cloudEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloud_Tasktracker() {
		return (EReference)cloudEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloud_Hdfsnamenode() {
		return (EReference)cloudEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloud_Hdfsdatanode() {
		return (EReference)cloudEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Server_name() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Server_id() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Server_status() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Server_adminpass() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Server_host() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Server_vm_state() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJava() {
		return javaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJava_Java_jdk_version() {
		return (EAttribute)javaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJava_Java_install_flavor() {
		return (EAttribute)javaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJava_Java_hostOn() {
		return (EReference)javaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJobTracker() {
		return jobTrackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJobTracker_Jobtracker_data_dir() {
		return (EAttribute)jobTrackerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobTracker_Jobtracker_dependOn() {
		return (EReference)jobTrackerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJobTracker_Jobtracker_hostOn() {
		return (EReference)jobTrackerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskTracker() {
		return taskTrackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskTracker_Tasktracker_data_dir() {
		return (EAttribute)taskTrackerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskTracker_Tasktracker_connectTo() {
		return (EReference)taskTrackerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskTracker_Tasktracker_hostOn() {
		return (EReference)taskTrackerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDFSNameNode() {
		return hdfsNameNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHDFSNameNode_Hdfsnamenode_data_dir() {
		return (EAttribute)hdfsNameNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDFSNameNode_Hdfsnamenode_hostOn() {
		return (EReference)hdfsNameNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDFSDataNode() {
		return hdfsDataNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHDFSDataNode_Hdfsdatanode_data_dir() {
		return (EAttribute)hdfsDataNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDFSDataNode_Hdfsdatanode_connectTo() {
		return (EReference)hdfsDataNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHDFSDataNode_Hdfsdatanode_hostOn() {
		return (EReference)hdfsDataNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopmodelFactory getHadoopmodelFactory() {
		return (HadoopmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cloudEClass = createEClass(CLOUD);
		createEAttribute(cloudEClass, CLOUD__CLOUD_NAME);
		createEAttribute(cloudEClass, CLOUD__CLOUD_OWNER);
		createEAttribute(cloudEClass, CLOUD__CLOUD_DESCRIPTION);
		createEReference(cloudEClass, CLOUD__SERVER);
		createEReference(cloudEClass, CLOUD__JAVA);
		createEReference(cloudEClass, CLOUD__JOBTRACKER);
		createEReference(cloudEClass, CLOUD__TASKTRACKER);
		createEReference(cloudEClass, CLOUD__HDFSNAMENODE);
		createEReference(cloudEClass, CLOUD__HDFSDATANODE);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__SERVER_NAME);
		createEAttribute(serverEClass, SERVER__SERVER_ID);
		createEAttribute(serverEClass, SERVER__SERVER_STATUS);
		createEAttribute(serverEClass, SERVER__SERVER_ADMINPASS);
		createEAttribute(serverEClass, SERVER__SERVER_HOST);
		createEAttribute(serverEClass, SERVER__SERVER_VM_STATE);

		javaEClass = createEClass(JAVA);
		createEAttribute(javaEClass, JAVA__JAVA_JDK_VERSION);
		createEAttribute(javaEClass, JAVA__JAVA_INSTALL_FLAVOR);
		createEReference(javaEClass, JAVA__JAVA_HOST_ON);

		jobTrackerEClass = createEClass(JOB_TRACKER);
		createEAttribute(jobTrackerEClass, JOB_TRACKER__JOBTRACKER_DATA_DIR);
		createEReference(jobTrackerEClass, JOB_TRACKER__JOBTRACKER_DEPEND_ON);
		createEReference(jobTrackerEClass, JOB_TRACKER__JOBTRACKER_HOST_ON);

		taskTrackerEClass = createEClass(TASK_TRACKER);
		createEAttribute(taskTrackerEClass, TASK_TRACKER__TASKTRACKER_DATA_DIR);
		createEReference(taskTrackerEClass, TASK_TRACKER__TASKTRACKER_CONNECT_TO);
		createEReference(taskTrackerEClass, TASK_TRACKER__TASKTRACKER_HOST_ON);

		hdfsNameNodeEClass = createEClass(HDFS_NAME_NODE);
		createEAttribute(hdfsNameNodeEClass, HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR);
		createEReference(hdfsNameNodeEClass, HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON);

		hdfsDataNodeEClass = createEClass(HDFS_DATA_NODE);
		createEAttribute(hdfsDataNodeEClass, HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR);
		createEReference(hdfsDataNodeEClass, HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO);
		createEReference(hdfsDataNodeEClass, HDFS_DATA_NODE__HDFSDATANODE_HOST_ON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudEClass, Cloud.class, "Cloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloud_Cloud_name(), ecorePackage.getEString(), "cloud_name", "", 0, 1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloud_Cloud_owner(), ecorePackage.getEString(), "cloud_owner", null, 0, 1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloud_Cloud_description(), ecorePackage.getEString(), "cloud_description", null, 0, 1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloud_Server(), this.getServer(), null, "server", null, 0, -1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloud_Java(), this.getJava(), null, "java", null, 0, -1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloud_Jobtracker(), this.getJobTracker(), null, "jobtracker", null, 0, -1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloud_Tasktracker(), this.getTaskTracker(), null, "tasktracker", null, 0, -1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloud_Hdfsnamenode(), this.getHDFSNameNode(), null, "hdfsnamenode", null, 0, -1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloud_Hdfsdatanode(), this.getHDFSDataNode(), null, "hdfsdatanode", null, 0, -1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_Server_name(), ecorePackage.getEString(), "server_name", "vm", 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Server_id(), ecorePackage.getEString(), "server_id", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Server_status(), ecorePackage.getEString(), "server_status", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Server_adminpass(), ecorePackage.getEString(), "server_adminpass", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Server_host(), ecorePackage.getEString(), "server_host", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Server_vm_state(), ecorePackage.getEString(), "server_vm_state", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaEClass, Java.class, "Java", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJava_Java_jdk_version(), ecorePackage.getEString(), "java_jdk_version", "6", 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJava_Java_install_flavor(), ecorePackage.getEString(), "java_install_flavor", "oracle", 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJava_Java_hostOn(), this.getServer(), null, "java_hostOn", null, 0, 1, Java.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobTrackerEClass, JobTracker.class, "JobTracker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJobTracker_Jobtracker_data_dir(), ecorePackage.getEString(), "jobtracker_data_dir", null, 0, 1, JobTracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobTracker_Jobtracker_dependOn(), this.getHDFSNameNode(), null, "jobtracker_dependOn", null, 1, 1, JobTracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJobTracker_Jobtracker_hostOn(), this.getServer(), null, "jobtracker_hostOn", null, 0, 1, JobTracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTrackerEClass, TaskTracker.class, "TaskTracker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskTracker_Tasktracker_data_dir(), ecorePackage.getEString(), "tasktracker_data_dir", null, 0, 1, TaskTracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskTracker_Tasktracker_connectTo(), this.getJobTracker(), null, "tasktracker_connectTo", null, 1, 1, TaskTracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskTracker_Tasktracker_hostOn(), this.getServer(), null, "tasktracker_hostOn", null, 0, 1, TaskTracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hdfsNameNodeEClass, HDFSNameNode.class, "HDFSNameNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHDFSNameNode_Hdfsnamenode_data_dir(), ecorePackage.getEString(), "hdfsnamenode_data_dir", null, 0, 1, HDFSNameNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDFSNameNode_Hdfsnamenode_hostOn(), this.getServer(), null, "hdfsnamenode_hostOn", null, 0, 1, HDFSNameNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hdfsDataNodeEClass, HDFSDataNode.class, "HDFSDataNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHDFSDataNode_Hdfsdatanode_data_dir(), ecorePackage.getEString(), "hdfsdatanode_data_dir", null, 0, 1, HDFSDataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDFSDataNode_Hdfsdatanode_connectTo(), this.getHDFSNameNode(), null, "hdfsdatanode_connectTo", null, 1, 1, HDFSDataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHDFSDataNode_Hdfsdatanode_hostOn(), this.getServer(), null, "hdfsdatanode_hostOn", null, 0, 1, HDFSDataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HadoopmodelPackageImpl
