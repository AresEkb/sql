/**
 */
package org.emftext.language.sql.literal;

import java.time.LocalTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.literal.TimeLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.literal.LiteralPackage#getTimeLiteral()
 * @model
 * @generated
 */
public interface TimeLiteral extends DatetimeLiteral {

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(LocalTime)
     * @see org.emftext.language.sql.literal.LiteralPackage#getTimeLiteral_Value()
     * @model dataType="org.emftext.language.sql.common.TimeType" required="true"
     * @generated
     */
    LocalTime getValue();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.literal.TimeLiteral#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(LocalTime value);
} // TimeLiteral
