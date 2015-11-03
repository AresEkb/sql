/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.UnsignedInteger;

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
 *   <li>{@link org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl#getCharacterSetName <em>Character Set Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl#getCollationName <em>Collation Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl#getLength <em>Length</em>}</li>
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
     * The default value of the '{@link #getCharacterSetName() <em>Character Set Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacterSetName()
     * @generated
     * @ordered
     */
    protected static final String CHARACTER_SET_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCharacterSetName() <em>Character Set Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacterSetName()
     * @generated
     * @ordered
     */
    protected String characterSetName = CHARACTER_SET_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCollationName() <em>Collation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollationName()
     * @generated
     * @ordered
     */
    protected static final String COLLATION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCollationName() <em>Collation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollationName()
     * @generated
     * @ordered
     */
    protected String collationName = COLLATION_NAME_EDEFAULT;

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
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharacterSetName(String newCharacterSetName) {
        String oldCharacterSetName = characterSetName;
        characterSetName = newCharacterSetName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME, oldCharacterSetName, characterSetName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCollationName() {
        return collationName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCollationName(String newCollationName) {
        String oldCollationName = collationName;
        collationName = newCollationName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME,
                    oldCollationName, collationName));
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
        case DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME:
            return getCharacterSetName();
        case DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME:
            return getCollationName();
        case DatatypePackage.CHARACTER_STRING_TYPE__LENGTH:
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
        case DatatypePackage.CHARACTER_STRING_TYPE__KIND:
            setKind((CharacterStringTypeKind) newValue);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME:
            setCharacterSetName((String) newValue);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME:
            setCollationName((String) newValue);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__LENGTH:
            setLength((UnsignedInteger) newValue);
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
        case DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME:
            setCharacterSetName(CHARACTER_SET_NAME_EDEFAULT);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME:
            setCollationName(COLLATION_NAME_EDEFAULT);
            return;
        case DatatypePackage.CHARACTER_STRING_TYPE__LENGTH:
            setLength(LENGTH_EDEFAULT);
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
        case DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME:
            return CHARACTER_SET_NAME_EDEFAULT == null ? characterSetName != null
                    : !CHARACTER_SET_NAME_EDEFAULT.equals(characterSetName);
        case DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME:
            return COLLATION_NAME_EDEFAULT == null ? collationName != null
                    : !COLLATION_NAME_EDEFAULT.equals(collationName);
        case DatatypePackage.CHARACTER_STRING_TYPE__LENGTH:
            return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
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
        result.append(", characterSetName: ");
        result.append(characterSetName);
        result.append(", collationName: ");
        result.append(collationName);
        result.append(", length: ");
        result.append(length);
        result.append(')');
        return result.toString();
    }

} //CharacterStringTypeImpl
