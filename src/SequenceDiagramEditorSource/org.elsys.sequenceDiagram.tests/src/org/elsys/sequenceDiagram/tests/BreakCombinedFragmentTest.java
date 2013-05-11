/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.tests;

import junit.textui.TestRunner;

import org.elsys.sequenceDiagram.BreakCombinedFragment;
import org.elsys.sequenceDiagram.SequenceDiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Break Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BreakCombinedFragmentTest extends OptionalCombinedFragmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BreakCombinedFragmentTest.class);
	}

	/**
	 * Constructs a new Break Combined Fragment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakCombinedFragmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Break Combined Fragment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BreakCombinedFragment getFixture() {
		return (BreakCombinedFragment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceDiagramFactory.eINSTANCE.createBreakCombinedFragment());
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

} //BreakCombinedFragmentTest
