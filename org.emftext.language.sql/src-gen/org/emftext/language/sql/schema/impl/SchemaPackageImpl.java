/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.sql.common.CommonPackage;

import org.emftext.language.sql.common.impl.CommonPackageImpl;

import org.emftext.language.sql.datatype.DatatypePackage;

import org.emftext.language.sql.datatype.impl.DatatypePackageImpl;

import org.emftext.language.sql.expression.ExpressionPackage;

import org.emftext.language.sql.expression.impl.ExpressionPackageImpl;

import org.emftext.language.sql.function.FunctionPackage;

import org.emftext.language.sql.function.impl.FunctionPackageImpl;

import org.emftext.language.sql.literal.LiteralPackage;

import org.emftext.language.sql.literal.impl.LiteralPackageImpl;

import org.emftext.language.sql.schema.Column;
import org.emftext.language.sql.schema.ColumnConstraint;
import org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption;
import org.emftext.language.sql.schema.DefaultOption;
import org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption;
import org.emftext.language.sql.schema.LiteralDefaultOption;
import org.emftext.language.sql.schema.NotNullColumnConstraint;
import org.emftext.language.sql.schema.ReferentialColumnConstraint;
import org.emftext.language.sql.schema.ReferentialConstraint;
import org.emftext.language.sql.schema.ReferentialTableConstraint;
import org.emftext.language.sql.schema.SQLSchemaDefinitionStatement;
import org.emftext.language.sql.schema.SQLSchemaStatement;
import org.emftext.language.sql.schema.SchemaFactory;
import org.emftext.language.sql.schema.SchemaPackage;
import org.emftext.language.sql.schema.TableCommitAction;
import org.emftext.language.sql.schema.TableConstraint;
import org.emftext.language.sql.schema.TableContentsSource;
import org.emftext.language.sql.schema.TableDefinition;
import org.emftext.language.sql.schema.TableElement;
import org.emftext.language.sql.schema.TableElementList;
import org.emftext.language.sql.schema.TableScope;
import org.emftext.language.sql.schema.UniqueColumnConstraint;
import org.emftext.language.sql.schema.UniqueConstraint;
import org.emftext.language.sql.schema.UniqueSpecificationKind;
import org.emftext.language.sql.schema.UniqueTableConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaPackageImpl extends EPackageImpl implements SchemaPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tableDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tableElementListEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tableElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass columnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tableConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tableContentsSourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultOptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass columnConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass notNullColumnConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uniqueColumnConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referentialColumnConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sqlSchemaStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sqlSchemaDefinitionStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalDefaultOptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datetimeValueFunctionDefaultOptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass implicitlyTypedValueSpecificationDefaultOptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uniqueTableConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referentialTableConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uniqueConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referentialConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tableScopeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tableCommitActionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum uniqueSpecificationKindEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.emftext.language.sql.schema.SchemaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SchemaPackageImpl() {
        super(eNS_URI, SchemaFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link SchemaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SchemaPackage init() {
        if (isInited)
            return (SchemaPackage) EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);

        // Obtain or create and register package
        SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof SchemaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new SchemaPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
        LiteralPackageImpl theLiteralPackage = (LiteralPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(LiteralPackage.eNS_URI) instanceof LiteralPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(LiteralPackage.eNS_URI) : LiteralPackage.eINSTANCE);
        DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
        FunctionPackageImpl theFunctionPackage = (FunctionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(FunctionPackage.eNS_URI) instanceof FunctionPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI) : FunctionPackage.eINSTANCE);
        ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI)
                        : ExpressionPackage.eINSTANCE);

        // Create package meta-data objects
        theSchemaPackage.createPackageContents();
        theCommonPackage.createPackageContents();
        theLiteralPackage.createPackageContents();
        theDatatypePackage.createPackageContents();
        theFunctionPackage.createPackageContents();
        theExpressionPackage.createPackageContents();

        // Initialize created meta-data
        theSchemaPackage.initializePackageContents();
        theCommonPackage.initializePackageContents();
        theLiteralPackage.initializePackageContents();
        theDatatypePackage.initializePackageContents();
        theFunctionPackage.initializePackageContents();
        theExpressionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSchemaPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SchemaPackage.eNS_URI, theSchemaPackage);
        return theSchemaPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTableDefinition() {
        return tableDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTableDefinition_Name() {
        return (EAttribute) tableDefinitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTableDefinition_ContentsSource() {
        return (EReference) tableDefinitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTableDefinition_Scope() {
        return (EAttribute) tableDefinitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTableDefinition_CommitAction() {
        return (EAttribute) tableDefinitionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTableElementList() {
        return tableElementListEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTableElementList_Elements() {
        return (EReference) tableElementListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTableElement() {
        return tableElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTableElement_Owner() {
        return (EReference) tableElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColumn() {
        return columnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumn_Name() {
        return (EAttribute) columnEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumn_DataType() {
        return (EReference) columnEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumn_DefaultOption() {
        return (EReference) columnEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumn_ConstraintDefinition() {
        return (EReference) columnEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumn_CollationName() {
        return (EAttribute) columnEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTableConstraint() {
        return tableConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTableConstraint_Name() {
        return (EAttribute) tableConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTableContentsSource() {
        return tableContentsSourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTableContentsSource_Owner() {
        return (EReference) tableContentsSourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefaultOption() {
        return defaultOptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefaultOption_Owner() {
        return (EReference) defaultOptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getColumnConstraint() {
        return columnConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getColumnConstraint_Owner() {
        return (EReference) columnConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getColumnConstraint_Name() {
        return (EAttribute) columnConstraintEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNotNullColumnConstraint() {
        return notNullColumnConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUniqueColumnConstraint() {
        return uniqueColumnConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferentialColumnConstraint() {
        return referentialColumnConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSQLSchemaStatement() {
        return sqlSchemaStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSQLSchemaDefinitionStatement() {
        return sqlSchemaDefinitionStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLiteralDefaultOption() {
        return literalDefaultOptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLiteralDefaultOption_Literal() {
        return (EReference) literalDefaultOptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatetimeValueFunctionDefaultOption() {
        return datetimeValueFunctionDefaultOptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDatetimeValueFunctionDefaultOption_Function() {
        return (EReference) datetimeValueFunctionDefaultOptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImplicitlyTypedValueSpecificationDefaultOption() {
        return implicitlyTypedValueSpecificationDefaultOptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getImplicitlyTypedValueSpecificationDefaultOption_Specification() {
        return (EReference) implicitlyTypedValueSpecificationDefaultOptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUniqueTableConstraint() {
        return uniqueTableConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUniqueTableConstraint_Columns() {
        return (EReference) uniqueTableConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferentialTableConstraint() {
        return referentialTableConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferentialTableConstraint_Columns() {
        return (EReference) referentialTableConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUniqueConstraint() {
        return uniqueConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUniqueConstraint_Kind() {
        return (EAttribute) uniqueConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferentialConstraint() {
        return referentialConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferentialConstraint_ReferencedColumns() {
        return (EReference) referentialConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferentialConstraint_ReferencedTable() {
        return (EReference) referentialConstraintEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTableScope() {
        return tableScopeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTableCommitAction() {
        return tableCommitActionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUniqueSpecificationKind() {
        return uniqueSpecificationKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaFactory getSchemaFactory() {
        return (SchemaFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        tableDefinitionEClass = createEClass(TABLE_DEFINITION);
        createEAttribute(tableDefinitionEClass, TABLE_DEFINITION__NAME);
        createEReference(tableDefinitionEClass, TABLE_DEFINITION__CONTENTS_SOURCE);
        createEAttribute(tableDefinitionEClass, TABLE_DEFINITION__SCOPE);
        createEAttribute(tableDefinitionEClass, TABLE_DEFINITION__COMMIT_ACTION);

        tableElementListEClass = createEClass(TABLE_ELEMENT_LIST);
        createEReference(tableElementListEClass, TABLE_ELEMENT_LIST__ELEMENTS);

        tableElementEClass = createEClass(TABLE_ELEMENT);
        createEReference(tableElementEClass, TABLE_ELEMENT__OWNER);

        columnEClass = createEClass(COLUMN);
        createEAttribute(columnEClass, COLUMN__NAME);
        createEReference(columnEClass, COLUMN__DATA_TYPE);
        createEReference(columnEClass, COLUMN__DEFAULT_OPTION);
        createEReference(columnEClass, COLUMN__CONSTRAINT_DEFINITION);
        createEAttribute(columnEClass, COLUMN__COLLATION_NAME);

        tableConstraintEClass = createEClass(TABLE_CONSTRAINT);
        createEAttribute(tableConstraintEClass, TABLE_CONSTRAINT__NAME);

        tableContentsSourceEClass = createEClass(TABLE_CONTENTS_SOURCE);
        createEReference(tableContentsSourceEClass, TABLE_CONTENTS_SOURCE__OWNER);

        defaultOptionEClass = createEClass(DEFAULT_OPTION);
        createEReference(defaultOptionEClass, DEFAULT_OPTION__OWNER);

        columnConstraintEClass = createEClass(COLUMN_CONSTRAINT);
        createEReference(columnConstraintEClass, COLUMN_CONSTRAINT__OWNER);
        createEAttribute(columnConstraintEClass, COLUMN_CONSTRAINT__NAME);

        notNullColumnConstraintEClass = createEClass(NOT_NULL_COLUMN_CONSTRAINT);

        uniqueColumnConstraintEClass = createEClass(UNIQUE_COLUMN_CONSTRAINT);

        referentialColumnConstraintEClass = createEClass(REFERENTIAL_COLUMN_CONSTRAINT);

        sqlSchemaStatementEClass = createEClass(SQL_SCHEMA_STATEMENT);

        sqlSchemaDefinitionStatementEClass = createEClass(SQL_SCHEMA_DEFINITION_STATEMENT);

        literalDefaultOptionEClass = createEClass(LITERAL_DEFAULT_OPTION);
        createEReference(literalDefaultOptionEClass, LITERAL_DEFAULT_OPTION__LITERAL);

        datetimeValueFunctionDefaultOptionEClass = createEClass(DATETIME_VALUE_FUNCTION_DEFAULT_OPTION);
        createEReference(datetimeValueFunctionDefaultOptionEClass, DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION);

        implicitlyTypedValueSpecificationDefaultOptionEClass = createEClass(
                IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION);
        createEReference(implicitlyTypedValueSpecificationDefaultOptionEClass,
                IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION);

        uniqueTableConstraintEClass = createEClass(UNIQUE_TABLE_CONSTRAINT);
        createEReference(uniqueTableConstraintEClass, UNIQUE_TABLE_CONSTRAINT__COLUMNS);

        referentialTableConstraintEClass = createEClass(REFERENTIAL_TABLE_CONSTRAINT);
        createEReference(referentialTableConstraintEClass, REFERENTIAL_TABLE_CONSTRAINT__COLUMNS);

        uniqueConstraintEClass = createEClass(UNIQUE_CONSTRAINT);
        createEAttribute(uniqueConstraintEClass, UNIQUE_CONSTRAINT__KIND);

        referentialConstraintEClass = createEClass(REFERENTIAL_CONSTRAINT);
        createEReference(referentialConstraintEClass, REFERENTIAL_CONSTRAINT__REFERENCED_COLUMNS);
        createEReference(referentialConstraintEClass, REFERENTIAL_CONSTRAINT__REFERENCED_TABLE);

        // Create enums
        tableScopeEEnum = createEEnum(TABLE_SCOPE);
        tableCommitActionEEnum = createEEnum(TABLE_COMMIT_ACTION);
        uniqueSpecificationKindEEnum = createEEnum(UNIQUE_SPECIFICATION_KIND);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        CommonPackage theCommonPackage = (CommonPackage) EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
        DatatypePackage theDatatypePackage = (DatatypePackage) EPackage.Registry.INSTANCE
                .getEPackage(DatatypePackage.eNS_URI);
        LiteralPackage theLiteralPackage = (LiteralPackage) EPackage.Registry.INSTANCE
                .getEPackage(LiteralPackage.eNS_URI);
        FunctionPackage theFunctionPackage = (FunctionPackage) EPackage.Registry.INSTANCE
                .getEPackage(FunctionPackage.eNS_URI);
        ExpressionPackage theExpressionPackage = (ExpressionPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExpressionPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        tableDefinitionEClass.getESuperTypes().add(this.getSQLSchemaDefinitionStatement());
        tableElementListEClass.getESuperTypes().add(this.getTableContentsSource());
        columnEClass.getESuperTypes().add(this.getTableElement());
        tableConstraintEClass.getESuperTypes().add(this.getTableElement());
        notNullColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
        uniqueColumnConstraintEClass.getESuperTypes().add(this.getUniqueConstraint());
        uniqueColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
        referentialColumnConstraintEClass.getESuperTypes().add(this.getReferentialConstraint());
        referentialColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
        sqlSchemaStatementEClass.getESuperTypes().add(theCommonPackage.getDirectSQLStatement());
        sqlSchemaDefinitionStatementEClass.getESuperTypes().add(this.getSQLSchemaStatement());
        literalDefaultOptionEClass.getESuperTypes().add(this.getDefaultOption());
        datetimeValueFunctionDefaultOptionEClass.getESuperTypes().add(this.getDefaultOption());
        implicitlyTypedValueSpecificationDefaultOptionEClass.getESuperTypes().add(this.getDefaultOption());
        uniqueTableConstraintEClass.getESuperTypes().add(this.getTableConstraint());
        uniqueTableConstraintEClass.getESuperTypes().add(this.getUniqueConstraint());
        referentialTableConstraintEClass.getESuperTypes().add(this.getTableConstraint());
        referentialTableConstraintEClass.getESuperTypes().add(this.getReferentialConstraint());

        // Initialize classes, features, and operations; add parameters
        initEClass(tableDefinitionEClass, TableDefinition.class, "TableDefinition", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTableDefinition_Name(), theCommonPackage.getLocalOrSchemaQualifiedName(), "name", null, 1, 1,
                TableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getTableDefinition_ContentsSource(), this.getTableContentsSource(),
                this.getTableContentsSource_Owner(), "contentsSource", null, 1, 1, TableDefinition.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        initEAttribute(getTableDefinition_Scope(), this.getTableScope(), "scope", null, 0, 1, TableDefinition.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTableDefinition_CommitAction(), this.getTableCommitAction(), "commitAction", null, 0, 1,
                TableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(tableElementListEClass, TableElementList.class, "TableElementList", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTableElementList_Elements(), this.getTableElement(), this.getTableElement_Owner(), "elements",
                null, 1, -1, TableElementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tableElementEClass, TableElement.class, "TableElement", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTableElement_Owner(), this.getTableElementList(), this.getTableElementList_Elements(),
                "owner", null, 1, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getColumn_Name(), theCommonPackage.getIdentifier(), "name", null, 1, 1, Column.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumn_DataType(), theDatatypePackage.getDataType(), null, "dataType", null, 1, 1,
                Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumn_DefaultOption(), this.getDefaultOption(), this.getDefaultOption_Owner(),
                "defaultOption", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getColumn_ConstraintDefinition(), this.getColumnConstraint(), this.getColumnConstraint_Owner(),
                "constraintDefinition", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumn_CollationName(), theCommonPackage.getSchemaQualifiedName(), "collationName", null, 0,
                1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(tableConstraintEClass, TableConstraint.class, "TableConstraint", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTableConstraint_Name(), theCommonPackage.getSchemaQualifiedName(), "name", null, 0, 1,
                TableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(tableContentsSourceEClass, TableContentsSource.class, "TableContentsSource", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTableContentsSource_Owner(), this.getTableDefinition(),
                this.getTableDefinition_ContentsSource(), "owner", null, 1, 1, TableContentsSource.class, IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(defaultOptionEClass, DefaultOption.class, "DefaultOption", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDefaultOption_Owner(), this.getColumn(), this.getColumn_DefaultOption(), "owner", null, 1, 1,
                DefaultOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(columnConstraintEClass, ColumnConstraint.class, "ColumnConstraint", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getColumnConstraint_Owner(), this.getColumn(), this.getColumn_ConstraintDefinition(), "owner",
                null, 1, 1, ColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumnConstraint_Name(), theCommonPackage.getSchemaQualifiedName(), "name", null, 0, 1,
                ColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(notNullColumnConstraintEClass, NotNullColumnConstraint.class, "NotNullColumnConstraint",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uniqueColumnConstraintEClass, UniqueColumnConstraint.class, "UniqueColumnConstraint", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(referentialColumnConstraintEClass, ReferentialColumnConstraint.class, "ReferentialColumnConstraint",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sqlSchemaStatementEClass, SQLSchemaStatement.class, "SQLSchemaStatement", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(sqlSchemaDefinitionStatementEClass, SQLSchemaDefinitionStatement.class,
                "SQLSchemaDefinitionStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(literalDefaultOptionEClass, LiteralDefaultOption.class, "LiteralDefaultOption", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLiteralDefaultOption_Literal(), theLiteralPackage.getLiteral(), null, "literal", null, 1, 1,
                LiteralDefaultOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(datetimeValueFunctionDefaultOptionEClass, DatetimeValueFunctionDefaultOption.class,
                "DatetimeValueFunctionDefaultOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDatetimeValueFunctionDefaultOption_Function(), theFunctionPackage.getDatetimeValueFunction(),
                null, "function", null, 1, 1, DatetimeValueFunctionDefaultOption.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(implicitlyTypedValueSpecificationDefaultOptionEClass,
                ImplicitlyTypedValueSpecificationDefaultOption.class, "ImplicitlyTypedValueSpecificationDefaultOption",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getImplicitlyTypedValueSpecificationDefaultOption_Specification(),
                theExpressionPackage.getImplicitlyTypedValueSpecification(), null, "specification", null, 1, 1,
                ImplicitlyTypedValueSpecificationDefaultOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(uniqueTableConstraintEClass, UniqueTableConstraint.class, "UniqueTableConstraint", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUniqueTableConstraint_Columns(), this.getColumn(), null, "columns", null, 1, -1,
                UniqueTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referentialTableConstraintEClass, ReferentialTableConstraint.class, "ReferentialTableConstraint",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReferentialTableConstraint_Columns(), this.getColumn(), null, "columns", null, 1, -1,
                ReferentialTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(uniqueConstraintEClass, UniqueConstraint.class, "UniqueConstraint", IS_ABSTRACT, IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUniqueConstraint_Kind(), this.getUniqueSpecificationKind(), "kind", null, 1, 1,
                UniqueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(referentialConstraintEClass, ReferentialConstraint.class, "ReferentialConstraint", IS_ABSTRACT,
                IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReferentialConstraint_ReferencedColumns(), this.getColumn(), null, "referencedColumns", null,
                0, -1, ReferentialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReferentialConstraint_ReferencedTable(), this.getTableDefinition(), null, "referencedTable",
                null, 1, 1, ReferentialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(tableScopeEEnum, TableScope.class, "TableScope");
        addEEnumLiteral(tableScopeEEnum, TableScope.PERSISTENT);
        addEEnumLiteral(tableScopeEEnum, TableScope.GLOBAL_TEMPORARY);
        addEEnumLiteral(tableScopeEEnum, TableScope.LOCAL_TEMPORARY);

        initEEnum(tableCommitActionEEnum, TableCommitAction.class, "TableCommitAction");
        addEEnumLiteral(tableCommitActionEEnum, TableCommitAction.UNSPECIFIED);
        addEEnumLiteral(tableCommitActionEEnum, TableCommitAction.PRESERVE_ROWS);
        addEEnumLiteral(tableCommitActionEEnum, TableCommitAction.DELETE_ROWS);

        initEEnum(uniqueSpecificationKindEEnum, UniqueSpecificationKind.class, "UniqueSpecificationKind");
        addEEnumLiteral(uniqueSpecificationKindEEnum, UniqueSpecificationKind.UNIQUE);
        addEEnumLiteral(uniqueSpecificationKindEEnum, UniqueSpecificationKind.PRIMARY_KEY);

        // Create resource
        createResource(eNS_URI);
    }

} //SchemaPackageImpl
