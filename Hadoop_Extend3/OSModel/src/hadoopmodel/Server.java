/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.Server#getServer_name <em>Server name</em>}</li>
 *   <li>{@link hadoopmodel.Server#getServer_id <em>Server id</em>}</li>
 *   <li>{@link hadoopmodel.Server#getServer_status <em>Server status</em>}</li>
 *   <li>{@link hadoopmodel.Server#getServer_adminpass <em>Server adminpass</em>}</li>
 *   <li>{@link hadoopmodel.Server#getServer_host <em>Server host</em>}</li>
 *   <li>{@link hadoopmodel.Server#getServer_vm_state <em>Server vm state</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject {
	/**
	 * Returns the value of the '<em><b>Server name</b></em>' attribute.
	 * The default value is <code>"vm"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server name</em>' attribute.
	 * @see #setServer_name(String)
	 * @see hadoopmodel.HadoopmodelPackage#getServer_Server_name()
	 * @model default="vm"
	 * @generated
	 */
	String getServer_name();

	/**
	 * Sets the value of the '{@link hadoopmodel.Server#getServer_name <em>Server name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server name</em>' attribute.
	 * @see #getServer_name()
	 * @generated
	 */
	void setServer_name(String value);

	/**
	 * Returns the value of the '<em><b>Server id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server id</em>' attribute.
	 * @see #setServer_id(String)
	 * @see hadoopmodel.HadoopmodelPackage#getServer_Server_id()
	 * @model
	 * @generated
	 */
	String getServer_id();

	/**
	 * Sets the value of the '{@link hadoopmodel.Server#getServer_id <em>Server id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server id</em>' attribute.
	 * @see #getServer_id()
	 * @generated
	 */
	void setServer_id(String value);

	/**
	 * Returns the value of the '<em><b>Server status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server status</em>' attribute.
	 * @see #setServer_status(String)
	 * @see hadoopmodel.HadoopmodelPackage#getServer_Server_status()
	 * @model
	 * @generated
	 */
	String getServer_status();

	/**
	 * Sets the value of the '{@link hadoopmodel.Server#getServer_status <em>Server status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server status</em>' attribute.
	 * @see #getServer_status()
	 * @generated
	 */
	void setServer_status(String value);

	/**
	 * Returns the value of the '<em><b>Server adminpass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server adminpass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server adminpass</em>' attribute.
	 * @see #setServer_adminpass(String)
	 * @see hadoopmodel.HadoopmodelPackage#getServer_Server_adminpass()
	 * @model
	 * @generated
	 */
	String getServer_adminpass();

	/**
	 * Sets the value of the '{@link hadoopmodel.Server#getServer_adminpass <em>Server adminpass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server adminpass</em>' attribute.
	 * @see #getServer_adminpass()
	 * @generated
	 */
	void setServer_adminpass(String value);

	/**
	 * Returns the value of the '<em><b>Server host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server host</em>' attribute.
	 * @see #setServer_host(String)
	 * @see hadoopmodel.HadoopmodelPackage#getServer_Server_host()
	 * @model
	 * @generated
	 */
	String getServer_host();

	/**
	 * Sets the value of the '{@link hadoopmodel.Server#getServer_host <em>Server host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server host</em>' attribute.
	 * @see #getServer_host()
	 * @generated
	 */
	void setServer_host(String value);

	/**
	 * Returns the value of the '<em><b>Server vm state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server vm state</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server vm state</em>' attribute.
	 * @see #setServer_vm_state(String)
	 * @see hadoopmodel.HadoopmodelPackage#getServer_Server_vm_state()
	 * @model
	 * @generated
	 */
	String getServer_vm_state();

	/**
	 * Sets the value of the '{@link hadoopmodel.Server#getServer_vm_state <em>Server vm state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server vm state</em>' attribute.
	 * @see #getServer_vm_state()
	 * @generated
	 */
	void setServer_vm_state(String value);

} // Server
