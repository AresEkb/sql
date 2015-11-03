/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.emftext.language.sql.SchemaQualifiedName;

import org.emftext.language.sql.schema.Column;
import org.emftext.language.sql.schema.ColumnConstraint;
import org.emftext.language.sql.schema.SchemaPackage;
import org.emftext.language.sql.schema.UniqueColumnConstraint;
import org.emftext.language.sql.schema.UniqueSpecificationKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.UniqueColumnConstraintImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.UniqueColumnConstraintImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.UniqueColumnConstraintImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniqueColumnConstraintImpl extends MinimalEObjectImpl.Container implements UniqueColumnConstraint {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final UniqueSpecificationKind KIND_EDEFAULT = UniqueSpecificationKind.UNIQUE;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected UniqueSpecificationKind kind = KIND_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final SchemaQualifiedName NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected SchemaQualifiedName name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UniqueColumnConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.UNIQUE_COLUMN_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UniqueSpecificationKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(UniqueSpecificationKind newKind) {
        UniqueSpecificationKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND, oldKind,
                    kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Column getOwner() {
        if (eContainerFeatureID() != SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER)
            return null;
        return (Column) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwner(Column newOwner, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newOwner, SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(Column newOwner) {
        if (newOwner != eInternalContainer()
                || (eContainerFeatureID() != SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER && newOwner != null)) {
            if (EcoreUtil.isAncestor(this, newOwner))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwner != null)
                msgs = ((InternalEObject) newOwner).eInverseAdd(this, SchemaPackage.COLUMN__CONSTRAINT_DEFINITION,
                        Column.class, msgs);
            msgs = basicSetOwner(newOwner, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER,
                    newOwner, newOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaQualifiedName getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(SchemaQualifiedName newName) {
        SchemaQualifiedName oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME, oldName,
                    name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetOwner((Column) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER:
            return basicSetOwner(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER:
            return eInternalContainer().eInverseRemove(this, SchemaPackage.COLUMN__CONSTRAINT_DEFINITION, Column.class,
                    msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND:
            return getKind();
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER:
            return getOwner();
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME:
            return getName();
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
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND:
            setKind((UniqueSpecificationKind) newValue);
            return;
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER:
            setOwner((Column) newValue);
            return;
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME:
            setName((SchemaQualifiedName) newValue);
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
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER:
            setOwner((Column) null);
            return;
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME:
            setName(NAME_EDEFAULT);
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
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND:
            return kind != KIND_EDEFAULT;
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER:
            return getOwner() != null;
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == ColumnConstraint.class) {
            switch (derivedFeatureID) {
            case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER:
                return SchemaPackage.COLUMN_CONSTRAINT__OWNER;
            case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME:
                return SchemaPackage.COLUMN_CONSTRAINT__NAME;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == ColumnConstraint.class) {
            switch (baseFeatureID) {
            case SchemaPackage.COLUMN_CONSTRAINT__OWNER:
                return SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER;
            case SchemaPackage.COLUMN_CONSTRAINT__NAME:
                return SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //UniqueColumnConstraintImpl
