/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referential Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.ReferentialConstraint#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.ReferentialConstraint#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getReferentialConstraint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ReferentialConstraint extends EObject {
    /**
     * Returns the value of the '<em><b>Referenced Columns</b></em>' reference list.
     * The list contents are of type {@link org.emftext.language.sql.schema.Column}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Columns</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Columns</em>' reference list.
     * @see org.emftext.language.sql.schema.SchemaPackage#getReferentialConstraint_ReferencedColumns()
     * @model
     * @generated
     */
    EList<Column> getReferencedColumns();

    /**
     * Returns the value of the '<em><b>Referenced Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Table</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Table</em>' containment reference.
     * @see #setReferencedTable(TableReference)
     * @see org.emftext.language.sql.schema.SchemaPackage#getReferentialConstraint_ReferencedTable()
     * @model containment="true" required="true"
     * @generated
     */
    TableReference getReferencedTable();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.ReferentialConstraint#getReferencedTable <em>Referenced Table</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Table</em>' containment reference.
     * @see #getReferencedTable()
     * @generated
     */
    void setReferencedTable(TableReference value);

} // ReferentialConstraint
