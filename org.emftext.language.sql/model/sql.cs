SYNTAXDEF sql
FOR <http://www.emftext.org/language/sql>
START Common.SQLScript

OPTIONS {
	reloadGeneratorModel = "true";
//    usePredefinedTokens = "false";
	caseInsensitiveKeywords = "true";
	disableBuilder = "true";
	disableDebugSupport = "true";
	disableLaunchSupport = "true";
	//disableTokenSorting = "true";
}

TOKENS {
    DEFINE FRAGMENT DECIMAL_DIGI_CHARACTER $('0'..'9')$;
    // TODO: \p{L} - \p{M}
    DEFINE FRAGMENT INITIAL_ALPHABETIC_CHARACTER $('A'..'Z'|'a'..'z')$;
    
	DEFINE BOOLEAN_LITERAL $('TRUE' | 'FALSE' | 'UNKNOWN')$;
	DEFINE UNSIGNED_INTEGER $($ + DECIMAL_DIGI_CHARACTER + $)+$;

	DEFINE FRAGMENT IDENTIFIER_START INITIAL_ALPHABETIC_CHARACTER;
	DEFINE FRAGMENT IDENTIFIER_PART $($ + INITIAL_ALPHABETIC_CHARACTER + $|$ + DECIMAL_DIGI_CHARACTER + $)$;
	//PRIORITIZE BOOLEAN_LITERAL;
	DEFINE IDENTIFIER IDENTIFIER_START + IDENTIFIER_PART + $*$;
	
	DEFINE SCHEMA_QUALIFIED_NAME $(($ + IDENTIFIER + $'.')?$ + IDENTIFIER + $'.')$ + IDENTIFIER;

//	DEFINE TEXT $('A'..'Z'|'a'..'z'|'0'..'9'|'_'|'-')+$;
}

TOKENSTYLES {
	"CHARACTER", "CHAR", "VARCHAR",
	"CHARACTER VARYING", "CHAR VARYING",
	"NATIONAL CHARACTER", "NATIONAL CHAR",
	"NCHAR", "NATIONAL CHARACTER VARYING",
	"NATIONAL CHAR VARYING", "NCHAR VARYING",
	"BINARY LARGE OBJECT", "BLOB",
	"BOOLEAN",
	"NUMERIC", "DECIMAL", "DEC", "SMALLINT",
	"INTEGER", "INT", "BIGINT",
	"FLOAT", "REAL", "DOUBLE_PRECISION",
	"DATE", "TIME", "TIMESTAMP"
	COLOR #2518B5, BOLD;
}

