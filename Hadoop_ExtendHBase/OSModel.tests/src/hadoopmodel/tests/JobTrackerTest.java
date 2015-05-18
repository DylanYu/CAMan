/**
 */
package hadoopmodel.tests;

import hadoopmodel.HadoopmodelFactory;
import hadoopmodel.JobTracker;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Job Tracker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobTrackerTest extends TestCase {

	/**
	 * The fixture for this Job Tracker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobTracker fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JobTrackerTest.class);
	}

	/**
	 * Constructs a new Job Tracker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobTrackerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Job Tracker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(JobTracker fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Job Tracker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobTracker getFixture() {
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
		setFixture(HadoopmodelFactory.eINSTANCE.createJobTracker());
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

} //JobTrackerTest
