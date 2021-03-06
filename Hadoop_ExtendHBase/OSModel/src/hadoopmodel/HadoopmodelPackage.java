/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hadoopmodel.HadoopmodelFactory
 * @model kind="package"
 * @generated
 */
public interface HadoopmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hadoopmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sei.pku.edu.cn/rsa/hadoopmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hadoopmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HadoopmodelPackage eINSTANCE = hadoopmodel.impl.HadoopmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hadoopmodel.impl.CloudImpl <em>Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hadoopmodel.impl.CloudImpl
	 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getCloud()
	 * @generated
	 */
	int CLOUD = 0;

	/**
	 * The feature id for the '<em><b>Cloud name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__CLOUD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Cloud owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__CLOUD_OWNER = 1;

	/**
	 * The feature id for the '<em><b>Cloud description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__CLOUD_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__SERVER = 3;

	/**
	 * The feature id for the '<em><b>Java</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__JAVA = 4;

	/**
	 * The feature id for the '<em><b>Jobtracker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__JOBTRACKER = 5;

	/**
	 * The feature id for the '<em><b>Tasktracker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__TASKTRACKER = 6;

	/**
	 * The feature id for the '<em><b>Hdfsnamenode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__HDFSNAMENODE = 7;

	/**
	 * The feature id for the '<em><b>Hdfsdatanode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__HDFSDATANODE = 8;

	/**
	 * The feature id for the '<em><b>Hbasemaster</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__HBASEMASTER = 9;

	/**
	 * The feature id for the '<em><b>Hbaseregionserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__HBASEREGIONSERVER = 10;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hadoopmodel.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hadoopmodel.impl.ServerImpl
	 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 1;

	/**
	 * The feature id for the '<em><b>Server name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Server id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_ID = 1;

	/**
	 * The feature id for the '<em><b>Server status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Server adminpass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_ADMINPASS = 3;

	/**
	 * The feature id for the '<em><b>Server host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_HOST = 4;

	/**
	 * The feature id for the '<em><b>Server vm state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_VM_STATE = 5;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hadoopmodel.impl.JavaImpl <em>Java</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hadoopmodel.impl.JavaImpl
	 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getJava()
	 * @generated
	 */
	int JAVA = 2;

	/**
	 * The feature id for the '<em><b>Java jdk version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__JAVA_JDK_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Java install flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__JAVA_INSTALL_FLAVOR = 1;

	/**
	 * The feature id for the '<em><b>Java host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__JAVA_HOST_ON = 2;

	/**
	 * The number of structural features of the '<em>Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hadoopmodel.impl.JobTrackerImpl <em>Job Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hadoopmodel.impl.JobTrackerImpl
	 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getJobTracker()
	 * @generated
	 */
	int JOB_TRACKER = 3;

	/**
	 * The feature id for the '<em><b>Jobtracker data dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TRACKER__JOBTRACKER_DATA_DIR = 0;

	/**
	 * The feature id for the '<em><b>Jobtracker depend On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TRACKER__JOBTRACKER_DEPEND_ON = 1;

	/**
	 * The feature id for the '<em><b>Jobtracker host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TRACKER__JOBTRACKER_HOST_ON = 2;

	/**
	 * The number of structural features of the '<em>Job Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TRACKER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Job Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TRACKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hadoopmodel.impl.TaskTrackerImpl <em>Task Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hadoopmodel.impl.TaskTrackerImpl
	 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getTaskTracker()
	 * @generated
	 */
	int TASK_TRACKER = 4;

	/**
	 * The feature id for the '<em><b>Tasktracker data dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACKER__TASKTRACKER_DATA_DIR = 0;

	/**
	 * The feature id for the '<em><b>Tasktracker connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACKER__TASKTRACKER_CONNECT_TO = 1;

	/**
	 * The feature id for the '<em><b>Tasktracker host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACKER__TASKTRACKER_HOST_ON = 2;

	/**
	 * The number of structural features of the '<em>Task Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACKER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TRACKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hadoopmodel.impl.HDFSNameNodeImpl <em>HDFS Name Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hadoopmodel.impl.HDFSNameNodeImpl
	 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getHDFSNameNode()
	 * @generated
	 */
	int HDFS_NAME_NODE = 5;

	/**
	 * The feature id for the '<em><b>Hdfsnamenode data dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR = 0;

	/**
	 * The feature id for the '<em><b>Hdfsnamenode host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON = 1;

	/**
	 * The number of structural features of the '<em>HDFS Name Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_NAME_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>HDFS Name Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_NAME_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hadoopmodel.impl.HDFSDataNodeImpl <em>HDFS Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hadoopmodel.impl.HDFSDataNodeImpl
	 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getHDFSDataNode()
	 * @generated
	 */
	int HDFS_DATA_NODE = 6;

	/**
	 * The feature id for the '<em><b>Hdfsdatanode data dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR = 0;

	/**
	 * The feature id for the '<em><b>Hdfsdatanode connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO = 1;

	/**
	 * The feature id for the '<em><b>Hdfsdatanode host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_DATA_NODE__HDFSDATANODE_HOST_ON = 2;

	/**
	 * The number of structural features of the '<em>HDFS Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_DATA_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>HDFS Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_DATA_NODE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link hadoopmodel.impl.HBaseMasterImpl <em>HBase Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hadoopmodel.impl.HBaseMasterImpl
	 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getHBaseMaster()
	 * @generated
	 */
	int HBASE_MASTER = 7;

	/**
	 * The feature id for the '<em><b>Hbasemaster rootdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_MASTER__HBASEMASTER_ROOTDIR = 0;

	/**
	 * The feature id for the '<em><b>Hbasemaster depend On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_MASTER__HBASEMASTER_DEPEND_ON = 1;

	/**
	 * The feature id for the '<em><b>Hbasemaster host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_MASTER__HBASEMASTER_HOST_ON = 2;

	/**
	 * The number of structural features of the '<em>HBase Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_MASTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>HBase Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_MASTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hadoopmodel.impl.HBaseRegionServerImpl <em>HBase Region Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hadoopmodel.impl.HBaseRegionServerImpl
	 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getHBaseRegionServer()
	 * @generated
	 */
	int HBASE_REGION_SERVER = 8;

	/**
	 * The feature id for the '<em><b>Hbaseregionserver name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_REGION_SERVER__HBASEREGIONSERVER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Hbaseregionserver connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_REGION_SERVER__HBASEREGIONSERVER_CONNECT_TO = 1;

	/**
	 * The feature id for the '<em><b>Hbaseregionserver host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_REGION_SERVER__HBASEREGIONSERVER_HOST_ON = 2;

	/**
	 * The number of structural features of the '<em>HBase Region Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_REGION_SERVER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>HBase Region Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HBASE_REGION_SERVER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hadoopmodel.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud</em>'.
	 * @see hadoopmodel.Cloud
	 * @generated
	 */
	EClass getCloud();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Cloud#getCloud_name <em>Cloud name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud name</em>'.
	 * @see hadoopmodel.Cloud#getCloud_name()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Cloud_name();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Cloud#getCloud_owner <em>Cloud owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud owner</em>'.
	 * @see hadoopmodel.Cloud#getCloud_owner()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Cloud_owner();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Cloud#getCloud_description <em>Cloud description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud description</em>'.
	 * @see hadoopmodel.Cloud#getCloud_description()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Cloud_description();

	/**
	 * Returns the meta object for the containment reference list '{@link hadoopmodel.Cloud#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Server</em>'.
	 * @see hadoopmodel.Cloud#getServer()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Server();

	/**
	 * Returns the meta object for the containment reference list '{@link hadoopmodel.Cloud#getJava <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java</em>'.
	 * @see hadoopmodel.Cloud#getJava()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Java();

	/**
	 * Returns the meta object for the containment reference list '{@link hadoopmodel.Cloud#getJobtracker <em>Jobtracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobtracker</em>'.
	 * @see hadoopmodel.Cloud#getJobtracker()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Jobtracker();

	/**
	 * Returns the meta object for the containment reference list '{@link hadoopmodel.Cloud#getTasktracker <em>Tasktracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasktracker</em>'.
	 * @see hadoopmodel.Cloud#getTasktracker()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Tasktracker();

	/**
	 * Returns the meta object for the containment reference list '{@link hadoopmodel.Cloud#getHdfsnamenode <em>Hdfsnamenode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hdfsnamenode</em>'.
	 * @see hadoopmodel.Cloud#getHdfsnamenode()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Hdfsnamenode();

	/**
	 * Returns the meta object for the containment reference list '{@link hadoopmodel.Cloud#getHdfsdatanode <em>Hdfsdatanode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hdfsdatanode</em>'.
	 * @see hadoopmodel.Cloud#getHdfsdatanode()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Hdfsdatanode();

	/**
	 * Returns the meta object for the containment reference list '{@link hadoopmodel.Cloud#getHbasemaster <em>Hbasemaster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hbasemaster</em>'.
	 * @see hadoopmodel.Cloud#getHbasemaster()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Hbasemaster();

	/**
	 * Returns the meta object for the containment reference list '{@link hadoopmodel.Cloud#getHbaseregionserver <em>Hbaseregionserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hbaseregionserver</em>'.
	 * @see hadoopmodel.Cloud#getHbaseregionserver()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Hbaseregionserver();

	/**
	 * Returns the meta object for class '{@link hadoopmodel.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see hadoopmodel.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Server#getServer_name <em>Server name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server name</em>'.
	 * @see hadoopmodel.Server#getServer_name()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Server_name();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Server#getServer_id <em>Server id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server id</em>'.
	 * @see hadoopmodel.Server#getServer_id()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Server_id();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Server#getServer_status <em>Server status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server status</em>'.
	 * @see hadoopmodel.Server#getServer_status()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Server_status();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Server#getServer_adminpass <em>Server adminpass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server adminpass</em>'.
	 * @see hadoopmodel.Server#getServer_adminpass()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Server_adminpass();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Server#getServer_host <em>Server host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server host</em>'.
	 * @see hadoopmodel.Server#getServer_host()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Server_host();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Server#getServer_vm_state <em>Server vm state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server vm state</em>'.
	 * @see hadoopmodel.Server#getServer_vm_state()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Server_vm_state();

	/**
	 * Returns the meta object for class '{@link hadoopmodel.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java</em>'.
	 * @see hadoopmodel.Java
	 * @generated
	 */
	EClass getJava();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Java#getJava_jdk_version <em>Java jdk version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java jdk version</em>'.
	 * @see hadoopmodel.Java#getJava_jdk_version()
	 * @see #getJava()
	 * @generated
	 */
	EAttribute getJava_Java_jdk_version();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.Java#getJava_install_flavor <em>Java install flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java install flavor</em>'.
	 * @see hadoopmodel.Java#getJava_install_flavor()
	 * @see #getJava()
	 * @generated
	 */
	EAttribute getJava_Java_install_flavor();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.Java#getJava_hostOn <em>Java host On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java host On</em>'.
	 * @see hadoopmodel.Java#getJava_hostOn()
	 * @see #getJava()
	 * @generated
	 */
	EReference getJava_Java_hostOn();

	/**
	 * Returns the meta object for class '{@link hadoopmodel.JobTracker <em>Job Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Tracker</em>'.
	 * @see hadoopmodel.JobTracker
	 * @generated
	 */
	EClass getJobTracker();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.JobTracker#getJobtracker_data_dir <em>Jobtracker data dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobtracker data dir</em>'.
	 * @see hadoopmodel.JobTracker#getJobtracker_data_dir()
	 * @see #getJobTracker()
	 * @generated
	 */
	EAttribute getJobTracker_Jobtracker_data_dir();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.JobTracker#getJobtracker_dependOn <em>Jobtracker depend On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jobtracker depend On</em>'.
	 * @see hadoopmodel.JobTracker#getJobtracker_dependOn()
	 * @see #getJobTracker()
	 * @generated
	 */
	EReference getJobTracker_Jobtracker_dependOn();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.JobTracker#getJobtracker_hostOn <em>Jobtracker host On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jobtracker host On</em>'.
	 * @see hadoopmodel.JobTracker#getJobtracker_hostOn()
	 * @see #getJobTracker()
	 * @generated
	 */
	EReference getJobTracker_Jobtracker_hostOn();

	/**
	 * Returns the meta object for class '{@link hadoopmodel.TaskTracker <em>Task Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Tracker</em>'.
	 * @see hadoopmodel.TaskTracker
	 * @generated
	 */
	EClass getTaskTracker();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.TaskTracker#getTasktracker_data_dir <em>Tasktracker data dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tasktracker data dir</em>'.
	 * @see hadoopmodel.TaskTracker#getTasktracker_data_dir()
	 * @see #getTaskTracker()
	 * @generated
	 */
	EAttribute getTaskTracker_Tasktracker_data_dir();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.TaskTracker#getTasktracker_connectTo <em>Tasktracker connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tasktracker connect To</em>'.
	 * @see hadoopmodel.TaskTracker#getTasktracker_connectTo()
	 * @see #getTaskTracker()
	 * @generated
	 */
	EReference getTaskTracker_Tasktracker_connectTo();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.TaskTracker#getTasktracker_hostOn <em>Tasktracker host On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tasktracker host On</em>'.
	 * @see hadoopmodel.TaskTracker#getTasktracker_hostOn()
	 * @see #getTaskTracker()
	 * @generated
	 */
	EReference getTaskTracker_Tasktracker_hostOn();

	/**
	 * Returns the meta object for class '{@link hadoopmodel.HDFSNameNode <em>HDFS Name Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDFS Name Node</em>'.
	 * @see hadoopmodel.HDFSNameNode
	 * @generated
	 */
	EClass getHDFSNameNode();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.HDFSNameNode#getHdfsnamenode_data_dir <em>Hdfsnamenode data dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdfsnamenode data dir</em>'.
	 * @see hadoopmodel.HDFSNameNode#getHdfsnamenode_data_dir()
	 * @see #getHDFSNameNode()
	 * @generated
	 */
	EAttribute getHDFSNameNode_Hdfsnamenode_data_dir();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.HDFSNameNode#getHdfsnamenode_hostOn <em>Hdfsnamenode host On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hdfsnamenode host On</em>'.
	 * @see hadoopmodel.HDFSNameNode#getHdfsnamenode_hostOn()
	 * @see #getHDFSNameNode()
	 * @generated
	 */
	EReference getHDFSNameNode_Hdfsnamenode_hostOn();

	/**
	 * Returns the meta object for class '{@link hadoopmodel.HDFSDataNode <em>HDFS Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDFS Data Node</em>'.
	 * @see hadoopmodel.HDFSDataNode
	 * @generated
	 */
	EClass getHDFSDataNode();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.HDFSDataNode#getHdfsdatanode_data_dir <em>Hdfsdatanode data dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdfsdatanode data dir</em>'.
	 * @see hadoopmodel.HDFSDataNode#getHdfsdatanode_data_dir()
	 * @see #getHDFSDataNode()
	 * @generated
	 */
	EAttribute getHDFSDataNode_Hdfsdatanode_data_dir();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.HDFSDataNode#getHdfsdatanode_connectTo <em>Hdfsdatanode connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hdfsdatanode connect To</em>'.
	 * @see hadoopmodel.HDFSDataNode#getHdfsdatanode_connectTo()
	 * @see #getHDFSDataNode()
	 * @generated
	 */
	EReference getHDFSDataNode_Hdfsdatanode_connectTo();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.HDFSDataNode#getHdfsdatanode_hostOn <em>Hdfsdatanode host On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hdfsdatanode host On</em>'.
	 * @see hadoopmodel.HDFSDataNode#getHdfsdatanode_hostOn()
	 * @see #getHDFSDataNode()
	 * @generated
	 */
	EReference getHDFSDataNode_Hdfsdatanode_hostOn();

	/**
	 * Returns the meta object for class '{@link hadoopmodel.HBaseMaster <em>HBase Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HBase Master</em>'.
	 * @see hadoopmodel.HBaseMaster
	 * @generated
	 */
	EClass getHBaseMaster();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.HBaseMaster#getHbasemaster_rootdir <em>Hbasemaster rootdir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hbasemaster rootdir</em>'.
	 * @see hadoopmodel.HBaseMaster#getHbasemaster_rootdir()
	 * @see #getHBaseMaster()
	 * @generated
	 */
	EAttribute getHBaseMaster_Hbasemaster_rootdir();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.HBaseMaster#getHbasemaster_dependOn <em>Hbasemaster depend On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hbasemaster depend On</em>'.
	 * @see hadoopmodel.HBaseMaster#getHbasemaster_dependOn()
	 * @see #getHBaseMaster()
	 * @generated
	 */
	EReference getHBaseMaster_Hbasemaster_dependOn();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.HBaseMaster#getHbasemaster_hostOn <em>Hbasemaster host On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hbasemaster host On</em>'.
	 * @see hadoopmodel.HBaseMaster#getHbasemaster_hostOn()
	 * @see #getHBaseMaster()
	 * @generated
	 */
	EReference getHBaseMaster_Hbasemaster_hostOn();

	/**
	 * Returns the meta object for class '{@link hadoopmodel.HBaseRegionServer <em>HBase Region Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HBase Region Server</em>'.
	 * @see hadoopmodel.HBaseRegionServer
	 * @generated
	 */
	EClass getHBaseRegionServer();

	/**
	 * Returns the meta object for the attribute '{@link hadoopmodel.HBaseRegionServer#getHbaseregionserver_name <em>Hbaseregionserver name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hbaseregionserver name</em>'.
	 * @see hadoopmodel.HBaseRegionServer#getHbaseregionserver_name()
	 * @see #getHBaseRegionServer()
	 * @generated
	 */
	EAttribute getHBaseRegionServer_Hbaseregionserver_name();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.HBaseRegionServer#getHbaseregionserver_connectTo <em>Hbaseregionserver connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hbaseregionserver connect To</em>'.
	 * @see hadoopmodel.HBaseRegionServer#getHbaseregionserver_connectTo()
	 * @see #getHBaseRegionServer()
	 * @generated
	 */
	EReference getHBaseRegionServer_Hbaseregionserver_connectTo();

	/**
	 * Returns the meta object for the reference '{@link hadoopmodel.HBaseRegionServer#getHbaseregionserver_hostOn <em>Hbaseregionserver host On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hbaseregionserver host On</em>'.
	 * @see hadoopmodel.HBaseRegionServer#getHbaseregionserver_hostOn()
	 * @see #getHBaseRegionServer()
	 * @generated
	 */
	EReference getHBaseRegionServer_Hbaseregionserver_hostOn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HadoopmodelFactory getHadoopmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hadoopmodel.impl.CloudImpl <em>Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hadoopmodel.impl.CloudImpl
		 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getCloud()
		 * @generated
		 */
		EClass CLOUD = eINSTANCE.getCloud();

		/**
		 * The meta object literal for the '<em><b>Cloud name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__CLOUD_NAME = eINSTANCE.getCloud_Cloud_name();

		/**
		 * The meta object literal for the '<em><b>Cloud owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__CLOUD_OWNER = eINSTANCE.getCloud_Cloud_owner();

		/**
		 * The meta object literal for the '<em><b>Cloud description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__CLOUD_DESCRIPTION = eINSTANCE.getCloud_Cloud_description();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__SERVER = eINSTANCE.getCloud_Server();

		/**
		 * The meta object literal for the '<em><b>Java</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__JAVA = eINSTANCE.getCloud_Java();

		/**
		 * The meta object literal for the '<em><b>Jobtracker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__JOBTRACKER = eINSTANCE.getCloud_Jobtracker();

		/**
		 * The meta object literal for the '<em><b>Tasktracker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__TASKTRACKER = eINSTANCE.getCloud_Tasktracker();

		/**
		 * The meta object literal for the '<em><b>Hdfsnamenode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__HDFSNAMENODE = eINSTANCE.getCloud_Hdfsnamenode();

		/**
		 * The meta object literal for the '<em><b>Hdfsdatanode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__HDFSDATANODE = eINSTANCE.getCloud_Hdfsdatanode();

		/**
		 * The meta object literal for the '<em><b>Hbasemaster</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__HBASEMASTER = eINSTANCE.getCloud_Hbasemaster();

		/**
		 * The meta object literal for the '<em><b>Hbaseregionserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__HBASEREGIONSERVER = eINSTANCE.getCloud_Hbaseregionserver();

		/**
		 * The meta object literal for the '{@link hadoopmodel.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hadoopmodel.impl.ServerImpl
		 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Server name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_NAME = eINSTANCE.getServer_Server_name();

		/**
		 * The meta object literal for the '<em><b>Server id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_ID = eINSTANCE.getServer_Server_id();

		/**
		 * The meta object literal for the '<em><b>Server status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_STATUS = eINSTANCE.getServer_Server_status();

		/**
		 * The meta object literal for the '<em><b>Server adminpass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_ADMINPASS = eINSTANCE.getServer_Server_adminpass();

		/**
		 * The meta object literal for the '<em><b>Server host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_HOST = eINSTANCE.getServer_Server_host();

		/**
		 * The meta object literal for the '<em><b>Server vm state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_VM_STATE = eINSTANCE.getServer_Server_vm_state();

		/**
		 * The meta object literal for the '{@link hadoopmodel.impl.JavaImpl <em>Java</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hadoopmodel.impl.JavaImpl
		 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getJava()
		 * @generated
		 */
		EClass JAVA = eINSTANCE.getJava();

		/**
		 * The meta object literal for the '<em><b>Java jdk version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA__JAVA_JDK_VERSION = eINSTANCE.getJava_Java_jdk_version();

		/**
		 * The meta object literal for the '<em><b>Java install flavor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA__JAVA_INSTALL_FLAVOR = eINSTANCE.getJava_Java_install_flavor();

		/**
		 * The meta object literal for the '<em><b>Java host On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA__JAVA_HOST_ON = eINSTANCE.getJava_Java_hostOn();

		/**
		 * The meta object literal for the '{@link hadoopmodel.impl.JobTrackerImpl <em>Job Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hadoopmodel.impl.JobTrackerImpl
		 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getJobTracker()
		 * @generated
		 */
		EClass JOB_TRACKER = eINSTANCE.getJobTracker();

		/**
		 * The meta object literal for the '<em><b>Jobtracker data dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_TRACKER__JOBTRACKER_DATA_DIR = eINSTANCE.getJobTracker_Jobtracker_data_dir();

		/**
		 * The meta object literal for the '<em><b>Jobtracker depend On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_TRACKER__JOBTRACKER_DEPEND_ON = eINSTANCE.getJobTracker_Jobtracker_dependOn();

		/**
		 * The meta object literal for the '<em><b>Jobtracker host On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_TRACKER__JOBTRACKER_HOST_ON = eINSTANCE.getJobTracker_Jobtracker_hostOn();

		/**
		 * The meta object literal for the '{@link hadoopmodel.impl.TaskTrackerImpl <em>Task Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hadoopmodel.impl.TaskTrackerImpl
		 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getTaskTracker()
		 * @generated
		 */
		EClass TASK_TRACKER = eINSTANCE.getTaskTracker();

		/**
		 * The meta object literal for the '<em><b>Tasktracker data dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_TRACKER__TASKTRACKER_DATA_DIR = eINSTANCE.getTaskTracker_Tasktracker_data_dir();

		/**
		 * The meta object literal for the '<em><b>Tasktracker connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TRACKER__TASKTRACKER_CONNECT_TO = eINSTANCE.getTaskTracker_Tasktracker_connectTo();

		/**
		 * The meta object literal for the '<em><b>Tasktracker host On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_TRACKER__TASKTRACKER_HOST_ON = eINSTANCE.getTaskTracker_Tasktracker_hostOn();

		/**
		 * The meta object literal for the '{@link hadoopmodel.impl.HDFSNameNodeImpl <em>HDFS Name Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hadoopmodel.impl.HDFSNameNodeImpl
		 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getHDFSNameNode()
		 * @generated
		 */
		EClass HDFS_NAME_NODE = eINSTANCE.getHDFSNameNode();

		/**
		 * The meta object literal for the '<em><b>Hdfsnamenode data dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR = eINSTANCE.getHDFSNameNode_Hdfsnamenode_data_dir();

		/**
		 * The meta object literal for the '<em><b>Hdfsnamenode host On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON = eINSTANCE.getHDFSNameNode_Hdfsnamenode_hostOn();

		/**
		 * The meta object literal for the '{@link hadoopmodel.impl.HDFSDataNodeImpl <em>HDFS Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hadoopmodel.impl.HDFSDataNodeImpl
		 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getHDFSDataNode()
		 * @generated
		 */
		EClass HDFS_DATA_NODE = eINSTANCE.getHDFSDataNode();

		/**
		 * The meta object literal for the '<em><b>Hdfsdatanode data dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR = eINSTANCE.getHDFSDataNode_Hdfsdatanode_data_dir();

		/**
		 * The meta object literal for the '<em><b>Hdfsdatanode connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO = eINSTANCE.getHDFSDataNode_Hdfsdatanode_connectTo();

		/**
		 * The meta object literal for the '<em><b>Hdfsdatanode host On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDFS_DATA_NODE__HDFSDATANODE_HOST_ON = eINSTANCE.getHDFSDataNode_Hdfsdatanode_hostOn();

		/**
		 * The meta object literal for the '{@link hadoopmodel.impl.HBaseMasterImpl <em>HBase Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hadoopmodel.impl.HBaseMasterImpl
		 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getHBaseMaster()
		 * @generated
		 */
		EClass HBASE_MASTER = eINSTANCE.getHBaseMaster();

		/**
		 * The meta object literal for the '<em><b>Hbasemaster rootdir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HBASE_MASTER__HBASEMASTER_ROOTDIR = eINSTANCE.getHBaseMaster_Hbasemaster_rootdir();

		/**
		 * The meta object literal for the '<em><b>Hbasemaster depend On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBASE_MASTER__HBASEMASTER_DEPEND_ON = eINSTANCE.getHBaseMaster_Hbasemaster_dependOn();

		/**
		 * The meta object literal for the '<em><b>Hbasemaster host On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBASE_MASTER__HBASEMASTER_HOST_ON = eINSTANCE.getHBaseMaster_Hbasemaster_hostOn();

		/**
		 * The meta object literal for the '{@link hadoopmodel.impl.HBaseRegionServerImpl <em>HBase Region Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hadoopmodel.impl.HBaseRegionServerImpl
		 * @see hadoopmodel.impl.HadoopmodelPackageImpl#getHBaseRegionServer()
		 * @generated
		 */
		EClass HBASE_REGION_SERVER = eINSTANCE.getHBaseRegionServer();

		/**
		 * The meta object literal for the '<em><b>Hbaseregionserver name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HBASE_REGION_SERVER__HBASEREGIONSERVER_NAME = eINSTANCE.getHBaseRegionServer_Hbaseregionserver_name();

		/**
		 * The meta object literal for the '<em><b>Hbaseregionserver connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBASE_REGION_SERVER__HBASEREGIONSERVER_CONNECT_TO = eINSTANCE.getHBaseRegionServer_Hbaseregionserver_connectTo();

		/**
		 * The meta object literal for the '<em><b>Hbaseregionserver host On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HBASE_REGION_SERVER__HBASEREGIONSERVER_HOST_ON = eINSTANCE.getHBaseRegionServer_Hbaseregionserver_hostOn();

	}

} //HadoopmodelPackage
