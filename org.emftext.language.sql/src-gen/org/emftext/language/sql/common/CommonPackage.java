/**
 */
package org.emftext.language.sql.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.common.CommonFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore conversionDelegates='org.emftext.language.sql.conversionDelegateFactory'"
 * @generated
 */
public interface CommonPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "common";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.emftext.org/language/sql/common";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "common";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CommonPackage eINSTANCE = org.emftext.language.sql.common.impl.CommonPackageImpl.init();

    /**
     * The meta object id for the '{@link org.emftext.language.sql.common.impl.SQLScriptImpl <em>SQL Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.common.impl.SQLScriptImpl
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSQLScript()
     * @generated
     */
    int SQL_SCRIPT = 0;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_SCRIPT__STATEMENTS = 0;

    /**
     * The number of structural features of the '<em>SQL Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_SCRIPT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>SQL Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_SCRIPT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.common.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.common.impl.StatementImpl
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getStatement()
     * @generated
     */
    int STATEMENT = 6;

    /**
     * The number of structural features of the '<em>Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.common.impl.DirectSQLStatementImpl <em>Direct SQL Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.common.impl.DirectSQLStatementImpl
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getDirectSQLStatement()
     * @generated
     */
    int DIRECT_SQL_STATEMENT = 1;

    /**
     * The number of structural features of the '<em>Direct SQL Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_SQL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Direct SQL Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_SQL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.common.impl.SeparatorImpl <em>Separator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.common.impl.SeparatorImpl
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSeparator()
     * @generated
     */
    int SEPARATOR = 2;

    /**
     * The number of structural features of the '<em>Separator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEPARATOR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Separator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEPARATOR_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.common.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.common.impl.CommentImpl
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getComment()
     * @generated
     */
    int COMMENT = 3;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__VALUE = SEPARATOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_FEATURE_COUNT = SEPARATOR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_OPERATION_COUNT = SEPARATOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.common.impl.SimpleCommentImpl <em>Simple Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.common.impl.SimpleCommentImpl
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSimpleComment()
     * @generated
     */
    int SIMPLE_COMMENT = 4;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_COMMENT__VALUE = COMMENT__VALUE;

    /**
     * The number of structural features of the '<em>Simple Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_COMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Simple Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_COMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.common.impl.BracketedCommentImpl <em>Bracketed Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.common.impl.BracketedCommentImpl
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getBracketedComment()
     * @generated
     */
    int BRACKETED_COMMENT = 5;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRACKETED_COMMENT__VALUE = COMMENT__VALUE;

    /**
     * The number of structural features of the '<em>Bracketed Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRACKETED_COMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Bracketed Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BRACKETED_COMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.common.impl.SchemaQualifiedNameImpl <em>Schema Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.common.impl.SchemaQualifiedNameImpl
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSchemaQualifiedName()
     * @generated
     */
    int SCHEMA_QUALIFIED_NAME = 7;

    /**
     * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_QUALIFIED_NAME__CATALOG_NAME = 0;

    /**
     * The feature id for the '<em><b>Schema Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_QUALIFIED_NAME__SCHEMA_NAME = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_QUALIFIED_NAME__NAME = 2;

    /**
     * The number of structural features of the '<em>Schema Qualified Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_QUALIFIED_NAME_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Schema Qualified Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_QUALIFIED_NAME_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '<em>Unsigned Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.UnsignedInteger
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getUnsignedInteger()
     * @generated
     */
    int UNSIGNED_INTEGER = 8;

    /**
     * The meta object id for the '<em>Date Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.time.LocalDate
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getDateType()
     * @generated
     */
    int DATE_TYPE = 9;

    /**
     * The meta object id for the '<em>Time Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.time.LocalTime
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getTimeType()
     * @generated
     */
    int TIME_TYPE = 10;

    /**
     * The meta object id for the '<em>Timestamp Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.time.ZonedDateTime
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getTimestampType()
     * @generated
     */
    int TIMESTAMP_TYPE = 11;

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.common.SQLScript <em>SQL Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SQL Script</em>'.
     * @see org.emftext.language.sql.common.SQLScript
     * @generated
     */
    EClass getSQLScript();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.sql.common.SQLScript#getStatements <em>Statements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Statements</em>'.
     * @see org.emftext.language.sql.common.SQLScript#getStatements()
     * @see #getSQLScript()
     * @generated
     */
    EReference getSQLScript_Statements();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.common.DirectSQLStatement <em>Direct SQL Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Direct SQL Statement</em>'.
     * @see org.emftext.language.sql.common.DirectSQLStatement
     * @generated
     */
    EClass getDirectSQLStatement();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.common.Separator <em>Separator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Separator</em>'.
     * @see org.emftext.language.sql.common.Separator
     * @generated
     */
    EClass getSeparator();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.common.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comment</em>'.
     * @see org.emftext.language.sql.common.Comment
     * @generated
     */
    EClass getComment();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.common.Comment#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.sql.common.Comment#getValue()
     * @see #getComment()
     * @generated
     */
    EAttribute getComment_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.common.SimpleComment <em>Simple Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Comment</em>'.
     * @see org.emftext.language.sql.common.SimpleComment
     * @generated
     */
    EClass getSimpleComment();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.common.BracketedComment <em>Bracketed Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bracketed Comment</em>'.
     * @see org.emftext.language.sql.common.BracketedComment
     * @generated
     */
    EClass getBracketedComment();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.common.Statement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Statement</em>'.
     * @see org.emftext.language.sql.common.Statement
     * @generated
     */
    EClass getStatement();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.common.SchemaQualifiedName <em>Schema Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schema Qualified Name</em>'.
     * @see org.emftext.language.sql.common.SchemaQualifiedName
     * @generated
     */
    EClass getSchemaQualifiedName();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.common.SchemaQualifiedName#getCatalogName <em>Catalog Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Catalog Name</em>'.
     * @see org.emftext.language.sql.common.SchemaQualifiedName#getCatalogName()
     * @see #getSchemaQualifiedName()
     * @generated
     */
    EAttribute getSchemaQualifiedName_CatalogName();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.common.SchemaQualifiedName#getSchemaName <em>Schema Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schema Name</em>'.
     * @see org.emftext.language.sql.common.SchemaQualifiedName#getSchemaName()
     * @see #getSchemaQualifiedName()
     * @generated
     */
    EAttribute getSchemaQualifiedName_SchemaName();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.common.SchemaQualifiedName#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.sql.common.SchemaQualifiedName#getName()
     * @see #getSchemaQualifiedName()
     * @generated
     */
    EAttribute getSchemaQualifiedName_Name();

    /**
     * Returns the meta object for data type '{@link org.emftext.language.sql.UnsignedInteger <em>Unsigned Integer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Unsigned Integer</em>'.
     * @see org.emftext.language.sql.UnsignedInteger
     * @model instanceClass="org.emftext.language.sql.UnsignedInteger"
     * @generated
     */
    EDataType getUnsignedInteger();

    /**
     * Returns the meta object for data type '{@link java.time.LocalDate <em>Date Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Date Type</em>'.
     * @see java.time.LocalDate
     * @model instanceClass="java.time.LocalDate"
     * @generated
     */
    EDataType getDateType();

    /**
     * Returns the meta object for data type '{@link java.time.LocalTime <em>Time Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Time Type</em>'.
     * @see java.time.LocalTime
     * @model instanceClass="java.time.LocalTime"
     * @generated
     */
    EDataType getTimeType();

    /**
     * Returns the meta object for data type '{@link java.time.ZonedDateTime <em>Timestamp Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Timestamp Type</em>'.
     * @see java.time.ZonedDateTime
     * @model instanceClass="java.time.ZonedDateTime"
     * @generated
     */
    EDataType getTimestampType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CommonFactory getCommonFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.common.impl.SQLScriptImpl <em>SQL Script</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.common.impl.SQLScriptImpl
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSQLScript()
        	 * @generated
        	 */
        EClass SQL_SCRIPT = eINSTANCE.getSQLScript();

        /**
        	 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference SQL_SCRIPT__STATEMENTS = eINSTANCE.getSQLScript_Statements();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.common.impl.DirectSQLStatementImpl <em>Direct SQL Statement</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.common.impl.DirectSQLStatementImpl
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getDirectSQLStatement()
        	 * @generated
        	 */
        EClass DIRECT_SQL_STATEMENT = eINSTANCE.getDirectSQLStatement();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.common.impl.SeparatorImpl <em>Separator</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.common.impl.SeparatorImpl
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSeparator()
        	 * @generated
        	 */
        EClass SEPARATOR = eINSTANCE.getSeparator();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.common.impl.CommentImpl <em>Comment</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.common.impl.CommentImpl
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getComment()
        	 * @generated
        	 */
        EClass COMMENT = eINSTANCE.getComment();

        /**
        	 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute COMMENT__VALUE = eINSTANCE.getComment_Value();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.common.impl.SimpleCommentImpl <em>Simple Comment</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.common.impl.SimpleCommentImpl
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSimpleComment()
        	 * @generated
        	 */
        EClass SIMPLE_COMMENT = eINSTANCE.getSimpleComment();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.common.impl.BracketedCommentImpl <em>Bracketed Comment</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.common.impl.BracketedCommentImpl
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getBracketedComment()
        	 * @generated
        	 */
        EClass BRACKETED_COMMENT = eINSTANCE.getBracketedComment();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.common.impl.StatementImpl <em>Statement</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.common.impl.StatementImpl
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getStatement()
        	 * @generated
        	 */
        EClass STATEMENT = eINSTANCE.getStatement();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.common.impl.SchemaQualifiedNameImpl <em>Schema Qualified Name</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.common.impl.SchemaQualifiedNameImpl
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSchemaQualifiedName()
        	 * @generated
        	 */
        EClass SCHEMA_QUALIFIED_NAME = eINSTANCE.getSchemaQualifiedName();

        /**
        	 * The meta object literal for the '<em><b>Catalog Name</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute SCHEMA_QUALIFIED_NAME__CATALOG_NAME = eINSTANCE.getSchemaQualifiedName_CatalogName();

        /**
        	 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute SCHEMA_QUALIFIED_NAME__SCHEMA_NAME = eINSTANCE.getSchemaQualifiedName_SchemaName();

        /**
        	 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute SCHEMA_QUALIFIED_NAME__NAME = eINSTANCE.getSchemaQualifiedName_Name();

        /**
        	 * The meta object literal for the '<em>Unsigned Integer</em>' data type.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.UnsignedInteger
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getUnsignedInteger()
        	 * @generated
        	 */
        EDataType UNSIGNED_INTEGER = eINSTANCE.getUnsignedInteger();

        /**
        	 * The meta object literal for the '<em>Date Type</em>' data type.
        	 * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
        	 * @see java.time.LocalDate
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getDateType()
        	 * @generated
        	 */
        EDataType DATE_TYPE = eINSTANCE.getDateType();

        /**
        	 * The meta object literal for the '<em>Time Type</em>' data type.
        	 * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
        	 * @see java.time.LocalTime
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getTimeType()
        	 * @generated
        	 */
        EDataType TIME_TYPE = eINSTANCE.getTimeType();

        /**
        	 * The meta object literal for the '<em>Timestamp Type</em>' data type.
        	 * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
        	 * @see java.time.ZonedDateTime
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getTimestampType()
        	 * @generated
        	 */
        EDataType TIMESTAMP_TYPE = eINSTANCE.getTimestampType();

    }

} //CommonPackage
