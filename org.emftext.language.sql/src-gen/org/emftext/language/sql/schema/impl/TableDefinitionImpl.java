/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.common.SchemaQualifiedName;

import org.emftext.language.sql.schema.SchemaPackage;
import org.emftext.language.sql.schema.TableContentsSource;
import org.emftext.language.sql.schema.TableDefinition;
import org.emftext.language.sql.schema.TableScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.TableDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.TableDefinitionImpl#getSchemaQualifiedName <em>Schema Qualified Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.TableDefinitionImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.TableDefinitionImpl#getContentsSource <em>Contents Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableDefinitionImpl extends SQLSchemaDefinitionStatementImpl implements TableDefinition {
    /**
     * The cached setting delegate for the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected EStructuralFeature.Internal.SettingDelegate LABEL__ESETTING_DELEGATE = ((EStructuralFeature.Internal) SchemaPackage.Literals.TABLE_DEFINITION__LABEL)
            .getSettingDelegate();

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
     * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected static final TableScope SCOPE_EDEFAULT = TableScope.PERSISTENT;

    /**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected TableScope scope = SCOPE_EDEFAULT;

    /**
     * This is true if the Scope attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scopeESet;

    /**
     * The cached value of the '{@link #getContentsSource() <em>Contents Source</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContentsSource()
     * @generated
     * @ordered
     */
    protected TableContentsSource contentsSource;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TableDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.TABLE_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableContentsSource getContentsSource() {
        return contentsSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContentsSource(TableContentsSource newContentsSource, NotificationChain msgs) {
        TableContentsSource oldContentsSource = contentsSource;
        contentsSource = newContentsSource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE, oldContentsSource, newContentsSource);
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
    public void setContentsSource(TableContentsSource newContentsSource) {
        if (newContentsSource != contentsSource) {
            NotificationChain msgs = null;
            if (contentsSource != null)
                msgs = ((InternalEObject) contentsSource).eInverseRemove(this,
                        SchemaPackage.TABLE_CONTENTS_SOURCE__OWNER, TableContentsSource.class, msgs);
            if (newContentsSource != null)
                msgs = ((InternalEObject) newContentsSource).eInverseAdd(this,
                        SchemaPackage.TABLE_CONTENTS_SOURCE__OWNER, TableContentsSource.class, msgs);
            msgs = basicSetContentsSource(newContentsSource, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE,
                    newContentsSource, newContentsSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableScope getScope() {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScope(TableScope newScope) {
        TableScope oldScope = scope;
        scope = newScope == null ? SCOPE_EDEFAULT : newScope;
        boolean oldScopeESet = scopeESet;
        scopeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TABLE_DEFINITION__SCOPE, oldScope,
                    scope, !oldScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetScope() {
        TableScope oldScope = scope;
        boolean oldScopeESet = scopeESet;
        scope = SCOPE_EDEFAULT;
        scopeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TABLE_DEFINITION__SCOPE, oldScope,
                    SCOPE_EDEFAULT, oldScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetScope() {
        return scopeESet;
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
                    SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME, oldSchemaQualifiedName,
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
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME, null, msgs);
            if (newSchemaQualifiedName != null)
                msgs = ((InternalEObject) newSchemaQualifiedName).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME, null, msgs);
            msgs = basicSetSchemaQualifiedName(newSchemaQualifiedName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME,
                    newSchemaQualifiedName, newSchemaQualifiedName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return (String) LABEL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        LABEL__ESETTING_DELEGATE.dynamicSet(this, null, 0, newLabel);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE:
            if (contentsSource != null)
                msgs = ((InternalEObject) contentsSource).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE, null, msgs);
            return basicSetContentsSource((TableContentsSource) otherEnd, msgs);
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
        case SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME:
            return basicSetSchemaQualifiedName(null, msgs);
        case SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE:
            return basicSetContentsSource(null, msgs);
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
        case SchemaPackage.TABLE_DEFINITION__LABEL:
            return getLabel();
        case SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME:
            return getSchemaQualifiedName();
        case SchemaPackage.TABLE_DEFINITION__SCOPE:
            return getScope();
        case SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE:
            return getContentsSource();
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
        case SchemaPackage.TABLE_DEFINITION__LABEL:
            setLabel((String) newValue);
            return;
        case SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME:
            setSchemaQualifiedName((SchemaQualifiedName) newValue);
            return;
        case SchemaPackage.TABLE_DEFINITION__SCOPE:
            setScope((TableScope) newValue);
            return;
        case SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE:
            setContentsSource((TableContentsSource) newValue);
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
        case SchemaPackage.TABLE_DEFINITION__LABEL:
            LABEL__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
            return;
        case SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME:
            setSchemaQualifiedName((SchemaQualifiedName) null);
            return;
        case SchemaPackage.TABLE_DEFINITION__SCOPE:
            unsetScope();
            return;
        case SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE:
            setContentsSource((TableContentsSource) null);
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
        case SchemaPackage.TABLE_DEFINITION__LABEL:
            return LABEL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
        case SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME:
            return schemaQualifiedName != null;
        case SchemaPackage.TABLE_DEFINITION__SCOPE:
            return isSetScope();
        case SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE:
            return contentsSource != null;
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
        result.append(" (scope: ");
        if (scopeESet)
            result.append(scope);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TableDefinitionImpl
