/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.schema.NotNullColumnConstraint;
import org.emftext.language.sql.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Null Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NotNullColumnConstraintImpl extends ColumnConstraintImpl implements NotNullColumnConstraint {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NotNullColumnConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.NOT_NULL_COLUMN_CONSTRAINT;
    }

} //NotNullColumnConstraintImpl
