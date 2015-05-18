/**
 */
package hadoopmodel.util;

import hadoopmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hadoopmodel.HadoopmodelPackage
 * @generated
 */
public class HadoopmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HadoopmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HadoopmodelPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
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
	protected HadoopmodelSwitch<Adapter> modelSwitch =
		new HadoopmodelSwitch<Adapter>() {
			@Override
			public Adapter caseCloud(Cloud object) {
				return createCloudAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseJava(Java object) {
				return createJavaAdapter();
			}
			@Override
			public Adapter caseJobTracker(JobTracker object) {
				return createJobTrackerAdapter();
			}
			@Override
			public Adapter caseTaskTracker(TaskTracker object) {
				return createTaskTrackerAdapter();
			}
			@Override
			public Adapter caseHDFSNameNode(HDFSNameNode object) {
				return createHDFSNameNodeAdapter();
			}
			@Override
			public Adapter caseHDFSDataNode(HDFSDataNode object) {
				return createHDFSDataNodeAdapter();
			}
			@Override
			public Adapter caseHadoopMaster(HadoopMaster object) {
				return createHadoopMasterAdapter();
			}
			@Override
			public Adapter caseHadoopSlave(HadoopSlave object) {
				return createHadoopSlaveAdapter();
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hadoopmodel.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hadoopmodel.Cloud
	 * @generated
	 */
	public Adapter createCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hadoopmodel.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hadoopmodel.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hadoopmodel.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hadoopmodel.Java
	 * @generated
	 */
	public Adapter createJavaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hadoopmodel.JobTracker <em>Job Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hadoopmodel.JobTracker
	 * @generated
	 */
	public Adapter createJobTrackerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hadoopmodel.TaskTracker <em>Task Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hadoopmodel.TaskTracker
	 * @generated
	 */
	public Adapter createTaskTrackerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hadoopmodel.HDFSNameNode <em>HDFS Name Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hadoopmodel.HDFSNameNode
	 * @generated
	 */
	public Adapter createHDFSNameNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hadoopmodel.HDFSDataNode <em>HDFS Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hadoopmodel.HDFSDataNode
	 * @generated
	 */
	public Adapter createHDFSDataNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hadoopmodel.HadoopMaster <em>Hadoop Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hadoopmodel.HadoopMaster
	 * @generated
	 */
	public Adapter createHadoopMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hadoopmodel.HadoopSlave <em>Hadoop Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hadoopmodel.HadoopSlave
	 * @generated
	 */
	public Adapter createHadoopSlaveAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HadoopmodelAdapterFactory
