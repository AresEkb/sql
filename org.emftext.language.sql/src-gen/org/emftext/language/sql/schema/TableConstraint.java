/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.common.SchemaQualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.TableConstraint#getSchemaQualifiedName <em>Schema Qualified Name</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getTableConstraint()
 * @model abstract="true"
 * @generated
 */
public interface TableConstraint extends TableElement, EObject {
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
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableConstraint_SchemaQualifiedName()
     * @model containment="true"
     * @generated
     */
    SchemaQualifiedName getSchemaQualifiedName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableConstraint#getSchemaQualifiedName <em>Schema Qualified Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Qualified Name</em>' containment reference.
     * @see #getSchemaQualifiedName()
     * @generated
     */
    void setSchemaQualifiedName(SchemaQualifiedName value);

} // TableConstraint
