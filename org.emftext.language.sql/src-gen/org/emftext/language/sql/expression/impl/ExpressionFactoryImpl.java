/**
 */
package org.emftext.language.sql.expression.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.sql.expression.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ExpressionFactory init() {
        try {
            ExpressionFactory theExpressionFactory = (ExpressionFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ExpressionPackage.eNS_URI);
            if (theExpressionFactory != null) {
                return theExpressionFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ExpressionFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionFactoryImpl() {
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
        case ExpressionPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION:
            return createImplicitlyTypedValueSpecification();
        case ExpressionPackage.NULL_SPECIFICATION:
            return createNullSpecification();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplicitlyTypedValueSpecification createImplicitlyTypedValueSpecification() {
        ImplicitlyTypedValueSpecificationImpl implicitlyTypedValueSpecification = new ImplicitlyTypedValueSpecificationImpl();
        return implicitlyTypedValueSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NullSpecification createNullSpecification() {
        NullSpecificationImpl nullSpecification = new NullSpecificationImpl();
        return nullSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpressionPackage getExpressionPackage() {
        return (ExpressionPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ExpressionPackage getPackage() {
        return ExpressionPackage.eINSTANCE;
    }

} //ExpressionFactoryImpl
