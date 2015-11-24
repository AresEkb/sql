/**
 */
package org.emftext.language.sql.schema.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
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
import org.emftext.language.sql.schema.ReferentialTableConstraint;
import org.emftext.language.sql.schema.SchemaPackage;
import org.emftext.language.sql.schema.TableColumnsConstraint;
import org.emftext.language.sql.schema.TableConstraint;
import org.emftext.language.sql.schema.TableElement;
import org.emftext.language.sql.schema.TableElementList;
import org.emftext.language.sql.schema.TableReference;
import org.emftext.language.sql.schema.util.SchemaValidator;

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
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl#getSchemaQualifiedName <em>Schema Qualified Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ReferentialTableConstraintImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferentialTableConstraintImpl extends MinimalEObjectImpl.Container implements ReferentialTableConstraint {
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
                    SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE, oldReferencedTable,
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
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE, null,
                        msgs);
            if (newReferencedTable != null)
                msgs = ((InternalEObject) newReferencedTable).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE, null,
                        msgs);
            msgs = basicSetReferencedTable(newReferencedTable, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE, newReferencedTable,
                    newReferencedTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableElementList getOwner() {
        if (eContainerFeatureID() != SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER)
            return null;
        return (TableElementList) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwner(TableElementList newOwner, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newOwner, SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(TableElementList newOwner) {
        if (newOwner != eInternalContainer()
                || (eContainerFeatureID() != SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER && newOwner != null)) {
            if (EcoreUtil.isAncestor(this, newOwner))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOwner != null)
                msgs = ((InternalEObject) newOwner).eInverseAdd(this, SchemaPackage.TABLE_ELEMENT_LIST__ELEMENTS,
                        TableElementList.class, msgs);
            msgs = basicSetOwner(newOwner, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER,
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
                    SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME, oldSchemaQualifiedName,
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
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME,
                        null, msgs);
            if (newSchemaQualifiedName != null)
                msgs = ((InternalEObject) newSchemaQualifiedName).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME,
                        null, msgs);
            msgs = basicSetSchemaQualifiedName(newSchemaQualifiedName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME, newSchemaQualifiedName,
                    newSchemaQualifiedName));
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
     * The cached validation expression for the '{@link #columnsMustBeCompatible2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Columns Must Be Compatible2</em>}' invariant operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #columnsMustBeCompatible2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String COLUMNS_MUST_BE_COMPATIBLE2_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "columns->size() = referencedColumns->size()";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean columnsMustBeCompatible2(DiagnosticChain diagnostics, Map<Object, Object> context) {
        return SchemaValidator.validate(SchemaPackage.Literals.REFERENTIAL_TABLE_CONSTRAINT, this, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
                SchemaPackage.Literals.REFERENTIAL_TABLE_CONSTRAINT___COLUMNS_MUST_BE_COMPATIBLE2__DIAGNOSTICCHAIN_MAP,
                COLUMNS_MUST_BE_COMPATIBLE2_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
                SchemaValidator.DIAGNOSTIC_SOURCE,
                SchemaValidator.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS_MUST_BE_COMPATIBLE2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetOwner((TableElementList) otherEnd, msgs);
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
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE:
            return basicSetReferencedTable(null, msgs);
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER:
            return basicSetOwner(null, msgs);
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
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
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER:
            return eInternalContainer().eInverseRemove(this, SchemaPackage.TABLE_ELEMENT_LIST__ELEMENTS,
                    TableElementList.class, msgs);
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
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS:
            return getReferencedColumns();
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE:
            return getReferencedTable();
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER:
            return getOwner();
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
            return getSchemaQualifiedName();
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
            setReferencedTable((TableReference) newValue);
            return;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER:
            setOwner((TableElementList) newValue);
            return;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
            setSchemaQualifiedName((SchemaQualifiedName) newValue);
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
            setReferencedTable((TableReference) null);
            return;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER:
            setOwner((TableElementList) null);
            return;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
            setSchemaQualifiedName((SchemaQualifiedName) null);
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
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER:
            return getOwner() != null;
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
            return schemaQualifiedName != null;
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
        if (baseClass == TableElement.class) {
            switch (derivedFeatureID) {
            case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER:
                return SchemaPackage.TABLE_ELEMENT__OWNER;
            default:
                return -1;
            }
        }
        if (baseClass == EObject.class) {
            switch (derivedFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == TableConstraint.class) {
            switch (derivedFeatureID) {
            case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
                return SchemaPackage.TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME;
            default:
                return -1;
            }
        }
        if (baseClass == TableColumnsConstraint.class) {
            switch (derivedFeatureID) {
            case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS:
                return SchemaPackage.TABLE_COLUMNS_CONSTRAINT__COLUMNS;
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
        if (baseClass == TableElement.class) {
            switch (baseFeatureID) {
            case SchemaPackage.TABLE_ELEMENT__OWNER:
                return SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER;
            default:
                return -1;
            }
        }
        if (baseClass == EObject.class) {
            switch (baseFeatureID) {
            default:
                return -1;
            }
        }
        if (baseClass == TableConstraint.class) {
            switch (baseFeatureID) {
            case SchemaPackage.TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME:
                return SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME;
            default:
                return -1;
            }
        }
        if (baseClass == TableColumnsConstraint.class) {
            switch (baseFeatureID) {
            case SchemaPackage.TABLE_COLUMNS_CONSTRAINT__COLUMNS:
                return SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS;
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
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT___COLUMNS_MUST_BE_COMPATIBLE2__DIAGNOSTICCHAIN_MAP:
            return columnsMustBeCompatible2((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
    }

} //ReferentialTableConstraintImpl
