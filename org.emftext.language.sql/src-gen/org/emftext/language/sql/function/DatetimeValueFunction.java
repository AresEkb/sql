/**
 */
package org.emftext.language.sql.function;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.UnsignedInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datetime Value Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.function.DatetimeValueFunction#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.function.DatetimeValueFunction#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.function.FunctionPackage#getDatetimeValueFunction()
 * @model
 * @generated
 */
public interface DatetimeValueFunction extends EObject {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.function.DatetimeValueFunctionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.function.DatetimeValueFunctionKind
     * @see #setKind(DatetimeValueFunctionKind)
     * @see org.emftext.language.sql.function.FunctionPackage#getDatetimeValueFunction_Kind()
     * @model required="true"
     * @generated
     */
    DatetimeValueFunctionKind getKind();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.function.DatetimeValueFunction#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.emftext.language.sql.function.DatetimeValueFunctionKind
     * @see #getKind()
     * @generated
     */
    void setKind(DatetimeValueFunctionKind value);

    /**
     * Returns the value of the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Precision</em>' attribute.
     * @see #setPrecision(UnsignedInteger)
     * @see org.emftext.language.sql.function.FunctionPackage#getDatetimeValueFunction_Precision()
     * @model dataType="org.emftext.language.sql.common.UnsignedInteger"
     * @generated
     */
    UnsignedInteger getPrecision();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.function.DatetimeValueFunction#getPrecision <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Precision</em>' attribute.
     * @see #getPrecision()
     * @generated
     */
    void setPrecision(UnsignedInteger value);

} // DatetimeValueFunction
