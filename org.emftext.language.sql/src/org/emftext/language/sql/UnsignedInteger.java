package org.emftext.language.sql;

public class UnsignedInteger {

    private int value;

    private UnsignedInteger(int value) {
        this.value = value;
    }

    public static UnsignedInteger valueOf(String str) {
        return new UnsignedInteger(Integer.parseUnsignedInt(str));
    }

    @Override
    public String toString() {
        return String.format("%d", value);
    }

}
