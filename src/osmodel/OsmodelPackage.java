/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;



/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see osmodel.OsmodelFactory
 * @model kind="package"
 * @generated
 */
public interface OsmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "osmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sei.pku.edu.cn/rsa/osmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "osmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OsmodelPackage eINSTANCE = osmodel.impl.OsmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link osmodel.impl.ServerWrapImpl <em>Server Wrap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see osmodel.impl.ServerWrapImpl
   * @see osmodel.impl.OsmodelPackageImpl#getServerWrap()
   * @generated
   */
  int SERVER_WRAP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_WRAP__NAME = 0;

  /**
   * The feature id for the '<em><b>Server Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_WRAP__SERVER_ID = 1;

  /**
   * The feature id for the '<em><b>Belong To</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_WRAP__BELONG_TO = 2;

  /**
   * The number of structural features of the '<em>Server Wrap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_WRAP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link osmodel.impl.ClusterWrapImpl <em>Cluster Wrap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see osmodel.impl.ClusterWrapImpl
   * @see osmodel.impl.OsmodelPackageImpl#getClusterWrap()
   * @generated
   */
  int CLUSTER_WRAP = 1;

  /**
   * The feature id for the '<em><b>Servers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLUSTER_WRAP__SERVERS = 0;

  /**
   * The feature id for the '<em><b>Softwares</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLUSTER_WRAP__SOFTWARES = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLUSTER_WRAP__NAME = 2;

  /**
   * The number of structural features of the '<em>Cluster Wrap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLUSTER_WRAP_FEATURE_COUNT = 3;


  /**
   * The meta object id for the '{@link osmodel.impl.WebWrapImpl <em>Web Wrap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see osmodel.impl.WebWrapImpl
   * @see osmodel.impl.OsmodelPackageImpl#getWebWrap()
   * @generated
   */
  int WEB_WRAP = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_WRAP__NAME = 0;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_WRAP__STATUS = 1;

  /**
   * The feature id for the '<em><b>Host On</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_WRAP__HOST_ON = 2;

  /**
   * The feature id for the '<em><b>Belong To</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_WRAP__BELONG_TO = 3;

  /**
   * The number of structural features of the '<em>Web Wrap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_WRAP_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link osmodel.ServerWrap <em>Server Wrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Server Wrap</em>'.
   * @see osmodel.ServerWrap
   * @generated
   */
  EClass getServerWrap();

  /**
   * Returns the meta object for the attribute '{@link osmodel.ServerWrap#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see osmodel.ServerWrap#getName()
   * @see #getServerWrap()
   * @generated
   */
  EAttribute getServerWrap_Name();

  /**
   * Returns the meta object for the attribute '{@link osmodel.ServerWrap#getServerId <em>Server Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server Id</em>'.
   * @see osmodel.ServerWrap#getServerId()
   * @see #getServerWrap()
   * @generated
   */
  EAttribute getServerWrap_ServerId();

  /**
   * Returns the meta object for the container reference '{@link osmodel.ServerWrap#getBelongTo <em>Belong To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Belong To</em>'.
   * @see osmodel.ServerWrap#getBelongTo()
   * @see #getServerWrap()
   * @generated
   */
  EReference getServerWrap_BelongTo();

  /**
   * Returns the meta object for class '{@link osmodel.ClusterWrap <em>Cluster Wrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cluster Wrap</em>'.
   * @see osmodel.ClusterWrap
   * @generated
   */
  EClass getClusterWrap();

  /**
   * Returns the meta object for the containment reference list '{@link osmodel.ClusterWrap#getServers <em>Servers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servers</em>'.
   * @see osmodel.ClusterWrap#getServers()
   * @see #getClusterWrap()
   * @generated
   */
  EReference getClusterWrap_Servers();

  /**
   * Returns the meta object for the containment reference list '{@link osmodel.ClusterWrap#getSoftwares <em>Softwares</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Softwares</em>'.
   * @see osmodel.ClusterWrap#getSoftwares()
   * @see #getClusterWrap()
   * @generated
   */
  EReference getClusterWrap_Softwares();

  /**
   * Returns the meta object for the attribute '{@link osmodel.ClusterWrap#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see osmodel.ClusterWrap#getName()
   * @see #getClusterWrap()
   * @generated
   */
  EAttribute getClusterWrap_Name();

  /**
   * Returns the meta object for class '{@link osmodel.WebWrap <em>Web Wrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Wrap</em>'.
   * @see osmodel.WebWrap
   * @generated
   */
  EClass getWebWrap();

  /**
   * Returns the meta object for the attribute '{@link osmodel.WebWrap#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see osmodel.WebWrap#getName()
   * @see #getWebWrap()
   * @generated
   */
  EAttribute getWebWrap_Name();

  /**
   * Returns the meta object for the attribute '{@link osmodel.WebWrap#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see osmodel.WebWrap#getStatus()
   * @see #getWebWrap()
   * @generated
   */
  EAttribute getWebWrap_Status();

  /**
   * Returns the meta object for the reference '{@link osmodel.WebWrap#getHostOn <em>Host On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Host On</em>'.
   * @see osmodel.WebWrap#getHostOn()
   * @see #getWebWrap()
   * @generated
   */
  EReference getWebWrap_HostOn();

  /**
   * Returns the meta object for the container reference '{@link osmodel.WebWrap#getBelongTo <em>Belong To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Belong To</em>'.
   * @see osmodel.WebWrap#getBelongTo()
   * @see #getWebWrap()
   * @generated
   */
  EReference getWebWrap_BelongTo();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OsmodelFactory getOsmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link osmodel.impl.ServerWrapImpl <em>Server Wrap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see osmodel.impl.ServerWrapImpl
     * @see osmodel.impl.OsmodelPackageImpl#getServerWrap()
     * @generated
     */
    EClass SERVER_WRAP = eINSTANCE.getServerWrap();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_WRAP__NAME = eINSTANCE.getServerWrap_Name();

    /**
     * The meta object literal for the '<em><b>Server Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_WRAP__SERVER_ID = eINSTANCE.getServerWrap_ServerId();

    /**
     * The meta object literal for the '<em><b>Belong To</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVER_WRAP__BELONG_TO = eINSTANCE.getServerWrap_BelongTo();

    /**
     * The meta object literal for the '{@link osmodel.impl.ClusterWrapImpl <em>Cluster Wrap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see osmodel.impl.ClusterWrapImpl
     * @see osmodel.impl.OsmodelPackageImpl#getClusterWrap()
     * @generated
     */
    EClass CLUSTER_WRAP = eINSTANCE.getClusterWrap();

    /**
     * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLUSTER_WRAP__SERVERS = eINSTANCE.getClusterWrap_Servers();

    /**
     * The meta object literal for the '<em><b>Softwares</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLUSTER_WRAP__SOFTWARES = eINSTANCE.getClusterWrap_Softwares();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLUSTER_WRAP__NAME = eINSTANCE.getClusterWrap_Name();

    /**
     * The meta object literal for the '{@link osmodel.impl.WebWrapImpl <em>Web Wrap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see osmodel.impl.WebWrapImpl
     * @see osmodel.impl.OsmodelPackageImpl#getWebWrap()
     * @generated
     */
    EClass WEB_WRAP = eINSTANCE.getWebWrap();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_WRAP__NAME = eINSTANCE.getWebWrap_Name();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_WRAP__STATUS = eINSTANCE.getWebWrap_Status();

    /**
     * The meta object literal for the '<em><b>Host On</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_WRAP__HOST_ON = eINSTANCE.getWebWrap_HostOn();

    /**
     * The meta object literal for the '<em><b>Belong To</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_WRAP__BELONG_TO = eINSTANCE.getWebWrap_BelongTo();

  }

  /*Global utility methods are generated here*/
    
} //OsmodelPackage
