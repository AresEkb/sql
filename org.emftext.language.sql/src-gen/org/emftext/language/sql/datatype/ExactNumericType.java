/**
 */
package org.emftext.language.sql.datatype;

import org.emftext.language.sql.UnsignedInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exact Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.ExactNumericType#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.ExactNumericType#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.ExactNumericType#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.datatype.DatatypePackage#getExactNumericType()
 * @model
 * @generated
 */
public interface ExactNumericType extends NumericType {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.datatype.ExactNumericTypeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.ExactNumericTypeKind
     * @see #setKind(ExactNumericTypeKind)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getExactNumericType_Kind()
     * @model required="true"
     * @generated
     */
    ExactNumericTypeKind getKind();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.ExactNumericType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.ExactNumericTypeKind
     * @see #getKind()
     * @generated
     */
    void setKind(ExactNumericTypeKind value);

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
     * @see org.emftext.language.sql.datatype.DatatypePackage#getExactNumericType_Precision()
     * @model dataType="org.emftext.language.sql.common.UnsignedInteger"
     * @generated
     */
    UnsignedInteger getPrecision();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.ExactNumericType#getPrecision <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Precision</em>' attribute.
     * @see #getPrecision()
     * @generated
     */
    void setPrecision(UnsignedInteger value);

    /**
     * Returns the value of the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scale</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scale</em>' attribute.
     * @see #setScale(UnsignedInteger)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getExactNumericType_Scale()
     * @model dataType="org.emftext.language.sql.common.UnsignedInteger"
     * @generated
     */
    UnsignedInteger getScale();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.ExactNumericType#getScale <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scale</em>' attribute.
     * @see #getScale()
     * @generated
     */
    void setScale(UnsignedInteger value);

} // ExactNumericType
