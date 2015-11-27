/**
 */
package org.emftext.language.sql.schema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referential Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getReferentialTableConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='columnsMustBeCompatible'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot columnsMustBeCompatible='columns->size() = referencedColumns->size()'"
 * @generated
 */
public interface ReferentialTableConstraint extends ReferentialConstraint, TableColumnsConstraint {
} // ReferentialTableConstraint
