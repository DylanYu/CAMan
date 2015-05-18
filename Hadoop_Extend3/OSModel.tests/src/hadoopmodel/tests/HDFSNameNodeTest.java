/**
 */
package hadoopmodel.tests;

import hadoopmodel.HDFSNameNode;
import hadoopmodel.HadoopmodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HDFS Name Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HDFSNameNodeTest extends TestCase {

	/**
	 * The fixture for this HDFS Name Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDFSNameNode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HDFSNameNodeTest.class);
	}

	/**
	 * Constructs a new HDFS Name Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDFSNameNodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this HDFS Name Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HDFSNameNode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this HDFS Name Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDFSNameNode getFixture() {
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
		setFixture(HadoopmodelFactory.eINSTANCE.createHDFSNameNode());
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

} //HDFSNameNodeTest
