/**
 */
package hadoopmodel.impl;

import hadoopmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HadoopmodelFactoryImpl extends EFactoryImpl implements HadoopmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HadoopmodelFactory init() {
		try {
			HadoopmodelFactory theHadoopmodelFactory = (HadoopmodelFactory)EPackage.Registry.INSTANCE.getEFactory(HadoopmodelPackage.eNS_URI);
			if (theHadoopmodelFactory != null) {
				return theHadoopmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HadoopmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HadoopmodelPackage.CLOUD: return createCloud();
			case HadoopmodelPackage.SERVER: return createServer();
			case HadoopmodelPackage.JAVA: return createJava();
			case HadoopmodelPackage.JOB_TRACKER: return createJobTracker();
			case HadoopmodelPackage.TASK_TRACKER: return createTaskTracker();
			case HadoopmodelPackage.HDFS_NAME_NODE: return createHDFSNameNode();
			case HadoopmodelPackage.HDFS_DATA_NODE: return createHDFSDataNode();
			case HadoopmodelPackage.HADOOP_MASTER: return createHadoopMaster();
			case HadoopmodelPackage.HADOOP_SLAVE: return createHadoopSlave();
			case HadoopmodelPackage.HADOOP_CLUSTER: return createHadoopCluster();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud createCloud() {
		CloudImpl cloud = new CloudImpl();
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java createJava() {
		JavaImpl java = new JavaImpl();
		return java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobTracker createJobTracker() {
		JobTrackerImpl jobTracker = new JobTrackerImpl();
		return jobTracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTracker createTaskTracker() {
		TaskTrackerImpl taskTracker = new TaskTrackerImpl();
		return taskTracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSNameNode createHDFSNameNode() {
		HDFSNameNodeImpl hdfsNameNode = new HDFSNameNodeImpl();
		return hdfsNameNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSDataNode createHDFSDataNode() {
		HDFSDataNodeImpl hdfsDataNode = new HDFSDataNodeImpl();
		return hdfsDataNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopMaster createHadoopMaster() {
		HadoopMasterImpl hadoopMaster = new HadoopMasterImpl();
		return hadoopMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopSlave createHadoopSlave() {
		HadoopSlaveImpl hadoopSlave = new HadoopSlaveImpl();
		return hadoopSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopCluster createHadoopCluster() {
		HadoopClusterImpl hadoopCluster = new HadoopClusterImpl();
		return hadoopCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopmodelPackage getHadoopmodelPackage() {
		return (HadoopmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HadoopmodelPackage getPackage() {
		return HadoopmodelPackage.eINSTANCE;
	}

} //HadoopmodelFactoryImpl
