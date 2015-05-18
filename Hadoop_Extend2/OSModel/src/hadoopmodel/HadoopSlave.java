/**
 */
package hadoopmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hadoop Slave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.HadoopSlave#getHadoopslave_connectTo <em>Hadoopslave connect To</em>}</li>
 *   <li>{@link hadoopmodel.HadoopSlave#getHadoopslave_hostOn <em>Hadoopslave host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getHadoopSlave()
 * @model
 * @generated
 */
public interface HadoopSlave extends Java, HDFSDataNode, TaskTracker {
	/**
	 * Returns the value of the '<em><b>Hadoopslave connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hadoopslave connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hadoopslave connect To</em>' reference.
	 * @see #setHadoopslave_connectTo(HadoopMaster)
	 * @see hadoopmodel.HadoopmodelPackage#getHadoopSlave_Hadoopslave_connectTo()
	 * @model required="true"
	 * @generated
	 */
	HadoopMaster getHadoopslave_connectTo();

	/**
	 * Sets the value of the '{@link hadoopmodel.HadoopSlave#getHadoopslave_connectTo <em>Hadoopslave connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hadoopslave connect To</em>' reference.
	 * @see #getHadoopslave_connectTo()
	 * @generated
	 */
	void setHadoopslave_connectTo(HadoopMaster value);

	/**
	 * Returns the value of the '<em><b>Hadoopslave host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hadoopslave host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hadoopslave host On</em>' reference.
	 * @see #setHadoopslave_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getHadoopSlave_Hadoopslave_hostOn()
	 * @model
	 * @generated
	 */
	Server getHadoopslave_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.HadoopSlave#getHadoopslave_hostOn <em>Hadoopslave host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hadoopslave host On</em>' reference.
	 * @see #getHadoopslave_hostOn()
	 * @generated
	 */
	void setHadoopslave_hostOn(Server value);

} // HadoopSlave
