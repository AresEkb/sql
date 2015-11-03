/**
 */
package org.emftext.language.sql.datatype.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.datatype.BooleanType;
import org.emftext.language.sql.datatype.DatatypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BooleanTypeImpl extends PredefinedTypeImpl implements BooleanType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BooleanTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypePackage.Literals.BOOLEAN_TYPE;
    }

} //BooleanTypeImpl
