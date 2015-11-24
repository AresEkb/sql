/**
 */
package org.emftext.language.sql.literal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.emftext.language.sql.literal.LiteralFactory
 * @model kind="package"
 * @generated
 */
public interface LiteralPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "literal";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.emftext.org/language/sql/literal";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "literal";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    LiteralPackage eINSTANCE = org.emftext.language.sql.literal.impl.LiteralPackageImpl.init();

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.LiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getLiteral()
     * @generated
     */
    int LITERAL = 0;

    /**
     * The number of structural features of the '<em>Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.GeneralLiteralImpl <em>General Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.GeneralLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getGeneralLiteral()
     * @generated
     */
    int GENERAL_LITERAL = 1;

    /**
     * The number of structural features of the '<em>General Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>General Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.CharacterStringLiteralImpl <em>Character String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.CharacterStringLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getCharacterStringLiteral()
     * @generated
     */
    int CHARACTER_STRING_LITERAL = 2;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl <em>National Character String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getNationalCharacterStringLiteral()
     * @generated
     */
    int NATIONAL_CHARACTER_STRING_LITERAL = 3;

    /**
     * The feature id for the '<em><b>Values</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_LITERAL__VALUES = GENERAL_LITERAL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Separators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS = GENERAL_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>National Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>National Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Values</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_LITERAL__VALUES = NATIONAL_CHARACTER_STRING_LITERAL__VALUES;

    /**
     * The feature id for the '<em><b>Separators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_LITERAL__SEPARATORS = NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS;

    /**
     * The feature id for the '<em><b>Character Set Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME = NATIONAL_CHARACTER_STRING_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_LITERAL_FEATURE_COUNT = NATIONAL_CHARACTER_STRING_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_LITERAL_OPERATION_COUNT = NATIONAL_CHARACTER_STRING_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.DatetimeLiteralImpl <em>Datetime Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.DatetimeLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getDatetimeLiteral()
     * @generated
     */
    int DATETIME_LITERAL = 4;

    /**
     * The number of structural features of the '<em>Datetime Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Datetime Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.BooleanLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getBooleanLiteral()
     * @generated
     */
    int BOOLEAN_LITERAL = 5;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL__VALUE = GENERAL_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Boolean Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Boolean Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.DateLiteralImpl <em>Date Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.DateLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getDateLiteral()
     * @generated
     */
    int DATE_LITERAL = 6;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_LITERAL__VALUE = DATETIME_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Date Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_LITERAL_FEATURE_COUNT = DATETIME_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Date Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_LITERAL_OPERATION_COUNT = DATETIME_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.TimeLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getTimeLiteral()
     * @generated
     */
    int TIME_LITERAL = 7;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_LITERAL__VALUE = DATETIME_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Time Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_LITERAL_FEATURE_COUNT = DATETIME_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Time Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_LITERAL_OPERATION_COUNT = DATETIME_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.TimestampLiteralImpl <em>Timestamp Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.TimestampLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getTimestampLiteral()
     * @generated
     */
    int TIMESTAMP_LITERAL = 8;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_LITERAL__VALUE = DATETIME_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Timestamp Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_LITERAL_FEATURE_COUNT = DATETIME_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Timestamp Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_LITERAL_OPERATION_COUNT = DATETIME_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.NumericLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getNumericLiteral()
     * @generated
     */
    int NUMERIC_LITERAL = 11;

    /**
     * The number of structural features of the '<em>Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.ExactNumericLiteralImpl <em>Exact Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.ExactNumericLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getExactNumericLiteral()
     * @generated
     */
    int EXACT_NUMERIC_LITERAL = 9;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXACT_NUMERIC_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Exact Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXACT_NUMERIC_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Exact Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXACT_NUMERIC_LITERAL_OPERATION_COUNT = NUMERIC_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.ApproximateNumericLiteralImpl <em>Approximate Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.ApproximateNumericLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getApproximateNumericLiteral()
     * @generated
     */
    int APPROXIMATE_NUMERIC_LITERAL = 10;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPROXIMATE_NUMERIC_LITERAL__VALUE = NUMERIC_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Approximate Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPROXIMATE_NUMERIC_LITERAL_FEATURE_COUNT = NUMERIC_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Approximate Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPROXIMATE_NUMERIC_LITERAL_OPERATION_COUNT = NUMERIC_LITERAL_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.Literal <em>Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal</em>'.
     * @see org.emftext.language.sql.literal.Literal
     * @generated
     */
    EClass getLiteral();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.GeneralLiteral <em>General Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>General Literal</em>'.
     * @see org.emftext.language.sql.literal.GeneralLiteral
     * @generated
     */
    EClass getGeneralLiteral();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.CharacterStringLiteral <em>Character String Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Character String Literal</em>'.
     * @see org.emftext.language.sql.literal.CharacterStringLiteral
     * @generated
     */
    EClass getCharacterStringLiteral();

    /**
     * Returns the meta object for the containment reference '{@link org.emftext.language.sql.literal.CharacterStringLiteral#getCharacterSetName <em>Character Set Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Character Set Name</em>'.
     * @see org.emftext.language.sql.literal.CharacterStringLiteral#getCharacterSetName()
     * @see #getCharacterStringLiteral()
     * @generated
     */
    EReference getCharacterStringLiteral_CharacterSetName();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.NationalCharacterStringLiteral <em>National Character String Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>National Character String Literal</em>'.
     * @see org.emftext.language.sql.literal.NationalCharacterStringLiteral
     * @generated
     */
    EClass getNationalCharacterStringLiteral();

    /**
     * Returns the meta object for the attribute list '{@link org.emftext.language.sql.literal.NationalCharacterStringLiteral#getValues <em>Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Values</em>'.
     * @see org.emftext.language.sql.literal.NationalCharacterStringLiteral#getValues()
     * @see #getNationalCharacterStringLiteral()
     * @generated
     */
    EAttribute getNationalCharacterStringLiteral_Values();

    /**
     * Returns the meta object for the containment reference list '{@link org.emftext.language.sql.literal.NationalCharacterStringLiteral#getSeparators <em>Separators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Separators</em>'.
     * @see org.emftext.language.sql.literal.NationalCharacterStringLiteral#getSeparators()
     * @see #getNationalCharacterStringLiteral()
     * @generated
     */
    EReference getNationalCharacterStringLiteral_Separators();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.DatetimeLiteral <em>Datetime Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Datetime Literal</em>'.
     * @see org.emftext.language.sql.literal.DatetimeLiteral
     * @generated
     */
    EClass getDatetimeLiteral();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.BooleanLiteral <em>Boolean Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Literal</em>'.
     * @see org.emftext.language.sql.literal.BooleanLiteral
     * @generated
     */
    EClass getBooleanLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.literal.BooleanLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.sql.literal.BooleanLiteral#getValue()
     * @see #getBooleanLiteral()
     * @generated
     */
    EAttribute getBooleanLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.DateLiteral <em>Date Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Date Literal</em>'.
     * @see org.emftext.language.sql.literal.DateLiteral
     * @generated
     */
    EClass getDateLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.literal.DateLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.sql.literal.DateLiteral#getValue()
     * @see #getDateLiteral()
     * @generated
     */
    EAttribute getDateLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.TimeLiteral <em>Time Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Literal</em>'.
     * @see org.emftext.language.sql.literal.TimeLiteral
     * @generated
     */
    EClass getTimeLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.literal.TimeLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.sql.literal.TimeLiteral#getValue()
     * @see #getTimeLiteral()
     * @generated
     */
    EAttribute getTimeLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.TimestampLiteral <em>Timestamp Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Timestamp Literal</em>'.
     * @see org.emftext.language.sql.literal.TimestampLiteral
     * @generated
     */
    EClass getTimestampLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.literal.TimestampLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.sql.literal.TimestampLiteral#getValue()
     * @see #getTimestampLiteral()
     * @generated
     */
    EAttribute getTimestampLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.ExactNumericLiteral <em>Exact Numeric Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exact Numeric Literal</em>'.
     * @see org.emftext.language.sql.literal.ExactNumericLiteral
     * @generated
     */
    EClass getExactNumericLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.literal.ExactNumericLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.sql.literal.ExactNumericLiteral#getValue()
     * @see #getExactNumericLiteral()
     * @generated
     */
    EAttribute getExactNumericLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.ApproximateNumericLiteral <em>Approximate Numeric Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Approximate Numeric Literal</em>'.
     * @see org.emftext.language.sql.literal.ApproximateNumericLiteral
     * @generated
     */
    EClass getApproximateNumericLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.literal.ApproximateNumericLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.sql.literal.ApproximateNumericLiteral#getValue()
     * @see #getApproximateNumericLiteral()
     * @generated
     */
    EAttribute getApproximateNumericLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.NumericLiteral <em>Numeric Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric Literal</em>'.
     * @see org.emftext.language.sql.literal.NumericLiteral
     * @generated
     */
    EClass getNumericLiteral();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    LiteralFactory getLiteralFactory();

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
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.LiteralImpl <em>Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.LiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getLiteral()
        	 * @generated
        	 */
        EClass LITERAL = eINSTANCE.getLiteral();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.GeneralLiteralImpl <em>General Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.GeneralLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getGeneralLiteral()
        	 * @generated
        	 */
        EClass GENERAL_LITERAL = eINSTANCE.getGeneralLiteral();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.CharacterStringLiteralImpl <em>Character String Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.CharacterStringLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getCharacterStringLiteral()
        	 * @generated
        	 */
        EClass CHARACTER_STRING_LITERAL = eINSTANCE.getCharacterStringLiteral();

        /**
        	 * The meta object literal for the '<em><b>Character Set Name</b></em>' containment reference feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME = eINSTANCE
                .getCharacterStringLiteral_CharacterSetName();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl <em>National Character String Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getNationalCharacterStringLiteral()
        	 * @generated
        	 */
        EClass NATIONAL_CHARACTER_STRING_LITERAL = eINSTANCE.getNationalCharacterStringLiteral();

        /**
        	 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
        	 * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute NATIONAL_CHARACTER_STRING_LITERAL__VALUES = eINSTANCE.getNationalCharacterStringLiteral_Values();

        /**
        	 * The meta object literal for the '<em><b>Separators</b></em>' containment reference list feature.
        	 * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
        	 * @generated
        	 */
        EReference NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS = eINSTANCE
                .getNationalCharacterStringLiteral_Separators();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.DatetimeLiteralImpl <em>Datetime Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.DatetimeLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getDatetimeLiteral()
        	 * @generated
        	 */
        EClass DATETIME_LITERAL = eINSTANCE.getDatetimeLiteral();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.BooleanLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getBooleanLiteral()
        	 * @generated
        	 */
        EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

        /**
        	 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.DateLiteralImpl <em>Date Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.DateLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getDateLiteral()
        	 * @generated
        	 */
        EClass DATE_LITERAL = eINSTANCE.getDateLiteral();

        /**
        	 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute DATE_LITERAL__VALUE = eINSTANCE.getDateLiteral_Value();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.TimeLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getTimeLiteral()
        	 * @generated
        	 */
        EClass TIME_LITERAL = eINSTANCE.getTimeLiteral();

        /**
        	 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute TIME_LITERAL__VALUE = eINSTANCE.getTimeLiteral_Value();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.TimestampLiteralImpl <em>Timestamp Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.TimestampLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getTimestampLiteral()
        	 * @generated
        	 */
        EClass TIMESTAMP_LITERAL = eINSTANCE.getTimestampLiteral();

        /**
        	 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
        	 * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute TIMESTAMP_LITERAL__VALUE = eINSTANCE.getTimestampLiteral_Value();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.ExactNumericLiteralImpl <em>Exact Numeric Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.ExactNumericLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getExactNumericLiteral()
        	 * @generated
        	 */
        EClass EXACT_NUMERIC_LITERAL = eINSTANCE.getExactNumericLiteral();

        /**
        	 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute EXACT_NUMERIC_LITERAL__VALUE = eINSTANCE.getExactNumericLiteral_Value();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.ApproximateNumericLiteralImpl <em>Approximate Numeric Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.ApproximateNumericLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getApproximateNumericLiteral()
        	 * @generated
        	 */
        EClass APPROXIMATE_NUMERIC_LITERAL = eINSTANCE.getApproximateNumericLiteral();

        /**
        	 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute APPROXIMATE_NUMERIC_LITERAL__VALUE = eINSTANCE.getApproximateNumericLiteral_Value();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.NumericLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getNumericLiteral()
        	 * @generated
        	 */
        EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

    }

} //LiteralPackage
