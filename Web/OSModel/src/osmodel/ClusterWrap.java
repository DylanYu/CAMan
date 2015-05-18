
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link osmodel.ClusterWrap#getServers <em>Servers</em>}</li>
 *   <li>{@link osmodel.ClusterWrap#getSoftwares <em>Softwares</em>}</li>
 *   <li>{@link osmodel.ClusterWrap#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see osmodel.OsmodelPackage#getClusterWrap()
 * @model annotation="http://www.sei.pku.edu.cn/rsa RootClass='true'"
 * @generated
 */
public interface ClusterWrap extends EObject
{
  /**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link osmodel.ServerWrap}.
	 * It is bidirectional and its opposite is '{@link osmodel.ServerWrap#getServer_belongTo <em>Server belong To</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see osmodel.OsmodelPackage#getClusterWrap_Servers()
	 * @see osmodel.ServerWrap#getServer_belongTo
	 * @model opposite="server_belongTo" containment="true" ordered="false"
	 * @generated
	 */
  EList<ServerWrap> getServers();

  /**
	 * Returns the value of the '<em><b>Softwares</b></em>' containment reference list.
	 * The list contents are of type {@link osmodel.Software}.
	 * It is bidirectional and its opposite is '{@link osmodel.Software#getSoftware_belongTo <em>Software belong To</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Softwares</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Softwares</em>' containment reference list.
	 * @see osmodel.OsmodelPackage#getClusterWrap_Softwares()
	 * @see osmodel.Software#getSoftware_belongTo
	 * @model opposite="software_belongTo" containment="true"
	 * @generated
	 */
  EList<Software> getSoftwares();

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"cluster"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see osmodel.OsmodelPackage#getClusterWrap_Name()
	 * @model default="cluster"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link osmodel.ClusterWrap#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // ClusterWrap
