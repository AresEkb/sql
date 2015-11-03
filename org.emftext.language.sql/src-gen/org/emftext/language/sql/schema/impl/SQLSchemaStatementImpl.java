/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.common.impl.DirectSQLStatementImpl;

import org.emftext.language.sql.schema.SQLSchemaStatement;
import org.emftext.language.sql.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Schema Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SQLSchemaStatementImpl extends DirectSQLStatementImpl implements SQLSchemaStatement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SQLSchemaStatementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.SQL_SCHEMA_STATEMENT;
    }

} //SQLSchemaStatementImpl
