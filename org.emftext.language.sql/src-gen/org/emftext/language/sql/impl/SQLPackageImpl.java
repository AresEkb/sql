/**
 */
package org.emftext.language.sql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.sql.Dummy;
import org.emftext.language.sql.SQLFactory;
import org.emftext.language.sql.SQLPackage;

import org.emftext.language.sql.common.CommonPackage;

import org.emftext.language.sql.common.impl.CommonPackageImpl;

import org.emftext.language.sql.datatype.DatatypePackage;

import org.emftext.language.sql.datatype.impl.DatatypePackageImpl;

import org.emftext.language.sql.expression.ExpressionPackage;

import org.emftext.language.sql.expression.impl.ExpressionPackageImpl;

import org.emftext.language.sql.function.FunctionPackage;

import org.emftext.language.sql.function.impl.FunctionPackageImpl;

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
public class SQLPackageImpl extends EPackageImpl implements SQLPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dummyEClass = null;

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
     * @see org.emftext.language.sql.SQLPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SQLPackageImpl() {
        super(eNS_URI, SQLFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SQLPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SQLPackage init() {
        if (isInited)
            return (SQLPackage) EPackage.Registry.INSTANCE.getEPackage(SQLPackage.eNS_URI);

        // Obtain or create and register package
        SQLPackageImpl theSQLPackage = (SQLPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof SQLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new SQLPackageImpl());

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
        FunctionPackageImpl theFunctionPackage = (FunctionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(FunctionPackage.eNS_URI) instanceof FunctionPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI) : FunctionPackage.eINSTANCE);
        ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI)
                        : ExpressionPackage.eINSTANCE);
        SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(SchemaPackage.eNS_URI) instanceof SchemaPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) : SchemaPackage.eINSTANCE);

        // Create package meta-data objects
        theSQLPackage.createPackageContents();
        theCommonPackage.createPackageContents();
        theLiteralPackage.createPackageContents();
        theDatatypePackage.createPackageContents();
        theFunctionPackage.createPackageContents();
        theExpressionPackage.createPackageContents();
        theSchemaPackage.createPackageContents();

        // Initialize created meta-data
        theSQLPackage.initializePackageContents();
        theCommonPackage.initializePackageContents();
        theLiteralPackage.initializePackageContents();
        theDatatypePackage.initializePackageContents();
        theFunctionPackage.initializePackageContents();
        theExpressionPackage.initializePackageContents();
        theSchemaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSQLPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SQLPackage.eNS_URI, theSQLPackage);
        return theSQLPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDummy() {
        return dummyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SQLFactory getSQLFactory() {
        return (SQLFactory) getEFactoryInstance();
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
        dummyEClass = createEClass(DUMMY);
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
        LiteralPackage theLiteralPackage = (LiteralPackage) EPackage.Registry.INSTANCE
                .getEPackage(LiteralPackage.eNS_URI);
        DatatypePackage theDatatypePackage = (DatatypePackage) EPackage.Registry.INSTANCE
                .getEPackage(DatatypePackage.eNS_URI);
        FunctionPackage theFunctionPackage = (FunctionPackage) EPackage.Registry.INSTANCE
                .getEPackage(FunctionPackage.eNS_URI);
        ExpressionPackage theExpressionPackage = (ExpressionPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExpressionPackage.eNS_URI);
        SchemaPackage theSchemaPackage = (SchemaPackage) EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theCommonPackage);
        getESubpackages().add(theLiteralPackage);
        getESubpackages().add(theDatatypePackage);
        getESubpackages().add(theFunctionPackage);
        getESubpackages().add(theExpressionPackage);
        getESubpackages().add(theSchemaPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(dummyEClass, Dummy.class, "Dummy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/OCL/Import
        createImportAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createImportAnnotations() {
        String source = "http://www.eclipse.org/OCL/Import";
        addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
    }

} //SQLPackageImpl
