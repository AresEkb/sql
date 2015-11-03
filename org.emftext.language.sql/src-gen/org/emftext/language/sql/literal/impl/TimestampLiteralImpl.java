/**
 */
package org.emftext.language.sql.literal.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.sql.literal.LiteralPackage;
import org.emftext.language.sql.literal.TimestampLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TimestampLiteralImpl extends DatetimeLiteralImpl implements TimestampLiteral {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimestampLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LiteralPackage.Literals.TIMESTAMP_LITERAL;
    }

} //TimestampLiteralImpl
