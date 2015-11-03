/**
 */
package org.emftext.language.sql.schema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftext.language.sql.schema.Column;
import org.emftext.language.sql.schema.SchemaPackage;
import org.emftext.language.sql.schema.UniqueConstraint;
import org.emftext.language.sql.schema.UniqueSpecificationKind;
import org.emftext.language.sql.schema.UniqueTableConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.UniqueTableConstraintImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.UniqueTableConstraintImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniqueTableConstraintImpl extends TableConstraintImpl implements UniqueTableConstraint {
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
     * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumns()
     * @generated
     * @ordered
     */
    protected EList<Column> columns;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UniqueTableConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.UNIQUE_TABLE_CONSTRAINT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND, oldKind,
                    kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Column> getColumns() {
        if (columns == null) {
            columns = new EObjectResolvingEList<Column>(Column.class, this,
                    SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS);
        }
        return columns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND:
            return getKind();
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS:
            return getColumns();
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
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND:
            setKind((UniqueSpecificationKind) newValue);
            return;
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS:
            getColumns().clear();
            getColumns().addAll((Collection<? extends Column>) newValue);
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
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS:
            getColumns().clear();
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
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND:
            return kind != KIND_EDEFAULT;
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS:
            return columns != null && !columns.isEmpty();
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
        if (baseClass == UniqueConstraint.class) {
            switch (derivedFeatureID) {
            case SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND:
                return SchemaPackage.UNIQUE_CONSTRAINT__KIND;
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
        if (baseClass == UniqueConstraint.class) {
            switch (baseFeatureID) {
            case SchemaPackage.UNIQUE_CONSTRAINT__KIND:
                return SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND;
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
        result.append(')');
        return result.toString();
    }

} //UniqueTableConstraintImpl
