/**
 */
package org.emftext.language.sql.common.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.sql.common.*;

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
 * @see org.emftext.language.sql.common.CommonPackage
 * @generated
 */
public class CommonSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CommonPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommonSwitch() {
        if (modelPackage == null) {
            modelPackage = CommonPackage.eINSTANCE;
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
        case CommonPackage.SQL_SCRIPT: {
            SQLScript sqlScript = (SQLScript) theEObject;
            T result = caseSQLScript(sqlScript);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CommonPackage.DIRECT_SQL_STATEMENT: {
            DirectSQLStatement directSQLStatement = (DirectSQLStatement) theEObject;
            T result = caseDirectSQLStatement(directSQLStatement);
            if (result == null)
                result = caseStatement(directSQLStatement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CommonPackage.SEPARATOR: {
            Separator separator = (Separator) theEObject;
            T result = caseSeparator(separator);
            if (result == null)
                result = caseStatement(separator);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CommonPackage.COMMENT: {
            Comment comment = (Comment) theEObject;
            T result = caseComment(comment);
            if (result == null)
                result = caseSeparator(comment);
            if (result == null)
                result = caseStatement(comment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CommonPackage.SIMPLE_COMMENT: {
            SimpleComment simpleComment = (SimpleComment) theEObject;
            T result = caseSimpleComment(simpleComment);
            if (result == null)
                result = caseComment(simpleComment);
            if (result == null)
                result = caseSeparator(simpleComment);
            if (result == null)
                result = caseStatement(simpleComment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CommonPackage.BRACKETED_COMMENT: {
            BracketedComment bracketedComment = (BracketedComment) theEObject;
            T result = caseBracketedComment(bracketedComment);
            if (result == null)
                result = caseComment(bracketedComment);
            if (result == null)
                result = caseSeparator(bracketedComment);
            if (result == null)
                result = caseStatement(bracketedComment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CommonPackage.STATEMENT: {
            Statement statement = (Statement) theEObject;
            T result = caseStatement(statement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CommonPackage.SCHEMA_QUALIFIED_NAME: {
            SchemaQualifiedName schemaQualifiedName = (SchemaQualifiedName) theEObject;
            T result = caseSchemaQualifiedName(schemaQualifiedName);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SQL Script</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SQL Script</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSQLScript(SQLScript object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Separator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Separator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSeparator(Separator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComment(Comment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Comment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleComment(SimpleComment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bracketed Comment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bracketed Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBracketedComment(BracketedComment object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Schema Qualified Name</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schema Qualified Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchemaQualifiedName(SchemaQualifiedName object) {
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

} //CommonSwitch
