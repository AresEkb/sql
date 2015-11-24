/**
 */
package org.emftext.language.sql.datatype.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.sql.datatype.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.datatype.DatatypePackage
 * @generated
 */
public class DatatypeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DatatypePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeSwitch() {
        if (modelPackage == null) {
            modelPackage = DatatypePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case DatatypePackage.DATA_TYPE: {
            DataType dataType = (DataType) theEObject;
            T result = caseDataType(dataType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.PREDEFINED_TYPE: {
            PredefinedType predefinedType = (PredefinedType) theEObject;
            T result = casePredefinedType(predefinedType);
            if (result == null)
                result = caseDataType(predefinedType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.CHARACTER_STRING_TYPE: {
            CharacterStringType characterStringType = (CharacterStringType) theEObject;
            T result = caseCharacterStringType(characterStringType);
            if (result == null)
                result = casePredefinedType(characterStringType);
            if (result == null)
                result = caseDataType(characterStringType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE: {
            NationalCharacterStringType nationalCharacterStringType = (NationalCharacterStringType) theEObject;
            T result = caseNationalCharacterStringType(nationalCharacterStringType);
            if (result == null)
                result = casePredefinedType(nationalCharacterStringType);
            if (result == null)
                result = caseDataType(nationalCharacterStringType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE: {
            BinaryLargeObjectStringType binaryLargeObjectStringType = (BinaryLargeObjectStringType) theEObject;
            T result = caseBinaryLargeObjectStringType(binaryLargeObjectStringType);
            if (result == null)
                result = casePredefinedType(binaryLargeObjectStringType);
            if (result == null)
                result = caseDataType(binaryLargeObjectStringType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.NUMERIC_TYPE: {
            NumericType numericType = (NumericType) theEObject;
            T result = caseNumericType(numericType);
            if (result == null)
                result = casePredefinedType(numericType);
            if (result == null)
                result = caseDataType(numericType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.BOOLEAN_TYPE: {
            BooleanType booleanType = (BooleanType) theEObject;
            T result = caseBooleanType(booleanType);
            if (result == null)
                result = casePredefinedType(booleanType);
            if (result == null)
                result = caseDataType(booleanType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.DATETIME_TYPE: {
            DatetimeType datetimeType = (DatetimeType) theEObject;
            T result = caseDatetimeType(datetimeType);
            if (result == null)
                result = casePredefinedType(datetimeType);
            if (result == null)
                result = caseDataType(datetimeType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.EXACT_NUMERIC_TYPE: {
            ExactNumericType exactNumericType = (ExactNumericType) theEObject;
            T result = caseExactNumericType(exactNumericType);
            if (result == null)
                result = caseNumericType(exactNumericType);
            if (result == null)
                result = casePredefinedType(exactNumericType);
            if (result == null)
                result = caseDataType(exactNumericType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE: {
            ApproximateNumericType approximateNumericType = (ApproximateNumericType) theEObject;
            T result = caseApproximateNumericType(approximateNumericType);
            if (result == null)
                result = caseNumericType(approximateNumericType);
            if (result == null)
                result = casePredefinedType(approximateNumericType);
            if (result == null)
                result = caseDataType(approximateNumericType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.LARGE_OBJECT_LENGTH: {
            LargeObjectLength largeObjectLength = (LargeObjectLength) theEObject;
            T result = caseLargeObjectLength(largeObjectLength);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.DATE_TYPE: {
            DateType dateType = (DateType) theEObject;
            T result = caseDateType(dateType);
            if (result == null)
                result = caseDatetimeType(dateType);
            if (result == null)
                result = casePredefinedType(dateType);
            if (result == null)
                result = caseDataType(dateType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.TIME_TYPE: {
            TimeType timeType = (TimeType) theEObject;
            T result = caseTimeType(timeType);
            if (result == null)
                result = caseDatetimeType(timeType);
            if (result == null)
                result = casePredefinedType(timeType);
            if (result == null)
                result = caseDataType(timeType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DatatypePackage.TIMESTAMP_TYPE: {
            TimestampType timestampType = (TimestampType) theEObject;
            T result = caseTimestampType(timestampType);
            if (result == null)
                result = caseDatetimeType(timestampType);
            if (result == null)
                result = casePredefinedType(timestampType);
            if (result == null)
                result = caseDataType(timestampType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataType(DataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Predefined Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Predefined Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePredefinedType(PredefinedType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Character String Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character String Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharacterStringType(CharacterStringType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>National Character String Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>National Character String Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNationalCharacterStringType(NationalCharacterStringType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binary Large Object String Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binary Large Object String Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinaryLargeObjectStringType(BinaryLargeObjectStringType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericType(NumericType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanType(BooleanType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datetime Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datetime Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDatetimeType(DatetimeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exact Numeric Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exact Numeric Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExactNumericType(ExactNumericType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Approximate Numeric Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Approximate Numeric Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApproximateNumericType(ApproximateNumericType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Large Object Length</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Large Object Length</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLargeObjectLength(LargeObjectLength object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateType(DateType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeType(TimeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timestamp Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timestamp Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimestampType(TimestampType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //DatatypeSwitch
