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
import osmodel.MySQLWrap;
import osmodel.OsmodelFactory;
import osmodel.OsmodelPackage;
import osmodel.PHPWrap;
import osmodel.ServerWrap;
import osmodel.Software;
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
import osmodel.ApacheWrap;
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
	private EClass softwareEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phpWrapEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apacheWrapEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mySQLWrapEClass = null;

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
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OsmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
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
		OsmodelPackageImpl theOsmodelPackage = (OsmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OsmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OsmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOsmodelPackage.createPackageContents();

		// Initialize created meta-data
		theOsmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOsmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OsmodelPackage.eNS_URI, theOsmodelPackage);
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
	public EAttribute getServerWrap_Server_name() {
		return (EAttribute)serverWrapEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerWrap_Server_serverId() {
		return (EAttribute)serverWrapEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerWrap_Server_belongTo() {
		return (EReference)serverWrapEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftware() {
		return softwareEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Software_name() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Software_status() {
		return (EAttribute)softwareEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_Software_hostOn() {
		return (EReference)softwareEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_Software_belongTo() {
		return (EReference)softwareEClass.getEStructuralFeatures().get(3);
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
	public EReference getWebWrap_Web_dependOn() {
		return (EReference)webWrapEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebWrap_Web_connectTo() {
		return (EReference)webWrapEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPHPWrap() {
		return phpWrapEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPHPWrap_Php_dependOn() {
		return (EReference)phpWrapEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApacheWrap() {
		return apacheWrapEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMySQLWrap() {
		return mySQLWrapEClass;
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
		clusterWrapEClass = createEClass(CLUSTER_WRAP);
		createEReference(clusterWrapEClass, CLUSTER_WRAP__SERVERS);
		createEReference(clusterWrapEClass, CLUSTER_WRAP__SOFTWARES);
		createEAttribute(clusterWrapEClass, CLUSTER_WRAP__NAME);

		serverWrapEClass = createEClass(SERVER_WRAP);
		createEAttribute(serverWrapEClass, SERVER_WRAP__SERVER_NAME);
		createEAttribute(serverWrapEClass, SERVER_WRAP__SERVER_SERVER_ID);
		createEReference(serverWrapEClass, SERVER_WRAP__SERVER_BELONG_TO);

		softwareEClass = createEClass(SOFTWARE);
		createEAttribute(softwareEClass, SOFTWARE__SOFTWARE_NAME);
		createEAttribute(softwareEClass, SOFTWARE__SOFTWARE_STATUS);
		createEReference(softwareEClass, SOFTWARE__SOFTWARE_HOST_ON);
		createEReference(softwareEClass, SOFTWARE__SOFTWARE_BELONG_TO);

		webWrapEClass = createEClass(WEB_WRAP);
		createEReference(webWrapEClass, WEB_WRAP__WEB_DEPEND_ON);
		createEReference(webWrapEClass, WEB_WRAP__WEB_CONNECT_TO);

		phpWrapEClass = createEClass(PHP_WRAP);
		createEReference(phpWrapEClass, PHP_WRAP__PHP_DEPEND_ON);

		apacheWrapEClass = createEClass(APACHE_WRAP);

		mySQLWrapEClass = createEClass(MY_SQL_WRAP);
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
		webWrapEClass.getESuperTypes().add(this.getSoftware());
		phpWrapEClass.getESuperTypes().add(this.getSoftware());
		apacheWrapEClass.getESuperTypes().add(this.getSoftware());
		mySQLWrapEClass.getESuperTypes().add(this.getSoftware());

		// Initialize classes and features; add operations and parameters
		initEClass(clusterWrapEClass, ClusterWrap.class, "ClusterWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClusterWrap_Servers(), this.getServerWrap(), this.getServerWrap_Server_belongTo(), "servers", null, 0, -1, ClusterWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClusterWrap_Softwares(), this.getSoftware(), this.getSoftware_Software_belongTo(), "softwares", null, 0, -1, ClusterWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClusterWrap_Name(), ecorePackage.getEString(), "name", "cluster", 0, 1, ClusterWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverWrapEClass, ServerWrap.class, "ServerWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerWrap_Server_name(), ecorePackage.getEString(), "server_name", "vm", 0, 1, ServerWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerWrap_Server_serverId(), ecorePackage.getEString(), "server_serverId", null, 0, 1, ServerWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerWrap_Server_belongTo(), this.getClusterWrap(), this.getClusterWrap_Servers(), "server_belongTo", null, 0, 1, ServerWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareEClass, Software.class, "Software", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftware_Software_name(), ecorePackage.getEString(), "software_name", "", 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Software_status(), ecorePackage.getEInt(), "software_status", "-1", 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftware_Software_hostOn(), this.getServerWrap(), null, "software_hostOn", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftware_Software_belongTo(), this.getClusterWrap(), this.getClusterWrap_Softwares(), "software_belongTo", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webWrapEClass, WebWrap.class, "WebWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebWrap_Web_dependOn(), this.getPHPWrap(), null, "web_dependOn", null, 1, 1, WebWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebWrap_Web_connectTo(), this.getMySQLWrap(), null, "web_connectTo", null, 1, 1, WebWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phpWrapEClass, PHPWrap.class, "PHPWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPHPWrap_Php_dependOn(), this.getApacheWrap(), null, "php_dependOn", null, 1, 1, PHPWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apacheWrapEClass, ApacheWrap.class, "ApacheWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mySQLWrapEClass, MySQLWrap.class, "MySQLWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		   new String[] {
			 "RootClass", "true"
		   });
	}

  /*Global utility methods are generated here*/
    
} //OsmodelPackageImpl