RULES {
	Common.SQLScript ::= (statements ";")*;
	
	@SuppressWarnings(explicitSyntaxChoice)
	Schema.TableDefinition ::= "CREATE"
		(scope[ GLOBAL_TEMPORARY : "GLOBAL", LOCAL_TEMPORARY : "LOCAL" ] "TEMPORARY")?
		"TABLE" (name[IDENTIFIER] | name[SCHEMA_QUALIFIED_NAME])
		contentsSource
		("ON" "COMMIT" commitAction[ PRESERVE_ROWS : "PRESERVE", DELETE_ROWS : "DELETE" ] "ROWS")?;
	
	Schema.TableElementList ::= "(" elements ("," elements)* ")";

	@SuppressWarnings(explicitSyntaxChoice)
	Schema.Column ::= name[IDENTIFIER] dataType
		("DEFAULT" defaultOption)?
		constraintDefinition?
		("COLLATE" (collationName[IDENTIFIER] | collationName[SCHEMA_QUALIFIED_NAME]))?;

	Schema.LiteralDefaultOption ::= literal;
	
	Schema.DatetimeValueFunctionDefaultOption ::= function;
	
	Schema.ImplicitlyTypedValueSpecificationDefaultOption ::= specification;
	
	@SuppressWarnings(explicitSyntaxChoice)
	Schema.NotNullColumnConstraint ::=
		("CONSTRAINT" (name[IDENTIFIER] | name[SCHEMA_QUALIFIED_NAME]))?
		"NOT" "NULL";

	@SuppressWarnings(explicitSyntaxChoice)
	Schema.UniqueColumnConstraint ::=
		("CONSTRAINT" (name[IDENTIFIER] | name[SCHEMA_QUALIFIED_NAME]))?
		kind[ UNIQUE : "UNIQUE" , PRIMARY_KEY : "PRIMARY KEY" ];

	@SuppressWarnings(explicitSyntaxChoice)
	Schema.ReferentialColumnConstraint ::=
		("CONSTRAINT" (name[IDENTIFIER] | name[SCHEMA_QUALIFIED_NAME]))?
		"REFERENCES" (referencedTable[IDENTIFIER] | referencedTable[SCHEMA_QUALIFIED_NAME])
		("(" referencedColumns[IDENTIFIER] ("," referencedColumns[IDENTIFIER])* ")")?;

	@SuppressWarnings(explicitSyntaxChoice)
	Schema.UniqueTableConstraint ::=
		("CONSTRAINT" (name[IDENTIFIER] | name[SCHEMA_QUALIFIED_NAME]))?
		kind[ UNIQUE : "UNIQUE" , PRIMARY_KEY : "PRIMARY KEY" ]
		"(" columns[IDENTIFIER] ("," columns[IDENTIFIER])* ")";

	@SuppressWarnings(explicitSyntaxChoice)
	Schema.ReferentialTableConstraint ::=
		("CONSTRAINT" (name[IDENTIFIER] | name[SCHEMA_QUALIFIED_NAME]))?
		"FOREIGN" "KEY" "(" columns[IDENTIFIER] ("," columns[IDENTIFIER])* ")"
		"REFERENCES" (referencedTable[IDENTIFIER] | referencedTable[SCHEMA_QUALIFIED_NAME])
		("(" referencedColumns[IDENTIFIER] ("," referencedColumns[IDENTIFIER])* ")")?;

	Literal.DateLiteral ::= "DATE" value[];
	
	Literal.TimeLiteral ::= "TIME" value[];
	
	Literal.TimestampLiteral ::= "TIMESTAMP" value[];
	
	Literal.IntervalLiteral ::= "INTERVAL" isPositive[ "+" : "-" ];
	
	Literal.BooleanLiteral ::= value[ "TRUE" : "FALSE" ]?;
	/*
	@SuppressWarnings(explicitSyntaxChoice)
	Datatype.CharacterStringType ::=
		( kind[ CHARACTER : "CHARACTER", CHAR : "CHAR", VARCHAR : "VARCHAR" ]
		| kind[ CHARACTER_VARYING : "CHARACTER", CHAR_VARYING : "CHAR" ] "VARYING" )
		("(" length[UNSIGNED_INTEGER] ")")?
		("CHARACTER" "SET" characterSetName[])?
		("COLLATE" collationName[])?;
	*/

	Datatype.CharacterStringType ::=
		kind[ CHARACTER : "CHARACTER", CHAR : "CHAR", VARCHAR : "VARCHAR",
			CHARACTER_VARYING : "CHARACTER VARYING", CHAR_VARYING : "CHAR VARYING" ]
		("(" length[UNSIGNED_INTEGER] ")")?
		("CHARACTER" "SET" characterSetName[])?
		("COLLATE" collationName[])?;

	Datatype.NationalCharacterStringType ::= 
		kind[ NATIONAL_CHARACTER : "NATIONAL CHARACTER", NATIONAL_CHAR : "NATIONAL CHAR",
			NCHAR : "NCHAR", NATIONAL_CHARACTER_VARYING : "NATIONAL CHARACTER VARYING",
			NATIONAL_CHAR_VARYING : "NATIONAL CHAR VARYING", NCHAR_VARYING : "NCHAR VARYING" ]
		("(" length[UNSIGNED_INTEGER] ")")?
		("COLLATE" collationName[])?;

	Datatype.BinaryLargeObjectStringType ::=
		kind[ BINARY_LARGE_OBJECT : "BINARY LARGE OBJECT", BLOB : "BLOB" ]
		("(" length ")")?;
		
	Datatype.LargeObjectLength ::= value[UNSIGNED_INTEGER]
		multiplier[ K : "K", M : "M", G : "G" ]?
		units[ CHARACTERS : "CHARACTERS", CODE_UNITS : "CODE_UNITS", OCTETS : "OCTETS" ]?;

	Datatype.BooleanType ::= "BOOLEAN";

	Datatype.ExactNumericType ::=
		kind[ NUMERIC : "NUMERIC", DECIMAL : "DECIMAL", DEC : "DEC", SMALLINT : "SMALLINT",
			INTEGER : "INTEGER", INT : "INT", BIGINT : "BIGINT" ]
		("(" precision[UNSIGNED_INTEGER] ("," scale[UNSIGNED_INTEGER])? ")")?;

	Datatype.ApproximateNumericType ::=
		kind[ FLOAT : "FLOAT", REAL : "REAL", DOUBLE_PRECISION : "DOUBLE_PRECISION" ]
		("(" precision[UNSIGNED_INTEGER] ")")?;

	Datatype.DatetimeType ::=
		kind[ DATE : "DATE", TIME : "TIME", TIMESTAMP : "TIMESTAMP" ]
		("(" precision[UNSIGNED_INTEGER] ")")?
		withTimeZone["WITH TIME ZONE" : "WITHOUT TIME ZONE"]?;

	Function.DatetimeValueFunction ::=
		kind[ CURRENT_DATE : "CURRENT_DATE", CURRENT_TIME : "CURRENT_TIME",
			LOCALTIME : "LOCALTIME", CURRENT_TIMESTAMP : "CURRENT_TIMESTAMP",
			LOCALTIMESTAMP : "LOCALTIMESTAMP" ]
		("(" precision[] ")")?;

	Expression.NullSpecification ::= "NULL";
}
