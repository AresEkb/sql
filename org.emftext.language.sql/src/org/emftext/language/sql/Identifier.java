package org.emftext.language.sql;

public class Identifier {

    private String value;

    private Identifier(String value) {
        this.value = value;
    }

    public static Identifier valueOf(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1);
            str = str.replace("\"\"", "\"");
        } else {
            str = str.toUpperCase();
        }
        return new Identifier(str);
    }

    @Override
    public String toString() {
        if (value.contains("\"")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        } else {
            return value;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Identifier identifier = null;
        if (obj instanceof Identifier) {
            identifier = (Identifier) obj;
        }
        else if (obj instanceof String) {
            identifier = Identifier.valueOf((String) obj);
        }
        return identifier != null && value.equals(identifier.value);
    }

    public boolean startsWith(String prefix) {
        // TODO: Quotes must be supported
        return value.startsWith(prefix.toUpperCase());
    }

}
