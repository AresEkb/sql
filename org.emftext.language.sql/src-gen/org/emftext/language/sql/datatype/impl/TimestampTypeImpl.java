/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.common.CommonFactory;
import org.emftext.language.sql.common.CommonPackage;

import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.TimestampType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.impl.TimestampTypeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.TimestampTypeImpl#getWithTimeZone <em>With Time Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimestampTypeImpl extends DatetimeTypeImpl implements TimestampType {
    /**
     * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected static final UnsignedInteger PRECISION_EDEFAULT = (UnsignedInteger) CommonFactory.eINSTANCE
            .createFromString(CommonPackage.eINSTANCE.getUnsignedInteger(), "6");

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
     * The default value of the '{@link #getWithTimeZone() <em>With Time Zone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWithTimeZone()
     * @generated
     * @ordered
     */
    protected static final Boolean WITH_TIME_ZONE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWithTimeZone() <em>With Time Zone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWithTimeZone()
     * @generated
     * @ordered
     */
    protected Boolean withTimeZone = WITH_TIME_ZONE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimestampTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.TIMESTAMP_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.TIMESTAMP_TYPE__PRECISION,
                    oldPrecision, precision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getWithTimeZone() {
        return withTimeZone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWithTimeZone(Boolean newWithTimeZone) {
        Boolean oldWithTimeZone = withTimeZone;
        withTimeZone = newWithTimeZone;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE,
                    oldWithTimeZone, withTimeZone));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DatatypePackage.TIMESTAMP_TYPE__PRECISION:
            return getPrecision();
        case DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE:
            return getWithTimeZone();
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
        case DatatypePackage.TIMESTAMP_TYPE__PRECISION:
            setPrecision((UnsignedInteger) newValue);
            return;
        case DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE:
            setWithTimeZone((Boolean) newValue);
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
        case DatatypePackage.TIMESTAMP_TYPE__PRECISION:
            setPrecision(PRECISION_EDEFAULT);
            return;
        case DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE:
            setWithTimeZone(WITH_TIME_ZONE_EDEFAULT);
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
        case DatatypePackage.TIMESTAMP_TYPE__PRECISION:
            return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
        case DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE:
            return WITH_TIME_ZONE_EDEFAULT == null ? withTimeZone != null
                    : !WITH_TIME_ZONE_EDEFAULT.equals(withTimeZone);
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
        result.append(" (precision: ");
        result.append(precision);
        result.append(", withTimeZone: ");
        result.append(withTimeZone);
        result.append(')');
        return result.toString();
    }

} //TimestampTypeImpl
