/**
 */
package org.emftext.language.sql.literal.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.literal.DateLiteral;
import org.emftext.language.sql.literal.LiteralPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DateLiteralImpl extends DatetimeLiteralImpl implements DateLiteral {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DateLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralPackage.Literals.DATE_LITERAL;
    }

} //DateLiteralImpl
