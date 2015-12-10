/**
 */
package org.emftext.language.sql.literal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.sql.SQLPackage;
import org.emftext.language.sql.common.CommonPackage;

import org.emftext.language.sql.common.impl.CommonPackageImpl;

import org.emftext.language.sql.datatype.DatatypePackage;

import org.emftext.language.sql.datatype.impl.DatatypePackageImpl;

import org.emftext.language.sql.expression.ExpressionPackage;

import org.emftext.language.sql.expression.impl.ExpressionPackageImpl;

import org.emftext.language.sql.function.FunctionPackage;

import org.emftext.language.sql.function.impl.FunctionPackageImpl;

import org.emftext.language.sql.impl.SQLPackageImpl;
import org.emftext.language.sql.literal.ApproximateNumericLiteral;
import org.emftext.language.sql.literal.BooleanLiteral;
import org.emftext.language.sql.literal.CharacterStringLiteral;
import org.emftext.language.sql.literal.DateLiteral;
import org.emftext.language.sql.literal.DatetimeLiteral;
import org.emftext.language.sql.literal.ExactNumericLiteral;
import org.emftext.language.sql.literal.GeneralLiteral;
import org.emftext.language.sql.literal.Literal;
import org.emftext.language.sql.literal.LiteralFactory;
import org.emftext.language.sql.literal.LiteralPackage;
import org.emftext.language.sql.literal.NationalCharacterStringLiteral;
import org.emftext.language.sql.literal.NumericLiteral;
import org.emftext.language.sql.literal.TimeLiteral;
import org.emftext.language.sql.literal.TimestampLiteral;

import org.emftext.language.sql.schema.SchemaPackage;

