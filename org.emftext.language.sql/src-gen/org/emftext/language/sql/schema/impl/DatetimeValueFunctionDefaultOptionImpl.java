/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.function.DatetimeValueFunction;

import org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption;
import org.emftext.language.sql.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datetime Value Function Default Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.DatetimeValueFunctionDefaultOptionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatetimeValueFunctionDefaultOptionImpl extends DefaultOptionImpl
        implements DatetimeValueFunctionDefaultOption {
    /**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected DatetimeValueFunction function;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatetimeValueFunctionDefaultOptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatetimeValueFunction getFunction() {
        return function;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFunction(DatetimeValueFunction newFunction, NotificationChain msgs) {
        DatetimeValueFunction oldFunction = function;
        function = newFunction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION, oldFunction, newFunction);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFunction(DatetimeValueFunction newFunction) {
        if (newFunction != function) {
            NotificationChain msgs = null;
            if (function != null)
                msgs = ((InternalEObject) function).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION, null,
                        msgs);
            if (newFunction != null)
                msgs = ((InternalEObject) newFunction).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION, null,
                        msgs);
            msgs = basicSetFunction(newFunction, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION, newFunction, newFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION:
            return basicSetFunction(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION:
            return getFunction();
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
        case SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION:
            setFunction((DatetimeValueFunction) newValue);
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
        case SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION:
            setFunction((DatetimeValueFunction) null);
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
        case SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION:
            return function != null;
        }
        return super.eIsSet(featureID);
    }

} //DatetimeValueFunctionDefaultOptionImpl
