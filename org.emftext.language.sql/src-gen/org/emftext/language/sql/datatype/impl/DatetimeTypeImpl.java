/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.ecore.EClass;
import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.DatetimeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datetime Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DatetimeTypeImpl extends PredefinedTypeImpl implements DatetimeType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatetimeTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.DATETIME_TYPE;
    }

} //DatetimeTypeImpl
