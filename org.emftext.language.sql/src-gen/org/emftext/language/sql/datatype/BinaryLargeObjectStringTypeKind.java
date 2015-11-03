/**
 */
package org.emftext.language.sql.datatype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binary Large Object String Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.sql.datatype.DatatypePackage#getBinaryLargeObjectStringTypeKind()
 * @model
 * @generated
 */
public enum BinaryLargeObjectStringTypeKind implements Enumerator {
    /**
     * The '<em><b>BINARY LARGE OBJECT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BINARY_LARGE_OBJECT_VALUE
     * @generated
     * @ordered
     */
    BINARY_LARGE_OBJECT(0, "BINARY_LARGE_OBJECT", "BINARY LARGE OBJECT"),

    /**
     * The '<em><b>BLOB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BLOB_VALUE
     * @generated
     * @ordered
     */
    BLOB(1, "BLOB", "BLOB");

    /**
     * The '<em><b>BINARY LARGE OBJECT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BINARY LARGE OBJECT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BINARY_LARGE_OBJECT
     * @model literal="BINARY LARGE OBJECT"
     * @generated
     * @ordered
     */
    public static final int BINARY_LARGE_OBJECT_VALUE = 0;

    /**
     * The '<em><b>BLOB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BLOB</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BLOB
     * @model
     * @generated
     * @ordered
     */
    public static final int BLOB_VALUE = 1;

    /**
     * An array of all the '<em><b>Binary Large Object String Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BinaryLargeObjectStringTypeKind[] VALUES_ARRAY = new BinaryLargeObjectStringTypeKind[] {
            BINARY_LARGE_OBJECT, BLOB, };

    /**
     * A public read-only list of all the '<em><b>Binary Large Object String Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<BinaryLargeObjectStringTypeKind> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Binary Large Object String Type Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BinaryLargeObjectStringTypeKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BinaryLargeObjectStringTypeKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Binary Large Object String Type Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BinaryLargeObjectStringTypeKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BinaryLargeObjectStringTypeKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Binary Large Object String Type Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BinaryLargeObjectStringTypeKind get(int value) {
        switch (value) {
        case BINARY_LARGE_OBJECT_VALUE:
            return BINARY_LARGE_OBJECT;
        case BLOB_VALUE:
            return BLOB;
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
    private BinaryLargeObjectStringTypeKind(int value, String name, String literal) {
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

} //BinaryLargeObjectStringTypeKind
