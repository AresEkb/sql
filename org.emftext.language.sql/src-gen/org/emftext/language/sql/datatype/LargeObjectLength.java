/**
 */
package org.emftext.language.sql.datatype;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.UnsignedInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Large Object Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.LargeObjectLength#getValue <em>Value</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.LargeObjectLength#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.LargeObjectLength#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.sql.datatype.DatatypePackage#getLargeObjectLength()
 * @model
 * @generated
 */
public interface LargeObjectLength extends EObject {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(UnsignedInteger)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getLargeObjectLength_Value()
     * @model dataType="org.emftext.language.sql.common.UnsignedInteger" required="true"
     * @generated
     */
    UnsignedInteger getValue();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.LargeObjectLength#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(UnsignedInteger value);

    /**
     * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.datatype.Multiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiplier</em>' attribute.
     * @see org.emftext.language.sql.datatype.Multiplier
     * @see #setMultiplier(Multiplier)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getLargeObjectLength_Multiplier()
     * @model
     * @generated
     */
    Multiplier getMultiplier();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.LargeObjectLength#getMultiplier <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplier</em>' attribute.
     * @see org.emftext.language.sql.datatype.Multiplier
     * @see #getMultiplier()
     * @generated
     */
    void setMultiplier(Multiplier value);

    /**
     * Returns the value of the '<em><b>Units</b></em>' attribute.
     * The literals are from the enumeration {@link org.emftext.language.sql.datatype.CharLengthUnits}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Units</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Units</em>' attribute.
     * @see org.emftext.language.sql.datatype.CharLengthUnits
     * @see #setUnits(CharLengthUnits)
     * @see org.emftext.language.sql.datatype.DatatypePackage#getLargeObjectLength_Units()
     * @model
     * @generated
     */
    CharLengthUnits getUnits();

    /**
     * Sets the value of the '{@link org.emftext.language.sql.datatype.LargeObjectLength#getUnits <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Units</em>' attribute.
     * @see org.emftext.language.sql.datatype.CharLengthUnits
     * @see #getUnits()
     * @generated
     */
    void setUnits(CharLengthUnits value);

} // LargeObjectLength
