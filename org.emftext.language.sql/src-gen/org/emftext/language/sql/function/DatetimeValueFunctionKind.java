/**
 */
package org.emftext.language.sql.function;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Datetime Value Function Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.function.FunctionPackage#getDatetimeValueFunctionKind()
 * @model
 * @generated
 */
public enum DatetimeValueFunctionKind implements Enumerator {
    /**
     * The '<em><b>CURRENT DATE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CURRENT_DATE_VALUE
     * @generated
     * @ordered
     */
    CURRENT_DATE(0, "CURRENT_DATE", "CURRENT_DATE"),

    /**
     * The '<em><b>CURRENT TIME</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CURRENT_TIME_VALUE
     * @generated
     * @ordered
     */
    CURRENT_TIME(1, "CURRENT_TIME", "CURRENT_TIME"),

    /**
     * The '<em><b>LOCALTIME</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOCALTIME_VALUE
     * @generated
     * @ordered
     */
    LOCALTIME(2, "LOCALTIME", "LOCALTIME"),

    /**
     * The '<em><b>CURRENT TIMESTAMP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CURRENT_TIMESTAMP_VALUE
     * @generated
     * @ordered
     */
    CURRENT_TIMESTAMP(3, "CURRENT_TIMESTAMP", "CURRENT_TIMESTAMP"),

    /**
     * The '<em><b>LOCALTIMESTAMP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOCALTIMESTAMP_VALUE
     * @generated
     * @ordered
     */
    LOCALTIMESTAMP(4, "LOCALTIMESTAMP", "LOCALTIMESTAMP");

    /**
     * The '<em><b>CURRENT DATE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CURRENT DATE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CURRENT_DATE
     * @model
     * @generated
     * @ordered
     */
    public static final int CURRENT_DATE_VALUE = 0;

    /**
     * The '<em><b>CURRENT TIME</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CURRENT TIME</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CURRENT_TIME
     * @model
     * @generated
     * @ordered
     */
    public static final int CURRENT_TIME_VALUE = 1;

    /**
     * The '<em><b>LOCALTIME</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LOCALTIME</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOCALTIME
     * @model
     * @generated
     * @ordered
     */
    public static final int LOCALTIME_VALUE = 2;

    /**
     * The '<em><b>CURRENT TIMESTAMP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CURRENT TIMESTAMP</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CURRENT_TIMESTAMP
     * @model
     * @generated
     * @ordered
     */
    public static final int CURRENT_TIMESTAMP_VALUE = 3;

    /**
     * The '<em><b>LOCALTIMESTAMP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LOCALTIMESTAMP</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOCALTIMESTAMP
     * @model
     * @generated
     * @ordered
     */
    public static final int LOCALTIMESTAMP_VALUE = 4;

    /**
     * An array of all the '<em><b>Datetime Value Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DatetimeValueFunctionKind[] VALUES_ARRAY = new DatetimeValueFunctionKind[] { CURRENT_DATE,
            CURRENT_TIME, LOCALTIME, CURRENT_TIMESTAMP, LOCALTIMESTAMP, };

    /**
     * A public read-only list of all the '<em><b>Datetime Value Function Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DatetimeValueFunctionKind> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Datetime Value Function Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DatetimeValueFunctionKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DatetimeValueFunctionKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Datetime Value Function Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DatetimeValueFunctionKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DatetimeValueFunctionKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Datetime Value Function Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DatetimeValueFunctionKind get(int value) {
        switch (value) {
        case CURRENT_DATE_VALUE:
            return CURRENT_DATE;
        case CURRENT_TIME_VALUE:
            return CURRENT_TIME;
        case LOCALTIME_VALUE:
            return LOCALTIME;
        case CURRENT_TIMESTAMP_VALUE:
            return CURRENT_TIMESTAMP;
        case LOCALTIMESTAMP_VALUE:
            return LOCALTIMESTAMP;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private DatetimeValueFunctionKind(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //DatetimeValueFunctionKind
