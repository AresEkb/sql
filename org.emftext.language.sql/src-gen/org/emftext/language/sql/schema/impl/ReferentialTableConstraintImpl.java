/**
 */
package org.emftext.language.sql.schema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftext.language.sql.schema.Column;
import org.emftext.language.sql.schema.ReferentialConstraint;
import org.emftext.language.sql.schema.ReferentialTableConstraint;
import org.emftext.language.sql.schema.SchemaPackage;
import org.emftext.language.sql.schema.TableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referential Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl#getReferencedTable <em>Referenced Table</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferentialTableConstraintImpl extends TableConstraintImpl implements ReferentialTableConstraint {
    /**
     * The cached value of the '{@link #getReferencedColumns() <em>Referenced Columns</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedColumns()
     * @generated
     * @ordered
     */
    protected EList<Column> referencedColumns;

    /**
     * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedTable()
     * @generated
     * @ordered
     */
    protected TableDefinition referencedTable;

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
    protected ReferentialTableConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.REFERENTIAL_TABLE_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Column> getReferencedColumns() {
        if (referencedColumns == null) {
            referencedColumns = new EObjectResolvingEList<Column>(Column.class, this,
                    SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS);
        }
        return referencedColumns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableDefinition getReferencedTable() {
        if (referencedTable != null && referencedTable.eIsProxy()) {
            InternalEObject oldReferencedTable = (InternalEObject) referencedTable;
            referencedTable = (TableDefinition) eResolveProxy(oldReferencedTable);
            if (referencedTable != oldReferencedTable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE, oldReferencedTable,
                            referencedTable));
            }
        }
        return referencedTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableDefinition basicGetReferencedTable() {
        return referencedTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedTable(TableDefinition newReferencedTable) {
        TableDefinition oldReferencedTable = referencedTable;
        referencedTable = newReferencedTable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE, oldReferencedTable, referencedTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Column> getColumns() {
        if (columns == null) {
            columns = new EObjectResolvingEList<Column>(Column.class, this,
                    SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS);
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
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS:
            return getReferencedColumns();
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE:
            if (resolve)
                return getReferencedTable();
            return basicGetReferencedTable();
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS:
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
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS:
            getReferencedColumns().clear();
            getReferencedColumns().addAll((Collection<? extends Column>) newValue);
            return;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE:
            setReferencedTable((TableDefinition) newValue);
            return;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS:
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
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS:
            getReferencedColumns().clear();
            return;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE:
            setReferencedTable((TableDefinition) null);
            return;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS:
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
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS:
            return referencedColumns != null && !referencedColumns.isEmpty();
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE:
            return referencedTable != null;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS:
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
        if (baseClass == ReferentialConstraint.class) {
            switch (derivedFeatureID) {
            case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS:
                return SchemaPackage.REFERENTIAL_CONSTRAINT__REFERENCED_COLUMNS;
            case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE:
                return SchemaPackage.REFERENTIAL_CONSTRAINT__REFERENCED_TABLE;
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
        if (baseClass == ReferentialConstraint.class) {
            switch (baseFeatureID) {
            case SchemaPackage.REFERENTIAL_CONSTRAINT__REFERENCED_COLUMNS:
                return SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS;
            case SchemaPackage.REFERENTIAL_CONSTRAINT__REFERENCED_TABLE:
                return SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ReferentialTableConstraintImpl
