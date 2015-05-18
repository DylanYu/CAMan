/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hadoopmodel.HadoopmodelPackage
 * @generated
 */
public interface HadoopmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HadoopmodelFactory eINSTANCE = hadoopmodel.impl.HadoopmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud</em>'.
	 * @generated
	 */
	Cloud createCloud();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Java</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java</em>'.
	 * @generated
	 */
	Java createJava();

	/**
	 * Returns a new object of class '<em>Job Tracker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Tracker</em>'.
	 * @generated
	 */
	JobTracker createJobTracker();

	/**
	 * Returns a new object of class '<em>Task Tracker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Tracker</em>'.
	 * @generated
	 */
	TaskTracker createTaskTracker();

	/**
	 * Returns a new object of class '<em>HDFS Name Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HDFS Name Node</em>'.
	 * @generated
	 */
	HDFSNameNode createHDFSNameNode();

	/**
	 * Returns a new object of class '<em>HDFS Data Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HDFS Data Node</em>'.
	 * @generated
	 */
	HDFSDataNode createHDFSDataNode();

	/**
	 * Returns a new object of class '<em>Hadoop Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hadoop Master</em>'.
	 * @generated
	 */
	HadoopMaster createHadoopMaster();

	/**
	 * Returns a new object of class '<em>Hadoop Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hadoop Slave</em>'.
	 * @generated
	 */
	HadoopSlave createHadoopSlave();

	/**
	 * Returns a new object of class '<em>Hadoop Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hadoop Cluster</em>'.
	 * @generated
	 */
	HadoopCluster createHadoopCluster();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HadoopmodelPackage getHadoopmodelPackage();

} //HadoopmodelFactory