import org.emftext.language.sql.schema.impl.SchemaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralPackageImpl extends EPackageImpl implements LiteralPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass literalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass generalLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass characterStringLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nationalCharacterStringLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datetimeLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timestampLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exactNumericLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass approximateNumericLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numericLiteralEClass = null;

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
     * @see org.emftext.language.sql.literal.LiteralPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private LiteralPackageImpl() {
        super(eNS_URI, LiteralFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link LiteralPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static LiteralPackage init() {
        if (isInited)
            return (LiteralPackage) EPackage.Registry.INSTANCE.getEPackage(LiteralPackage.eNS_URI);

        // Obtain or create and register package
        LiteralPackageImpl theLiteralPackage = (LiteralPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof LiteralPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new LiteralPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        SQLPackageImpl theSQLPackage = (SQLPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(SQLPackage.eNS_URI) instanceof SQLPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI) : SQLPackage.eINSTANCE);
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
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
        theLiteralPackage.createPackageContents();
        theSQLPackage.createPackageContents();
        theCommonPackage.createPackageContents();
        theDatatypePackage.createPackageContents();
        theFunctionPackage.createPackageContents();
        theExpressionPackage.createPackageContents();
        theSchemaPackage.createPackageContents();

        // Initialize created meta-data
        theLiteralPackage.initializePackageContents();
        theSQLPackage.initializePackageContents();
        theCommonPackage.initializePackageContents();
        theDatatypePackage.initializePackageContents();
        theFunctionPackage.initializePackageContents();
        theExpressionPackage.initializePackageContents();
        theSchemaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theLiteralPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(LiteralPackage.eNS_URI, theLiteralPackage);
        return theLiteralPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLiteral() {
        return literalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGeneralLiteral() {
        return generalLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCharacterStringLiteral() {
        return characterStringLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacterStringLiteral_CharacterSetName() {
        return (EReference) characterStringLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNationalCharacterStringLiteral() {
        return nationalCharacterStringLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNationalCharacterStringLiteral_Values() {
        return (EAttribute) nationalCharacterStringLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNationalCharacterStringLiteral_Separators() {
        return (EReference) nationalCharacterStringLiteralEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatetimeLiteral() {
        return datetimeLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBooleanLiteral() {
        return booleanLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBooleanLiteral_Value() {
        return (EAttribute) booleanLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDateLiteral() {
        return dateLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDateLiteral_Value() {
        return (EAttribute) dateLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeLiteral() {
        return timeLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeLiteral_Value() {
        return (EAttribute) timeLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimestampLiteral() {
        return timestampLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimestampLiteral_Value() {
        return (EAttribute) timestampLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExactNumericLiteral() {
        return exactNumericLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExactNumericLiteral_Value() {
        return (EAttribute) exactNumericLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getApproximateNumericLiteral() {
        return approximateNumericLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getApproximateNumericLiteral_Value() {
        return (EAttribute) approximateNumericLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumericLiteral() {
        return numericLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralFactory getLiteralFactory() {
        return (LiteralFactory) getEFactoryInstance();
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
        literalEClass = createEClass(LITERAL);

        generalLiteralEClass = createEClass(GENERAL_LITERAL);

        characterStringLiteralEClass = createEClass(CHARACTER_STRING_LITERAL);
        createEReference(characterStringLiteralEClass, CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME);

        nationalCharacterStringLiteralEClass = createEClass(NATIONAL_CHARACTER_STRING_LITERAL);
        createEAttribute(nationalCharacterStringLiteralEClass, NATIONAL_CHARACTER_STRING_LITERAL__VALUES);
        createEReference(nationalCharacterStringLiteralEClass, NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS);

        datetimeLiteralEClass = createEClass(DATETIME_LITERAL);

        booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
        createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

        dateLiteralEClass = createEClass(DATE_LITERAL);
        createEAttribute(dateLiteralEClass, DATE_LITERAL__VALUE);

        timeLiteralEClass = createEClass(TIME_LITERAL);
        createEAttribute(timeLiteralEClass, TIME_LITERAL__VALUE);

        timestampLiteralEClass = createEClass(TIMESTAMP_LITERAL);
        createEAttribute(timestampLiteralEClass, TIMESTAMP_LITERAL__VALUE);

        exactNumericLiteralEClass = createEClass(EXACT_NUMERIC_LITERAL);
        createEAttribute(exactNumericLiteralEClass, EXACT_NUMERIC_LITERAL__VALUE);

        approximateNumericLiteralEClass = createEClass(APPROXIMATE_NUMERIC_LITERAL);
        createEAttribute(approximateNumericLiteralEClass, APPROXIMATE_NUMERIC_LITERAL__VALUE);

        numericLiteralEClass = createEClass(NUMERIC_LITERAL);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        generalLiteralEClass.getESuperTypes().add(this.getLiteral());
        characterStringLiteralEClass.getESuperTypes().add(this.getNationalCharacterStringLiteral());
        nationalCharacterStringLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        datetimeLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        booleanLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        dateLiteralEClass.getESuperTypes().add(this.getDatetimeLiteral());
        timeLiteralEClass.getESuperTypes().add(this.getDatetimeLiteral());
        timestampLiteralEClass.getESuperTypes().add(this.getDatetimeLiteral());
        exactNumericLiteralEClass.getESuperTypes().add(this.getNumericLiteral());
        approximateNumericLiteralEClass.getESuperTypes().add(this.getNumericLiteral());
        numericLiteralEClass.getESuperTypes().add(this.getLiteral());

        // Initialize classes, features, and operations; add parameters
        initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(generalLiteralEClass, GeneralLiteral.class, "GeneralLiteral", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(characterStringLiteralEClass, CharacterStringLiteral.class, "CharacterStringLiteral", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacterStringLiteral_CharacterSetName(), theCommonPackage.getSchemaQualifiedName(), null,
                "characterSetName", null, 0, 1, CharacterStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nationalCharacterStringLiteralEClass, NationalCharacterStringLiteral.class,
                "NationalCharacterStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNationalCharacterStringLiteral_Values(), ecorePackage.getEString(), "values", null, 1, -1,
                NationalCharacterStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNationalCharacterStringLiteral_Separators(), theCommonPackage.getSeparator(), null,
                "separators", null, 0, -1, NationalCharacterStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(datetimeLiteralEClass, DatetimeLiteral.class, "DatetimeLiteral", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1,
                BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(dateLiteralEClass, DateLiteral.class, "DateLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDateLiteral_Value(), theCommonPackage.getDateType(), "value", null, 1, 1, DateLiteral.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timeLiteralEClass, TimeLiteral.class, "TimeLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTimeLiteral_Value(), theCommonPackage.getTimeType(), "value", null, 1, 1, TimeLiteral.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timestampLiteralEClass, TimestampLiteral.class, "TimestampLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTimestampLiteral_Value(), theCommonPackage.getTimestampType(), "value", null, 1, 1,
                TimestampLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(exactNumericLiteralEClass, ExactNumericLiteral.class, "ExactNumericLiteral", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExactNumericLiteral_Value(), ecorePackage.getEBigDecimal(), "value", null, 1, 1,
                ExactNumericLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(approximateNumericLiteralEClass, ApproximateNumericLiteral.class, "ApproximateNumericLiteral",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getApproximateNumericLiteral_Value(), ecorePackage.getEDouble(), "value", null, 1, 1,
                ApproximateNumericLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
    }

} //LiteralPackageImpl
