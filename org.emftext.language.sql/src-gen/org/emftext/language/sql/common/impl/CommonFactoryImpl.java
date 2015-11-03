/**
 */
package org.emftext.language.sql.common.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.sql.Identifier;
import org.emftext.language.sql.SchemaQualifiedName;
import org.emftext.language.sql.UnsignedInteger;

import org.emftext.language.sql.common.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonFactoryImpl extends EFactoryImpl implements CommonFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CommonFactory init() {
        try {
            CommonFactory theCommonFactory = (CommonFactory) EPackage.Registry.INSTANCE
                    .getEFactory(CommonPackage.eNS_URI);
            if (theCommonFactory != null) {
                return theCommonFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CommonFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommonFactoryImpl() {
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
        case CommonPackage.SQL_SCRIPT:
            return createSQLScript();
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
        case CommonPackage.UNSIGNED_INTEGER:
            return createUnsignedIntegerFromString(eDataType, initialValue);
        case CommonPackage.IDENTIFIER:
            return createIdentifierFromString(eDataType, initialValue);
        case CommonPackage.SCHEMA_QUALIFIED_NAME:
            return createSchemaQualifiedNameFromString(eDataType, initialValue);
        case CommonPackage.LOCAL_OR_SCHEMA_QUALIFIED_NAME:
            return createLocalOrSchemaQualifiedNameFromString(eDataType, initialValue);
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
        case CommonPackage.UNSIGNED_INTEGER:
            return convertUnsignedIntegerToString(eDataType, instanceValue);
        case CommonPackage.IDENTIFIER:
            return convertIdentifierToString(eDataType, instanceValue);
        case CommonPackage.SCHEMA_QUALIFIED_NAME:
            return convertSchemaQualifiedNameToString(eDataType, instanceValue);
        case CommonPackage.LOCAL_OR_SCHEMA_QUALIFIED_NAME:
            return convertLocalOrSchemaQualifiedNameToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SQLScript createSQLScript() {
        SQLScriptImpl sqlScript = new SQLScriptImpl();
        return sqlScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnsignedInteger createUnsignedIntegerFromString(EDataType eDataType, String initialValue) {
        return (UnsignedInteger) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnsignedIntegerToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Identifier createIdentifierFromString(EDataType eDataType, String initialValue) {
        return (Identifier) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIdentifierToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaQualifiedName createSchemaQualifiedNameFromString(EDataType eDataType, String initialValue) {
        return (SchemaQualifiedName) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSchemaQualifiedNameToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaQualifiedName createLocalOrSchemaQualifiedNameFromString(EDataType eDataType, String initialValue) {
        return (SchemaQualifiedName) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLocalOrSchemaQualifiedNameToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommonPackage getCommonPackage() {
        return (CommonPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CommonPackage getPackage() {
        return CommonPackage.eINSTANCE;
    }

} //CommonFactoryImpl
