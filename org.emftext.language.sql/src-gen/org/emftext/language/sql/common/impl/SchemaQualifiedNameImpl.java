/**
 */
package org.emftext.language.sql.common.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emftext.language.sql.common.CommonPackage;
import org.emftext.language.sql.common.SchemaQualifiedName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.common.impl.SchemaQualifiedNameImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.common.impl.SchemaQualifiedNameImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.common.impl.SchemaQualifiedNameImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaQualifiedNameImpl extends MinimalEObjectImpl.Container implements SchemaQualifiedName {
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
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchemaQualifiedNameImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CommonPackage.Literals.SCHEMA_QUALIFIED_NAME;
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
            eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME,
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
            eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME,
                    oldSchemaName, schemaName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.SCHEMA_QUALIFIED_NAME__NAME, oldName,
                    name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME:
            return getCatalogName();
        case CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME:
            return getSchemaName();
        case CommonPackage.SCHEMA_QUALIFIED_NAME__NAME:
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
        case CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME:
            setCatalogName((String) newValue);
            return;
        case CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME:
            setSchemaName((String) newValue);
            return;
        case CommonPackage.SCHEMA_QUALIFIED_NAME__NAME:
            setName((String) newValue);
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
        case CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME:
            setCatalogName(CATALOG_NAME_EDEFAULT);
            return;
        case CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME:
            setSchemaName(SCHEMA_NAME_EDEFAULT);
            return;
        case CommonPackage.SCHEMA_QUALIFIED_NAME__NAME:
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
        case CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME:
            return CATALOG_NAME_EDEFAULT == null ? catalogName != null : !CATALOG_NAME_EDEFAULT.equals(catalogName);
        case CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME:
            return SCHEMA_NAME_EDEFAULT == null ? schemaName != null : !SCHEMA_NAME_EDEFAULT.equals(schemaName);
        case CommonPackage.SCHEMA_QUALIFIED_NAME__NAME:
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
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (catalogName: ");
        result.append(catalogName);
        result.append(", schemaName: ");
        result.append(schemaName);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //SchemaQualifiedNameImpl
