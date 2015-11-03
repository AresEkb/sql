/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.schema.SQLSchemaDefinitionStatement;
import org.emftext.language.sql.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Schema Definition Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SQLSchemaDefinitionStatementImpl extends SQLSchemaStatementImpl
        implements SQLSchemaDefinitionStatement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SQLSchemaDefinitionStatementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.SQL_SCHEMA_DEFINITION_STATEMENT;
    }

} //SQLSchemaDefinitionStatementImpl
