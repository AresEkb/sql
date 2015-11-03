/**
 */
package org.emftext.language.sql.literal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.sql.common.CommonPackage;

import org.emftext.language.sql.common.impl.CommonPackageImpl;

import org.emftext.language.sql.datatype.DatatypePackage;

import org.emftext.language.sql.datatype.impl.DatatypePackageImpl;

import org.emftext.language.sql.expression.ExpressionPackage;

import org.emftext.language.sql.expression.impl.ExpressionPackageImpl;

import org.emftext.language.sql.function.FunctionPackage;

import org.emftext.language.sql.function.impl.FunctionPackageImpl;

import org.emftext.language.sql.literal.BinaryStringLiteral;
import org.emftext.language.sql.literal.BooleanLiteral;
import org.emftext.language.sql.literal.CharacterStringLiteral;
import org.emftext.language.sql.literal.DateLiteral;
import org.emftext.language.sql.literal.DatetimeLiteral;
import org.emftext.language.sql.literal.GeneralLiteral;
import org.emftext.language.sql.literal.IntervalLiteral;
import org.emftext.language.sql.literal.Literal;
import org.emftext.language.sql.literal.LiteralFactory;
import org.emftext.language.sql.literal.LiteralPackage;
import org.emftext.language.sql.literal.NationalCharacterStringLiteral;
import org.emftext.language.sql.literal.SignedNumericLiteral;
import org.emftext.language.sql.literal.TimeLiteral;
import org.emftext.language.sql.literal.TimestampLiteral;
import org.emftext.language.sql.literal.UnicodeCharacterStringLiteral;
import org.emftext.language.sql.literal.UnsignedLiteral;
import org.emftext.language.sql.literal.UnsignedNumericLiteral;

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
    private EClass signedNumericLiteralEClass = null;

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
    private EClass unicodeCharacterStringLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass binaryStringLiteralEClass = null;

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
    private EClass intervalLiteralEClass = null;

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
    private EClass unsignedLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unsignedNumericLiteralEClass = null;

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
        theCommonPackage.createPackageContents();
        theDatatypePackage.createPackageContents();
        theFunctionPackage.createPackageContents();
        theExpressionPackage.createPackageContents();
        theSchemaPackage.createPackageContents();

        // Initialize created meta-data
        theLiteralPackage.initializePackageContents();
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
    public EClass getSignedNumericLiteral() {
        return signedNumericLiteralEClass;
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
    public EClass getNationalCharacterStringLiteral() {
        return nationalCharacterStringLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUnicodeCharacterStringLiteral() {
        return unicodeCharacterStringLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBinaryStringLiteral() {
        return binaryStringLiteralEClass;
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
    public EAttribute getDatetimeLiteral_Value() {
        return (EAttribute) datetimeLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntervalLiteral() {
        return intervalLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntervalLiteral_IsPositive() {
        return (EAttribute) intervalLiteralEClass.getEStructuralFeatures().get(0);
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
    public EClass getUnsignedLiteral() {
        return unsignedLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUnsignedNumericLiteral() {
        return unsignedNumericLiteralEClass;
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
    public EClass getTimeLiteral() {
        return timeLiteralEClass;
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

        signedNumericLiteralEClass = createEClass(SIGNED_NUMERIC_LITERAL);

        generalLiteralEClass = createEClass(GENERAL_LITERAL);

        characterStringLiteralEClass = createEClass(CHARACTER_STRING_LITERAL);

        nationalCharacterStringLiteralEClass = createEClass(NATIONAL_CHARACTER_STRING_LITERAL);

        unicodeCharacterStringLiteralEClass = createEClass(UNICODE_CHARACTER_STRING_LITERAL);

        binaryStringLiteralEClass = createEClass(BINARY_STRING_LITERAL);

        datetimeLiteralEClass = createEClass(DATETIME_LITERAL);
        createEAttribute(datetimeLiteralEClass, DATETIME_LITERAL__VALUE);

        intervalLiteralEClass = createEClass(INTERVAL_LITERAL);
        createEAttribute(intervalLiteralEClass, INTERVAL_LITERAL__IS_POSITIVE);

        booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
        createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

        unsignedLiteralEClass = createEClass(UNSIGNED_LITERAL);

        unsignedNumericLiteralEClass = createEClass(UNSIGNED_NUMERIC_LITERAL);

        dateLiteralEClass = createEClass(DATE_LITERAL);

        timeLiteralEClass = createEClass(TIME_LITERAL);

        timestampLiteralEClass = createEClass(TIMESTAMP_LITERAL);
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
        signedNumericLiteralEClass.getESuperTypes().add(this.getLiteral());
        generalLiteralEClass.getESuperTypes().add(this.getLiteral());
        generalLiteralEClass.getESuperTypes().add(this.getUnsignedLiteral());
        characterStringLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        nationalCharacterStringLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        unicodeCharacterStringLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        binaryStringLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        datetimeLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        intervalLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        booleanLiteralEClass.getESuperTypes().add(this.getGeneralLiteral());
        unsignedNumericLiteralEClass.getESuperTypes().add(this.getUnsignedLiteral());
        dateLiteralEClass.getESuperTypes().add(this.getDatetimeLiteral());
        timeLiteralEClass.getESuperTypes().add(this.getDatetimeLiteral());
        timestampLiteralEClass.getESuperTypes().add(this.getDatetimeLiteral());

        // Initialize classes, features, and operations; add parameters
        initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(signedNumericLiteralEClass, SignedNumericLiteral.class, "SignedNumericLiteral", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(generalLiteralEClass, GeneralLiteral.class, "GeneralLiteral", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(characterStringLiteralEClass, CharacterStringLiteral.class, "CharacterStringLiteral", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nationalCharacterStringLiteralEClass, NationalCharacterStringLiteral.class,
                "NationalCharacterStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(unicodeCharacterStringLiteralEClass, UnicodeCharacterStringLiteral.class,
                "UnicodeCharacterStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(binaryStringLiteralEClass, BinaryStringLiteral.class, "BinaryStringLiteral", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(datetimeLiteralEClass, DatetimeLiteral.class, "DatetimeLiteral", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDatetimeLiteral_Value(), ecorePackage.getEDate(), "value", null, 1, 1, DatetimeLiteral.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(intervalLiteralEClass, IntervalLiteral.class, "IntervalLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntervalLiteral_IsPositive(), ecorePackage.getEBoolean(), "isPositive", "true", 1, 1,
                IntervalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1,
                BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(unsignedLiteralEClass, UnsignedLiteral.class, "UnsignedLiteral", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(unsignedNumericLiteralEClass, UnsignedNumericLiteral.class, "UnsignedNumericLiteral", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dateLiteralEClass, DateLiteral.class, "DateLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(timeLiteralEClass, TimeLiteral.class, "TimeLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(timestampLiteralEClass, TimestampLiteral.class, "TimestampLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //LiteralPackageImpl
