/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.sql.SQLPackage;
import org.emftext.language.sql.common.CommonPackage;

import org.emftext.language.sql.common.impl.CommonPackageImpl;

import org.emftext.language.sql.datatype.ApproximateNumericType;
import org.emftext.language.sql.datatype.ApproximateNumericTypeKind;
import org.emftext.language.sql.datatype.BinaryLargeObjectStringType;
import org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind;
import org.emftext.language.sql.datatype.BooleanType;
import org.emftext.language.sql.datatype.CharLengthUnits;
import org.emftext.language.sql.datatype.CharacterStringType;
import org.emftext.language.sql.datatype.CharacterStringTypeKind;
import org.emftext.language.sql.datatype.DataType;
import org.emftext.language.sql.datatype.DatatypeFactory;
import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.DateType;
import org.emftext.language.sql.datatype.DatetimeType;
import org.emftext.language.sql.datatype.ExactNumericType;
import org.emftext.language.sql.datatype.ExactNumericTypeKind;
import org.emftext.language.sql.datatype.LargeObjectLength;
import org.emftext.language.sql.datatype.Multiplier;
import org.emftext.language.sql.datatype.NationalCharacterStringType;
import org.emftext.language.sql.datatype.NationalCharacterStringTypeKind;
import org.emftext.language.sql.datatype.NumericType;
import org.emftext.language.sql.datatype.PredefinedType;
import org.emftext.language.sql.datatype.TimeType;
import org.emftext.language.sql.datatype.TimestampType;

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
public class DatatypePackageImpl extends EPackageImpl implements DatatypePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass predefinedTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass characterStringTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nationalCharacterStringTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass binaryLargeObjectStringTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numericTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datetimeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exactNumericTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass approximateNumericTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass largeObjectLengthEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timestampTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum characterStringTypeKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum nationalCharacterStringTypeKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum binaryLargeObjectStringTypeKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum exactNumericTypeKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum approximateNumericTypeKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum multiplierEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum charLengthUnitsEEnum = null;

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
     * @see org.emftext.language.sql.datatype.DatatypePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DatatypePackageImpl() {
        super(eNS_URI, DatatypeFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DatatypePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DatatypePackage init() {
        if (isInited)
            return (DatatypePackage) EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI);

        // Obtain or create and register package
        DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new DatatypePackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        SQLPackageImpl theSQLPackage = (SQLPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(SQLPackage.eNS_URI) instanceof SQLPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI) : SQLPackage.eINSTANCE);
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
        LiteralPackageImpl theLiteralPackage = (LiteralPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(LiteralPackage.eNS_URI) instanceof LiteralPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(LiteralPackage.eNS_URI) : LiteralPackage.eINSTANCE);
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
        theDatatypePackage.createPackageContents();
        theSQLPackage.createPackageContents();
        theCommonPackage.createPackageContents();
        theLiteralPackage.createPackageContents();
        theFunctionPackage.createPackageContents();
        theExpressionPackage.createPackageContents();
        theSchemaPackage.createPackageContents();

        // Initialize created meta-data
        theDatatypePackage.initializePackageContents();
        theSQLPackage.initializePackageContents();
        theCommonPackage.initializePackageContents();
        theLiteralPackage.initializePackageContents();
        theFunctionPackage.initializePackageContents();
        theExpressionPackage.initializePackageContents();
        theSchemaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDatatypePackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DatatypePackage.eNS_URI, theDatatypePackage);
        return theDatatypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataType() {
        return dataTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPredefinedType() {
        return predefinedTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCharacterStringType() {
        return characterStringTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCharacterStringType_Kind() {
        return (EAttribute) characterStringTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCharacterStringType_Length() {
        return (EAttribute) characterStringTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacterStringType_CharacterSetName() {
        return (EReference) characterStringTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacterStringType_CollationName() {
        return (EReference) characterStringTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNationalCharacterStringType() {
        return nationalCharacterStringTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNationalCharacterStringType_Kind() {
        return (EAttribute) nationalCharacterStringTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNationalCharacterStringType_Length() {
        return (EAttribute) nationalCharacterStringTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNationalCharacterStringType_CollationName() {
        return (EReference) nationalCharacterStringTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBinaryLargeObjectStringType() {
        return binaryLargeObjectStringTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBinaryLargeObjectStringType_Kind() {
        return (EAttribute) binaryLargeObjectStringTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBinaryLargeObjectStringType_Length() {
        return (EReference) binaryLargeObjectStringTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumericType() {
        return numericTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBooleanType() {
        return booleanTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatetimeType() {
        return datetimeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExactNumericType() {
        return exactNumericTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExactNumericType_Kind() {
        return (EAttribute) exactNumericTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExactNumericType_Precision() {
        return (EAttribute) exactNumericTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExactNumericType_Scale() {
        return (EAttribute) exactNumericTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getApproximateNumericType() {
        return approximateNumericTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getApproximateNumericType_Kind() {
        return (EAttribute) approximateNumericTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getApproximateNumericType_Precision() {
        return (EAttribute) approximateNumericTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLargeObjectLength() {
        return largeObjectLengthEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLargeObjectLength_Value() {
        return (EAttribute) largeObjectLengthEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLargeObjectLength_Multiplier() {
        return (EAttribute) largeObjectLengthEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLargeObjectLength_Units() {
        return (EAttribute) largeObjectLengthEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDateType() {
        return dateTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeType() {
        return timeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeType_Precision() {
        return (EAttribute) timeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeType_WithTimeZone() {
        return (EAttribute) timeTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimestampType() {
        return timestampTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimestampType_Precision() {
        return (EAttribute) timestampTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimestampType_WithTimeZone() {
        return (EAttribute) timestampTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCharacterStringTypeKind() {
        return characterStringTypeKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNationalCharacterStringTypeKind() {
        return nationalCharacterStringTypeKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getBinaryLargeObjectStringTypeKind() {
        return binaryLargeObjectStringTypeKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getExactNumericTypeKind() {
        return exactNumericTypeKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getApproximateNumericTypeKind() {
        return approximateNumericTypeKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMultiplier() {
        return multiplierEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCharLengthUnits() {
        return charLengthUnitsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeFactory getDatatypeFactory() {
        return (DatatypeFactory) getEFactoryInstance();
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
        dataTypeEClass = createEClass(DATA_TYPE);

        predefinedTypeEClass = createEClass(PREDEFINED_TYPE);

        characterStringTypeEClass = createEClass(CHARACTER_STRING_TYPE);
        createEAttribute(characterStringTypeEClass, CHARACTER_STRING_TYPE__KIND);
        createEAttribute(characterStringTypeEClass, CHARACTER_STRING_TYPE__LENGTH);
        createEReference(characterStringTypeEClass, CHARACTER_STRING_TYPE__CHARACTER_SET_NAME);
        createEReference(characterStringTypeEClass, CHARACTER_STRING_TYPE__COLLATION_NAME);

        nationalCharacterStringTypeEClass = createEClass(NATIONAL_CHARACTER_STRING_TYPE);
        createEAttribute(nationalCharacterStringTypeEClass, NATIONAL_CHARACTER_STRING_TYPE__KIND);
        createEAttribute(nationalCharacterStringTypeEClass, NATIONAL_CHARACTER_STRING_TYPE__LENGTH);
        createEReference(nationalCharacterStringTypeEClass, NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME);

        binaryLargeObjectStringTypeEClass = createEClass(BINARY_LARGE_OBJECT_STRING_TYPE);
        createEAttribute(binaryLargeObjectStringTypeEClass, BINARY_LARGE_OBJECT_STRING_TYPE__KIND);
        createEReference(binaryLargeObjectStringTypeEClass, BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH);

        numericTypeEClass = createEClass(NUMERIC_TYPE);

        booleanTypeEClass = createEClass(BOOLEAN_TYPE);

        datetimeTypeEClass = createEClass(DATETIME_TYPE);

        exactNumericTypeEClass = createEClass(EXACT_NUMERIC_TYPE);
        createEAttribute(exactNumericTypeEClass, EXACT_NUMERIC_TYPE__KIND);
        createEAttribute(exactNumericTypeEClass, EXACT_NUMERIC_TYPE__PRECISION);
        createEAttribute(exactNumericTypeEClass, EXACT_NUMERIC_TYPE__SCALE);

        approximateNumericTypeEClass = createEClass(APPROXIMATE_NUMERIC_TYPE);
        createEAttribute(approximateNumericTypeEClass, APPROXIMATE_NUMERIC_TYPE__KIND);
        createEAttribute(approximateNumericTypeEClass, APPROXIMATE_NUMERIC_TYPE__PRECISION);

        largeObjectLengthEClass = createEClass(LARGE_OBJECT_LENGTH);
        createEAttribute(largeObjectLengthEClass, LARGE_OBJECT_LENGTH__VALUE);
        createEAttribute(largeObjectLengthEClass, LARGE_OBJECT_LENGTH__MULTIPLIER);
        createEAttribute(largeObjectLengthEClass, LARGE_OBJECT_LENGTH__UNITS);

        dateTypeEClass = createEClass(DATE_TYPE);

        timeTypeEClass = createEClass(TIME_TYPE);
        createEAttribute(timeTypeEClass, TIME_TYPE__PRECISION);
        createEAttribute(timeTypeEClass, TIME_TYPE__WITH_TIME_ZONE);

        timestampTypeEClass = createEClass(TIMESTAMP_TYPE);
        createEAttribute(timestampTypeEClass, TIMESTAMP_TYPE__PRECISION);
        createEAttribute(timestampTypeEClass, TIMESTAMP_TYPE__WITH_TIME_ZONE);

        // Create enums
        characterStringTypeKindEEnum = createEEnum(CHARACTER_STRING_TYPE_KIND);
        nationalCharacterStringTypeKindEEnum = createEEnum(NATIONAL_CHARACTER_STRING_TYPE_KIND);
        binaryLargeObjectStringTypeKindEEnum = createEEnum(BINARY_LARGE_OBJECT_STRING_TYPE_KIND);
        exactNumericTypeKindEEnum = createEEnum(EXACT_NUMERIC_TYPE_KIND);
        approximateNumericTypeKindEEnum = createEEnum(APPROXIMATE_NUMERIC_TYPE_KIND);
        multiplierEEnum = createEEnum(MULTIPLIER);
        charLengthUnitsEEnum = createEEnum(CHAR_LENGTH_UNITS);
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
        predefinedTypeEClass.getESuperTypes().add(this.getDataType());
        characterStringTypeEClass.getESuperTypes().add(this.getPredefinedType());
        nationalCharacterStringTypeEClass.getESuperTypes().add(this.getPredefinedType());
        binaryLargeObjectStringTypeEClass.getESuperTypes().add(this.getPredefinedType());
        numericTypeEClass.getESuperTypes().add(this.getPredefinedType());
        booleanTypeEClass.getESuperTypes().add(this.getPredefinedType());
        datetimeTypeEClass.getESuperTypes().add(this.getPredefinedType());
        exactNumericTypeEClass.getESuperTypes().add(this.getNumericType());
        approximateNumericTypeEClass.getESuperTypes().add(this.getNumericType());
        dateTypeEClass.getESuperTypes().add(this.getDatetimeType());
        timeTypeEClass.getESuperTypes().add(this.getDatetimeType());
        timestampTypeEClass.getESuperTypes().add(this.getDatetimeType());

        // Initialize classes, features, and operations; add parameters
        initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(predefinedTypeEClass, PredefinedType.class, "PredefinedType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(characterStringTypeEClass, CharacterStringType.class, "CharacterStringType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCharacterStringType_Kind(), this.getCharacterStringTypeKind(), "kind", null, 1, 1,
                CharacterStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCharacterStringType_Length(), theCommonPackage.getUnsignedInteger(), "length", null, 0, 1,
                CharacterStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterStringType_CharacterSetName(), theCommonPackage.getSchemaQualifiedName(), null,
                "characterSetName", null, 0, 1, CharacterStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterStringType_CollationName(), theCommonPackage.getSchemaQualifiedName(), null,
                "collationName", null, 0, 1, CharacterStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nationalCharacterStringTypeEClass, NationalCharacterStringType.class, "NationalCharacterStringType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNationalCharacterStringType_Kind(), this.getNationalCharacterStringTypeKind(), "kind", null,
                1, 1, NationalCharacterStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNationalCharacterStringType_Length(), theCommonPackage.getUnsignedInteger(), "length", null,
                0, 1, NationalCharacterStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNationalCharacterStringType_CollationName(), theCommonPackage.getSchemaQualifiedName(), null,
                "collationName", null, 0, 1, NationalCharacterStringType.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(binaryLargeObjectStringTypeEClass, BinaryLargeObjectStringType.class, "BinaryLargeObjectStringType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBinaryLargeObjectStringType_Kind(), this.getBinaryLargeObjectStringTypeKind(), "kind", null,
                1, 1, BinaryLargeObjectStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBinaryLargeObjectStringType_Length(), this.getLargeObjectLength(), null, "length", null, 0, 1,
                BinaryLargeObjectStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(numericTypeEClass, NumericType.class, "NumericType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(datetimeTypeEClass, DatetimeType.class, "DatetimeType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(exactNumericTypeEClass, ExactNumericType.class, "ExactNumericType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExactNumericType_Kind(), this.getExactNumericTypeKind(), "kind", null, 1, 1,
                ExactNumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExactNumericType_Precision(), theCommonPackage.getUnsignedInteger(), "precision", null, 0, 1,
                ExactNumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExactNumericType_Scale(), theCommonPackage.getUnsignedInteger(), "scale", null, 0, 1,
                ExactNumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(approximateNumericTypeEClass, ApproximateNumericType.class, "ApproximateNumericType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getApproximateNumericType_Kind(), this.getApproximateNumericTypeKind(), "kind", null, 1, 1,
                ApproximateNumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getApproximateNumericType_Precision(), theCommonPackage.getUnsignedInteger(), "precision", null,
                0, 1, ApproximateNumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(largeObjectLengthEClass, LargeObjectLength.class, "LargeObjectLength", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLargeObjectLength_Value(), theCommonPackage.getUnsignedInteger(), "value", null, 1, 1,
                LargeObjectLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLargeObjectLength_Multiplier(), this.getMultiplier(), "multiplier", null, 0, 1,
                LargeObjectLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLargeObjectLength_Units(), this.getCharLengthUnits(), "units", null, 0, 1,
                LargeObjectLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(timeTypeEClass, TimeType.class, "TimeType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTimeType_Precision(), theCommonPackage.getUnsignedInteger(), "precision", "0", 0, 1,
                TimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimeType_WithTimeZone(), ecorePackage.getEBooleanObject(), "withTimeZone", null, 0, 1,
                TimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(timestampTypeEClass, TimestampType.class, "TimestampType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTimestampType_Precision(), theCommonPackage.getUnsignedInteger(), "precision", "6", 0, 1,
                TimestampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimestampType_WithTimeZone(), ecorePackage.getEBooleanObject(), "withTimeZone", null, 0, 1,
                TimestampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(characterStringTypeKindEEnum, CharacterStringTypeKind.class, "CharacterStringTypeKind");
        addEEnumLiteral(characterStringTypeKindEEnum, CharacterStringTypeKind.CHARACTER);
        addEEnumLiteral(characterStringTypeKindEEnum, CharacterStringTypeKind.CHAR);
        addEEnumLiteral(characterStringTypeKindEEnum, CharacterStringTypeKind.CHARACTER_VARYING);
        addEEnumLiteral(characterStringTypeKindEEnum, CharacterStringTypeKind.CHAR_VARYING);
        addEEnumLiteral(characterStringTypeKindEEnum, CharacterStringTypeKind.VARCHAR);

        initEEnum(nationalCharacterStringTypeKindEEnum, NationalCharacterStringTypeKind.class,
                "NationalCharacterStringTypeKind");
        addEEnumLiteral(nationalCharacterStringTypeKindEEnum, NationalCharacterStringTypeKind.NATIONAL_CHARACTER);
        addEEnumLiteral(nationalCharacterStringTypeKindEEnum, NationalCharacterStringTypeKind.NATIONAL_CHAR);
        addEEnumLiteral(nationalCharacterStringTypeKindEEnum, NationalCharacterStringTypeKind.NCHAR);
        addEEnumLiteral(nationalCharacterStringTypeKindEEnum,
                NationalCharacterStringTypeKind.NATIONAL_CHARACTER_VARYING);
        addEEnumLiteral(nationalCharacterStringTypeKindEEnum, NationalCharacterStringTypeKind.NATIONAL_CHAR_VARYING);
        addEEnumLiteral(nationalCharacterStringTypeKindEEnum, NationalCharacterStringTypeKind.NCHAR_VARYING);

        initEEnum(binaryLargeObjectStringTypeKindEEnum, BinaryLargeObjectStringTypeKind.class,
                "BinaryLargeObjectStringTypeKind");
        addEEnumLiteral(binaryLargeObjectStringTypeKindEEnum, BinaryLargeObjectStringTypeKind.BINARY_LARGE_OBJECT);
        addEEnumLiteral(binaryLargeObjectStringTypeKindEEnum, BinaryLargeObjectStringTypeKind.BLOB);

        initEEnum(exactNumericTypeKindEEnum, ExactNumericTypeKind.class, "ExactNumericTypeKind");
        addEEnumLiteral(exactNumericTypeKindEEnum, ExactNumericTypeKind.NUMERIC);
        addEEnumLiteral(exactNumericTypeKindEEnum, ExactNumericTypeKind.DECIMAL);
        addEEnumLiteral(exactNumericTypeKindEEnum, ExactNumericTypeKind.DEC);
        addEEnumLiteral(exactNumericTypeKindEEnum, ExactNumericTypeKind.SMALLINT);
        addEEnumLiteral(exactNumericTypeKindEEnum, ExactNumericTypeKind.INTEGER);
        addEEnumLiteral(exactNumericTypeKindEEnum, ExactNumericTypeKind.INT);
        addEEnumLiteral(exactNumericTypeKindEEnum, ExactNumericTypeKind.BIGINT);

        initEEnum(approximateNumericTypeKindEEnum, ApproximateNumericTypeKind.class, "ApproximateNumericTypeKind");
        addEEnumLiteral(approximateNumericTypeKindEEnum, ApproximateNumericTypeKind.FLOAT);
        addEEnumLiteral(approximateNumericTypeKindEEnum, ApproximateNumericTypeKind.REAL);
        addEEnumLiteral(approximateNumericTypeKindEEnum, ApproximateNumericTypeKind.DOUBLE_PRECISION);

        initEEnum(multiplierEEnum, Multiplier.class, "Multiplier");
        addEEnumLiteral(multiplierEEnum, Multiplier.K);
        addEEnumLiteral(multiplierEEnum, Multiplier.M);
        addEEnumLiteral(multiplierEEnum, Multiplier.G);

        initEEnum(charLengthUnitsEEnum, CharLengthUnits.class, "CharLengthUnits");
        addEEnumLiteral(charLengthUnitsEEnum, CharLengthUnits.CHARACTERS);
        addEEnumLiteral(charLengthUnitsEEnum, CharLengthUnits.CODE_UNITS);
        addEEnumLiteral(charLengthUnitsEEnum, CharLengthUnits.OCTETS);
    }

} //DatatypePackageImpl
