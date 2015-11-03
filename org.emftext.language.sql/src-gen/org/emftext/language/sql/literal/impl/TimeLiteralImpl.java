/**
 */
package org.emftext.language.sql.literal.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.literal.LiteralPackage;
import org.emftext.language.sql.literal.TimeLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TimeLiteralImpl extends DatetimeLiteralImpl implements TimeLiteral {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralPackage.Literals.TIME_LITERAL;
    }

} //TimeLiteralImpl
