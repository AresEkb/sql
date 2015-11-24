/**
 */
package org.emftext.language.sql.schema.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.emftext.language.sql.schema.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.schema.SchemaPackage
 * @generated
 */
public class SchemaValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final SchemaValidator INSTANCE = new SchemaValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.emftext.language.sql.schema";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Columns Must Be Compatible2' of 'Referential Table Constraint'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int REFERENTIAL_TABLE_CONSTRAINT__COLUMNS_MUST_BE_COMPATIBLE2 = 1;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Delegates evaluation of the given invariant expression against the object in the given context.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics,
            Map<Object, Object> context, String validationDelegate, EOperation invariant, String expression,
            int severity, String source, int code) {
        return EObjectValidator.validate(eClass, eObject, diagnostics, context, validationDelegate, invariant,
                expression, severity, source, code);
    }

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return SchemaPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        switch (classifierID) {
        case SchemaPackage.TABLE_DEFINITION:
            return validateTableDefinition((TableDefinition) value, diagnostics, context);
        case SchemaPackage.TABLE_ELEMENT_LIST:
            return validateTableElementList((TableElementList) value, diagnostics, context);
        case SchemaPackage.TABLE_ELEMENT:
            return validateTableElement((TableElement) value, diagnostics, context);
        case SchemaPackage.COLUMN:
            return validateColumn((Column) value, diagnostics, context);
        case SchemaPackage.TABLE_CONSTRAINT:
            return validateTableConstraint((TableConstraint) value, diagnostics, context);
        case SchemaPackage.TABLE_CONTENTS_SOURCE:
            return validateTableContentsSource((TableContentsSource) value, diagnostics, context);
        case SchemaPackage.DEFAULT_OPTION:
            return validateDefaultOption((DefaultOption) value, diagnostics, context);
        case SchemaPackage.COLUMN_CONSTRAINT:
            return validateColumnConstraint((ColumnConstraint) value, diagnostics, context);
        case SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT:
            return validateNotNullColumnConstraint((NotNullColumnConstraint) value, diagnostics, context);
        case SchemaPackage.UNIQUE_COLUMN_CONSTRAINT:
            return validateUniqueColumnConstraint((UniqueColumnConstraint) value, diagnostics, context);
        case SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT:
            return validateReferentialColumnConstraint((ReferentialColumnConstraint) value, diagnostics, context);
        case SchemaPackage.SQL_SCHEMA_STATEMENT:
            return validateSQLSchemaStatement((SQLSchemaStatement) value, diagnostics, context);
        case SchemaPackage.SQL_SCHEMA_DEFINITION_STATEMENT:
            return validateSQLSchemaDefinitionStatement((SQLSchemaDefinitionStatement) value, diagnostics, context);
        case SchemaPackage.LITERAL_DEFAULT_OPTION:
            return validateLiteralDefaultOption((LiteralDefaultOption) value, diagnostics, context);
        case SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION:
            return validateDatetimeValueFunctionDefaultOption((DatetimeValueFunctionDefaultOption) value, diagnostics,
                    context);
        case SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION:
            return validateImplicitlyTypedValueSpecificationDefaultOption(
                    (ImplicitlyTypedValueSpecificationDefaultOption) value, diagnostics, context);
        case SchemaPackage.UNIQUE_TABLE_CONSTRAINT:
            return validateUniqueTableConstraint((UniqueTableConstraint) value, diagnostics, context);
        case SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT:
            return validateReferentialTableConstraint((ReferentialTableConstraint) value, diagnostics, context);
        case SchemaPackage.UNIQUE_CONSTRAINT:
            return validateUniqueConstraint((UniqueConstraint) value, diagnostics, context);
        case SchemaPackage.REFERENTIAL_CONSTRAINT:
            return validateReferentialConstraint((ReferentialConstraint) value, diagnostics, context);
        case SchemaPackage.TABLE_REFERENCE:
            return validateTableReference((TableReference) value, diagnostics, context);
        case SchemaPackage.TABLE_COLUMNS_CONSTRAINT:
            return validateTableColumnsConstraint((TableColumnsConstraint) value, diagnostics, context);
        case SchemaPackage.TABLE_SCOPE:
            return validateTableScope((TableScope) value, diagnostics, context);
        case SchemaPackage.UNIQUE_SPECIFICATION_KIND:
            return validateUniqueSpecificationKind((UniqueSpecificationKind) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTableDefinition(TableDefinition tableDefinition, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tableDefinition, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTableElementList(TableElementList tableElementList, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tableElementList, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTableElement(TableElement tableElement, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tableElement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(column, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTableConstraint(TableConstraint tableConstraint, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tableConstraint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTableContentsSource(TableContentsSource tableContentsSource, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tableContentsSource, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDefaultOption(DefaultOption defaultOption, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(defaultOption, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateColumnConstraint(ColumnConstraint columnConstraint, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(columnConstraint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateNotNullColumnConstraint(NotNullColumnConstraint notNullColumnConstraint,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(notNullColumnConstraint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUniqueColumnConstraint(UniqueColumnConstraint uniqueColumnConstraint,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(uniqueColumnConstraint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateReferentialColumnConstraint(ReferentialColumnConstraint referentialColumnConstraint,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(referentialColumnConstraint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSQLSchemaStatement(SQLSchemaStatement sqlSchemaStatement, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(sqlSchemaStatement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSQLSchemaDefinitionStatement(SQLSchemaDefinitionStatement sqlSchemaDefinitionStatement,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(sqlSchemaDefinitionStatement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLiteralDefaultOption(LiteralDefaultOption literalDefaultOption, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(literalDefaultOption, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDatetimeValueFunctionDefaultOption(
            DatetimeValueFunctionDefaultOption datetimeValueFunctionDefaultOption, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(datetimeValueFunctionDefaultOption, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateImplicitlyTypedValueSpecificationDefaultOption(
            ImplicitlyTypedValueSpecificationDefaultOption implicitlyTypedValueSpecificationDefaultOption,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(implicitlyTypedValueSpecificationDefaultOption, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUniqueTableConstraint(UniqueTableConstraint uniqueTableConstraint,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(uniqueTableConstraint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateReferentialTableConstraint(ReferentialTableConstraint referentialTableConstraint,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(referentialTableConstraint, diagnostics, context))
            return false;
        boolean result = validate_EveryMultiplicityConforms(referentialTableConstraint, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryDataValueConforms(referentialTableConstraint, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryReferenceIsContained(referentialTableConstraint, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryBidirectionalReferenceIsPaired(referentialTableConstraint, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryProxyResolves(referentialTableConstraint, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_UniqueID(referentialTableConstraint, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryKeyUnique(referentialTableConstraint, diagnostics, context);
        if (result || diagnostics != null)
            result &= validate_EveryMapEntryUnique(referentialTableConstraint, diagnostics, context);
        if (result || diagnostics != null)
            result &= validateReferentialTableConstraint_columnsMustBeCompatible(referentialTableConstraint,
                    diagnostics, context);
        if (result || diagnostics != null)
            result &= validateReferentialTableConstraint_columnsMustBeCompatible2(referentialTableConstraint,
                    diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the columnsMustBeCompatible constraint of '<em>Referential Table Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String REFERENTIAL_TABLE_CONSTRAINT__COLUMNS_MUST_BE_COMPATIBLE__EEXPRESSION = "columns->size() = referencedColumns->size()";

    /**
     * Validates the columnsMustBeCompatible constraint of '<em>Referential Table Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateReferentialTableConstraint_columnsMustBeCompatible(
            ReferentialTableConstraint referentialTableConstraint, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate(SchemaPackage.Literals.REFERENTIAL_TABLE_CONSTRAINT, referentialTableConstraint, diagnostics,
                context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "columnsMustBeCompatible",
                REFERENTIAL_TABLE_CONSTRAINT__COLUMNS_MUST_BE_COMPATIBLE__EEXPRESSION, Diagnostic.ERROR,
                DIAGNOSTIC_SOURCE, 0);
    }

    /**
     * Validates the columnsMustBeCompatible2 constraint of '<em>Referential Table Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateReferentialTableConstraint_columnsMustBeCompatible2(
            ReferentialTableConstraint referentialTableConstraint, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return referentialTableConstraint.columnsMustBeCompatible2(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUniqueConstraint(UniqueConstraint uniqueConstraint, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(uniqueConstraint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateReferentialConstraint(ReferentialConstraint referentialConstraint,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(referentialConstraint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTableReference(TableReference tableReference, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tableReference, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTableColumnsConstraint(TableColumnsConstraint tableColumnsConstraint,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(tableColumnsConstraint, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTableScope(TableScope tableScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateUniqueSpecificationKind(UniqueSpecificationKind uniqueSpecificationKind,
            DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //SchemaValidator
