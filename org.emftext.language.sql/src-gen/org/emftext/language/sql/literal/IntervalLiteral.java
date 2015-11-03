/**
 */
package org.emftext.language.sql.literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.literal.IntervalLiteral#isIsPositive <em>Is Positive</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.literal.LiteralPackage#getIntervalLiteral()
 * @model
 * @generated
 */
public interface IntervalLiteral extends GeneralLiteral {
    /**
     * Returns the value of the '<em><b>Is Positive</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Positive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Positive</em>' attribute.
     * @see #setIsPositive(boolean)
     * @see org.emftext.language.sql.literal.LiteralPackage#getIntervalLiteral_IsPositive()
     * @model default="true" required="true"
     * @generated
     */
    boolean isIsPositive();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.literal.IntervalLiteral#isIsPositive <em>Is Positive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Positive</em>' attribute.
     * @see #isIsPositive()
     * @generated
     */
    void setIsPositive(boolean value);

} // IntervalLiteral
