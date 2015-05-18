/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import osmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see osmodel.OsmodelPackage
 * @generated
 */
public class OsmodelSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static OsmodelPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OsmodelSwitch()
  {
		if (modelPackage == null) {
			modelPackage = OsmodelPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

		/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
		protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case OsmodelPackage.CLUSTER_WRAP: {
				ClusterWrap clusterWrap = (ClusterWrap)theEObject;
				T result = caseClusterWrap(clusterWrap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsmodelPackage.SERVER_WRAP: {
				ServerWrap serverWrap = (ServerWrap)theEObject;
				T result = caseServerWrap(serverWrap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsmodelPackage.SOFTWARE: {
				Software software = (Software)theEObject;
				T result = caseSoftware(software);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsmodelPackage.WEB_WRAP: {
				WebWrap webWrap = (WebWrap)theEObject;
				T result = caseWebWrap(webWrap);
				if (result == null) result = caseSoftware(webWrap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsmodelPackage.PHP_WRAP: {
				PHPWrap phpWrap = (PHPWrap)theEObject;
				T result = casePHPWrap(phpWrap);
				if (result == null) result = caseSoftware(phpWrap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsmodelPackage.APACHE_WRAP: {
				ApacheWrap apacheWrap = (ApacheWrap)theEObject;
				T result = caseApacheWrap(apacheWrap);
				if (result == null) result = caseSoftware(apacheWrap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsmodelPackage.MY_SQL_WRAP: {
				MySQLWrap mySQLWrap = (MySQLWrap)theEObject;
				T result = caseMySQLWrap(mySQLWrap);
				if (result == null) result = caseSoftware(mySQLWrap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Server Wrap</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Wrap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseServerWrap(ServerWrap object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftware(Software object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Wrap</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Wrap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseClusterWrap(ClusterWrap object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Web Wrap</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Wrap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWebWrap(WebWrap object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PHP Wrap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHP Wrap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHPWrap(PHPWrap object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Apache Wrap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apache Wrap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApacheWrap(ApacheWrap object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>My SQL Wrap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My SQL Wrap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMySQLWrap(MySQLWrap object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
		public T defaultCase(EObject object)
  {
		return null;
	}

} //OsmodelSwitch
