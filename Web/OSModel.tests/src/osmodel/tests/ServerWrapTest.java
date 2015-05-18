/**
 */
package osmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import osmodel.OsmodelFactory;
import osmodel.ServerWrap;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server Wrap</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerWrapTest extends TestCase {

	/**
	 * The fixture for this Server Wrap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerWrap fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerWrapTest.class);
	}

	/**
	 * Constructs a new Server Wrap test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerWrapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Server Wrap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServerWrap fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Server Wrap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerWrap getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OsmodelFactory.eINSTANCE.createServerWrap());
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

} //ServerWrapTest
