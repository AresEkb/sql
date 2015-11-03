/**
 */
package org.emftext.language.sql.datatype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>National Character String Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.datatype.DatatypePackage#getNationalCharacterStringTypeKind()
 * @model
 * @generated
 */
public enum NationalCharacterStringTypeKind implements Enumerator {
    /**
     * The '<em><b>NATIONAL CHARACTER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NATIONAL_CHARACTER_VALUE
     * @generated
     * @ordered
     */
    NATIONAL_CHARACTER(0, "NATIONAL_CHARACTER", "NATIONAL CHARACTER"),

    /**
     * The '<em><b>NATIONAL CHAR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NATIONAL_CHAR_VALUE
     * @generated
     * @ordered
     */
    NATIONAL_CHAR(1, "NATIONAL_CHAR", "NATIONAL CHAR"),

    /**
     * The '<em><b>NCHAR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NCHAR_VALUE
     * @generated
     * @ordered
     */
    NCHAR(2, "NCHAR", "NCHAR"),

    /**
     * The '<em><b>NATIONAL CHARACTER VARYING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NATIONAL_CHARACTER_VARYING_VALUE
     * @generated
     * @ordered
     */
    NATIONAL_CHARACTER_VARYING(3, "NATIONAL_CHARACTER_VARYING", "NATIONAL_CHARACTER_VARYING"),

    /**
     * The '<em><b>NATIONAL CHAR VARYING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NATIONAL_CHAR_VARYING_VALUE
     * @generated
     * @ordered
     */
    NATIONAL_CHAR_VARYING(4, "NATIONAL_CHAR_VARYING", "NATIONAL_CHAR_VARYING"),

    /**
     * The '<em><b>NCHAR VARYING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NCHAR_VARYING_VALUE
     * @generated
     * @ordered
     */
    NCHAR_VARYING(5, "NCHAR_VARYING", "NCHAR_VARYING");

    /**
     * The '<em><b>NATIONAL CHARACTER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NATIONAL CHARACTER</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NATIONAL_CHARACTER
     * @model literal="NATIONAL CHARACTER"
     * @generated
     * @ordered
     */
    public static final int NATIONAL_CHARACTER_VALUE = 0;

    /**
     * The '<em><b>NATIONAL CHAR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NATIONAL CHAR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NATIONAL_CHAR
     * @model literal="NATIONAL CHAR"
     * @generated
     * @ordered
     */
    public static final int NATIONAL_CHAR_VALUE = 1;

    /**
     * The '<em><b>NCHAR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NCHAR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NCHAR
     * @model
     * @generated
     * @ordered
     */
    public static final int NCHAR_VALUE = 2;

    /**
     * The '<em><b>NATIONAL CHARACTER VARYING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NATIONAL CHARACTER VARYING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NATIONAL_CHARACTER_VARYING
     * @model
     * @generated
     * @ordered
     */
    public static final int NATIONAL_CHARACTER_VARYING_VALUE = 3;

    /**
     * The '<em><b>NATIONAL CHAR VARYING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NATIONAL CHAR VARYING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NATIONAL_CHAR_VARYING
     * @model
     * @generated
     * @ordered
     */
    public static final int NATIONAL_CHAR_VARYING_VALUE = 4;

    /**
     * The '<em><b>NCHAR VARYING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NCHAR VARYING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NCHAR_VARYING
     * @model
     * @generated
     * @ordered
     */
    public static final int NCHAR_VARYING_VALUE = 5;

    /**
     * An array of all the '<em><b>National Character String Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final NationalCharacterStringTypeKind[] VALUES_ARRAY = new NationalCharacterStringTypeKind[] {
            NATIONAL_CHARACTER, NATIONAL_CHAR, NCHAR, NATIONAL_CHARACTER_VARYING, NATIONAL_CHAR_VARYING,
            NCHAR_VARYING, };

    /**
     * A public read-only list of all the '<em><b>National Character String Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<NationalCharacterStringTypeKind> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>National Character String Type Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NationalCharacterStringTypeKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            NationalCharacterStringTypeKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>National Character String Type Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NationalCharacterStringTypeKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            NationalCharacterStringTypeKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>National Character String Type Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static NationalCharacterStringTypeKind get(int value) {
        switch (value) {
        case NATIONAL_CHARACTER_VALUE:
            return NATIONAL_CHARACTER;
        case NATIONAL_CHAR_VALUE:
            return NATIONAL_CHAR;
        case NCHAR_VALUE:
            return NCHAR;
        case NATIONAL_CHARACTER_VARYING_VALUE:
            return NATIONAL_CHARACTER_VARYING;
        case NATIONAL_CHAR_VARYING_VALUE:
            return NATIONAL_CHAR_VARYING;
        case NCHAR_VARYING_VALUE:
            return NCHAR_VARYING;
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
    private NationalCharacterStringTypeKind(int value, String name, String literal) {
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

} //NationalCharacterStringTypeKind
