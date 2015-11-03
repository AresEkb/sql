/**
 */
package org.emftext.language.sql.function.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.function.DatetimeValueFunction;
import org.emftext.language.sql.function.DatetimeValueFunctionKind;
import org.emftext.language.sql.function.FunctionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datetime Value Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.function.impl.DatetimeValueFunctionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.function.impl.DatetimeValueFunctionImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatetimeValueFunctionImpl extends MinimalEObjectImpl.Container implements DatetimeValueFunction {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final DatetimeValueFunctionKind KIND_EDEFAULT = DatetimeValueFunctionKind.CURRENT_DATE;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected DatetimeValueFunctionKind kind = KIND_EDEFAULT;

    /**
     * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected static final UnsignedInteger PRECISION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected UnsignedInteger precision = PRECISION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatetimeValueFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FunctionPackage.Literals.DATETIME_VALUE_FUNCTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatetimeValueFunctionKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(DatetimeValueFunctionKind newKind) {
        DatetimeValueFunctionKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.DATETIME_VALUE_FUNCTION__KIND,
                    oldKind, kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnsignedInteger getPrecision() {
        return precision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrecision(UnsignedInteger newPrecision) {
        UnsignedInteger oldPrecision = precision;
        precision = newPrecision;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION,
                    oldPrecision, precision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case FunctionPackage.DATETIME_VALUE_FUNCTION__KIND:
            return getKind();
        case FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION:
            return getPrecision();
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
        case FunctionPackage.DATETIME_VALUE_FUNCTION__KIND:
            setKind((DatetimeValueFunctionKind) newValue);
            return;
        case FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION:
            setPrecision((UnsignedInteger) newValue);
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
        case FunctionPackage.DATETIME_VALUE_FUNCTION__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION:
            setPrecision(PRECISION_EDEFAULT);
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
        case FunctionPackage.DATETIME_VALUE_FUNCTION__KIND:
            return kind != KIND_EDEFAULT;
        case FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION:
            return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
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
        result.append(" (kind: ");
        result.append(kind);
        result.append(", precision: ");
        result.append(precision);
        result.append(')');
        return result.toString();
    }

} //DatetimeValueFunctionImpl
