/**
 */
package org.emftext.language.sql.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Table Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.schema.SchemaPackage#getTableScope()
 * @model
 * @generated
 */
public enum TableScope implements Enumerator {
    /**
     * The '<em><b>PERSISTENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PERSISTENT_VALUE
     * @generated
     * @ordered
     */
    PERSISTENT(0, "PERSISTENT", "PERSISTENT"),

    /**
     * The '<em><b>GLOBAL TEMPORARY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GLOBAL_TEMPORARY_VALUE
     * @generated
     * @ordered
     */
    GLOBAL_TEMPORARY(1, "GLOBAL_TEMPORARY", "GLOBAL_TEMPORARY"),

    /**
     * The '<em><b>LOCAL TEMPORARY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOCAL_TEMPORARY_VALUE
     * @generated
     * @ordered
     */
    LOCAL_TEMPORARY(2, "LOCAL_TEMPORARY", "LOCAL_TEMPORARY");

    /**
     * The '<em><b>PERSISTENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PERSISTENT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PERSISTENT
     * @model
     * @generated
     * @ordered
     */
    public static final int PERSISTENT_VALUE = 0;

    /**
     * The '<em><b>GLOBAL TEMPORARY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GLOBAL TEMPORARY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GLOBAL_TEMPORARY
     * @model
     * @generated
     * @ordered
     */
    public static final int GLOBAL_TEMPORARY_VALUE = 1;

    /**
     * The '<em><b>LOCAL TEMPORARY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LOCAL TEMPORARY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOCAL_TEMPORARY
     * @model
     * @generated
     * @ordered
     */
    public static final int LOCAL_TEMPORARY_VALUE = 2;

    /**
     * An array of all the '<em><b>Table Scope</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TableScope[] VALUES_ARRAY = new TableScope[] { PERSISTENT, GLOBAL_TEMPORARY,
            LOCAL_TEMPORARY, };

    /**
     * A public read-only list of all the '<em><b>Table Scope</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TableScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Table Scope</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TableScope get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TableScope result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Table Scope</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TableScope getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TableScope result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Table Scope</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TableScope get(int value) {
        switch (value) {
        case PERSISTENT_VALUE:
            return PERSISTENT;
        case GLOBAL_TEMPORARY_VALUE:
            return GLOBAL_TEMPORARY;
        case LOCAL_TEMPORARY_VALUE:
            return LOCAL_TEMPORARY;
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
    private TableScope(int value, String name, String literal) {
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

} //TableScope
