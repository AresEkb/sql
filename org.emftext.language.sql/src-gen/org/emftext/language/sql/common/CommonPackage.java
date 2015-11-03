/**
 */
package org.emftext.language.sql.common;

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
    int DIRECT_SQL_STATEMENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Direct SQL Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIRECT_SQL_STATEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '<em>Unsigned Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.UnsignedInteger
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getUnsignedInteger()
     * @generated
     */
    int UNSIGNED_INTEGER = 2;

    /**
     * The meta object id for the '<em>Identifier</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.Identifier
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getIdentifier()
     * @generated
     */
    int IDENTIFIER = 3;

    /**
     * The meta object id for the '<em>Schema Qualified Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.SchemaQualifiedName
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSchemaQualifiedName()
     * @generated
     */
    int SCHEMA_QUALIFIED_NAME = 4;

    /**
     * The meta object id for the '<em>Local Or Schema Qualified Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.SchemaQualifiedName
     * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getLocalOrSchemaQualifiedName()
     * @generated
     */
    int LOCAL_OR_SCHEMA_QUALIFIED_NAME = 5;

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
     * Returns the meta object for data type '{@link org.emftext.language.sql.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Identifier</em>'.
     * @see org.emftext.language.sql.Identifier
     * @model instanceClass="org.emftext.language.sql.Identifier"
     * @generated
     */
    EDataType getIdentifier();

    /**
     * Returns the meta object for data type '{@link org.emftext.language.sql.SchemaQualifiedName <em>Schema Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Schema Qualified Name</em>'.
     * @see org.emftext.language.sql.SchemaQualifiedName
     * @model instanceClass="org.emftext.language.sql.SchemaQualifiedName"
     * @generated
     */
    EDataType getSchemaQualifiedName();

    /**
     * Returns the meta object for data type '{@link org.emftext.language.sql.SchemaQualifiedName <em>Local Or Schema Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Local Or Schema Qualified Name</em>'.
     * @see org.emftext.language.sql.SchemaQualifiedName
     * @model instanceClass="org.emftext.language.sql.SchemaQualifiedName"
     * @generated
     */
    EDataType getLocalOrSchemaQualifiedName();

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
        	 * The meta object literal for the '<em>Unsigned Integer</em>' data type.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.UnsignedInteger
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getUnsignedInteger()
        	 * @generated
        	 */
        EDataType UNSIGNED_INTEGER = eINSTANCE.getUnsignedInteger();

        /**
        	 * The meta object literal for the '<em>Identifier</em>' data type.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.Identifier
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getIdentifier()
        	 * @generated
        	 */
        EDataType IDENTIFIER = eINSTANCE.getIdentifier();

        /**
        	 * The meta object literal for the '<em>Schema Qualified Name</em>' data type.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.SchemaQualifiedName
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getSchemaQualifiedName()
        	 * @generated
        	 */
        EDataType SCHEMA_QUALIFIED_NAME = eINSTANCE.getSchemaQualifiedName();

        /**
        	 * The meta object literal for the '<em>Local Or Schema Qualified Name</em>' data type.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.SchemaQualifiedName
        	 * @see org.emftext.language.sql.common.impl.CommonPackageImpl#getLocalOrSchemaQualifiedName()
        	 * @generated
        	 */
        EDataType LOCAL_OR_SCHEMA_QUALIFIED_NAME = eINSTANCE.getLocalOrSchemaQualifiedName();

    }

} //CommonPackage
