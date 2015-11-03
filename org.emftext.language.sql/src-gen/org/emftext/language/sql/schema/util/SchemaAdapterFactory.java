/**
 */
package org.emftext.language.sql.schema.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.sql.common.DirectSQLStatement;

import org.emftext.language.sql.schema.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.schema.SchemaPackage
 * @generated
 */
public class SchemaAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SchemaPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SchemaPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchemaSwitch<Adapter> modelSwitch = new SchemaSwitch<Adapter>() {
        @Override
        public Adapter caseTableDefinition(TableDefinition object) {
            return createTableDefinitionAdapter();
        }

        @Override
        public Adapter caseTableElementList(TableElementList object) {
            return createTableElementListAdapter();
        }

        @Override
        public Adapter caseTableElement(TableElement object) {
            return createTableElementAdapter();
        }

        @Override
        public Adapter caseColumn(Column object) {
            return createColumnAdapter();
        }

        @Override
        public Adapter caseTableConstraint(TableConstraint object) {
            return createTableConstraintAdapter();
        }

        @Override
        public Adapter caseTableContentsSource(TableContentsSource object) {
            return createTableContentsSourceAdapter();
        }

        @Override
        public Adapter caseDefaultOption(DefaultOption object) {
            return createDefaultOptionAdapter();
        }

        @Override
        public Adapter caseColumnConstraint(ColumnConstraint object) {
            return createColumnConstraintAdapter();
        }

        @Override
        public Adapter caseNotNullColumnConstraint(NotNullColumnConstraint object) {
            return createNotNullColumnConstraintAdapter();
        }

        @Override
        public Adapter caseUniqueColumnConstraint(UniqueColumnConstraint object) {
            return createUniqueColumnConstraintAdapter();
        }

        @Override
        public Adapter caseReferentialColumnConstraint(ReferentialColumnConstraint object) {
            return createReferentialColumnConstraintAdapter();
        }

        @Override
        public Adapter caseSQLSchemaStatement(SQLSchemaStatement object) {
            return createSQLSchemaStatementAdapter();
        }

        @Override
        public Adapter caseSQLSchemaDefinitionStatement(SQLSchemaDefinitionStatement object) {
            return createSQLSchemaDefinitionStatementAdapter();
        }

        @Override
        public Adapter caseLiteralDefaultOption(LiteralDefaultOption object) {
            return createLiteralDefaultOptionAdapter();
        }

        @Override
        public Adapter caseDatetimeValueFunctionDefaultOption(DatetimeValueFunctionDefaultOption object) {
            return createDatetimeValueFunctionDefaultOptionAdapter();
        }

        @Override
        public Adapter caseImplicitlyTypedValueSpecificationDefaultOption(
                ImplicitlyTypedValueSpecificationDefaultOption object) {
            return createImplicitlyTypedValueSpecificationDefaultOptionAdapter();
        }

        @Override
        public Adapter caseUniqueTableConstraint(UniqueTableConstraint object) {
            return createUniqueTableConstraintAdapter();
        }

        @Override
        public Adapter caseReferentialTableConstraint(ReferentialTableConstraint object) {
            return createReferentialTableConstraintAdapter();
        }

        @Override
        public Adapter caseUniqueConstraint(UniqueConstraint object) {
            return createUniqueConstraintAdapter();
        }

        @Override
        public Adapter caseReferentialConstraint(ReferentialConstraint object) {
            return createReferentialConstraintAdapter();
        }

        @Override
        public Adapter caseDirectSQLStatement(DirectSQLStatement object) {
            return createDirectSQLStatementAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.TableDefinition <em>Table Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.TableDefinition
     * @generated
     */
    public Adapter createTableDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.TableElementList <em>Table Element List</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.TableElementList
     * @generated
     */
    public Adapter createTableElementListAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.TableElement <em>Table Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.TableElement
     * @generated
     */
    public Adapter createTableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.Column <em>Column</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.Column
     * @generated
     */
    public Adapter createColumnAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.TableConstraint <em>Table Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.TableConstraint
     * @generated
     */
    public Adapter createTableConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.TableContentsSource <em>Table Contents Source</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.TableContentsSource
     * @generated
     */
    public Adapter createTableContentsSourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.DefaultOption <em>Default Option</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.DefaultOption
     * @generated
     */
    public Adapter createDefaultOptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.ColumnConstraint <em>Column Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.ColumnConstraint
     * @generated
     */
    public Adapter createColumnConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.NotNullColumnConstraint <em>Not Null Column Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.NotNullColumnConstraint
     * @generated
     */
    public Adapter createNotNullColumnConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.UniqueColumnConstraint <em>Unique Column Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.UniqueColumnConstraint
     * @generated
     */
    public Adapter createUniqueColumnConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.ReferentialColumnConstraint <em>Referential Column Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.ReferentialColumnConstraint
     * @generated
     */
    public Adapter createReferentialColumnConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.SQLSchemaStatement <em>SQL Schema Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.SQLSchemaStatement
     * @generated
     */
    public Adapter createSQLSchemaStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.SQLSchemaDefinitionStatement <em>SQL Schema Definition Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.SQLSchemaDefinitionStatement
     * @generated
     */
    public Adapter createSQLSchemaDefinitionStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.LiteralDefaultOption <em>Literal Default Option</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.LiteralDefaultOption
     * @generated
     */
    public Adapter createLiteralDefaultOptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption <em>Datetime Value Function Default Option</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption
     * @generated
     */
    public Adapter createDatetimeValueFunctionDefaultOptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption <em>Implicitly Typed Value Specification Default Option</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption
     * @generated
     */
    public Adapter createImplicitlyTypedValueSpecificationDefaultOptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.UniqueTableConstraint <em>Unique Table Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.UniqueTableConstraint
     * @generated
     */
    public Adapter createUniqueTableConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.ReferentialTableConstraint <em>Referential Table Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.ReferentialTableConstraint
     * @generated
     */
    public Adapter createReferentialTableConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.UniqueConstraint <em>Unique Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.UniqueConstraint
     * @generated
     */
    public Adapter createUniqueConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.schema.ReferentialConstraint <em>Referential Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.schema.ReferentialConstraint
     * @generated
     */
    public Adapter createReferentialConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.emftext.language.sql.common.DirectSQLStatement <em>Direct SQL Statement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.emftext.language.sql.common.DirectSQLStatement
     * @generated
     */
    public Adapter createDirectSQLStatementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //SchemaAdapterFactory
