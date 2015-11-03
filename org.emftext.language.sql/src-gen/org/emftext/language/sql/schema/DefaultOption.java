/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.DefaultOption#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getDefaultOption()
 * @model abstract="true"
 * @generated
 */
public interface DefaultOption extends EObject {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.emftext.language.sql.schema.Column#getDefaultOption <em>Default Option</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' container reference.
     * @see #setOwner(Column)
     * @see org.emftext.language.sql.schema.SchemaPackage#getDefaultOption_Owner()
     * @see org.emftext.language.sql.schema.Column#getDefaultOption
     * @model opposite="defaultOption" required="true" transient="false"
     * @generated
     */
    Column getOwner();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.DefaultOption#getOwner <em>Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' container reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(Column value);

} // DefaultOption
