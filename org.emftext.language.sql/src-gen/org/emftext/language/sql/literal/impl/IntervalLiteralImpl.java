/**
 */
package org.emftext.language.sql.literal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.literal.IntervalLiteral;
import org.emftext.language.sql.literal.LiteralPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.literal.impl.IntervalLiteralImpl#isIsPositive <em>Is Positive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalLiteralImpl extends GeneralLiteralImpl implements IntervalLiteral {
    /**
     * The default value of the '{@link #isIsPositive() <em>Is Positive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsPositive()
     * @generated
     * @ordered
     */
    protected static final boolean IS_POSITIVE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isIsPositive() <em>Is Positive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsPositive()
     * @generated
     * @ordered
     */
    protected boolean isPositive = IS_POSITIVE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntervalLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralPackage.Literals.INTERVAL_LITERAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsPositive() {
        return isPositive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsPositive(boolean newIsPositive) {
        boolean oldIsPositive = isPositive;
        isPositive = newIsPositive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LiteralPackage.INTERVAL_LITERAL__IS_POSITIVE,
                    oldIsPositive, isPositive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case LiteralPackage.INTERVAL_LITERAL__IS_POSITIVE:
            return isIsPositive();
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
        case LiteralPackage.INTERVAL_LITERAL__IS_POSITIVE:
            setIsPositive((Boolean) newValue);
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
        case LiteralPackage.INTERVAL_LITERAL__IS_POSITIVE:
            setIsPositive(IS_POSITIVE_EDEFAULT);
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
        case LiteralPackage.INTERVAL_LITERAL__IS_POSITIVE:
            return isPositive != IS_POSITIVE_EDEFAULT;
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
        result.append(" (isPositive: ");
        result.append(isPositive);
        result.append(')');
        return result.toString();
    }

} //IntervalLiteralImpl
