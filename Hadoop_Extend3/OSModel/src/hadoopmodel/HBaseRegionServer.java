/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HBase Region Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.HBaseRegionServer#getHbaseregionserver_name <em>Hbaseregionserver name</em>}</li>
 *   <li>{@link hadoopmodel.HBaseRegionServer#getHbaseregionserver_connectTo <em>Hbaseregionserver connect To</em>}</li>
 *   <li>{@link hadoopmodel.HBaseRegionServer#getHbaseregionserver_hostOn <em>Hbaseregionserver host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getHBaseRegionServer()
 * @model
 * @generated
 */
public interface HBaseRegionServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Hbaseregionserver name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hbaseregionserver name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hbaseregionserver name</em>' attribute.
	 * @see #setHbaseregionserver_name(String)
	 * @see hadoopmodel.HadoopmodelPackage#getHBaseRegionServer_Hbaseregionserver_name()
	 * @model
	 * @generated
	 */
	String getHbaseregionserver_name();

	/**
	 * Sets the value of the '{@link hadoopmodel.HBaseRegionServer#getHbaseregionserver_name <em>Hbaseregionserver name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hbaseregionserver name</em>' attribute.
	 * @see #getHbaseregionserver_name()
	 * @generated
	 */
	void setHbaseregionserver_name(String value);

	/**
	 * Returns the value of the '<em><b>Hbaseregionserver connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hbaseregionserver connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hbaseregionserver connect To</em>' reference.
	 * @see #setHbaseregionserver_connectTo(HBaseMaster)
	 * @see hadoopmodel.HadoopmodelPackage#getHBaseRegionServer_Hbaseregionserver_connectTo()
	 * @model required="true"
	 * @generated
	 */
	HBaseMaster getHbaseregionserver_connectTo();

	/**
	 * Sets the value of the '{@link hadoopmodel.HBaseRegionServer#getHbaseregionserver_connectTo <em>Hbaseregionserver connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hbaseregionserver connect To</em>' reference.
	 * @see #getHbaseregionserver_connectTo()
	 * @generated
	 */
	void setHbaseregionserver_connectTo(HBaseMaster value);

	/**
	 * Returns the value of the '<em><b>Hbaseregionserver host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hbaseregionserver host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hbaseregionserver host On</em>' reference.
	 * @see #setHbaseregionserver_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getHBaseRegionServer_Hbaseregionserver_hostOn()
	 * @model
	 * @generated
	 */
	Server getHbaseregionserver_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.HBaseRegionServer#getHbaseregionserver_hostOn <em>Hbaseregionserver host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hbaseregionserver host On</em>' reference.
	 * @see #getHbaseregionserver_hostOn()
	 * @generated
	 */
	void setHbaseregionserver_hostOn(Server value);

} // HBaseRegionServer
