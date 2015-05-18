/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Tracker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.JobTracker#getJobtracker_data_dir <em>Jobtracker data dir</em>}</li>
 *   <li>{@link hadoopmodel.JobTracker#getJobtracker_dependOn <em>Jobtracker depend On</em>}</li>
 *   <li>{@link hadoopmodel.JobTracker#getJobtracker_hostOn <em>Jobtracker host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getJobTracker()
 * @model
 * @generated
 */
public interface JobTracker extends EObject {
	/**
	 * Returns the value of the '<em><b>Jobtracker data dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobtracker data dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobtracker data dir</em>' attribute.
	 * @see #setJobtracker_data_dir(String)
	 * @see hadoopmodel.HadoopmodelPackage#getJobTracker_Jobtracker_data_dir()
	 * @model
	 * @generated
	 */
	String getJobtracker_data_dir();

	/**
	 * Sets the value of the '{@link hadoopmodel.JobTracker#getJobtracker_data_dir <em>Jobtracker data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobtracker data dir</em>' attribute.
	 * @see #getJobtracker_data_dir()
	 * @generated
	 */
	void setJobtracker_data_dir(String value);

	/**
	 * Returns the value of the '<em><b>Jobtracker depend On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobtracker depend On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobtracker depend On</em>' reference.
	 * @see #setJobtracker_dependOn(HDFSNameNode)
	 * @see hadoopmodel.HadoopmodelPackage#getJobTracker_Jobtracker_dependOn()
	 * @model required="true"
	 * @generated
	 */
	HDFSNameNode getJobtracker_dependOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.JobTracker#getJobtracker_dependOn <em>Jobtracker depend On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobtracker depend On</em>' reference.
	 * @see #getJobtracker_dependOn()
	 * @generated
	 */
	void setJobtracker_dependOn(HDFSNameNode value);

	/**
	 * Returns the value of the '<em><b>Jobtracker host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobtracker host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobtracker host On</em>' reference.
	 * @see #setJobtracker_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getJobTracker_Jobtracker_hostOn()
	 * @model
	 * @generated
	 */
	Server getJobtracker_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.JobTracker#getJobtracker_hostOn <em>Jobtracker host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobtracker host On</em>' reference.
	 * @see #getJobtracker_hostOn()
	 * @generated
	 */
	void setJobtracker_hostOn(Server value);

} // JobTracker
