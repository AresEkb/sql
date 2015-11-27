/**
 */
package org.emftext.language.sql.datatype;

import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.common.SchemaQualifiedName;

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
 *   <li>{@link org.emftext.language.sql.datatype.CharacterStringType#getLength <em>Length</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.CharacterStringType#getCharacterSetName <em>Character Set Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.CharacterStringType#getCollationName <em>Collation Name</em>}</li>
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

    /**
     * Returns the value of the '<em><b>Character Set Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character Set Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character Set Name</em>' containment reference.
     * @see #setCharacterSetName(SchemaQualifiedName)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getCharacterStringType_CharacterSetName()
     * @model containment="true"
     * @generated
     */
    SchemaQualifiedName getCharacterSetName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.CharacterStringType#getCharacterSetName <em>Character Set Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Set Name</em>' containment reference.
     * @see #getCharacterSetName()
     * @generated
     */
    void setCharacterSetName(SchemaQualifiedName value);

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
     * @see org.emftext.language.sql.datatype.DatatypePackage#getCharacterStringType_CollationName()
     * @model containment="true"
     * @generated
     */
    SchemaQualifiedName getCollationName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.CharacterStringType#getCollationName <em>Collation Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collation Name</em>' containment reference.
     * @see #getCollationName()
     * @generated
     */
    void setCollationName(SchemaQualifiedName value);

} // CharacterStringType
