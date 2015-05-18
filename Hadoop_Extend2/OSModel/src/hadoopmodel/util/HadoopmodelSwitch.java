/**
 */
package hadoopmodel.util;

import hadoopmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hadoopmodel.HadoopmodelPackage
 * @generated
 */
public class HadoopmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HadoopmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = HadoopmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HadoopmodelPackage.CLOUD: {
				Cloud cloud = (Cloud)theEObject;
				T result = caseCloud(cloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopmodelPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopmodelPackage.JAVA: {
				Java java = (Java)theEObject;
				T result = caseJava(java);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopmodelPackage.JOB_TRACKER: {
				JobTracker jobTracker = (JobTracker)theEObject;
				T result = caseJobTracker(jobTracker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopmodelPackage.TASK_TRACKER: {
				TaskTracker taskTracker = (TaskTracker)theEObject;
				T result = caseTaskTracker(taskTracker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopmodelPackage.HDFS_NAME_NODE: {
				HDFSNameNode hdfsNameNode = (HDFSNameNode)theEObject;
				T result = caseHDFSNameNode(hdfsNameNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopmodelPackage.HDFS_DATA_NODE: {
				HDFSDataNode hdfsDataNode = (HDFSDataNode)theEObject;
				T result = caseHDFSDataNode(hdfsDataNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopmodelPackage.HADOOP_MASTER: {
				HadoopMaster hadoopMaster = (HadoopMaster)theEObject;
				T result = caseHadoopMaster(hadoopMaster);
				if (result == null) result = caseJava(hadoopMaster);
				if (result == null) result = caseHDFSNameNode(hadoopMaster);
				if (result == null) result = caseJobTracker(hadoopMaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopmodelPackage.HADOOP_SLAVE: {
				HadoopSlave hadoopSlave = (HadoopSlave)theEObject;
				T result = caseHadoopSlave(hadoopSlave);
				if (result == null) result = caseJava(hadoopSlave);
				if (result == null) result = caseHDFSDataNode(hadoopSlave);
				if (result == null) result = caseTaskTracker(hadoopSlave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopmodelPackage.HADOOP_CLUSTER: {
				HadoopCluster hadoopCluster = (HadoopCluster)theEObject;
				T result = caseHadoopCluster(hadoopCluster);
				if (result == null) result = caseHadoopMaster(hadoopCluster);
				if (result == null) result = caseHadoopSlave(hadoopCluster);
				if (result == null) result = caseJava(hadoopCluster);
				if (result == null) result = caseHDFSNameNode(hadoopCluster);
				if (result == null) result = caseJobTracker(hadoopCluster);
				if (result == null) result = caseHDFSDataNode(hadoopCluster);
				if (result == null) result = caseTaskTracker(hadoopCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloud(Cloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJava(Java object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Tracker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Tracker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobTracker(JobTracker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Tracker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Tracker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskTracker(TaskTracker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDFS Name Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDFS Name Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDFSNameNode(HDFSNameNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDFS Data Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDFS Data Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDFSDataNode(HDFSDataNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hadoop Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hadoop Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopMaster(HadoopMaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hadoop Slave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hadoop Slave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopSlave(HadoopSlave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hadoop Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hadoop Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopCluster(HadoopCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HadoopmodelSwitch
