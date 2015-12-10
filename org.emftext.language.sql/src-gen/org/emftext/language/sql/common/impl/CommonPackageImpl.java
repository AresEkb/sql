/**
 */
package org.emftext.language.sql.common.impl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.sql.SQLPackage;
import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.common.BracketedComment;
import org.emftext.language.sql.common.Comment;
import org.emftext.language.sql.common.CommonFactory;
import org.emftext.language.sql.common.CommonPackage;
import org.emftext.language.sql.common.DirectSQLStatement;
import org.emftext.language.sql.common.SQLScript;
import org.emftext.language.sql.common.SchemaQualifiedName;
import org.emftext.language.sql.common.Separator;
import org.emftext.language.sql.common.SimpleComment;
import org.emftext.language.sql.common.Statement;

import org.emftext.language.sql.datatype.DatatypePackage;

import org.emftext.language.sql.datatype.impl.DatatypePackageImpl;

import org.emftext.language.sql.expression.ExpressionPackage;

import org.emftext.language.sql.expression.impl.ExpressionPackageImpl;

import org.emftext.language.sql.function.FunctionPackage;

import org.emftext.language.sql.function.impl.FunctionPackageImpl;

import org.emftext.language.sql.impl.SQLPackageImpl;
import org.emftext.language.sql.literal.LiteralPackage;

import org.emftext.language.sql.literal.impl.LiteralPackageImpl;

import org.emftext.language.sql.schema.SchemaPackage;

import org.emftext.language.sql.schema.impl.SchemaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sqlScriptEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass directSQLStatementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass separatorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleCommentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bracketedCommentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass statementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schemaQualifiedNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType unsignedIntegerEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType dateTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType timeTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType timestampTypeEDataType = null;

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
     * @see org.emftext.language.sql.common.CommonPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private CommonPackageImpl() {
        super(eNS_URI, CommonFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static CommonPackage init() {
        if (isInited)
            return (CommonPackage) EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

        // Obtain or create and register package
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new CommonPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        SQLPackageImpl theSQLPackage = (SQLPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(SQLPackage.eNS_URI) instanceof SQLPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI) : SQLPackage.eINSTANCE);
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
        SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(SchemaPackage.eNS_URI) instanceof SchemaPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) : SchemaPackage.eINSTANCE);

        // Create package meta-data objects
        theCommonPackage.createPackageContents();
        theSQLPackage.createPackageContents();
        theLiteralPackage.createPackageContents();
        theDatatypePackage.createPackageContents();
        theFunctionPackage.createPackageContents();
        theExpressionPackage.createPackageContents();
        theSchemaPackage.createPackageContents();

        // Initialize created meta-data
        theCommonPackage.initializePackageContents();
        theSQLPackage.initializePackageContents();
        theLiteralPackage.initializePackageContents();
        theDatatypePackage.initializePackageContents();
        theFunctionPackage.initializePackageContents();
        theExpressionPackage.initializePackageContents();
        theSchemaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCommonPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
        return theCommonPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSQLScript() {
        return sqlScriptEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSQLScript_Statements() {
        return (EReference) sqlScriptEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDirectSQLStatement() {
        return directSQLStatementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSeparator() {
        return separatorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComment() {
        return commentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComment_Value() {
        return (EAttribute) commentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleComment() {
        return simpleCommentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBracketedComment() {
        return bracketedCommentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStatement() {
        return statementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSchemaQualifiedName() {
        return schemaQualifiedNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaQualifiedName_CatalogName() {
        return (EAttribute) schemaQualifiedNameEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaQualifiedName_SchemaName() {
        return (EAttribute) schemaQualifiedNameEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaQualifiedName_Name() {
        return (EAttribute) schemaQualifiedNameEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUnsignedInteger() {
        return unsignedIntegerEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDateType() {
        return dateTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTimeType() {
        return timeTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTimestampType() {
        return timestampTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommonFactory getCommonFactory() {
        return (CommonFactory) getEFactoryInstance();
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
        sqlScriptEClass = createEClass(SQL_SCRIPT);
        createEReference(sqlScriptEClass, SQL_SCRIPT__STATEMENTS);

        directSQLStatementEClass = createEClass(DIRECT_SQL_STATEMENT);

        separatorEClass = createEClass(SEPARATOR);

        commentEClass = createEClass(COMMENT);
        createEAttribute(commentEClass, COMMENT__VALUE);

        simpleCommentEClass = createEClass(SIMPLE_COMMENT);

        bracketedCommentEClass = createEClass(BRACKETED_COMMENT);

        statementEClass = createEClass(STATEMENT);

        schemaQualifiedNameEClass = createEClass(SCHEMA_QUALIFIED_NAME);
        createEAttribute(schemaQualifiedNameEClass, SCHEMA_QUALIFIED_NAME__CATALOG_NAME);
        createEAttribute(schemaQualifiedNameEClass, SCHEMA_QUALIFIED_NAME__SCHEMA_NAME);
        createEAttribute(schemaQualifiedNameEClass, SCHEMA_QUALIFIED_NAME__NAME);

        // Create data types
        unsignedIntegerEDataType = createEDataType(UNSIGNED_INTEGER);
        dateTypeEDataType = createEDataType(DATE_TYPE);
        timeTypeEDataType = createEDataType(TIME_TYPE);
        timestampTypeEDataType = createEDataType(TIMESTAMP_TYPE);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        directSQLStatementEClass.getESuperTypes().add(this.getStatement());
        separatorEClass.getESuperTypes().add(this.getStatement());
        commentEClass.getESuperTypes().add(this.getSeparator());
        simpleCommentEClass.getESuperTypes().add(this.getComment());
        bracketedCommentEClass.getESuperTypes().add(this.getComment());

        // Initialize classes, features, and operations; add parameters
        initEClass(sqlScriptEClass, SQLScript.class, "SQLScript", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSQLScript_Statements(), this.getStatement(), null, "statements", null, 0, -1, SQLScript.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(directSQLStatementEClass, DirectSQLStatement.class, "DirectSQLStatement", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(separatorEClass, Separator.class, "Separator", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(commentEClass, Comment.class, "Comment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getComment_Value(), ecorePackage.getEString(), "value", null, 1, 1, Comment.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(simpleCommentEClass, SimpleComment.class, "SimpleComment", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(bracketedCommentEClass, BracketedComment.class, "BracketedComment", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(schemaQualifiedNameEClass, SchemaQualifiedName.class, "SchemaQualifiedName", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSchemaQualifiedName_CatalogName(), ecorePackage.getEString(), "catalogName", null, 0, 1,
                SchemaQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaQualifiedName_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1,
                SchemaQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaQualifiedName_Name(), ecorePackage.getEString(), "name", null, 1, 1,
                SchemaQualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(unsignedIntegerEDataType, UnsignedInteger.class, "UnsignedInteger", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(dateTypeEDataType, LocalDate.class, "DateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(timeTypeEDataType, LocalTime.class, "TimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(timestampTypeEDataType, ZonedDateTime.class, "TimestampType", IS_SERIALIZABLE,
                !IS_GENERATED_INSTANCE_CLASS);

        // Create annotations
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
        // org.emftext.language.sql.conversionDelegateFactory
        createOrgAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";
        addAnnotation(this, source,
                new String[] { "conversionDelegates", "org.emftext.language.sql.conversionDelegateFactory" });
    }

    /**
     * Initializes the annotations for <b>org.emftext.language.sql.conversionDelegateFactory</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createOrgAnnotations() {
        String source = "org.emftext.language.sql.conversionDelegateFactory";
        addAnnotation(dateTypeEDataType, source, new String[] {});
        addAnnotation(timeTypeEDataType, source, new String[] {});
        addAnnotation(timestampTypeEDataType, source, new String[] {});
    }

} //CommonPackageImpl
