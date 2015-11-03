/**
 */
package org.emftext.language.sql.literal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.SignedNumericLiteralImpl <em>Signed Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.SignedNumericLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getSignedNumericLiteral()
     * @generated
     */
    int SIGNED_NUMERIC_LITERAL = 1;

    /**
     * The number of structural features of the '<em>Signed Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNED_NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Signed Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNED_NUMERIC_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.GeneralLiteralImpl <em>General Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.GeneralLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getGeneralLiteral()
     * @generated
     */
    int GENERAL_LITERAL = 2;

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
    int CHARACTER_STRING_LITERAL = 3;

    /**
     * The number of structural features of the '<em>Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_STRING_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl <em>National Character String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getNationalCharacterStringLiteral()
     * @generated
     */
    int NATIONAL_CHARACTER_STRING_LITERAL = 4;

    /**
     * The number of structural features of the '<em>National Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>National Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NATIONAL_CHARACTER_STRING_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.UnicodeCharacterStringLiteralImpl <em>Unicode Character String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.UnicodeCharacterStringLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getUnicodeCharacterStringLiteral()
     * @generated
     */
    int UNICODE_CHARACTER_STRING_LITERAL = 5;

    /**
     * The number of structural features of the '<em>Unicode Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNICODE_CHARACTER_STRING_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Unicode Character String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNICODE_CHARACTER_STRING_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.BinaryStringLiteralImpl <em>Binary String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.BinaryStringLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getBinaryStringLiteral()
     * @generated
     */
    int BINARY_STRING_LITERAL = 6;

    /**
     * The number of structural features of the '<em>Binary String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_STRING_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Binary String Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_STRING_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.DatetimeLiteralImpl <em>Datetime Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.DatetimeLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getDatetimeLiteral()
     * @generated
     */
    int DATETIME_LITERAL = 7;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_LITERAL__VALUE = GENERAL_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Datetime Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Datetime Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATETIME_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.IntervalLiteralImpl <em>Interval Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.IntervalLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getIntervalLiteral()
     * @generated
     */
    int INTERVAL_LITERAL = 8;

    /**
     * The feature id for the '<em><b>Is Positive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVAL_LITERAL__IS_POSITIVE = GENERAL_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Interval Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVAL_LITERAL_FEATURE_COUNT = GENERAL_LITERAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Interval Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVAL_LITERAL_OPERATION_COUNT = GENERAL_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.BooleanLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getBooleanLiteral()
     * @generated
     */
    int BOOLEAN_LITERAL = 9;

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
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.UnsignedLiteralImpl <em>Unsigned Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.UnsignedLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getUnsignedLiteral()
     * @generated
     */
    int UNSIGNED_LITERAL = 10;

    /**
     * The number of structural features of the '<em>Unsigned Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_LITERAL_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Unsigned Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_LITERAL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.UnsignedNumericLiteralImpl <em>Unsigned Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.UnsignedNumericLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getUnsignedNumericLiteral()
     * @generated
     */
    int UNSIGNED_NUMERIC_LITERAL = 11;

    /**
     * The number of structural features of the '<em>Unsigned Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_NUMERIC_LITERAL_FEATURE_COUNT = UNSIGNED_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Unsigned Numeric Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_NUMERIC_LITERAL_OPERATION_COUNT = UNSIGNED_LITERAL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.emftext.language.sql.literal.impl.DateLiteralImpl <em>Date Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.sql.literal.impl.DateLiteralImpl
     * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getDateLiteral()
     * @generated
     */
    int DATE_LITERAL = 12;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_LITERAL__VALUE = DATETIME_LITERAL__VALUE;

    /**
     * The number of structural features of the '<em>Date Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_LITERAL_FEATURE_COUNT = DATETIME_LITERAL_FEATURE_COUNT + 0;

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
    int TIME_LITERAL = 13;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_LITERAL__VALUE = DATETIME_LITERAL__VALUE;

    /**
     * The number of structural features of the '<em>Time Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_LITERAL_FEATURE_COUNT = DATETIME_LITERAL_FEATURE_COUNT + 0;

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
    int TIMESTAMP_LITERAL = 14;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_LITERAL__VALUE = DATETIME_LITERAL__VALUE;

    /**
     * The number of structural features of the '<em>Timestamp Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_LITERAL_FEATURE_COUNT = DATETIME_LITERAL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Timestamp Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_LITERAL_OPERATION_COUNT = DATETIME_LITERAL_OPERATION_COUNT + 0;

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
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.SignedNumericLiteral <em>Signed Numeric Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signed Numeric Literal</em>'.
     * @see org.emftext.language.sql.literal.SignedNumericLiteral
     * @generated
     */
    EClass getSignedNumericLiteral();

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
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.NationalCharacterStringLiteral <em>National Character String Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>National Character String Literal</em>'.
     * @see org.emftext.language.sql.literal.NationalCharacterStringLiteral
     * @generated
     */
    EClass getNationalCharacterStringLiteral();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.UnicodeCharacterStringLiteral <em>Unicode Character String Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unicode Character String Literal</em>'.
     * @see org.emftext.language.sql.literal.UnicodeCharacterStringLiteral
     * @generated
     */
    EClass getUnicodeCharacterStringLiteral();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.BinaryStringLiteral <em>Binary String Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binary String Literal</em>'.
     * @see org.emftext.language.sql.literal.BinaryStringLiteral
     * @generated
     */
    EClass getBinaryStringLiteral();

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
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.literal.DatetimeLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.emftext.language.sql.literal.DatetimeLiteral#getValue()
     * @see #getDatetimeLiteral()
     * @generated
     */
    EAttribute getDatetimeLiteral_Value();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.IntervalLiteral <em>Interval Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interval Literal</em>'.
     * @see org.emftext.language.sql.literal.IntervalLiteral
     * @generated
     */
    EClass getIntervalLiteral();

    /**
     * Returns the meta object for the attribute '{@link org.emftext.language.sql.literal.IntervalLiteral#isIsPositive <em>Is Positive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Positive</em>'.
     * @see org.emftext.language.sql.literal.IntervalLiteral#isIsPositive()
     * @see #getIntervalLiteral()
     * @generated
     */
    EAttribute getIntervalLiteral_IsPositive();

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
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.UnsignedLiteral <em>Unsigned Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unsigned Literal</em>'.
     * @see org.emftext.language.sql.literal.UnsignedLiteral
     * @generated
     */
    EClass getUnsignedLiteral();

    /**
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.UnsignedNumericLiteral <em>Unsigned Numeric Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unsigned Numeric Literal</em>'.
     * @see org.emftext.language.sql.literal.UnsignedNumericLiteral
     * @generated
     */
    EClass getUnsignedNumericLiteral();

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
     * Returns the meta object for class '{@link org.emftext.language.sql.literal.TimeLiteral <em>Time Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Literal</em>'.
     * @see org.emftext.language.sql.literal.TimeLiteral
     * @generated
     */
    EClass getTimeLiteral();

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
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.SignedNumericLiteralImpl <em>Signed Numeric Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.SignedNumericLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getSignedNumericLiteral()
        	 * @generated
        	 */
        EClass SIGNED_NUMERIC_LITERAL = eINSTANCE.getSignedNumericLiteral();

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
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl <em>National Character String Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.NationalCharacterStringLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getNationalCharacterStringLiteral()
        	 * @generated
        	 */
        EClass NATIONAL_CHARACTER_STRING_LITERAL = eINSTANCE.getNationalCharacterStringLiteral();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.UnicodeCharacterStringLiteralImpl <em>Unicode Character String Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.UnicodeCharacterStringLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getUnicodeCharacterStringLiteral()
        	 * @generated
        	 */
        EClass UNICODE_CHARACTER_STRING_LITERAL = eINSTANCE.getUnicodeCharacterStringLiteral();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.BinaryStringLiteralImpl <em>Binary String Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.BinaryStringLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getBinaryStringLiteral()
        	 * @generated
        	 */
        EClass BINARY_STRING_LITERAL = eINSTANCE.getBinaryStringLiteral();

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
        	 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute DATETIME_LITERAL__VALUE = eINSTANCE.getDatetimeLiteral_Value();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.IntervalLiteralImpl <em>Interval Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.IntervalLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getIntervalLiteral()
        	 * @generated
        	 */
        EClass INTERVAL_LITERAL = eINSTANCE.getIntervalLiteral();

        /**
        	 * The meta object literal for the '<em><b>Is Positive</b></em>' attribute feature.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @generated
        	 */
        EAttribute INTERVAL_LITERAL__IS_POSITIVE = eINSTANCE.getIntervalLiteral_IsPositive();

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
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.UnsignedLiteralImpl <em>Unsigned Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.UnsignedLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getUnsignedLiteral()
        	 * @generated
        	 */
        EClass UNSIGNED_LITERAL = eINSTANCE.getUnsignedLiteral();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.UnsignedNumericLiteralImpl <em>Unsigned Numeric Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.UnsignedNumericLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getUnsignedNumericLiteral()
        	 * @generated
        	 */
        EClass UNSIGNED_NUMERIC_LITERAL = eINSTANCE.getUnsignedNumericLiteral();

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
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.TimeLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getTimeLiteral()
        	 * @generated
        	 */
        EClass TIME_LITERAL = eINSTANCE.getTimeLiteral();

        /**
        	 * The meta object literal for the '{@link org.emftext.language.sql.literal.impl.TimestampLiteralImpl <em>Timestamp Literal</em>}' class.
        	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
        	 * @see org.emftext.language.sql.literal.impl.TimestampLiteralImpl
        	 * @see org.emftext.language.sql.literal.impl.LiteralPackageImpl#getTimestampLiteral()
        	 * @generated
        	 */
        EClass TIMESTAMP_LITERAL = eINSTANCE.getTimestampLiteral();

    }

} //LiteralPackage
