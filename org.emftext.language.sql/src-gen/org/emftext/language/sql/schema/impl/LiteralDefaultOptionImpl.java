/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.literal.Literal;

import org.emftext.language.sql.schema.LiteralDefaultOption;
import org.emftext.language.sql.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Default Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.LiteralDefaultOptionImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralDefaultOptionImpl extends DefaultOptionImpl implements LiteralDefaultOption {
    /**
     * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLiteral()
     * @generated
     * @ordered
     */
    protected Literal literal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LiteralDefaultOptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.LITERAL_DEFAULT_OPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Literal getLiteral() {
        return literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs) {
        Literal oldLiteral = literal;
        literal = newLiteral;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL, oldLiteral, newLiteral);
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
    public void setLiteral(Literal newLiteral) {
        if (newLiteral != literal) {
            NotificationChain msgs = null;
            if (literal != null)
                msgs = ((InternalEObject) literal).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL, null, msgs);
            if (newLiteral != null)
                msgs = ((InternalEObject) newLiteral).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL, null, msgs);
            msgs = basicSetLiteral(newLiteral, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL,
                    newLiteral, newLiteral));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL:
            return basicSetLiteral(null, msgs);
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
        case SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL:
            return getLiteral();
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
        case SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL:
            setLiteral((Literal) newValue);
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
        case SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL:
            setLiteral((Literal) null);
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
        case SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL:
            return literal != null;
        }
        return super.eIsSet(featureID);
    }

} //LiteralDefaultOptionImpl
