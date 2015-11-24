/**
 */
package org.emftext.language.sql.schema.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.sql.common.DirectSQLStatement;
import org.emftext.language.sql.common.Statement;

import org.emftext.language.sql.schema.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.schema.SchemaPackage
 * @generated
 */
public class SchemaSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SchemaPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaSwitch() {
        if (modelPackage == null) {
            modelPackage = SchemaPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case SchemaPackage.TABLE_DEFINITION: {
            TableDefinition tableDefinition = (TableDefinition) theEObject;
            T result = caseTableDefinition(tableDefinition);
            if (result == null)
                result = caseSQLSchemaDefinitionStatement(tableDefinition);
            if (result == null)
                result = caseSQLSchemaStatement(tableDefinition);
            if (result == null)
                result = caseDirectSQLStatement(tableDefinition);
            if (result == null)
                result = caseStatement(tableDefinition);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.TABLE_ELEMENT_LIST: {
            TableElementList tableElementList = (TableElementList) theEObject;
            T result = caseTableElementList(tableElementList);
            if (result == null)
                result = caseTableContentsSource(tableElementList);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.TABLE_ELEMENT: {
            TableElement tableElement = (TableElement) theEObject;
            T result = caseTableElement(tableElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.COLUMN: {
            Column column = (Column) theEObject;
            T result = caseColumn(column);
            if (result == null)
                result = caseTableElement(column);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.TABLE_CONSTRAINT: {
            TableConstraint tableConstraint = (TableConstraint) theEObject;
            T result = caseTableConstraint(tableConstraint);
            if (result == null)
                result = caseTableElement(tableConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.TABLE_CONTENTS_SOURCE: {
            TableContentsSource tableContentsSource = (TableContentsSource) theEObject;
            T result = caseTableContentsSource(tableContentsSource);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.DEFAULT_OPTION: {
            DefaultOption defaultOption = (DefaultOption) theEObject;
            T result = caseDefaultOption(defaultOption);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.COLUMN_CONSTRAINT: {
            ColumnConstraint columnConstraint = (ColumnConstraint) theEObject;
            T result = caseColumnConstraint(columnConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT: {
            NotNullColumnConstraint notNullColumnConstraint = (NotNullColumnConstraint) theEObject;
            T result = caseNotNullColumnConstraint(notNullColumnConstraint);
            if (result == null)
                result = caseColumnConstraint(notNullColumnConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT: {
            UniqueColumnConstraint uniqueColumnConstraint = (UniqueColumnConstraint) theEObject;
            T result = caseUniqueColumnConstraint(uniqueColumnConstraint);
            if (result == null)
                result = caseUniqueConstraint(uniqueColumnConstraint);
            if (result == null)
                result = caseColumnConstraint(uniqueColumnConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT: {
            ReferentialColumnConstraint referentialColumnConstraint = (ReferentialColumnConstraint) theEObject;
            T result = caseReferentialColumnConstraint(referentialColumnConstraint);
            if (result == null)
                result = caseReferentialConstraint(referentialColumnConstraint);
            if (result == null)
                result = caseColumnConstraint(referentialColumnConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.SQL_SCHEMA_STATEMENT: {
            SQLSchemaStatement sqlSchemaStatement = (SQLSchemaStatement) theEObject;
            T result = caseSQLSchemaStatement(sqlSchemaStatement);
            if (result == null)
                result = caseDirectSQLStatement(sqlSchemaStatement);
            if (result == null)
                result = caseStatement(sqlSchemaStatement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.SQL_SCHEMA_DEFINITION_STATEMENT: {
            SQLSchemaDefinitionStatement sqlSchemaDefinitionStatement = (SQLSchemaDefinitionStatement) theEObject;
            T result = caseSQLSchemaDefinitionStatement(sqlSchemaDefinitionStatement);
            if (result == null)
                result = caseSQLSchemaStatement(sqlSchemaDefinitionStatement);
            if (result == null)
                result = caseDirectSQLStatement(sqlSchemaDefinitionStatement);
            if (result == null)
                result = caseStatement(sqlSchemaDefinitionStatement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.LITERAL_DEFAULT_OPTION: {
            LiteralDefaultOption literalDefaultOption = (LiteralDefaultOption) theEObject;
            T result = caseLiteralDefaultOption(literalDefaultOption);
            if (result == null)
                result = caseDefaultOption(literalDefaultOption);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION: {
            DatetimeValueFunctionDefaultOption datetimeValueFunctionDefaultOption = (DatetimeValueFunctionDefaultOption) theEObject;
            T result = caseDatetimeValueFunctionDefaultOption(datetimeValueFunctionDefaultOption);
            if (result == null)
                result = caseDefaultOption(datetimeValueFunctionDefaultOption);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION: {
            ImplicitlyTypedValueSpecificationDefaultOption implicitlyTypedValueSpecificationDefaultOption = (ImplicitlyTypedValueSpecificationDefaultOption) theEObject;
            T result = caseImplicitlyTypedValueSpecificationDefaultOption(
                    implicitlyTypedValueSpecificationDefaultOption);
            if (result == null)
                result = caseDefaultOption(implicitlyTypedValueSpecificationDefaultOption);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT: {
            UniqueTableConstraint uniqueTableConstraint = (UniqueTableConstraint) theEObject;
            T result = caseUniqueTableConstraint(uniqueTableConstraint);
            if (result == null)
                result = caseUniqueConstraint(uniqueTableConstraint);
            if (result == null)
                result = caseTableColumnsConstraint(uniqueTableConstraint);
            if (result == null)
                result = caseTableConstraint(uniqueTableConstraint);
            if (result == null)
                result = caseTableElement(uniqueTableConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT: {
            ReferentialTableConstraint referentialTableConstraint = (ReferentialTableConstraint) theEObject;
            T result = caseReferentialTableConstraint(referentialTableConstraint);
            if (result == null)
                result = caseReferentialConstraint(referentialTableConstraint);
            if (result == null)
                result = caseTableColumnsConstraint(referentialTableConstraint);
            if (result == null)
                result = caseTableConstraint(referentialTableConstraint);
            if (result == null)
                result = caseTableElement(referentialTableConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.UNIQUE_CONSTRAINT: {
            UniqueConstraint uniqueConstraint = (UniqueConstraint) theEObject;
            T result = caseUniqueConstraint(uniqueConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.REFERENTIAL_CONSTRAINT: {
            ReferentialConstraint referentialConstraint = (ReferentialConstraint) theEObject;
            T result = caseReferentialConstraint(referentialConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.TABLE_REFERENCE: {
            TableReference tableReference = (TableReference) theEObject;
            T result = caseTableReference(tableReference);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case SchemaPackage.TABLE_COLUMNS_CONSTRAINT: {
            TableColumnsConstraint tableColumnsConstraint = (TableColumnsConstraint) theEObject;
            T result = caseTableColumnsConstraint(tableColumnsConstraint);
            if (result == null)
                result = caseTableConstraint(tableColumnsConstraint);
            if (result == null)
                result = caseTableElement(tableColumnsConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTableDefinition(TableDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Element List</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Element List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTableElementList(TableElementList object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTableElement(TableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Column</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColumn(Column object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTableConstraint(TableConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Contents Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Contents Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTableContentsSource(TableContentsSource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Default Option</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Default Option</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefaultOption(DefaultOption object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Column Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Column Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColumnConstraint(ColumnConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Not Null Column Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Not Null Column Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNotNullColumnConstraint(NotNullColumnConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unique Column Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unique Column Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUniqueColumnConstraint(UniqueColumnConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Referential Column Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referential Column Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferentialColumnConstraint(ReferentialColumnConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SQL Schema Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SQL Schema Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSQLSchemaStatement(SQLSchemaStatement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SQL Schema Definition Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SQL Schema Definition Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSQLSchemaDefinitionStatement(SQLSchemaDefinitionStatement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Literal Default Option</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Literal Default Option</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiteralDefaultOption(LiteralDefaultOption object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datetime Value Function Default Option</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datetime Value Function Default Option</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDatetimeValueFunctionDefaultOption(DatetimeValueFunctionDefaultOption object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Implicitly Typed Value Specification Default Option</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implicitly Typed Value Specification Default Option</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImplicitlyTypedValueSpecificationDefaultOption(ImplicitlyTypedValueSpecificationDefaultOption object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unique Table Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unique Table Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUniqueTableConstraint(UniqueTableConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Referential Table Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referential Table Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferentialTableConstraint(ReferentialTableConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unique Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unique Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUniqueConstraint(UniqueConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Referential Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referential Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferentialConstraint(ReferentialConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTableReference(TableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Columns Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Columns Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTableColumnsConstraint(TableColumnsConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatement(Statement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Direct SQL Statement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Direct SQL Statement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDirectSQLStatement(DirectSQLStatement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //SchemaSwitch
