/**
 */
package org.emftext.language.sql.common.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.common.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.common.CommonPackage
 * @generated
 */
public class CommonAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CommonPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommonAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CommonPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommonSwitch<Adapter> modelSwitch = new CommonSwitch<Adapter>() {
        @Override
        public Adapter caseSQLScript(SQLScript object) {
            return createSQLScriptAdapter();
        }

        @Override
        public Adapter caseDirectSQLStatement(DirectSQLStatement object) {
            return createDirectSQLStatementAdapter();
        }

        @Override
        public Adapter caseSeparator(Separator object) {
            return createSeparatorAdapter();
        }

        @Override
        public Adapter caseComment(Comment object) {
            return createCommentAdapter();
        }

        @Override
        public Adapter caseSimpleComment(SimpleComment object) {
            return createSimpleCommentAdapter();
        }

        @Override
        public Adapter caseBracketedComment(BracketedComment object) {
            return createBracketedCommentAdapter();
        }

        @Override
        public Adapter caseStatement(Statement object) {
            return createStatementAdapter();
        }

        @Override
        public Adapter caseSchemaQualifiedName(SchemaQualifiedName object) {
            return createSchemaQualifiedNameAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.common.SQLScript <em>SQL Script</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.common.SQLScript
     * @generated
     */
    public Adapter createSQLScriptAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.common.DirectSQLStatement <em>Direct SQL Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.common.DirectSQLStatement
     * @generated
     */
    public Adapter createDirectSQLStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.common.Separator <em>Separator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.common.Separator
     * @generated
     */
    public Adapter createSeparatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.common.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.common.Comment
     * @generated
     */
    public Adapter createCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.common.SimpleComment <em>Simple Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.common.SimpleComment
     * @generated
     */
    public Adapter createSimpleCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.common.BracketedComment <em>Bracketed Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.common.BracketedComment
     * @generated
     */
    public Adapter createBracketedCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.common.Statement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.common.Statement
     * @generated
     */
    public Adapter createStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.common.SchemaQualifiedName <em>Schema Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.common.SchemaQualifiedName
     * @generated
     */
    public Adapter createSchemaQualifiedNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //CommonAdapterFactory
