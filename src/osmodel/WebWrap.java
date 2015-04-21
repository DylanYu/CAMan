
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
 * A representation of the model object '<em><b>Web Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link osmodel.WebWrap#getName <em>Name</em>}</li>
 *   <li>{@link osmodel.WebWrap#getStatus <em>Status</em>}</li>
 *   <li>{@link osmodel.WebWrap#getHostOn <em>Host On</em>}</li>
 *   <li>{@link osmodel.WebWrap#getBelongTo <em>Belong To</em>}</li>
 * </ul>
 * </p>
 *
 * @see osmodel.OsmodelPackage#getWebWrap()
 * @model
 * @generated
 */
public interface WebWrap extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"webapp"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see osmodel.OsmodelPackage#getWebWrap_Name()
   * @model default="webapp"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link osmodel.WebWrap#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The default value is <code>"-1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see #setStatus(int)
   * @see osmodel.OsmodelPackage#getWebWrap_Status()
   * @model default="-1"
   * @generated
   */
  int getStatus();

  /**
   * Sets the value of the '{@link osmodel.WebWrap#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(int value);

  /**
   * Returns the value of the '<em><b>Host On</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host On</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host On</em>' reference.
   * @see #setHostOn(ServerWrap)
   * @see osmodel.OsmodelPackage#getWebWrap_HostOn()
   * @model
   * @generated
   */
  ServerWrap getHostOn();

  /**
   * Sets the value of the '{@link osmodel.WebWrap#getHostOn <em>Host On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host On</em>' reference.
   * @see #getHostOn()
   * @generated
   */
  void setHostOn(ServerWrap value);

  /**
   * Returns the value of the '<em><b>Belong To</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link osmodel.ClusterWrap#getSoftwares <em>Softwares</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Belong To</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Belong To</em>' container reference.
   * @see #setBelongTo(ClusterWrap)
   * @see osmodel.OsmodelPackage#getWebWrap_BelongTo()
   * @see osmodel.ClusterWrap#getSoftwares
   * @model opposite="softwares" transient="false"
   * @generated
   */
  ClusterWrap getBelongTo();

  /**
   * Sets the value of the '{@link osmodel.WebWrap#getBelongTo <em>Belong To</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Belong To</em>' container reference.
   * @see #getBelongTo()
   * @generated
   */
  void setBelongTo(ClusterWrap value);

} // WebWrap
