/**
 */
package org.emftext.language.sql.schema;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

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

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='columns->size() = referencedColumns->size()'"
     * @generated
     */
    boolean columnsMustBeCompatible2(DiagnosticChain diagnostics, Map<Object, Object> context);
} // ReferentialTableConstraint
