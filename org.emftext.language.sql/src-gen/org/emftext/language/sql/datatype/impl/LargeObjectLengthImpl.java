/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.datatype.CharLengthUnits;
import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.LargeObjectLength;
import org.emftext.language.sql.datatype.Multiplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Large Object Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.impl.LargeObjectLengthImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.LargeObjectLengthImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.LargeObjectLengthImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LargeObjectLengthImpl extends MinimalEObjectImpl.Container implements LargeObjectLength {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final UnsignedInteger VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected UnsignedInteger value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected static final Multiplier MULTIPLIER_EDEFAULT = Multiplier.K;

    /**
     * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated
     * @ordered
     */
    protected Multiplier multiplier = MULTIPLIER_EDEFAULT;

    /**
     * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnits()
     * @generated
     * @ordered
     */
    protected static final CharLengthUnits UNITS_EDEFAULT = CharLengthUnits.CHARACTERS;

    /**
     * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnits()
     * @generated
     * @ordered
     */
    protected CharLengthUnits units = UNITS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LargeObjectLengthImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.LARGE_OBJECT_LENGTH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnsignedInteger getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(UnsignedInteger newValue) {
        UnsignedInteger oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.LARGE_OBJECT_LENGTH__VALUE, oldValue,
                    value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Multiplier getMultiplier() {
        return multiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMultiplier(Multiplier newMultiplier) {
        Multiplier oldMultiplier = multiplier;
        multiplier = newMultiplier == null ? MULTIPLIER_EDEFAULT : newMultiplier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER,
                    oldMultiplier, multiplier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharLengthUnits getUnits() {
        return units;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnits(CharLengthUnits newUnits) {
        CharLengthUnits oldUnits = units;
        units = newUnits == null ? UNITS_EDEFAULT : newUnits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.LARGE_OBJECT_LENGTH__UNITS, oldUnits,
                    units));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DatatypePackage.LARGE_OBJECT_LENGTH__VALUE:
            return getValue();
        case DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER:
            return getMultiplier();
        case DatatypePackage.LARGE_OBJECT_LENGTH__UNITS:
            return getUnits();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DatatypePackage.LARGE_OBJECT_LENGTH__VALUE:
            setValue((UnsignedInteger) newValue);
            return;
        case DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER:
            setMultiplier((Multiplier) newValue);
            return;
        case DatatypePackage.LARGE_OBJECT_LENGTH__UNITS:
            setUnits((CharLengthUnits) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case DatatypePackage.LARGE_OBJECT_LENGTH__VALUE:
            setValue(VALUE_EDEFAULT);
            return;
        case DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER:
            setMultiplier(MULTIPLIER_EDEFAULT);
            return;
        case DatatypePackage.LARGE_OBJECT_LENGTH__UNITS:
            setUnits(UNITS_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DatatypePackage.LARGE_OBJECT_LENGTH__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
        case DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER:
            return multiplier != MULTIPLIER_EDEFAULT;
        case DatatypePackage.LARGE_OBJECT_LENGTH__UNITS:
            return units != UNITS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (value: ");
        result.append(value);
        result.append(", multiplier: ");
        result.append(multiplier);
        result.append(", units: ");
        result.append(units);
        result.append(')');
        return result.toString();
    }

} //LargeObjectLengthImpl
