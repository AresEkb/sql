/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.common.SchemaQualifiedName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.TableDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.TableDefinition#getSchemaQualifiedName <em>Schema Qualified Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.TableDefinition#getScope <em>Scope</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.TableDefinition#getContentsSource <em>Contents Source</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getTableDefinition()
 * @model
 * @generated
 */
public interface TableDefinition extends SQLSchemaDefinitionStatement, EObject {
    /**
     * Returns the value of the '<em><b>Contents Source</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.emftext.language.sql.schema.TableContentsSource#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contents Source</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contents Source</em>' containment reference.
     * @see #setContentsSource(TableContentsSource)
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableDefinition_ContentsSource()
     * @see org.emftext.language.sql.schema.TableContentsSource#getOwner
     * @model opposite="owner" containment="true" required="true"
     * @generated
     */
    TableContentsSource getContentsSource();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableDefinition#getContentsSource <em>Contents Source</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contents Source</em>' containment reference.
     * @see #getContentsSource()
     * @generated
     */
    void setContentsSource(TableContentsSource value);

    /**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.schema.TableScope}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see org.emftext.language.sql.schema.TableScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #setScope(TableScope)
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableDefinition_Scope()
     * @model unsettable="true" required="true"
     * @generated
     */
    TableScope getScope();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableDefinition#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see org.emftext.language.sql.schema.TableScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #getScope()
     * @generated
     */
    void setScope(TableScope value);

    /**
     * Unsets the value of the '{@link org.emftext.language.sql.schema.TableDefinition#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(TableScope)
     * @generated
     */
    void unsetScope();

    /**
     * Returns whether the value of the '{@link org.emftext.language.sql.schema.TableDefinition#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(TableScope)
     * @generated
     */
    boolean isSetScope();

    /**
     * Returns the value of the '<em><b>Schema Qualified Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Qualified Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Qualified Name</em>' containment reference.
     * @see #setSchemaQualifiedName(SchemaQualifiedName)
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableDefinition_SchemaQualifiedName()
     * @model containment="true" required="true"
     * @generated
     */
    SchemaQualifiedName getSchemaQualifiedName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableDefinition#getSchemaQualifiedName <em>Schema Qualified Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Qualified Name</em>' containment reference.
     * @see #getSchemaQualifiedName()
     * @generated
     */
    void setSchemaQualifiedName(SchemaQualifiedName value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.emftext.language.sql.schema.SchemaPackage#getTableDefinition_Label()
     * @model required="true" transient="true" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if schemaQualifiedName.oclIsUndefined() then \'\' else schemaQualifiedName.name endif'"
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.TableDefinition#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

} // TableDefinition
