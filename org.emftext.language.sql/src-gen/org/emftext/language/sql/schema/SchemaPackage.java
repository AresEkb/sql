/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.emftext.language.sql.common.CommonPackage;

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
 * @see org.emftext.language.sql.schema.SchemaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SchemaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "schema";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.emftext.org/language/sql/schema";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "schema";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SchemaPackage eINSTANCE = org.emftext.language.sql.schema.impl.SchemaPackageImpl.init();

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.SQLSchemaStatementImpl <em>SQL Schema Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.SQLSchemaStatementImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getSQLSchemaStatement()
     * @generated
     */
    int SQL_SCHEMA_STATEMENT = 11;

    /**
     * The number of structural features of the '<em>SQL Schema Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_SCHEMA_STATEMENT_FEATURE_COUNT = CommonPackage.DIRECT_SQL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>SQL Schema Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_SCHEMA_STATEMENT_OPERATION_COUNT = CommonPackage.DIRECT_SQL_STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.SQLSchemaDefinitionStatementImpl <em>SQL Schema Definition Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.SQLSchemaDefinitionStatementImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getSQLSchemaDefinitionStatement()
     * @generated
     */
    int SQL_SCHEMA_DEFINITION_STATEMENT = 12;

    /**
     * The number of structural features of the '<em>SQL Schema Definition Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_SCHEMA_DEFINITION_STATEMENT_FEATURE_COUNT = SQL_SCHEMA_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>SQL Schema Definition Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT = SQL_SCHEMA_STATEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.TableDefinitionImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableDefinition()
     * @generated
     */
    int TABLE_DEFINITION = 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION__LABEL = SQL_SCHEMA_DEFINITION_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME = SQL_SCHEMA_DEFINITION_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION__SCOPE = SQL_SCHEMA_DEFINITION_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Contents Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION__CONTENTS_SOURCE = SQL_SCHEMA_DEFINITION_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Table Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION_FEATURE_COUNT = SQL_SCHEMA_DEFINITION_STATEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>EClass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___ECLASS = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>EIs Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___EIS_PROXY = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>EResource</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___ERESOURCE = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>EContainer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___ECONTAINER = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>EContaining Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___ECONTAINING_FEATURE = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>EContainment Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___ECONTAINMENT_FEATURE = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>EContents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___ECONTENTS = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>EAll Contents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___EALL_CONTENTS = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>ECross References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___ECROSS_REFERENCES = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___EGET__ESTRUCTURALFEATURE = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>ESet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___ESET__ESTRUCTURALFEATURE_OBJECT = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>EIs Set</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___EIS_SET__ESTRUCTURALFEATURE = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>EUnset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___EUNSET__ESTRUCTURALFEATURE = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>EInvoke</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION___EINVOKE__EOPERATION_ELIST = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 14;

    /**
     * The number of operations of the '<em>Table Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_DEFINITION_OPERATION_COUNT = SQL_SCHEMA_DEFINITION_STATEMENT_OPERATION_COUNT + 15;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.TableContentsSourceImpl <em>Table Contents Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.TableContentsSourceImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableContentsSource()
     * @generated
     */
    int TABLE_CONTENTS_SOURCE = 5;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONTENTS_SOURCE__OWNER = 0;

    /**
     * The number of structural features of the '<em>Table Contents Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONTENTS_SOURCE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Table Contents Source</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONTENTS_SOURCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.TableElementListImpl <em>Table Element List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.TableElementListImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableElementList()
     * @generated
     */
    int TABLE_ELEMENT_LIST = 1;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_ELEMENT_LIST__OWNER = TABLE_CONTENTS_SOURCE__OWNER;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_ELEMENT_LIST__ELEMENTS = TABLE_CONTENTS_SOURCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Table Element List</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_ELEMENT_LIST_FEATURE_COUNT = TABLE_CONTENTS_SOURCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Table Element List</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_ELEMENT_LIST_OPERATION_COUNT = TABLE_CONTENTS_SOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.TableElementImpl <em>Table Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.TableElementImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableElement()
     * @generated
     */
    int TABLE_ELEMENT = 2;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_ELEMENT__OWNER = 0;

    /**
     * The number of structural features of the '<em>Table Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Table Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.ColumnImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getColumn()
     * @generated
     */
    int COLUMN = 3;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__OWNER = TABLE_ELEMENT__OWNER;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__NAME = TABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__DATA_TYPE = TABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Default Option</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__DEFAULT_OPTION = TABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__CONSTRAINT = TABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Collation Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__COLLATION_NAME = TABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Column</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_FEATURE_COUNT = TABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Column</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_OPERATION_COUNT = TABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.TableConstraintImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableConstraint()
     * @generated
     */
    int TABLE_CONSTRAINT = 4;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT__OWNER = TABLE_ELEMENT__OWNER;

    /**
     * The feature id for the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME = TABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Table Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT_FEATURE_COUNT = TABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>EClass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___ECLASS = TABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>EIs Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___EIS_PROXY = TABLE_ELEMENT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>EResource</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___ERESOURCE = TABLE_ELEMENT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>EContainer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___ECONTAINER = TABLE_ELEMENT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>EContaining Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___ECONTAINING_FEATURE = TABLE_ELEMENT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>EContainment Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___ECONTAINMENT_FEATURE = TABLE_ELEMENT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>EContents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___ECONTENTS = TABLE_ELEMENT_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>EAll Contents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___EALL_CONTENTS = TABLE_ELEMENT_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>ECross References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___ECROSS_REFERENCES = TABLE_ELEMENT_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE = TABLE_ELEMENT_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = TABLE_ELEMENT_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>ESet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = TABLE_ELEMENT_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>EIs Set</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = TABLE_ELEMENT_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>EUnset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = TABLE_ELEMENT_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>EInvoke</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT___EINVOKE__EOPERATION_ELIST = TABLE_ELEMENT_OPERATION_COUNT + 14;

    /**
     * The number of operations of the '<em>Table Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_CONSTRAINT_OPERATION_COUNT = TABLE_ELEMENT_OPERATION_COUNT + 15;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.DefaultOptionImpl <em>Default Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.DefaultOptionImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getDefaultOption()
     * @generated
     */
    int DEFAULT_OPTION = 6;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPTION__OWNER = 0;

    /**
     * The number of structural features of the '<em>Default Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPTION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Default Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_OPTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.ColumnConstraintImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getColumnConstraint()
     * @generated
     */
    int COLUMN_CONSTRAINT = 7;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT__OWNER = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Column Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>EClass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___ECLASS = EcorePackage.EOBJECT___ECLASS;

    /**
     * The operation id for the '<em>EIs Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

    /**
     * The operation id for the '<em>EResource</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

    /**
     * The operation id for the '<em>EContainer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

    /**
     * The operation id for the '<em>EContaining Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

    /**
     * The operation id for the '<em>EContainment Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

    /**
     * The operation id for the '<em>EContents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

    /**
     * The operation id for the '<em>EAll Contents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

    /**
     * The operation id for the '<em>ECross References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

    /**
     * The operation id for the '<em>ESet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

    /**
     * The operation id for the '<em>EIs Set</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

    /**
     * The operation id for the '<em>EUnset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

    /**
     * The operation id for the '<em>EInvoke</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

    /**
     * The number of operations of the '<em>Column Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_CONSTRAINT_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.NotNullColumnConstraintImpl <em>Not Null Column Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.NotNullColumnConstraintImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getNotNullColumnConstraint()
     * @generated
     */
    int NOT_NULL_COLUMN_CONSTRAINT = 8;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT__OWNER = COLUMN_CONSTRAINT__OWNER;

    /**
     * The feature id for the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME = COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME;

    /**
     * The number of structural features of the '<em>Not Null Column Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>EClass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___ECLASS = COLUMN_CONSTRAINT___ECLASS;

    /**
     * The operation id for the '<em>EIs Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___EIS_PROXY = COLUMN_CONSTRAINT___EIS_PROXY;

    /**
     * The operation id for the '<em>EResource</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___ERESOURCE = COLUMN_CONSTRAINT___ERESOURCE;

    /**
     * The operation id for the '<em>EContainer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___ECONTAINER = COLUMN_CONSTRAINT___ECONTAINER;

    /**
     * The operation id for the '<em>EContaining Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___ECONTAINING_FEATURE = COLUMN_CONSTRAINT___ECONTAINING_FEATURE;

    /**
     * The operation id for the '<em>EContainment Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___ECONTAINMENT_FEATURE = COLUMN_CONSTRAINT___ECONTAINMENT_FEATURE;

    /**
     * The operation id for the '<em>EContents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___ECONTENTS = COLUMN_CONSTRAINT___ECONTENTS;

    /**
     * The operation id for the '<em>EAll Contents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___EALL_CONTENTS = COLUMN_CONSTRAINT___EALL_CONTENTS;

    /**
     * The operation id for the '<em>ECross References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___ECROSS_REFERENCES = COLUMN_CONSTRAINT___ECROSS_REFERENCES;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE = COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

    /**
     * The operation id for the '<em>ESet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = COLUMN_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT;

    /**
     * The operation id for the '<em>EIs Set</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = COLUMN_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE;

    /**
     * The operation id for the '<em>EUnset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = COLUMN_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE;

    /**
     * The operation id for the '<em>EInvoke</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT___EINVOKE__EOPERATION_ELIST = COLUMN_CONSTRAINT___EINVOKE__EOPERATION_ELIST;

    /**
     * The number of operations of the '<em>Not Null Column Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOT_NULL_COLUMN_CONSTRAINT_OPERATION_COUNT = COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.UniqueConstraint <em>Unique Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.UniqueConstraint
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getUniqueConstraint()
     * @generated
     */
    int UNIQUE_CONSTRAINT = 18;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_CONSTRAINT__KIND = 0;

    /**
     * The number of structural features of the '<em>Unique Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_CONSTRAINT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Unique Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_CONSTRAINT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.UniqueColumnConstraintImpl <em>Unique Column Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.UniqueColumnConstraintImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getUniqueColumnConstraint()
     * @generated
     */
    int UNIQUE_COLUMN_CONSTRAINT = 9;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT__KIND = UNIQUE_CONSTRAINT__KIND;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT__OWNER = UNIQUE_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME = UNIQUE_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Unique Column Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT_FEATURE_COUNT = UNIQUE_CONSTRAINT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>EClass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___ECLASS = UNIQUE_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>EIs Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___EIS_PROXY = UNIQUE_CONSTRAINT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>EResource</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___ERESOURCE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>EContainer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___ECONTAINER = UNIQUE_CONSTRAINT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>EContaining Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___ECONTAINING_FEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>EContainment Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___ECONTAINMENT_FEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>EContents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___ECONTENTS = UNIQUE_CONSTRAINT_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>EAll Contents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___EALL_CONTENTS = UNIQUE_CONSTRAINT_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>ECross References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___ECROSS_REFERENCES = UNIQUE_CONSTRAINT_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = UNIQUE_CONSTRAINT_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>ESet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = UNIQUE_CONSTRAINT_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>EIs Set</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>EUnset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>EInvoke</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT___EINVOKE__EOPERATION_ELIST = UNIQUE_CONSTRAINT_OPERATION_COUNT + 14;

    /**
     * The number of operations of the '<em>Unique Column Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_COLUMN_CONSTRAINT_OPERATION_COUNT = UNIQUE_CONSTRAINT_OPERATION_COUNT + 15;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.ReferentialConstraint <em>Referential Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.ReferentialConstraint
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getReferentialConstraint()
     * @generated
     */
    int REFERENTIAL_CONSTRAINT = 19;

    /**
     * The feature id for the '<em><b>Referenced Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_CONSTRAINT__REFERENCED_COLUMNS = 0;

    /**
     * The feature id for the '<em><b>Referenced Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_CONSTRAINT__REFERENCED_TABLE = 1;

    /**
     * The number of structural features of the '<em>Referential Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_CONSTRAINT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Referential Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_CONSTRAINT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.ReferentialColumnConstraintImpl <em>Referential Column Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.ReferentialColumnConstraintImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getReferentialColumnConstraint()
     * @generated
     */
    int REFERENTIAL_COLUMN_CONSTRAINT = 10;

    /**
     * The feature id for the '<em><b>Referenced Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS = REFERENTIAL_CONSTRAINT__REFERENCED_COLUMNS;

    /**
     * The feature id for the '<em><b>Referenced Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE = REFERENTIAL_CONSTRAINT__REFERENCED_TABLE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT__OWNER = REFERENTIAL_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME = REFERENTIAL_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Referential Column Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT_FEATURE_COUNT = REFERENTIAL_CONSTRAINT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>EClass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___ECLASS = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>EIs Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___EIS_PROXY = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>EResource</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___ERESOURCE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>EContainer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___ECONTAINER = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>EContaining Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___ECONTAINING_FEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>EContainment Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___ECONTAINMENT_FEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>EContents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___ECONTENTS = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>EAll Contents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___EALL_CONTENTS = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>ECross References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___ECROSS_REFERENCES = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>ESet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>EIs Set</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>EUnset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>EInvoke</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT___EINVOKE__EOPERATION_ELIST = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 14;

    /**
     * The number of operations of the '<em>Referential Column Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_COLUMN_CONSTRAINT_OPERATION_COUNT = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 15;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.LiteralDefaultOptionImpl <em>Literal Default Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.LiteralDefaultOptionImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getLiteralDefaultOption()
     * @generated
     */
    int LITERAL_DEFAULT_OPTION = 13;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_DEFAULT_OPTION__OWNER = DEFAULT_OPTION__OWNER;

    /**
     * The feature id for the '<em><b>Literal</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_DEFAULT_OPTION__LITERAL = DEFAULT_OPTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Literal Default Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_DEFAULT_OPTION_FEATURE_COUNT = DEFAULT_OPTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Literal Default Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_DEFAULT_OPTION_OPERATION_COUNT = DEFAULT_OPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.DatetimeValueFunctionDefaultOptionImpl <em>Datetime Value Function Default Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.DatetimeValueFunctionDefaultOptionImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getDatetimeValueFunctionDefaultOption()
     * @generated
     */
    int DATETIME_VALUE_FUNCTION_DEFAULT_OPTION = 14;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__OWNER = DEFAULT_OPTION__OWNER;

    /**
     * The feature id for the '<em><b>Function</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION = DEFAULT_OPTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Datetime Value Function Default Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_VALUE_FUNCTION_DEFAULT_OPTION_FEATURE_COUNT = DEFAULT_OPTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Datetime Value Function Default Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_VALUE_FUNCTION_DEFAULT_OPTION_OPERATION_COUNT = DEFAULT_OPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.ImplicitlyTypedValueSpecificationDefaultOptionImpl <em>Implicitly Typed Value Specification Default Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.ImplicitlyTypedValueSpecificationDefaultOptionImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getImplicitlyTypedValueSpecificationDefaultOption()
     * @generated
     */
    int IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION = 15;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__OWNER = DEFAULT_OPTION__OWNER;

    /**
     * The feature id for the '<em><b>Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION = DEFAULT_OPTION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Implicitly Typed Value Specification Default Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION_FEATURE_COUNT = DEFAULT_OPTION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Implicitly Typed Value Specification Default Option</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION_OPERATION_COUNT = DEFAULT_OPTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.UniqueTableConstraintImpl <em>Unique Table Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.UniqueTableConstraintImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getUniqueTableConstraint()
     * @generated
     */
    int UNIQUE_TABLE_CONSTRAINT = 16;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT__KIND = UNIQUE_CONSTRAINT__KIND;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT__OWNER = UNIQUE_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME = UNIQUE_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT__COLUMNS = UNIQUE_CONSTRAINT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Unique Table Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT_FEATURE_COUNT = UNIQUE_CONSTRAINT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>EClass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___ECLASS = UNIQUE_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>EIs Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___EIS_PROXY = UNIQUE_CONSTRAINT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>EResource</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___ERESOURCE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>EContainer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___ECONTAINER = UNIQUE_CONSTRAINT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>EContaining Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___ECONTAINING_FEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>EContainment Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___ECONTAINMENT_FEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>EContents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___ECONTENTS = UNIQUE_CONSTRAINT_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>EAll Contents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___EALL_CONTENTS = UNIQUE_CONSTRAINT_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>ECross References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___ECROSS_REFERENCES = UNIQUE_CONSTRAINT_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = UNIQUE_CONSTRAINT_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>ESet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = UNIQUE_CONSTRAINT_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>EIs Set</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>EUnset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = UNIQUE_CONSTRAINT_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>EInvoke</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT___EINVOKE__EOPERATION_ELIST = UNIQUE_CONSTRAINT_OPERATION_COUNT + 14;

    /**
     * The number of operations of the '<em>Unique Table Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNIQUE_TABLE_CONSTRAINT_OPERATION_COUNT = UNIQUE_CONSTRAINT_OPERATION_COUNT + 15;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl <em>Referential Table Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getReferentialTableConstraint()
     * @generated
     */
    int REFERENTIAL_TABLE_CONSTRAINT = 17;

    /**
     * The feature id for the '<em><b>Referenced Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS = REFERENTIAL_CONSTRAINT__REFERENCED_COLUMNS;

    /**
     * The feature id for the '<em><b>Referenced Table</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE = REFERENTIAL_CONSTRAINT__REFERENCED_TABLE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT__OWNER = REFERENTIAL_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME = REFERENTIAL_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT__COLUMNS = REFERENTIAL_CONSTRAINT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Referential Table Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT_FEATURE_COUNT = REFERENTIAL_CONSTRAINT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>EClass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___ECLASS = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>EIs Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___EIS_PROXY = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>EResource</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___ERESOURCE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>EContainer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___ECONTAINER = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>EContaining Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___ECONTAINING_FEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>EContainment Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___ECONTAINMENT_FEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>EContents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___ECONTENTS = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>EAll Contents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___EALL_CONTENTS = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>ECross References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___ECROSS_REFERENCES = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>ESet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>EIs Set</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>EUnset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>EInvoke</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT___EINVOKE__EOPERATION_ELIST = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 14;

    /**
     * The number of operations of the '<em>Referential Table Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENTIAL_TABLE_CONSTRAINT_OPERATION_COUNT = REFERENTIAL_CONSTRAINT_OPERATION_COUNT + 15;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.TableReferenceImpl <em>Table Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.TableReferenceImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableReference()
     * @generated
     */
    int TABLE_REFERENCE = 20;

    /**
     * The feature id for the '<em><b>Catalog Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_REFERENCE__CATALOG_NAME = 0;

    /**
     * The feature id for the '<em><b>Schema Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_REFERENCE__SCHEMA_NAME = 1;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_REFERENCE__TARGET = 2;

    /**
     * The number of structural features of the '<em>Table Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_REFERENCE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Table Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_REFERENCE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.impl.TableColumnsConstraintImpl <em>Table Columns Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.impl.TableColumnsConstraintImpl
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableColumnsConstraint()
     * @generated
     */
    int TABLE_COLUMNS_CONSTRAINT = 21;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT__OWNER = TABLE_CONSTRAINT__OWNER;

    /**
     * The feature id for the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT__SCHEMA_QUALIFIED_NAME = TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Table Columns Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>EClass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___ECLASS = TABLE_CONSTRAINT___ECLASS;

    /**
     * The operation id for the '<em>EIs Proxy</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___EIS_PROXY = TABLE_CONSTRAINT___EIS_PROXY;

    /**
     * The operation id for the '<em>EResource</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___ERESOURCE = TABLE_CONSTRAINT___ERESOURCE;

    /**
     * The operation id for the '<em>EContainer</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___ECONTAINER = TABLE_CONSTRAINT___ECONTAINER;

    /**
     * The operation id for the '<em>EContaining Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___ECONTAINING_FEATURE = TABLE_CONSTRAINT___ECONTAINING_FEATURE;

    /**
     * The operation id for the '<em>EContainment Feature</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___ECONTAINMENT_FEATURE = TABLE_CONSTRAINT___ECONTAINMENT_FEATURE;

    /**
     * The operation id for the '<em>EContents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___ECONTENTS = TABLE_CONSTRAINT___ECONTENTS;

    /**
     * The operation id for the '<em>EAll Contents</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___EALL_CONTENTS = TABLE_CONSTRAINT___EALL_CONTENTS;

    /**
     * The operation id for the '<em>ECross References</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___ECROSS_REFERENCES = TABLE_CONSTRAINT___ECROSS_REFERENCES;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___EGET__ESTRUCTURALFEATURE = TABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE;

    /**
     * The operation id for the '<em>EGet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = TABLE_CONSTRAINT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

    /**
     * The operation id for the '<em>ESet</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT = TABLE_CONSTRAINT___ESET__ESTRUCTURALFEATURE_OBJECT;

    /**
     * The operation id for the '<em>EIs Set</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE = TABLE_CONSTRAINT___EIS_SET__ESTRUCTURALFEATURE;

    /**
     * The operation id for the '<em>EUnset</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE = TABLE_CONSTRAINT___EUNSET__ESTRUCTURALFEATURE;

    /**
     * The operation id for the '<em>EInvoke</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT___EINVOKE__EOPERATION_ELIST = TABLE_CONSTRAINT___EINVOKE__EOPERATION_ELIST;

    /**
     * The number of operations of the '<em>Table Columns Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_COLUMNS_CONSTRAINT_OPERATION_COUNT = TABLE_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.TableScope <em>Table Scope</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.TableScope
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableScope()
     * @generated
     */
    int TABLE_SCOPE = 22;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.schema.UniqueSpecificationKind <em>Unique Specification Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.schema.UniqueSpecificationKind
     * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getUniqueSpecificationKind()
     * @generated
     */
    int UNIQUE_SPECIFICATION_KIND = 23;

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.TableDefinition <em>Table Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Definition</em>'.
     * @see org.emftext.language.sql.schema.TableDefinition
     * @generated
     */
    EClass getTableDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.TableDefinition#getContentsSource <em>Contents Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Contents Source</em>'.
     * @see org.emftext.language.sql.schema.TableDefinition#getContentsSource()
     * @see #getTableDefinition()
     * @generated
     */
    EReference getTableDefinition_ContentsSource();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.schema.TableDefinition#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see org.emftext.language.sql.schema.TableDefinition#getScope()
     * @see #getTableDefinition()
     * @generated
     */
    EAttribute getTableDefinition_Scope();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.TableDefinition#getSchemaQualifiedName <em>Schema Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Schema Qualified Name</em>'.
     * @see org.emftext.language.sql.schema.TableDefinition#getSchemaQualifiedName()
     * @see #getTableDefinition()
     * @generated
     */
    EReference getTableDefinition_SchemaQualifiedName();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.schema.TableDefinition#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.emftext.language.sql.schema.TableDefinition#getLabel()
     * @see #getTableDefinition()
     * @generated
     */
    EAttribute getTableDefinition_Label();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.TableElementList <em>Table Element List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Element List</em>'.
     * @see org.emftext.language.sql.schema.TableElementList
     * @generated
     */
    EClass getTableElementList();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.sql.schema.TableElementList#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elements</em>'.
     * @see org.emftext.language.sql.schema.TableElementList#getElements()
     * @see #getTableElementList()
     * @generated
     */
    EReference getTableElementList_Elements();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.TableElement <em>Table Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Element</em>'.
     * @see org.emftext.language.sql.schema.TableElement
     * @generated
     */
    EClass getTableElement();

    /**
     * Returns the meta object for the container reference '{@link org.emftext.language.sql.schema.TableElement#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see org.emftext.language.sql.schema.TableElement#getOwner()
     * @see #getTableElement()
     * @generated
     */
    EReference getTableElement_Owner();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.Column <em>Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Column</em>'.
     * @see org.emftext.language.sql.schema.Column
     * @generated
     */
    EClass getColumn();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.schema.Column#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.emftext.language.sql.schema.Column#getName()
     * @see #getColumn()
     * @generated
     */
    EAttribute getColumn_Name();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.Column#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Type</em>'.
     * @see org.emftext.language.sql.schema.Column#getDataType()
     * @see #getColumn()
     * @generated
     */
    EReference getColumn_DataType();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.Column#getDefaultOption <em>Default Option</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Option</em>'.
     * @see org.emftext.language.sql.schema.Column#getDefaultOption()
     * @see #getColumn()
     * @generated
     */
    EReference getColumn_DefaultOption();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.Column#getConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Constraint</em>'.
     * @see org.emftext.language.sql.schema.Column#getConstraint()
     * @see #getColumn()
     * @generated
     */
    EReference getColumn_Constraint();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.Column#getCollationName <em>Collation Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Collation Name</em>'.
     * @see org.emftext.language.sql.schema.Column#getCollationName()
     * @see #getColumn()
     * @generated
     */
    EReference getColumn_CollationName();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.TableConstraint <em>Table Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Constraint</em>'.
     * @see org.emftext.language.sql.schema.TableConstraint
     * @generated
     */
    EClass getTableConstraint();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.TableConstraint#getSchemaQualifiedName <em>Schema Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Schema Qualified Name</em>'.
     * @see org.emftext.language.sql.schema.TableConstraint#getSchemaQualifiedName()
     * @see #getTableConstraint()
     * @generated
     */
    EReference getTableConstraint_SchemaQualifiedName();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.TableContentsSource <em>Table Contents Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Contents Source</em>'.
     * @see org.emftext.language.sql.schema.TableContentsSource
     * @generated
     */
    EClass getTableContentsSource();

    /**
     * Returns the meta object for the container reference '{@link org.emftext.language.sql.schema.TableContentsSource#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see org.emftext.language.sql.schema.TableContentsSource#getOwner()
     * @see #getTableContentsSource()
     * @generated
     */
    EReference getTableContentsSource_Owner();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.DefaultOption <em>Default Option</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Default Option</em>'.
     * @see org.emftext.language.sql.schema.DefaultOption
     * @generated
     */
    EClass getDefaultOption();

    /**
     * Returns the meta object for the container reference '{@link org.emftext.language.sql.schema.DefaultOption#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see org.emftext.language.sql.schema.DefaultOption#getOwner()
     * @see #getDefaultOption()
     * @generated
     */
    EReference getDefaultOption_Owner();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.ColumnConstraint <em>Column Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Column Constraint</em>'.
     * @see org.emftext.language.sql.schema.ColumnConstraint
     * @generated
     */
    EClass getColumnConstraint();

    /**
     * Returns the meta object for the container reference '{@link org.emftext.language.sql.schema.ColumnConstraint#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owner</em>'.
     * @see org.emftext.language.sql.schema.ColumnConstraint#getOwner()
     * @see #getColumnConstraint()
     * @generated
     */
    EReference getColumnConstraint_Owner();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.ColumnConstraint#getSchemaQualifiedName <em>Schema Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Schema Qualified Name</em>'.
     * @see org.emftext.language.sql.schema.ColumnConstraint#getSchemaQualifiedName()
     * @see #getColumnConstraint()
     * @generated
     */
    EReference getColumnConstraint_SchemaQualifiedName();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.NotNullColumnConstraint <em>Not Null Column Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Not Null Column Constraint</em>'.
     * @see org.emftext.language.sql.schema.NotNullColumnConstraint
     * @generated
     */
    EClass getNotNullColumnConstraint();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.UniqueColumnConstraint <em>Unique Column Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unique Column Constraint</em>'.
     * @see org.emftext.language.sql.schema.UniqueColumnConstraint
     * @generated
     */
    EClass getUniqueColumnConstraint();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.ReferentialColumnConstraint <em>Referential Column Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referential Column Constraint</em>'.
     * @see org.emftext.language.sql.schema.ReferentialColumnConstraint
     * @generated
     */
    EClass getReferentialColumnConstraint();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.SQLSchemaStatement <em>SQL Schema Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SQL Schema Statement</em>'.
     * @see org.emftext.language.sql.schema.SQLSchemaStatement
     * @generated
     */
    EClass getSQLSchemaStatement();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.SQLSchemaDefinitionStatement <em>SQL Schema Definition Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SQL Schema Definition Statement</em>'.
     * @see org.emftext.language.sql.schema.SQLSchemaDefinitionStatement
     * @generated
     */
    EClass getSQLSchemaDefinitionStatement();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.LiteralDefaultOption <em>Literal Default Option</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal Default Option</em>'.
     * @see org.emftext.language.sql.schema.LiteralDefaultOption
     * @generated
     */
    EClass getLiteralDefaultOption();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.LiteralDefaultOption#getLiteral <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Literal</em>'.
     * @see org.emftext.language.sql.schema.LiteralDefaultOption#getLiteral()
     * @see #getLiteralDefaultOption()
     * @generated
     */
    EReference getLiteralDefaultOption_Literal();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption <em>Datetime Value Function Default Option</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datetime Value Function Default Option</em>'.
     * @see org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption
     * @generated
     */
    EClass getDatetimeValueFunctionDefaultOption();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Function</em>'.
     * @see org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption#getFunction()
     * @see #getDatetimeValueFunctionDefaultOption()
     * @generated
     */
    EReference getDatetimeValueFunctionDefaultOption_Function();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption <em>Implicitly Typed Value Specification Default Option</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implicitly Typed Value Specification Default Option</em>'.
     * @see org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption
     * @generated
     */
    EClass getImplicitlyTypedValueSpecificationDefaultOption();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption#getSpecification <em>Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Specification</em>'.
     * @see org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption#getSpecification()
     * @see #getImplicitlyTypedValueSpecificationDefaultOption()
     * @generated
     */
    EReference getImplicitlyTypedValueSpecificationDefaultOption_Specification();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.UniqueTableConstraint <em>Unique Table Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unique Table Constraint</em>'.
     * @see org.emftext.language.sql.schema.UniqueTableConstraint
     * @generated
     */
    EClass getUniqueTableConstraint();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.ReferentialTableConstraint <em>Referential Table Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referential Table Constraint</em>'.
     * @see org.emftext.language.sql.schema.ReferentialTableConstraint
     * @generated
     */
    EClass getReferentialTableConstraint();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.UniqueConstraint <em>Unique Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unique Constraint</em>'.
     * @see org.emftext.language.sql.schema.UniqueConstraint
     * @generated
     */
    EClass getUniqueConstraint();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.schema.UniqueConstraint#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.sql.schema.UniqueConstraint#getKind()
     * @see #getUniqueConstraint()
     * @generated
     */
    EAttribute getUniqueConstraint_Kind();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.ReferentialConstraint <em>Referential Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Referential Constraint</em>'.
     * @see org.emftext.language.sql.schema.ReferentialConstraint
     * @generated
     */
    EClass getReferentialConstraint();

    /**
     * Returns the meta object for the reference list '{@link org.emftext.language.sql.schema.ReferentialConstraint#getReferencedColumns <em>Referenced Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referenced Columns</em>'.
     * @see org.emftext.language.sql.schema.ReferentialConstraint#getReferencedColumns()
     * @see #getReferentialConstraint()
     * @generated
     */
    EReference getReferentialConstraint_ReferencedColumns();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.schema.ReferentialConstraint#getReferencedTable <em>Referenced Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Referenced Table</em>'.
     * @see org.emftext.language.sql.schema.ReferentialConstraint#getReferencedTable()
     * @see #getReferentialConstraint()
     * @generated
     */
    EReference getReferentialConstraint_ReferencedTable();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.TableReference <em>Table Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Reference</em>'.
     * @see org.emftext.language.sql.schema.TableReference
     * @generated
     */
    EClass getTableReference();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.schema.TableReference#getCatalogName <em>Catalog Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Catalog Name</em>'.
     * @see org.emftext.language.sql.schema.TableReference#getCatalogName()
     * @see #getTableReference()
     * @generated
     */
    EAttribute getTableReference_CatalogName();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.schema.TableReference#getSchemaName <em>Schema Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Schema Name</em>'.
     * @see org.emftext.language.sql.schema.TableReference#getSchemaName()
     * @see #getTableReference()
     * @generated
     */
    EAttribute getTableReference_SchemaName();

    /**
     * Returns the meta object for the reference '{@link org.emftext.language.sql.schema.TableReference#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.emftext.language.sql.schema.TableReference#getTarget()
     * @see #getTableReference()
     * @generated
     */
    EReference getTableReference_Target();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.schema.TableColumnsConstraint <em>Table Columns Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Columns Constraint</em>'.
     * @see org.emftext.language.sql.schema.TableColumnsConstraint
     * @generated
     */
    EClass getTableColumnsConstraint();

    /**
     * Returns the meta object for the reference list '{@link org.emftext.language.sql.schema.TableColumnsConstraint#getColumns <em>Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Columns</em>'.
     * @see org.emftext.language.sql.schema.TableColumnsConstraint#getColumns()
     * @see #getTableColumnsConstraint()
     * @generated
     */
    EReference getTableColumnsConstraint_Columns();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.schema.TableScope <em>Table Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Table Scope</em>'.
     * @see org.emftext.language.sql.schema.TableScope
     * @generated
     */
    EEnum getTableScope();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.schema.UniqueSpecificationKind <em>Unique Specification Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Unique Specification Kind</em>'.
     * @see org.emftext.language.sql.schema.UniqueSpecificationKind
     * @generated
     */
    EEnum getUniqueSpecificationKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SchemaFactory getSchemaFactory();

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
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.TableDefinitionImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableDefinition()
        	 * @generated
        	 */
        EClass TABLE_DEFINITION = eINSTANCE.getTableDefinition();

        /**
        	 * The meta object literal for the '<em><b>Contents Source</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference TABLE_DEFINITION__CONTENTS_SOURCE = eINSTANCE.getTableDefinition_ContentsSource();

        /**
        	 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute TABLE_DEFINITION__SCOPE = eINSTANCE.getTableDefinition_Scope();

        /**
        	 * The meta object literal for the '<em><b>Schema Qualified Name</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME = eINSTANCE.getTableDefinition_SchemaQualifiedName();

        /**
        	 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute TABLE_DEFINITION__LABEL = eINSTANCE.getTableDefinition_Label();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.TableElementListImpl <em>Table Element List</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.TableElementListImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableElementList()
        	 * @generated
        	 */
        EClass TABLE_ELEMENT_LIST = eINSTANCE.getTableElementList();

        /**
        	 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference TABLE_ELEMENT_LIST__ELEMENTS = eINSTANCE.getTableElementList_Elements();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.TableElementImpl <em>Table Element</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.TableElementImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableElement()
        	 * @generated
        	 */
        EClass TABLE_ELEMENT = eINSTANCE.getTableElement();

        /**
        	 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference TABLE_ELEMENT__OWNER = eINSTANCE.getTableElement_Owner();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.ColumnImpl <em>Column</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.ColumnImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getColumn()
        	 * @generated
        	 */
        EClass COLUMN = eINSTANCE.getColumn();

        /**
        	 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

        /**
        	 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference COLUMN__DATA_TYPE = eINSTANCE.getColumn_DataType();

        /**
        	 * The meta object literal for the '<em><b>Default Option</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference COLUMN__DEFAULT_OPTION = eINSTANCE.getColumn_DefaultOption();

        /**
        	 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference COLUMN__CONSTRAINT = eINSTANCE.getColumn_Constraint();

        /**
        	 * The meta object literal for the '<em><b>Collation Name</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference COLUMN__COLLATION_NAME = eINSTANCE.getColumn_CollationName();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.TableConstraintImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableConstraint()
        	 * @generated
        	 */
        EClass TABLE_CONSTRAINT = eINSTANCE.getTableConstraint();

        /**
        	 * The meta object literal for the '<em><b>Schema Qualified Name</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME = eINSTANCE.getTableConstraint_SchemaQualifiedName();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.TableContentsSourceImpl <em>Table Contents Source</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.TableContentsSourceImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableContentsSource()
        	 * @generated
        	 */
        EClass TABLE_CONTENTS_SOURCE = eINSTANCE.getTableContentsSource();

        /**
        	 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference TABLE_CONTENTS_SOURCE__OWNER = eINSTANCE.getTableContentsSource_Owner();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.DefaultOptionImpl <em>Default Option</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.DefaultOptionImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getDefaultOption()
        	 * @generated
        	 */
        EClass DEFAULT_OPTION = eINSTANCE.getDefaultOption();

        /**
        	 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference DEFAULT_OPTION__OWNER = eINSTANCE.getDefaultOption_Owner();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.ColumnConstraintImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getColumnConstraint()
        	 * @generated
        	 */
        EClass COLUMN_CONSTRAINT = eINSTANCE.getColumnConstraint();

        /**
        	 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference COLUMN_CONSTRAINT__OWNER = eINSTANCE.getColumnConstraint_Owner();

        /**
        	 * The meta object literal for the '<em><b>Schema Qualified Name</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME = eINSTANCE.getColumnConstraint_SchemaQualifiedName();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.NotNullColumnConstraintImpl <em>Not Null Column Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.NotNullColumnConstraintImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getNotNullColumnConstraint()
        	 * @generated
        	 */
        EClass NOT_NULL_COLUMN_CONSTRAINT = eINSTANCE.getNotNullColumnConstraint();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.UniqueColumnConstraintImpl <em>Unique Column Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.UniqueColumnConstraintImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getUniqueColumnConstraint()
        	 * @generated
        	 */
        EClass UNIQUE_COLUMN_CONSTRAINT = eINSTANCE.getUniqueColumnConstraint();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.ReferentialColumnConstraintImpl <em>Referential Column Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.ReferentialColumnConstraintImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getReferentialColumnConstraint()
        	 * @generated
        	 */
        EClass REFERENTIAL_COLUMN_CONSTRAINT = eINSTANCE.getReferentialColumnConstraint();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.SQLSchemaStatementImpl <em>SQL Schema Statement</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.SQLSchemaStatementImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getSQLSchemaStatement()
        	 * @generated
        	 */
        EClass SQL_SCHEMA_STATEMENT = eINSTANCE.getSQLSchemaStatement();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.SQLSchemaDefinitionStatementImpl <em>SQL Schema Definition Statement</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.SQLSchemaDefinitionStatementImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getSQLSchemaDefinitionStatement()
        	 * @generated
        	 */
        EClass SQL_SCHEMA_DEFINITION_STATEMENT = eINSTANCE.getSQLSchemaDefinitionStatement();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.LiteralDefaultOptionImpl <em>Literal Default Option</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.LiteralDefaultOptionImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getLiteralDefaultOption()
        	 * @generated
        	 */
        EClass LITERAL_DEFAULT_OPTION = eINSTANCE.getLiteralDefaultOption();

        /**
        	 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference LITERAL_DEFAULT_OPTION__LITERAL = eINSTANCE.getLiteralDefaultOption_Literal();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.DatetimeValueFunctionDefaultOptionImpl <em>Datetime Value Function Default Option</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.DatetimeValueFunctionDefaultOptionImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getDatetimeValueFunctionDefaultOption()
        	 * @generated
        	 */
        EClass DATETIME_VALUE_FUNCTION_DEFAULT_OPTION = eINSTANCE.getDatetimeValueFunctionDefaultOption();

        /**
        	 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION = eINSTANCE
                .getDatetimeValueFunctionDefaultOption_Function();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.ImplicitlyTypedValueSpecificationDefaultOptionImpl <em>Implicitly Typed Value Specification Default Option</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.ImplicitlyTypedValueSpecificationDefaultOptionImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getImplicitlyTypedValueSpecificationDefaultOption()
        	 * @generated
        	 */
        EClass IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION = eINSTANCE
                .getImplicitlyTypedValueSpecificationDefaultOption();

        /**
        	 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION = eINSTANCE
                .getImplicitlyTypedValueSpecificationDefaultOption_Specification();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.UniqueTableConstraintImpl <em>Unique Table Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.UniqueTableConstraintImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getUniqueTableConstraint()
        	 * @generated
        	 */
        EClass UNIQUE_TABLE_CONSTRAINT = eINSTANCE.getUniqueTableConstraint();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl <em>Referential Table Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getReferentialTableConstraint()
        	 * @generated
        	 */
        EClass REFERENTIAL_TABLE_CONSTRAINT = eINSTANCE.getReferentialTableConstraint();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.UniqueConstraint <em>Unique Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.UniqueConstraint
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getUniqueConstraint()
        	 * @generated
        	 */
        EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

        /**
        	 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute UNIQUE_CONSTRAINT__KIND = eINSTANCE.getUniqueConstraint_Kind();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.ReferentialConstraint <em>Referential Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.ReferentialConstraint
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getReferentialConstraint()
        	 * @generated
        	 */
        EClass REFERENTIAL_CONSTRAINT = eINSTANCE.getReferentialConstraint();

        /**
        	 * The meta object literal for the '<em><b>Referenced Columns</b></em>' reference list feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference REFERENTIAL_CONSTRAINT__REFERENCED_COLUMNS = eINSTANCE.getReferentialConstraint_ReferencedColumns();

        /**
        	 * The meta object literal for the '<em><b>Referenced Table</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference REFERENTIAL_CONSTRAINT__REFERENCED_TABLE = eINSTANCE.getReferentialConstraint_ReferencedTable();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.TableReferenceImpl <em>Table Reference</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.TableReferenceImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableReference()
        	 * @generated
        	 */
        EClass TABLE_REFERENCE = eINSTANCE.getTableReference();

        /**
        	 * The meta object literal for the '<em><b>Catalog Name</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute TABLE_REFERENCE__CATALOG_NAME = eINSTANCE.getTableReference_CatalogName();

        /**
        	 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute TABLE_REFERENCE__SCHEMA_NAME = eINSTANCE.getTableReference_SchemaName();

        /**
        	 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference TABLE_REFERENCE__TARGET = eINSTANCE.getTableReference_Target();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.impl.TableColumnsConstraintImpl <em>Table Columns Constraint</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.impl.TableColumnsConstraintImpl
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableColumnsConstraint()
        	 * @generated
        	 */
        EClass TABLE_COLUMNS_CONSTRAINT = eINSTANCE.getTableColumnsConstraint();

        /**
        	 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference TABLE_COLUMNS_CONSTRAINT__COLUMNS = eINSTANCE.getTableColumnsConstraint_Columns();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.TableScope <em>Table Scope</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.TableScope
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getTableScope()
        	 * @generated
        	 */
        EEnum TABLE_SCOPE = eINSTANCE.getTableScope();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.schema.UniqueSpecificationKind <em>Unique Specification Kind</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.schema.UniqueSpecificationKind
        	 * @see org.emftext.language.sql.schema.impl.SchemaPackageImpl#getUniqueSpecificationKind()
        	 * @generated
        	 */
        EEnum UNIQUE_SPECIFICATION_KIND = eINSTANCE.getUniqueSpecificationKind();

    }

} //SchemaPackage
