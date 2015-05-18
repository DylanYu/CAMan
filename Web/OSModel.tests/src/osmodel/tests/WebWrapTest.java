/**
 */
package osmodel.tests;

import junit.textui.TestRunner;

import osmodel.OsmodelFactory;
import osmodel.WebWrap;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Web Wrap</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebWrapTest extends SoftwareTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WebWrapTest.class);
	}

	/**
	 * Constructs a new Web Wrap test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebWrapTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Web Wrap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WebWrap getFixture() {
		return (WebWrap)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OsmodelFactory.eINSTANCE.createWebWrap());
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

} //WebWrapTest
