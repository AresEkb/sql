/**
 */
package org.emftext.language.sql.literal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.sql.literal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralFactoryImpl extends EFactoryImpl implements LiteralFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static LiteralFactory init() {
        try {
            LiteralFactory theLiteralFactory = (LiteralFactory) EPackage.Registry.INSTANCE
                    .getEFactory(LiteralPackage.eNS_URI);
            if (theLiteralFactory != null) {
                return theLiteralFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new LiteralFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralFactoryImpl() {
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
        case LiteralPackage.SIGNED_NUMERIC_LITERAL:
            return createSignedNumericLiteral();
        case LiteralPackage.CHARACTER_STRING_LITERAL:
            return createCharacterStringLiteral();
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL:
            return createNationalCharacterStringLiteral();
        case LiteralPackage.UNICODE_CHARACTER_STRING_LITERAL:
            return createUnicodeCharacterStringLiteral();
        case LiteralPackage.BINARY_STRING_LITERAL:
            return createBinaryStringLiteral();
        case LiteralPackage.INTERVAL_LITERAL:
            return createIntervalLiteral();
        case LiteralPackage.BOOLEAN_LITERAL:
            return createBooleanLiteral();
        case LiteralPackage.UNSIGNED_NUMERIC_LITERAL:
            return createUnsignedNumericLiteral();
        case LiteralPackage.DATE_LITERAL:
            return createDateLiteral();
        case LiteralPackage.TIME_LITERAL:
            return createTimeLiteral();
        case LiteralPackage.TIMESTAMP_LITERAL:
            return createTimestampLiteral();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SignedNumericLiteral createSignedNumericLiteral() {
        SignedNumericLiteralImpl signedNumericLiteral = new SignedNumericLiteralImpl();
        return signedNumericLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterStringLiteral createCharacterStringLiteral() {
        CharacterStringLiteralImpl characterStringLiteral = new CharacterStringLiteralImpl();
        return characterStringLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NationalCharacterStringLiteral createNationalCharacterStringLiteral() {
        NationalCharacterStringLiteralImpl nationalCharacterStringLiteral = new NationalCharacterStringLiteralImpl();
        return nationalCharacterStringLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnicodeCharacterStringLiteral createUnicodeCharacterStringLiteral() {
        UnicodeCharacterStringLiteralImpl unicodeCharacterStringLiteral = new UnicodeCharacterStringLiteralImpl();
        return unicodeCharacterStringLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryStringLiteral createBinaryStringLiteral() {
        BinaryStringLiteralImpl binaryStringLiteral = new BinaryStringLiteralImpl();
        return binaryStringLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntervalLiteral createIntervalLiteral() {
        IntervalLiteralImpl intervalLiteral = new IntervalLiteralImpl();
        return intervalLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BooleanLiteral createBooleanLiteral() {
        BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
        return booleanLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnsignedNumericLiteral createUnsignedNumericLiteral() {
        UnsignedNumericLiteralImpl unsignedNumericLiteral = new UnsignedNumericLiteralImpl();
        return unsignedNumericLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateLiteral createDateLiteral() {
        DateLiteralImpl dateLiteral = new DateLiteralImpl();
        return dateLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeLiteral createTimeLiteral() {
        TimeLiteralImpl timeLiteral = new TimeLiteralImpl();
        return timeLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimestampLiteral createTimestampLiteral() {
        TimestampLiteralImpl timestampLiteral = new TimestampLiteralImpl();
        return timestampLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralPackage getLiteralPackage() {
        return (LiteralPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static LiteralPackage getPackage() {
        return LiteralPackage.eINSTANCE;
    }

} //LiteralFactoryImpl
