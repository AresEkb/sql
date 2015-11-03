/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emftext.language.sql.datatype.DataType;
import org.emftext.language.sql.datatype.DatatypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.DATA_TYPE;
    }

} //DataTypeImpl
