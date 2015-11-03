/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.datatype.BinaryLargeObjectStringType;
import org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind;
import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.LargeObjectLength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Large Object String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.impl.BinaryLargeObjectStringTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.BinaryLargeObjectStringTypeImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryLargeObjectStringTypeImpl extends PredefinedTypeImpl implements BinaryLargeObjectStringType {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final BinaryLargeObjectStringTypeKind KIND_EDEFAULT = BinaryLargeObjectStringTypeKind.BINARY_LARGE_OBJECT;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected BinaryLargeObjectStringTypeKind kind = KIND_EDEFAULT;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected LargeObjectLength length;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BinaryLargeObjectStringTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.BINARY_LARGE_OBJECT_STRING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryLargeObjectStringTypeKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(BinaryLargeObjectStringTypeKind newKind) {
        BinaryLargeObjectStringTypeKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND,
                    oldKind, kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LargeObjectLength getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLength(LargeObjectLength newLength, NotificationChain msgs) {
        LargeObjectLength oldLength = length;
        length = newLength;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH, oldLength, newLength);
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
    public void setLength(LargeObjectLength newLength) {
        if (newLength != length) {
            NotificationChain msgs = null;
            if (length != null)
                msgs = ((InternalEObject) length).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH, null, msgs);
            if (newLength != null)
                msgs = ((InternalEObject) newLength).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH, null, msgs);
            msgs = basicSetLength(newLength, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH, newLength, newLength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH:
            return basicSetLength(null, msgs);
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
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND:
            return getKind();
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH:
            return getLength();
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
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND:
            setKind((BinaryLargeObjectStringTypeKind) newValue);
            return;
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH:
            setLength((LargeObjectLength) newValue);
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
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH:
            setLength((LargeObjectLength) null);
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
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND:
            return kind != KIND_EDEFAULT;
        case DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH:
            return length != null;
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
        result.append(')');
        return result.toString();
    }

} //BinaryLargeObjectStringTypeImpl
