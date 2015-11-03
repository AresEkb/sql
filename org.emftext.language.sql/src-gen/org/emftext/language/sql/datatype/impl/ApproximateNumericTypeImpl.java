/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.datatype.ApproximateNumericType;
import org.emftext.language.sql.datatype.ApproximateNumericTypeKind;
import org.emftext.language.sql.datatype.DatatypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Approximate Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.impl.ApproximateNumericTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.ApproximateNumericTypeImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApproximateNumericTypeImpl extends NumericTypeImpl implements ApproximateNumericType {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final ApproximateNumericTypeKind KIND_EDEFAULT = ApproximateNumericTypeKind.FLOAT;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected ApproximateNumericTypeKind kind = KIND_EDEFAULT;

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
    protected ApproximateNumericTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.APPROXIMATE_NUMERIC_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApproximateNumericTypeKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(ApproximateNumericTypeKind newKind) {
        ApproximateNumericTypeKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND,
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
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION,
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
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND:
            return getKind();
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION:
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
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND:
            setKind((ApproximateNumericTypeKind) newValue);
            return;
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION:
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
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION:
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
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND:
            return kind != KIND_EDEFAULT;
        case DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION:
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

} //ApproximateNumericTypeImpl
