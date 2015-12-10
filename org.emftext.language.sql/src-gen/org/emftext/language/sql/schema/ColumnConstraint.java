/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.common.SchemaQualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.ColumnConstraint#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.ColumnConstraint#getSchemaQualifiedName <em>Schema Qualified Name</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getColumnConstraint()
 * @model abstract="true"
 * @generated
 */
public interface ColumnConstraint extends EObject {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.emftext.language.sql.schema.Column#getConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' container reference.
     * @see #setOwner(Column)
     * @see org.emftext.language.sql.schema.SchemaPackage#getColumnConstraint_Owner()
     * @see org.emftext.language.sql.schema.Column#getConstraint
     * @model opposite="constraint" required="true" transient="false"
     * @generated
     */
    Column getOwner();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.ColumnConstraint#getOwner <em>Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' container reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(Column value);

    /**
     * Returns the value of the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Qualified Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Qualified Name</em>' containment reference.
     * @see #setSchemaQualifiedName(SchemaQualifiedName)
     * @see org.emftext.language.sql.schema.SchemaPackage#getColumnConstraint_SchemaQualifiedName()
     * @model containment="true"
     * @generated
     */
    SchemaQualifiedName getSchemaQualifiedName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.ColumnConstraint#getSchemaQualifiedName <em>Schema Qualified Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Qualified Name</em>' containment reference.
     * @see #getSchemaQualifiedName()
     * @generated
     */
    void setSchemaQualifiedName(SchemaQualifiedName value);

} // ColumnConstraint
