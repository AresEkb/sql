SYNTAXDEF sql
FOR <http://www.emftext.org/language/sql>
START Common.SQLScript

OPTIONS {
    reloadGeneratorModel = "true";
    usePredefinedTokens = "false";
    caseInsensitiveKeywords = "true";
    disableBuilder = "true";
    disableDebugSupport = "true";
    disableLaunchSupport = "true";
    disableTokenSorting = "true";
    overrideProposalPostProcessor = "false";
}

TOKENS {
    // Default
    DEFINE WHITESPACE $('\u0009'|'\u000A'|'\u000B'|'\u000C'|'\u000D'|'\u0020'|'\u00A0'|'\u2000'|'\u2001'$ +
                      $|'\u2002'|'\u2003'|'\u2004'|'\u2005'|'\u2006'|'\u2007'|'\u2008'|'\u2009'|'\u200A'$ +
                      $|'\u200B'|'\u200C'|'\u200D'|'\u200E'|'\u200F'|'\u2028'|'\u2029'|'\u3000'|'\uFEFF')$;


    // Single characters
    DEFINE FRAGMENT SIMPLE_LATIN_LETTER $($ + SIMPLE_LATIN_UPPER_CASE_LETTER + $|$ + SIMPLE_LATIN_LOWER_CASE_LETTER + $)$;
    DEFINE FRAGMENT SIMPLE_LATIN_UPPER_CASE_LETTER $'A'..'Z'$;
    DEFINE FRAGMENT SIMPLE_LATIN_LOWER_CASE_LETTER $'a'..'z'$;
    DEFINE FRAGMENT DIGIT $('0'..'9')$;

    DEFINE FRAGMENT PLUS_SIGN $'+'$;
    DEFINE FRAGMENT MINUS_SIGN $'-'$;
    DEFINE FRAGMENT SIGN $($ + PLUS_SIGN + $|$ + MINUS_SIGN + $)$;
    DEFINE FRAGMENT COLON $':'$;
    DEFINE FRAGMENT PERIOD $'.'$;
    DEFINE FRAGMENT SPACE $' '$;
    DEFINE FRAGMENT UNDERSCORE $'_'$;
    DEFINE FRAGMENT SLASH $'/'$;
    DEFINE FRAGMENT ASTERISK $'*'$;
    DEFINE FRAGMENT QUOTE $'\''$;
    DEFINE FRAGMENT QUOTE_SYMBOL $($ + QUOTE + QUOTE + $)$;
    DEFINE FRAGMENT NONQUOTE_CHARACTER $~($ + QUOTE + $|$ + NEWLINE + $)$; 
    DEFINE FRAGMENT DOUBLE_QUOTE $'"'$;
    DEFINE FRAGMENT DOUBLEQUOTE_SYMBOL $($ + DOUBLE_QUOTE + DOUBLE_QUOTE + $)$;
    DEFINE FRAGMENT NONDOUBLEQUOTE_CHARACTER $~($ + DOUBLE_QUOTE + $|$ + NEWLINE + $)$;
    DEFINE FRAGMENT NEWLINE $('\r\n'|'\r'|'\n')$;


    // Comments
    DEFINE SIMPLE_COMMENT SIMPLE_COMMENT_INTRODUCER + $($ + COMMENT_CHARACTER + $)*$;
    DEFINE FRAGMENT SIMPLE_COMMENT_INTRODUCER MINUS_SIGN + MINUS_SIGN;
    DEFINE FRAGMENT COMMENT_CHARACTER $~('\n'|'\r'|'\uffff')$;

    DEFINE BRACKETED_COMMENT BRACKETED_COMMENT_INTRODUCER + BRACKETED_COMMENT_CONTENTS + BRACKETED_COMMENT_TERMINATOR;
    DEFINE FRAGMENT BRACKETED_COMMENT_INTRODUCER SLASH + ASTERISK;
    DEFINE FRAGMENT BRACKETED_COMMENT_TERMINATOR ASTERISK + SLASH;
    DEFINE FRAGMENT BRACKETED_COMMENT_CONTENTS $.*$; // TODO: Nested comments


    // Literals
    DEFINE UNSIGNED_INTEGER $($ + DIGIT + $)+$;

    DEFINE EXACT_NUMERIC_LITERAL $($ + UNSIGNED_INTEGER + $($ + PERIOD + $($ + UNSIGNED_INTEGER + $)?)?|$ + PERIOD + UNSIGNED_INTEGER + $)$;
    DEFINE APPROXIMATE_NUMERIC_LITERAL MANTISSA + $'E'$ + EXPONENT;
    DEFINE FRAGMENT MANTISSA EXACT_NUMERIC_LITERAL;
    DEFINE FRAGMENT EXPONENT SIGNED_INTEGER;
    DEFINE FRAGMENT SIGNED_INTEGER SIGN + $?$ + UNSIGNED_INTEGER;

    DEFINE QUOTED_STRING QUOTE + CHARACTER_REPRESENTATION + $*$ + QUOTE;
    DEFINE FRAGMENT CHARACTER_REPRESENTATION $($ + NONQUOTE_CHARACTER + $|$ + QUOTE_SYMBOL + $)$;


    // Names and identifiers
    DEFINE IDENTIFIER ACTUAL_IDENTIFIER;
    DEFINE FRAGMENT ACTUAL_IDENTIFIER $($ + REGULAR_IDENTIFIER + $|$ + DELIMITED_IDENTIFIER + $)$;
    DEFINE FRAGMENT REGULAR_IDENTIFIER IDENTIFIER_BODY;
    DEFINE FRAGMENT IDENTIFIER_BODY IDENTIFIER_START + IDENTIFIER_PART + $*$;
    DEFINE FRAGMENT IDENTIFIER_PART $($ + IDENTIFIER_START + $|$ + IDENTIFIER_EXTEND + $)$;
    DEFINE FRAGMENT IDENTIFIER_START $('A'..'Z'|'a'..'z')$; // TODO: \p{L} - \p{M}
    DEFINE FRAGMENT IDENTIFIER_EXTEND $($ + DIGIT + $|$ + UNDERSCORE + $)$; // TODO: Support more characters
    DEFINE FRAGMENT DELIMITED_IDENTIFIER DOUBLE_QUOTE + DELIMITED_IDENTIFIER_BODY + DOUBLE_QUOTE;
    DEFINE FRAGMENT DELIMITED_IDENTIFIER_BODY DELIMITED_IDENTIFIER_PART + $+$;
    DEFINE FRAGMENT DELIMITED_IDENTIFIER_PART $($ + NONDOUBLEQUOTE_CHARACTER + $|$ + DOUBLEQUOTE_SYMBOL + $)$;
}

