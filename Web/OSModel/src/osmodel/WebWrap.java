
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link osmodel.WebWrap#getWeb_dependOn <em>Web depend On</em>}</li>
 *   <li>{@link osmodel.WebWrap#getWeb_connectTo <em>Web connect To</em>}</li>
 * </ul>
 * </p>
 *
 * @see osmodel.OsmodelPackage#getWebWrap()
 * @model
 * @generated
 */
public interface WebWrap extends Software
{
  /**
	 * Returns the value of the '<em><b>Web depend On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web depend On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web depend On</em>' reference.
	 * @see #setWeb_dependOn(PHPWrap)
	 * @see osmodel.OsmodelPackage#getWebWrap_Web_dependOn()
	 * @model required="true"
	 * @generated
	 */
	PHPWrap getWeb_dependOn();

	/**
	 * Sets the value of the '{@link osmodel.WebWrap#getWeb_dependOn <em>Web depend On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web depend On</em>' reference.
	 * @see #getWeb_dependOn()
	 * @generated
	 */
	void setWeb_dependOn(PHPWrap value);

	/**
	 * Returns the value of the '<em><b>Web connect To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web connect To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web connect To</em>' reference.
	 * @see #setWeb_connectTo(MySQLWrap)
	 * @see osmodel.OsmodelPackage#getWebWrap_Web_connectTo()
	 * @model required="true"
	 * @generated
	 */
	MySQLWrap getWeb_connectTo();

	/**
	 * Sets the value of the '{@link osmodel.WebWrap#getWeb_connectTo <em>Web connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web connect To</em>' reference.
	 * @see #getWeb_connectTo()
	 * @generated
	 */
	void setWeb_connectTo(MySQLWrap value);

} // WebWrap
