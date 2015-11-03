/**
 */
package org.emftext.language.sql.function;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.function.FunctionFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "function";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.emftext.org/language/sql/function";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "function";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FunctionPackage eINSTANCE = org.emftext.language.sql.function.impl.FunctionPackageImpl.init();

    /**
     * The meta object id for the '{@link org.emftext.language.sql.function.impl.DatetimeValueFunctionImpl <em>Datetime Value Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.function.impl.DatetimeValueFunctionImpl
     * @see org.emftext.language.sql.function.impl.FunctionPackageImpl#getDatetimeValueFunction()
     * @generated
     */
    int DATETIME_VALUE_FUNCTION = 0;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_VALUE_FUNCTION__KIND = 0;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_VALUE_FUNCTION__PRECISION = 1;

    /**
     * The number of structural features of the '<em>Datetime Value Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_VALUE_FUNCTION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Datetime Value Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_VALUE_FUNCTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.function.DatetimeValueFunctionKind <em>Datetime Value Function Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.function.DatetimeValueFunctionKind
     * @see org.emftext.language.sql.function.impl.FunctionPackageImpl#getDatetimeValueFunctionKind()
     * @generated
     */
    int DATETIME_VALUE_FUNCTION_KIND = 1;

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.function.DatetimeValueFunction <em>Datetime Value Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datetime Value Function</em>'.
     * @see org.emftext.language.sql.function.DatetimeValueFunction
     * @generated
     */
    EClass getDatetimeValueFunction();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.function.DatetimeValueFunction#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.sql.function.DatetimeValueFunction#getKind()
     * @see #getDatetimeValueFunction()
     * @generated
     */
    EAttribute getDatetimeValueFunction_Kind();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.function.DatetimeValueFunction#getPrecision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Precision</em>'.
     * @see org.emftext.language.sql.function.DatetimeValueFunction#getPrecision()
     * @see #getDatetimeValueFunction()
     * @generated
     */
    EAttribute getDatetimeValueFunction_Precision();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.function.DatetimeValueFunctionKind <em>Datetime Value Function Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Datetime Value Function Kind</em>'.
     * @see org.emftext.language.sql.function.DatetimeValueFunctionKind
     * @generated
     */
    EEnum getDatetimeValueFunctionKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    FunctionFactory getFunctionFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.function.impl.DatetimeValueFunctionImpl <em>Datetime Value Function</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.function.impl.DatetimeValueFunctionImpl
        	 * @see org.emftext.language.sql.function.impl.FunctionPackageImpl#getDatetimeValueFunction()
        	 * @generated
        	 */
        EClass DATETIME_VALUE_FUNCTION = eINSTANCE.getDatetimeValueFunction();

        /**
        	 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute DATETIME_VALUE_FUNCTION__KIND = eINSTANCE.getDatetimeValueFunction_Kind();

        /**
        	 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute DATETIME_VALUE_FUNCTION__PRECISION = eINSTANCE.getDatetimeValueFunction_Precision();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.function.DatetimeValueFunctionKind <em>Datetime Value Function Kind</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.function.DatetimeValueFunctionKind
        	 * @see org.emftext.language.sql.function.impl.FunctionPackageImpl#getDatetimeValueFunctionKind()
        	 * @generated
        	 */
        EEnum DATETIME_VALUE_FUNCTION_KIND = eINSTANCE.getDatetimeValueFunctionKind();

    }

} //FunctionPackage
