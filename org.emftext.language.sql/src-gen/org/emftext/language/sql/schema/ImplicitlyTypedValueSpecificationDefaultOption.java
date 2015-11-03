/**
 */
package org.emftext.language.sql.schema;

import org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicitly Typed Value Specification Default Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getImplicitlyTypedValueSpecificationDefaultOption()
 * @model
 * @generated
 */
public interface ImplicitlyTypedValueSpecificationDefaultOption extends DefaultOption {
    /**
     * Returns the value of the '<em><b>Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specification</em>' containment reference.
     * @see #setSpecification(ImplicitlyTypedValueSpecification)
     * @see org.emftext.language.sql.schema.SchemaPackage#getImplicitlyTypedValueSpecificationDefaultOption_Specification()
     * @model containment="true" required="true"
     * @generated
     */
    ImplicitlyTypedValueSpecification getSpecification();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption#getSpecification <em>Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specification</em>' containment reference.
     * @see #getSpecification()
     * @generated
     */
    void setSpecification(ImplicitlyTypedValueSpecification value);

} // ImplicitlyTypedValueSpecificationDefaultOption
