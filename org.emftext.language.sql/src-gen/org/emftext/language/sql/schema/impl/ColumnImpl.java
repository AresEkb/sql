/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.sql.common.SchemaQualifiedName;

import org.emftext.language.sql.datatype.DataType;

import org.emftext.language.sql.schema.Column;
import org.emftext.language.sql.schema.ColumnConstraint;
import org.emftext.language.sql.schema.DefaultOption;
import org.emftext.language.sql.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.schema.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ColumnImpl#getDefaultOption <em>Default Option</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ColumnImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.emftext.language.sql.schema.impl.ColumnImpl#getCollationName <em>Collation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends TableElementImpl implements Column {
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
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected DataType dataType;

    /**
     * The cached value of the '{@link #getDefaultOption() <em>Default Option</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultOption()
     * @generated
     * @ordered
     */
    protected DefaultOption defaultOption;

    /**
     * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstraint()
     * @generated
     * @ordered
     */
    protected ColumnConstraint constraint;

    /**
     * The cached value of the '{@link #getCollationName() <em>Collation Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollationName()
     * @generated
     * @ordered
     */
    protected SchemaQualifiedName collationName;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ColumnImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.COLUMN;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.COLUMN__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataType(DataType newDataType, NotificationChain msgs) {
        DataType oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.COLUMN__DATA_TYPE, oldDataType, newDataType);
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
    public void setDataType(DataType newDataType) {
        if (newDataType != dataType) {
            NotificationChain msgs = null;
            if (dataType != null)
                msgs = ((InternalEObject) dataType).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.COLUMN__DATA_TYPE, null, msgs);
            if (newDataType != null)
                msgs = ((InternalEObject) newDataType).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.COLUMN__DATA_TYPE, null, msgs);
            msgs = basicSetDataType(newDataType, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.COLUMN__DATA_TYPE, newDataType,
                    newDataType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultOption getDefaultOption() {
        return defaultOption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultOption(DefaultOption newDefaultOption, NotificationChain msgs) {
        DefaultOption oldDefaultOption = defaultOption;
        defaultOption = newDefaultOption;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.COLUMN__DEFAULT_OPTION, oldDefaultOption, newDefaultOption);
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
    public void setDefaultOption(DefaultOption newDefaultOption) {
        if (newDefaultOption != defaultOption) {
            NotificationChain msgs = null;
            if (defaultOption != null)
                msgs = ((InternalEObject) defaultOption).eInverseRemove(this, SchemaPackage.DEFAULT_OPTION__OWNER,
                        DefaultOption.class, msgs);
            if (newDefaultOption != null)
                msgs = ((InternalEObject) newDefaultOption).eInverseAdd(this, SchemaPackage.DEFAULT_OPTION__OWNER,
                        DefaultOption.class, msgs);
            msgs = basicSetDefaultOption(newDefaultOption, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.COLUMN__DEFAULT_OPTION,
                    newDefaultOption, newDefaultOption));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnConstraint getConstraint() {
        return constraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConstraint(ColumnConstraint newConstraint, NotificationChain msgs) {
        ColumnConstraint oldConstraint = constraint;
        constraint = newConstraint;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.COLUMN__CONSTRAINT, oldConstraint, newConstraint);
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
    public void setConstraint(ColumnConstraint newConstraint) {
        if (newConstraint != constraint) {
            NotificationChain msgs = null;
            if (constraint != null)
                msgs = ((InternalEObject) constraint).eInverseRemove(this, SchemaPackage.COLUMN_CONSTRAINT__OWNER,
                        ColumnConstraint.class, msgs);
            if (newConstraint != null)
                msgs = ((InternalEObject) newConstraint).eInverseAdd(this, SchemaPackage.COLUMN_CONSTRAINT__OWNER,
                        ColumnConstraint.class, msgs);
            msgs = basicSetConstraint(newConstraint, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.COLUMN__CONSTRAINT, newConstraint,
                    newConstraint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaQualifiedName getCollationName() {
        return collationName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCollationName(SchemaQualifiedName newCollationName, NotificationChain msgs) {
        SchemaQualifiedName oldCollationName = collationName;
        collationName = newCollationName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SchemaPackage.COLUMN__COLLATION_NAME, oldCollationName, newCollationName);
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
    public void setCollationName(SchemaQualifiedName newCollationName) {
        if (newCollationName != collationName) {
            NotificationChain msgs = null;
            if (collationName != null)
                msgs = ((InternalEObject) collationName).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.COLUMN__COLLATION_NAME, null, msgs);
            if (newCollationName != null)
                msgs = ((InternalEObject) newCollationName).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.COLUMN__COLLATION_NAME, null, msgs);
            msgs = basicSetCollationName(newCollationName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.COLUMN__COLLATION_NAME,
                    newCollationName, newCollationName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SchemaPackage.COLUMN__DEFAULT_OPTION:
            if (defaultOption != null)
                msgs = ((InternalEObject) defaultOption).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.COLUMN__DEFAULT_OPTION, null, msgs);
            return basicSetDefaultOption((DefaultOption) otherEnd, msgs);
        case SchemaPackage.COLUMN__CONSTRAINT:
            if (constraint != null)
                msgs = ((InternalEObject) constraint).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SchemaPackage.COLUMN__CONSTRAINT, null, msgs);
            return basicSetConstraint((ColumnConstraint) otherEnd, msgs);
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
        case SchemaPackage.COLUMN__DATA_TYPE:
            return basicSetDataType(null, msgs);
        case SchemaPackage.COLUMN__DEFAULT_OPTION:
            return basicSetDefaultOption(null, msgs);
        case SchemaPackage.COLUMN__CONSTRAINT:
            return basicSetConstraint(null, msgs);
        case SchemaPackage.COLUMN__COLLATION_NAME:
            return basicSetCollationName(null, msgs);
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
        case SchemaPackage.COLUMN__NAME:
            return getName();
        case SchemaPackage.COLUMN__DATA_TYPE:
            return getDataType();
        case SchemaPackage.COLUMN__DEFAULT_OPTION:
            return getDefaultOption();
        case SchemaPackage.COLUMN__CONSTRAINT:
            return getConstraint();
        case SchemaPackage.COLUMN__COLLATION_NAME:
            return getCollationName();
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
        case SchemaPackage.COLUMN__NAME:
            setName((String) newValue);
            return;
        case SchemaPackage.COLUMN__DATA_TYPE:
            setDataType((DataType) newValue);
            return;
        case SchemaPackage.COLUMN__DEFAULT_OPTION:
            setDefaultOption((DefaultOption) newValue);
            return;
        case SchemaPackage.COLUMN__CONSTRAINT:
            setConstraint((ColumnConstraint) newValue);
            return;
        case SchemaPackage.COLUMN__COLLATION_NAME:
            setCollationName((SchemaQualifiedName) newValue);
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
        case SchemaPackage.COLUMN__NAME:
            setName(NAME_EDEFAULT);
            return;
        case SchemaPackage.COLUMN__DATA_TYPE:
            setDataType((DataType) null);
            return;
        case SchemaPackage.COLUMN__DEFAULT_OPTION:
            setDefaultOption((DefaultOption) null);
            return;
        case SchemaPackage.COLUMN__CONSTRAINT:
            setConstraint((ColumnConstraint) null);
            return;
        case SchemaPackage.COLUMN__COLLATION_NAME:
            setCollationName((SchemaQualifiedName) null);
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
        case SchemaPackage.COLUMN__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case SchemaPackage.COLUMN__DATA_TYPE:
            return dataType != null;
        case SchemaPackage.COLUMN__DEFAULT_OPTION:
            return defaultOption != null;
        case SchemaPackage.COLUMN__CONSTRAINT:
            return constraint != null;
        case SchemaPackage.COLUMN__COLLATION_NAME:
            return collationName != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ColumnImpl
