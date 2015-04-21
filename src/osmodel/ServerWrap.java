
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
 *   <li>{@link osmodel.ServerWrap#getName <em>Name</em>}</li>
 *   <li>{@link osmodel.ServerWrap#getServerId <em>Server Id</em>}</li>
 *   <li>{@link osmodel.ServerWrap#getBelongTo <em>Belong To</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"vm"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see osmodel.OsmodelPackage#getServerWrap_Name()
   * @model default="vm"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link osmodel.ServerWrap#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Server Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server Id</em>' attribute.
   * @see #setServerId(String)
   * @see osmodel.OsmodelPackage#getServerWrap_ServerId()
   * @model
   * @generated
   */
  String getServerId();

  /**
   * Sets the value of the '{@link osmodel.ServerWrap#getServerId <em>Server Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server Id</em>' attribute.
   * @see #getServerId()
   * @generated
   */
  void setServerId(String value);

  /**
   * Returns the value of the '<em><b>Belong To</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link osmodel.ClusterWrap#getServers <em>Servers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Belong To</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Belong To</em>' container reference.
   * @see #setBelongTo(ClusterWrap)
   * @see osmodel.OsmodelPackage#getServerWrap_BelongTo()
   * @see osmodel.ClusterWrap#getServers
   * @model opposite="servers" transient="false"
   * @generated
   */
  ClusterWrap getBelongTo();

  /**
   * Sets the value of the '{@link osmodel.ServerWrap#getBelongTo <em>Belong To</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Belong To</em>' container reference.
   * @see #getBelongTo()
   * @generated
   */
  void setBelongTo(ClusterWrap value);

} // ServerWrap
