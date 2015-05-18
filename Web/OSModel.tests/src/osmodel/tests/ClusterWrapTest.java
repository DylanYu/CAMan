/**
 */
package osmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import osmodel.ClusterWrap;
import osmodel.OsmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cluster Wrap</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClusterWrapTest extends TestCase {

	/**
	 * The fixture for this Cluster Wrap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterWrap fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClusterWrapTest.class);
	}

	/**
	 * Constructs a new Cluster Wrap test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterWrapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cluster Wrap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ClusterWrap fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cluster Wrap test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterWrap getFixture() {
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
		setFixture(OsmodelFactory.eINSTANCE.createClusterWrap());
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

} //ClusterWrapTest
