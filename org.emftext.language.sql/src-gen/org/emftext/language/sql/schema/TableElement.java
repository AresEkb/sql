/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.TableElement#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getTableElement()
 * @model abstract="true"
 * @generated
 */
public interface TableElement extends EObject {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.emftext.language.sql.schema.TableElementList#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' container reference.
     * @see #setOwner(TableElementList)
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableElement_Owner()
     * @see org.emftext.language.sql.schema.TableElementList#getElements
     * @model opposite="elements" required="true" transient="false"
     * @generated
     */
    TableElementList getOwner();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableElement#getOwner <em>Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' container reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(TableElementList value);

} // TableElement
