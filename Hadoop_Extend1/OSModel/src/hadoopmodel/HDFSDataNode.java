/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDFS Data Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.HDFSDataNode#getHdfsdatanode_data_dir <em>Hdfsdatanode data dir</em>}</li>
 *   <li>{@link hadoopmodel.HDFSDataNode#getHdfsdatanode_connectTo <em>Hdfsdatanode connect To</em>}</li>
 *   <li>{@link hadoopmodel.HDFSDataNode#getHdfsdatanode_hostOn <em>Hdfsdatanode host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getHDFSDataNode()
 * @model
 * @generated
 */
public interface HDFSDataNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Hdfsdatanode data dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfsdatanode data dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfsdatanode data dir</em>' attribute.
	 * @see #setHdfsdatanode_data_dir(String)
	 * @see hadoopmodel.HadoopmodelPackage#getHDFSDataNode_Hdfsdatanode_data_dir()
	 * @model
	 * @generated
	 */
	String getHdfsdatanode_data_dir();

	/**
	 * Sets the value of the '{@link hadoopmodel.HDFSDataNode#getHdfsdatanode_data_dir <em>Hdfsdatanode data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdfsdatanode data dir</em>' attribute.
	 * @see #getHdfsdatanode_data_dir()
	 * @generated
	 */
	void setHdfsdatanode_data_dir(String value);

	/**
	 * Returns the value of the '<em><b>Hdfsdatanode connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfsdatanode connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfsdatanode connect To</em>' reference.
	 * @see #setHdfsdatanode_connectTo(HDFSNameNode)
	 * @see hadoopmodel.HadoopmodelPackage#getHDFSDataNode_Hdfsdatanode_connectTo()
	 * @model required="true"
	 * @generated
	 */
	HDFSNameNode getHdfsdatanode_connectTo();

	/**
	 * Sets the value of the '{@link hadoopmodel.HDFSDataNode#getHdfsdatanode_connectTo <em>Hdfsdatanode connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdfsdatanode connect To</em>' reference.
	 * @see #getHdfsdatanode_connectTo()
	 * @generated
	 */
	void setHdfsdatanode_connectTo(HDFSNameNode value);

	/**
	 * Returns the value of the '<em><b>Hdfsdatanode host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfsdatanode host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfsdatanode host On</em>' reference.
	 * @see #setHdfsdatanode_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getHDFSDataNode_Hdfsdatanode_hostOn()
	 * @model
	 * @generated
	 */
	Server getHdfsdatanode_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.HDFSDataNode#getHdfsdatanode_hostOn <em>Hdfsdatanode host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdfsdatanode host On</em>' reference.
	 * @see #getHdfsdatanode_hostOn()
	 * @generated
	 */
	void setHdfsdatanode_hostOn(Server value);

} // HDFSDataNode
