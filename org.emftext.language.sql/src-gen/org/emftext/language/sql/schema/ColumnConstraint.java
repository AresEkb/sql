/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.SchemaQualifiedName;

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
 *   <li>{@link org.emftext.language.sql.schema.ColumnConstraint#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getColumnConstraint()
 * @model abstract="true"
 * @generated
 */
public interface ColumnConstraint extends EObject {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.emftext.language.sql.schema.Column#getConstraintDefinition <em>Constraint Definition</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' container reference.
     * @see #setOwner(Column)
     * @see org.emftext.language.sql.schema.SchemaPackage#getColumnConstraint_Owner()
     * @see org.emftext.language.sql.schema.Column#getConstraintDefinition
     * @model opposite="constraintDefinition" required="true" transient="false"
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
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(SchemaQualifiedName)
     * @see org.emftext.language.sql.schema.SchemaPackage#getColumnConstraint_Name()
     * @model dataType="org.emftext.language.sql.common.SchemaQualifiedName"
     * @generated
     */
    SchemaQualifiedName getName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.ColumnConstraint#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(SchemaQualifiedName value);

} // ColumnConstraint
