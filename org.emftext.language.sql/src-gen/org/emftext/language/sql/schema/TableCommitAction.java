/**
 */
package org.emftext.language.sql.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Table Commit Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.schema.SchemaPackage#getTableCommitAction()
 * @model
 * @generated
 */
public enum TableCommitAction implements Enumerator {
    /**
     * The '<em><b>UNSPECIFIED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSPECIFIED_VALUE
     * @generated
     * @ordered
     */
    UNSPECIFIED(0, "UNSPECIFIED", "UNSPECIFIED"),

    /**
     * The '<em><b>PRESERVE ROWS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRESERVE_ROWS_VALUE
     * @generated
     * @ordered
     */
    PRESERVE_ROWS(1, "PRESERVE_ROWS", "PRESERVE ROWS"),

    /**
     * The '<em><b>DELETE ROWS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DELETE_ROWS_VALUE
     * @generated
     * @ordered
     */
    DELETE_ROWS(2, "DELETE_ROWS", "DELETE ROWS");

    /**
     * The '<em><b>UNSPECIFIED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UNSPECIFIED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNSPECIFIED
     * @model
     * @generated
     * @ordered
     */
    public static final int UNSPECIFIED_VALUE = 0;

    /**
     * The '<em><b>PRESERVE ROWS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PRESERVE ROWS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PRESERVE_ROWS
     * @model literal="PRESERVE ROWS"
     * @generated
     * @ordered
     */
    public static final int PRESERVE_ROWS_VALUE = 1;

    /**
     * The '<em><b>DELETE ROWS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DELETE ROWS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DELETE_ROWS
     * @model literal="DELETE ROWS"
     * @generated
     * @ordered
     */
    public static final int DELETE_ROWS_VALUE = 2;

    /**
     * An array of all the '<em><b>Table Commit Action</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TableCommitAction[] VALUES_ARRAY = new TableCommitAction[] { UNSPECIFIED, PRESERVE_ROWS,
            DELETE_ROWS, };

    /**
     * A public read-only list of all the '<em><b>Table Commit Action</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TableCommitAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Table Commit Action</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TableCommitAction get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TableCommitAction result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Table Commit Action</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TableCommitAction getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TableCommitAction result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Table Commit Action</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TableCommitAction get(int value) {
        switch (value) {
        case UNSPECIFIED_VALUE:
            return UNSPECIFIED;
        case PRESERVE_ROWS_VALUE:
            return PRESERVE_ROWS;
        case DELETE_ROWS_VALUE:
            return DELETE_ROWS;
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
    private TableCommitAction(int value, String name, String literal) {
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

} //TableCommitAction
