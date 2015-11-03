/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Contents Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.TableContentsSource#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getTableContentsSource()
 * @model abstract="true"
 * @generated
 */
public interface TableContentsSource extends EObject {
    /**
     * Returns the value of the '<em><b>Owner</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.emftext.language.sql.schema.TableDefinition#getContentsSource <em>Contents Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' container reference.
     * @see #setOwner(TableDefinition)
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableContentsSource_Owner()
     * @see org.emftext.language.sql.schema.TableDefinition#getContentsSource
     * @model opposite="contentsSource" required="true"
     * @generated
     */
    TableDefinition getOwner();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableContentsSource#getOwner <em>Owner</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' container reference.
     * @see #getOwner()
     * @generated
     */
    void setOwner(TableDefinition value);

} // TableContentsSource
