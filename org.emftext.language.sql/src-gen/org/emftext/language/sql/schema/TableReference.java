/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.TableReference#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.TableReference#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.TableReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getTableReference()
 * @model
 * @generated
 */
public interface TableReference extends EObject {
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
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableReference_CatalogName()
     * @model
     * @generated
     */
    String getCatalogName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableReference#getCatalogName <em>Catalog Name</em>}' attribute.
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
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableReference_SchemaName()
     * @model
     * @generated
     */
    String getSchemaName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableReference#getSchemaName <em>Schema Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Name</em>' attribute.
     * @see #getSchemaName()
     * @generated
     */
    void setSchemaName(String value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(TableDefinition)
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableReference_Target()
     * @model
     * @generated
     */
    TableDefinition getTarget();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableReference#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(TableDefinition value);

} // TableReference
