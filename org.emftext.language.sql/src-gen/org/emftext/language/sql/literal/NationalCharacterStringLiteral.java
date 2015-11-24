/**
 */
package org.emftext.language.sql.literal;

import org.eclipse.emf.common.util.EList;
import org.emftext.language.sql.common.Separator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>National Character String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.literal.NationalCharacterStringLiteral#getValues <em>Values</em>}</li>
 *   <li>{@link org.emftext.language.sql.literal.NationalCharacterStringLiteral#getSeparators <em>Separators</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.literal.LiteralPackage#getNationalCharacterStringLiteral()
 * @model
 * @generated
 */
public interface NationalCharacterStringLiteral extends GeneralLiteral {
    /**
     * Returns the value of the '<em><b>Values</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Values</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' attribute list.
     * @see org.emftext.language.sql.literal.LiteralPackage#getNationalCharacterStringLiteral_Values()
     * @model required="true"
     * @generated
     */
    EList<String> getValues();

    /**
     * Returns the value of the '<em><b>Separators</b></em>' containment reference list.
     * The list contents are of type {@link org.emftext.language.sql.common.Separator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Separators</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Separators</em>' containment reference list.
     * @see org.emftext.language.sql.literal.LiteralPackage#getNationalCharacterStringLiteral_Separators()
     * @model containment="true"
     * @generated
     */
    EList<Separator> getSeparators();

} // NationalCharacterStringLiteral
