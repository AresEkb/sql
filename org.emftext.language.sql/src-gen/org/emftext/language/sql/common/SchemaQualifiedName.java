/**
 */
package org.emftext.language.sql.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.common.SchemaQualifiedName#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.common.SchemaQualifiedName#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.common.SchemaQualifiedName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.common.CommonPackage#getSchemaQualifiedName()
 * @model
 * @generated
 */
public interface SchemaQualifiedName extends EObject {
    /**
     * Returns the value of the '<em><b>Catalog Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Catalog Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Catalog Name</em>' attribute.
     * @see #setCatalogName(String)
     * @see org.emftext.language.sql.common.CommonPackage#getSchemaQualifiedName_CatalogName()
     * @model
     * @generated
     */
    String getCatalogName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.common.SchemaQualifiedName#getCatalogName <em>Catalog Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Catalog Name</em>' attribute.
     * @see #getCatalogName()
     * @generated
     */
    void setCatalogName(String value);

    /**
     * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Name</em>' attribute.
     * @see #setSchemaName(String)
     * @see org.emftext.language.sql.common.CommonPackage#getSchemaQualifiedName_SchemaName()
     * @model
     * @generated
     */
    String getSchemaName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.common.SchemaQualifiedName#getSchemaName <em>Schema Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Name</em>' attribute.
     * @see #getSchemaName()
     * @generated
     */
    void setSchemaName(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.emftext.language.sql.common.CommonPackage#getSchemaQualifiedName_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.common.SchemaQualifiedName#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // SchemaQualifiedName
