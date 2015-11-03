/**
 */
package org.emftext.language.sql.function.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.sql.common.CommonPackage;

import org.emftext.language.sql.common.impl.CommonPackageImpl;

import org.emftext.language.sql.datatype.DatatypePackage;

import org.emftext.language.sql.datatype.impl.DatatypePackageImpl;

import org.emftext.language.sql.expression.ExpressionPackage;

import org.emftext.language.sql.expression.impl.ExpressionPackageImpl;

import org.emftext.language.sql.function.DatetimeValueFunction;
import org.emftext.language.sql.function.DatetimeValueFunctionKind;
import org.emftext.language.sql.function.FunctionFactory;
import org.emftext.language.sql.function.FunctionPackage;

import org.emftext.language.sql.literal.LiteralPackage;

import org.emftext.language.sql.literal.impl.LiteralPackageImpl;

import org.emftext.language.sql.schema.SchemaPackage;

import org.emftext.language.sql.schema.impl.SchemaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionPackageImpl extends EPackageImpl implements FunctionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass datetimeValueFunctionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum datetimeValueFunctionKindEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.emftext.language.sql.function.FunctionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private FunctionPackageImpl() {
        super(eNS_URI, FunctionFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link FunctionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static FunctionPackage init() {
        if (isInited)
            return (FunctionPackage) EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);

        // Obtain or create and register package
        FunctionPackageImpl theFunctionPackage = (FunctionPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof FunctionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new FunctionPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        CommonPackageImpl theCommonPackage = (CommonPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
        LiteralPackageImpl theLiteralPackage = (LiteralPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(LiteralPackage.eNS_URI) instanceof LiteralPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(LiteralPackage.eNS_URI) : LiteralPackage.eINSTANCE);
        DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
        ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI)
                        : ExpressionPackage.eINSTANCE);
        SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(SchemaPackage.eNS_URI) instanceof SchemaPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) : SchemaPackage.eINSTANCE);

        // Create package meta-data objects
        theFunctionPackage.createPackageContents();
        theCommonPackage.createPackageContents();
        theLiteralPackage.createPackageContents();
        theDatatypePackage.createPackageContents();
        theExpressionPackage.createPackageContents();
        theSchemaPackage.createPackageContents();

        // Initialize created meta-data
        theFunctionPackage.initializePackageContents();
        theCommonPackage.initializePackageContents();
        theLiteralPackage.initializePackageContents();
        theDatatypePackage.initializePackageContents();
        theExpressionPackage.initializePackageContents();
        theSchemaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theFunctionPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(FunctionPackage.eNS_URI, theFunctionPackage);
        return theFunctionPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDatetimeValueFunction() {
        return datetimeValueFunctionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatetimeValueFunction_Kind() {
        return (EAttribute) datetimeValueFunctionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDatetimeValueFunction_Precision() {
        return (EAttribute) datetimeValueFunctionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDatetimeValueFunctionKind() {
        return datetimeValueFunctionKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionFactory getFunctionFactory() {
        return (FunctionFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        datetimeValueFunctionEClass = createEClass(DATETIME_VALUE_FUNCTION);
        createEAttribute(datetimeValueFunctionEClass, DATETIME_VALUE_FUNCTION__KIND);
        createEAttribute(datetimeValueFunctionEClass, DATETIME_VALUE_FUNCTION__PRECISION);

        // Create enums
        datetimeValueFunctionKindEEnum = createEEnum(DATETIME_VALUE_FUNCTION_KIND);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        CommonPackage theCommonPackage = (CommonPackage) EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(datetimeValueFunctionEClass, DatetimeValueFunction.class, "DatetimeValueFunction", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDatetimeValueFunction_Kind(), this.getDatetimeValueFunctionKind(), "kind", null, 1, 1,
                DatetimeValueFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDatetimeValueFunction_Precision(), theCommonPackage.getUnsignedInteger(), "precision", null,
                0, 1, DatetimeValueFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(datetimeValueFunctionKindEEnum, DatetimeValueFunctionKind.class, "DatetimeValueFunctionKind");
        addEEnumLiteral(datetimeValueFunctionKindEEnum, DatetimeValueFunctionKind.CURRENT_DATE);
        addEEnumLiteral(datetimeValueFunctionKindEEnum, DatetimeValueFunctionKind.CURRENT_TIME);
        addEEnumLiteral(datetimeValueFunctionKindEEnum, DatetimeValueFunctionKind.LOCALTIME);
        addEEnumLiteral(datetimeValueFunctionKindEEnum, DatetimeValueFunctionKind.CURRENT_TIMESTAMP);
        addEEnumLiteral(datetimeValueFunctionKindEEnum, DatetimeValueFunctionKind.LOCALTIMESTAMP);

        // Create resource
        createResource(eNS_URI);
    }

} //FunctionPackageImpl
