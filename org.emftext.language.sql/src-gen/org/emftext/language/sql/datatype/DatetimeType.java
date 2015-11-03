/**
 */
package org.emftext.language.sql.datatype;

import org.emftext.language.sql.UnsignedInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datetime Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.DatetimeType#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.DatetimeType#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.DatetimeType#getWithTimeZone <em>With Time Zone</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.datatype.DatatypePackage#getDatetimeType()
 * @model
 * @generated
 */
public interface DatetimeType extends PredefinedType {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.datatype.DatetimeTypeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.DatetimeTypeKind
     * @see #setKind(DatetimeTypeKind)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getDatetimeType_Kind()
     * @model required="true"
     * @generated
     */
    DatetimeTypeKind getKind();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.DatetimeType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.DatetimeTypeKind
     * @see #getKind()
     * @generated
     */
    void setKind(DatetimeTypeKind value);

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
     * @see org.emftext.language.sql.datatype.DatatypePackage#getDatetimeType_Precision()
     * @model dataType="org.emftext.language.sql.common.UnsignedInteger"
     * @generated
     */
    UnsignedInteger getPrecision();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.DatetimeType#getPrecision <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Precision</em>' attribute.
     * @see #getPrecision()
     * @generated
     */
    void setPrecision(UnsignedInteger value);

    /**
     * Returns the value of the '<em><b>With Time Zone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>With Time Zone</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>With Time Zone</em>' attribute.
     * @see #setWithTimeZone(Boolean)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getDatetimeType_WithTimeZone()
     * @model
     * @generated
     */
    Boolean getWithTimeZone();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.DatetimeType#getWithTimeZone <em>With Time Zone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>With Time Zone</em>' attribute.
     * @see #getWithTimeZone()
     * @generated
     */
    void setWithTimeZone(Boolean value);

} // DatetimeType
