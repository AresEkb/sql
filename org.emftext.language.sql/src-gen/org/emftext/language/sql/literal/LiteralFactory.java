/**
 */
package org.emftext.language.sql.literal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.literal.LiteralPackage
 * @generated
 */
public interface LiteralFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    LiteralFactory eINSTANCE = org.emftext.language.sql.literal.impl.LiteralFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Character String Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Character String Literal</em>'.
     * @generated
     */
    CharacterStringLiteral createCharacterStringLiteral();

    /**
     * Returns a new object of class '<em>National Character String Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>National Character String Literal</em>'.
     * @generated
     */
    NationalCharacterStringLiteral createNationalCharacterStringLiteral();

    /**
     * Returns a new object of class '<em>Boolean Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean Literal</em>'.
     * @generated
     */
    BooleanLiteral createBooleanLiteral();

    /**
     * Returns a new object of class '<em>Date Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Date Literal</em>'.
     * @generated
     */
    DateLiteral createDateLiteral();

    /**
     * Returns a new object of class '<em>Time Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Literal</em>'.
     * @generated
     */
    TimeLiteral createTimeLiteral();

    /**
     * Returns a new object of class '<em>Timestamp Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Timestamp Literal</em>'.
     * @generated
     */
    TimestampLiteral createTimestampLiteral();

    /**
     * Returns a new object of class '<em>Exact Numeric Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exact Numeric Literal</em>'.
     * @generated
     */
    ExactNumericLiteral createExactNumericLiteral();

    /**
     * Returns a new object of class '<em>Approximate Numeric Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Approximate Numeric Literal</em>'.
     * @generated
     */
    ApproximateNumericLiteral createApproximateNumericLiteral();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    LiteralPackage getLiteralPackage();

} //LiteralFactory
