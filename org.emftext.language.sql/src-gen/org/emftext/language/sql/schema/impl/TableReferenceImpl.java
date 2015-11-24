/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emftext.language.sql.schema.SchemaPackage;
import org.emftext.language.sql.schema.TableDefinition;
import org.emftext.language.sql.schema.TableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.TableReferenceImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.TableReferenceImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.TableReferenceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableReferenceImpl extends MinimalEObjectImpl.Container implements TableReference {
    /**
     * The default value of the '{@link #getCatalogName() <em>Catalog Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCatalogName()
     * @generated
     * @ordered
     */
    protected static final String CATALOG_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCatalogName() <em>Catalog Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCatalogName()
     * @generated
     * @ordered
     */
    protected String catalogName = CATALOG_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchemaName()
     * @generated
     * @ordered
     */
    protected static final String SCHEMA_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchemaName()
     * @generated
     * @ordered
     */
    protected String schemaName = SCHEMA_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected TableDefinition target;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TableReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.TABLE_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCatalogName(String newCatalogName) {
        String oldCatalogName = catalogName;
        catalogName = newCatalogName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TABLE_REFERENCE__CATALOG_NAME,
                    oldCatalogName, catalogName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchemaName(String newSchemaName) {
        String oldSchemaName = schemaName;
        schemaName = newSchemaName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME,
                    oldSchemaName, schemaName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableDefinition getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject) target;
            target = (TableDefinition) eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchemaPackage.TABLE_REFERENCE__TARGET,
                            oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableDefinition basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(TableDefinition newTarget) {
        TableDefinition oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TABLE_REFERENCE__TARGET, oldTarget,
                    target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SchemaPackage.TABLE_REFERENCE__CATALOG_NAME:
            return getCatalogName();
        case SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME:
            return getSchemaName();
        case SchemaPackage.TABLE_REFERENCE__TARGET:
            if (resolve)
                return getTarget();
            return basicGetTarget();
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
        case SchemaPackage.TABLE_REFERENCE__CATALOG_NAME:
            setCatalogName((String) newValue);
            return;
        case SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME:
            setSchemaName((String) newValue);
            return;
        case SchemaPackage.TABLE_REFERENCE__TARGET:
            setTarget((TableDefinition) newValue);
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
        case SchemaPackage.TABLE_REFERENCE__CATALOG_NAME:
            setCatalogName(CATALOG_NAME_EDEFAULT);
            return;
        case SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME:
            setSchemaName(SCHEMA_NAME_EDEFAULT);
            return;
        case SchemaPackage.TABLE_REFERENCE__TARGET:
            setTarget((TableDefinition) null);
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
        case SchemaPackage.TABLE_REFERENCE__CATALOG_NAME:
            return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
        case SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME:
            return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
        case SchemaPackage.TABLE_REFERENCE__TARGET:
            return target != null;
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
        result.append(" (catalogName: ");
        result.append(catalogName);
        result.append(", schemaName: ");
        result.append(schemaName);
        result.append(')');
        return result.toString();
    }

} //TableReferenceImpl
