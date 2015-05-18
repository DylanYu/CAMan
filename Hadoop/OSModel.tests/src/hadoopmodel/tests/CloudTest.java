/**
 */
package hadoopmodel.tests;

import hadoopmodel.Cloud;
import hadoopmodel.HadoopmodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudTest extends TestCase {

	/**
	 * The fixture for this Cloud test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cloud fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CloudTest.class);
	}

	/**
	 * Constructs a new Cloud test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cloud test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Cloud fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cloud test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cloud getFixture() {
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
		setFixture(HadoopmodelFactory.eINSTANCE.createCloud());
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

} //CloudTest
