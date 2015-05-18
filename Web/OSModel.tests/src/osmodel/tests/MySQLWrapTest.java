/**
 */
package osmodel.tests;

import junit.textui.TestRunner;

import osmodel.MySQLWrap;
import osmodel.OsmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>My SQL Wrap</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MySQLWrapTest extends SoftwareTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MySQLWrapTest.class);
	}

	/**
	 * Constructs a new My SQL Wrap test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MySQLWrapTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this My SQL Wrap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MySQLWrap getFixture() {
		return (MySQLWrap)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OsmodelFactory.eINSTANCE.createMySQLWrap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MySQLWrapTest
