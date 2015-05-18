
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link osmodel.ServerWrap#getServer_name <em>Server name</em>}</li>
 *   <li>{@link osmodel.ServerWrap#getServer_serverId <em>Server server Id</em>}</li>
 *   <li>{@link osmodel.ServerWrap#getServer_belongTo <em>Server belong To</em>}</li>
 * </ul>
 * </p>
 *
 * @see osmodel.OsmodelPackage#getServerWrap()
 * @model
 * @generated
 */
public interface ServerWrap extends EObject
{
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
	 * @see osmodel.OsmodelPackage#getServerWrap_Server_name()
	 * @model default="vm"
	 * @generated
	 */
	String getServer_name();

	/**
	 * Sets the value of the '{@link osmodel.ServerWrap#getServer_name <em>Server name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server name</em>' attribute.
	 * @see #getServer_name()
	 * @generated
	 */
	void setServer_name(String value);

	/**
	 * Returns the value of the '<em><b>Server server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server server Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server server Id</em>' attribute.
	 * @see #setServer_serverId(String)
	 * @see osmodel.OsmodelPackage#getServerWrap_Server_serverId()
	 * @model
	 * @generated
	 */
	String getServer_serverId();

	/**
	 * Sets the value of the '{@link osmodel.ServerWrap#getServer_serverId <em>Server server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server server Id</em>' attribute.
	 * @see #getServer_serverId()
	 * @generated
	 */
	void setServer_serverId(String value);

	/**
	 * Returns the value of the '<em><b>Server belong To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link osmodel.ClusterWrap#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server belong To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server belong To</em>' container reference.
	 * @see #setServer_belongTo(ClusterWrap)
	 * @see osmodel.OsmodelPackage#getServerWrap_Server_belongTo()
	 * @see osmodel.ClusterWrap#getServers
	 * @model opposite="servers" transient="false"
	 * @generated
	 */
	ClusterWrap getServer_belongTo();

	/**
	 * Sets the value of the '{@link osmodel.ServerWrap#getServer_belongTo <em>Server belong To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server belong To</em>' container reference.
	 * @see #getServer_belongTo()
	 * @generated
	 */
	void setServer_belongTo(ClusterWrap value);

} // ServerWrap
