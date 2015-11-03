// $ANTLR 3.4

	package org.emftext.language.sql.resource.sql.mopp;
	
	import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.antlr.runtime3_4_0.ANTLRInputStream;
import org.antlr.runtime3_4_0.BitSet;
import org.antlr.runtime3_4_0.CommonToken;
import org.antlr.runtime3_4_0.CommonTokenStream;
import org.antlr.runtime3_4_0.IntStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.RecognitionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SqlParser extends SqlANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN_LITERAL", "IDENTIFIER", "KEYWORD_BOOLEAN", "KEYWORD_CHARACTER", "KEYWORD_COLLATE", "KEYWORD_COMMIT", "KEYWORD_CONSTRAINT", "KEYWORD_CREATE", "KEYWORD_DATE", "KEYWORD_DEFAULT", "KEYWORD_FOREIGN", "KEYWORD_INTERVAL", "KEYWORD_KEY", "KEYWORD_NOT", "KEYWORD_NULL", "KEYWORD_ON", "KEYWORD_REFERENCES", "KEYWORD_ROWS", "KEYWORD_SET", "KEYWORD_TABLE", "KEYWORD_TEMPORARY", "KEYWORD_TIME", "KEYWORD_TIMESTAMP", "LETTER_A", "LETTER_B", "LETTER_C", "LETTER_D", "LETTER_E", "LETTER_F", "LETTER_G", "LETTER_H", "LETTER_I", "LETTER_J", "LETTER_K", "LETTER_L", "LETTER_M", "LETTER_N", "LETTER_O", "LETTER_P", "LETTER_Q", "LETTER_R", "LETTER_S", "LETTER_T", "LETTER_U", "LETTER_V", "LETTER_W", "LETTER_X", "LETTER_Y", "LETTER_Z", "LINEBREAK", "SCHEMA_QUALIFIED_NAME", "TEXT", "UNSIGNED_INTEGER", "WHITESPACE", "'('", "')'", "'+'", "','", "'-'", "';'", "'BIGINT'", "'BINARY LARGE OBJECT'", "'BLOB'", "'CHAR VARYING'", "'CHAR'", "'CHARACTER VARYING'", "'CHARACTER'", "'CHARACTERS'", "'CODE_UNITS'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'DATE'", "'DEC'", "'DECIMAL'", "'DELETE'", "'DOUBLE_PRECISION'", "'FALSE'", "'FLOAT'", "'G'", "'GLOBAL'", "'INT'", "'INTEGER'", "'K'", "'LOCAL'", "'LOCALTIME'", "'LOCALTIMESTAMP'", "'M'", "'NATIONAL CHAR VARYING'", "'NATIONAL CHAR'", "'NATIONAL CHARACTER VARYING'", "'NATIONAL CHARACTER'", "'NCHAR VARYING'", "'NCHAR'", "'NUMERIC'", "'OCTETS'", "'PRESERVE'", "'PRIMARY KEY'", "'REAL'", "'SMALLINT'", "'TIME'", "'TIMESTAMP'", "'TRUE'", "'UNIQUE'", "'VARCHAR'", "'WITH TIME ZONE'", "'WITHOUT TIME ZONE'"
    };

    public static final int EOF=-1;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int BOOLEAN_LITERAL=4;
    public static final int IDENTIFIER=5;
    public static final int KEYWORD_BOOLEAN=6;
    public static final int KEYWORD_CHARACTER=7;
    public static final int KEYWORD_COLLATE=8;
    public static final int KEYWORD_COMMIT=9;
    public static final int KEYWORD_CONSTRAINT=10;
    public static final int KEYWORD_CREATE=11;
    public static final int KEYWORD_DATE=12;
    public static final int KEYWORD_DEFAULT=13;
    public static final int KEYWORD_FOREIGN=14;
    public static final int KEYWORD_INTERVAL=15;
    public static final int KEYWORD_KEY=16;
    public static final int KEYWORD_NOT=17;
    public static final int KEYWORD_NULL=18;
    public static final int KEYWORD_ON=19;
    public static final int KEYWORD_REFERENCES=20;
    public static final int KEYWORD_ROWS=21;
    public static final int KEYWORD_SET=22;
    public static final int KEYWORD_TABLE=23;
    public static final int KEYWORD_TEMPORARY=24;
    public static final int KEYWORD_TIME=25;
    public static final int KEYWORD_TIMESTAMP=26;
    public static final int LETTER_A=27;
    public static final int LETTER_B=28;
    public static final int LETTER_C=29;
    public static final int LETTER_D=30;
    public static final int LETTER_E=31;
    public static final int LETTER_F=32;
    public static final int LETTER_G=33;
    public static final int LETTER_H=34;
    public static final int LETTER_I=35;
    public static final int LETTER_J=36;
    public static final int LETTER_K=37;
    public static final int LETTER_L=38;
    public static final int LETTER_M=39;
    public static final int LETTER_N=40;
    public static final int LETTER_O=41;
    public static final int LETTER_P=42;
    public static final int LETTER_Q=43;
    public static final int LETTER_R=44;
    public static final int LETTER_S=45;
    public static final int LETTER_T=46;
    public static final int LETTER_U=47;
    public static final int LETTER_V=48;
    public static final int LETTER_W=49;
    public static final int LETTER_X=50;
    public static final int LETTER_Y=51;
    public static final int LETTER_Z=52;
    public static final int LINEBREAK=53;
    public static final int SCHEMA_QUALIFIED_NAME=54;
    public static final int TEXT=55;
    public static final int UNSIGNED_INTEGER=56;
    public static final int WHITESPACE=57;

    // delegates
    public SqlANTLRParserBase[] getDelegates() {
        return new SqlANTLRParserBase[] {};
    }

    // delegators


    public SqlParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(129 + 1);
         

    }

    public String[] getTokenNames() { return SqlParser.tokenNames; }
    public String getGrammarFileName() { return "Sql.g"; }


    	private org.emftext.language.sql.resource.sql.ISqlTokenResolverFactory tokenResolverFactory = new org.emftext.language.sql.resource.sql.mopp.SqlTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private List<org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal> expectedElements = new ArrayList<org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected List<RecognitionException> lexerExceptions = Collections.synchronizedList(new ArrayList<RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected List<Integer> lexerExceptionPositions = Collections.synchronizedList(new ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	List<EObject> incompleteObjects = new ArrayList<EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	private org.emftext.language.sql.resource.sql.ISqlLocationMap locationMap;
    	
    	private org.emftext.language.sql.resource.sql.mopp.SqlSyntaxErrorMessageConverter syntaxErrorMessageConverter = new org.emftext.language.sql.resource.sql.mopp.SqlSyntaxErrorMessageConverter(tokenNames);
    	
    	@Override
    	public void reportError(RecognitionException re) {
    		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
    	}
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource>() {
    			public boolean execute(org.emftext.language.sql.resource.sql.ISqlTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.emftext.language.sql.resource.sql.ISqlProblem() {
    					public org.emftext.language.sql.resource.sql.SqlEProblemSeverity getSeverity() {
    						return org.emftext.language.sql.resource.sql.SqlEProblemSeverity.ERROR;
    					}
    					public org.emftext.language.sql.resource.sql.SqlEProblemType getType() {
    						return org.emftext.language.sql.resource.sql.SqlEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public Collection<org.emftext.language.sql.resource.sql.ISqlQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	protected void addErrorToResource(org.emftext.language.sql.resource.sql.mopp.SqlLocalizedMessage message) {
    		if (message == null) {
    			return;
    		}
    		addErrorToResource(message.getMessage(), message.getColumn(), message.getLine(), message.getCharStart(), message.getCharEnd());
    	}
    	
    	public void addExpectedElement(EClass eClass, int expectationStartIndex, int expectationEndIndex) {
    		for (int expectationIndex = expectationStartIndex; expectationIndex <= expectationEndIndex; expectationIndex++) {
    			addExpectedElement(eClass, org.emftext.language.sql.resource.sql.mopp.SqlExpectationConstants.EXPECTATIONS[expectationIndex]);
    		}
    	}
    	
    	public void addExpectedElement(EClass eClass, int expectationIndex) {
    		addExpectedElement(eClass, org.emftext.language.sql.resource.sql.mopp.SqlExpectationConstants.EXPECTATIONS[expectationIndex]);
    	}
    	
    	public void addExpectedElement(EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		org.emftext.language.sql.resource.sql.ISqlExpectedElement terminal = org.emftext.language.sql.resource.sql.grammar.SqlFollowSetProvider.TERMINALS[terminalID];
    		org.emftext.language.sql.resource.sql.mopp.SqlContainedFeature[] containmentFeatures = new org.emftext.language.sql.resource.sql.mopp.SqlContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = org.emftext.language.sql.resource.sql.grammar.SqlFollowSetProvider.LINKS[ids[i]];
    		}
    		org.emftext.language.sql.resource.sql.grammar.SqlContainmentTrace containmentTrace = new org.emftext.language.sql.resource.sql.grammar.SqlContainmentTrace(eClass, containmentFeatures);
    		EObject container = getLastIncompleteElement();
    		org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal expectedElement = new org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final EObject source, final EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		final org.emftext.language.sql.resource.sql.ISqlLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource>() {
    			public boolean execute(org.emftext.language.sql.resource.sql.ISqlTextResource resource) {
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final CommonToken source, final EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		final org.emftext.language.sql.resource.sql.ISqlLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource>() {
    			public boolean execute(org.emftext.language.sql.resource.sql.ISqlTextResource resource) {
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(Collection<org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource>> postParseCommands , final EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		final org.emftext.language.sql.resource.sql.ISqlLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource>() {
    			public boolean execute(org.emftext.language.sql.resource.sql.ISqlTextResource resource) {
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public org.emftext.language.sql.resource.sql.ISqlTextParser createInstance(InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new SqlParser(new CommonTokenStream(new SqlLexer(new ANTLRInputStream(actualInputStream))));
    			} else {
    				return new SqlParser(new CommonTokenStream(new SqlLexer(new ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (IOException e) {
    			new org.emftext.language.sql.resource.sql.util.SqlRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public SqlParser() {
    		super(null);
    	}
    	
    	protected EObject doParse() throws RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((SqlLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((SqlLexer) getTokenStream().getTokenSource()).lexerExceptionPositions = lexerExceptionPositions;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof EClass) {
    			EClass type = (EClass) typeObject;
    			if (type.getInstanceClass() == org.emftext.language.sql.common.SQLScript.class) {
    				return parse_org_emftext_language_sql_common_SQLScript();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.TableDefinition.class) {
    				return parse_org_emftext_language_sql_schema_TableDefinition();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.TableElementList.class) {
    				return parse_org_emftext_language_sql_schema_TableElementList();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.Column.class) {
    				return parse_org_emftext_language_sql_schema_Column();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.LiteralDefaultOption.class) {
    				return parse_org_emftext_language_sql_schema_LiteralDefaultOption();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption.class) {
    				return parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption.class) {
    				return parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.NotNullColumnConstraint.class) {
    				return parse_org_emftext_language_sql_schema_NotNullColumnConstraint();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.UniqueColumnConstraint.class) {
    				return parse_org_emftext_language_sql_schema_UniqueColumnConstraint();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.ReferentialColumnConstraint.class) {
    				return parse_org_emftext_language_sql_schema_ReferentialColumnConstraint();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.UniqueTableConstraint.class) {
    				return parse_org_emftext_language_sql_schema_UniqueTableConstraint();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.ReferentialTableConstraint.class) {
    				return parse_org_emftext_language_sql_schema_ReferentialTableConstraint();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.DateLiteral.class) {
    				return parse_org_emftext_language_sql_literal_DateLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.TimeLiteral.class) {
    				return parse_org_emftext_language_sql_literal_TimeLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.TimestampLiteral.class) {
    				return parse_org_emftext_language_sql_literal_TimestampLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.IntervalLiteral.class) {
    				return parse_org_emftext_language_sql_literal_IntervalLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.BooleanLiteral.class) {
    				return parse_org_emftext_language_sql_literal_BooleanLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.CharacterStringType.class) {
    				return parse_org_emftext_language_sql_datatype_CharacterStringType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.NationalCharacterStringType.class) {
    				return parse_org_emftext_language_sql_datatype_NationalCharacterStringType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.BinaryLargeObjectStringType.class) {
    				return parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.LargeObjectLength.class) {
    				return parse_org_emftext_language_sql_datatype_LargeObjectLength();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.BooleanType.class) {
    				return parse_org_emftext_language_sql_datatype_BooleanType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.ExactNumericType.class) {
    				return parse_org_emftext_language_sql_datatype_ExactNumericType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.ApproximateNumericType.class) {
    				return parse_org_emftext_language_sql_datatype_ApproximateNumericType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.DatetimeType.class) {
    				return parse_org_emftext_language_sql_datatype_DatetimeType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.function.DatetimeValueFunction.class) {
    				return parse_org_emftext_language_sql_function_DatetimeValueFunction();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.expression.NullSpecification.class) {
    				return parse_org_emftext_language_sql_expression_NullSpecification();
    			}
    		}
    		throw new org.emftext.language.sql.resource.sql.mopp.SqlUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(IntStream arg0, RecognitionException arg1, int arg2, BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.emftext.language.sql.resource.sql.ISqlOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.emftext.language.sql.resource.sql.ISqlParseResult parse() {
    		// Reset parser state
    		terminateParsing = false;
    		postParseCommands = new ArrayList<org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource>>();
    		org.emftext.language.sql.resource.sql.mopp.SqlParseResult parseResult = new org.emftext.language.sql.resource.sql.mopp.SqlParseResult();
    		if (disableLocationMap) {
    			locationMap = new org.emftext.language.sql.resource.sql.mopp.SqlDevNullLocationMap();
    		} else {
    			locationMap = new org.emftext.language.sql.resource.sql.mopp.SqlLocationMap();
    		}
    		// Run parser
    		try {
    			EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    				parseResult.setLocationMap(locationMap);
    			}
    		} catch (RecognitionException re) {
    			addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
    		} catch (IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (RecognitionException re : lexerExceptions) {
    			addErrorToResource(syntaxErrorMessageConverter.translateLexicalError(re, lexerExceptions, lexerExceptionPositions));
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public List<org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal> parseToExpectedElements(EClass type, org.emftext.language.sql.resource.sql.ISqlTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final CommonTokenStream tokenStream = (CommonTokenStream) getTokenStream();
    		org.emftext.language.sql.resource.sql.ISqlParseResult result = parse();
    		for (EObject incompleteObject : incompleteObjects) {
    			Lexer lexer = (Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		Set<org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal> currentFollowSet = new LinkedHashSet<org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal>();
    		List<org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal> newFollowSet = new ArrayList<org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 166;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			CommonToken nextToken = (CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						Collection<org.emftext.language.sql.resource.sql.util.SqlPair<org.emftext.language.sql.resource.sql.ISqlExpectedElement, org.emftext.language.sql.resource.sql.mopp.SqlContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.emftext.language.sql.resource.sql.util.SqlPair<org.emftext.language.sql.resource.sql.ISqlExpectedElement, org.emftext.language.sql.resource.sql.mopp.SqlContainedFeature[]> newFollowerPair : newFollowers) {
    							org.emftext.language.sql.resource.sql.ISqlExpectedElement newFollower = newFollowerPair.getLeft();
    							EObject container = getLastIncompleteElement();
    							org.emftext.language.sql.resource.sql.grammar.SqlContainmentTrace containmentTrace = new org.emftext.language.sql.resource.sql.grammar.SqlContainmentTrace(null, newFollowerPair.getRight());
    							org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal newFollowTerminal = new org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			CommonToken tokenAtIndex = (CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof EObject) {
    			this.incompleteObjects.add((EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			this.incompleteObjects.remove(object);
    		}
    		if (object instanceof EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Sql.g:560:1: start returns [ EObject element = null] : (c0= parse_org_emftext_language_sql_common_SQLScript ) EOF ;
    public final EObject start() throws RecognitionException {
        EObject element =  null;

        int start_StartIndex = input.index();

        org.emftext.language.sql.common.SQLScript c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Sql.g:561:2: ( (c0= parse_org_emftext_language_sql_common_SQLScript ) EOF )
            // Sql.g:562:2: (c0= parse_org_emftext_language_sql_common_SQLScript ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 0);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Sql.g:567:2: (c0= parse_org_emftext_language_sql_common_SQLScript )
            // Sql.g:568:3: c0= parse_org_emftext_language_sql_common_SQLScript
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SQLScript_in_start82);
            c0=parse_org_emftext_language_sql_common_SQLScript();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_org_emftext_language_sql_common_SQLScript"
    // Sql.g:576:1: parse_org_emftext_language_sql_common_SQLScript returns [org.emftext.language.sql.common.SQLScript element = null] : ( ( (a0_0= parse_org_emftext_language_sql_common_DirectSQLStatement ) a1= ';' ) )* ;
    public final org.emftext.language.sql.common.SQLScript parse_org_emftext_language_sql_common_SQLScript() throws RecognitionException {
        org.emftext.language.sql.common.SQLScript element =  null;

        int parse_org_emftext_language_sql_common_SQLScript_StartIndex = input.index();

        Token a1=null;
        org.emftext.language.sql.common.DirectSQLStatement a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Sql.g:579:2: ( ( ( (a0_0= parse_org_emftext_language_sql_common_DirectSQLStatement ) a1= ';' ) )* )
            // Sql.g:580:2: ( ( (a0_0= parse_org_emftext_language_sql_common_DirectSQLStatement ) a1= ';' ) )*
            {
            // Sql.g:580:2: ( ( (a0_0= parse_org_emftext_language_sql_common_DirectSQLStatement ) a1= ';' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_CREATE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Sql.g:581:3: ( (a0_0= parse_org_emftext_language_sql_common_DirectSQLStatement ) a1= ';' )
            	    {
            	    // Sql.g:581:3: ( (a0_0= parse_org_emftext_language_sql_common_DirectSQLStatement ) a1= ';' )
            	    // Sql.g:582:4: (a0_0= parse_org_emftext_language_sql_common_DirectSQLStatement ) a1= ';'
            	    {
            	    // Sql.g:582:4: (a0_0= parse_org_emftext_language_sql_common_DirectSQLStatement )
            	    // Sql.g:583:5: a0_0= parse_org_emftext_language_sql_common_DirectSQLStatement
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_DirectSQLStatement_in_parse_org_emftext_language_sql_common_SQLScript130);
            	    a0_0=parse_org_emftext_language_sql_common_DirectSQLStatement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSQLScript();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a0_0 != null) {
            	    						if (a0_0 != null) {
            	    							Object value = a0_0;
            	    							addObjectToList(element, org.emftext.language.sql.common.CommonPackage.SQL_SCRIPT__STATEMENTS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_0_0_0_0_0_0_0, a0_0, true);
            	    						copyLocalizationInfos(a0_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 1);
            	    			}

            	    a1=(Token)match(input,63,FOLLOW_63_in_parse_org_emftext_language_sql_common_SQLScript158); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSQLScript();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_0_0_0_0_0_0_1, null, true);
            	    				copyLocalizationInfos((CommonToken)a1, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				// We've found the last token for this rule. The constructed EObject is now
            	    				// complete.
            	    				completedElement(element, true);
            	    				addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 2);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 3);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_emftext_language_sql_common_SQLScript_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_common_SQLScript"



    // $ANTLR start "parse_org_emftext_language_sql_schema_TableDefinition"
    // Sql.g:637:1: parse_org_emftext_language_sql_schema_TableDefinition returns [org.emftext.language.sql.schema.TableDefinition element = null] : a0= KEYWORD_CREATE ( ( ( (a1= 'GLOBAL' |a2= 'LOCAL' ) ) a5= KEYWORD_TEMPORARY ) )? a6= KEYWORD_TABLE ( (a7= IDENTIFIER ) | (a8= SCHEMA_QUALIFIED_NAME ) ) (a9_0= parse_org_emftext_language_sql_schema_TableContentsSource ) ( (a10= KEYWORD_ON a11= KEYWORD_COMMIT ( (a12= 'PRESERVE' |a13= 'DELETE' ) ) a16= KEYWORD_ROWS ) )? ;
    public final org.emftext.language.sql.schema.TableDefinition parse_org_emftext_language_sql_schema_TableDefinition() throws RecognitionException {
        org.emftext.language.sql.schema.TableDefinition element =  null;

        int parse_org_emftext_language_sql_schema_TableDefinition_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a16=null;
        org.emftext.language.sql.schema.TableContentsSource a9_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Sql.g:640:2: (a0= KEYWORD_CREATE ( ( ( (a1= 'GLOBAL' |a2= 'LOCAL' ) ) a5= KEYWORD_TEMPORARY ) )? a6= KEYWORD_TABLE ( (a7= IDENTIFIER ) | (a8= SCHEMA_QUALIFIED_NAME ) ) (a9_0= parse_org_emftext_language_sql_schema_TableContentsSource ) ( (a10= KEYWORD_ON a11= KEYWORD_COMMIT ( (a12= 'PRESERVE' |a13= 'DELETE' ) ) a16= KEYWORD_ROWS ) )? )
            // Sql.g:641:2: a0= KEYWORD_CREATE ( ( ( (a1= 'GLOBAL' |a2= 'LOCAL' ) ) a5= KEYWORD_TEMPORARY ) )? a6= KEYWORD_TABLE ( (a7= IDENTIFIER ) | (a8= SCHEMA_QUALIFIED_NAME ) ) (a9_0= parse_org_emftext_language_sql_schema_TableContentsSource ) ( (a10= KEYWORD_ON a11= KEYWORD_COMMIT ( (a12= 'PRESERVE' |a13= 'DELETE' ) ) a16= KEYWORD_ROWS ) )?
            {
            a0=(Token)match(input,KEYWORD_CREATE,FOLLOW_KEYWORD_CREATE_in_parse_org_emftext_language_sql_schema_TableDefinition206); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 4, 5);
            	}

            // Sql.g:655:2: ( ( ( (a1= 'GLOBAL' |a2= 'LOCAL' ) ) a5= KEYWORD_TEMPORARY ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==84||LA3_0==88) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Sql.g:656:3: ( ( (a1= 'GLOBAL' |a2= 'LOCAL' ) ) a5= KEYWORD_TEMPORARY )
                    {
                    // Sql.g:656:3: ( ( (a1= 'GLOBAL' |a2= 'LOCAL' ) ) a5= KEYWORD_TEMPORARY )
                    // Sql.g:657:4: ( (a1= 'GLOBAL' |a2= 'LOCAL' ) ) a5= KEYWORD_TEMPORARY
                    {
                    // Sql.g:657:4: ( (a1= 'GLOBAL' |a2= 'LOCAL' ) )
                    // Sql.g:658:5: (a1= 'GLOBAL' |a2= 'LOCAL' )
                    {
                    // Sql.g:658:5: (a1= 'GLOBAL' |a2= 'LOCAL' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==84) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==88) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;

                    }
                    switch (alt2) {
                        case 1 :
                            // Sql.g:659:6: a1= 'GLOBAL'
                            {
                            a1=(Token)match(input,84,FOLLOW_84_in_parse_org_emftext_language_sql_schema_TableDefinition242); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_1_0_0_0, null, true);
                            						copyLocalizationInfos((CommonToken)a1, element);
                            						// set value of enumeration attribute
                            						Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.GLOBAL_TEMPORARY_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 2 :
                            // Sql.g:672:12: a2= 'LOCAL'
                            {
                            a2=(Token)match(input,88,FOLLOW_88_in_parse_org_emftext_language_sql_schema_TableDefinition261); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_1_0_0_0, null, true);
                            						copyLocalizationInfos((CommonToken)a2, element);
                            						// set value of enumeration attribute
                            						Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.LOCAL_TEMPORARY_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;

                    }


                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 6);
                    			}

                    a5=(Token)match(input,KEYWORD_TEMPORARY,FOLLOW_KEYWORD_TEMPORARY_in_parse_org_emftext_language_sql_schema_TableDefinition292); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_1_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 7);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 8);
            	}

            a6=(Token)match(input,KEYWORD_TABLE,FOLLOW_KEYWORD_TABLE_in_parse_org_emftext_language_sql_schema_TableDefinition325); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 9, 10);
            	}

            // Sql.g:727:2: ( (a7= IDENTIFIER ) | (a8= SCHEMA_QUALIFIED_NAME ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENTIFIER) ) {
                alt4=1;
            }
            else if ( (LA4_0==SCHEMA_QUALIFIED_NAME) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Sql.g:728:3: (a7= IDENTIFIER )
                    {
                    // Sql.g:728:3: (a7= IDENTIFIER )
                    // Sql.g:729:4: a7= IDENTIFIER
                    {
                    a7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_TableDefinition348); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					startIncompleteElement(element);
                    				}
                    				if (a7 != null) {
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    					tokenResolver.setOptions(getOptions());
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__NAME), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a7).getLine(), ((CommonToken) a7).getCharPositionInLine(), ((CommonToken) a7).getStartIndex(), ((CommonToken) a7).getStopIndex());
                    					}
                    					org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__NAME), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_3_0_0_0, resolved, true);
                    					copyLocalizationInfos((CommonToken) a7, element);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 11);
                    		}

                    }
                    break;
                case 2 :
                    // Sql.g:765:6: (a8= SCHEMA_QUALIFIED_NAME )
                    {
                    // Sql.g:765:6: (a8= SCHEMA_QUALIFIED_NAME )
                    // Sql.g:766:4: a8= SCHEMA_QUALIFIED_NAME
                    {
                    a8=(Token)match(input,SCHEMA_QUALIFIED_NAME,FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_TableDefinition386); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					startIncompleteElement(element);
                    				}
                    				if (a8 != null) {
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SCHEMA_QUALIFIED_NAME");
                    					tokenResolver.setOptions(getOptions());
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__NAME), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
                    					}
                    					org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__NAME), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_3_0_1_0, resolved, true);
                    					copyLocalizationInfos((CommonToken) a8, element);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 12);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 13);
            	}

            // Sql.g:807:2: (a9_0= parse_org_emftext_language_sql_schema_TableContentsSource )
            // Sql.g:808:3: a9_0= parse_org_emftext_language_sql_schema_TableContentsSource
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableContentsSource_in_parse_org_emftext_language_sql_schema_TableDefinition424);
            a9_0=parse_org_emftext_language_sql_schema_TableContentsSource();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
            				startIncompleteElement(element);
            			}
            			if (a9_0 != null) {
            				if (a9_0 != null) {
            					Object value = a9_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_4, a9_0, true);
            				copyLocalizationInfos(a9_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 14, 15);
            	}

            // Sql.g:833:2: ( (a10= KEYWORD_ON a11= KEYWORD_COMMIT ( (a12= 'PRESERVE' |a13= 'DELETE' ) ) a16= KEYWORD_ROWS ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_ON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Sql.g:834:3: (a10= KEYWORD_ON a11= KEYWORD_COMMIT ( (a12= 'PRESERVE' |a13= 'DELETE' ) ) a16= KEYWORD_ROWS )
                    {
                    // Sql.g:834:3: (a10= KEYWORD_ON a11= KEYWORD_COMMIT ( (a12= 'PRESERVE' |a13= 'DELETE' ) ) a16= KEYWORD_ROWS )
                    // Sql.g:835:4: a10= KEYWORD_ON a11= KEYWORD_COMMIT ( (a12= 'PRESERVE' |a13= 'DELETE' ) ) a16= KEYWORD_ROWS
                    {
                    a10=(Token)match(input,KEYWORD_ON,FOLLOW_KEYWORD_ON_in_parse_org_emftext_language_sql_schema_TableDefinition451); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_5_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 16);
                    			}

                    a11=(Token)match(input,KEYWORD_COMMIT,FOLLOW_KEYWORD_COMMIT_in_parse_org_emftext_language_sql_schema_TableDefinition471); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_5_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 17);
                    			}

                    // Sql.g:863:4: ( (a12= 'PRESERVE' |a13= 'DELETE' ) )
                    // Sql.g:864:5: (a12= 'PRESERVE' |a13= 'DELETE' )
                    {
                    // Sql.g:864:5: (a12= 'PRESERVE' |a13= 'DELETE' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==100) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==79) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }
                    switch (alt5) {
                        case 1 :
                            // Sql.g:865:6: a12= 'PRESERVE'
                            {
                            a12=(Token)match(input,100,FOLLOW_100_in_parse_org_emftext_language_sql_schema_TableDefinition504); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_5_0_0_2, null, true);
                            						copyLocalizationInfos((CommonToken)a12, element);
                            						// set value of enumeration attribute
                            						Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableCommitAction().getEEnumLiteral(org.emftext.language.sql.schema.TableCommitAction.PRESERVE_ROWS_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__COMMIT_ACTION), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 2 :
                            // Sql.g:878:12: a13= 'DELETE'
                            {
                            a13=(Token)match(input,79,FOLLOW_79_in_parse_org_emftext_language_sql_schema_TableDefinition523); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_5_0_0_2, null, true);
                            						copyLocalizationInfos((CommonToken)a13, element);
                            						// set value of enumeration attribute
                            						Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableCommitAction().getEEnumLiteral(org.emftext.language.sql.schema.TableCommitAction.DELETE_ROWS_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__COMMIT_ACTION), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;

                    }


                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 18);
                    			}

                    a16=(Token)match(input,KEYWORD_ROWS,FOLLOW_KEYWORD_ROWS_in_parse_org_emftext_language_sql_schema_TableDefinition554); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_5_0_0_3, null, true);
                    				copyLocalizationInfos((CommonToken)a16, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 19);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 20);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_emftext_language_sql_schema_TableDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_TableDefinition"



    // $ANTLR start "parse_org_emftext_language_sql_schema_TableElementList"
    // Sql.g:927:1: parse_org_emftext_language_sql_schema_TableElementList returns [org.emftext.language.sql.schema.TableElementList element = null] : a0= '(' (a1_0= parse_org_emftext_language_sql_schema_TableElement ) ( (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) ) )* a4= ')' ;
    public final org.emftext.language.sql.schema.TableElementList parse_org_emftext_language_sql_schema_TableElementList() throws RecognitionException {
        org.emftext.language.sql.schema.TableElementList element =  null;

        int parse_org_emftext_language_sql_schema_TableElementList_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a4=null;
        org.emftext.language.sql.schema.TableElement a1_0 =null;

        org.emftext.language.sql.schema.TableElement a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Sql.g:930:2: (a0= '(' (a1_0= parse_org_emftext_language_sql_schema_TableElement ) ( (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) ) )* a4= ')' )
            // Sql.g:931:2: a0= '(' (a1_0= parse_org_emftext_language_sql_schema_TableElement ) ( (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) ) )* a4= ')'
            {
            a0=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_TableElementList602); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(), 21, 25);
            	}

            // Sql.g:945:2: (a1_0= parse_org_emftext_language_sql_schema_TableElement )
            // Sql.g:946:3: a1_0= parse_org_emftext_language_sql_schema_TableElement
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableElement_in_parse_org_emftext_language_sql_schema_TableElementList620);
            a1_0=parse_org_emftext_language_sql_schema_TableElement();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
            				startIncompleteElement(element);
            			}
            			if (a1_0 != null) {
            				if (a1_0 != null) {
            					Object value = a1_0;
            					addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.TABLE_ELEMENT_LIST__ELEMENTS, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 26, 27);
            	}

            // Sql.g:971:2: ( (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==61) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Sql.g:972:3: (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) )
            	    {
            	    // Sql.g:972:3: (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) )
            	    // Sql.g:973:4: a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement )
            	    {
            	    a2=(Token)match(input,61,FOLLOW_61_in_parse_org_emftext_language_sql_schema_TableElementList647); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_2_0_0_0, null, true);
            	    				copyLocalizationInfos((CommonToken)a2, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(), 28, 32);
            	    			}

            	    // Sql.g:987:4: (a3_0= parse_org_emftext_language_sql_schema_TableElement )
            	    // Sql.g:988:5: a3_0= parse_org_emftext_language_sql_schema_TableElement
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableElement_in_parse_org_emftext_language_sql_schema_TableElementList673);
            	    a3_0=parse_org_emftext_language_sql_schema_TableElement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a3_0 != null) {
            	    						if (a3_0 != null) {
            	    							Object value = a3_0;
            	    							addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.TABLE_ELEMENT_LIST__ELEMENTS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_2_0_0_1, a3_0, true);
            	    						copyLocalizationInfos(a3_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 33, 34);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 35, 36);
            	}

            a4=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_TableElementList714); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 37, 38);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_emftext_language_sql_schema_TableElementList_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_TableElementList"



    // $ANTLR start "parse_org_emftext_language_sql_schema_Column"
    // Sql.g:1039:1: parse_org_emftext_language_sql_schema_Column returns [org.emftext.language.sql.schema.Column element = null] : (a0= IDENTIFIER ) (a1_0= parse_org_emftext_language_sql_datatype_DataType ) ( (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) ) )? ( (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint ) )? ( (a5= KEYWORD_COLLATE ( (a6= IDENTIFIER ) | (a7= SCHEMA_QUALIFIED_NAME ) ) ) )? ;
    public final org.emftext.language.sql.schema.Column parse_org_emftext_language_sql_schema_Column() throws RecognitionException {
        org.emftext.language.sql.schema.Column element =  null;

        int parse_org_emftext_language_sql_schema_Column_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        org.emftext.language.sql.datatype.DataType a1_0 =null;

        org.emftext.language.sql.schema.DefaultOption a3_0 =null;

        org.emftext.language.sql.schema.ColumnConstraint a4_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Sql.g:1042:2: ( (a0= IDENTIFIER ) (a1_0= parse_org_emftext_language_sql_datatype_DataType ) ( (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) ) )? ( (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint ) )? ( (a5= KEYWORD_COLLATE ( (a6= IDENTIFIER ) | (a7= SCHEMA_QUALIFIED_NAME ) ) ) )? )
            // Sql.g:1043:2: (a0= IDENTIFIER ) (a1_0= parse_org_emftext_language_sql_datatype_DataType ) ( (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) ) )? ( (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint ) )? ( (a5= KEYWORD_COLLATE ( (a6= IDENTIFIER ) | (a7= SCHEMA_QUALIFIED_NAME ) ) ) )?
            {
            // Sql.g:1043:2: (a0= IDENTIFIER )
            // Sql.g:1044:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_Column747); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
            				}
            				org.emftext.language.sql.Identifier resolved = (org.emftext.language.sql.Identifier) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_0, resolved, true);
            				copyLocalizationInfos((CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 39, 45);
            	}

            // Sql.g:1079:2: (a1_0= parse_org_emftext_language_sql_datatype_DataType )
            // Sql.g:1080:3: a1_0= parse_org_emftext_language_sql_datatype_DataType
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_DataType_in_parse_org_emftext_language_sql_schema_Column772);
            a1_0=parse_org_emftext_language_sql_datatype_DataType();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            				startIncompleteElement(element);
            			}
            			if (a1_0 != null) {
            				if (a1_0 != null) {
            					Object value = a1_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__DATA_TYPE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 46);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 47, 52);
            		addExpectedElement(null, 53, 55);
            	}

            // Sql.g:1107:2: ( (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_DEFAULT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Sql.g:1108:3: (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) )
                    {
                    // Sql.g:1108:3: (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) )
                    // Sql.g:1109:4: a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption )
                    {
                    a2=(Token)match(input,KEYWORD_DEFAULT,FOLLOW_KEYWORD_DEFAULT_in_parse_org_emftext_language_sql_schema_Column799); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 56, 68);
                    				addExpectedElement(null, 69, 71);
                    			}

                    // Sql.g:1124:4: (a3_0= parse_org_emftext_language_sql_schema_DefaultOption )
                    // Sql.g:1125:5: a3_0= parse_org_emftext_language_sql_schema_DefaultOption
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_DefaultOption_in_parse_org_emftext_language_sql_schema_Column825);
                    a3_0=parse_org_emftext_language_sql_schema_DefaultOption();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    						startIncompleteElement(element);
                    					}
                    					if (a3_0 != null) {
                    						if (a3_0 != null) {
                    							Object value = a3_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__DEFAULT_OPTION), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_2_0_0_1, a3_0, true);
                    						copyLocalizationInfos(a3_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 72, 77);
                    				addExpectedElement(null, 78, 80);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 81, 86);
            		addExpectedElement(null, 87, 89);
            	}

            // Sql.g:1159:2: ( (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_CONSTRAINT||LA9_0==KEYWORD_NOT||LA9_0==KEYWORD_REFERENCES||LA9_0==101||LA9_0==107) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Sql.g:1160:3: (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint )
                    {
                    // Sql.g:1160:3: (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint )
                    // Sql.g:1161:4: a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_ColumnConstraint_in_parse_org_emftext_language_sql_schema_Column875);
                    a4_0=parse_org_emftext_language_sql_schema_ColumnConstraint();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    					startIncompleteElement(element);
                    				}
                    				if (a4_0 != null) {
                    					if (a4_0 != null) {
                    						Object value = a4_0;
                    						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__CONSTRAINT_DEFINITION), value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_3, a4_0, true);
                    					copyLocalizationInfos(a4_0, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 90, 92);
            	}

            // Sql.g:1187:2: ( (a5= KEYWORD_COLLATE ( (a6= IDENTIFIER ) | (a7= SCHEMA_QUALIFIED_NAME ) ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_COLLATE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Sql.g:1188:3: (a5= KEYWORD_COLLATE ( (a6= IDENTIFIER ) | (a7= SCHEMA_QUALIFIED_NAME ) ) )
                    {
                    // Sql.g:1188:3: (a5= KEYWORD_COLLATE ( (a6= IDENTIFIER ) | (a7= SCHEMA_QUALIFIED_NAME ) ) )
                    // Sql.g:1189:4: a5= KEYWORD_COLLATE ( (a6= IDENTIFIER ) | (a7= SCHEMA_QUALIFIED_NAME ) )
                    {
                    a5=(Token)match(input,KEYWORD_COLLATE,FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_schema_Column910); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 93, 94);
                    			}

                    // Sql.g:1203:4: ( (a6= IDENTIFIER ) | (a7= SCHEMA_QUALIFIED_NAME ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==IDENTIFIER) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==SCHEMA_QUALIFIED_NAME) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }
                    switch (alt10) {
                        case 1 :
                            // Sql.g:1204:5: (a6= IDENTIFIER )
                            {
                            // Sql.g:1204:5: (a6= IDENTIFIER )
                            // Sql.g:1205:6: a6= IDENTIFIER
                            {
                            a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_Column943); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                            							startIncompleteElement(element);
                            						}
                            						if (a6 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__COLLATION_NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a6).getLine(), ((CommonToken) a6).getCharPositionInLine(), ((CommonToken) a6).getStartIndex(), ((CommonToken) a6).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__COLLATION_NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_4_0_0_1_0_0_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a6, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 95, 96);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:1241:10: (a7= SCHEMA_QUALIFIED_NAME )
                            {
                            // Sql.g:1241:10: (a7= SCHEMA_QUALIFIED_NAME )
                            // Sql.g:1242:6: a7= SCHEMA_QUALIFIED_NAME
                            {
                            a7=(Token)match(input,SCHEMA_QUALIFIED_NAME,FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_Column999); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                            							startIncompleteElement(element);
                            						}
                            						if (a7 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SCHEMA_QUALIFIED_NAME");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__COLLATION_NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a7).getLine(), ((CommonToken) a7).getCharPositionInLine(), ((CommonToken) a7).getStartIndex(), ((CommonToken) a7).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__COLLATION_NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_4_0_0_1_0_1_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a7, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					// We've found the last token for this rule. The constructed EObject is now
                            					// complete.
                            					completedElement(element, true);
                            					addExpectedElement(null, 97, 98);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 99, 100);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 101, 102);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_emftext_language_sql_schema_Column_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_Column"



    // $ANTLR start "parse_org_emftext_language_sql_schema_LiteralDefaultOption"
    // Sql.g:1301:1: parse_org_emftext_language_sql_schema_LiteralDefaultOption returns [org.emftext.language.sql.schema.LiteralDefaultOption element = null] : (a0_0= parse_org_emftext_language_sql_literal_Literal ) ;
    public final org.emftext.language.sql.schema.LiteralDefaultOption parse_org_emftext_language_sql_schema_LiteralDefaultOption() throws RecognitionException {
        org.emftext.language.sql.schema.LiteralDefaultOption element =  null;

        int parse_org_emftext_language_sql_schema_LiteralDefaultOption_StartIndex = input.index();

        org.emftext.language.sql.literal.Literal a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Sql.g:1304:2: ( (a0_0= parse_org_emftext_language_sql_literal_Literal ) )
            // Sql.g:1305:2: (a0_0= parse_org_emftext_language_sql_literal_Literal )
            {
            // Sql.g:1305:2: (a0_0= parse_org_emftext_language_sql_literal_Literal )
            // Sql.g:1306:3: a0_0= parse_org_emftext_language_sql_literal_Literal
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_Literal_in_parse_org_emftext_language_sql_schema_LiteralDefaultOption1083);
            a0_0=parse_org_emftext_language_sql_literal_Literal();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createLiteralDefaultOption();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_4_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 103, 108);
            		addExpectedElement(null, 109, 111);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_emftext_language_sql_schema_LiteralDefaultOption_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_LiteralDefaultOption"



    // $ANTLR start "parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption"
    // Sql.g:1337:1: parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption returns [org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption element = null] : (a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction ) ;
    public final org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption() throws RecognitionException {
        org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption element =  null;

        int parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption_StartIndex = input.index();

        org.emftext.language.sql.function.DatetimeValueFunction a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Sql.g:1340:2: ( (a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction ) )
            // Sql.g:1341:2: (a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction )
            {
            // Sql.g:1341:2: (a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction )
            // Sql.g:1342:3: a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_function_DatetimeValueFunction_in_parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption1120);
            a0_0=parse_org_emftext_language_sql_function_DatetimeValueFunction();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createDatetimeValueFunctionDefaultOption();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_5_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 112, 117);
            		addExpectedElement(null, 118, 120);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption"



    // $ANTLR start "parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption"
    // Sql.g:1373:1: parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption returns [org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption element = null] : (a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification ) ;
    public final org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption() throws RecognitionException {
        org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption element =  null;

        int parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption_StartIndex = input.index();

        org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Sql.g:1376:2: ( (a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification ) )
            // Sql.g:1377:2: (a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification )
            {
            // Sql.g:1377:2: (a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification )
            // Sql.g:1378:3: a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification_in_parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption1157);
            a0_0=parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createImplicitlyTypedValueSpecificationDefaultOption();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_6_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 121, 126);
            		addExpectedElement(null, 127, 129);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption"



    // $ANTLR start "parse_org_emftext_language_sql_schema_NotNullColumnConstraint"
    // Sql.g:1409:1: parse_org_emftext_language_sql_schema_NotNullColumnConstraint returns [org.emftext.language.sql.schema.NotNullColumnConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? a3= KEYWORD_NOT a4= KEYWORD_NULL ;
    public final org.emftext.language.sql.schema.NotNullColumnConstraint parse_org_emftext_language_sql_schema_NotNullColumnConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.NotNullColumnConstraint element =  null;

        int parse_org_emftext_language_sql_schema_NotNullColumnConstraint_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Sql.g:1412:2: ( ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? a3= KEYWORD_NOT a4= KEYWORD_NULL )
            // Sql.g:1413:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? a3= KEYWORD_NOT a4= KEYWORD_NULL
            {
            // Sql.g:1413:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_CONSTRAINT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Sql.g:1414:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    {
                    // Sql.g:1414:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    // Sql.g:1415:4: a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1199); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 130, 131);
                    			}

                    // Sql.g:1429:4: ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==IDENTIFIER) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==SCHEMA_QUALIFIED_NAME) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }
                    switch (alt12) {
                        case 1 :
                            // Sql.g:1430:5: (a1= IDENTIFIER )
                            {
                            // Sql.g:1430:5: (a1= IDENTIFIER )
                            // Sql.g:1431:6: a1= IDENTIFIER
                            {
                            a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1232); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a1 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_0_0_0_1_0_0_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a1, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 132);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:1467:10: (a2= SCHEMA_QUALIFIED_NAME )
                            {
                            // Sql.g:1467:10: (a2= SCHEMA_QUALIFIED_NAME )
                            // Sql.g:1468:6: a2= SCHEMA_QUALIFIED_NAME
                            {
                            a2=(Token)match(input,SCHEMA_QUALIFIED_NAME,FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1288); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a2 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SCHEMA_QUALIFIED_NAME");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_0_0_0_1_0_1_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a2, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 133);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 134);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 135);
            	}

            a3=(Token)match(input,KEYWORD_NOT,FOLLOW_KEYWORD_NOT_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1353); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 136);
            	}

            a4=(Token)match(input,KEYWORD_NULL,FOLLOW_KEYWORD_NULL_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1367); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 137, 139);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_emftext_language_sql_schema_NotNullColumnConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_NotNullColumnConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_schema_UniqueColumnConstraint"
    // Sql.g:1549:1: parse_org_emftext_language_sql_schema_UniqueColumnConstraint returns [org.emftext.language.sql.schema.UniqueColumnConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? ( (a3= 'UNIQUE' |a4= 'PRIMARY KEY' ) ) ;
    public final org.emftext.language.sql.schema.UniqueColumnConstraint parse_org_emftext_language_sql_schema_UniqueColumnConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.UniqueColumnConstraint element =  null;

        int parse_org_emftext_language_sql_schema_UniqueColumnConstraint_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Sql.g:1552:2: ( ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? ( (a3= 'UNIQUE' |a4= 'PRIMARY KEY' ) ) )
            // Sql.g:1553:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? ( (a3= 'UNIQUE' |a4= 'PRIMARY KEY' ) )
            {
            // Sql.g:1553:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_CONSTRAINT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Sql.g:1554:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    {
                    // Sql.g:1554:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    // Sql.g:1555:4: a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1405); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_8_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 140, 141);
                    			}

                    // Sql.g:1569:4: ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==IDENTIFIER) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==SCHEMA_QUALIFIED_NAME) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }
                    switch (alt14) {
                        case 1 :
                            // Sql.g:1570:5: (a1= IDENTIFIER )
                            {
                            // Sql.g:1570:5: (a1= IDENTIFIER )
                            // Sql.g:1571:6: a1= IDENTIFIER
                            {
                            a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1438); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a1 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_8_0_0_0_0_0_1_0_0_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a1, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 142);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:1607:10: (a2= SCHEMA_QUALIFIED_NAME )
                            {
                            // Sql.g:1607:10: (a2= SCHEMA_QUALIFIED_NAME )
                            // Sql.g:1608:6: a2= SCHEMA_QUALIFIED_NAME
                            {
                            a2=(Token)match(input,SCHEMA_QUALIFIED_NAME,FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1494); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a2 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SCHEMA_QUALIFIED_NAME");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_8_0_0_0_0_0_1_0_1_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a2, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 143);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 144);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 145);
            	}

            // Sql.g:1656:2: ( (a3= 'UNIQUE' |a4= 'PRIMARY KEY' ) )
            // Sql.g:1657:3: (a3= 'UNIQUE' |a4= 'PRIMARY KEY' )
            {
            // Sql.g:1657:3: (a3= 'UNIQUE' |a4= 'PRIMARY KEY' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==107) ) {
                alt16=1;
            }
            else if ( (LA16_0==101) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Sql.g:1658:4: a3= 'UNIQUE'
                    {
                    a3=(Token)match(input,107,FOLLOW_107_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1568); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_8_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueSpecificationKind().getEEnumLiteral(org.emftext.language.sql.schema.UniqueSpecificationKind.UNIQUE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:1671:8: a4= 'PRIMARY KEY'
                    {
                    a4=(Token)match(input,101,FOLLOW_101_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1583); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_8_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueSpecificationKind().getEEnumLiteral(org.emftext.language.sql.schema.UniqueSpecificationKind.PRIMARY_KEY_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 146, 148);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_emftext_language_sql_schema_UniqueColumnConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_UniqueColumnConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_schema_ReferentialColumnConstraint"
    // Sql.g:1696:1: parse_org_emftext_language_sql_schema_ReferentialColumnConstraint returns [org.emftext.language.sql.schema.ReferentialColumnConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? a3= KEYWORD_REFERENCES ( (a4= IDENTIFIER ) | (a5= SCHEMA_QUALIFIED_NAME ) ) ( (a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')' ) )? ;
    public final org.emftext.language.sql.schema.ReferentialColumnConstraint parse_org_emftext_language_sql_schema_ReferentialColumnConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.ReferentialColumnConstraint element =  null;

        int parse_org_emftext_language_sql_schema_ReferentialColumnConstraint_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Sql.g:1699:2: ( ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? a3= KEYWORD_REFERENCES ( (a4= IDENTIFIER ) | (a5= SCHEMA_QUALIFIED_NAME ) ) ( (a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')' ) )? )
            // Sql.g:1700:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? a3= KEYWORD_REFERENCES ( (a4= IDENTIFIER ) | (a5= SCHEMA_QUALIFIED_NAME ) ) ( (a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')' ) )?
            {
            // Sql.g:1700:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_CONSTRAINT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Sql.g:1701:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    {
                    // Sql.g:1701:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    // Sql.g:1702:4: a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1628); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 149, 150);
                    			}

                    // Sql.g:1716:4: ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==IDENTIFIER) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==SCHEMA_QUALIFIED_NAME) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }
                    switch (alt17) {
                        case 1 :
                            // Sql.g:1717:5: (a1= IDENTIFIER )
                            {
                            // Sql.g:1717:5: (a1= IDENTIFIER )
                            // Sql.g:1718:6: a1= IDENTIFIER
                            {
                            a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1661); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a1 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_0_0_0_1_0_0_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a1, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 151);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:1754:10: (a2= SCHEMA_QUALIFIED_NAME )
                            {
                            // Sql.g:1754:10: (a2= SCHEMA_QUALIFIED_NAME )
                            // Sql.g:1755:6: a2= SCHEMA_QUALIFIED_NAME
                            {
                            a2=(Token)match(input,SCHEMA_QUALIFIED_NAME,FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1717); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a2 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SCHEMA_QUALIFIED_NAME");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_0_0_0_1_0_1_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a2, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 152);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 153);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 154);
            	}

            a3=(Token)match(input,KEYWORD_REFERENCES,FOLLOW_KEYWORD_REFERENCES_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1782); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 155, 156);
            	}

            // Sql.g:1817:2: ( (a4= IDENTIFIER ) | (a5= SCHEMA_QUALIFIED_NAME ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER) ) {
                alt19=1;
            }
            else if ( (LA19_0==SCHEMA_QUALIFIED_NAME) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // Sql.g:1818:3: (a4= IDENTIFIER )
                    {
                    // Sql.g:1818:3: (a4= IDENTIFIER )
                    // Sql.g:1819:4: a4= IDENTIFIER
                    {
                    a4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1805); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				if (a4 != null) {
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    					tokenResolver.setOptions(getOptions());
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
                    					}
                    					String resolved = (String) resolvedObject;
                    					org.emftext.language.sql.schema.TableDefinition proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					collectHiddenTokens(element);
                    					registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.TableDefinition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedTableReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE), resolved, proxy);
                    					if (proxy != null) {
                    						Object value = proxy;
                    						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_2_0_0_0, proxy, true);
                    					copyLocalizationInfos((CommonToken) a4, element);
                    					copyLocalizationInfos((CommonToken) a4, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, 157, 160);
                    		}

                    }
                    break;
                case 2 :
                    // Sql.g:1859:6: (a5= SCHEMA_QUALIFIED_NAME )
                    {
                    // Sql.g:1859:6: (a5= SCHEMA_QUALIFIED_NAME )
                    // Sql.g:1860:4: a5= SCHEMA_QUALIFIED_NAME
                    {
                    a5=(Token)match(input,SCHEMA_QUALIFIED_NAME,FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1843); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				if (a5 != null) {
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SCHEMA_QUALIFIED_NAME");
                    					tokenResolver.setOptions(getOptions());
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
                    					}
                    					String resolved = (String) resolvedObject;
                    					org.emftext.language.sql.schema.TableDefinition proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					collectHiddenTokens(element);
                    					registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.TableDefinition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedTableReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE), resolved, proxy);
                    					if (proxy != null) {
                    						Object value = proxy;
                    						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_2_0_1_0, proxy, true);
                    					copyLocalizationInfos((CommonToken) a5, element);
                    					copyLocalizationInfos((CommonToken) a5, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, 161, 164);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 165, 168);
            	}

            // Sql.g:1905:2: ( (a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==58) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Sql.g:1906:3: (a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')' )
                    {
                    // Sql.g:1906:3: (a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')' )
                    // Sql.g:1907:4: a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')'
                    {
                    a6=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1886); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 169);
                    			}

                    // Sql.g:1921:4: (a7= IDENTIFIER )
                    // Sql.g:1922:5: a7= IDENTIFIER
                    {
                    a7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1912); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    						startIncompleteElement(element);
                    					}
                    					if (a7 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a7).getLine(), ((CommonToken) a7).getCharPositionInLine(), ((CommonToken) a7).getStartIndex(), ((CommonToken) a7).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS, value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_3_0_0_1, proxy, true);
                    						copyLocalizationInfos((CommonToken) a7, element);
                    						copyLocalizationInfos((CommonToken) a7, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 170, 171);
                    			}

                    // Sql.g:1961:4: ( (a8= ',' (a9= IDENTIFIER ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==61) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Sql.g:1962:5: (a8= ',' (a9= IDENTIFIER ) )
                    	    {
                    	    // Sql.g:1962:5: (a8= ',' (a9= IDENTIFIER ) )
                    	    // Sql.g:1963:6: a8= ',' (a9= IDENTIFIER )
                    	    {
                    	    a8=(Token)match(input,61,FOLLOW_61_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1958); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_3_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((CommonToken)a8, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 172);
                    	    					}

                    	    // Sql.g:1977:6: (a9= IDENTIFIER )
                    	    // Sql.g:1978:7: a9= IDENTIFIER
                    	    {
                    	    a9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1992); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a9 != null) {
                    	    								org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    	    								tokenResolver.setOptions(getOptions());
                    	    								org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    	    								tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS), result);
                    	    								Object resolvedObject = result.getResolvedToken();
                    	    								if (resolvedObject == null) {
                    	    									addErrorToResource(result.getErrorMessage(), ((CommonToken) a9).getLine(), ((CommonToken) a9).getCharPositionInLine(), ((CommonToken) a9).getStartIndex(), ((CommonToken) a9).getStopIndex());
                    	    								}
                    	    								String resolved = (String) resolvedObject;
                    	    								org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    	    								collectHiddenTokens(element);
                    	    								registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS), resolved, proxy);
                    	    								if (proxy != null) {
                    	    									Object value = proxy;
                    	    									addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS, value);
                    	    									completedElement(value, false);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_3_0_0_2_0_0_1, proxy, true);
                    	    								copyLocalizationInfos((CommonToken) a9, element);
                    	    								copyLocalizationInfos((CommonToken) a9, proxy);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 173, 174);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 175, 176);
                    			}

                    a10=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2060); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_3_0_0_3, null, true);
                    				copyLocalizationInfos((CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 177, 179);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 180, 182);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_emftext_language_sql_schema_ReferentialColumnConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_ReferentialColumnConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_schema_UniqueTableConstraint"
    // Sql.g:2053:1: parse_org_emftext_language_sql_schema_UniqueTableConstraint returns [org.emftext.language.sql.schema.UniqueTableConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? ( (a3= 'UNIQUE' |a4= 'PRIMARY KEY' ) ) a7= '(' (a8= IDENTIFIER ) ( (a9= ',' (a10= IDENTIFIER ) ) )* a11= ')' ;
    public final org.emftext.language.sql.schema.UniqueTableConstraint parse_org_emftext_language_sql_schema_UniqueTableConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.UniqueTableConstraint element =  null;

        int parse_org_emftext_language_sql_schema_UniqueTableConstraint_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Sql.g:2056:2: ( ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? ( (a3= 'UNIQUE' |a4= 'PRIMARY KEY' ) ) a7= '(' (a8= IDENTIFIER ) ( (a9= ',' (a10= IDENTIFIER ) ) )* a11= ')' )
            // Sql.g:2057:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? ( (a3= 'UNIQUE' |a4= 'PRIMARY KEY' ) ) a7= '(' (a8= IDENTIFIER ) ( (a9= ',' (a10= IDENTIFIER ) ) )* a11= ')'
            {
            // Sql.g:2057:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_CONSTRAINT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Sql.g:2058:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    {
                    // Sql.g:2058:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    // Sql.g:2059:4: a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2117); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 183, 184);
                    			}

                    // Sql.g:2073:4: ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==IDENTIFIER) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==SCHEMA_QUALIFIED_NAME) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }
                    switch (alt22) {
                        case 1 :
                            // Sql.g:2074:5: (a1= IDENTIFIER )
                            {
                            // Sql.g:2074:5: (a1= IDENTIFIER )
                            // Sql.g:2075:6: a1= IDENTIFIER
                            {
                            a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2150); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a1 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_0_0_0_1_0_0_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a1, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 185);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:2111:10: (a2= SCHEMA_QUALIFIED_NAME )
                            {
                            // Sql.g:2111:10: (a2= SCHEMA_QUALIFIED_NAME )
                            // Sql.g:2112:6: a2= SCHEMA_QUALIFIED_NAME
                            {
                            a2=(Token)match(input,SCHEMA_QUALIFIED_NAME,FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2206); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a2 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SCHEMA_QUALIFIED_NAME");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_0_0_0_1_0_1_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a2, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 186);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 187);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 188);
            	}

            // Sql.g:2160:2: ( (a3= 'UNIQUE' |a4= 'PRIMARY KEY' ) )
            // Sql.g:2161:3: (a3= 'UNIQUE' |a4= 'PRIMARY KEY' )
            {
            // Sql.g:2161:3: (a3= 'UNIQUE' |a4= 'PRIMARY KEY' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==107) ) {
                alt24=1;
            }
            else if ( (LA24_0==101) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // Sql.g:2162:4: a3= 'UNIQUE'
                    {
                    a3=(Token)match(input,107,FOLLOW_107_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2280); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueSpecificationKind().getEEnumLiteral(org.emftext.language.sql.schema.UniqueSpecificationKind.UNIQUE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:2175:8: a4= 'PRIMARY KEY'
                    {
                    a4=(Token)match(input,101,FOLLOW_101_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2295); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueSpecificationKind().getEEnumLiteral(org.emftext.language.sql.schema.UniqueSpecificationKind.PRIMARY_KEY_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 189);
            	}

            a7=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2316); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 190);
            	}

            // Sql.g:2209:2: (a8= IDENTIFIER )
            // Sql.g:2210:3: a8= IDENTIFIER
            {
            a8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2334); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            				startIncompleteElement(element);
            			}
            			if (a8 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.UniqueTableConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getUniqueTableConstraintColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_3, proxy, true);
            				copyLocalizationInfos((CommonToken) a8, element);
            				copyLocalizationInfos((CommonToken) a8, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 191, 192);
            	}

            // Sql.g:2249:2: ( (a9= ',' (a10= IDENTIFIER ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==61) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Sql.g:2250:3: (a9= ',' (a10= IDENTIFIER ) )
            	    {
            	    // Sql.g:2250:3: (a9= ',' (a10= IDENTIFIER ) )
            	    // Sql.g:2251:4: a9= ',' (a10= IDENTIFIER )
            	    {
            	    a9=(Token)match(input,61,FOLLOW_61_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2364); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 193);
            	    			}

            	    // Sql.g:2265:4: (a10= IDENTIFIER )
            	    // Sql.g:2266:5: a10= IDENTIFIER
            	    {
            	    a10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2390); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a10 != null) {
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            	    						tokenResolver.setOptions(getOptions());
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a10).getLine(), ((CommonToken) a10).getCharPositionInLine(), ((CommonToken) a10).getStartIndex(), ((CommonToken) a10).getStopIndex());
            	    						}
            	    						String resolved = (String) resolvedObject;
            	    						org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            	    						collectHiddenTokens(element);
            	    						registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.UniqueTableConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getUniqueTableConstraintColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), resolved, proxy);
            	    						if (proxy != null) {
            	    							Object value = proxy;
            	    							addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_4_0_0_1, proxy, true);
            	    						copyLocalizationInfos((CommonToken) a10, element);
            	    						copyLocalizationInfos((CommonToken) a10, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 194, 195);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 196, 197);
            	}

            a11=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2436); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 198, 199);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_emftext_language_sql_schema_UniqueTableConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_UniqueTableConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_schema_ReferentialTableConstraint"
    // Sql.g:2331:1: parse_org_emftext_language_sql_schema_ReferentialTableConstraint returns [org.emftext.language.sql.schema.ReferentialTableConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? a3= KEYWORD_FOREIGN a4= KEYWORD_KEY a5= '(' (a6= IDENTIFIER ) ( (a7= ',' (a8= IDENTIFIER ) ) )* a9= ')' a10= KEYWORD_REFERENCES ( (a11= IDENTIFIER ) | (a12= SCHEMA_QUALIFIED_NAME ) ) ( (a13= '(' (a14= IDENTIFIER ) ( (a15= ',' (a16= IDENTIFIER ) ) )* a17= ')' ) )? ;
    public final org.emftext.language.sql.schema.ReferentialTableConstraint parse_org_emftext_language_sql_schema_ReferentialTableConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.ReferentialTableConstraint element =  null;

        int parse_org_emftext_language_sql_schema_ReferentialTableConstraint_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Sql.g:2334:2: ( ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? a3= KEYWORD_FOREIGN a4= KEYWORD_KEY a5= '(' (a6= IDENTIFIER ) ( (a7= ',' (a8= IDENTIFIER ) ) )* a9= ')' a10= KEYWORD_REFERENCES ( (a11= IDENTIFIER ) | (a12= SCHEMA_QUALIFIED_NAME ) ) ( (a13= '(' (a14= IDENTIFIER ) ( (a15= ',' (a16= IDENTIFIER ) ) )* a17= ')' ) )? )
            // Sql.g:2335:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )? a3= KEYWORD_FOREIGN a4= KEYWORD_KEY a5= '(' (a6= IDENTIFIER ) ( (a7= ',' (a8= IDENTIFIER ) ) )* a9= ')' a10= KEYWORD_REFERENCES ( (a11= IDENTIFIER ) | (a12= SCHEMA_QUALIFIED_NAME ) ) ( (a13= '(' (a14= IDENTIFIER ) ( (a15= ',' (a16= IDENTIFIER ) ) )* a17= ')' ) )?
            {
            // Sql.g:2335:2: ( (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_CONSTRAINT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Sql.g:2336:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    {
                    // Sql.g:2336:3: (a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) ) )
                    // Sql.g:2337:4: a0= KEYWORD_CONSTRAINT ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2474); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 200, 201);
                    			}

                    // Sql.g:2351:4: ( (a1= IDENTIFIER ) | (a2= SCHEMA_QUALIFIED_NAME ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==IDENTIFIER) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==SCHEMA_QUALIFIED_NAME) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }
                    switch (alt26) {
                        case 1 :
                            // Sql.g:2352:5: (a1= IDENTIFIER )
                            {
                            // Sql.g:2352:5: (a1= IDENTIFIER )
                            // Sql.g:2353:6: a1= IDENTIFIER
                            {
                            a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2507); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a1 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_0_0_0_1_0_0_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a1, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 202);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:2389:10: (a2= SCHEMA_QUALIFIED_NAME )
                            {
                            // Sql.g:2389:10: (a2= SCHEMA_QUALIFIED_NAME )
                            // Sql.g:2390:6: a2= SCHEMA_QUALIFIED_NAME
                            {
                            a2=(Token)match(input,SCHEMA_QUALIFIED_NAME,FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2563); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (terminateParsing) {
                            							throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            						}
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                            							startIncompleteElement(element);
                            						}
                            						if (a2 != null) {
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SCHEMA_QUALIFIED_NAME");
                            							tokenResolver.setOptions(getOptions());
                            							org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            							tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__NAME), result);
                            							Object resolvedObject = result.getResolvedToken();
                            							if (resolvedObject == null) {
                            								addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
                            							}
                            							org.emftext.language.sql.SchemaQualifiedName resolved = (org.emftext.language.sql.SchemaQualifiedName) resolvedObject;
                            							if (resolved != null) {
                            								Object value = resolved;
                            								element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__NAME), value);
                            								completedElement(value, false);
                            							}
                            							collectHiddenTokens(element);
                            							retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_0_0_0_1_0_1_0, resolved, true);
                            							copyLocalizationInfos((CommonToken) a2, element);
                            						}
                            					}

                            }


                            if ( state.backtracking==0 ) {
                            					// expected elements (follow set)
                            					addExpectedElement(null, 203);
                            				}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 204);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 205);
            	}

            a3=(Token)match(input,KEYWORD_FOREIGN,FOLLOW_KEYWORD_FOREIGN_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2628); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 206);
            	}

            a4=(Token)match(input,KEYWORD_KEY,FOLLOW_KEYWORD_KEY_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2642); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 207);
            	}

            a5=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2656); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 208);
            	}

            // Sql.g:2480:2: (a6= IDENTIFIER )
            // Sql.g:2481:3: a6= IDENTIFIER
            {
            a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2674); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            				startIncompleteElement(element);
            			}
            			if (a6 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a6).getLine(), ((CommonToken) a6).getCharPositionInLine(), ((CommonToken) a6).getStartIndex(), ((CommonToken) a6).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialTableConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialTableConstraintColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_4, proxy, true);
            				copyLocalizationInfos((CommonToken) a6, element);
            				copyLocalizationInfos((CommonToken) a6, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 209, 210);
            	}

            // Sql.g:2520:2: ( (a7= ',' (a8= IDENTIFIER ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==61) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Sql.g:2521:3: (a7= ',' (a8= IDENTIFIER ) )
            	    {
            	    // Sql.g:2521:3: (a7= ',' (a8= IDENTIFIER ) )
            	    // Sql.g:2522:4: a7= ',' (a8= IDENTIFIER )
            	    {
            	    a7=(Token)match(input,61,FOLLOW_61_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2704); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_5_0_0_0, null, true);
            	    				copyLocalizationInfos((CommonToken)a7, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 211);
            	    			}

            	    // Sql.g:2536:4: (a8= IDENTIFIER )
            	    // Sql.g:2537:5: a8= IDENTIFIER
            	    {
            	    a8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2730); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a8 != null) {
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            	    						tokenResolver.setOptions(getOptions());
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
            	    						}
            	    						String resolved = (String) resolvedObject;
            	    						org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            	    						collectHiddenTokens(element);
            	    						registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialTableConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialTableConstraintColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), resolved, proxy);
            	    						if (proxy != null) {
            	    							Object value = proxy;
            	    							addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_5_0_0_1, proxy, true);
            	    						copyLocalizationInfos((CommonToken) a8, element);
            	    						copyLocalizationInfos((CommonToken) a8, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 212, 213);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 214, 215);
            	}

            a9=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2776); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 216);
            	}

            a10=(Token)match(input,KEYWORD_REFERENCES,FOLLOW_KEYWORD_REFERENCES_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2790); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 217, 218);
            	}

            // Sql.g:2611:2: ( (a11= IDENTIFIER ) | (a12= SCHEMA_QUALIFIED_NAME ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENTIFIER) ) {
                alt29=1;
            }
            else if ( (LA29_0==SCHEMA_QUALIFIED_NAME) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // Sql.g:2612:3: (a11= IDENTIFIER )
                    {
                    // Sql.g:2612:3: (a11= IDENTIFIER )
                    // Sql.g:2613:4: a11= IDENTIFIER
                    {
                    a11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2813); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				if (a11 != null) {
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    					tokenResolver.setOptions(getOptions());
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a11).getLine(), ((CommonToken) a11).getCharPositionInLine(), ((CommonToken) a11).getStartIndex(), ((CommonToken) a11).getStopIndex());
                    					}
                    					String resolved = (String) resolvedObject;
                    					org.emftext.language.sql.schema.TableDefinition proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					collectHiddenTokens(element);
                    					registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.TableDefinition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedTableReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE), resolved, proxy);
                    					if (proxy != null) {
                    						Object value = proxy;
                    						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_8_0_0_0, proxy, true);
                    					copyLocalizationInfos((CommonToken) a11, element);
                    					copyLocalizationInfos((CommonToken) a11, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, 219, 221);
                    		}

                    }
                    break;
                case 2 :
                    // Sql.g:2653:6: (a12= SCHEMA_QUALIFIED_NAME )
                    {
                    // Sql.g:2653:6: (a12= SCHEMA_QUALIFIED_NAME )
                    // Sql.g:2654:4: a12= SCHEMA_QUALIFIED_NAME
                    {
                    a12=(Token)match(input,SCHEMA_QUALIFIED_NAME,FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2851); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				if (a12 != null) {
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SCHEMA_QUALIFIED_NAME");
                    					tokenResolver.setOptions(getOptions());
                    					org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a12).getLine(), ((CommonToken) a12).getCharPositionInLine(), ((CommonToken) a12).getStartIndex(), ((CommonToken) a12).getStopIndex());
                    					}
                    					String resolved = (String) resolvedObject;
                    					org.emftext.language.sql.schema.TableDefinition proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    					collectHiddenTokens(element);
                    					registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.TableDefinition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedTableReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE), resolved, proxy);
                    					if (proxy != null) {
                    						Object value = proxy;
                    						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_8_0_1_0, proxy, true);
                    					copyLocalizationInfos((CommonToken) a12, element);
                    					copyLocalizationInfos((CommonToken) a12, proxy);
                    				}
                    			}

                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, 222, 224);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 225, 227);
            	}

            // Sql.g:2699:2: ( (a13= '(' (a14= IDENTIFIER ) ( (a15= ',' (a16= IDENTIFIER ) ) )* a17= ')' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Sql.g:2700:3: (a13= '(' (a14= IDENTIFIER ) ( (a15= ',' (a16= IDENTIFIER ) ) )* a17= ')' )
                    {
                    // Sql.g:2700:3: (a13= '(' (a14= IDENTIFIER ) ( (a15= ',' (a16= IDENTIFIER ) ) )* a17= ')' )
                    // Sql.g:2701:4: a13= '(' (a14= IDENTIFIER ) ( (a15= ',' (a16= IDENTIFIER ) ) )* a17= ')'
                    {
                    a13=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2894); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_9_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 228);
                    			}

                    // Sql.g:2715:4: (a14= IDENTIFIER )
                    // Sql.g:2716:5: a14= IDENTIFIER
                    {
                    a14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2920); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    						startIncompleteElement(element);
                    					}
                    					if (a14 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a14).getLine(), ((CommonToken) a14).getCharPositionInLine(), ((CommonToken) a14).getStartIndex(), ((CommonToken) a14).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS, value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_9_0_0_1, proxy, true);
                    						copyLocalizationInfos((CommonToken) a14, element);
                    						copyLocalizationInfos((CommonToken) a14, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 229, 230);
                    			}

                    // Sql.g:2755:4: ( (a15= ',' (a16= IDENTIFIER ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==61) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Sql.g:2756:5: (a15= ',' (a16= IDENTIFIER ) )
                    	    {
                    	    // Sql.g:2756:5: (a15= ',' (a16= IDENTIFIER ) )
                    	    // Sql.g:2757:6: a15= ',' (a16= IDENTIFIER )
                    	    {
                    	    a15=(Token)match(input,61,FOLLOW_61_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2966); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_9_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((CommonToken)a15, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 231);
                    	    					}

                    	    // Sql.g:2771:6: (a16= IDENTIFIER )
                    	    // Sql.g:2772:7: a16= IDENTIFIER
                    	    {
                    	    a16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3000); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    							if (terminateParsing) {
                    	    								throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    	    							}
                    	    							if (element == null) {
                    	    								element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    	    								startIncompleteElement(element);
                    	    							}
                    	    							if (a16 != null) {
                    	    								org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    	    								tokenResolver.setOptions(getOptions());
                    	    								org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    	    								tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS), result);
                    	    								Object resolvedObject = result.getResolvedToken();
                    	    								if (resolvedObject == null) {
                    	    									addErrorToResource(result.getErrorMessage(), ((CommonToken) a16).getLine(), ((CommonToken) a16).getCharPositionInLine(), ((CommonToken) a16).getStartIndex(), ((CommonToken) a16).getStopIndex());
                    	    								}
                    	    								String resolved = (String) resolvedObject;
                    	    								org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    	    								collectHiddenTokens(element);
                    	    								registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS), resolved, proxy);
                    	    								if (proxy != null) {
                    	    									Object value = proxy;
                    	    									addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS, value);
                    	    									completedElement(value, false);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_9_0_0_2_0_0_1, proxy, true);
                    	    								copyLocalizationInfos((CommonToken) a16, element);
                    	    								copyLocalizationInfos((CommonToken) a16, proxy);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 232, 233);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 234, 235);
                    			}

                    a17=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3068); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_9_0_0_3, null, true);
                    				copyLocalizationInfos((CommonToken)a17, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 236, 237);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 238, 239);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_emftext_language_sql_schema_ReferentialTableConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_ReferentialTableConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_literal_DateLiteral"
    // Sql.g:2847:1: parse_org_emftext_language_sql_literal_DateLiteral returns [org.emftext.language.sql.literal.DateLiteral element = null] : a0= KEYWORD_DATE (a1= TEXT ) ;
    public final org.emftext.language.sql.literal.DateLiteral parse_org_emftext_language_sql_literal_DateLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.DateLiteral element =  null;

        int parse_org_emftext_language_sql_literal_DateLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Sql.g:2850:2: (a0= KEYWORD_DATE (a1= TEXT ) )
            // Sql.g:2851:2: a0= KEYWORD_DATE (a1= TEXT )
            {
            a0=(Token)match(input,KEYWORD_DATE,FOLLOW_KEYWORD_DATE_in_parse_org_emftext_language_sql_literal_DateLiteral3116); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createDateLiteral();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 240);
            	}

            // Sql.g:2865:2: (a1= TEXT )
            // Sql.g:2866:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_sql_literal_DateLiteral3134); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createDateLiteral();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.DATE_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
            				}
            				java.util.Date resolved = (java.util.Date) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.DATE_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_1, resolved, true);
            				copyLocalizationInfos((CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 241, 246);
            		addExpectedElement(null, 247, 249);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_emftext_language_sql_literal_DateLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_DateLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_TimeLiteral"
    // Sql.g:2907:1: parse_org_emftext_language_sql_literal_TimeLiteral returns [org.emftext.language.sql.literal.TimeLiteral element = null] : a0= KEYWORD_TIME (a1= TEXT ) ;
    public final org.emftext.language.sql.literal.TimeLiteral parse_org_emftext_language_sql_literal_TimeLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.TimeLiteral element =  null;

        int parse_org_emftext_language_sql_literal_TimeLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Sql.g:2910:2: (a0= KEYWORD_TIME (a1= TEXT ) )
            // Sql.g:2911:2: a0= KEYWORD_TIME (a1= TEXT )
            {
            a0=(Token)match(input,KEYWORD_TIME,FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_literal_TimeLiteral3170); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimeLiteral();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 250);
            	}

            // Sql.g:2925:2: (a1= TEXT )
            // Sql.g:2926:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_sql_literal_TimeLiteral3188); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimeLiteral();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIME_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
            				}
            				java.util.Date resolved = (java.util.Date) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIME_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_1, resolved, true);
            				copyLocalizationInfos((CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 251, 256);
            		addExpectedElement(null, 257, 259);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_emftext_language_sql_literal_TimeLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_TimeLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_TimestampLiteral"
    // Sql.g:2967:1: parse_org_emftext_language_sql_literal_TimestampLiteral returns [org.emftext.language.sql.literal.TimestampLiteral element = null] : a0= KEYWORD_TIMESTAMP (a1= TEXT ) ;
    public final org.emftext.language.sql.literal.TimestampLiteral parse_org_emftext_language_sql_literal_TimestampLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.TimestampLiteral element =  null;

        int parse_org_emftext_language_sql_literal_TimestampLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Sql.g:2970:2: (a0= KEYWORD_TIMESTAMP (a1= TEXT ) )
            // Sql.g:2971:2: a0= KEYWORD_TIMESTAMP (a1= TEXT )
            {
            a0=(Token)match(input,KEYWORD_TIMESTAMP,FOLLOW_KEYWORD_TIMESTAMP_in_parse_org_emftext_language_sql_literal_TimestampLiteral3224); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimestampLiteral();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 260);
            	}

            // Sql.g:2985:2: (a1= TEXT )
            // Sql.g:2986:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_sql_literal_TimestampLiteral3242); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimestampLiteral();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIMESTAMP_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
            				}
            				java.util.Date resolved = (java.util.Date) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIMESTAMP_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_1, resolved, true);
            				copyLocalizationInfos((CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 261, 266);
            		addExpectedElement(null, 267, 269);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_org_emftext_language_sql_literal_TimestampLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_TimestampLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_IntervalLiteral"
    // Sql.g:3027:1: parse_org_emftext_language_sql_literal_IntervalLiteral returns [org.emftext.language.sql.literal.IntervalLiteral element = null] : a0= KEYWORD_INTERVAL ( (a1= '+' |a2= '-' ) ) ;
    public final org.emftext.language.sql.literal.IntervalLiteral parse_org_emftext_language_sql_literal_IntervalLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.IntervalLiteral element =  null;

        int parse_org_emftext_language_sql_literal_IntervalLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Sql.g:3030:2: (a0= KEYWORD_INTERVAL ( (a1= '+' |a2= '-' ) ) )
            // Sql.g:3031:2: a0= KEYWORD_INTERVAL ( (a1= '+' |a2= '-' ) )
            {
            a0=(Token)match(input,KEYWORD_INTERVAL,FOLLOW_KEYWORD_INTERVAL_in_parse_org_emftext_language_sql_literal_IntervalLiteral3278); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createIntervalLiteral();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 270);
            	}

            // Sql.g:3045:2: ( (a1= '+' |a2= '-' ) )
            // Sql.g:3046:3: (a1= '+' |a2= '-' )
            {
            // Sql.g:3046:3: (a1= '+' |a2= '-' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==60) ) {
                alt32=1;
            }
            else if ( (LA32_0==62) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // Sql.g:3047:4: a1= '+'
                    {
                    a1=(Token)match(input,60,FOLLOW_60_in_parse_org_emftext_language_sql_literal_IntervalLiteral3301); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createIntervalLiteral();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_1, true, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of boolean attribute
                    				Object value = true;
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.INTERVAL_LITERAL__IS_POSITIVE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:3060:8: a2= '-'
                    {
                    a2=(Token)match(input,62,FOLLOW_62_in_parse_org_emftext_language_sql_literal_IntervalLiteral3316); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createIntervalLiteral();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_1, false, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of boolean attribute
                    				Object value = false;
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.INTERVAL_LITERAL__IS_POSITIVE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 271, 276);
            		addExpectedElement(null, 277, 279);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_org_emftext_language_sql_literal_IntervalLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_IntervalLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_BooleanLiteral"
    // Sql.g:3086:1: parse_org_emftext_language_sql_literal_BooleanLiteral returns [org.emftext.language.sql.literal.BooleanLiteral element = null] : ( ( (a0= 'TRUE' |a1= 'FALSE' ) ) )? ;
    public final org.emftext.language.sql.literal.BooleanLiteral parse_org_emftext_language_sql_literal_BooleanLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.BooleanLiteral element =  null;

        int parse_org_emftext_language_sql_literal_BooleanLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Sql.g:3089:2: ( ( ( (a0= 'TRUE' |a1= 'FALSE' ) ) )? )
            // Sql.g:3090:2: ( ( (a0= 'TRUE' |a1= 'FALSE' ) ) )?
            {
            // Sql.g:3090:2: ( ( (a0= 'TRUE' |a1= 'FALSE' ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==81||LA34_0==106) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Sql.g:3091:3: ( (a0= 'TRUE' |a1= 'FALSE' ) )
                    {
                    // Sql.g:3091:3: ( (a0= 'TRUE' |a1= 'FALSE' ) )
                    // Sql.g:3092:4: (a0= 'TRUE' |a1= 'FALSE' )
                    {
                    // Sql.g:3092:4: (a0= 'TRUE' |a1= 'FALSE' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==106) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==81) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;

                    }
                    switch (alt33) {
                        case 1 :
                            // Sql.g:3093:5: a0= 'TRUE'
                            {
                            a0=(Token)match(input,106,FOLLOW_106_in_parse_org_emftext_language_sql_literal_BooleanLiteral3367); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createBooleanLiteral();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_16_0_0_0, true, true);
                            					copyLocalizationInfos((CommonToken)a0, element);
                            					// set value of boolean attribute
                            					Object value = true;
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.BOOLEAN_LITERAL__VALUE), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:3106:10: a1= 'FALSE'
                            {
                            a1=(Token)match(input,81,FOLLOW_81_in_parse_org_emftext_language_sql_literal_BooleanLiteral3384); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createBooleanLiteral();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_16_0_0_0, false, true);
                            					copyLocalizationInfos((CommonToken)a1, element);
                            					// set value of boolean attribute
                            					Object value = false;
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.BOOLEAN_LITERAL__VALUE), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 280, 285);
            		addExpectedElement(null, 286, 288);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_org_emftext_language_sql_literal_BooleanLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_BooleanLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_CharacterStringType"
    // Sql.g:3133:1: parse_org_emftext_language_sql_datatype_CharacterStringType returns [org.emftext.language.sql.datatype.CharacterStringType element = null] : ( (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' ) ) ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )? ( (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12= TEXT ) ) )? ( (a13= KEYWORD_COLLATE (a14= TEXT ) ) )? ;
    public final org.emftext.language.sql.datatype.CharacterStringType parse_org_emftext_language_sql_datatype_CharacterStringType() throws RecognitionException {
        org.emftext.language.sql.datatype.CharacterStringType element =  null;

        int parse_org_emftext_language_sql_datatype_CharacterStringType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Sql.g:3136:2: ( ( (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' ) ) ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )? ( (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12= TEXT ) ) )? ( (a13= KEYWORD_COLLATE (a14= TEXT ) ) )? )
            // Sql.g:3137:2: ( (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' ) ) ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )? ( (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12= TEXT ) ) )? ( (a13= KEYWORD_COLLATE (a14= TEXT ) ) )?
            {
            // Sql.g:3137:2: ( (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' ) )
            // Sql.g:3138:3: (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' )
            {
            // Sql.g:3138:3: (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt35=1;
                }
                break;
            case 68:
                {
                alt35=2;
                }
                break;
            case 108:
                {
                alt35=3;
                }
                break;
            case 69:
                {
                alt35=4;
                }
                break;
            case 67:
                {
                alt35=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // Sql.g:3139:4: a0= 'CHARACTER'
                    {
                    a0=(Token)match(input,70,FOLLOW_70_in_parse_org_emftext_language_sql_datatype_CharacterStringType3437); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.CharacterStringTypeKind.CHARACTER_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:3152:8: a1= 'CHAR'
                    {
                    a1=(Token)match(input,68,FOLLOW_68_in_parse_org_emftext_language_sql_datatype_CharacterStringType3452); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.CharacterStringTypeKind.CHAR_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:3165:8: a2= 'VARCHAR'
                    {
                    a2=(Token)match(input,108,FOLLOW_108_in_parse_org_emftext_language_sql_datatype_CharacterStringType3467); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.CharacterStringTypeKind.VARCHAR_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Sql.g:3178:8: a3= 'CHARACTER VARYING'
                    {
                    a3=(Token)match(input,69,FOLLOW_69_in_parse_org_emftext_language_sql_datatype_CharacterStringType3482); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.CharacterStringTypeKind.CHARACTER_VARYING_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Sql.g:3191:8: a4= 'CHAR VARYING'
                    {
                    a4=(Token)match(input,67,FOLLOW_67_in_parse_org_emftext_language_sql_datatype_CharacterStringType3497); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.CharacterStringTypeKind.CHAR_VARYING_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 289, 292);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 293, 298);
            		addExpectedElement(null, 299, 301);
            	}

            // Sql.g:3213:2: ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // Sql.g:3214:3: (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' )
                    {
                    // Sql.g:3214:3: (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' )
                    // Sql.g:3215:4: a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')'
                    {
                    a7=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_CharacterStringType3527); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 302);
                    			}

                    // Sql.g:3229:4: (a8= UNSIGNED_INTEGER )
                    // Sql.g:3230:5: a8= UNSIGNED_INTEGER
                    {
                    a8=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_CharacterStringType3553); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    						startIncompleteElement(element);
                    					}
                    					if (a8 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__LENGTH), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
                    						}
                    						org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__LENGTH), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a8, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 303);
                    			}

                    a9=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_datatype_CharacterStringType3586); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 304, 306);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 307, 312);
                    				addExpectedElement(null, 313, 315);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 316, 318);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 319, 324);
            		addExpectedElement(null, 325, 327);
            	}

            // Sql.g:3290:2: ( (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12= TEXT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_CHARACTER) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Sql.g:3291:3: (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12= TEXT ) )
                    {
                    // Sql.g:3291:3: (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12= TEXT ) )
                    // Sql.g:3292:4: a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12= TEXT )
                    {
                    a10=(Token)match(input,KEYWORD_CHARACTER,FOLLOW_KEYWORD_CHARACTER_in_parse_org_emftext_language_sql_datatype_CharacterStringType3628); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 328);
                    			}

                    a11=(Token)match(input,KEYWORD_SET,FOLLOW_KEYWORD_SET_in_parse_org_emftext_language_sql_datatype_CharacterStringType3648); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 329);
                    			}

                    // Sql.g:3320:4: (a12= TEXT )
                    // Sql.g:3321:5: a12= TEXT
                    {
                    a12=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_sql_datatype_CharacterStringType3674); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    						startIncompleteElement(element);
                    					}
                    					if (a12 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a12).getLine(), ((CommonToken) a12).getCharPositionInLine(), ((CommonToken) a12).getStartIndex(), ((CommonToken) a12).getStopIndex());
                    						}
                    						java.lang.String resolved = (java.lang.String) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_2_0_0_2, resolved, true);
                    						copyLocalizationInfos((CommonToken) a12, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 330, 331);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 332, 337);
                    				addExpectedElement(null, 338, 340);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 341, 342);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 343, 348);
            		addExpectedElement(null, 349, 351);
            	}

            // Sql.g:3367:2: ( (a13= KEYWORD_COLLATE (a14= TEXT ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KEYWORD_COLLATE) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==TEXT) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // Sql.g:3368:3: (a13= KEYWORD_COLLATE (a14= TEXT ) )
                    {
                    // Sql.g:3368:3: (a13= KEYWORD_COLLATE (a14= TEXT ) )
                    // Sql.g:3369:4: a13= KEYWORD_COLLATE (a14= TEXT )
                    {
                    a13=(Token)match(input,KEYWORD_COLLATE,FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_datatype_CharacterStringType3729); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 352);
                    			}

                    // Sql.g:3383:4: (a14= TEXT )
                    // Sql.g:3384:5: a14= TEXT
                    {
                    a14=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_sql_datatype_CharacterStringType3755); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    						startIncompleteElement(element);
                    					}
                    					if (a14 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a14).getLine(), ((CommonToken) a14).getCharPositionInLine(), ((CommonToken) a14).getStartIndex(), ((CommonToken) a14).getStopIndex());
                    						}
                    						java.lang.String resolved = (java.lang.String) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_3_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a14, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 353);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 354, 359);
                    				addExpectedElement(null, 360, 362);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 363);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 364, 369);
            		addExpectedElement(null, 370, 372);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_org_emftext_language_sql_datatype_CharacterStringType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_CharacterStringType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_NationalCharacterStringType"
    // Sql.g:3438:1: parse_org_emftext_language_sql_datatype_NationalCharacterStringType returns [org.emftext.language.sql.datatype.NationalCharacterStringType element = null] : ( (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NCHAR' |a3= 'NATIONAL CHARACTER VARYING' |a4= 'NATIONAL CHAR VARYING' |a5= 'NCHAR VARYING' ) ) ( (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' ) )? ( (a11= KEYWORD_COLLATE (a12= TEXT ) ) )? ;
    public final org.emftext.language.sql.datatype.NationalCharacterStringType parse_org_emftext_language_sql_datatype_NationalCharacterStringType() throws RecognitionException {
        org.emftext.language.sql.datatype.NationalCharacterStringType element =  null;

        int parse_org_emftext_language_sql_datatype_NationalCharacterStringType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Sql.g:3441:2: ( ( (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NCHAR' |a3= 'NATIONAL CHARACTER VARYING' |a4= 'NATIONAL CHAR VARYING' |a5= 'NCHAR VARYING' ) ) ( (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' ) )? ( (a11= KEYWORD_COLLATE (a12= TEXT ) ) )? )
            // Sql.g:3442:2: ( (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NCHAR' |a3= 'NATIONAL CHARACTER VARYING' |a4= 'NATIONAL CHAR VARYING' |a5= 'NCHAR VARYING' ) ) ( (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' ) )? ( (a11= KEYWORD_COLLATE (a12= TEXT ) ) )?
            {
            // Sql.g:3442:2: ( (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NCHAR' |a3= 'NATIONAL CHARACTER VARYING' |a4= 'NATIONAL CHAR VARYING' |a5= 'NCHAR VARYING' ) )
            // Sql.g:3443:3: (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NCHAR' |a3= 'NATIONAL CHARACTER VARYING' |a4= 'NATIONAL CHAR VARYING' |a5= 'NCHAR VARYING' )
            {
            // Sql.g:3443:3: (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NCHAR' |a3= 'NATIONAL CHARACTER VARYING' |a4= 'NATIONAL CHAR VARYING' |a5= 'NCHAR VARYING' )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt39=1;
                }
                break;
            case 93:
                {
                alt39=2;
                }
                break;
            case 97:
                {
                alt39=3;
                }
                break;
            case 94:
                {
                alt39=4;
                }
                break;
            case 92:
                {
                alt39=5;
                }
                break;
            case 96:
                {
                alt39=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // Sql.g:3444:4: a0= 'NATIONAL CHARACTER'
                    {
                    a0=(Token)match(input,95,FOLLOW_95_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3825); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NATIONAL_CHARACTER_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:3457:8: a1= 'NATIONAL CHAR'
                    {
                    a1=(Token)match(input,93,FOLLOW_93_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3840); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NATIONAL_CHAR_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:3470:8: a2= 'NCHAR'
                    {
                    a2=(Token)match(input,97,FOLLOW_97_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3855); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NCHAR_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Sql.g:3483:8: a3= 'NATIONAL CHARACTER VARYING'
                    {
                    a3=(Token)match(input,94,FOLLOW_94_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3870); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NATIONAL_CHARACTER_VARYING_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Sql.g:3496:8: a4= 'NATIONAL CHAR VARYING'
                    {
                    a4=(Token)match(input,92,FOLLOW_92_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3885); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NATIONAL_CHAR_VARYING_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 6 :
                    // Sql.g:3509:8: a5= 'NCHAR VARYING'
                    {
                    a5=(Token)match(input,96,FOLLOW_96_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3900); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NCHAR_VARYING_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 373, 375);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 376, 381);
            		addExpectedElement(null, 382, 384);
            	}

            // Sql.g:3531:2: ( (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Sql.g:3532:3: (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' )
                    {
                    // Sql.g:3532:3: (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' )
                    // Sql.g:3533:4: a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')'
                    {
                    a8=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3930); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 385);
                    			}

                    // Sql.g:3547:4: (a9= UNSIGNED_INTEGER )
                    // Sql.g:3548:5: a9= UNSIGNED_INTEGER
                    {
                    a9=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3956); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    						startIncompleteElement(element);
                    					}
                    					if (a9 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a9).getLine(), ((CommonToken) a9).getCharPositionInLine(), ((CommonToken) a9).getStartIndex(), ((CommonToken) a9).getStopIndex());
                    						}
                    						org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a9, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 386);
                    			}

                    a10=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3989); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 387, 388);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 389, 394);
                    				addExpectedElement(null, 395, 397);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 398, 399);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 400, 405);
            		addExpectedElement(null, 406, 408);
            	}

            // Sql.g:3608:2: ( (a11= KEYWORD_COLLATE (a12= TEXT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_COLLATE) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==TEXT) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // Sql.g:3609:3: (a11= KEYWORD_COLLATE (a12= TEXT ) )
                    {
                    // Sql.g:3609:3: (a11= KEYWORD_COLLATE (a12= TEXT ) )
                    // Sql.g:3610:4: a11= KEYWORD_COLLATE (a12= TEXT )
                    {
                    a11=(Token)match(input,KEYWORD_COLLATE,FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4031); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 409);
                    			}

                    // Sql.g:3624:4: (a12= TEXT )
                    // Sql.g:3625:5: a12= TEXT
                    {
                    a12=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4057); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    						startIncompleteElement(element);
                    					}
                    					if (a12 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a12).getLine(), ((CommonToken) a12).getCharPositionInLine(), ((CommonToken) a12).getStartIndex(), ((CommonToken) a12).getStopIndex());
                    						}
                    						java.lang.String resolved = (java.lang.String) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_2_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a12, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 410);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 411, 416);
                    				addExpectedElement(null, 417, 419);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 420);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 421, 426);
            		addExpectedElement(null, 427, 429);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_org_emftext_language_sql_datatype_NationalCharacterStringType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_NationalCharacterStringType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType"
    // Sql.g:3679:1: parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType returns [org.emftext.language.sql.datatype.BinaryLargeObjectStringType element = null] : ( (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' ) ) ( (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' ) )? ;
    public final org.emftext.language.sql.datatype.BinaryLargeObjectStringType parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType() throws RecognitionException {
        org.emftext.language.sql.datatype.BinaryLargeObjectStringType element =  null;

        int parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a6=null;
        org.emftext.language.sql.datatype.LargeObjectLength a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // Sql.g:3682:2: ( ( (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' ) ) ( (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' ) )? )
            // Sql.g:3683:2: ( (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' ) ) ( (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' ) )?
            {
            // Sql.g:3683:2: ( (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' ) )
            // Sql.g:3684:3: (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' )
            {
            // Sql.g:3684:3: (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==65) ) {
                alt42=1;
            }
            else if ( (LA42_0==66) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // Sql.g:3685:4: a0= 'BINARY LARGE OBJECT'
                    {
                    a0=(Token)match(input,65,FOLLOW_65_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4127); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind.BINARY_LARGE_OBJECT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:3698:8: a1= 'BLOB'
                    {
                    a1=(Token)match(input,66,FOLLOW_66_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4142); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind.BLOB_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 430, 431);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 432, 437);
            		addExpectedElement(null, 438, 440);
            	}

            // Sql.g:3720:2: ( (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==58) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Sql.g:3721:3: (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' )
                    {
                    // Sql.g:3721:3: (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' )
                    // Sql.g:3722:4: a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')'
                    {
                    a4=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4172); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringType(), 441);
                    			}

                    // Sql.g:3736:4: (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength )
                    // Sql.g:3737:5: a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_LargeObjectLength_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4198);
                    a5_0=parse_org_emftext_language_sql_datatype_LargeObjectLength();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
                    						startIncompleteElement(element);
                    					}
                    					if (a5_0 != null) {
                    						if (a5_0 != null) {
                    							Object value = a5_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_1_0_0_1, a5_0, true);
                    						copyLocalizationInfos(a5_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 442);
                    			}

                    a6=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4226); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 443);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 444, 449);
                    				addExpectedElement(null, 450, 452);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 453);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 454, 459);
            		addExpectedElement(null, 460, 462);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_LargeObjectLength"
    // Sql.g:3795:1: parse_org_emftext_language_sql_datatype_LargeObjectLength returns [org.emftext.language.sql.datatype.LargeObjectLength element = null] : (a0= UNSIGNED_INTEGER ) ( ( (a1= 'K' |a2= 'M' |a3= 'G' ) ) )? ( ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) ) )? ;
    public final org.emftext.language.sql.datatype.LargeObjectLength parse_org_emftext_language_sql_datatype_LargeObjectLength() throws RecognitionException {
        org.emftext.language.sql.datatype.LargeObjectLength element =  null;

        int parse_org_emftext_language_sql_datatype_LargeObjectLength_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // Sql.g:3798:2: ( (a0= UNSIGNED_INTEGER ) ( ( (a1= 'K' |a2= 'M' |a3= 'G' ) ) )? ( ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) ) )? )
            // Sql.g:3799:2: (a0= UNSIGNED_INTEGER ) ( ( (a1= 'K' |a2= 'M' |a3= 'G' ) ) )? ( ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) ) )?
            {
            // Sql.g:3799:2: (a0= UNSIGNED_INTEGER )
            // Sql.g:3800:3: a0= UNSIGNED_INTEGER
            {
            a0=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4278); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
            				}
            				org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_0, resolved, true);
            				copyLocalizationInfos((CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 463, 465);
            	}

            // Sql.g:3835:2: ( ( (a1= 'K' |a2= 'M' |a3= 'G' ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==83||LA45_0==87||LA45_0==91) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Sql.g:3836:3: ( (a1= 'K' |a2= 'M' |a3= 'G' ) )
                    {
                    // Sql.g:3836:3: ( (a1= 'K' |a2= 'M' |a3= 'G' ) )
                    // Sql.g:3837:4: (a1= 'K' |a2= 'M' |a3= 'G' )
                    {
                    // Sql.g:3837:4: (a1= 'K' |a2= 'M' |a3= 'G' )
                    int alt44=3;
                    switch ( input.LA(1) ) {
                    case 87:
                        {
                        alt44=1;
                        }
                        break;
                    case 91:
                        {
                        alt44=2;
                        }
                        break;
                    case 83:
                        {
                        alt44=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;

                    }

                    switch (alt44) {
                        case 1 :
                            // Sql.g:3838:5: a1= 'K'
                            {
                            a1=(Token)match(input,87,FOLLOW_87_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4314); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_1, null, true);
                            					copyLocalizationInfos((CommonToken)a1, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getMultiplier().getEEnumLiteral(org.emftext.language.sql.datatype.Multiplier.K_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:3851:10: a2= 'M'
                            {
                            a2=(Token)match(input,91,FOLLOW_91_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4331); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_1, null, true);
                            					copyLocalizationInfos((CommonToken)a2, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getMultiplier().getEEnumLiteral(org.emftext.language.sql.datatype.Multiplier.M_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 3 :
                            // Sql.g:3864:10: a3= 'G'
                            {
                            a3=(Token)match(input,83,FOLLOW_83_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4348); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_1, null, true);
                            					copyLocalizationInfos((CommonToken)a3, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getMultiplier().getEEnumLiteral(org.emftext.language.sql.datatype.Multiplier.G_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 466, 467);
            	}

            // Sql.g:3885:2: ( ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0 >= 71 && LA47_0 <= 72)||LA47_0==99) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Sql.g:3886:3: ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) )
                    {
                    // Sql.g:3886:3: ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) )
                    // Sql.g:3887:4: (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' )
                    {
                    // Sql.g:3887:4: (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' )
                    int alt46=3;
                    switch ( input.LA(1) ) {
                    case 71:
                        {
                        alt46=1;
                        }
                        break;
                    case 72:
                        {
                        alt46=2;
                        }
                        break;
                    case 99:
                        {
                        alt46=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;

                    }

                    switch (alt46) {
                        case 1 :
                            // Sql.g:3888:5: a6= 'CHARACTERS'
                            {
                            a6=(Token)match(input,71,FOLLOW_71_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4392); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_2, null, true);
                            					copyLocalizationInfos((CommonToken)a6, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharLengthUnits().getEEnumLiteral(org.emftext.language.sql.datatype.CharLengthUnits.CHARACTERS_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__UNITS), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:3901:10: a7= 'CODE_UNITS'
                            {
                            a7=(Token)match(input,72,FOLLOW_72_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4409); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_2, null, true);
                            					copyLocalizationInfos((CommonToken)a7, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharLengthUnits().getEEnumLiteral(org.emftext.language.sql.datatype.CharLengthUnits.CODE_UNITS_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__UNITS), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 3 :
                            // Sql.g:3914:10: a8= 'OCTETS'
                            {
                            a8=(Token)match(input,99,FOLLOW_99_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4426); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_2, null, true);
                            					copyLocalizationInfos((CommonToken)a8, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharLengthUnits().getEEnumLiteral(org.emftext.language.sql.datatype.CharLengthUnits.OCTETS_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__UNITS), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 468);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, parse_org_emftext_language_sql_datatype_LargeObjectLength_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_LargeObjectLength"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_BooleanType"
    // Sql.g:3940:1: parse_org_emftext_language_sql_datatype_BooleanType returns [org.emftext.language.sql.datatype.BooleanType element = null] : a0= KEYWORD_BOOLEAN ;
    public final org.emftext.language.sql.datatype.BooleanType parse_org_emftext_language_sql_datatype_BooleanType() throws RecognitionException {
        org.emftext.language.sql.datatype.BooleanType element =  null;

        int parse_org_emftext_language_sql_datatype_BooleanType_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // Sql.g:3943:2: (a0= KEYWORD_BOOLEAN )
            // Sql.g:3944:2: a0= KEYWORD_BOOLEAN
            {
            a0=(Token)match(input,KEYWORD_BOOLEAN,FOLLOW_KEYWORD_BOOLEAN_in_parse_org_emftext_language_sql_datatype_BooleanType4470); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBooleanType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 469);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 470, 475);
            		addExpectedElement(null, 476, 478);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, parse_org_emftext_language_sql_datatype_BooleanType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_BooleanType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_ExactNumericType"
    // Sql.g:3965:1: parse_org_emftext_language_sql_datatype_ExactNumericType returns [org.emftext.language.sql.datatype.ExactNumericType element = null] : ( (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' ) ) ( (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' ) )? ;
    public final org.emftext.language.sql.datatype.ExactNumericType parse_org_emftext_language_sql_datatype_ExactNumericType() throws RecognitionException {
        org.emftext.language.sql.datatype.ExactNumericType element =  null;

        int parse_org_emftext_language_sql_datatype_ExactNumericType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // Sql.g:3968:2: ( ( (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' ) ) ( (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' ) )? )
            // Sql.g:3969:2: ( (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' ) ) ( (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' ) )?
            {
            // Sql.g:3969:2: ( (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' ) )
            // Sql.g:3970:3: (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' )
            {
            // Sql.g:3970:3: (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' )
            int alt48=7;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt48=1;
                }
                break;
            case 78:
                {
                alt48=2;
                }
                break;
            case 77:
                {
                alt48=3;
                }
                break;
            case 103:
                {
                alt48=4;
                }
                break;
            case 86:
                {
                alt48=5;
                }
                break;
            case 85:
                {
                alt48=6;
                }
                break;
            case 64:
                {
                alt48=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // Sql.g:3971:4: a0= 'NUMERIC'
                    {
                    a0=(Token)match(input,98,FOLLOW_98_in_parse_org_emftext_language_sql_datatype_ExactNumericType4508); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.NUMERIC_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:3984:8: a1= 'DECIMAL'
                    {
                    a1=(Token)match(input,78,FOLLOW_78_in_parse_org_emftext_language_sql_datatype_ExactNumericType4523); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.DECIMAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:3997:8: a2= 'DEC'
                    {
                    a2=(Token)match(input,77,FOLLOW_77_in_parse_org_emftext_language_sql_datatype_ExactNumericType4538); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.DEC_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Sql.g:4010:8: a3= 'SMALLINT'
                    {
                    a3=(Token)match(input,103,FOLLOW_103_in_parse_org_emftext_language_sql_datatype_ExactNumericType4553); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.SMALLINT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Sql.g:4023:8: a4= 'INTEGER'
                    {
                    a4=(Token)match(input,86,FOLLOW_86_in_parse_org_emftext_language_sql_datatype_ExactNumericType4568); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.INTEGER_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 6 :
                    // Sql.g:4036:8: a5= 'INT'
                    {
                    a5=(Token)match(input,85,FOLLOW_85_in_parse_org_emftext_language_sql_datatype_ExactNumericType4583); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.INT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 7 :
                    // Sql.g:4049:8: a6= 'BIGINT'
                    {
                    a6=(Token)match(input,64,FOLLOW_64_in_parse_org_emftext_language_sql_datatype_ExactNumericType4598); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a6, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.BIGINT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 479, 480);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 481, 486);
            		addExpectedElement(null, 487, 489);
            	}

            // Sql.g:4071:2: ( (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Sql.g:4072:3: (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' )
                    {
                    // Sql.g:4072:3: (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' )
                    // Sql.g:4073:4: a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')'
                    {
                    a9=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_ExactNumericType4628); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 490);
                    			}

                    // Sql.g:4087:4: (a10= UNSIGNED_INTEGER )
                    // Sql.g:4088:5: a10= UNSIGNED_INTEGER
                    {
                    a10=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ExactNumericType4654); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    						startIncompleteElement(element);
                    					}
                    					if (a10 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a10).getLine(), ((CommonToken) a10).getCharPositionInLine(), ((CommonToken) a10).getStartIndex(), ((CommonToken) a10).getStopIndex());
                    						}
                    						org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a10, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 491, 492);
                    			}

                    // Sql.g:4123:4: ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==61) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // Sql.g:4124:5: (a11= ',' (a12= UNSIGNED_INTEGER ) )
                            {
                            // Sql.g:4124:5: (a11= ',' (a12= UNSIGNED_INTEGER ) )
                            // Sql.g:4125:6: a11= ',' (a12= UNSIGNED_INTEGER )
                            {
                            a11=(Token)match(input,61,FOLLOW_61_in_parse_org_emftext_language_sql_datatype_ExactNumericType4700); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_2_0_0_0, null, true);
                            						copyLocalizationInfos((CommonToken)a11, element);
                            					}

                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, 493);
                            					}

                            // Sql.g:4139:6: (a12= UNSIGNED_INTEGER )
                            // Sql.g:4140:7: a12= UNSIGNED_INTEGER
                            {
                            a12=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ExactNumericType4734); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            							if (terminateParsing) {
                            								throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            							}
                            							if (element == null) {
                            								element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                            								startIncompleteElement(element);
                            							}
                            							if (a12 != null) {
                            								org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
                            								tokenResolver.setOptions(getOptions());
                            								org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            								tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__SCALE), result);
                            								Object resolvedObject = result.getResolvedToken();
                            								if (resolvedObject == null) {
                            									addErrorToResource(result.getErrorMessage(), ((CommonToken) a12).getLine(), ((CommonToken) a12).getCharPositionInLine(), ((CommonToken) a12).getStartIndex(), ((CommonToken) a12).getStopIndex());
                            								}
                            								org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
                            								if (resolved != null) {
                            									Object value = resolved;
                            									element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__SCALE), value);
                            									completedElement(value, false);
                            								}
                            								collectHiddenTokens(element);
                            								retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_2_0_0_1, resolved, true);
                            								copyLocalizationInfos((CommonToken) a12, element);
                            							}
                            						}

                            }


                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, 494);
                            					}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 495);
                    			}

                    a13=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_datatype_ExactNumericType4802); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_3, null, true);
                    				copyLocalizationInfos((CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 496);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 497, 502);
                    				addExpectedElement(null, 503, 505);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 506);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 507, 512);
            		addExpectedElement(null, 513, 515);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, parse_org_emftext_language_sql_datatype_ExactNumericType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_ExactNumericType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_ApproximateNumericType"
    // Sql.g:4215:1: parse_org_emftext_language_sql_datatype_ApproximateNumericType returns [org.emftext.language.sql.datatype.ApproximateNumericType element = null] : ( (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE_PRECISION' ) ) ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )? ;
    public final org.emftext.language.sql.datatype.ApproximateNumericType parse_org_emftext_language_sql_datatype_ApproximateNumericType() throws RecognitionException {
        org.emftext.language.sql.datatype.ApproximateNumericType element =  null;

        int parse_org_emftext_language_sql_datatype_ApproximateNumericType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // Sql.g:4218:2: ( ( (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE_PRECISION' ) ) ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )? )
            // Sql.g:4219:2: ( (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE_PRECISION' ) ) ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )?
            {
            // Sql.g:4219:2: ( (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE_PRECISION' ) )
            // Sql.g:4220:3: (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE_PRECISION' )
            {
            // Sql.g:4220:3: (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE_PRECISION' )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt51=1;
                }
                break;
            case 102:
                {
                alt51=2;
                }
                break;
            case 80:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // Sql.g:4221:4: a0= 'FLOAT'
                    {
                    a0=(Token)match(input,82,FOLLOW_82_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4859); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ApproximateNumericTypeKind.FLOAT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:4234:8: a1= 'REAL'
                    {
                    a1=(Token)match(input,102,FOLLOW_102_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4874); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ApproximateNumericTypeKind.REAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:4247:8: a2= 'DOUBLE_PRECISION'
                    {
                    a2=(Token)match(input,80,FOLLOW_80_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4889); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ApproximateNumericTypeKind.DOUBLE_PRECISION_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 516, 517);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 518, 523);
            		addExpectedElement(null, 524, 526);
            	}

            // Sql.g:4269:2: ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==58) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Sql.g:4270:3: (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' )
                    {
                    // Sql.g:4270:3: (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' )
                    // Sql.g:4271:4: a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')'
                    {
                    a5=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4919); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 527);
                    			}

                    // Sql.g:4285:4: (a6= UNSIGNED_INTEGER )
                    // Sql.g:4286:5: a6= UNSIGNED_INTEGER
                    {
                    a6=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4945); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    						startIncompleteElement(element);
                    					}
                    					if (a6 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a6).getLine(), ((CommonToken) a6).getCharPositionInLine(), ((CommonToken) a6).getStartIndex(), ((CommonToken) a6).getStopIndex());
                    						}
                    						org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a6, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 528);
                    			}

                    a7=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4978); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 529);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 530, 535);
                    				addExpectedElement(null, 536, 538);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 539);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 540, 545);
            		addExpectedElement(null, 546, 548);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, parse_org_emftext_language_sql_datatype_ApproximateNumericType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_ApproximateNumericType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_DatetimeType"
    // Sql.g:4354:1: parse_org_emftext_language_sql_datatype_DatetimeType returns [org.emftext.language.sql.datatype.DatetimeType element = null] : ( (a0= 'DATE' |a1= 'TIME' |a2= 'TIMESTAMP' ) ) ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )? ( ( (a8= 'WITH TIME ZONE' |a9= 'WITHOUT TIME ZONE' ) ) )? ;
    public final org.emftext.language.sql.datatype.DatetimeType parse_org_emftext_language_sql_datatype_DatetimeType() throws RecognitionException {
        org.emftext.language.sql.datatype.DatetimeType element =  null;

        int parse_org_emftext_language_sql_datatype_DatetimeType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }

            // Sql.g:4357:2: ( ( (a0= 'DATE' |a1= 'TIME' |a2= 'TIMESTAMP' ) ) ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )? ( ( (a8= 'WITH TIME ZONE' |a9= 'WITHOUT TIME ZONE' ) ) )? )
            // Sql.g:4358:2: ( (a0= 'DATE' |a1= 'TIME' |a2= 'TIMESTAMP' ) ) ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )? ( ( (a8= 'WITH TIME ZONE' |a9= 'WITHOUT TIME ZONE' ) ) )?
            {
            // Sql.g:4358:2: ( (a0= 'DATE' |a1= 'TIME' |a2= 'TIMESTAMP' ) )
            // Sql.g:4359:3: (a0= 'DATE' |a1= 'TIME' |a2= 'TIMESTAMP' )
            {
            // Sql.g:4359:3: (a0= 'DATE' |a1= 'TIME' |a2= 'TIMESTAMP' )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt53=1;
                }
                break;
            case 104:
                {
                alt53=2;
                }
                break;
            case 105:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // Sql.g:4360:4: a0= 'DATE'
                    {
                    a0=(Token)match(input,76,FOLLOW_76_in_parse_org_emftext_language_sql_datatype_DatetimeType5035); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getDatetimeTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.DatetimeTypeKind.DATE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.DATETIME_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:4373:8: a1= 'TIME'
                    {
                    a1=(Token)match(input,104,FOLLOW_104_in_parse_org_emftext_language_sql_datatype_DatetimeType5050); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getDatetimeTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.DatetimeTypeKind.TIME_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.DATETIME_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:4386:8: a2= 'TIMESTAMP'
                    {
                    a2=(Token)match(input,105,FOLLOW_105_in_parse_org_emftext_language_sql_datatype_DatetimeType5065); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getDatetimeTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.DatetimeTypeKind.TIMESTAMP_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.DATETIME_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 549, 551);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 552, 557);
            		addExpectedElement(null, 558, 560);
            	}

            // Sql.g:4408:2: ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==58) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Sql.g:4409:3: (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' )
                    {
                    // Sql.g:4409:3: (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' )
                    // Sql.g:4410:4: a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')'
                    {
                    a5=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_DatetimeType5095); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 561);
                    			}

                    // Sql.g:4424:4: (a6= UNSIGNED_INTEGER )
                    // Sql.g:4425:5: a6= UNSIGNED_INTEGER
                    {
                    a6=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_DatetimeType5121); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
                    						startIncompleteElement(element);
                    					}
                    					if (a6 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.DATETIME_TYPE__PRECISION), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a6).getLine(), ((CommonToken) a6).getCharPositionInLine(), ((CommonToken) a6).getStartIndex(), ((CommonToken) a6).getStopIndex());
                    						}
                    						org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.DATETIME_TYPE__PRECISION), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a6, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 562);
                    			}

                    a7=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_datatype_DatetimeType5154); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 563, 564);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 565, 570);
                    				addExpectedElement(null, 571, 573);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 574, 575);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 576, 581);
            		addExpectedElement(null, 582, 584);
            	}

            // Sql.g:4485:2: ( ( (a8= 'WITH TIME ZONE' |a9= 'WITHOUT TIME ZONE' ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0 >= 109 && LA56_0 <= 110)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // Sql.g:4486:3: ( (a8= 'WITH TIME ZONE' |a9= 'WITHOUT TIME ZONE' ) )
                    {
                    // Sql.g:4486:3: ( (a8= 'WITH TIME ZONE' |a9= 'WITHOUT TIME ZONE' ) )
                    // Sql.g:4487:4: (a8= 'WITH TIME ZONE' |a9= 'WITHOUT TIME ZONE' )
                    {
                    // Sql.g:4487:4: (a8= 'WITH TIME ZONE' |a9= 'WITHOUT TIME ZONE' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==109) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==110) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;

                    }
                    switch (alt55) {
                        case 1 :
                            // Sql.g:4488:5: a8= 'WITH TIME ZONE'
                            {
                            a8=(Token)match(input,109,FOLLOW_109_in_parse_org_emftext_language_sql_datatype_DatetimeType5202); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_2, true, true);
                            					copyLocalizationInfos((CommonToken)a8, element);
                            					// set value of boolean attribute
                            					Object value = true;
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.DATETIME_TYPE__WITH_TIME_ZONE), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:4501:10: a9= 'WITHOUT TIME ZONE'
                            {
                            a9=(Token)match(input,110,FOLLOW_110_in_parse_org_emftext_language_sql_datatype_DatetimeType5219); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_2, false, true);
                            					copyLocalizationInfos((CommonToken)a9, element);
                            					// set value of boolean attribute
                            					Object value = false;
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.DATETIME_TYPE__WITH_TIME_ZONE), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 585);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 586, 591);
            		addExpectedElement(null, 592, 594);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, parse_org_emftext_language_sql_datatype_DatetimeType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_DatetimeType"



    // $ANTLR start "parse_org_emftext_language_sql_function_DatetimeValueFunction"
    // Sql.g:4529:1: parse_org_emftext_language_sql_function_DatetimeValueFunction returns [org.emftext.language.sql.function.DatetimeValueFunction element = null] : ( (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' ) ) ( (a7= '(' (a8= TEXT ) a9= ')' ) )? ;
    public final org.emftext.language.sql.function.DatetimeValueFunction parse_org_emftext_language_sql_function_DatetimeValueFunction() throws RecognitionException {
        org.emftext.language.sql.function.DatetimeValueFunction element =  null;

        int parse_org_emftext_language_sql_function_DatetimeValueFunction_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }

            // Sql.g:4532:2: ( ( (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' ) ) ( (a7= '(' (a8= TEXT ) a9= ')' ) )? )
            // Sql.g:4533:2: ( (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' ) ) ( (a7= '(' (a8= TEXT ) a9= ')' ) )?
            {
            // Sql.g:4533:2: ( (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' ) )
            // Sql.g:4534:3: (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' )
            {
            // Sql.g:4534:3: (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt57=1;
                }
                break;
            case 74:
                {
                alt57=2;
                }
                break;
            case 89:
                {
                alt57=3;
                }
                break;
            case 75:
                {
                alt57=4;
                }
                break;
            case 90:
                {
                alt57=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // Sql.g:4535:4: a0= 'CURRENT_DATE'
                    {
                    a0=(Token)match(input,73,FOLLOW_73_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5272); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunctionKind().getEEnumLiteral(org.emftext.language.sql.function.DatetimeValueFunctionKind.CURRENT_DATE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:4548:8: a1= 'CURRENT_TIME'
                    {
                    a1=(Token)match(input,74,FOLLOW_74_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5287); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunctionKind().getEEnumLiteral(org.emftext.language.sql.function.DatetimeValueFunctionKind.CURRENT_TIME_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:4561:8: a2= 'LOCALTIME'
                    {
                    a2=(Token)match(input,89,FOLLOW_89_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5302); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunctionKind().getEEnumLiteral(org.emftext.language.sql.function.DatetimeValueFunctionKind.LOCALTIME_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Sql.g:4574:8: a3= 'CURRENT_TIMESTAMP'
                    {
                    a3=(Token)match(input,75,FOLLOW_75_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5317); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunctionKind().getEEnumLiteral(org.emftext.language.sql.function.DatetimeValueFunctionKind.CURRENT_TIMESTAMP_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Sql.g:4587:8: a4= 'LOCALTIMESTAMP'
                    {
                    a4=(Token)match(input,90,FOLLOW_90_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5332); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunctionKind().getEEnumLiteral(org.emftext.language.sql.function.DatetimeValueFunctionKind.LOCALTIMESTAMP_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 595);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 596, 601);
            		addExpectedElement(null, 602, 604);
            	}

            // Sql.g:4609:2: ( (a7= '(' (a8= TEXT ) a9= ')' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==58) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // Sql.g:4610:3: (a7= '(' (a8= TEXT ) a9= ')' )
                    {
                    // Sql.g:4610:3: (a7= '(' (a8= TEXT ) a9= ')' )
                    // Sql.g:4611:4: a7= '(' (a8= TEXT ) a9= ')'
                    {
                    a7=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5362); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 605);
                    			}

                    // Sql.g:4625:4: (a8= TEXT )
                    // Sql.g:4626:5: a8= TEXT
                    {
                    a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5388); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    						startIncompleteElement(element);
                    					}
                    					if (a8 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
                    						}
                    						org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a8, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 606);
                    			}

                    a9=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5421); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 607, 612);
                    				addExpectedElement(null, 613, 615);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 616, 621);
            		addExpectedElement(null, 622, 624);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, parse_org_emftext_language_sql_function_DatetimeValueFunction_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_function_DatetimeValueFunction"



    // $ANTLR start "parse_org_emftext_language_sql_expression_NullSpecification"
    // Sql.g:4692:1: parse_org_emftext_language_sql_expression_NullSpecification returns [org.emftext.language.sql.expression.NullSpecification element = null] : a0= KEYWORD_NULL ;
    public final org.emftext.language.sql.expression.NullSpecification parse_org_emftext_language_sql_expression_NullSpecification() throws RecognitionException {
        org.emftext.language.sql.expression.NullSpecification element =  null;

        int parse_org_emftext_language_sql_expression_NullSpecification_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }

            // Sql.g:4695:2: (a0= KEYWORD_NULL )
            // Sql.g:4696:2: a0= KEYWORD_NULL
            {
            a0=(Token)match(input,KEYWORD_NULL,FOLLOW_KEYWORD_NULL_in_parse_org_emftext_language_sql_expression_NullSpecification5469); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.expression.ExpressionFactory.eINSTANCE.createNullSpecification();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 625, 630);
            		addExpectedElement(null, 631, 633);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, parse_org_emftext_language_sql_expression_NullSpecification_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_expression_NullSpecification"



    // $ANTLR start "parse_org_emftext_language_sql_common_DirectSQLStatement"
    // Sql.g:4716:1: parse_org_emftext_language_sql_common_DirectSQLStatement returns [org.emftext.language.sql.common.DirectSQLStatement element = null] : c0= parse_org_emftext_language_sql_schema_TableDefinition ;
    public final org.emftext.language.sql.common.DirectSQLStatement parse_org_emftext_language_sql_common_DirectSQLStatement() throws RecognitionException {
        org.emftext.language.sql.common.DirectSQLStatement element =  null;

        int parse_org_emftext_language_sql_common_DirectSQLStatement_StartIndex = input.index();

        org.emftext.language.sql.schema.TableDefinition c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }

            // Sql.g:4717:2: (c0= parse_org_emftext_language_sql_schema_TableDefinition )
            // Sql.g:4718:2: c0= parse_org_emftext_language_sql_schema_TableDefinition
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableDefinition_in_parse_org_emftext_language_sql_common_DirectSQLStatement5494);
            c0=parse_org_emftext_language_sql_schema_TableDefinition();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, parse_org_emftext_language_sql_common_DirectSQLStatement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_common_DirectSQLStatement"



    // $ANTLR start "parse_org_emftext_language_sql_schema_TableContentsSource"
    // Sql.g:4722:1: parse_org_emftext_language_sql_schema_TableContentsSource returns [org.emftext.language.sql.schema.TableContentsSource element = null] : c0= parse_org_emftext_language_sql_schema_TableElementList ;
    public final org.emftext.language.sql.schema.TableContentsSource parse_org_emftext_language_sql_schema_TableContentsSource() throws RecognitionException {
        org.emftext.language.sql.schema.TableContentsSource element =  null;

        int parse_org_emftext_language_sql_schema_TableContentsSource_StartIndex = input.index();

        org.emftext.language.sql.schema.TableElementList c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }

            // Sql.g:4723:2: (c0= parse_org_emftext_language_sql_schema_TableElementList )
            // Sql.g:4724:2: c0= parse_org_emftext_language_sql_schema_TableElementList
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableElementList_in_parse_org_emftext_language_sql_schema_TableContentsSource5515);
            c0=parse_org_emftext_language_sql_schema_TableElementList();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, parse_org_emftext_language_sql_schema_TableContentsSource_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_TableContentsSource"



    // $ANTLR start "parse_org_emftext_language_sql_schema_TableElement"
    // Sql.g:4728:1: parse_org_emftext_language_sql_schema_TableElement returns [org.emftext.language.sql.schema.TableElement element = null] : (c0= parse_org_emftext_language_sql_schema_Column |c1= parse_org_emftext_language_sql_schema_UniqueTableConstraint |c2= parse_org_emftext_language_sql_schema_ReferentialTableConstraint );
    public final org.emftext.language.sql.schema.TableElement parse_org_emftext_language_sql_schema_TableElement() throws RecognitionException {
        org.emftext.language.sql.schema.TableElement element =  null;

        int parse_org_emftext_language_sql_schema_TableElement_StartIndex = input.index();

        org.emftext.language.sql.schema.Column c0 =null;

        org.emftext.language.sql.schema.UniqueTableConstraint c1 =null;

        org.emftext.language.sql.schema.ReferentialTableConstraint c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }

            // Sql.g:4729:2: (c0= parse_org_emftext_language_sql_schema_Column |c1= parse_org_emftext_language_sql_schema_UniqueTableConstraint |c2= parse_org_emftext_language_sql_schema_ReferentialTableConstraint )
            int alt59=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt59=1;
                }
                break;
            case KEYWORD_CONSTRAINT:
                {
                int LA59_2 = input.LA(2);

                if ( (LA59_2==IDENTIFIER) ) {
                    int LA59_5 = input.LA(3);

                    if ( (LA59_5==101||LA59_5==107) ) {
                        alt59=2;
                    }
                    else if ( (LA59_5==KEYWORD_FOREIGN) ) {
                        alt59=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 5, input);

                        throw nvae;

                    }
                }
                else if ( (LA59_2==SCHEMA_QUALIFIED_NAME) ) {
                    int LA59_6 = input.LA(3);

                    if ( (LA59_6==101||LA59_6==107) ) {
                        alt59=2;
                    }
                    else if ( (LA59_6==KEYWORD_FOREIGN) ) {
                        alt59=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 6, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 2, input);

                    throw nvae;

                }
                }
                break;
            case 101:
            case 107:
                {
                alt59=2;
                }
                break;
            case KEYWORD_FOREIGN:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // Sql.g:4730:2: c0= parse_org_emftext_language_sql_schema_Column
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_Column_in_parse_org_emftext_language_sql_schema_TableElement5536);
                    c0=parse_org_emftext_language_sql_schema_Column();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:4731:4: c1= parse_org_emftext_language_sql_schema_UniqueTableConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_UniqueTableConstraint_in_parse_org_emftext_language_sql_schema_TableElement5546);
                    c1=parse_org_emftext_language_sql_schema_UniqueTableConstraint();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:4732:4: c2= parse_org_emftext_language_sql_schema_ReferentialTableConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_ReferentialTableConstraint_in_parse_org_emftext_language_sql_schema_TableElement5556);
                    c2=parse_org_emftext_language_sql_schema_ReferentialTableConstraint();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, parse_org_emftext_language_sql_schema_TableElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_TableElement"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_DataType"
    // Sql.g:4736:1: parse_org_emftext_language_sql_datatype_DataType returns [org.emftext.language.sql.datatype.DataType element = null] : (c0= parse_org_emftext_language_sql_datatype_CharacterStringType |c1= parse_org_emftext_language_sql_datatype_NationalCharacterStringType |c2= parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType |c3= parse_org_emftext_language_sql_datatype_BooleanType |c4= parse_org_emftext_language_sql_datatype_ExactNumericType |c5= parse_org_emftext_language_sql_datatype_ApproximateNumericType |c6= parse_org_emftext_language_sql_datatype_DatetimeType );
    public final org.emftext.language.sql.datatype.DataType parse_org_emftext_language_sql_datatype_DataType() throws RecognitionException {
        org.emftext.language.sql.datatype.DataType element =  null;

        int parse_org_emftext_language_sql_datatype_DataType_StartIndex = input.index();

        org.emftext.language.sql.datatype.CharacterStringType c0 =null;

        org.emftext.language.sql.datatype.NationalCharacterStringType c1 =null;

        org.emftext.language.sql.datatype.BinaryLargeObjectStringType c2 =null;

        org.emftext.language.sql.datatype.BooleanType c3 =null;

        org.emftext.language.sql.datatype.ExactNumericType c4 =null;

        org.emftext.language.sql.datatype.ApproximateNumericType c5 =null;

        org.emftext.language.sql.datatype.DatetimeType c6 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }

            // Sql.g:4737:2: (c0= parse_org_emftext_language_sql_datatype_CharacterStringType |c1= parse_org_emftext_language_sql_datatype_NationalCharacterStringType |c2= parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType |c3= parse_org_emftext_language_sql_datatype_BooleanType |c4= parse_org_emftext_language_sql_datatype_ExactNumericType |c5= parse_org_emftext_language_sql_datatype_ApproximateNumericType |c6= parse_org_emftext_language_sql_datatype_DatetimeType )
            int alt60=7;
            switch ( input.LA(1) ) {
            case 67:
            case 68:
            case 69:
            case 70:
            case 108:
                {
                alt60=1;
                }
                break;
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
                {
                alt60=2;
                }
                break;
            case 65:
            case 66:
                {
                alt60=3;
                }
                break;
            case KEYWORD_BOOLEAN:
                {
                alt60=4;
                }
                break;
            case 64:
            case 77:
            case 78:
            case 85:
            case 86:
            case 98:
            case 103:
                {
                alt60=5;
                }
                break;
            case 80:
            case 82:
            case 102:
                {
                alt60=6;
                }
                break;
            case 76:
            case 104:
            case 105:
                {
                alt60=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // Sql.g:4738:2: c0= parse_org_emftext_language_sql_datatype_CharacterStringType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_CharacterStringType_in_parse_org_emftext_language_sql_datatype_DataType5577);
                    c0=parse_org_emftext_language_sql_datatype_CharacterStringType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:4739:4: c1= parse_org_emftext_language_sql_datatype_NationalCharacterStringType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_NationalCharacterStringType_in_parse_org_emftext_language_sql_datatype_DataType5587);
                    c1=parse_org_emftext_language_sql_datatype_NationalCharacterStringType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:4740:4: c2= parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_in_parse_org_emftext_language_sql_datatype_DataType5597);
                    c2=parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Sql.g:4741:4: c3= parse_org_emftext_language_sql_datatype_BooleanType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_BooleanType_in_parse_org_emftext_language_sql_datatype_DataType5607);
                    c3=parse_org_emftext_language_sql_datatype_BooleanType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Sql.g:4742:4: c4= parse_org_emftext_language_sql_datatype_ExactNumericType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_ExactNumericType_in_parse_org_emftext_language_sql_datatype_DataType5617);
                    c4=parse_org_emftext_language_sql_datatype_ExactNumericType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // Sql.g:4743:4: c5= parse_org_emftext_language_sql_datatype_ApproximateNumericType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_ApproximateNumericType_in_parse_org_emftext_language_sql_datatype_DataType5627);
                    c5=parse_org_emftext_language_sql_datatype_ApproximateNumericType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // Sql.g:4744:4: c6= parse_org_emftext_language_sql_datatype_DatetimeType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_DatetimeType_in_parse_org_emftext_language_sql_datatype_DataType5637);
                    c6=parse_org_emftext_language_sql_datatype_DatetimeType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, parse_org_emftext_language_sql_datatype_DataType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_DataType"



    // $ANTLR start "parse_org_emftext_language_sql_schema_DefaultOption"
    // Sql.g:4748:1: parse_org_emftext_language_sql_schema_DefaultOption returns [org.emftext.language.sql.schema.DefaultOption element = null] : (c0= parse_org_emftext_language_sql_schema_LiteralDefaultOption |c1= parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption |c2= parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption );
    public final org.emftext.language.sql.schema.DefaultOption parse_org_emftext_language_sql_schema_DefaultOption() throws RecognitionException {
        org.emftext.language.sql.schema.DefaultOption element =  null;

        int parse_org_emftext_language_sql_schema_DefaultOption_StartIndex = input.index();

        org.emftext.language.sql.schema.LiteralDefaultOption c0 =null;

        org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption c1 =null;

        org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }

            // Sql.g:4749:2: (c0= parse_org_emftext_language_sql_schema_LiteralDefaultOption |c1= parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption |c2= parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption )
            int alt61=3;
            switch ( input.LA(1) ) {
            case EOF:
            case KEYWORD_COLLATE:
            case KEYWORD_CONSTRAINT:
            case KEYWORD_DATE:
            case KEYWORD_INTERVAL:
            case KEYWORD_NOT:
            case KEYWORD_REFERENCES:
            case KEYWORD_TIME:
            case KEYWORD_TIMESTAMP:
            case 59:
            case 61:
            case 81:
            case 101:
            case 106:
            case 107:
                {
                alt61=1;
                }
                break;
            case 73:
            case 74:
            case 75:
            case 89:
            case 90:
                {
                alt61=2;
                }
                break;
            case KEYWORD_NULL:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // Sql.g:4750:2: c0= parse_org_emftext_language_sql_schema_LiteralDefaultOption
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_LiteralDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption5658);
                    c0=parse_org_emftext_language_sql_schema_LiteralDefaultOption();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:4751:4: c1= parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption5668);
                    c1=parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:4752:4: c2= parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption5678);
                    c2=parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, parse_org_emftext_language_sql_schema_DefaultOption_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_DefaultOption"



    // $ANTLR start "parse_org_emftext_language_sql_schema_ColumnConstraint"
    // Sql.g:4756:1: parse_org_emftext_language_sql_schema_ColumnConstraint returns [org.emftext.language.sql.schema.ColumnConstraint element = null] : (c0= parse_org_emftext_language_sql_schema_NotNullColumnConstraint |c1= parse_org_emftext_language_sql_schema_UniqueColumnConstraint |c2= parse_org_emftext_language_sql_schema_ReferentialColumnConstraint );
    public final org.emftext.language.sql.schema.ColumnConstraint parse_org_emftext_language_sql_schema_ColumnConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.ColumnConstraint element =  null;

        int parse_org_emftext_language_sql_schema_ColumnConstraint_StartIndex = input.index();

        org.emftext.language.sql.schema.NotNullColumnConstraint c0 =null;

        org.emftext.language.sql.schema.UniqueColumnConstraint c1 =null;

        org.emftext.language.sql.schema.ReferentialColumnConstraint c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }

            // Sql.g:4757:2: (c0= parse_org_emftext_language_sql_schema_NotNullColumnConstraint |c1= parse_org_emftext_language_sql_schema_UniqueColumnConstraint |c2= parse_org_emftext_language_sql_schema_ReferentialColumnConstraint )
            int alt62=3;
            switch ( input.LA(1) ) {
            case KEYWORD_CONSTRAINT:
                {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==IDENTIFIER) ) {
                    switch ( input.LA(3) ) {
                    case KEYWORD_NOT:
                        {
                        alt62=1;
                        }
                        break;
                    case 101:
                    case 107:
                        {
                        alt62=2;
                        }
                        break;
                    case KEYWORD_REFERENCES:
                        {
                        alt62=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 5, input);

                        throw nvae;

                    }

                }
                else if ( (LA62_1==SCHEMA_QUALIFIED_NAME) ) {
                    switch ( input.LA(3) ) {
                    case KEYWORD_NOT:
                        {
                        alt62=1;
                        }
                        break;
                    case 101:
                    case 107:
                        {
                        alt62=2;
                        }
                        break;
                    case KEYWORD_REFERENCES:
                        {
                        alt62=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 6, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;

                }
                }
                break;
            case KEYWORD_NOT:
                {
                alt62=1;
                }
                break;
            case 101:
            case 107:
                {
                alt62=2;
                }
                break;
            case KEYWORD_REFERENCES:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // Sql.g:4758:2: c0= parse_org_emftext_language_sql_schema_NotNullColumnConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_NotNullColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint5699);
                    c0=parse_org_emftext_language_sql_schema_NotNullColumnConstraint();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:4759:4: c1= parse_org_emftext_language_sql_schema_UniqueColumnConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_UniqueColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint5709);
                    c1=parse_org_emftext_language_sql_schema_UniqueColumnConstraint();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:4760:4: c2= parse_org_emftext_language_sql_schema_ReferentialColumnConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint5719);
                    c2=parse_org_emftext_language_sql_schema_ReferentialColumnConstraint();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, parse_org_emftext_language_sql_schema_ColumnConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_ColumnConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_literal_Literal"
    // Sql.g:4764:1: parse_org_emftext_language_sql_literal_Literal returns [org.emftext.language.sql.literal.Literal element = null] : (c0= parse_org_emftext_language_sql_literal_DateLiteral |c1= parse_org_emftext_language_sql_literal_TimeLiteral |c2= parse_org_emftext_language_sql_literal_TimestampLiteral |c3= parse_org_emftext_language_sql_literal_IntervalLiteral |c4= parse_org_emftext_language_sql_literal_BooleanLiteral );
    public final org.emftext.language.sql.literal.Literal parse_org_emftext_language_sql_literal_Literal() throws RecognitionException {
        org.emftext.language.sql.literal.Literal element =  null;

        int parse_org_emftext_language_sql_literal_Literal_StartIndex = input.index();

        org.emftext.language.sql.literal.DateLiteral c0 =null;

        org.emftext.language.sql.literal.TimeLiteral c1 =null;

        org.emftext.language.sql.literal.TimestampLiteral c2 =null;

        org.emftext.language.sql.literal.IntervalLiteral c3 =null;

        org.emftext.language.sql.literal.BooleanLiteral c4 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }

            // Sql.g:4765:2: (c0= parse_org_emftext_language_sql_literal_DateLiteral |c1= parse_org_emftext_language_sql_literal_TimeLiteral |c2= parse_org_emftext_language_sql_literal_TimestampLiteral |c3= parse_org_emftext_language_sql_literal_IntervalLiteral |c4= parse_org_emftext_language_sql_literal_BooleanLiteral )
            int alt63=5;
            switch ( input.LA(1) ) {
            case KEYWORD_DATE:
                {
                alt63=1;
                }
                break;
            case KEYWORD_TIME:
                {
                alt63=2;
                }
                break;
            case KEYWORD_TIMESTAMP:
                {
                alt63=3;
                }
                break;
            case KEYWORD_INTERVAL:
                {
                alt63=4;
                }
                break;
            case EOF:
            case KEYWORD_COLLATE:
            case KEYWORD_CONSTRAINT:
            case KEYWORD_NOT:
            case KEYWORD_REFERENCES:
            case 59:
            case 61:
            case 81:
            case 101:
            case 106:
            case 107:
                {
                alt63=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // Sql.g:4766:2: c0= parse_org_emftext_language_sql_literal_DateLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_DateLiteral_in_parse_org_emftext_language_sql_literal_Literal5740);
                    c0=parse_org_emftext_language_sql_literal_DateLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:4767:4: c1= parse_org_emftext_language_sql_literal_TimeLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_TimeLiteral_in_parse_org_emftext_language_sql_literal_Literal5750);
                    c1=parse_org_emftext_language_sql_literal_TimeLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:4768:4: c2= parse_org_emftext_language_sql_literal_TimestampLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_TimestampLiteral_in_parse_org_emftext_language_sql_literal_Literal5760);
                    c2=parse_org_emftext_language_sql_literal_TimestampLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Sql.g:4769:4: c3= parse_org_emftext_language_sql_literal_IntervalLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_IntervalLiteral_in_parse_org_emftext_language_sql_literal_Literal5770);
                    c3=parse_org_emftext_language_sql_literal_IntervalLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Sql.g:4770:4: c4= parse_org_emftext_language_sql_literal_BooleanLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_BooleanLiteral_in_parse_org_emftext_language_sql_literal_Literal5780);
                    c4=parse_org_emftext_language_sql_literal_BooleanLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, parse_org_emftext_language_sql_literal_Literal_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_Literal"



    // $ANTLR start "parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification"
    // Sql.g:4774:1: parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification returns [org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification element = null] : c0= parse_org_emftext_language_sql_expression_NullSpecification ;
    public final org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification() throws RecognitionException {
        org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification element =  null;

        int parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification_StartIndex = input.index();

        org.emftext.language.sql.expression.NullSpecification c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }

            // Sql.g:4775:2: (c0= parse_org_emftext_language_sql_expression_NullSpecification )
            // Sql.g:4776:2: c0= parse_org_emftext_language_sql_expression_NullSpecification
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_expression_NullSpecification_in_parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification5801);
            c0=parse_org_emftext_language_sql_expression_NullSpecification();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SQLScript_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_DirectSQLStatement_in_parse_org_emftext_language_sql_common_SQLScript130 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_parse_org_emftext_language_sql_common_SQLScript158 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_KEYWORD_CREATE_in_parse_org_emftext_language_sql_schema_TableDefinition206 = new BitSet(new long[]{0x0000000000800000L,0x0000000001100000L});
    public static final BitSet FOLLOW_84_in_parse_org_emftext_language_sql_schema_TableDefinition242 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_parse_org_emftext_language_sql_schema_TableDefinition261 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_TEMPORARY_in_parse_org_emftext_language_sql_schema_TableDefinition292 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_TABLE_in_parse_org_emftext_language_sql_schema_TableDefinition325 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_TableDefinition348 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_TableDefinition386 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableContentsSource_in_parse_org_emftext_language_sql_schema_TableDefinition424 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_KEYWORD_ON_in_parse_org_emftext_language_sql_schema_TableDefinition451 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_COMMIT_in_parse_org_emftext_language_sql_schema_TableDefinition471 = new BitSet(new long[]{0x0000000000000000L,0x0000001000008000L});
    public static final BitSet FOLLOW_100_in_parse_org_emftext_language_sql_schema_TableDefinition504 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_79_in_parse_org_emftext_language_sql_schema_TableDefinition523 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_ROWS_in_parse_org_emftext_language_sql_schema_TableDefinition554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_TableElementList602 = new BitSet(new long[]{0x0000000000004420L,0x0000082000000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableElement_in_parse_org_emftext_language_sql_schema_TableElementList620 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_61_in_parse_org_emftext_language_sql_schema_TableElementList647 = new BitSet(new long[]{0x0000000000004420L,0x0000082000000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableElement_in_parse_org_emftext_language_sql_schema_TableElementList673 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_TableElementList714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_Column747 = new BitSet(new long[]{0x0000000000000040L,0x000013C7F065707FL});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_DataType_in_parse_org_emftext_language_sql_schema_Column772 = new BitSet(new long[]{0x0000000000122502L,0x0000082000000000L});
    public static final BitSet FOLLOW_KEYWORD_DEFAULT_in_parse_org_emftext_language_sql_schema_Column799 = new BitSet(new long[]{0x0000000006049000L,0x0000040006020E00L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_DefaultOption_in_parse_org_emftext_language_sql_schema_Column825 = new BitSet(new long[]{0x0000000000120502L,0x0000082000000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_ColumnConstraint_in_parse_org_emftext_language_sql_schema_Column875 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_schema_Column910 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_Column943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_Column999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_Literal_in_parse_org_emftext_language_sql_schema_LiteralDefaultOption1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_function_DatetimeValueFunction_in_parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification_in_parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1199 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1232 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1288 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_NOT_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1353 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_NULL_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1405 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1438 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L});
    public static final BitSet FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1494 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L});
    public static final BitSet FOLLOW_107_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1628 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1661 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1717 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_REFERENCES_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1782 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1805 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1843 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1912 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_61_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1958 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint1992 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2117 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2150 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L});
    public static final BitSet FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2206 = new BitSet(new long[]{0x0000000000000000L,0x0000082000000000L});
    public static final BitSet FOLLOW_107_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2280 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_101_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2295 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2334 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_61_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2390 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2474 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2507 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2563 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_KEYWORD_FOREIGN_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2628 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_KEY_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2642 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2674 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_61_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2704 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2730 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2776 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_REFERENCES_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2790 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2813 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SCHEMA_QUALIFIED_NAME_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2851 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2920 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_61_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint2966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3000 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_DATE_in_parse_org_emftext_language_sql_literal_DateLiteral3116 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_sql_literal_DateLiteral3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_literal_TimeLiteral3170 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_sql_literal_TimeLiteral3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_TIMESTAMP_in_parse_org_emftext_language_sql_literal_TimestampLiteral3224 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_sql_literal_TimestampLiteral3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_INTERVAL_in_parse_org_emftext_language_sql_literal_IntervalLiteral3278 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_60_in_parse_org_emftext_language_sql_literal_IntervalLiteral3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_parse_org_emftext_language_sql_literal_IntervalLiteral3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_parse_org_emftext_language_sql_literal_BooleanLiteral3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_parse_org_emftext_language_sql_literal_BooleanLiteral3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_parse_org_emftext_language_sql_datatype_CharacterStringType3437 = new BitSet(new long[]{0x0400000000000182L});
    public static final BitSet FOLLOW_68_in_parse_org_emftext_language_sql_datatype_CharacterStringType3452 = new BitSet(new long[]{0x0400000000000182L});
    public static final BitSet FOLLOW_108_in_parse_org_emftext_language_sql_datatype_CharacterStringType3467 = new BitSet(new long[]{0x0400000000000182L});
    public static final BitSet FOLLOW_69_in_parse_org_emftext_language_sql_datatype_CharacterStringType3482 = new BitSet(new long[]{0x0400000000000182L});
    public static final BitSet FOLLOW_67_in_parse_org_emftext_language_sql_datatype_CharacterStringType3497 = new BitSet(new long[]{0x0400000000000182L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_CharacterStringType3527 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_CharacterStringType3553 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_datatype_CharacterStringType3586 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_KEYWORD_CHARACTER_in_parse_org_emftext_language_sql_datatype_CharacterStringType3628 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_SET_in_parse_org_emftext_language_sql_datatype_CharacterStringType3648 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_sql_datatype_CharacterStringType3674 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_datatype_CharacterStringType3729 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_sql_datatype_CharacterStringType3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3825 = new BitSet(new long[]{0x0400000000000102L});
    public static final BitSet FOLLOW_93_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3840 = new BitSet(new long[]{0x0400000000000102L});
    public static final BitSet FOLLOW_97_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3855 = new BitSet(new long[]{0x0400000000000102L});
    public static final BitSet FOLLOW_94_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3870 = new BitSet(new long[]{0x0400000000000102L});
    public static final BitSet FOLLOW_92_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3885 = new BitSet(new long[]{0x0400000000000102L});
    public static final BitSet FOLLOW_96_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3900 = new BitSet(new long[]{0x0400000000000102L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3930 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3956 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType3989 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4031 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4127 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_66_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4142 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4172 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_LargeObjectLength_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4198 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4278 = new BitSet(new long[]{0x0000000000000002L,0x0000000808880180L});
    public static final BitSet FOLLOW_87_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4314 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000180L});
    public static final BitSet FOLLOW_91_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4331 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000180L});
    public static final BitSet FOLLOW_83_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4348 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000180L});
    public static final BitSet FOLLOW_71_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_BOOLEAN_in_parse_org_emftext_language_sql_datatype_BooleanType4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_parse_org_emftext_language_sql_datatype_ExactNumericType4508 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_78_in_parse_org_emftext_language_sql_datatype_ExactNumericType4523 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_77_in_parse_org_emftext_language_sql_datatype_ExactNumericType4538 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_103_in_parse_org_emftext_language_sql_datatype_ExactNumericType4553 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_86_in_parse_org_emftext_language_sql_datatype_ExactNumericType4568 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_85_in_parse_org_emftext_language_sql_datatype_ExactNumericType4583 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_64_in_parse_org_emftext_language_sql_datatype_ExactNumericType4598 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_ExactNumericType4628 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ExactNumericType4654 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_61_in_parse_org_emftext_language_sql_datatype_ExactNumericType4700 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ExactNumericType4734 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_datatype_ExactNumericType4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4859 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_102_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4874 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_80_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4889 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4919 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4945 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_parse_org_emftext_language_sql_datatype_DatetimeType5035 = new BitSet(new long[]{0x0400000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_104_in_parse_org_emftext_language_sql_datatype_DatetimeType5050 = new BitSet(new long[]{0x0400000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_105_in_parse_org_emftext_language_sql_datatype_DatetimeType5065 = new BitSet(new long[]{0x0400000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_DatetimeType5095 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_DatetimeType5121 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_datatype_DatetimeType5154 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_109_in_parse_org_emftext_language_sql_datatype_DatetimeType5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_parse_org_emftext_language_sql_datatype_DatetimeType5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5272 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_74_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5287 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_89_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5302 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_75_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5317 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_90_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5332 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5362 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5388 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_NULL_in_parse_org_emftext_language_sql_expression_NullSpecification5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableDefinition_in_parse_org_emftext_language_sql_common_DirectSQLStatement5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableElementList_in_parse_org_emftext_language_sql_schema_TableContentsSource5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_Column_in_parse_org_emftext_language_sql_schema_TableElement5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_UniqueTableConstraint_in_parse_org_emftext_language_sql_schema_TableElement5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_ReferentialTableConstraint_in_parse_org_emftext_language_sql_schema_TableElement5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_CharacterStringType_in_parse_org_emftext_language_sql_datatype_DataType5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_NationalCharacterStringType_in_parse_org_emftext_language_sql_datatype_DataType5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_in_parse_org_emftext_language_sql_datatype_DataType5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_BooleanType_in_parse_org_emftext_language_sql_datatype_DataType5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_ExactNumericType_in_parse_org_emftext_language_sql_datatype_DataType5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_ApproximateNumericType_in_parse_org_emftext_language_sql_datatype_DataType5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_DatetimeType_in_parse_org_emftext_language_sql_datatype_DataType5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_LiteralDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_NotNullColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_UniqueColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_DateLiteral_in_parse_org_emftext_language_sql_literal_Literal5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_TimeLiteral_in_parse_org_emftext_language_sql_literal_Literal5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_TimestampLiteral_in_parse_org_emftext_language_sql_literal_Literal5760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_IntervalLiteral_in_parse_org_emftext_language_sql_literal_Literal5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_BooleanLiteral_in_parse_org_emftext_language_sql_literal_Literal5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_expression_NullSpecification_in_parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification5801 = new BitSet(new long[]{0x0000000000000002L});

}