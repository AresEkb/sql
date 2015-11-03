/**
 */
package org.emftext.language.sql.datatype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.datatype.DatatypePackage
 * @generated
 */
public interface DatatypeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DatatypeFactory eINSTANCE = org.emftext.language.sql.datatype.impl.DatatypeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Character String Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Character String Type</em>'.
     * @generated
     */
    CharacterStringType createCharacterStringType();

    /**
     * Returns a new object of class '<em>National Character String Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>National Character String Type</em>'.
     * @generated
     */
    NationalCharacterStringType createNationalCharacterStringType();

    /**
     * Returns a new object of class '<em>Binary Large Object String Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Binary Large Object String Type</em>'.
     * @generated
     */
    BinaryLargeObjectStringType createBinaryLargeObjectStringType();

    /**
     * Returns a new object of class '<em>Boolean Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean Type</em>'.
     * @generated
     */
    BooleanType createBooleanType();

    /**
     * Returns a new object of class '<em>Datetime Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Datetime Type</em>'.
     * @generated
     */
    DatetimeType createDatetimeType();

    /**
     * Returns a new object of class '<em>Exact Numeric Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exact Numeric Type</em>'.
     * @generated
     */
    ExactNumericType createExactNumericType();

    /**
     * Returns a new object of class '<em>Approximate Numeric Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Approximate Numeric Type</em>'.
     * @generated
     */
    ApproximateNumericType createApproximateNumericType();

    /**
     * Returns a new object of class '<em>Large Object Length</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Large Object Length</em>'.
     * @generated
     */
    LargeObjectLength createLargeObjectLength();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DatatypePackage getDatatypePackage();

} //DatatypeFactory
