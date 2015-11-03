/**
 */
package org.emftext.language.sql.common.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emftext.language.sql.common.CommonPackage;
import org.emftext.language.sql.common.DirectSQLStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct SQL Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DirectSQLStatementImpl extends MinimalEObjectImpl.Container implements DirectSQLStatement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DirectSQLStatementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CommonPackage.Literals.DIRECT_SQL_STATEMENT;
    }

} //DirectSQLStatementImpl
