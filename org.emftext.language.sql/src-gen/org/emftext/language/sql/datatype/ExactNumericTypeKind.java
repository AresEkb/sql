/**
 */
package org.emftext.language.sql.datatype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exact Numeric Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.datatype.DatatypePackage#getExactNumericTypeKind()
 * @model
 * @generated
 */
public enum ExactNumericTypeKind implements Enumerator {
    /**
     * The '<em><b>NUMERIC</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NUMERIC_VALUE
     * @generated
     * @ordered
     */
    NUMERIC(0, "NUMERIC", "NUMERIC"),

    /**
     * The '<em><b>DECIMAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DECIMAL_VALUE
     * @generated
     * @ordered
     */
    DECIMAL(1, "DECIMAL", "DECIMAL"),

    /**
     * The '<em><b>DEC</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEC_VALUE
     * @generated
     * @ordered
     */
    DEC(2, "DEC", "DEC"),

    /**
     * The '<em><b>SMALLINT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SMALLINT_VALUE
     * @generated
     * @ordered
     */
    SMALLINT(3, "SMALLINT", "SMALLINT"),

    /**
     * The '<em><b>INTEGER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTEGER_VALUE
     * @generated
     * @ordered
     */
    INTEGER(4, "INTEGER", "INTEGER"),

    /**
     * The '<em><b>INT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INT_VALUE
     * @generated
     * @ordered
     */
    INT(5, "INT", "INT"),

    /**
     * The '<em><b>BIGINT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BIGINT_VALUE
     * @generated
     * @ordered
     */
    BIGINT(6, "BIGINT", "BIGINT");

    /**
     * The '<em><b>NUMERIC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NUMERIC</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NUMERIC
     * @model
     * @generated
     * @ordered
     */
    public static final int NUMERIC_VALUE = 0;

    /**
     * The '<em><b>DECIMAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DECIMAL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DECIMAL
     * @model
     * @generated
     * @ordered
     */
    public static final int DECIMAL_VALUE = 1;

    /**
     * The '<em><b>DEC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DEC</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEC
     * @model
     * @generated
     * @ordered
     */
    public static final int DEC_VALUE = 2;

    /**
     * The '<em><b>SMALLINT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SMALLINT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SMALLINT
     * @model
     * @generated
     * @ordered
     */
    public static final int SMALLINT_VALUE = 3;

    /**
     * The '<em><b>INTEGER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTEGER
     * @model
     * @generated
     * @ordered
     */
    public static final int INTEGER_VALUE = 4;

    /**
     * The '<em><b>INT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INT
     * @model
     * @generated
     * @ordered
     */
    public static final int INT_VALUE = 5;

    /**
     * The '<em><b>BIGINT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BIGINT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BIGINT
     * @model
     * @generated
     * @ordered
     */
    public static final int BIGINT_VALUE = 6;

    /**
     * An array of all the '<em><b>Exact Numeric Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ExactNumericTypeKind[] VALUES_ARRAY = new ExactNumericTypeKind[] { NUMERIC, DECIMAL, DEC,
            SMALLINT, INTEGER, INT, BIGINT, };

    /**
     * A public read-only list of all the '<em><b>Exact Numeric Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ExactNumericTypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Exact Numeric Type Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExactNumericTypeKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ExactNumericTypeKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exact Numeric Type Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExactNumericTypeKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ExactNumericTypeKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exact Numeric Type Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExactNumericTypeKind get(int value) {
        switch (value) {
        case NUMERIC_VALUE:
            return NUMERIC;
        case DECIMAL_VALUE:
            return DECIMAL;
        case DEC_VALUE:
            return DEC;
        case SMALLINT_VALUE:
            return SMALLINT;
        case INTEGER_VALUE:
            return INTEGER;
        case INT_VALUE:
            return INT;
        case BIGINT_VALUE:
            return BIGINT;
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
    private ExactNumericTypeKind(int value, String name, String literal) {
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

} //ExactNumericTypeKind
