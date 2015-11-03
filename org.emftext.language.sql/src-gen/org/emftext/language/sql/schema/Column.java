/**
 */
package org.emftext.language.sql.schema;

import org.emftext.language.sql.Identifier;
import org.emftext.language.sql.SchemaQualifiedName;

import org.emftext.language.sql.datatype.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.Column#getName <em>Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.Column#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.Column#getDefaultOption <em>Default Option</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.Column#getConstraintDefinition <em>Constraint Definition</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.Column#getCollationName <em>Collation Name</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends TableElement {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(Identifier)
     * @see org.emftext.language.sql.schema.SchemaPackage#getColumn_Name()
     * @model id="true" dataType="org.emftext.language.sql.common.Identifier" required="true"
     * @generated
     */
    Identifier getName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.Column#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(Identifier value);

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' containment reference.
     * @see #setDataType(DataType)
     * @see org.emftext.language.sql.schema.SchemaPackage#getColumn_DataType()
     * @model containment="true" required="true"
     * @generated
     */
    DataType getDataType();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.Column#getDataType <em>Data Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' containment reference.
     * @see #getDataType()
     * @generated
     */
    void setDataType(DataType value);

    /**
     * Returns the value of the '<em><b>Default Option</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.emftext.language.sql.schema.DefaultOption#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Option</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Option</em>' containment reference.
     * @see #setDefaultOption(DefaultOption)
     * @see org.emftext.language.sql.schema.SchemaPackage#getColumn_DefaultOption()
     * @see org.emftext.language.sql.schema.DefaultOption#getOwner
     * @model opposite="owner" containment="true"
     * @generated
     */
    DefaultOption getDefaultOption();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.Column#getDefaultOption <em>Default Option</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Option</em>' containment reference.
     * @see #getDefaultOption()
     * @generated
     */
    void setDefaultOption(DefaultOption value);

    /**
     * Returns the value of the '<em><b>Constraint Definition</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.emftext.language.sql.schema.ColumnConstraint#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraint Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constraint Definition</em>' containment reference.
     * @see #setConstraintDefinition(ColumnConstraint)
     * @see org.emftext.language.sql.schema.SchemaPackage#getColumn_ConstraintDefinition()
     * @see org.emftext.language.sql.schema.ColumnConstraint#getOwner
     * @model opposite="owner" containment="true"
     * @generated
     */
    ColumnConstraint getConstraintDefinition();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.Column#getConstraintDefinition <em>Constraint Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constraint Definition</em>' containment reference.
     * @see #getConstraintDefinition()
     * @generated
     */
    void setConstraintDefinition(ColumnConstraint value);

    /**
     * Returns the value of the '<em><b>Collation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collation Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collation Name</em>' attribute.
     * @see #setCollationName(SchemaQualifiedName)
     * @see org.emftext.language.sql.schema.SchemaPackage#getColumn_CollationName()
     * @model dataType="org.emftext.language.sql.common.SchemaQualifiedName"
     * @generated
     */
    SchemaQualifiedName getCollationName();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.Column#getCollationName <em>Collation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collation Name</em>' attribute.
     * @see #getCollationName()
     * @generated
     */
    void setCollationName(SchemaQualifiedName value);

} // Column
