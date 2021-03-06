/**
 */
package org.emftext.language.sql.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.common.CommonPackage
 * @generated
 */
public interface CommonFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CommonFactory eINSTANCE = org.emftext.language.sql.common.impl.CommonFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SQL Script</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SQL Script</em>'.
     * @generated
     */
    SQLScript createSQLScript();

    /**
     * Returns a new object of class '<em>Simple Comment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Comment</em>'.
     * @generated
     */
    SimpleComment createSimpleComment();

    /**
     * Returns a new object of class '<em>Bracketed Comment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bracketed Comment</em>'.
     * @generated
     */
    BracketedComment createBracketedComment();

    /**
     * Returns a new object of class '<em>Schema Qualified Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Schema Qualified Name</em>'.
     * @generated
     */
    SchemaQualifiedName createSchemaQualifiedName();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CommonPackage getCommonPackage();

} //CommonFactory
