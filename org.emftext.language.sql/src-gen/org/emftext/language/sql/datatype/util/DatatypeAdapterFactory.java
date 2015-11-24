/**
 */
package org.emftext.language.sql.datatype.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.datatype.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.datatype.DatatypePackage
 * @generated
 */
public class DatatypeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DatatypePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DatatypePackage.eINSTANCE;
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
    protected DatatypeSwitch<Adapter> modelSwitch = new DatatypeSwitch<Adapter>() {
        @Override
        public Adapter caseDataType(DataType object) {
            return createDataTypeAdapter();
        }

        @Override
        public Adapter casePredefinedType(PredefinedType object) {
            return createPredefinedTypeAdapter();
        }

        @Override
        public Adapter caseCharacterStringType(CharacterStringType object) {
            return createCharacterStringTypeAdapter();
        }

        @Override
        public Adapter caseNationalCharacterStringType(NationalCharacterStringType object) {
            return createNationalCharacterStringTypeAdapter();
        }

        @Override
        public Adapter caseBinaryLargeObjectStringType(BinaryLargeObjectStringType object) {
            return createBinaryLargeObjectStringTypeAdapter();
        }

        @Override
        public Adapter caseNumericType(NumericType object) {
            return createNumericTypeAdapter();
        }

        @Override
        public Adapter caseBooleanType(BooleanType object) {
            return createBooleanTypeAdapter();
        }

        @Override
        public Adapter caseDatetimeType(DatetimeType object) {
            return createDatetimeTypeAdapter();
        }

        @Override
        public Adapter caseExactNumericType(ExactNumericType object) {
            return createExactNumericTypeAdapter();
        }

        @Override
        public Adapter caseApproximateNumericType(ApproximateNumericType object) {
            return createApproximateNumericTypeAdapter();
        }

        @Override
        public Adapter caseLargeObjectLength(LargeObjectLength object) {
            return createLargeObjectLengthAdapter();
        }

        @Override
        public Adapter caseDateType(DateType object) {
            return createDateTypeAdapter();
        }

        @Override
        public Adapter caseTimeType(TimeType object) {
            return createTimeTypeAdapter();
        }

        @Override
        public Adapter caseTimestampType(TimestampType object) {
            return createTimestampTypeAdapter();
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
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.DataType
     * @generated
     */
    public Adapter createDataTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.PredefinedType <em>Predefined Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.PredefinedType
     * @generated
     */
    public Adapter createPredefinedTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.CharacterStringType <em>Character String Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.CharacterStringType
     * @generated
     */
    public Adapter createCharacterStringTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.NationalCharacterStringType <em>National Character String Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.NationalCharacterStringType
     * @generated
     */
    public Adapter createNationalCharacterStringTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringType <em>Binary Large Object String Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.BinaryLargeObjectStringType
     * @generated
     */
    public Adapter createBinaryLargeObjectStringTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.NumericType <em>Numeric Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.NumericType
     * @generated
     */
    public Adapter createNumericTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.BooleanType <em>Boolean Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.BooleanType
     * @generated
     */
    public Adapter createBooleanTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.DatetimeType <em>Datetime Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.DatetimeType
     * @generated
     */
    public Adapter createDatetimeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.ExactNumericType <em>Exact Numeric Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.ExactNumericType
     * @generated
     */
    public Adapter createExactNumericTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.ApproximateNumericType <em>Approximate Numeric Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.ApproximateNumericType
     * @generated
     */
    public Adapter createApproximateNumericTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.LargeObjectLength <em>Large Object Length</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.LargeObjectLength
     * @generated
     */
    public Adapter createLargeObjectLengthAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.DateType <em>Date Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.DateType
     * @generated
     */
    public Adapter createDateTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.TimeType <em>Time Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.TimeType
     * @generated
     */
    public Adapter createTimeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.datatype.TimestampType <em>Timestamp Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.datatype.TimestampType
     * @generated
     */
    public Adapter createTimestampTypeAdapter() {
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

} //DatatypeAdapterFactory
