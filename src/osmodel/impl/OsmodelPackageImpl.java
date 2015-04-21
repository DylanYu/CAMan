/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import osmodel.ClusterWrap;
import osmodel.OsmodelFactory;
import osmodel.OsmodelPackage;
import osmodel.ServerWrap;
import osmodel.WebWrap;
import java.util.LinkedList;
import java.util.List;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.compute.Flavor;
import org.openstack4j.model.compute.Server;
import org.openstack4j.model.image.Image;
import org.openstack4j.openstack.OSFactory;
import org.openstack4j.model.compute.ActionResponse;
import os.OS;
import java.util.*;
import org.openstack4j.model.compute.actions.*;
import org.openstack4j.model.compute.*;
import org.openstack4j.model.image.*;
import os.*;
import web.*;
import util.*;
import org.apache.commons.configuration.*;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsmodelPackageImpl extends EPackageImpl implements OsmodelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serverWrapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clusterWrapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass webWrapEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see osmodel.OsmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OsmodelPackageImpl()
  {
    super(eNS_URI, OsmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OsmodelPackage init()
  {
    if (isInited) return (OsmodelPackage)EPackage.Registry.INSTANCE.getEPackage(OsmodelPackage.eNS_URI);

    // Obtain or create and register package
    OsmodelPackageImpl theOsmodelPackage = (OsmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OsmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OsmodelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOsmodelPackage.createPackageContents();

    // Initialize created meta-data
    theOsmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOsmodelPackage.freeze();

    return theOsmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServerWrap()
  {
    return serverWrapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServerWrap_Name()
  {
    return (EAttribute)serverWrapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServerWrap_ServerId()
  {
    return (EAttribute)serverWrapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServerWrap_BelongTo()
  {
    return (EReference)serverWrapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClusterWrap()
  {
    return clusterWrapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClusterWrap_Servers()
  {
    return (EReference)clusterWrapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClusterWrap_Softwares()
  {
    return (EReference)clusterWrapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClusterWrap_Name()
  {
    return (EAttribute)clusterWrapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWebWrap()
  {
    return webWrapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebWrap_Name()
  {
    return (EAttribute)webWrapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebWrap_Status()
  {
    return (EAttribute)webWrapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebWrap_HostOn()
  {
    return (EReference)webWrapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebWrap_BelongTo()
  {
    return (EReference)webWrapEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OsmodelFactory getOsmodelFactory()
  {
    return (OsmodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    serverWrapEClass = createEClass(SERVER_WRAP);
    createEAttribute(serverWrapEClass, SERVER_WRAP__NAME);
    createEAttribute(serverWrapEClass, SERVER_WRAP__SERVER_ID);
    createEReference(serverWrapEClass, SERVER_WRAP__BELONG_TO);

    clusterWrapEClass = createEClass(CLUSTER_WRAP);
    createEReference(clusterWrapEClass, CLUSTER_WRAP__SERVERS);
    createEReference(clusterWrapEClass, CLUSTER_WRAP__SOFTWARES);
    createEAttribute(clusterWrapEClass, CLUSTER_WRAP__NAME);

    webWrapEClass = createEClass(WEB_WRAP);
    createEAttribute(webWrapEClass, WEB_WRAP__NAME);
    createEAttribute(webWrapEClass, WEB_WRAP__STATUS);
    createEReference(webWrapEClass, WEB_WRAP__HOST_ON);
    createEReference(webWrapEClass, WEB_WRAP__BELONG_TO);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(serverWrapEClass, ServerWrap.class, "ServerWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServerWrap_Name(), ecorePackage.getEString(), "name", "vm", 0, 1, ServerWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServerWrap_ServerId(), ecorePackage.getEString(), "serverId", null, 0, 1, ServerWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServerWrap_BelongTo(), this.getClusterWrap(), this.getClusterWrap_Servers(), "belongTo", null, 0, 1, ServerWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clusterWrapEClass, ClusterWrap.class, "ClusterWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClusterWrap_Servers(), this.getServerWrap(), this.getServerWrap_BelongTo(), "servers", null, 0, -1, ClusterWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClusterWrap_Softwares(), this.getWebWrap(), this.getWebWrap_BelongTo(), "softwares", null, 0, -1, ClusterWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClusterWrap_Name(), ecorePackage.getEString(), "name", "cluster", 0, 1, ClusterWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(webWrapEClass, WebWrap.class, "WebWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWebWrap_Name(), ecorePackage.getEString(), "name", "webapp", 0, 1, WebWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWebWrap_Status(), ecorePackage.getEInt(), "status", "-1", 0, 1, WebWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWebWrap_HostOn(), this.getServerWrap(), null, "hostOn", null, 0, 1, WebWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWebWrap_BelongTo(), this.getClusterWrap(), this.getClusterWrap_Softwares(), "belongTo", null, 0, 1, WebWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.sei.pku.edu.cn/rsa
    createRsaAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.sei.pku.edu.cn/rsa</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createRsaAnnotations()
  {
    String source = "http://www.sei.pku.edu.cn/rsa";		
    addAnnotation
      (clusterWrapEClass, 
       source, 
       new String[] 
       {
       "RootClass", "true"
       });
  }

  /*Global utility methods are generated here*/
    
} //OsmodelPackageImpl
