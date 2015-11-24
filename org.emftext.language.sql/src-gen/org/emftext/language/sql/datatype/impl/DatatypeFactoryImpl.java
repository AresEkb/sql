/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.sql.datatype.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypeFactoryImpl extends EFactoryImpl implements DatatypeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DatatypeFactory init() {
        try {
            DatatypeFactory theDatatypeFactory = (DatatypeFactory) EPackage.Registry.INSTANCE
                    .getEFactory(DatatypePackage.eNS_URI);
            if (theDatatypeFactory != null) {
                return theDatatypeFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DatatypeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case DatatypePackage.CHARACTER_STRING_TYPE:
            return createCharacterStringType();
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE:
            return createNationalCharacterStringType();
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE:
            return createBinaryLargeObjectStringType();
        case DatatypePackage.BOOLEAN_TYPE:
            return createBooleanType();
        case DatatypePackage.EXACT_NUMERIC_TYPE:
            return createExactNumericType();
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE:
            return createApproximateNumericType();
        case DatatypePackage.LARGE_OBJECT_LENGTH:
            return createLargeObjectLength();
        case DatatypePackage.DATE_TYPE:
            return createDateType();
        case DatatypePackage.TIME_TYPE:
            return createTimeType();
        case DatatypePackage.TIMESTAMP_TYPE:
            return createTimestampType();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case DatatypePackage.CHARACTER_STRING_TYPE_KIND:
            return createCharacterStringTypeKindFromString(eDataType, initialValue);
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE_KIND:
            return createNationalCharacterStringTypeKindFromString(eDataType, initialValue);
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE_KIND:
            return createBinaryLargeObjectStringTypeKindFromString(eDataType, initialValue);
        case DatatypePackage.EXACT_NUMERIC_TYPE_KIND:
            return createExactNumericTypeKindFromString(eDataType, initialValue);
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE_KIND:
            return createApproximateNumericTypeKindFromString(eDataType, initialValue);
        case DatatypePackage.DATETIME_TYPE_KIND:
            return createDatetimeTypeKindFromString(eDataType, initialValue);
        case DatatypePackage.MULTIPLIER:
            return createMultiplierFromString(eDataType, initialValue);
        case DatatypePackage.CHAR_LENGTH_UNITS:
            return createCharLengthUnitsFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case DatatypePackage.CHARACTER_STRING_TYPE_KIND:
            return convertCharacterStringTypeKindToString(eDataType, instanceValue);
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE_KIND:
            return convertNationalCharacterStringTypeKindToString(eDataType, instanceValue);
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE_KIND:
            return convertBinaryLargeObjectStringTypeKindToString(eDataType, instanceValue);
        case DatatypePackage.EXACT_NUMERIC_TYPE_KIND:
            return convertExactNumericTypeKindToString(eDataType, instanceValue);
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE_KIND:
            return convertApproximateNumericTypeKindToString(eDataType, instanceValue);
        case DatatypePackage.DATETIME_TYPE_KIND:
            return convertDatetimeTypeKindToString(eDataType, instanceValue);
        case DatatypePackage.MULTIPLIER:
            return convertMultiplierToString(eDataType, instanceValue);
        case DatatypePackage.CHAR_LENGTH_UNITS:
            return convertCharLengthUnitsToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterStringType createCharacterStringType() {
        CharacterStringTypeImpl characterStringType = new CharacterStringTypeImpl();
        return characterStringType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NationalCharacterStringType createNationalCharacterStringType() {
        NationalCharacterStringTypeImpl nationalCharacterStringType = new NationalCharacterStringTypeImpl();
        return nationalCharacterStringType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryLargeObjectStringType createBinaryLargeObjectStringType() {
        BinaryLargeObjectStringTypeImpl binaryLargeObjectStringType = new BinaryLargeObjectStringTypeImpl();
        return binaryLargeObjectStringType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BooleanType createBooleanType() {
        BooleanTypeImpl booleanType = new BooleanTypeImpl();
        return booleanType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExactNumericType createExactNumericType() {
        ExactNumericTypeImpl exactNumericType = new ExactNumericTypeImpl();
        return exactNumericType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApproximateNumericType createApproximateNumericType() {
        ApproximateNumericTypeImpl approximateNumericType = new ApproximateNumericTypeImpl();
        return approximateNumericType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LargeObjectLength createLargeObjectLength() {
        LargeObjectLengthImpl largeObjectLength = new LargeObjectLengthImpl();
        return largeObjectLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateType createDateType() {
        DateTypeImpl dateType = new DateTypeImpl();
        return dateType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeType createTimeType() {
        TimeTypeImpl timeType = new TimeTypeImpl();
        return timeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimestampType createTimestampType() {
        TimestampTypeImpl timestampType = new TimestampTypeImpl();
        return timestampType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterStringTypeKind createCharacterStringTypeKindFromString(EDataType eDataType, String initialValue) {
        CharacterStringTypeKind result = CharacterStringTypeKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCharacterStringTypeKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NationalCharacterStringTypeKind createNationalCharacterStringTypeKindFromString(EDataType eDataType,
            String initialValue) {
        NationalCharacterStringTypeKind result = NationalCharacterStringTypeKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNationalCharacterStringTypeKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryLargeObjectStringTypeKind createBinaryLargeObjectStringTypeKindFromString(EDataType eDataType,
            String initialValue) {
        BinaryLargeObjectStringTypeKind result = BinaryLargeObjectStringTypeKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBinaryLargeObjectStringTypeKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExactNumericTypeKind createExactNumericTypeKindFromString(EDataType eDataType, String initialValue) {
        ExactNumericTypeKind result = ExactNumericTypeKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExactNumericTypeKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApproximateNumericTypeKind createApproximateNumericTypeKindFromString(EDataType eDataType,
            String initialValue) {
        ApproximateNumericTypeKind result = ApproximateNumericTypeKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertApproximateNumericTypeKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatetimeTypeKind createDatetimeTypeKindFromString(EDataType eDataType, String initialValue) {
        DatetimeTypeKind result = DatetimeTypeKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDatetimeTypeKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Multiplier createMultiplierFromString(EDataType eDataType, String initialValue) {
        Multiplier result = Multiplier.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiplierToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharLengthUnits createCharLengthUnitsFromString(EDataType eDataType, String initialValue) {
        CharLengthUnits result = CharLengthUnits.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCharLengthUnitsToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypePackage getDatatypePackage() {
        return (DatatypePackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DatatypePackage getPackage() {
        return DatatypePackage.eINSTANCE;
    }

} //DatatypeFactoryImpl
