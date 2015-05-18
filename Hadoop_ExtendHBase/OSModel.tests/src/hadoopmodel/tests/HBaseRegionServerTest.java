/**
 */
package hadoopmodel.tests;

import hadoopmodel.HBaseRegionServer;
import hadoopmodel.HadoopmodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HBase Region Server</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HBaseRegionServerTest extends TestCase {

	/**
	 * The fixture for this HBase Region Server test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBaseRegionServer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HBaseRegionServerTest.class);
	}

	/**
	 * Constructs a new HBase Region Server test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HBaseRegionServerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this HBase Region Server test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HBaseRegionServer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this HBase Region Server test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBaseRegionServer getFixture() {
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
		setFixture(HadoopmodelFactory.eINSTANCE.createHBaseRegionServer());
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

} //HBaseRegionServerTest
