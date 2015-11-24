/**
 */
package org.emftext.language.sql.literal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.emftext.language.sql.common.SchemaQualifiedName;
import org.emftext.language.sql.literal.CharacterStringLiteral;
import org.emftext.language.sql.literal.LiteralPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character String Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.literal.impl.CharacterStringLiteralImpl#getCharacterSetName <em>Character Set Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterStringLiteralImpl extends NationalCharacterStringLiteralImpl implements CharacterStringLiteral {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CharacterStringLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralPackage.Literals.CHARACTER_STRING_LITERAL;
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
                    LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME, oldCharacterSetName,
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
                        EOPPOSITE_FEATURE_BASE - LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME, null,
                        msgs);
            if (newCharacterSetName != null)
                msgs = ((InternalEObject) newCharacterSetName).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME, null,
                        msgs);
            msgs = basicSetCharacterSetName(newCharacterSetName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME, newCharacterSetName,
                    newCharacterSetName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME:
            return basicSetCharacterSetName(null, msgs);
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
        case LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME:
            return getCharacterSetName();
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
        case LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME:
            setCharacterSetName((SchemaQualifiedName) newValue);
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
        case LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME:
            setCharacterSetName((SchemaQualifiedName) null);
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
        case LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME:
            return characterSetName != null;
        }
        return super.eIsSet(featureID);
    }

} //CharacterStringLiteralImpl
