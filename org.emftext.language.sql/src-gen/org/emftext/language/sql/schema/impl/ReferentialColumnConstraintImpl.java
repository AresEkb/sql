/**
 */
package org.emftext.language.sql.schema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.emftext.language.sql.common.SchemaQualifiedName;

import org.emftext.language.sql.schema.Column;
import org.emftext.language.sql.schema.ColumnConstraint;
import org.emftext.language.sql.schema.ReferentialColumnConstraint;
import org.emftext.language.sql.schema.SchemaPackage;
import org.emftext.language.sql.schema.TableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referential Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialColumnConstraintImpl#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialColumnConstraintImpl#getReferencedTable <em>Referenced Table</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialColumnConstraintImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialColumnConstraintImpl#getSchemaQualifiedName <em>Schema Qualified Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferentialColumnConstraintImpl extends MinimalEObjectImpl.Container
        implements ReferentialColumnConstraint {
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
     * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedTable()
     * @generated
     * @ordered
     */
    protected TableReference referencedTable;

    /**
     * The cached value of the '{@link #getSchemaQualifiedName() <em>Schema Qualified Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchemaQualifiedName()
     * @generated
     * @ordered
     */
    protected SchemaQualifiedName schemaQualifiedName;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferentialColumnConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.REFERENTIAL_COLUMN_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Column> getReferencedColumns() {
        if (referencedColumns == null) {
            referencedColumns = new EObjectResolvingEList<Column>(Column.class, this,
                    SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS);
        }
        return referencedColumns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableReference getReferencedTable() {
        return referencedTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReferencedTable(TableReference newReferencedTable, NotificationChain msgs) {
        TableReference oldReferencedTable = referencedTable;
        referencedTable = newReferencedTable;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE, oldReferencedTable,
                    newReferencedTable);
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
    public void setReferencedTable(TableReference newReferencedTable) {
        if (newReferencedTable != referencedTable) {
            NotificationChain msgs = null;
            if (referencedTable != null)
                msgs = ((InternalEObject) referencedTable).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE, null,
                        msgs);
            if (newReferencedTable != null)
                msgs = ((InternalEObject) newReferencedTable).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE, null,
                        msgs);
            msgs = basicSetReferencedTable(newReferencedTable, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE, newReferencedTable,
                    newReferencedTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Column getOwner() {
        if (eContainerFeatureID() != SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER)
            return null;
        return (Column) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwner(Column newOwner, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newOwner, SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(Column newOwner) {
        if (newOwner != eInternalContainer()
                || (eContainerFeatureID() != SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER && newOwner != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER,
                    newOwner, newOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaQualifiedName getSchemaQualifiedName() {
        return schemaQualifiedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSchemaQualifiedName(SchemaQualifiedName newSchemaQualifiedName,
            NotificationChain msgs) {
        SchemaQualifiedName oldSchemaQualifiedName = schemaQualifiedName;
        schemaQualifiedName = newSchemaQualifiedName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME, oldSchemaQualifiedName,
                    newSchemaQualifiedName);
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
    public void setSchemaQualifiedName(SchemaQualifiedName newSchemaQualifiedName) {
        if (newSchemaQualifiedName != schemaQualifiedName) {
            NotificationChain msgs = null;
            if (schemaQualifiedName != null)
                msgs = ((InternalEObject) schemaQualifiedName).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME,
                        null, msgs);
            if (newSchemaQualifiedName != null)
                msgs = ((InternalEObject) newSchemaQualifiedName).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME,
                        null, msgs);
            msgs = basicSetSchemaQualifiedName(newSchemaQualifiedName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME, newSchemaQualifiedName,
                    newSchemaQualifiedName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER:
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
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE:
            return basicSetReferencedTable(null, msgs);
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER:
            return basicSetOwner(null, msgs);
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
            return basicSetSchemaQualifiedName(null, msgs);
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
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER:
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
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS:
            return getReferencedColumns();
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE:
            return getReferencedTable();
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER:
            return getOwner();
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
            return getSchemaQualifiedName();
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
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS:
            getReferencedColumns().clear();
            getReferencedColumns().addAll((Collection<? extends Column>) newValue);
            return;
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE:
            setReferencedTable((TableReference) newValue);
            return;
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER:
            setOwner((Column) newValue);
            return;
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
            setSchemaQualifiedName((SchemaQualifiedName) newValue);
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
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS:
            getReferencedColumns().clear();
            return;
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE:
            setReferencedTable((TableReference) null);
            return;
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER:
            setOwner((Column) null);
            return;
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
            setSchemaQualifiedName((SchemaQualifiedName) null);
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
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS:
            return referencedColumns != null && !referencedColumns.isEmpty();
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE:
            return referencedTable != null;
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER:
            return getOwner() != null;
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
            return schemaQualifiedName != null;
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
        if (baseClass == EObject.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ColumnConstraint.class) {
            switch (derivedFeatureID) {
            case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER:
                return SchemaPackage.COLUMN_CONSTRAINT__OWNER;
            case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
                return SchemaPackage.COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME;
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
        if (baseClass == EObject.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == ColumnConstraint.class) {
            switch (baseFeatureID) {
            case SchemaPackage.COLUMN_CONSTRAINT__OWNER:
                return SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER;
            case SchemaPackage.COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
                return SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ReferentialColumnConstraintImpl
