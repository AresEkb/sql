/**
 */
package org.emftext.language.sql.literal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.emftext.language.sql.common.Separator;
import org.emftext.language.sql.literal.LiteralPackage;
import org.emftext.language.sql.literal.NationalCharacterStringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>National Character String Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl#getSeparators <em>Separators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NationalCharacterStringLiteralImpl extends GeneralLiteralImpl implements NationalCharacterStringLiteral {
    /**
     * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValues()
     * @generated
     * @ordered
     */
    protected EList<String> values;

    /**
     * The cached value of the '{@link #getSeparators() <em>Separators</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeparators()
     * @generated
     * @ordered
     */
    protected EList<Separator> separators;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NationalCharacterStringLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralPackage.Literals.NATIONAL_CHARACTER_STRING_LITERAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getValues() {
        if (values == null) {
            values = new EDataTypeUniqueEList<String>(String.class, this,
                    LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES);
        }
        return values;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Separator> getSeparators() {
        if (separators == null) {
            separators = new EObjectContainmentEList<Separator>(Separator.class, this,
                    LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS);
        }
        return separators;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS:
            return ((InternalEList<?>) getSeparators()).basicRemove(otherEnd, msgs);
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
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES:
            return getValues();
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS:
            return getSeparators();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES:
            getValues().clear();
            getValues().addAll((Collection<? extends String>) newValue);
            return;
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS:
            getSeparators().clear();
            getSeparators().addAll((Collection<? extends Separator>) newValue);
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
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES:
            getValues().clear();
            return;
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS:
            getSeparators().clear();
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
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES:
            return values != null && !values.isEmpty();
        case LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS:
            return separators != null && !separators.isEmpty();
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
        result.append(" (values: ");
        result.append(values);
        result.append(')');
        return result.toString();
    }

} //NationalCharacterStringLiteralImpl
