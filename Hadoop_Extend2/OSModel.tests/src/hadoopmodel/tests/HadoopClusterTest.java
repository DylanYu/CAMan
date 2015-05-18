/**
 */
package hadoopmodel.tests;

import hadoopmodel.HadoopCluster;
import hadoopmodel.HadoopmodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hadoop Cluster</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HadoopClusterTest extends HadoopMasterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HadoopClusterTest.class);
	}

	/**
	 * Constructs a new Hadoop Cluster test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopClusterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hadoop Cluster test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HadoopCluster getFixture() {
		return (HadoopCluster)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HadoopmodelFactory.eINSTANCE.createHadoopCluster());
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

} //HadoopClusterTest
