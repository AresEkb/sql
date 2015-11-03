/**
 */
package org.emftext.language.sql.common.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.sql.common.CommonPackage;
import org.emftext.language.sql.common.DirectSQLStatement;
import org.emftext.language.sql.common.SQLScript;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.sql.common.impl.SQLScriptImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SQLScriptImpl extends MinimalEObjectImpl.Container implements SQLScript {
    /**
     * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatements()
     * @generated
     * @ordered
     */
    protected EList<DirectSQLStatement> statements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SQLScriptImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CommonPackage.Literals.SQL_SCRIPT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DirectSQLStatement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<DirectSQLStatement>(DirectSQLStatement.class, this,
                    CommonPackage.SQL_SCRIPT__STATEMENTS);
        }
        return statements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CommonPackage.SQL_SCRIPT__STATEMENTS:
            return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
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
        case CommonPackage.SQL_SCRIPT__STATEMENTS:
            return getStatements();
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
        case CommonPackage.SQL_SCRIPT__STATEMENTS:
            getStatements().clear();
            getStatements().addAll((Collection<? extends DirectSQLStatement>) newValue);
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
        case CommonPackage.SQL_SCRIPT__STATEMENTS:
            getStatements().clear();
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
        case CommonPackage.SQL_SCRIPT__STATEMENTS:
            return statements != null && !statements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SQLScriptImpl
