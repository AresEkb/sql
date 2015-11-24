/**
 */
package org.emftext.language.sql.literal;

import org.emftext.language.sql.common.SchemaQualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.literal.CharacterStringLiteral#getCharacterSetName <em>Character Set Name</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.literal.LiteralPackage#getCharacterStringLiteral()
 * @model
 * @generated
 */
public interface CharacterStringLiteral extends NationalCharacterStringLiteral {
    /**
     * Returns the value of the '<em><b>Character Set Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character Set Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character Set Name</em>' containment reference.
     * @see #setCharacterSetName(SchemaQualifiedName)
     * @see org.emftext.language.sql.literal.LiteralPackage#getCharacterStringLiteral_CharacterSetName()
     * @model containment="true"
     * @generated
     */
    SchemaQualifiedName getCharacterSetName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.literal.CharacterStringLiteral#getCharacterSetName <em>Character Set Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Set Name</em>' containment reference.
     * @see #getCharacterSetName()
     * @generated
     */
    void setCharacterSetName(SchemaQualifiedName value);

} // CharacterStringLiteral
