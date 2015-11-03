/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.UniqueTableConstraint#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getUniqueTableConstraint()
 * @model
 * @generated
 */
public interface UniqueTableConstraint extends TableConstraint, UniqueConstraint {
    /**
     * Returns the value of the '<em><b>Columns</b></em>' reference list.
     * The list contents are of type {@link org.emftext.language.sql.schema.Column}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Columns</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Columns</em>' reference list.
     * @see org.emftext.language.sql.schema.SchemaPackage#getUniqueTableConstraint_Columns()
     * @model required="true"
     * @generated
     */
    EList<Column> getColumns();

} // UniqueTableConstraint
