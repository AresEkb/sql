/**
 */
package org.emftext.language.sql.literal.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.sql.literal.*;

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
 * @see org.emftext.language.sql.literal.LiteralPackage
 * @generated
 */
public class LiteralSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static LiteralPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralSwitch() {
        if (modelPackage == null) {
            modelPackage = LiteralPackage.eINSTANCE;
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
        case LiteralPackage.LITERAL: {
            Literal literal = (Literal) theEObject;
            T result = caseLiteral(literal);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.GENERAL_LITERAL: {
            GeneralLiteral generalLiteral = (GeneralLiteral) theEObject;
            T result = caseGeneralLiteral(generalLiteral);
            if (result == null)
                result = caseLiteral(generalLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.CHARACTER_STRING_LITERAL: {
            CharacterStringLiteral characterStringLiteral = (CharacterStringLiteral) theEObject;
            T result = caseCharacterStringLiteral(characterStringLiteral);
            if (result == null)
                result = caseNationalCharacterStringLiteral(characterStringLiteral);
            if (result == null)
                result = caseGeneralLiteral(characterStringLiteral);
            if (result == null)
                result = caseLiteral(characterStringLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL: {
            NationalCharacterStringLiteral nationalCharacterStringLiteral = (NationalCharacterStringLiteral) theEObject;
            T result = caseNationalCharacterStringLiteral(nationalCharacterStringLiteral);
            if (result == null)
                result = caseGeneralLiteral(nationalCharacterStringLiteral);
            if (result == null)
                result = caseLiteral(nationalCharacterStringLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.DATETIME_LITERAL: {
            DatetimeLiteral datetimeLiteral = (DatetimeLiteral) theEObject;
            T result = caseDatetimeLiteral(datetimeLiteral);
            if (result == null)
                result = caseGeneralLiteral(datetimeLiteral);
            if (result == null)
                result = caseLiteral(datetimeLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.BOOLEAN_LITERAL: {
            BooleanLiteral booleanLiteral = (BooleanLiteral) theEObject;
            T result = caseBooleanLiteral(booleanLiteral);
            if (result == null)
                result = caseGeneralLiteral(booleanLiteral);
            if (result == null)
                result = caseLiteral(booleanLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.DATE_LITERAL: {
            DateLiteral dateLiteral = (DateLiteral) theEObject;
            T result = caseDateLiteral(dateLiteral);
            if (result == null)
                result = caseDatetimeLiteral(dateLiteral);
            if (result == null)
                result = caseGeneralLiteral(dateLiteral);
            if (result == null)
                result = caseLiteral(dateLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.TIME_LITERAL: {
            TimeLiteral timeLiteral = (TimeLiteral) theEObject;
            T result = caseTimeLiteral(timeLiteral);
            if (result == null)
                result = caseDatetimeLiteral(timeLiteral);
            if (result == null)
                result = caseGeneralLiteral(timeLiteral);
            if (result == null)
                result = caseLiteral(timeLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.TIMESTAMP_LITERAL: {
            TimestampLiteral timestampLiteral = (TimestampLiteral) theEObject;
            T result = caseTimestampLiteral(timestampLiteral);
            if (result == null)
                result = caseDatetimeLiteral(timestampLiteral);
            if (result == null)
                result = caseGeneralLiteral(timestampLiteral);
            if (result == null)
                result = caseLiteral(timestampLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.EXACT_NUMERIC_LITERAL: {
            ExactNumericLiteral exactNumericLiteral = (ExactNumericLiteral) theEObject;
            T result = caseExactNumericLiteral(exactNumericLiteral);
            if (result == null)
                result = caseNumericLiteral(exactNumericLiteral);
            if (result == null)
                result = caseLiteral(exactNumericLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.APPROXIMATE_NUMERIC_LITERAL: {
            ApproximateNumericLiteral approximateNumericLiteral = (ApproximateNumericLiteral) theEObject;
            T result = caseApproximateNumericLiteral(approximateNumericLiteral);
            if (result == null)
                result = caseNumericLiteral(approximateNumericLiteral);
            if (result == null)
                result = caseLiteral(approximateNumericLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case LiteralPackage.NUMERIC_LITERAL: {
            NumericLiteral numericLiteral = (NumericLiteral) theEObject;
            T result = caseNumericLiteral(numericLiteral);
            if (result == null)
                result = caseLiteral(numericLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiteral(Literal object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>General Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>General Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeneralLiteral(GeneralLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Character String Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character String Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharacterStringLiteral(CharacterStringLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>National Character String Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>National Character String Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNationalCharacterStringLiteral(NationalCharacterStringLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Datetime Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Datetime Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDatetimeLiteral(DatetimeLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanLiteral(BooleanLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateLiteral(DateLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeLiteral(TimeLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timestamp Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timestamp Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimestampLiteral(TimestampLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exact Numeric Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exact Numeric Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExactNumericLiteral(ExactNumericLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Approximate Numeric Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Approximate Numeric Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApproximateNumericLiteral(ApproximateNumericLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericLiteral(NumericLiteral object) {
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

} //LiteralSwitch
