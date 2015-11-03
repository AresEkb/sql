/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Element List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.TableElementList#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getTableElementList()
 * @model
 * @generated
 */
public interface TableElementList extends TableContentsSource {
    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.emftext.language.sql.schema.TableElement}.
     * It is bidirectional and its opposite is '{@link org.emftext.language.sql.schema.TableElement#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableElementList_Elements()
     * @see org.emftext.language.sql.schema.TableElement#getOwner
     * @model opposite="owner" containment="true" required="true"
     * @generated
     */
    EList<TableElement> getElements();

} // TableElementList
