/**
 */
package org.emftext.language.sql.common.impl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
        case CommonPackage.SIMPLE_COMMENT:
            return createSimpleComment();
        case CommonPackage.BRACKETED_COMMENT:
            return createBracketedComment();
        case CommonPackage.SCHEMA_QUALIFIED_NAME:
            return createSchemaQualifiedName();
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
        case CommonPackage.DATE_TYPE:
            return createDateTypeFromString(eDataType, initialValue);
        case CommonPackage.TIME_TYPE:
            return createTimeTypeFromString(eDataType, initialValue);
        case CommonPackage.TIMESTAMP_TYPE:
            return createTimestampTypeFromString(eDataType, initialValue);
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
        case CommonPackage.DATE_TYPE:
            return convertDateTypeToString(eDataType, instanceValue);
        case CommonPackage.TIME_TYPE:
            return convertTimeTypeToString(eDataType, instanceValue);
        case CommonPackage.TIMESTAMP_TYPE:
            return convertTimestampTypeToString(eDataType, instanceValue);
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
    public SimpleComment createSimpleComment() {
        SimpleCommentImpl simpleComment = new SimpleCommentImpl();
        return simpleComment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BracketedComment createBracketedComment() {
        BracketedCommentImpl bracketedComment = new BracketedCommentImpl();
        return bracketedComment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaQualifiedName createSchemaQualifiedName() {
        SchemaQualifiedNameImpl schemaQualifiedName = new SchemaQualifiedNameImpl();
        return schemaQualifiedName;
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
    public LocalDate createDateTypeFromString(EDataType eDataType, String initialValue) {
        return (LocalDate) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDateTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalTime createTimeTypeFromString(EDataType eDataType, String initialValue) {
        return (LocalTime) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimeTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ZonedDateTime createTimestampTypeFromString(EDataType eDataType, String initialValue) {
        return (ZonedDateTime) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTimestampTypeToString(EDataType eDataType, Object instanceValue) {
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
