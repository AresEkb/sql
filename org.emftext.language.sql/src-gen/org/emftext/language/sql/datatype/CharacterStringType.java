/**
 */
package org.emftext.language.sql.datatype;

import org.emftext.language.sql.UnsignedInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.CharacterStringType#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.CharacterStringType#getCharacterSetName <em>Character Set Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.CharacterStringType#getCollationName <em>Collation Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.CharacterStringType#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.datatype.DatatypePackage#getCharacterStringType()
 * @model
 * @generated
 */
public interface CharacterStringType extends PredefinedType {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.datatype.CharacterStringTypeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.CharacterStringTypeKind
     * @see #setKind(CharacterStringTypeKind)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getCharacterStringType_Kind()
     * @model required="true"
     * @generated
     */
    CharacterStringTypeKind getKind();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.CharacterStringType#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.datatype.CharacterStringTypeKind
     * @see #getKind()
     * @generated
     */
    void setKind(CharacterStringTypeKind value);

    /**
     * Returns the value of the '<em><b>Character Set Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character Set Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character Set Name</em>' attribute.
     * @see #setCharacterSetName(String)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getCharacterStringType_CharacterSetName()
     * @model
     * @generated
     */
    String getCharacterSetName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.CharacterStringType#getCharacterSetName <em>Character Set Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Set Name</em>' attribute.
     * @see #getCharacterSetName()
     * @generated
     */
    void setCharacterSetName(String value);

    /**
     * Returns the value of the '<em><b>Collation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collation Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collation Name</em>' attribute.
     * @see #setCollationName(String)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getCharacterStringType_CollationName()
     * @model
     * @generated
     */
    String getCollationName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.CharacterStringType#getCollationName <em>Collation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collation Name</em>' attribute.
     * @see #getCollationName()
     * @generated
     */
    void setCollationName(String value);

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
     * @see org.emftext.language.sql.datatype.DatatypePackage#getCharacterStringType_Length()
     * @model dataType="org.emftext.language.sql.common.UnsignedInteger"
     * @generated
     */
    UnsignedInteger getLength();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.CharacterStringType#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(UnsignedInteger value);

} // CharacterStringType
