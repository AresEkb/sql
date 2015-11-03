/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification;

import org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption;
import org.emftext.language.sql.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implicitly Typed Value Specification Default Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.ImplicitlyTypedValueSpecificationDefaultOptionImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicitlyTypedValueSpecificationDefaultOptionImpl extends DefaultOptionImpl
        implements ImplicitlyTypedValueSpecificationDefaultOption {
    /**
     * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecification()
     * @generated
     * @ordered
     */
    protected ImplicitlyTypedValueSpecification specification;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImplicitlyTypedValueSpecificationDefaultOptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplicitlyTypedValueSpecification getSpecification() {
        return specification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSpecification(ImplicitlyTypedValueSpecification newSpecification,
            NotificationChain msgs) {
        ImplicitlyTypedValueSpecification oldSpecification = specification;
        specification = newSpecification;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION, oldSpecification,
                    newSpecification);
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
    public void setSpecification(ImplicitlyTypedValueSpecification newSpecification) {
        if (newSpecification != specification) {
            NotificationChain msgs = null;
            if (specification != null)
                msgs = ((InternalEObject) specification).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE
                                - SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION,
                        null, msgs);
            if (newSpecification != null)
                msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE
                                - SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION,
                        null, msgs);
            msgs = basicSetSpecification(newSpecification, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION, newSpecification,
                    newSpecification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION:
            return basicSetSpecification(null, msgs);
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
        case SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION:
            return getSpecification();
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
        case SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION:
            setSpecification((ImplicitlyTypedValueSpecification) newValue);
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
        case SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION:
            setSpecification((ImplicitlyTypedValueSpecification) null);
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
        case SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION:
            return specification != null;
        }
        return super.eIsSet(featureID);
    }

} //ImplicitlyTypedValueSpecificationDefaultOptionImpl
