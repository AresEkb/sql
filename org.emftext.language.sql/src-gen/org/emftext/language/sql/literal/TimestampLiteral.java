/**
 */
package org.emftext.language.sql.literal;

import java.time.ZonedDateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.literal.TimestampLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.literal.LiteralPackage#getTimestampLiteral()
 * @model
 * @generated
 */
public interface TimestampLiteral extends DatetimeLiteral {

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(ZonedDateTime)
     * @see org.emftext.language.sql.literal.LiteralPackage#getTimestampLiteral_Value()
     * @model dataType="org.emftext.language.sql.common.TimestampType" required="true"
     * @generated
     */
    ZonedDateTime getValue();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.literal.TimestampLiteral#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(ZonedDateTime value);
} // TimestampLiteral
