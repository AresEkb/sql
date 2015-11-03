/**
 */
package org.emftext.language.sql.expression;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.emftext.language.sql.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "expression";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.emftext.org/language/sql/expression";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "expression";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ExpressionPackage eINSTANCE = org.emftext.language.sql.expression.impl.ExpressionPackageImpl.init();

    /**
     * The meta object id for the '{@link org.emftext.language.sql.expression.impl.ImplicitlyTypedValueSpecificationImpl <em>Implicitly Typed Value Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.expression.impl.ImplicitlyTypedValueSpecificationImpl
     * @see org.emftext.language.sql.expression.impl.ExpressionPackageImpl#getImplicitlyTypedValueSpecification()
     * @generated
     */
    int IMPLICITLY_TYPED_VALUE_SPECIFICATION = 0;

    /**
     * The number of structural features of the '<em>Implicitly Typed Value Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICITLY_TYPED_VALUE_SPECIFICATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Implicitly Typed Value Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMPLICITLY_TYPED_VALUE_SPECIFICATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.expression.impl.NullSpecificationImpl <em>Null Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.expression.impl.NullSpecificationImpl
     * @see org.emftext.language.sql.expression.impl.ExpressionPackageImpl#getNullSpecification()
     * @generated
     */
    int NULL_SPECIFICATION = 1;

    /**
     * The number of structural features of the '<em>Null Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_SPECIFICATION_FEATURE_COUNT = IMPLICITLY_TYPED_VALUE_SPECIFICATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Null Specification</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NULL_SPECIFICATION_OPERATION_COUNT = IMPLICITLY_TYPED_VALUE_SPECIFICATION_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification <em>Implicitly Typed Value Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Implicitly Typed Value Specification</em>'.
     * @see org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification
     * @generated
     */
    EClass getImplicitlyTypedValueSpecification();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.expression.NullSpecification <em>Null Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Null Specification</em>'.
     * @see org.emftext.language.sql.expression.NullSpecification
     * @generated
     */
    EClass getNullSpecification();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ExpressionFactory getExpressionFactory();

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
        	 * The meta object literal for the '{@link org.emftext.language.sql.expression.impl.ImplicitlyTypedValueSpecificationImpl <em>Implicitly Typed Value Specification</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.expression.impl.ImplicitlyTypedValueSpecificationImpl
        	 * @see org.emftext.language.sql.expression.impl.ExpressionPackageImpl#getImplicitlyTypedValueSpecification()
        	 * @generated
        	 */
        EClass IMPLICITLY_TYPED_VALUE_SPECIFICATION = eINSTANCE.getImplicitlyTypedValueSpecification();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.expression.impl.NullSpecificationImpl <em>Null Specification</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.expression.impl.NullSpecificationImpl
        	 * @see org.emftext.language.sql.expression.impl.ExpressionPackageImpl#getNullSpecification()
        	 * @generated
        	 */
        EClass NULL_SPECIFICATION = eINSTANCE.getNullSpecification();

    }

} //ExpressionPackage
