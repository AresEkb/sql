/**
 */
package org.emftext.language.sql.literal.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.literal.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.literal.LiteralPackage
 * @generated
 */
public class LiteralAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static LiteralPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = LiteralPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LiteralSwitch<Adapter> modelSwitch = new LiteralSwitch<Adapter>() {
        @Override
        public Adapter caseLiteral(Literal object) {
            return createLiteralAdapter();
        }

        @Override
        public Adapter caseSignedNumericLiteral(SignedNumericLiteral object) {
            return createSignedNumericLiteralAdapter();
        }

        @Override
        public Adapter caseGeneralLiteral(GeneralLiteral object) {
            return createGeneralLiteralAdapter();
        }

        @Override
        public Adapter caseCharacterStringLiteral(CharacterStringLiteral object) {
            return createCharacterStringLiteralAdapter();
        }

        @Override
        public Adapter caseNationalCharacterStringLiteral(NationalCharacterStringLiteral object) {
            return createNationalCharacterStringLiteralAdapter();
        }

        @Override
        public Adapter caseUnicodeCharacterStringLiteral(UnicodeCharacterStringLiteral object) {
            return createUnicodeCharacterStringLiteralAdapter();
        }

        @Override
        public Adapter caseBinaryStringLiteral(BinaryStringLiteral object) {
            return createBinaryStringLiteralAdapter();
        }

        @Override
        public Adapter caseDatetimeLiteral(DatetimeLiteral object) {
            return createDatetimeLiteralAdapter();
        }

        @Override
        public Adapter caseIntervalLiteral(IntervalLiteral object) {
            return createIntervalLiteralAdapter();
        }

        @Override
        public Adapter caseBooleanLiteral(BooleanLiteral object) {
            return createBooleanLiteralAdapter();
        }

        @Override
        public Adapter caseUnsignedLiteral(UnsignedLiteral object) {
            return createUnsignedLiteralAdapter();
        }

        @Override
        public Adapter caseUnsignedNumericLiteral(UnsignedNumericLiteral object) {
            return createUnsignedNumericLiteralAdapter();
        }

        @Override
        public Adapter caseDateLiteral(DateLiteral object) {
            return createDateLiteralAdapter();
        }

        @Override
        public Adapter caseTimeLiteral(TimeLiteral object) {
            return createTimeLiteralAdapter();
        }

        @Override
        public Adapter caseTimestampLiteral(TimestampLiteral object) {
            return createTimestampLiteralAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.Literal <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.Literal
     * @generated
     */
    public Adapter createLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.SignedNumericLiteral <em>Signed Numeric Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.SignedNumericLiteral
     * @generated
     */
    public Adapter createSignedNumericLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.GeneralLiteral <em>General Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.GeneralLiteral
     * @generated
     */
    public Adapter createGeneralLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.CharacterStringLiteral <em>Character String Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.CharacterStringLiteral
     * @generated
     */
    public Adapter createCharacterStringLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.NationalCharacterStringLiteral <em>National Character String Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.NationalCharacterStringLiteral
     * @generated
     */
    public Adapter createNationalCharacterStringLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.UnicodeCharacterStringLiteral <em>Unicode Character String Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.UnicodeCharacterStringLiteral
     * @generated
     */
    public Adapter createUnicodeCharacterStringLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.BinaryStringLiteral <em>Binary String Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.BinaryStringLiteral
     * @generated
     */
    public Adapter createBinaryStringLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.DatetimeLiteral <em>Datetime Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.DatetimeLiteral
     * @generated
     */
    public Adapter createDatetimeLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.IntervalLiteral <em>Interval Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.IntervalLiteral
     * @generated
     */
    public Adapter createIntervalLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.BooleanLiteral <em>Boolean Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.BooleanLiteral
     * @generated
     */
    public Adapter createBooleanLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.UnsignedLiteral <em>Unsigned Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.UnsignedLiteral
     * @generated
     */
    public Adapter createUnsignedLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.UnsignedNumericLiteral <em>Unsigned Numeric Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.UnsignedNumericLiteral
     * @generated
     */
    public Adapter createUnsignedNumericLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.DateLiteral <em>Date Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.DateLiteral
     * @generated
     */
    public Adapter createDateLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.TimeLiteral <em>Time Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.TimeLiteral
     * @generated
     */
    public Adapter createTimeLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.literal.TimestampLiteral <em>Timestamp Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.literal.TimestampLiteral
     * @generated
     */
    public Adapter createTimestampLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //LiteralAdapterFactory
