/**
 */
package org.emftext.language.sql.schema;

import org.emftext.language.sql.function.DatetimeValueFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datetime Value Function Default Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.schema.SchemaPackage#getDatetimeValueFunctionDefaultOption()
 * @model
 * @generated
 */
public interface DatetimeValueFunctionDefaultOption extends DefaultOption {
    /**
     * Returns the value of the '<em><b>Function</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' containment reference.
     * @see #setFunction(DatetimeValueFunction)
     * @see org.emftext.language.sql.schema.SchemaPackage#getDatetimeValueFunctionDefaultOption_Function()
     * @model containment="true" required="true"
     * @generated
     */
    DatetimeValueFunction getFunction();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption#getFunction <em>Function</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Function</em>' containment reference.
     * @see #getFunction()
     * @generated
     */
    void setFunction(DatetimeValueFunction value);

} // DatetimeValueFunctionDefaultOption
