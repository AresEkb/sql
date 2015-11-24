/**
 */
package org.emftext.language.sql.schema;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.schema.SchemaPackage
 * @generated
 */
public interface SchemaFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SchemaFactory eINSTANCE = org.emftext.language.sql.schema.impl.SchemaFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Table Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Table Definition</em>'.
     * @generated
     */
    TableDefinition createTableDefinition();

    /**
     * Returns a new object of class '<em>Table Element List</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Table Element List</em>'.
     * @generated
     */
    TableElementList createTableElementList();

    /**
     * Returns a new object of class '<em>Column</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Column</em>'.
     * @generated
     */
    Column createColumn();

    /**
     * Returns a new object of class '<em>Not Null Column Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Not Null Column Constraint</em>'.
     * @generated
     */
    NotNullColumnConstraint createNotNullColumnConstraint();

    /**
     * Returns a new object of class '<em>Unique Column Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unique Column Constraint</em>'.
     * @generated
     */
    UniqueColumnConstraint createUniqueColumnConstraint();

    /**
     * Returns a new object of class '<em>Referential Column Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Referential Column Constraint</em>'.
     * @generated
     */
    ReferentialColumnConstraint createReferentialColumnConstraint();

    /**
     * Returns a new object of class '<em>Literal Default Option</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Default Option</em>'.
     * @generated
     */
    LiteralDefaultOption createLiteralDefaultOption();

    /**
     * Returns a new object of class '<em>Datetime Value Function Default Option</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Datetime Value Function Default Option</em>'.
     * @generated
     */
    DatetimeValueFunctionDefaultOption createDatetimeValueFunctionDefaultOption();

    /**
     * Returns a new object of class '<em>Implicitly Typed Value Specification Default Option</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Implicitly Typed Value Specification Default Option</em>'.
     * @generated
     */
    ImplicitlyTypedValueSpecificationDefaultOption createImplicitlyTypedValueSpecificationDefaultOption();

    /**
     * Returns a new object of class '<em>Unique Table Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unique Table Constraint</em>'.
     * @generated
     */
    UniqueTableConstraint createUniqueTableConstraint();

    /**
     * Returns a new object of class '<em>Referential Table Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Referential Table Constraint</em>'.
     * @generated
     */
    ReferentialTableConstraint createReferentialTableConstraint();

    /**
     * Returns a new object of class '<em>Table Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Table Reference</em>'.
     * @generated
     */
    TableReference createTableReference();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SchemaPackage getSchemaPackage();

} //SchemaFactory
