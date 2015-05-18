/**
 */
package hadoopmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hadoop Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.HadoopCluster#getHadoopcluster_master_hostOn <em>Hadoopcluster master host On</em>}</li>
 *   <li>{@link hadoopmodel.HadoopCluster#getHadoopcluster_slave_hostOn <em>Hadoopcluster slave host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getHadoopCluster()
 * @model
 * @generated
 */
public interface HadoopCluster extends HadoopMaster, HadoopSlave {
	/**
	 * Returns the value of the '<em><b>Hadoopcluster master host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hadoopcluster master host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hadoopcluster master host On</em>' reference.
	 * @see #setHadoopcluster_master_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getHadoopCluster_Hadoopcluster_master_hostOn()
	 * @model
	 * @generated
	 */
	Server getHadoopcluster_master_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.HadoopCluster#getHadoopcluster_master_hostOn <em>Hadoopcluster master host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hadoopcluster master host On</em>' reference.
	 * @see #getHadoopcluster_master_hostOn()
	 * @generated
	 */
	void setHadoopcluster_master_hostOn(Server value);

	/**
	 * Returns the value of the '<em><b>Hadoopcluster slave host On</b></em>' reference list.
	 * The list contents are of type {@link hadoopmodel.Server}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hadoopcluster slave host On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hadoopcluster slave host On</em>' reference list.
	 * @see hadoopmodel.HadoopmodelPackage#getHadoopCluster_Hadoopcluster_slave_hostOn()
	 * @model
	 * @generated
	 */
	EList<Server> getHadoopcluster_slave_hostOn();

} // HadoopCluster
