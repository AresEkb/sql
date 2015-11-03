/**
 */
package org.emftext.language.sql.expression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.expression.ExpressionPackage
 * @generated
 */
public interface ExpressionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ExpressionFactory eINSTANCE = org.emftext.language.sql.expression.impl.ExpressionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Implicitly Typed Value Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Implicitly Typed Value Specification</em>'.
     * @generated
     */
    ImplicitlyTypedValueSpecification createImplicitlyTypedValueSpecification();

    /**
     * Returns a new object of class '<em>Null Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Null Specification</em>'.
     * @generated
     */
    NullSpecification createNullSpecification();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ExpressionPackage getExpressionPackage();

} //ExpressionFactory
