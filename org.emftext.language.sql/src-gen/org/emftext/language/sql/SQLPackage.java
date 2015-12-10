/**
 */
package org.emftext.language.sql;

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
 * @see org.emftext.language.sql.SQLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface SQLPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "sql";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.emftext.org/language/sql";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "sql";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SQLPackage eINSTANCE = org.emftext.language.sql.impl.SQLPackageImpl.init();

    /**
     * The meta object id for the '{@link org.emftext.language.sql.impl.DummyImpl <em>Dummy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.impl.DummyImpl
     * @see org.emftext.language.sql.impl.SQLPackageImpl#getDummy()
     * @generated
     */
    int DUMMY = 0;

    /**
     * The number of structural features of the '<em>Dummy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DUMMY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Dummy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DUMMY_OPERATION_COUNT = 0;

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.Dummy <em>Dummy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dummy</em>'.
     * @see org.emftext.language.sql.Dummy
     * @generated
     */
    EClass getDummy();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SQLFactory getSQLFactory();

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
        	 * The meta object literal for the '{@link org.emftext.language.sql.impl.DummyImpl <em>Dummy</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.impl.DummyImpl
        	 * @see org.emftext.language.sql.impl.SQLPackageImpl#getDummy()
        	 * @generated
        	 */
        EClass DUMMY = eINSTANCE.getDummy();

    }

} //SQLPackage
