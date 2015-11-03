/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.UniqueConstraint#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getUniqueConstraint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UniqueConstraint extends EObject {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.schema.UniqueSpecificationKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.schema.UniqueSpecificationKind
     * @see #setKind(UniqueSpecificationKind)
     * @see org.emftext.language.sql.schema.SchemaPackage#getUniqueConstraint_Kind()
     * @model required="true"
     * @generated
     */
    UniqueSpecificationKind getKind();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.UniqueConstraint#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.schema.UniqueSpecificationKind
     * @see #getKind()
     * @generated
     */
    void setKind(UniqueSpecificationKind value);

} // UniqueConstraint
