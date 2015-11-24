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
import org.emftext.language.sql.datatype.CharacterStringType;
import org.emftext.language.sql.datatype.CharacterStringTypeKind;
import org.emftext.language.sql.datatype.DatatypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl#getCharacterSetName <em>Character Set Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl#getCollationName <em>Collation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterStringTypeImpl extends PredefinedTypeImpl implements CharacterStringType {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final CharacterStringTypeKind KIND_EDEFAULT = CharacterStringTypeKind.CHARACTER;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected CharacterStringTypeKind kind = KIND_EDEFAULT;

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
     * The cached value of the '{@link #getCharacterSetName() <em>Character Set Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacterSetName()
     * @generated
     * @ordered
     */
    protected SchemaQualifiedName characterSetName;

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
    protected CharacterStringTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.CHARACTER_STRING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterStringTypeKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(CharacterStringTypeKind newKind) {
        CharacterStringTypeKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.CHARACTER_STRING_TYPE__KIND, oldKind,
                    kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaQualifiedName getCharacterSetName() {
        return characterSetName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCharacterSetName(SchemaQualifiedName newCharacterSetName, NotificationChain msgs) {
        SchemaQualifiedName oldCharacterSetName = characterSetName;
        characterSetName = newCharacterSetName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME, oldCharacterSetName,
                    newCharacterSetName);
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
    public void setCharacterSetName(SchemaQualifiedName newCharacterSetName) {
        if (newCharacterSetName != characterSetName) {
            NotificationChain msgs = null;
            if (characterSetName != null)
                msgs = ((InternalEObject) characterSetName).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME, null, msgs);
            if (newCharacterSetName != null)
                msgs = ((InternalEObject) newCharacterSetName).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME, null, msgs);
            msgs = basicSetCharacterSetName(newCharacterSetName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME, newCharacterSetName,
                    newCharacterSetName));
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
                    DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME, oldCollationName, newCollationName);
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
                        EOPPOSITE_FEATURE_BASE - DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME, null, msgs);
            if (newCollationName != null)
                msgs = ((InternalEObject) newCollationName).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME, null, msgs);
            msgs = basicSetCollationName(newCollationName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME,
                    newCollationName, newCollationName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME:
            return basicSetCharacterSetName(null, msgs);
        case DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME:
            return basicSetCollationName(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.CHARACTER_STRING_TYPE__LENGTH,
                    oldLength, length));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DatatypePackage.CHARACTER_STRING_TYPE__KIND:
            return getKind();
        case DatatypePackage.CHARACTER_STRING_TYPE__LENGTH:
            return getLength();
        case DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME:
            return getCharacterSetName();
        case DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME:
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
        case DatatypePackage.CHARACTER_STRING_TYPE__KIND:
            setKind((CharacterStringTypeKind) newValue);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__LENGTH:
            setLength((UnsignedInteger) newValue);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME:
            setCharacterSetName((SchemaQualifiedName) newValue);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME:
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
        case DatatypePackage.CHARACTER_STRING_TYPE__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__LENGTH:
            setLength(LENGTH_EDEFAULT);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME:
            setCharacterSetName((SchemaQualifiedName) null);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME:
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
        case DatatypePackage.CHARACTER_STRING_TYPE__KIND:
            return kind != KIND_EDEFAULT;
        case DatatypePackage.CHARACTER_STRING_TYPE__LENGTH:
            return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
        case DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME:
            return characterSetName != null;
        case DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME:
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

} //CharacterStringTypeImpl
