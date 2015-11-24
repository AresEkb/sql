/**
 */
package org.emftext.language.sql.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.common.SQLScript#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.common.CommonPackage#getSQLScript()
 * @model
 * @generated
 */
public interface SQLScript extends EObject {
    /**
     * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
     * The list contents are of type {@link org.emftext.language.sql.common.Statement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statements</em>' containment reference list.
     * @see org.emftext.language.sql.common.CommonPackage#getSQLScript_Statements()
     * @model containment="true"
     * @generated
     */
    EList<Statement> getStatements();

} // SQLScript
