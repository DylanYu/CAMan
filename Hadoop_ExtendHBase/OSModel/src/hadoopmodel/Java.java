/**
 */
package hadoopmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hadoopmodel.Java#getJava_jdk_version <em>Java jdk version</em>}</li>
 *   <li>{@link hadoopmodel.Java#getJava_install_flavor <em>Java install flavor</em>}</li>
 *   <li>{@link hadoopmodel.Java#getJava_hostOn <em>Java host On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hadoopmodel.HadoopmodelPackage#getJava()
 * @model
 * @generated
 */
public interface Java extends EObject {
	/**
	 * Returns the value of the '<em><b>Java jdk version</b></em>' attribute.
	 * The default value is <code>"6"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java jdk version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java jdk version</em>' attribute.
	 * @see #setJava_jdk_version(String)
	 * @see hadoopmodel.HadoopmodelPackage#getJava_Java_jdk_version()
	 * @model default="6"
	 * @generated
	 */
	String getJava_jdk_version();

	/**
	 * Sets the value of the '{@link hadoopmodel.Java#getJava_jdk_version <em>Java jdk version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java jdk version</em>' attribute.
	 * @see #getJava_jdk_version()
	 * @generated
	 */
	void setJava_jdk_version(String value);

	/**
	 * Returns the value of the '<em><b>Java install flavor</b></em>' attribute.
	 * The default value is <code>"oracle"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java install flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java install flavor</em>' attribute.
	 * @see #setJava_install_flavor(String)
	 * @see hadoopmodel.HadoopmodelPackage#getJava_Java_install_flavor()
	 * @model default="oracle"
	 * @generated
	 */
	String getJava_install_flavor();

	/**
	 * Sets the value of the '{@link hadoopmodel.Java#getJava_install_flavor <em>Java install flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java install flavor</em>' attribute.
	 * @see #getJava_install_flavor()
	 * @generated
	 */
	void setJava_install_flavor(String value);

	/**
	 * Returns the value of the '<em><b>Java host On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java host On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java host On</em>' reference.
	 * @see #setJava_hostOn(Server)
	 * @see hadoopmodel.HadoopmodelPackage#getJava_Java_hostOn()
	 * @model
	 * @generated
	 */
	Server getJava_hostOn();

	/**
	 * Sets the value of the '{@link hadoopmodel.Java#getJava_hostOn <em>Java host On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java host On</em>' reference.
	 * @see #getJava_hostOn()
	 * @generated
	 */
	void setJava_hostOn(Server value);

} // Java
