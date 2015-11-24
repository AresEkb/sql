package org.emftext.language.sql;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Identifier {

    private static final String DOUBLE_QUOTE = "\"";
    private static final String DOUBLEQUOTE_SYMBOL = "\"\"";
    
    private static final Set<String> RESERVED_WORDS = new HashSet<String>(Arrays.asList(new String[] { "ADD", "ALL",
            "ALLOCATE", "ALTER", "AND", "ANY", "ARE", "ARRAY", "AS", "ASENSITIVE", "ASYMMETRIC", "AT", "ATOMIC",
            "AUTHORIZATION", "BEGIN", "BETWEEN", "BIGINT", "BINARY", "BLOB", "BOOLEAN", "BOTH", "BY", "CALL", "CALLED",
            "CASCADED", "CASE", "CAST", "CHAR", "CHARACTER", "CHECK", "CLOB", "CLOSE", "COLLATE", "COLUMN", "COMMIT",
            "CONNECT", "CONSTRAINT", "CONTINUE", "CORRESPONDING", "CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE",
            "CURRENT_DEFAULT_TRANSFORM_GROUP", "CURRENT_PATH", "CURRENT_ROLE", "CURRENT_TIME", "CURRENT_TIMESTAMP",
            "CURRENT_TRANSFORM_GROUP_FOR_TYPE", "CURRENT_USER", "CURSOR", "CYCLE", "DATE", "DAY", "DEALLOCATE", "DEC",
            "DECIMAL", "DECLARE", "DEFAULT", "DELETE", "DEREF", "DESCRIBE", "DETERMINISTIC", "DISCONNECT", "DISTINCT",
            "DOUBLE", "DROP", "DYNAMIC", "EACH", "ELEMENT", "ELSE", "END", "END-EXEC", "ESCAPE", "EXCEPT", "EXEC",
            "EXECUTE", "EXISTS", "EXTERNAL", "FALSE", "FETCH", "FILTER", "FLOAT", "FOR", "FOREIGN", "FREE", "FROM",
            "FULL", "FUNCTION", "GET", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "HOLD", "HOUR", "IDENTITY",
            "IMMEDIATE", "IN", "INDICATOR", "INNER", "INOUT", "INPUT", "INSENSITIVE", "INSERT", "INT", "INTEGER",
            "INTERSECT", "INTERVAL", "INTO", "IS", "ISOLATION", "JOIN", "LANGUAGE", "LARGE", "LATERAL", "LEADING",
            "LEFT", "LIKE", "LOCAL", "LOCALTIME", "LOCALTIMESTAMP", "MATCH", "MEMBER", "MERGE", "METHOD", "MINUTE",
            "MODIFIES", "MODULE", "MONTH", "MULTISET", "NATIONAL", "NATURAL", "NCHAR", "NCLOB", "NEW", "NO", "NONE",
            "NOT", "NULL", "NUMERIC", "OF", "OLD", "ON", "ONLY", "OPEN", "OR", "ORDER", "OUT", "OUTER", "OUTPUT",
            "OVER", "OVERLAPS", "PARAMETER", "PARTITION", "PRECISION", "PREPARE", "PRIMARY", "PROCEDURE", "RANGE",
            "READS", "REAL", "RECURSIVE", "REF", "REFERENCES", "REFERENCING", "REGR_AVGX", "REGR_AVGY", "REGR_COUNT",
            "REGR_INTERCEPT", "REGR_R2", "REGR_SLOPE", "REGR_SXX", "REGR_SXY", "REGR_SYY", "RELEASE", "RESULT",
            "RETURN", "RETURNS", "REVOKE", "RIGHT", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SAVEPOINT", "SCROLL",
            "SEARCH", "SECOND", "SELECT", "SENSITIVE", "SESSION_USER", "SET", "SIMILAR", "SMALLINT", "SOME", "SPECIFIC",
            "SPECIFICTYPE", "SQL", "SQLEXCEPTION", "SQLSTATE", "SQLWARNING", "START", "STATIC", "SUBMULTISET",
            "SYMMETRIC", "SYSTEM", "SYSTEM_USER", "TABLE", "THEN", "TIME", "TIMESTAMP", "TIMEZONE_HOUR",
            "TIMEZONE_MINUTE", "TO", "TRAILING", "TRANSLATION", "TREAT", "TRIGGER", "TRUE", "UESCAPE", "UNION",
            "UNIQUE", "UNKNOWN", "UNNEST", "UPDATE", "UPPER", "USER", "USING", "VALUE", "VALUES", "VAR_POP", "VAR_SAMP",
            "VARCHAR", "VARYING", "WHEN", "WHENEVER", "WHERE", "WIDTH_BUCKET", "WINDOW", "WITH", "WITHIN", "WITHOUT",
            "YEAR" }));

    private String value;
    
    public boolean isReservedWord() {
        return isReservedWord(value);
    }

    private Identifier(String value) {
        this.value = value;
    }

    public static Identifier valueOf(String str) {
        if (str.startsWith(DOUBLE_QUOTE) && str.endsWith(DOUBLE_QUOTE)) {
            str = str.substring(1, str.length() - 1);
            str = str.replace(DOUBLEQUOTE_SYMBOL, DOUBLE_QUOTE);
        } else if (isReservedWord(str)) {
            throw new IllegalArgumentException(String.format("Reserved word %s must be quoted in identifier", str.toUpperCase()));
        }
        else {
            str = str.toUpperCase();
        }
        return new Identifier(str);
    }

    @Override
    public String toString() {
        if (value.contains(DOUBLE_QUOTE) || isReservedWord(value)) {
            return DOUBLE_QUOTE + value.replace(DOUBLE_QUOTE, DOUBLEQUOTE_SYMBOL) + DOUBLE_QUOTE;
        } else {
            return value;
        }
    }

    private static boolean isReservedWord(String str) {
        return RESERVED_WORDS.contains(str.toUpperCase());
    }

    @Override
    public boolean equals(Object obj) {
        Identifier identifier = null;
        if (obj instanceof Identifier) {
            identifier = (Identifier) obj;
        } else if (obj instanceof String) {
            identifier = Identifier.valueOf((String) obj);
        }
        return identifier != null && value.equals(identifier.value);
    }

    public boolean startsWith(String prefix) {
        // TODO: Quotes must be supported
        return value.startsWith(prefix.toUpperCase());
    }

}
