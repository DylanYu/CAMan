/**
 */
package osmodel.tests;

import junit.textui.TestRunner;

import osmodel.ApacheWrap;
import osmodel.OsmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Apache Wrap</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApacheWrapTest extends SoftwareTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApacheWrapTest.class);
	}

	/**
	 * Constructs a new Apache Wrap test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApacheWrapTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Apache Wrap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ApacheWrap getFixture() {
		return (ApacheWrap)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OsmodelFactory.eINSTANCE.createApacheWrap());
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

} //ApacheWrapTest