TOKENSTYLES {
    "SIMPLE_COMMENT", "BRACKETED_COMMENT"
    COLOR #999999, ITALIC;
    
    "QUOTED_STRING"
    COLOR #000099, ITALIC;
    
    "EXACT_NUMERIC_LITERAL", "APPROXIMATE_NUMERIC_LITERAL", "UNSIGNED_INTEGER"
    COLOR #009900;
}

RULES {
    // Common
    Common.SQLScript ::= (statements !0)*;

    Common.SimpleComment ::= value[SIMPLE_COMMENT];

    Common.BracketedComment ::= value[BRACKETED_COMMENT];
    
    Common.SchemaQualifiedName ::= ((catalogName[IDENTIFIER] ".")? schemaName[IDENTIFIER] ".")? name[IDENTIFIER];

    
    // Literals
    @SuppressWarnings(explicitSyntaxChoice)
    Literal.ExactNumericLiteral ::= value[EXACT_NUMERIC_LITERAL] | value[UNSIGNED_INTEGER]; 

    Literal.ApproximateNumericLiteral ::= value[APPROXIMATE_NUMERIC_LITERAL];

    Literal.CharacterStringLiteral ::= ("_" characterSetName)? values[QUOTED_STRING] (separators values[QUOTED_STRING])*;
    
    Literal.NationalCharacterStringLiteral ::= "N" values[QUOTED_STRING] (separators values[QUOTED_STRING])*;
    
    Literal.DateLiteral ::= "DATE" value[QUOTED_STRING];
    
    Literal.TimeLiteral ::= "TIME" value[QUOTED_STRING];
    
    Literal.TimestampLiteral ::= "TIMESTAMP" value[QUOTED_STRING];

    Literal.BooleanLiteral ::= value[ "TRUE" : "FALSE" ]?;


    // Schema
    Schema.TableReference ::= ((catalogName[IDENTIFIER] ".")? schemaName[IDENTIFIER] ".")? target[IDENTIFIER];

    @SuppressWarnings(explicitSyntaxChoice)
    Schema.TableDefinition ::= "CREATE"
        ( scope[ PERSISTENT : "" ]
        | scope[ GLOBAL_TEMPORARY : "GLOBAL", LOCAL_TEMPORARY : "LOCAL" ] "TEMPORARY" )
        "TABLE" schemaQualifiedName !0
        contentsSource ";" !0;

    Schema.TableElementList ::= "(" !1 elements ("," !1 elements)* !0 ")";

    Schema.Column ::= name[IDENTIFIER] dataType
        ("DEFAULT" defaultOption)?
        constraintDefinition?
        ("COLLATE" collationName)?;

    Schema.LiteralDefaultOption ::= literal;
    
    Schema.DatetimeValueFunctionDefaultOption ::= function;
    
    Schema.ImplicitlyTypedValueSpecificationDefaultOption ::= specification;
    
    Schema.NotNullColumnConstraint ::=
        ("CONSTRAINT" schemaQualifiedName)?
        "NOT" "NULL";

    Schema.UniqueColumnConstraint ::=
        ("CONSTRAINT" schemaQualifiedName)?
        kind[ UNIQUE : "UNIQUE" , PRIMARY_KEY : "PRIMARY KEY" ];

    @SuppressWarnings(explicitSyntaxChoice)
    Schema.ReferentialColumnConstraint ::=
        ("CONSTRAINT" schemaQualifiedName)?
        "REFERENCES" referencedTable
        ("(" referencedColumns[IDENTIFIER] ("," referencedColumns[IDENTIFIER])* ")")?;

    Schema.UniqueTableConstraint ::=
        ("CONSTRAINT" schemaQualifiedName)?
        kind[ UNIQUE : "UNIQUE" , PRIMARY_KEY : "PRIMARY KEY" ]
        "(" columns[IDENTIFIER] ("," columns[IDENTIFIER])* ")";

    @SuppressWarnings(explicitSyntaxChoice)
    Schema.ReferentialTableConstraint ::=
        ("CONSTRAINT" schemaQualifiedName)?
        "FOREIGN" "KEY" "(" columns[IDENTIFIER] ("," columns[IDENTIFIER])* ")"
        "REFERENCES" referencedTable
        ("(" referencedColumns[IDENTIFIER] ("," referencedColumns[IDENTIFIER])* ")")?;


    // Data types
    Datatype.ExactNumericType ::=
        kind[ NUMERIC : "NUMERIC", DECIMAL : "DECIMAL", DEC : "DEC", SMALLINT : "SMALLINT",
              INTEGER : "INTEGER", INT : "INT", BIGINT : "BIGINT" ]
        ("(" precision[UNSIGNED_INTEGER] ("," scale[UNSIGNED_INTEGER])? ")")?;

    @SuppressWarnings(explicitSyntaxChoice)
    Datatype.ApproximateNumericType ::=
        ( kind[ FLOAT : "FLOAT", REAL : "REAL" ]
        | kind[ DOUBLE_PRECISION : "DOUBLE" ] "PRECISION" )
        ("(" precision[UNSIGNED_INTEGER] ")")?;

    @SuppressWarnings(explicitSyntaxChoice)
    Datatype.CharacterStringType ::=
        ( kind[ CHARACTER : "CHARACTER", CHAR : "CHAR", VARCHAR : "VARCHAR" ]
        | kind[ CHARACTER_VARYING : "CHARACTER", CHAR_VARYING : "CHAR" ] "VARYING" )
        ("(" length[UNSIGNED_INTEGER] ")")?
        ("CHARACTER" "SET" characterSetName)?
        ("COLLATE" collationName)?;

    @SuppressWarnings(explicitSyntaxChoice)
    Datatype.NationalCharacterStringType ::= 
        ( "NATIONAL"
            ( kind[ NATIONAL_CHARACTER : "CHARACTER", NATIONAL_CHAR : "CHAR" ]
            | kind[ NATIONAL_CHARACTER_VARYING : "CHARACTER", NATIONAL_CHAR_VARYING : "CHAR" ] "VARYING")
        | kind[ NCHAR : "NCHAR" ]
        | kind[ NCHAR_VARYING : "NCHAR" ] "VARYING")
        ("(" length[UNSIGNED_INTEGER] ")")?
        ("COLLATE" collationName)?;

    @SuppressWarnings(explicitSyntaxChoice)
    Datatype.BinaryLargeObjectStringType ::=
        ( kind[ BINARY_LARGE_OBJECT : "BINARY" ] "LARGE" "OBJECT"
        | kind[ BLOB : "BLOB" ] )
        ("(" length ")")?;

    Datatype.LargeObjectLength ::= value[UNSIGNED_INTEGER]
        multiplier[ K : "K", M : "M", G : "G" ]?
        units[ CHARACTERS : "CHARACTERS", CODE_UNITS : "CODE_UNITS", OCTETS : "OCTETS" ]?;

    Datatype.DateType ::= "DATE";

    Datatype.TimeType ::= "TIME"
        ("(" precision[UNSIGNED_INTEGER] ")")?
        (withTimeZone["WITH" : "WITHOUT"] "TIME" "ZONE")?;

    Datatype.TimestampType ::= "TIMESTAMP"
        ("(" precision[UNSIGNED_INTEGER] ")")?
        (withTimeZone["WITH" : "WITHOUT"] "TIME" "ZONE")?;

    Datatype.BooleanType ::= "BOOLEAN";


    // Functions
    Function.DatetimeValueFunction ::=
        kind[ CURRENT_DATE : "CURRENT_DATE", CURRENT_TIME : "CURRENT_TIME",
              LOCALTIME : "LOCALTIME", CURRENT_TIMESTAMP : "CURRENT_TIMESTAMP",
              LOCALTIMESTAMP : "LOCALTIMESTAMP" ]
        ("(" precision[UNSIGNED_INTEGER] ")")?;


    // Expressions
    Expression.NullSpecification ::= "NULL";
}
