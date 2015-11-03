/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.datatype.DatatypePackage;
import org.emftext.language.sql.datatype.PredefinedType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predefined Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PredefinedTypeImpl extends DataTypeImpl implements PredefinedType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PredefinedTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.PREDEFINED_TYPE;
    }

} //PredefinedTypeImpl
