/**
 */
package org.emftext.language.sql.datatype;

import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.common.SchemaQualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>National Character String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.NationalCharacterStringType#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.NationalCharacterStringType#getLength <em>Length</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.NationalCharacterStringType#getCollationName <em>Collation Name</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.datatype.DatatypePackage#getNationalCharacterStringType()
 * @model
 * @generated
 */
public interface NationalCharacterStringType extends PredefinedType {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.datatype.NationalCharacterStringTypeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.NationalCharacterStringTypeKind
     * @see #setKind(NationalCharacterStringTypeKind)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getNationalCharacterStringType_Kind()
     * @model required="true"
     * @generated
     */
    NationalCharacterStringTypeKind getKind();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.NationalCharacterStringType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.NationalCharacterStringTypeKind
     * @see #getKind()
     * @generated
     */
    void setKind(NationalCharacterStringTypeKind value);

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(UnsignedInteger)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getNationalCharacterStringType_Length()
     * @model dataType="org.emftext.language.sql.common.UnsignedInteger"
     * @generated
     */
    UnsignedInteger getLength();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.NationalCharacterStringType#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(UnsignedInteger value);

    /**
     * Returns the value of the '<em><b>Collation Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collation Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collation Name</em>' containment reference.
     * @see #setCollationName(SchemaQualifiedName)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getNationalCharacterStringType_CollationName()
     * @model containment="true"
     * @generated
     */
    SchemaQualifiedName getCollationName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.NationalCharacterStringType#getCollationName <em>Collation Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collation Name</em>' containment reference.
     * @see #getCollationName()
     * @generated
     */
    void setCollationName(SchemaQualifiedName value);

} // NationalCharacterStringType
