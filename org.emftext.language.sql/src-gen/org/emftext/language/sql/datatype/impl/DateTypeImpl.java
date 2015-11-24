/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.DateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DateTypeImpl extends DatetimeTypeImpl implements DateType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DateTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.DATE_TYPE;
    }

} //DateTypeImpl
