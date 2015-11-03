/**
 */
package org.emftext.language.sql.datatype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Character String Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.datatype.DatatypePackage#getCharacterStringTypeKind()
 * @model
 * @generated
 */
public enum CharacterStringTypeKind implements Enumerator {
    /**
     * The '<em><b>CHARACTER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHARACTER_VALUE
     * @generated
     * @ordered
     */
    CHARACTER(0, "CHARACTER", "CHARACTER"),

    /**
     * The '<em><b>CHAR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHAR_VALUE
     * @generated
     * @ordered
     */
    CHAR(1, "CHAR", "CHAR"),

    /**
     * The '<em><b>CHARACTER VARYING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHARACTER_VARYING_VALUE
     * @generated
     * @ordered
     */
    CHARACTER_VARYING(2, "CHARACTER_VARYING", "CHARACTER VARYING"),

    /**
     * The '<em><b>CHAR VARYING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHAR_VARYING_VALUE
     * @generated
     * @ordered
     */
    CHAR_VARYING(3, "CHAR_VARYING", "CHAR VARYING"),

    /**
     * The '<em><b>VARCHAR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VARCHAR_VALUE
     * @generated
     * @ordered
     */
    VARCHAR(4, "VARCHAR", "VARCHAR");

    /**
     * The '<em><b>CHARACTER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CHARACTER</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHARACTER
     * @model
     * @generated
     * @ordered
     */
    public static final int CHARACTER_VALUE = 0;

    /**
     * The '<em><b>CHAR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CHAR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHAR
     * @model
     * @generated
     * @ordered
     */
    public static final int CHAR_VALUE = 1;

    /**
     * The '<em><b>CHARACTER VARYING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CHARACTER VARYING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHARACTER_VARYING
     * @model literal="CHARACTER VARYING"
     * @generated
     * @ordered
     */
    public static final int CHARACTER_VARYING_VALUE = 2;

    /**
     * The '<em><b>CHAR VARYING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CHAR VARYING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHAR_VARYING
     * @model literal="CHAR VARYING"
     * @generated
     * @ordered
     */
    public static final int CHAR_VARYING_VALUE = 3;

    /**
     * The '<em><b>VARCHAR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VARCHAR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VARCHAR
     * @model
     * @generated
     * @ordered
     */
    public static final int VARCHAR_VALUE = 4;

    /**
     * An array of all the '<em><b>Character String Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CharacterStringTypeKind[] VALUES_ARRAY = new CharacterStringTypeKind[] { CHARACTER, CHAR,
            CHARACTER_VARYING, CHAR_VARYING, VARCHAR, };

    /**
     * A public read-only list of all the '<em><b>Character String Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<CharacterStringTypeKind> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Character String Type Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CharacterStringTypeKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CharacterStringTypeKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Character String Type Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CharacterStringTypeKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CharacterStringTypeKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Character String Type Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CharacterStringTypeKind get(int value) {
        switch (value) {
        case CHARACTER_VALUE:
            return CHARACTER;
        case CHAR_VALUE:
            return CHAR;
        case CHARACTER_VARYING_VALUE:
            return CHARACTER_VARYING;
        case CHAR_VARYING_VALUE:
            return CHAR_VARYING;
        case VARCHAR_VALUE:
            return VARCHAR;
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
    private CharacterStringTypeKind(int value, String name, String literal) {
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

} //CharacterStringTypeKind
