/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.common.SchemaQualifiedName;
import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.NationalCharacterStringType;
import org.emftext.language.sql.datatype.NationalCharacterStringTypeKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>National Character String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.impl.NationalCharacterStringTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.NationalCharacterStringTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.NationalCharacterStringTypeImpl#getCollationName <em>Collation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NationalCharacterStringTypeImpl extends PredefinedTypeImpl implements NationalCharacterStringType {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final NationalCharacterStringTypeKind KIND_EDEFAULT = NationalCharacterStringTypeKind.NATIONAL_CHARACTER;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected NationalCharacterStringTypeKind kind = KIND_EDEFAULT;

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final UnsignedInteger LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected UnsignedInteger length = LENGTH_EDEFAULT;

    /**
     * The cached value of the '{@link #getCollationName() <em>Collation Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollationName()
     * @generated
     * @ordered
     */
    protected SchemaQualifiedName collationName;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NationalCharacterStringTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.NATIONAL_CHARACTER_STRING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NationalCharacterStringTypeKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(NationalCharacterStringTypeKind newKind) {
        NationalCharacterStringTypeKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND,
                    oldKind, kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnsignedInteger getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLength(UnsignedInteger newLength) {
        UnsignedInteger oldLength = length;
        length = newLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH, oldLength, length));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaQualifiedName getCollationName() {
        return collationName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCollationName(SchemaQualifiedName newCollationName, NotificationChain msgs) {
        SchemaQualifiedName oldCollationName = collationName;
        collationName = newCollationName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME, oldCollationName, newCollationName);
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
    public void setCollationName(SchemaQualifiedName newCollationName) {
        if (newCollationName != collationName) {
            NotificationChain msgs = null;
            if (collationName != null)
                msgs = ((InternalEObject) collationName).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME, null,
                        msgs);
            if (newCollationName != null)
                msgs = ((InternalEObject) newCollationName).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME, null,
                        msgs);
            msgs = basicSetCollationName(newCollationName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME, newCollationName,
                    newCollationName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME:
            return basicSetCollationName(null, msgs);
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
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND:
            return getKind();
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH:
            return getLength();
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME:
            return getCollationName();
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
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND:
            setKind((NationalCharacterStringTypeKind) newValue);
            return;
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH:
            setLength((UnsignedInteger) newValue);
            return;
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME:
            setCollationName((SchemaQualifiedName) newValue);
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
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH:
            setLength(LENGTH_EDEFAULT);
            return;
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME:
            setCollationName((SchemaQualifiedName) null);
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
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND:
            return kind != KIND_EDEFAULT;
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH:
            return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
        case DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME:
            return collationName != null;
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
        result.append(", length: ");
        result.append(length);
        result.append(')');
        return result.toString();
    }

} //NationalCharacterStringTypeImpl
