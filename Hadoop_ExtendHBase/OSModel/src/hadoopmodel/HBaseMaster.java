/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HBase Master</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.HBaseMaster#getHbasemaster_rootdir <em>Hbasemaster rootdir</em>}</li>
 *   <li>{@link hadoopmodel.HBaseMaster#getHbasemaster_dependOn <em>Hbasemaster depend On</em>}</li>
 *   <li>{@link hadoopmodel.HBaseMaster#getHbasemaster_hostOn <em>Hbasemaster host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getHBaseMaster()
 * @model
 * @generated
 */
public interface HBaseMaster extends EObject {
	/**
	 * Returns the value of the '<em><b>Hbasemaster rootdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hbasemaster rootdir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hbasemaster rootdir</em>' attribute.
	 * @see #setHbasemaster_rootdir(String)
	 * @see hadoopmodel.HadoopmodelPackage#getHBaseMaster_Hbasemaster_rootdir()
	 * @model
	 * @generated
	 */
	String getHbasemaster_rootdir();

	/**
	 * Sets the value of the '{@link hadoopmodel.HBaseMaster#getHbasemaster_rootdir <em>Hbasemaster rootdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hbasemaster rootdir</em>' attribute.
	 * @see #getHbasemaster_rootdir()
	 * @generated
	 */
	void setHbasemaster_rootdir(String value);

	/**
	 * Returns the value of the '<em><b>Hbasemaster depend On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hbasemaster depend On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hbasemaster depend On</em>' reference.
	 * @see #setHbasemaster_dependOn(HDFSNameNode)
	 * @see hadoopmodel.HadoopmodelPackage#getHBaseMaster_Hbasemaster_dependOn()
	 * @model
	 * @generated
	 */
	HDFSNameNode getHbasemaster_dependOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.HBaseMaster#getHbasemaster_dependOn <em>Hbasemaster depend On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hbasemaster depend On</em>' reference.
	 * @see #getHbasemaster_dependOn()
	 * @generated
	 */
	void setHbasemaster_dependOn(HDFSNameNode value);

	/**
	 * Returns the value of the '<em><b>Hbasemaster host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hbasemaster host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hbasemaster host On</em>' reference.
	 * @see #setHbasemaster_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getHBaseMaster_Hbasemaster_hostOn()
	 * @model
	 * @generated
	 */
	Server getHbasemaster_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.HBaseMaster#getHbasemaster_hostOn <em>Hbasemaster host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hbasemaster host On</em>' reference.
	 * @see #getHbasemaster_hostOn()
	 * @generated
	 */
	void setHbasemaster_hostOn(Server value);

} // HBaseMaster
