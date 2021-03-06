/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import osmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see osmodel.OsmodelPackage
 * @generated
 */
public class OsmodelAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static OsmodelPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OsmodelAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = OsmodelPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OsmodelSwitch<Adapter> modelSwitch =
    new OsmodelSwitch<Adapter>() {
			@Override
			public Adapter caseClusterWrap(ClusterWrap object) {
				return createClusterWrapAdapter();
			}
			@Override
			public Adapter caseServerWrap(ServerWrap object) {
				return createServerWrapAdapter();
			}
			@Override
			public Adapter caseSoftware(Software object) {
				return createSoftwareAdapter();
			}
			@Override
			public Adapter caseWebWrap(WebWrap object) {
				return createWebWrapAdapter();
			}
			@Override
			public Adapter casePHPWrap(PHPWrap object) {
				return createPHPWrapAdapter();
			}
			@Override
			public Adapter caseApacheWrap(ApacheWrap object) {
				return createApacheWrapAdapter();
			}
			@Override
			public Adapter caseMySQLWrap(MySQLWrap object) {
				return createMySQLWrapAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link osmodel.ServerWrap <em>Server Wrap</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see osmodel.ServerWrap
	 * @generated
	 */
  public Adapter createServerWrapAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link osmodel.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see osmodel.Software
	 * @generated
	 */
	public Adapter createSoftwareAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link osmodel.ClusterWrap <em>Cluster Wrap</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see osmodel.ClusterWrap
	 * @generated
	 */
  public Adapter createClusterWrapAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link osmodel.WebWrap <em>Web Wrap</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see osmodel.WebWrap
	 * @generated
	 */
  public Adapter createWebWrapAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link osmodel.PHPWrap <em>PHP Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see osmodel.PHPWrap
	 * @generated
	 */
	public Adapter createPHPWrapAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link osmodel.ApacheWrap <em>Apache Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see osmodel.ApacheWrap
	 * @generated
	 */
	public Adapter createApacheWrapAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link osmodel.MySQLWrap <em>My SQL Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see osmodel.MySQLWrap
	 * @generated
	 */
	public Adapter createMySQLWrapAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //OsmodelAdapterFactory
