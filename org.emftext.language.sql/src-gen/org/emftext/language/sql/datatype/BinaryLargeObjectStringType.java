/**
 */
package org.emftext.language.sql.datatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Large Object String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringType#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringType#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.datatype.DatatypePackage#getBinaryLargeObjectStringType()
 * @model
 * @generated
 */
public interface BinaryLargeObjectStringType extends PredefinedType {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind
     * @see #setKind(BinaryLargeObjectStringTypeKind)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getBinaryLargeObjectStringType_Kind()
     * @model required="true"
     * @generated
     */
    BinaryLargeObjectStringTypeKind getKind();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind
     * @see #getKind()
     * @generated
     */
    void setKind(BinaryLargeObjectStringTypeKind value);

    /**
     * Returns the value of the '<em><b>Length</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' containment reference.
     * @see #setLength(LargeObjectLength)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getBinaryLargeObjectStringType_Length()
     * @model containment="true"
     * @generated
     */
    LargeObjectLength getLength();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringType#getLength <em>Length</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' containment reference.
     * @see #getLength()
     * @generated
     */
    void setLength(LargeObjectLength value);

} // BinaryLargeObjectStringType
