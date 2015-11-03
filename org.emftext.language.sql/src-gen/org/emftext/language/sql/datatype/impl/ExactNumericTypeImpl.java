/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.ExactNumericType;
import org.emftext.language.sql.datatype.ExactNumericTypeKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exact Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.impl.ExactNumericTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.ExactNumericTypeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.ExactNumericTypeImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExactNumericTypeImpl extends NumericTypeImpl implements ExactNumericType {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final ExactNumericTypeKind KIND_EDEFAULT = ExactNumericTypeKind.NUMERIC;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected ExactNumericTypeKind kind = KIND_EDEFAULT;

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
     * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected static final UnsignedInteger SCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected UnsignedInteger scale = SCALE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExactNumericTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.EXACT_NUMERIC_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExactNumericTypeKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(ExactNumericTypeKind newKind) {
        ExactNumericTypeKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.EXACT_NUMERIC_TYPE__KIND, oldKind,
                    kind));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION,
                    oldPrecision, precision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnsignedInteger getScale() {
        return scale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScale(UnsignedInteger newScale) {
        UnsignedInteger oldScale = scale;
        scale = newScale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.EXACT_NUMERIC_TYPE__SCALE, oldScale,
                    scale));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DatatypePackage.EXACT_NUMERIC_TYPE__KIND:
            return getKind();
        case DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION:
            return getPrecision();
        case DatatypePackage.EXACT_NUMERIC_TYPE__SCALE:
            return getScale();
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
        case DatatypePackage.EXACT_NUMERIC_TYPE__KIND:
            setKind((ExactNumericTypeKind) newValue);
            return;
        case DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION:
            setPrecision((UnsignedInteger) newValue);
            return;
        case DatatypePackage.EXACT_NUMERIC_TYPE__SCALE:
            setScale((UnsignedInteger) newValue);
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
        case DatatypePackage.EXACT_NUMERIC_TYPE__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION:
            setPrecision(PRECISION_EDEFAULT);
            return;
        case DatatypePackage.EXACT_NUMERIC_TYPE__SCALE:
            setScale(SCALE_EDEFAULT);
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
        case DatatypePackage.EXACT_NUMERIC_TYPE__KIND:
            return kind != KIND_EDEFAULT;
        case DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION:
            return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
        case DatatypePackage.EXACT_NUMERIC_TYPE__SCALE:
            return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
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
        result.append(", scale: ");
        result.append(scale);
        result.append(')');
        return result.toString();
    }

} //ExactNumericTypeImpl
