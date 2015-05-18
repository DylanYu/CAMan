/**
 */
package hadoopmodel.tests;

import hadoopmodel.HDFSDataNode;
import hadoopmodel.HadoopmodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HDFS Data Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HDFSDataNodeTest extends TestCase {

	/**
	 * The fixture for this HDFS Data Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDFSDataNode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HDFSDataNodeTest.class);
	}

	/**
	 * Constructs a new HDFS Data Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSDataNodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this HDFS Data Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HDFSDataNode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this HDFS Data Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDFSDataNode getFixture() {
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
		setFixture(HadoopmodelFactory.eINSTANCE.createHDFSDataNode());
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

} //HDFSDataNodeTest
