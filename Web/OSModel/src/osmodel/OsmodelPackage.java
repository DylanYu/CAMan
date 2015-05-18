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
  int SERVER_WRAP = 1;

  /**
	 * The meta object id for the '{@link osmodel.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see osmodel.impl.SoftwareImpl
	 * @see osmodel.impl.OsmodelPackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 2;

		/**
	 * The meta object id for the '{@link osmodel.impl.ClusterWrapImpl <em>Cluster Wrap</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see osmodel.impl.ClusterWrapImpl
	 * @see osmodel.impl.OsmodelPackageImpl#getClusterWrap()
	 * @generated
	 */
  int CLUSTER_WRAP = 0;

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
	 * The feature id for the '<em><b>Server name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_WRAP__SERVER_NAME = 0;

		/**
	 * The feature id for the '<em><b>Server server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_WRAP__SERVER_SERVER_ID = 1;

		/**
	 * The feature id for the '<em><b>Server belong To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_WRAP__SERVER_BELONG_TO = 2;

		/**
	 * The number of structural features of the '<em>Server Wrap</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SERVER_WRAP_FEATURE_COUNT = 3;

		/**
	 * The feature id for the '<em><b>Software name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SOFTWARE_NAME = 0;

		/**
	 * The feature id for the '<em><b>Software status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SOFTWARE_STATUS = 1;

		/**
	 * The feature id for the '<em><b>Software host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SOFTWARE_HOST_ON = 2;

		/**
	 * The feature id for the '<em><b>Software belong To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SOFTWARE_BELONG_TO = 3;

		/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 4;


  /**
	 * The meta object id for the '{@link osmodel.impl.WebWrapImpl <em>Web Wrap</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see osmodel.impl.WebWrapImpl
	 * @see osmodel.impl.OsmodelPackageImpl#getWebWrap()
	 * @generated
	 */
  int WEB_WRAP = 3;

  /**
	 * The feature id for the '<em><b>Software name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_WRAP__SOFTWARE_NAME = SOFTWARE__SOFTWARE_NAME;

		/**
	 * The feature id for the '<em><b>Software status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_WRAP__SOFTWARE_STATUS = SOFTWARE__SOFTWARE_STATUS;

		/**
	 * The feature id for the '<em><b>Software host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_WRAP__SOFTWARE_HOST_ON = SOFTWARE__SOFTWARE_HOST_ON;

		/**
	 * The feature id for the '<em><b>Software belong To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_WRAP__SOFTWARE_BELONG_TO = SOFTWARE__SOFTWARE_BELONG_TO;

		/**
	 * The feature id for the '<em><b>Web depend On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_WRAP__WEB_DEPEND_ON = SOFTWARE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Web connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_WRAP__WEB_CONNECT_TO = SOFTWARE_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Web Wrap</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_WRAP_FEATURE_COUNT = SOFTWARE_FEATURE_COUNT + 2;


  /**
	 * The meta object id for the '{@link osmodel.impl.PHPWrapImpl <em>PHP Wrap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see osmodel.impl.PHPWrapImpl
	 * @see osmodel.impl.OsmodelPackageImpl#getPHPWrap()
	 * @generated
	 */
	int PHP_WRAP = 4;

		/**
	 * The feature id for the '<em><b>Software name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHP_WRAP__SOFTWARE_NAME = SOFTWARE__SOFTWARE_NAME;

		/**
	 * The feature id for the '<em><b>Software status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHP_WRAP__SOFTWARE_STATUS = SOFTWARE__SOFTWARE_STATUS;

		/**
	 * The feature id for the '<em><b>Software host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHP_WRAP__SOFTWARE_HOST_ON = SOFTWARE__SOFTWARE_HOST_ON;

		/**
	 * The feature id for the '<em><b>Software belong To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHP_WRAP__SOFTWARE_BELONG_TO = SOFTWARE__SOFTWARE_BELONG_TO;

		/**
	 * The feature id for the '<em><b>Php depend On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHP_WRAP__PHP_DEPEND_ON = SOFTWARE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>PHP Wrap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHP_WRAP_FEATURE_COUNT = SOFTWARE_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link osmodel.impl.ApacheWrapImpl <em>Apache Wrap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see osmodel.impl.ApacheWrapImpl
	 * @see osmodel.impl.OsmodelPackageImpl#getApacheWrap()
	 * @generated
	 */
	int APACHE_WRAP = 5;

		/**
	 * The feature id for the '<em><b>Software name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_WRAP__SOFTWARE_NAME = SOFTWARE__SOFTWARE_NAME;

		/**
	 * The feature id for the '<em><b>Software status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_WRAP__SOFTWARE_STATUS = SOFTWARE__SOFTWARE_STATUS;

		/**
	 * The feature id for the '<em><b>Software host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_WRAP__SOFTWARE_HOST_ON = SOFTWARE__SOFTWARE_HOST_ON;

		/**
	 * The feature id for the '<em><b>Software belong To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_WRAP__SOFTWARE_BELONG_TO = SOFTWARE__SOFTWARE_BELONG_TO;

		/**
	 * The number of structural features of the '<em>Apache Wrap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APACHE_WRAP_FEATURE_COUNT = SOFTWARE_FEATURE_COUNT + 0;

		/**
	 * The meta object id for the '{@link osmodel.impl.MySQLWrapImpl <em>My SQL Wrap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see osmodel.impl.MySQLWrapImpl
	 * @see osmodel.impl.OsmodelPackageImpl#getMySQLWrap()
	 * @generated
	 */
	int MY_SQL_WRAP = 6;

		/**
	 * The feature id for the '<em><b>Software name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL_WRAP__SOFTWARE_NAME = SOFTWARE__SOFTWARE_NAME;

		/**
	 * The feature id for the '<em><b>Software status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL_WRAP__SOFTWARE_STATUS = SOFTWARE__SOFTWARE_STATUS;

		/**
	 * The feature id for the '<em><b>Software host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL_WRAP__SOFTWARE_HOST_ON = SOFTWARE__SOFTWARE_HOST_ON;

		/**
	 * The feature id for the '<em><b>Software belong To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL_WRAP__SOFTWARE_BELONG_TO = SOFTWARE__SOFTWARE_BELONG_TO;

		/**
	 * The number of structural features of the '<em>My SQL Wrap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL_WRAP_FEATURE_COUNT = SOFTWARE_FEATURE_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link osmodel.ServerWrap#getServer_name <em>Server name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server name</em>'.
	 * @see osmodel.ServerWrap#getServer_name()
	 * @see #getServerWrap()
	 * @generated
	 */
	EAttribute getServerWrap_Server_name();

		/**
	 * Returns the meta object for the attribute '{@link osmodel.ServerWrap#getServer_serverId <em>Server server Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server server Id</em>'.
	 * @see osmodel.ServerWrap#getServer_serverId()
	 * @see #getServerWrap()
	 * @generated
	 */
	EAttribute getServerWrap_Server_serverId();

		/**
	 * Returns the meta object for the container reference '{@link osmodel.ServerWrap#getServer_belongTo <em>Server belong To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Server belong To</em>'.
	 * @see osmodel.ServerWrap#getServer_belongTo()
	 * @see #getServerWrap()
	 * @generated
	 */
	EReference getServerWrap_Server_belongTo();

		/**
	 * Returns the meta object for class '{@link osmodel.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see osmodel.Software
	 * @generated
	 */
	EClass getSoftware();

		/**
	 * Returns the meta object for the attribute '{@link osmodel.Software#getSoftware_name <em>Software name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software name</em>'.
	 * @see osmodel.Software#getSoftware_name()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Software_name();

		/**
	 * Returns the meta object for the attribute '{@link osmodel.Software#getSoftware_status <em>Software status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software status</em>'.
	 * @see osmodel.Software#getSoftware_status()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Software_status();

		/**
	 * Returns the meta object for the reference '{@link osmodel.Software#getSoftware_hostOn <em>Software host On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software host On</em>'.
	 * @see osmodel.Software#getSoftware_hostOn()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Software_hostOn();

		/**
	 * Returns the meta object for the container reference '{@link osmodel.Software#getSoftware_belongTo <em>Software belong To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Software belong To</em>'.
	 * @see osmodel.Software#getSoftware_belongTo()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Software_belongTo();

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
	 * Returns the meta object for the reference '{@link osmodel.WebWrap#getWeb_dependOn <em>Web depend On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web depend On</em>'.
	 * @see osmodel.WebWrap#getWeb_dependOn()
	 * @see #getWebWrap()
	 * @generated
	 */
	EReference getWebWrap_Web_dependOn();

		/**
	 * Returns the meta object for the reference '{@link osmodel.WebWrap#getWeb_connectTo <em>Web connect To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web connect To</em>'.
	 * @see osmodel.WebWrap#getWeb_connectTo()
	 * @see #getWebWrap()
	 * @generated
	 */
	EReference getWebWrap_Web_connectTo();

		/**
	 * Returns the meta object for class '{@link osmodel.PHPWrap <em>PHP Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHP Wrap</em>'.
	 * @see osmodel.PHPWrap
	 * @generated
	 */
	EClass getPHPWrap();

		/**
	 * Returns the meta object for the reference '{@link osmodel.PHPWrap#getPhp_dependOn <em>Php depend On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Php depend On</em>'.
	 * @see osmodel.PHPWrap#getPhp_dependOn()
	 * @see #getPHPWrap()
	 * @generated
	 */
	EReference getPHPWrap_Php_dependOn();

		/**
	 * Returns the meta object for class '{@link osmodel.ApacheWrap <em>Apache Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apache Wrap</em>'.
	 * @see osmodel.ApacheWrap
	 * @generated
	 */
	EClass getApacheWrap();

		/**
	 * Returns the meta object for class '{@link osmodel.MySQLWrap <em>My SQL Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My SQL Wrap</em>'.
	 * @see osmodel.MySQLWrap
	 * @generated
	 */
	EClass getMySQLWrap();

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
		 * The meta object literal for the '<em><b>Server name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_WRAP__SERVER_NAME = eINSTANCE.getServerWrap_Server_name();

				/**
		 * The meta object literal for the '<em><b>Server server Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_WRAP__SERVER_SERVER_ID = eINSTANCE.getServerWrap_Server_serverId();

				/**
		 * The meta object literal for the '<em><b>Server belong To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_WRAP__SERVER_BELONG_TO = eINSTANCE.getServerWrap_Server_belongTo();

				/**
		 * The meta object literal for the '{@link osmodel.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see osmodel.impl.SoftwareImpl
		 * @see osmodel.impl.OsmodelPackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

				/**
		 * The meta object literal for the '<em><b>Software name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__SOFTWARE_NAME = eINSTANCE.getSoftware_Software_name();

				/**
		 * The meta object literal for the '<em><b>Software status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__SOFTWARE_STATUS = eINSTANCE.getSoftware_Software_status();

				/**
		 * The meta object literal for the '<em><b>Software host On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__SOFTWARE_HOST_ON = eINSTANCE.getSoftware_Software_hostOn();

				/**
		 * The meta object literal for the '<em><b>Software belong To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__SOFTWARE_BELONG_TO = eINSTANCE.getSoftware_Software_belongTo();

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
		 * The meta object literal for the '<em><b>Web depend On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_WRAP__WEB_DEPEND_ON = eINSTANCE.getWebWrap_Web_dependOn();

				/**
		 * The meta object literal for the '<em><b>Web connect To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_WRAP__WEB_CONNECT_TO = eINSTANCE.getWebWrap_Web_connectTo();

				/**
		 * The meta object literal for the '{@link osmodel.impl.PHPWrapImpl <em>PHP Wrap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see osmodel.impl.PHPWrapImpl
		 * @see osmodel.impl.OsmodelPackageImpl#getPHPWrap()
		 * @generated
		 */
		EClass PHP_WRAP = eINSTANCE.getPHPWrap();

				/**
		 * The meta object literal for the '<em><b>Php depend On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHP_WRAP__PHP_DEPEND_ON = eINSTANCE.getPHPWrap_Php_dependOn();

				/**
		 * The meta object literal for the '{@link osmodel.impl.ApacheWrapImpl <em>Apache Wrap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see osmodel.impl.ApacheWrapImpl
		 * @see osmodel.impl.OsmodelPackageImpl#getApacheWrap()
		 * @generated
		 */
		EClass APACHE_WRAP = eINSTANCE.getApacheWrap();

				/**
		 * The meta object literal for the '{@link osmodel.impl.MySQLWrapImpl <em>My SQL Wrap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see osmodel.impl.MySQLWrapImpl
		 * @see osmodel.impl.OsmodelPackageImpl#getMySQLWrap()
		 * @generated
		 */
		EClass MY_SQL_WRAP = eINSTANCE.getMySQLWrap();

  }

  /*Global utility methods are generated here*/
    
} //OsmodelPackage
