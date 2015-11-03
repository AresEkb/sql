/**
 */
package org.emftext.language.sql.datatype;

import org.emftext.language.sql.UnsignedInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approximate Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.ApproximateNumericType#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.ApproximateNumericType#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.datatype.DatatypePackage#getApproximateNumericType()
 * @model
 * @generated
 */
public interface ApproximateNumericType extends NumericType {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.datatype.ApproximateNumericTypeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.ApproximateNumericTypeKind
     * @see #setKind(ApproximateNumericTypeKind)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getApproximateNumericType_Kind()
     * @model required="true"
     * @generated
     */
    ApproximateNumericTypeKind getKind();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.ApproximateNumericType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.ApproximateNumericTypeKind
     * @see #getKind()
     * @generated
     */
    void setKind(ApproximateNumericTypeKind value);

    /**
     * Returns the value of the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Precision</em>' attribute.
     * @see #setPrecision(UnsignedInteger)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getApproximateNumericType_Precision()
     * @model dataType="org.emftext.language.sql.common.UnsignedInteger"
     * @generated
     */
    UnsignedInteger getPrecision();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.ApproximateNumericType#getPrecision <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Precision</em>' attribute.
     * @see #getPrecision()
     * @generated
     */
    void setPrecision(UnsignedInteger value);

} // ApproximateNumericType
