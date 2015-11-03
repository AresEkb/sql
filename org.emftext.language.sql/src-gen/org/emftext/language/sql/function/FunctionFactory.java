/**
 */
package org.emftext.language.sql.function;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.function.FunctionPackage
 * @generated
 */
public interface FunctionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FunctionFactory eINSTANCE = org.emftext.language.sql.function.impl.FunctionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Datetime Value Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Datetime Value Function</em>'.
     * @generated
     */
    DatetimeValueFunction createDatetimeValueFunction();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    FunctionPackage getFunctionPackage();

} //FunctionFactory
