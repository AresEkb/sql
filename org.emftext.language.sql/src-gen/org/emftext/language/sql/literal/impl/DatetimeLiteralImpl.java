/**
 */
package org.emftext.language.sql.literal.impl;

import org.eclipse.emf.ecore.EClass;
import org.emftext.language.sql.literal.DatetimeLiteral;
import org.emftext.language.sql.literal.LiteralPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datetime Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DatetimeLiteralImpl extends GeneralLiteralImpl implements DatetimeLiteral {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatetimeLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralPackage.Literals.DATETIME_LITERAL;
    }

} //DatetimeLiteralImpl
