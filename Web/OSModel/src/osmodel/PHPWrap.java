/**
 */
package osmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PHP Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link osmodel.PHPWrap#getPhp_dependOn <em>Php depend On</em>}</li>
 * </ul>
 * </p>
 *
 * @see osmodel.OsmodelPackage#getPHPWrap()
 * @model
 * @generated
 */
public interface PHPWrap extends Software {
	/**
	 * Returns the value of the '<em><b>Php depend On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Php depend On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Php depend On</em>' reference.
	 * @see #setPhp_dependOn(ApacheWrap)
	 * @see osmodel.OsmodelPackage#getPHPWrap_Php_dependOn()
	 * @model required="true"
	 * @generated
	 */
	ApacheWrap getPhp_dependOn();

	/**
	 * Sets the value of the '{@link osmodel.PHPWrap#getPhp_dependOn <em>Php depend On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Php depend On</em>' reference.
	 * @see #getPhp_dependOn()
	 * @generated
	 */
	void setPhp_dependOn(ApacheWrap value);

} // PHPWrap
