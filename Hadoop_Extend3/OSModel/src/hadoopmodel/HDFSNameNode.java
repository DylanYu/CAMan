/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDFS Name Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.HDFSNameNode#getHdfsnamenode_data_dir <em>Hdfsnamenode data dir</em>}</li>
 *   <li>{@link hadoopmodel.HDFSNameNode#getHdfsnamenode_hostOn <em>Hdfsnamenode host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getHDFSNameNode()
 * @model
 * @generated
 */
public interface HDFSNameNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Hdfsnamenode data dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfsnamenode data dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfsnamenode data dir</em>' attribute.
	 * @see #setHdfsnamenode_data_dir(String)
	 * @see hadoopmodel.HadoopmodelPackage#getHDFSNameNode_Hdfsnamenode_data_dir()
	 * @model
	 * @generated
	 */
	String getHdfsnamenode_data_dir();

	/**
	 * Sets the value of the '{@link hadoopmodel.HDFSNameNode#getHdfsnamenode_data_dir <em>Hdfsnamenode data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdfsnamenode data dir</em>' attribute.
	 * @see #getHdfsnamenode_data_dir()
	 * @generated
	 */
	void setHdfsnamenode_data_dir(String value);

	/**
	 * Returns the value of the '<em><b>Hdfsnamenode host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfsnamenode host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfsnamenode host On</em>' reference.
	 * @see #setHdfsnamenode_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getHDFSNameNode_Hdfsnamenode_hostOn()
	 * @model
	 * @generated
	 */
	Server getHdfsnamenode_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.HDFSNameNode#getHdfsnamenode_hostOn <em>Hdfsnamenode host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdfsnamenode host On</em>' reference.
	 * @see #getHdfsnamenode_hostOn()
	 * @generated
	 */
	void setHdfsnamenode_hostOn(Server value);

} // HDFSNameNode
