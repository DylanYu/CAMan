/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see osmodel.OsmodelPackage
 * @generated
 */
public interface OsmodelFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  OsmodelFactory eINSTANCE = osmodel.impl.OsmodelFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Server Wrap</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Wrap</em>'.
	 * @generated
	 */
  ServerWrap createServerWrap();

  /**
	 * Returns a new object of class '<em>Cluster Wrap</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Wrap</em>'.
	 * @generated
	 */
  ClusterWrap createClusterWrap();

  /**
	 * Returns a new object of class '<em>Web Wrap</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Wrap</em>'.
	 * @generated
	 */
  WebWrap createWebWrap();

  /**
	 * Returns a new object of class '<em>PHP Wrap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PHP Wrap</em>'.
	 * @generated
	 */
	PHPWrap createPHPWrap();

		/**
	 * Returns a new object of class '<em>Apache Wrap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apache Wrap</em>'.
	 * @generated
	 */
	ApacheWrap createApacheWrap();

		/**
	 * Returns a new object of class '<em>My SQL Wrap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My SQL Wrap</em>'.
	 * @generated
	 */
	MySQLWrap createMySQLWrap();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  OsmodelPackage getOsmodelPackage();

} //OsmodelFactory
