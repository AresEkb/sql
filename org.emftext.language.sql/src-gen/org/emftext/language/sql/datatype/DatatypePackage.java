/**
 */
package org.emftext.language.sql.datatype;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.datatype.DatatypeFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "datatype";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.emftext.org/language/sql/datatype";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "datatype";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DatatypePackage eINSTANCE = org.emftext.language.sql.datatype.impl.DatatypePackageImpl.init();

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.DataTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getDataType()
     * @generated
     */
    int DATA_TYPE = 0;

    /**
     * The number of structural features of the '<em>Data Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Data Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.PredefinedTypeImpl <em>Predefined Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.PredefinedTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getPredefinedType()
     * @generated
     */
    int PREDEFINED_TYPE = 1;

    /**
     * The number of structural features of the '<em>Predefined Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREDEFINED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Predefined Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREDEFINED_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl <em>Character String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getCharacterStringType()
     * @generated
     */
    int CHARACTER_STRING_TYPE = 2;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_TYPE__KIND = PREDEFINED_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Character Set Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_TYPE__CHARACTER_SET_NAME = PREDEFINED_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Collation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_TYPE__COLLATION_NAME = PREDEFINED_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_TYPE__LENGTH = PREDEFINED_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Character String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Character String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_TYPE_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.NationalCharacterStringTypeImpl <em>National Character String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.NationalCharacterStringTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getNationalCharacterStringType()
     * @generated
     */
    int NATIONAL_CHARACTER_STRING_TYPE = 3;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_TYPE__KIND = PREDEFINED_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_TYPE__LENGTH = PREDEFINED_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Collation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME = PREDEFINED_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>National Character String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>National Character String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_TYPE_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.BinaryLargeObjectStringTypeImpl <em>Binary Large Object String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.BinaryLargeObjectStringTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getBinaryLargeObjectStringType()
     * @generated
     */
    int BINARY_LARGE_OBJECT_STRING_TYPE = 4;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_LARGE_OBJECT_STRING_TYPE__KIND = PREDEFINED_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Length</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH = PREDEFINED_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Binary Large Object String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_LARGE_OBJECT_STRING_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Binary Large Object String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_LARGE_OBJECT_STRING_TYPE_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.NumericTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getNumericType()
     * @generated
     */
    int NUMERIC_TYPE = 5;

    /**
     * The number of structural features of the '<em>Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.BooleanTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getBooleanType()
     * @generated
     */
    int BOOLEAN_TYPE = 6;

    /**
     * The number of structural features of the '<em>Boolean Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Boolean Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.DatetimeTypeImpl <em>Datetime Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.DatetimeTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getDatetimeType()
     * @generated
     */
    int DATETIME_TYPE = 7;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_TYPE__KIND = PREDEFINED_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_TYPE__PRECISION = PREDEFINED_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>With Time Zone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_TYPE__WITH_TIME_ZONE = PREDEFINED_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Datetime Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_TYPE_FEATURE_COUNT = PREDEFINED_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Datetime Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_TYPE_OPERATION_COUNT = PREDEFINED_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.ExactNumericTypeImpl <em>Exact Numeric Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.ExactNumericTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getExactNumericType()
     * @generated
     */
    int EXACT_NUMERIC_TYPE = 8;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXACT_NUMERIC_TYPE__KIND = NUMERIC_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXACT_NUMERIC_TYPE__PRECISION = NUMERIC_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXACT_NUMERIC_TYPE__SCALE = NUMERIC_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Exact Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXACT_NUMERIC_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Exact Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXACT_NUMERIC_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.ApproximateNumericTypeImpl <em>Approximate Numeric Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.ApproximateNumericTypeImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getApproximateNumericType()
     * @generated
     */
    int APPROXIMATE_NUMERIC_TYPE = 9;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPROXIMATE_NUMERIC_TYPE__KIND = NUMERIC_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPROXIMATE_NUMERIC_TYPE__PRECISION = NUMERIC_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Approximate Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPROXIMATE_NUMERIC_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Approximate Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPROXIMATE_NUMERIC_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.impl.LargeObjectLengthImpl <em>Large Object Length</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.impl.LargeObjectLengthImpl
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getLargeObjectLength()
     * @generated
     */
    int LARGE_OBJECT_LENGTH = 10;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_OBJECT_LENGTH__VALUE = 0;

    /**
     * The feature id for the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_OBJECT_LENGTH__MULTIPLIER = 1;

    /**
     * The feature id for the '<em><b>Units</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_OBJECT_LENGTH__UNITS = 2;

    /**
     * The number of structural features of the '<em>Large Object Length</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_OBJECT_LENGTH_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Large Object Length</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LARGE_OBJECT_LENGTH_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.CharacterStringTypeKind <em>Character String Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.CharacterStringTypeKind
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getCharacterStringTypeKind()
     * @generated
     */
    int CHARACTER_STRING_TYPE_KIND = 11;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.NationalCharacterStringTypeKind <em>National Character String Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.NationalCharacterStringTypeKind
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getNationalCharacterStringTypeKind()
     * @generated
     */
    int NATIONAL_CHARACTER_STRING_TYPE_KIND = 12;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind <em>Binary Large Object String Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getBinaryLargeObjectStringTypeKind()
     * @generated
     */
    int BINARY_LARGE_OBJECT_STRING_TYPE_KIND = 13;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.ExactNumericTypeKind <em>Exact Numeric Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.ExactNumericTypeKind
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getExactNumericTypeKind()
     * @generated
     */
    int EXACT_NUMERIC_TYPE_KIND = 14;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.ApproximateNumericTypeKind <em>Approximate Numeric Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.ApproximateNumericTypeKind
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getApproximateNumericTypeKind()
     * @generated
     */
    int APPROXIMATE_NUMERIC_TYPE_KIND = 15;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.DatetimeTypeKind <em>Datetime Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.DatetimeTypeKind
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getDatetimeTypeKind()
     * @generated
     */
    int DATETIME_TYPE_KIND = 16;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.Multiplier <em>Multiplier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.Multiplier
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getMultiplier()
     * @generated
     */
    int MULTIPLIER = 17;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.datatype.CharLengthUnits <em>Char Length Units</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.datatype.CharLengthUnits
     * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getCharLengthUnits()
     * @generated
     */
    int CHAR_LENGTH_UNITS = 18;

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Type</em>'.
     * @see org.emftext.language.sql.datatype.DataType
     * @generated
     */
    EClass getDataType();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.PredefinedType <em>Predefined Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Predefined Type</em>'.
     * @see org.emftext.language.sql.datatype.PredefinedType
     * @generated
     */
    EClass getPredefinedType();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.CharacterStringType <em>Character String Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Character String Type</em>'.
     * @see org.emftext.language.sql.datatype.CharacterStringType
     * @generated
     */
    EClass getCharacterStringType();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.CharacterStringType#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.sql.datatype.CharacterStringType#getKind()
     * @see #getCharacterStringType()
     * @generated
     */
    EAttribute getCharacterStringType_Kind();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.CharacterStringType#getCharacterSetName <em>Character Set Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Character Set Name</em>'.
     * @see org.emftext.language.sql.datatype.CharacterStringType#getCharacterSetName()
     * @see #getCharacterStringType()
     * @generated
     */
    EAttribute getCharacterStringType_CharacterSetName();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.CharacterStringType#getCollationName <em>Collation Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Collation Name</em>'.
     * @see org.emftext.language.sql.datatype.CharacterStringType#getCollationName()
     * @see #getCharacterStringType()
     * @generated
     */
    EAttribute getCharacterStringType_CollationName();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.CharacterStringType#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see org.emftext.language.sql.datatype.CharacterStringType#getLength()
     * @see #getCharacterStringType()
     * @generated
     */
    EAttribute getCharacterStringType_Length();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.NationalCharacterStringType <em>National Character String Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>National Character String Type</em>'.
     * @see org.emftext.language.sql.datatype.NationalCharacterStringType
     * @generated
     */
    EClass getNationalCharacterStringType();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.NationalCharacterStringType#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.sql.datatype.NationalCharacterStringType#getKind()
     * @see #getNationalCharacterStringType()
     * @generated
     */
    EAttribute getNationalCharacterStringType_Kind();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.NationalCharacterStringType#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see org.emftext.language.sql.datatype.NationalCharacterStringType#getLength()
     * @see #getNationalCharacterStringType()
     * @generated
     */
    EAttribute getNationalCharacterStringType_Length();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.NationalCharacterStringType#getCollationName <em>Collation Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Collation Name</em>'.
     * @see org.emftext.language.sql.datatype.NationalCharacterStringType#getCollationName()
     * @see #getNationalCharacterStringType()
     * @generated
     */
    EAttribute getNationalCharacterStringType_CollationName();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringType <em>Binary Large Object String Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binary Large Object String Type</em>'.
     * @see org.emftext.language.sql.datatype.BinaryLargeObjectStringType
     * @generated
     */
    EClass getBinaryLargeObjectStringType();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringType#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.sql.datatype.BinaryLargeObjectStringType#getKind()
     * @see #getBinaryLargeObjectStringType()
     * @generated
     */
    EAttribute getBinaryLargeObjectStringType_Kind();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringType#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Length</em>'.
     * @see org.emftext.language.sql.datatype.BinaryLargeObjectStringType#getLength()
     * @see #getBinaryLargeObjectStringType()
     * @generated
     */
    EReference getBinaryLargeObjectStringType_Length();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.NumericType <em>Numeric Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric Type</em>'.
     * @see org.emftext.language.sql.datatype.NumericType
     * @generated
     */
    EClass getNumericType();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.BooleanType <em>Boolean Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Type</em>'.
     * @see org.emftext.language.sql.datatype.BooleanType
     * @generated
     */
    EClass getBooleanType();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.DatetimeType <em>Datetime Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datetime Type</em>'.
     * @see org.emftext.language.sql.datatype.DatetimeType
     * @generated
     */
    EClass getDatetimeType();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.DatetimeType#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.sql.datatype.DatetimeType#getKind()
     * @see #getDatetimeType()
     * @generated
     */
    EAttribute getDatetimeType_Kind();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.DatetimeType#getPrecision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Precision</em>'.
     * @see org.emftext.language.sql.datatype.DatetimeType#getPrecision()
     * @see #getDatetimeType()
     * @generated
     */
    EAttribute getDatetimeType_Precision();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.DatetimeType#getWithTimeZone <em>With Time Zone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>With Time Zone</em>'.
     * @see org.emftext.language.sql.datatype.DatetimeType#getWithTimeZone()
     * @see #getDatetimeType()
     * @generated
     */
    EAttribute getDatetimeType_WithTimeZone();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.ExactNumericType <em>Exact Numeric Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exact Numeric Type</em>'.
     * @see org.emftext.language.sql.datatype.ExactNumericType
     * @generated
     */
    EClass getExactNumericType();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.ExactNumericType#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.sql.datatype.ExactNumericType#getKind()
     * @see #getExactNumericType()
     * @generated
     */
    EAttribute getExactNumericType_Kind();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.ExactNumericType#getPrecision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Precision</em>'.
     * @see org.emftext.language.sql.datatype.ExactNumericType#getPrecision()
     * @see #getExactNumericType()
     * @generated
     */
    EAttribute getExactNumericType_Precision();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.ExactNumericType#getScale <em>Scale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scale</em>'.
     * @see org.emftext.language.sql.datatype.ExactNumericType#getScale()
     * @see #getExactNumericType()
     * @generated
     */
    EAttribute getExactNumericType_Scale();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.ApproximateNumericType <em>Approximate Numeric Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Approximate Numeric Type</em>'.
     * @see org.emftext.language.sql.datatype.ApproximateNumericType
     * @generated
     */
    EClass getApproximateNumericType();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.ApproximateNumericType#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.emftext.language.sql.datatype.ApproximateNumericType#getKind()
     * @see #getApproximateNumericType()
     * @generated
     */
    EAttribute getApproximateNumericType_Kind();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.ApproximateNumericType#getPrecision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Precision</em>'.
     * @see org.emftext.language.sql.datatype.ApproximateNumericType#getPrecision()
     * @see #getApproximateNumericType()
     * @generated
     */
    EAttribute getApproximateNumericType_Precision();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.datatype.LargeObjectLength <em>Large Object Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Large Object Length</em>'.
     * @see org.emftext.language.sql.datatype.LargeObjectLength
     * @generated
     */
    EClass getLargeObjectLength();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.LargeObjectLength#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.sql.datatype.LargeObjectLength#getValue()
     * @see #getLargeObjectLength()
     * @generated
     */
    EAttribute getLargeObjectLength_Value();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.LargeObjectLength#getMultiplier <em>Multiplier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiplier</em>'.
     * @see org.emftext.language.sql.datatype.LargeObjectLength#getMultiplier()
     * @see #getLargeObjectLength()
     * @generated
     */
    EAttribute getLargeObjectLength_Multiplier();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.datatype.LargeObjectLength#getUnits <em>Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Units</em>'.
     * @see org.emftext.language.sql.datatype.LargeObjectLength#getUnits()
     * @see #getLargeObjectLength()
     * @generated
     */
    EAttribute getLargeObjectLength_Units();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.datatype.CharacterStringTypeKind <em>Character String Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Character String Type Kind</em>'.
     * @see org.emftext.language.sql.datatype.CharacterStringTypeKind
     * @generated
     */
    EEnum getCharacterStringTypeKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.datatype.NationalCharacterStringTypeKind <em>National Character String Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>National Character String Type Kind</em>'.
     * @see org.emftext.language.sql.datatype.NationalCharacterStringTypeKind
     * @generated
     */
    EEnum getNationalCharacterStringTypeKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind <em>Binary Large Object String Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Binary Large Object String Type Kind</em>'.
     * @see org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind
     * @generated
     */
    EEnum getBinaryLargeObjectStringTypeKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.datatype.ExactNumericTypeKind <em>Exact Numeric Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Exact Numeric Type Kind</em>'.
     * @see org.emftext.language.sql.datatype.ExactNumericTypeKind
     * @generated
     */
    EEnum getExactNumericTypeKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.datatype.ApproximateNumericTypeKind <em>Approximate Numeric Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Approximate Numeric Type Kind</em>'.
     * @see org.emftext.language.sql.datatype.ApproximateNumericTypeKind
     * @generated
     */
    EEnum getApproximateNumericTypeKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.datatype.DatetimeTypeKind <em>Datetime Type Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Datetime Type Kind</em>'.
     * @see org.emftext.language.sql.datatype.DatetimeTypeKind
     * @generated
     */
    EEnum getDatetimeTypeKind();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.datatype.Multiplier <em>Multiplier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Multiplier</em>'.
     * @see org.emftext.language.sql.datatype.Multiplier
     * @generated
     */
    EEnum getMultiplier();

    /**
     * Returns the meta object for enum '{@link org.emftext.language.sql.datatype.CharLengthUnits <em>Char Length Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Char Length Units</em>'.
     * @see org.emftext.language.sql.datatype.CharLengthUnits
     * @generated
     */
    EEnum getCharLengthUnits();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DatatypeFactory getDatatypeFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.DataTypeImpl <em>Data Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.DataTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getDataType()
        	 * @generated
        	 */
        EClass DATA_TYPE = eINSTANCE.getDataType();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.PredefinedTypeImpl <em>Predefined Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.PredefinedTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getPredefinedType()
        	 * @generated
        	 */
        EClass PREDEFINED_TYPE = eINSTANCE.getPredefinedType();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl <em>Character String Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.CharacterStringTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getCharacterStringType()
        	 * @generated
        	 */
        EClass CHARACTER_STRING_TYPE = eINSTANCE.getCharacterStringType();

        /**
        	 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute CHARACTER_STRING_TYPE__KIND = eINSTANCE.getCharacterStringType_Kind();

        /**
        	 * The meta object literal for the '<em><b>Character Set Name</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute CHARACTER_STRING_TYPE__CHARACTER_SET_NAME = eINSTANCE.getCharacterStringType_CharacterSetName();

        /**
        	 * The meta object literal for the '<em><b>Collation Name</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute CHARACTER_STRING_TYPE__COLLATION_NAME = eINSTANCE.getCharacterStringType_CollationName();

        /**
        	 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute CHARACTER_STRING_TYPE__LENGTH = eINSTANCE.getCharacterStringType_Length();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.NationalCharacterStringTypeImpl <em>National Character String Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.NationalCharacterStringTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getNationalCharacterStringType()
        	 * @generated
        	 */
        EClass NATIONAL_CHARACTER_STRING_TYPE = eINSTANCE.getNationalCharacterStringType();

        /**
        	 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute NATIONAL_CHARACTER_STRING_TYPE__KIND = eINSTANCE.getNationalCharacterStringType_Kind();

        /**
        	 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute NATIONAL_CHARACTER_STRING_TYPE__LENGTH = eINSTANCE.getNationalCharacterStringType_Length();

        /**
        	 * The meta object literal for the '<em><b>Collation Name</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME = eINSTANCE
                .getNationalCharacterStringType_CollationName();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.BinaryLargeObjectStringTypeImpl <em>Binary Large Object String Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.BinaryLargeObjectStringTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getBinaryLargeObjectStringType()
        	 * @generated
        	 */
        EClass BINARY_LARGE_OBJECT_STRING_TYPE = eINSTANCE.getBinaryLargeObjectStringType();

        /**
        	 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute BINARY_LARGE_OBJECT_STRING_TYPE__KIND = eINSTANCE.getBinaryLargeObjectStringType_Kind();

        /**
        	 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH = eINSTANCE.getBinaryLargeObjectStringType_Length();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.NumericTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getNumericType()
        	 * @generated
        	 */
        EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.BooleanTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getBooleanType()
        	 * @generated
        	 */
        EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.DatetimeTypeImpl <em>Datetime Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.DatetimeTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getDatetimeType()
        	 * @generated
        	 */
        EClass DATETIME_TYPE = eINSTANCE.getDatetimeType();

        /**
        	 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute DATETIME_TYPE__KIND = eINSTANCE.getDatetimeType_Kind();

        /**
        	 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute DATETIME_TYPE__PRECISION = eINSTANCE.getDatetimeType_Precision();

        /**
        	 * The meta object literal for the '<em><b>With Time Zone</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute DATETIME_TYPE__WITH_TIME_ZONE = eINSTANCE.getDatetimeType_WithTimeZone();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.ExactNumericTypeImpl <em>Exact Numeric Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.ExactNumericTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getExactNumericType()
        	 * @generated
        	 */
        EClass EXACT_NUMERIC_TYPE = eINSTANCE.getExactNumericType();

        /**
        	 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute EXACT_NUMERIC_TYPE__KIND = eINSTANCE.getExactNumericType_Kind();

        /**
        	 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute EXACT_NUMERIC_TYPE__PRECISION = eINSTANCE.getExactNumericType_Precision();

        /**
        	 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute EXACT_NUMERIC_TYPE__SCALE = eINSTANCE.getExactNumericType_Scale();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.ApproximateNumericTypeImpl <em>Approximate Numeric Type</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.ApproximateNumericTypeImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getApproximateNumericType()
        	 * @generated
        	 */
        EClass APPROXIMATE_NUMERIC_TYPE = eINSTANCE.getApproximateNumericType();

        /**
        	 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute APPROXIMATE_NUMERIC_TYPE__KIND = eINSTANCE.getApproximateNumericType_Kind();

        /**
        	 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute APPROXIMATE_NUMERIC_TYPE__PRECISION = eINSTANCE.getApproximateNumericType_Precision();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.impl.LargeObjectLengthImpl <em>Large Object Length</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.impl.LargeObjectLengthImpl
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getLargeObjectLength()
        	 * @generated
        	 */
        EClass LARGE_OBJECT_LENGTH = eINSTANCE.getLargeObjectLength();

        /**
        	 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute LARGE_OBJECT_LENGTH__VALUE = eINSTANCE.getLargeObjectLength_Value();

        /**
        	 * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute LARGE_OBJECT_LENGTH__MULTIPLIER = eINSTANCE.getLargeObjectLength_Multiplier();

        /**
        	 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute LARGE_OBJECT_LENGTH__UNITS = eINSTANCE.getLargeObjectLength_Units();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.CharacterStringTypeKind <em>Character String Type Kind</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.CharacterStringTypeKind
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getCharacterStringTypeKind()
        	 * @generated
        	 */
        EEnum CHARACTER_STRING_TYPE_KIND = eINSTANCE.getCharacterStringTypeKind();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.NationalCharacterStringTypeKind <em>National Character String Type Kind</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.NationalCharacterStringTypeKind
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getNationalCharacterStringTypeKind()
        	 * @generated
        	 */
        EEnum NATIONAL_CHARACTER_STRING_TYPE_KIND = eINSTANCE.getNationalCharacterStringTypeKind();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind <em>Binary Large Object String Type Kind</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getBinaryLargeObjectStringTypeKind()
        	 * @generated
        	 */
        EEnum BINARY_LARGE_OBJECT_STRING_TYPE_KIND = eINSTANCE.getBinaryLargeObjectStringTypeKind();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.ExactNumericTypeKind <em>Exact Numeric Type Kind</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.ExactNumericTypeKind
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getExactNumericTypeKind()
        	 * @generated
        	 */
        EEnum EXACT_NUMERIC_TYPE_KIND = eINSTANCE.getExactNumericTypeKind();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.ApproximateNumericTypeKind <em>Approximate Numeric Type Kind</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.ApproximateNumericTypeKind
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getApproximateNumericTypeKind()
        	 * @generated
        	 */
        EEnum APPROXIMATE_NUMERIC_TYPE_KIND = eINSTANCE.getApproximateNumericTypeKind();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.DatetimeTypeKind <em>Datetime Type Kind</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.DatetimeTypeKind
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getDatetimeTypeKind()
        	 * @generated
        	 */
        EEnum DATETIME_TYPE_KIND = eINSTANCE.getDatetimeTypeKind();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.Multiplier <em>Multiplier</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.Multiplier
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getMultiplier()
        	 * @generated
        	 */
        EEnum MULTIPLIER = eINSTANCE.getMultiplier();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.datatype.CharLengthUnits <em>Char Length Units</em>}' enum.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.datatype.CharLengthUnits
        	 * @see org.emftext.language.sql.datatype.impl.DatatypePackageImpl#getCharLengthUnits()
        	 * @generated
        	 */
        EEnum CHAR_LENGTH_UNITS = eINSTANCE.getCharLengthUnits();

    }

} //DatatypePackage
