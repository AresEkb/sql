/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.NumericType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NumericTypeImpl extends PredefinedTypeImpl implements NumericType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NumericTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.NUMERIC_TYPE;
    }

} //NumericTypeImpl
