/**
 */
package hadoopmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.Cloud#getCloud_name <em>Cloud name</em>}</li>
 *   <li>{@link hadoopmodel.Cloud#getCloud_owner <em>Cloud owner</em>}</li>
 *   <li>{@link hadoopmodel.Cloud#getCloud_description <em>Cloud description</em>}</li>
 *   <li>{@link hadoopmodel.Cloud#getServer <em>Server</em>}</li>
 *   <li>{@link hadoopmodel.Cloud#getJava <em>Java</em>}</li>
 *   <li>{@link hadoopmodel.Cloud#getJobtracker <em>Jobtracker</em>}</li>
 *   <li>{@link hadoopmodel.Cloud#getTasktracker <em>Tasktracker</em>}</li>
 *   <li>{@link hadoopmodel.Cloud#getHdfsnamenode <em>Hdfsnamenode</em>}</li>
 *   <li>{@link hadoopmodel.Cloud#getHdfsdatanode <em>Hdfsdatanode</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getCloud()
 * @model
 * @generated
 */
public interface Cloud extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloud name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud name</em>' attribute.
	 * @see #setCloud_name(String)
	 * @see hadoopmodel.HadoopmodelPackage#getCloud_Cloud_name()
	 * @model default=""
	 * @generated
	 */
	String getCloud_name();

	/**
	 * Sets the value of the '{@link hadoopmodel.Cloud#getCloud_name <em>Cloud name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud name</em>' attribute.
	 * @see #getCloud_name()
	 * @generated
	 */
	void setCloud_name(String value);

	/**
	 * Returns the value of the '<em><b>Cloud owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud owner</em>' attribute.
	 * @see #setCloud_owner(String)
	 * @see hadoopmodel.HadoopmodelPackage#getCloud_Cloud_owner()
	 * @model
	 * @generated
	 */
	String getCloud_owner();

	/**
	 * Sets the value of the '{@link hadoopmodel.Cloud#getCloud_owner <em>Cloud owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud owner</em>' attribute.
	 * @see #getCloud_owner()
	 * @generated
	 */
	void setCloud_owner(String value);

	/**
	 * Returns the value of the '<em><b>Cloud description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud description</em>' attribute.
	 * @see #setCloud_description(String)
	 * @see hadoopmodel.HadoopmodelPackage#getCloud_Cloud_description()
	 * @model
	 * @generated
	 */
	String getCloud_description();

	/**
	 * Sets the value of the '{@link hadoopmodel.Cloud#getCloud_description <em>Cloud description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud description</em>' attribute.
	 * @see #getCloud_description()
	 * @generated
	 */
	void setCloud_description(String value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference list.
	 * The list contents are of type {@link hadoopmodel.Server}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference list.
	 * @see hadoopmodel.HadoopmodelPackage#getCloud_Server()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getServer();

	/**
	 * Returns the value of the '<em><b>Java</b></em>' containment reference list.
	 * The list contents are of type {@link hadoopmodel.Java}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java</em>' containment reference list.
	 * @see hadoopmodel.HadoopmodelPackage#getCloud_Java()
	 * @model containment="true"
	 * @generated
	 */
	EList<Java> getJava();

	/**
	 * Returns the value of the '<em><b>Jobtracker</b></em>' containment reference list.
	 * The list contents are of type {@link hadoopmodel.JobTracker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobtracker</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobtracker</em>' containment reference list.
	 * @see hadoopmodel.HadoopmodelPackage#getCloud_Jobtracker()
	 * @model containment="true"
	 * @generated
	 */
	EList<JobTracker> getJobtracker();

	/**
	 * Returns the value of the '<em><b>Tasktracker</b></em>' containment reference list.
	 * The list contents are of type {@link hadoopmodel.TaskTracker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasktracker</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktracker</em>' containment reference list.
	 * @see hadoopmodel.HadoopmodelPackage#getCloud_Tasktracker()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskTracker> getTasktracker();

	/**
	 * Returns the value of the '<em><b>Hdfsnamenode</b></em>' containment reference list.
	 * The list contents are of type {@link hadoopmodel.HDFSNameNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfsnamenode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfsnamenode</em>' containment reference list.
	 * @see hadoopmodel.HadoopmodelPackage#getCloud_Hdfsnamenode()
	 * @model containment="true"
	 * @generated
	 */
	EList<HDFSNameNode> getHdfsnamenode();

	/**
	 * Returns the value of the '<em><b>Hdfsdatanode</b></em>' containment reference list.
	 * The list contents are of type {@link hadoopmodel.HDFSDataNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfsdatanode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfsdatanode</em>' containment reference list.
	 * @see hadoopmodel.HadoopmodelPackage#getCloud_Hdfsdatanode()
	 * @model containment="true"
	 * @generated
	 */
	EList<HDFSDataNode> getHdfsdatanode();

} // Cloud
