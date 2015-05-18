/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Tracker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.TaskTracker#getTasktracker_data_dir <em>Tasktracker data dir</em>}</li>
 *   <li>{@link hadoopmodel.TaskTracker#getTasktracker_connectTo <em>Tasktracker connect To</em>}</li>
 *   <li>{@link hadoopmodel.TaskTracker#getTasktracker_hostOn <em>Tasktracker host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getTaskTracker()
 * @model
 * @generated
 */
public interface TaskTracker extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasktracker data dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasktracker data dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktracker data dir</em>' attribute.
	 * @see #setTasktracker_data_dir(String)
	 * @see hadoopmodel.HadoopmodelPackage#getTaskTracker_Tasktracker_data_dir()
	 * @model
	 * @generated
	 */
	String getTasktracker_data_dir();

	/**
	 * Sets the value of the '{@link hadoopmodel.TaskTracker#getTasktracker_data_dir <em>Tasktracker data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasktracker data dir</em>' attribute.
	 * @see #getTasktracker_data_dir()
	 * @generated
	 */
	void setTasktracker_data_dir(String value);

	/**
	 * Returns the value of the '<em><b>Tasktracker connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasktracker connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktracker connect To</em>' reference.
	 * @see #setTasktracker_connectTo(JobTracker)
	 * @see hadoopmodel.HadoopmodelPackage#getTaskTracker_Tasktracker_connectTo()
	 * @model required="true"
	 * @generated
	 */
	JobTracker getTasktracker_connectTo();

	/**
	 * Sets the value of the '{@link hadoopmodel.TaskTracker#getTasktracker_connectTo <em>Tasktracker connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasktracker connect To</em>' reference.
	 * @see #getTasktracker_connectTo()
	 * @generated
	 */
	void setTasktracker_connectTo(JobTracker value);

	/**
	 * Returns the value of the '<em><b>Tasktracker host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasktracker host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktracker host On</em>' reference.
	 * @see #setTasktracker_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getTaskTracker_Tasktracker_hostOn()
	 * @model
	 * @generated
	 */
	Server getTasktracker_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.TaskTracker#getTasktracker_hostOn <em>Tasktracker host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasktracker host On</em>' reference.
	 * @see #getTasktracker_hostOn()
	 * @generated
	 */
	void setTasktracker_hostOn(Server value);

} // TaskTracker
