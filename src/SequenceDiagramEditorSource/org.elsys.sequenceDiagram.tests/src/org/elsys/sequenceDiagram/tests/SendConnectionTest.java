/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.tests;

import junit.textui.TestRunner;

import org.elsys.sequenceDiagram.SendConnection;
import org.elsys.sequenceDiagram.SequenceDiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Send Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SendConnectionTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SendConnectionTest.class);
	}

	/**
	 * Constructs a new Send Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Send Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SendConnection getFixture() {
		return (SendConnection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequenceDiagramFactory.eINSTANCE.createSendConnection());
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

} //SendConnectionTest
