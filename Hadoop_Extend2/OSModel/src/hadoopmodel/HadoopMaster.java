/**
 */
package hadoopmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hadoop Master</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.HadoopMaster#getHadoopmaster_hostOn <em>Hadoopmaster host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getHadoopMaster()
 * @model
 * @generated
 */
public interface HadoopMaster extends Java, HDFSNameNode, JobTracker {
	/**
	 * Returns the value of the '<em><b>Hadoopmaster host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hadoopmaster host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hadoopmaster host On</em>' reference.
	 * @see #setHadoopmaster_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getHadoopMaster_Hadoopmaster_hostOn()
	 * @model
	 * @generated
	 */
	Server getHadoopmaster_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.HadoopMaster#getHadoopmaster_hostOn <em>Hadoopmaster host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hadoopmaster host On</em>' reference.
	 * @see #getHadoopmaster_hostOn()
	 * @generated
	 */
	void setHadoopmaster_hostOn(Server value);

} // HadoopMaster
