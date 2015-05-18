/**
 */
package osmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link osmodel.Software#getSoftware_name <em>Software name</em>}</li>
 *   <li>{@link osmodel.Software#getSoftware_status <em>Software status</em>}</li>
 *   <li>{@link osmodel.Software#getSoftware_hostOn <em>Software host On</em>}</li>
 *   <li>{@link osmodel.Software#getSoftware_belongTo <em>Software belong To</em>}</li>
 * </ul>
 * </p>
 *
 * @see osmodel.OsmodelPackage#getSoftware()
 * @model abstract="true"
 * @generated
 */
public interface Software extends EObject {
	/**
	 * Returns the value of the '<em><b>Software name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software name</em>' attribute.
	 * @see #setSoftware_name(String)
	 * @see osmodel.OsmodelPackage#getSoftware_Software_name()
	 * @model default=""
	 * @generated
	 */
	String getSoftware_name();

	/**
	 * Sets the value of the '{@link osmodel.Software#getSoftware_name <em>Software name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software name</em>' attribute.
	 * @see #getSoftware_name()
	 * @generated
	 */
	void setSoftware_name(String value);

	/**
	 * Returns the value of the '<em><b>Software status</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software status</em>' attribute.
	 * @see #setSoftware_status(int)
	 * @see osmodel.OsmodelPackage#getSoftware_Software_status()
	 * @model default="-1"
	 * @generated
	 */
	int getSoftware_status();

	/**
	 * Sets the value of the '{@link osmodel.Software#getSoftware_status <em>Software status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software status</em>' attribute.
	 * @see #getSoftware_status()
	 * @generated
	 */
	void setSoftware_status(int value);

	/**
	 * Returns the value of the '<em><b>Software host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software host On</em>' reference.
	 * @see #setSoftware_hostOn(ServerWrap)
	 * @see osmodel.OsmodelPackage#getSoftware_Software_hostOn()
	 * @model
	 * @generated
	 */
	ServerWrap getSoftware_hostOn();

	/**
	 * Sets the value of the '{@link osmodel.Software#getSoftware_hostOn <em>Software host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software host On</em>' reference.
	 * @see #getSoftware_hostOn()
	 * @generated
	 */
	void setSoftware_hostOn(ServerWrap value);

	/**
	 * Returns the value of the '<em><b>Software belong To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link osmodel.ClusterWrap#getSoftwares <em>Softwares</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software belong To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software belong To</em>' container reference.
	 * @see #setSoftware_belongTo(ClusterWrap)
	 * @see osmodel.OsmodelPackage#getSoftware_Software_belongTo()
	 * @see osmodel.ClusterWrap#getSoftwares
	 * @model opposite="softwares" transient="false"
	 * @generated
	 */
	ClusterWrap getSoftware_belongTo();

	/**
	 * Sets the value of the '{@link osmodel.Software#getSoftware_belongTo <em>Software belong To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software belong To</em>' container reference.
	 * @see #getSoftware_belongTo()
	 * @generated
	 */
	void setSoftware_belongTo(ClusterWrap value);

} // Software
