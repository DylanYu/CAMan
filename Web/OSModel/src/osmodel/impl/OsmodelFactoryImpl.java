/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import osmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsmodelFactoryImpl extends EFactoryImpl implements OsmodelFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static OsmodelFactory init()
  {
		try {
			OsmodelFactory theOsmodelFactory = (OsmodelFactory)EPackage.Registry.INSTANCE.getEFactory(OsmodelPackage.eNS_URI);
			if (theOsmodelFactory != null) {
				return theOsmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsmodelFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OsmodelFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case OsmodelPackage.CLUSTER_WRAP: return createClusterWrap();
			case OsmodelPackage.SERVER_WRAP: return createServerWrap();
			case OsmodelPackage.WEB_WRAP: return createWebWrap();
			case OsmodelPackage.PHP_WRAP: return createPHPWrap();
			case OsmodelPackage.APACHE_WRAP: return createApacheWrap();
			case OsmodelPackage.MY_SQL_WRAP: return createMySQLWrap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ServerWrap createServerWrap()
  {
		ServerWrapImpl serverWrap = new ServerWrapImpl();
		return serverWrap;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ClusterWrap createClusterWrap()
  {
		ClusterWrapImpl clusterWrap = new ClusterWrapImpl();
		return clusterWrap;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WebWrap createWebWrap()
  {
		WebWrapImpl webWrap = new WebWrapImpl();
		return webWrap;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHPWrap createPHPWrap() {
		PHPWrapImpl phpWrap = new PHPWrapImpl();
		return phpWrap;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApacheWrap createApacheWrap() {
		ApacheWrapImpl apacheWrap = new ApacheWrapImpl();
		return apacheWrap;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MySQLWrap createMySQLWrap() {
		MySQLWrapImpl mySQLWrap = new MySQLWrapImpl();
		return mySQLWrap;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OsmodelPackage getOsmodelPackage()
  {
		return (OsmodelPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static OsmodelPackage getPackage()
  {
		return OsmodelPackage.eINSTANCE;
	}

} //OsmodelFactoryImpl
