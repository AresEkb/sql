/**
 */
package org.emftext.language.sql.schema;

import org.emftext.language.sql.literal.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Default Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.LiteralDefaultOption#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getLiteralDefaultOption()
 * @model
 * @generated
 */
public interface LiteralDefaultOption extends DefaultOption {
    /**
     * Returns the value of the '<em><b>Literal</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Literal</em>' containment reference.
     * @see #setLiteral(Literal)
     * @see org.emftext.language.sql.schema.SchemaPackage#getLiteralDefaultOption_Literal()
     * @model containment="true" required="true"
     * @generated
     */
    Literal getLiteral();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.LiteralDefaultOption#getLiteral <em>Literal</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Literal</em>' containment reference.
     * @see #getLiteral()
     * @generated
     */
    void setLiteral(Literal value);

} // LiteralDefaultOption
