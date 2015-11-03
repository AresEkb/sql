/**
 */
package org.emftext.language.sql.schema;

import org.emftext.language.sql.SchemaQualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.TableConstraint#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getTableConstraint()
 * @model abstract="true"
 * @generated
 */
public interface TableConstraint extends TableElement {
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
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableConstraint_Name()
     * @model dataType="org.emftext.language.sql.common.SchemaQualifiedName"
     * @generated
     */
    SchemaQualifiedName getName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableConstraint#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(SchemaQualifiedName value);

} // TableConstraint
