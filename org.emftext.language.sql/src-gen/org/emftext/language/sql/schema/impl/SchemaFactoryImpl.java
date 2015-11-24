/**
 */
package org.emftext.language.sql.schema.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.sql.schema.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaFactoryImpl extends EFactoryImpl implements SchemaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SchemaFactory init() {
        try {
            SchemaFactory theSchemaFactory = (SchemaFactory) EPackage.Registry.INSTANCE
                    .getEFactory(SchemaPackage.eNS_URI);
            if (theSchemaFactory != null) {
                return theSchemaFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SchemaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case SchemaPackage.TABLE_DEFINITION:
            return createTableDefinition();
        case SchemaPackage.TABLE_ELEMENT_LIST:
            return createTableElementList();
        case SchemaPackage.COLUMN:
            return createColumn();
        case SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT:
            return createNotNullColumnConstraint();
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT:
            return createUniqueColumnConstraint();
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT:
            return createReferentialColumnConstraint();
        case SchemaPackage.LITERAL_DEFAULT_OPTION:
            return createLiteralDefaultOption();
        case SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION:
            return createDatetimeValueFunctionDefaultOption();
        case SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION:
            return createImplicitlyTypedValueSpecificationDefaultOption();
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT:
            return createUniqueTableConstraint();
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT:
            return createReferentialTableConstraint();
        case SchemaPackage.TABLE_REFERENCE:
            return createTableReference();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case SchemaPackage.TABLE_SCOPE:
            return createTableScopeFromString(eDataType, initialValue);
        case SchemaPackage.UNIQUE_SPECIFICATION_KIND:
            return createUniqueSpecificationKindFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case SchemaPackage.TABLE_SCOPE:
            return convertTableScopeToString(eDataType, instanceValue);
        case SchemaPackage.UNIQUE_SPECIFICATION_KIND:
            return convertUniqueSpecificationKindToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableDefinition createTableDefinition() {
        TableDefinitionImpl tableDefinition = new TableDefinitionImpl();
        return tableDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableElementList createTableElementList() {
        TableElementListImpl tableElementList = new TableElementListImpl();
        return tableElementList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Column createColumn() {
        ColumnImpl column = new ColumnImpl();
        return column;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotNullColumnConstraint createNotNullColumnConstraint() {
        NotNullColumnConstraintImpl notNullColumnConstraint = new NotNullColumnConstraintImpl();
        return notNullColumnConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UniqueColumnConstraint createUniqueColumnConstraint() {
        UniqueColumnConstraintImpl uniqueColumnConstraint = new UniqueColumnConstraintImpl();
        return uniqueColumnConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferentialColumnConstraint createReferentialColumnConstraint() {
        ReferentialColumnConstraintImpl referentialColumnConstraint = new ReferentialColumnConstraintImpl();
        return referentialColumnConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralDefaultOption createLiteralDefaultOption() {
        LiteralDefaultOptionImpl literalDefaultOption = new LiteralDefaultOptionImpl();
        return literalDefaultOption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatetimeValueFunctionDefaultOption createDatetimeValueFunctionDefaultOption() {
        DatetimeValueFunctionDefaultOptionImpl datetimeValueFunctionDefaultOption = new DatetimeValueFunctionDefaultOptionImpl();
        return datetimeValueFunctionDefaultOption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplicitlyTypedValueSpecificationDefaultOption createImplicitlyTypedValueSpecificationDefaultOption() {
        ImplicitlyTypedValueSpecificationDefaultOptionImpl implicitlyTypedValueSpecificationDefaultOption = new ImplicitlyTypedValueSpecificationDefaultOptionImpl();
        return implicitlyTypedValueSpecificationDefaultOption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UniqueTableConstraint createUniqueTableConstraint() {
        UniqueTableConstraintImpl uniqueTableConstraint = new UniqueTableConstraintImpl();
        return uniqueTableConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferentialTableConstraint createReferentialTableConstraint() {
        ReferentialTableConstraintImpl referentialTableConstraint = new ReferentialTableConstraintImpl();
        return referentialTableConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableReference createTableReference() {
        TableReferenceImpl tableReference = new TableReferenceImpl();
        return tableReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableScope createTableScopeFromString(EDataType eDataType, String initialValue) {
        TableScope result = TableScope.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTableScopeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UniqueSpecificationKind createUniqueSpecificationKindFromString(EDataType eDataType, String initialValue) {
        UniqueSpecificationKind result = UniqueSpecificationKind.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUniqueSpecificationKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaPackage getSchemaPackage() {
        return (SchemaPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SchemaPackage getPackage() {
        return SchemaPackage.eINSTANCE;
    }

} //SchemaFactoryImpl
