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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "APPROXIMATE_NUMERIC_LITERAL", "BRACKETED_COMMENT", "EXACT_NUMERIC_LITERAL", "IDENTIFIER", "KEYWORD_BOOLEAN", "KEYWORD_CHARACTER", "KEYWORD_COLLATE", "KEYWORD_CONSTRAINT", "KEYWORD_CREATE", "KEYWORD_DATE", "KEYWORD_DEFAULT", "KEYWORD_FOREIGN", "KEYWORD_KEY", "KEYWORD_N", "KEYWORD_NOT", "KEYWORD_NULL", "KEYWORD_REFERENCES", "KEYWORD_SET", "KEYWORD_TABLE", "KEYWORD_TEMPORARY", "KEYWORD_TIME", "KEYWORD_TIMESTAMP", "KEYWORD_ZONE", "LETTER_A", "LETTER_B", "LETTER_C", "LETTER_D", "LETTER_E", "LETTER_F", "LETTER_G", "LETTER_H", "LETTER_I", "LETTER_J", "LETTER_K", "LETTER_L", "LETTER_M", "LETTER_N", "LETTER_O", "LETTER_P", "LETTER_Q", "LETTER_R", "LETTER_S", "LETTER_T", "LETTER_U", "LETTER_V", "LETTER_W", "LETTER_X", "LETTER_Y", "LETTER_Z", "QUOTED_STRING", "SIMPLE_COMMENT", "UNSIGNED_INTEGER", "WHITESPACE", "'('", "')'", "','", "'.'", "';'", "'BIGINT'", "'BINARY LARGE OBJECT'", "'BLOB'", "'CHAR VARYING'", "'CHAR'", "'CHARACTER VARYING'", "'CHARACTER'", "'CHARACTERS'", "'CODE_UNITS'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'DEC'", "'DECIMAL'", "'DOUBLE PRECISION'", "'FALSE'", "'FLOAT'", "'G'", "'GLOBAL'", "'INT'", "'INTEGER'", "'K'", "'LOCAL'", "'LOCALTIME'", "'LOCALTIMESTAMP'", "'M'", "'NATIONAL CHAR VARYING'", "'NATIONAL CHAR'", "'NATIONAL CHARACTER VARYING'", "'NATIONAL CHARACTER'", "'NCHAR VARYING'", "'NCHAR'", "'NUMERIC'", "'OCTETS'", "'PRIMARY KEY'", "'REAL'", "'SMALLINT'", "'TRUE'", "'UNIQUE'", "'VARCHAR'", "'WITH'", "'WITHOUT'", "'_'"
    };

    public static final int EOF=-1;
    public static final int T__57=57;
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
    public static final int APPROXIMATE_NUMERIC_LITERAL=4;
    public static final int BRACKETED_COMMENT=5;
    public static final int EXACT_NUMERIC_LITERAL=6;
    public static final int IDENTIFIER=7;
    public static final int KEYWORD_BOOLEAN=8;
    public static final int KEYWORD_CHARACTER=9;
    public static final int KEYWORD_COLLATE=10;
    public static final int KEYWORD_CONSTRAINT=11;
    public static final int KEYWORD_CREATE=12;
    public static final int KEYWORD_DATE=13;
    public static final int KEYWORD_DEFAULT=14;
    public static final int KEYWORD_FOREIGN=15;
    public static final int KEYWORD_KEY=16;
    public static final int KEYWORD_N=17;
    public static final int KEYWORD_NOT=18;
    public static final int KEYWORD_NULL=19;
    public static final int KEYWORD_REFERENCES=20;
    public static final int KEYWORD_SET=21;
    public static final int KEYWORD_TABLE=22;
    public static final int KEYWORD_TEMPORARY=23;
    public static final int KEYWORD_TIME=24;
    public static final int KEYWORD_TIMESTAMP=25;
    public static final int KEYWORD_ZONE=26;
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
    public static final int QUOTED_STRING=53;
    public static final int SIMPLE_COMMENT=54;
    public static final int UNSIGNED_INTEGER=55;
    public static final int WHITESPACE=56;

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
        this.state.initializeRuleMemo(146 + 1);
         

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
    			if (type.getInstanceClass() == org.emftext.language.sql.common.SimpleComment.class) {
    				return parse_org_emftext_language_sql_common_SimpleComment();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.common.BracketedComment.class) {
    				return parse_org_emftext_language_sql_common_BracketedComment();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.common.SchemaQualifiedName.class) {
    				return parse_org_emftext_language_sql_common_SchemaQualifiedName();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.ExactNumericLiteral.class) {
    				return parse_org_emftext_language_sql_literal_ExactNumericLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.ApproximateNumericLiteral.class) {
    				return parse_org_emftext_language_sql_literal_ApproximateNumericLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.CharacterStringLiteral.class) {
    				return parse_org_emftext_language_sql_literal_CharacterStringLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.NationalCharacterStringLiteral.class) {
    				return parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral();
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
    			if (type.getInstanceClass() == org.emftext.language.sql.literal.BooleanLiteral.class) {
    				return parse_org_emftext_language_sql_literal_BooleanLiteral();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.schema.TableReference.class) {
    				return parse_org_emftext_language_sql_schema_TableReference();
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
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.ExactNumericType.class) {
    				return parse_org_emftext_language_sql_datatype_ExactNumericType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.ApproximateNumericType.class) {
    				return parse_org_emftext_language_sql_datatype_ApproximateNumericType();
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
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.DateType.class) {
    				return parse_org_emftext_language_sql_datatype_DateType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.TimeType.class) {
    				return parse_org_emftext_language_sql_datatype_TimeType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.TimestampType.class) {
    				return parse_org_emftext_language_sql_datatype_TimestampType();
    			}
    			if (type.getInstanceClass() == org.emftext.language.sql.datatype.BooleanType.class) {
    				return parse_org_emftext_language_sql_datatype_BooleanType();
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
    		int followSetID = 186;
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
    // Sql.g:587:1: start returns [ EObject element = null] : (c0= parse_org_emftext_language_sql_common_SQLScript ) EOF ;
    public final EObject start() throws RecognitionException {
        EObject element =  null;

        int start_StartIndex = input.index();

        org.emftext.language.sql.common.SQLScript c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Sql.g:588:2: ( (c0= parse_org_emftext_language_sql_common_SQLScript ) EOF )
            // Sql.g:589:2: (c0= parse_org_emftext_language_sql_common_SQLScript ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 0, 2);
            		expectedElementsIndexOfLastCompleteElement = 2;
            	}

            // Sql.g:594:2: (c0= parse_org_emftext_language_sql_common_SQLScript )
            // Sql.g:595:3: c0= parse_org_emftext_language_sql_common_SQLScript
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
    // Sql.g:603:1: parse_org_emftext_language_sql_common_SQLScript returns [org.emftext.language.sql.common.SQLScript element = null] : ( ( (a0_0= parse_org_emftext_language_sql_common_Statement ) ) )* ;
    public final org.emftext.language.sql.common.SQLScript parse_org_emftext_language_sql_common_SQLScript() throws RecognitionException {
        org.emftext.language.sql.common.SQLScript element =  null;

        int parse_org_emftext_language_sql_common_SQLScript_StartIndex = input.index();

        org.emftext.language.sql.common.Statement a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Sql.g:606:2: ( ( ( (a0_0= parse_org_emftext_language_sql_common_Statement ) ) )* )
            // Sql.g:607:2: ( ( (a0_0= parse_org_emftext_language_sql_common_Statement ) ) )*
            {
            // Sql.g:607:2: ( ( (a0_0= parse_org_emftext_language_sql_common_Statement ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BRACKETED_COMMENT||LA1_0==KEYWORD_CREATE||LA1_0==SIMPLE_COMMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Sql.g:608:3: ( (a0_0= parse_org_emftext_language_sql_common_Statement ) )
            	    {
            	    // Sql.g:608:3: ( (a0_0= parse_org_emftext_language_sql_common_Statement ) )
            	    // Sql.g:609:4: (a0_0= parse_org_emftext_language_sql_common_Statement )
            	    {
            	    // Sql.g:609:4: (a0_0= parse_org_emftext_language_sql_common_Statement )
            	    // Sql.g:610:5: a0_0= parse_org_emftext_language_sql_common_Statement
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_Statement_in_parse_org_emftext_language_sql_common_SQLScript130);
            	    a0_0=parse_org_emftext_language_sql_common_Statement();

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
            	    				// We've found the last token for this rule. The constructed EObject is now
            	    				// complete.
            	    				completedElement(element, true);
            	    				addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 3, 5);
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
            		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 6, 8);
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



    // $ANTLR start "parse_org_emftext_language_sql_common_SimpleComment"
    // Sql.g:650:1: parse_org_emftext_language_sql_common_SimpleComment returns [org.emftext.language.sql.common.SimpleComment element = null] : (a0= SIMPLE_COMMENT ) ;
    public final org.emftext.language.sql.common.SimpleComment parse_org_emftext_language_sql_common_SimpleComment() throws RecognitionException {
        org.emftext.language.sql.common.SimpleComment element =  null;

        int parse_org_emftext_language_sql_common_SimpleComment_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Sql.g:653:2: ( (a0= SIMPLE_COMMENT ) )
            // Sql.g:654:2: (a0= SIMPLE_COMMENT )
            {
            // Sql.g:654:2: (a0= SIMPLE_COMMENT )
            // Sql.g:655:3: a0= SIMPLE_COMMENT
            {
            a0=(Token)match(input,SIMPLE_COMMENT,FOLLOW_SIMPLE_COMMENT_in_parse_org_emftext_language_sql_common_SimpleComment190); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSimpleComment();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("SIMPLE_COMMENT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SIMPLE_COMMENT__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SIMPLE_COMMENT__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_0, resolved, true);
            				copyLocalizationInfos((CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 9, 11);
            		addExpectedElement(null, 12, 13);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_emftext_language_sql_common_SimpleComment_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_common_SimpleComment"



    // $ANTLR start "parse_org_emftext_language_sql_common_BracketedComment"
    // Sql.g:696:1: parse_org_emftext_language_sql_common_BracketedComment returns [org.emftext.language.sql.common.BracketedComment element = null] : (a0= BRACKETED_COMMENT ) ;
    public final org.emftext.language.sql.common.BracketedComment parse_org_emftext_language_sql_common_BracketedComment() throws RecognitionException {
        org.emftext.language.sql.common.BracketedComment element =  null;

        int parse_org_emftext_language_sql_common_BracketedComment_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Sql.g:699:2: ( (a0= BRACKETED_COMMENT ) )
            // Sql.g:700:2: (a0= BRACKETED_COMMENT )
            {
            // Sql.g:700:2: (a0= BRACKETED_COMMENT )
            // Sql.g:701:3: a0= BRACKETED_COMMENT
            {
            a0=(Token)match(input,BRACKETED_COMMENT,FOLLOW_BRACKETED_COMMENT_in_parse_org_emftext_language_sql_common_BracketedComment230); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createBracketedComment();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BRACKETED_COMMENT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.BRACKETED_COMMENT__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.BRACKETED_COMMENT__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_0, resolved, true);
            				copyLocalizationInfos((CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 14, 16);
            		addExpectedElement(null, 17, 18);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_emftext_language_sql_common_BracketedComment_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_common_BracketedComment"



    // $ANTLR start "parse_org_emftext_language_sql_common_SchemaQualifiedName"
    // Sql.g:742:1: parse_org_emftext_language_sql_common_SchemaQualifiedName returns [org.emftext.language.sql.common.SchemaQualifiedName element = null] : ( ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' ) )? (a4= IDENTIFIER ) ;
    public final org.emftext.language.sql.common.SchemaQualifiedName parse_org_emftext_language_sql_common_SchemaQualifiedName() throws RecognitionException {
        org.emftext.language.sql.common.SchemaQualifiedName element =  null;

        int parse_org_emftext_language_sql_common_SchemaQualifiedName_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Sql.g:745:2: ( ( ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' ) )? (a4= IDENTIFIER ) )
            // Sql.g:746:2: ( ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' ) )? (a4= IDENTIFIER )
            {
            // Sql.g:746:2: ( ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENTIFIER) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==60) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // Sql.g:747:3: ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' )
                    {
                    // Sql.g:747:3: ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' )
                    // Sql.g:748:4: ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.'
                    {
                    // Sql.g:748:4: ( ( (a0= IDENTIFIER ) a1= '.' ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==IDENTIFIER) ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1==60) ) {
                            int LA2_2 = input.LA(3);

                            if ( (LA2_2==IDENTIFIER) ) {
                                int LA2_3 = input.LA(4);

                                if ( (LA2_3==60) ) {
                                    alt2=1;
                                }
                            }
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // Sql.g:749:5: ( (a0= IDENTIFIER ) a1= '.' )
                            {
                            // Sql.g:749:5: ( (a0= IDENTIFIER ) a1= '.' )
                            // Sql.g:750:6: (a0= IDENTIFIER ) a1= '.'
                            {
                            // Sql.g:750:6: (a0= IDENTIFIER )
                            // Sql.g:751:7: a0= IDENTIFIER
                            {
                            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_common_SchemaQualifiedName296); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            							if (terminateParsing) {
                            								throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            							}
                            							if (element == null) {
                            								element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSchemaQualifiedName();
                            								startIncompleteElement(element);
                            							}
                            							if (a0 != null) {
                            								org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                            								tokenResolver.setOptions(getOptions());
                            								org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            								tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME), result);
                            								Object resolvedObject = result.getResolvedToken();
                            								if (resolvedObject == null) {
                            									addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
                            								}
                            								java.lang.String resolved = (java.lang.String) resolvedObject;
                            								if (resolved != null) {
                            									Object value = resolved;
                            									element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME), value);
                            									completedElement(value, false);
                            								}
                            								collectHiddenTokens(element);
                            								retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_0_0_0_0_0_0_0, resolved, true);
                            								copyLocalizationInfos((CommonToken) a0, element);
                            							}
                            						}

                            }


                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, 19);
                            					}

                            a1=(Token)match(input,60,FOLLOW_60_in_parse_org_emftext_language_sql_common_SchemaQualifiedName341); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSchemaQualifiedName();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_0_0_0_0_0_0_1, null, true);
                            						copyLocalizationInfos((CommonToken)a1, element);
                            					}

                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, 20);
                            					}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 21);
                    			}

                    // Sql.g:807:4: (a2= IDENTIFIER )
                    // Sql.g:808:5: a2= IDENTIFIER
                    {
                    a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_common_SchemaQualifiedName396); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSchemaQualifiedName();
                    						startIncompleteElement(element);
                    					}
                    					if (a2 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
                    						}
                    						java.lang.String resolved = (java.lang.String) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_0_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a2, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 22);
                    			}

                    a3=(Token)match(input,60,FOLLOW_60_in_parse_org_emftext_language_sql_common_SchemaQualifiedName429); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSchemaQualifiedName();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_0_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 23);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 24);
            	}

            // Sql.g:864:2: (a4= IDENTIFIER )
            // Sql.g:865:3: a4= IDENTIFIER
            {
            a4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_common_SchemaQualifiedName466); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSchemaQualifiedName();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_1, resolved, true);
            				copyLocalizationInfos((CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 25);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 26);
            		addExpectedElement(null, 27, 34);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_emftext_language_sql_common_SchemaQualifiedName_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_common_SchemaQualifiedName"



    // $ANTLR start "parse_org_emftext_language_sql_literal_ExactNumericLiteral"
    // Sql.g:907:1: parse_org_emftext_language_sql_literal_ExactNumericLiteral returns [org.emftext.language.sql.literal.ExactNumericLiteral element = null] : ( (a0= EXACT_NUMERIC_LITERAL ) | (a1= UNSIGNED_INTEGER ) );
    public final org.emftext.language.sql.literal.ExactNumericLiteral parse_org_emftext_language_sql_literal_ExactNumericLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.ExactNumericLiteral element =  null;

        int parse_org_emftext_language_sql_literal_ExactNumericLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Sql.g:910:2: ( (a0= EXACT_NUMERIC_LITERAL ) | (a1= UNSIGNED_INTEGER ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXACT_NUMERIC_LITERAL) ) {
                alt4=1;
            }
            else if ( (LA4_0==UNSIGNED_INTEGER) ) {
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
                    // Sql.g:911:2: (a0= EXACT_NUMERIC_LITERAL )
                    {
                    // Sql.g:911:2: (a0= EXACT_NUMERIC_LITERAL )
                    // Sql.g:912:3: a0= EXACT_NUMERIC_LITERAL
                    {
                    a0=(Token)match(input,EXACT_NUMERIC_LITERAL,FOLLOW_EXACT_NUMERIC_LITERAL_in_parse_org_emftext_language_sql_literal_ExactNumericLiteral506); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (terminateParsing) {
                    				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    			}
                    			if (element == null) {
                    				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createExactNumericLiteral();
                    				startIncompleteElement(element);
                    			}
                    			if (a0 != null) {
                    				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("EXACT_NUMERIC_LITERAL");
                    				tokenResolver.setOptions(getOptions());
                    				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE), result);
                    				Object resolvedObject = result.getResolvedToken();
                    				if (resolvedObject == null) {
                    					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
                    				}
                    				java.math.BigDecimal resolved = (java.math.BigDecimal) resolvedObject;
                    				if (resolved != null) {
                    					Object value = resolved;
                    					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE), value);
                    					completedElement(value, false);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_4_0_0_0, resolved, true);
                    				copyLocalizationInfos((CommonToken) a0, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 35, 40);
                    		addExpectedElement(null, 41, 43);
                    	}

                    }
                    break;
                case 2 :
                    // Sql.g:949:4: (a1= UNSIGNED_INTEGER )
                    {
                    // Sql.g:949:4: (a1= UNSIGNED_INTEGER )
                    // Sql.g:950:3: a1= UNSIGNED_INTEGER
                    {
                    a1=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_literal_ExactNumericLiteral535); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (terminateParsing) {
                    				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    			}
                    			if (element == null) {
                    				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createExactNumericLiteral();
                    				startIncompleteElement(element);
                    			}
                    			if (a1 != null) {
                    				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
                    				tokenResolver.setOptions(getOptions());
                    				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE), result);
                    				Object resolvedObject = result.getResolvedToken();
                    				if (resolvedObject == null) {
                    					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
                    				}
                    				java.math.BigDecimal resolved = (java.math.BigDecimal) resolvedObject;
                    				if (resolved != null) {
                    					Object value = resolved;
                    					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE), value);
                    					completedElement(value, false);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_4_0_1_0, resolved, true);
                    				copyLocalizationInfos((CommonToken) a1, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		// We've found the last token for this rule. The constructed EObject is now
                    		// complete.
                    		completedElement(element, true);
                    		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 44, 49);
                    		addExpectedElement(null, 50, 52);
                    	}

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
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_emftext_language_sql_literal_ExactNumericLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_ExactNumericLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_ApproximateNumericLiteral"
    // Sql.g:991:1: parse_org_emftext_language_sql_literal_ApproximateNumericLiteral returns [org.emftext.language.sql.literal.ApproximateNumericLiteral element = null] : (a0= APPROXIMATE_NUMERIC_LITERAL ) ;
    public final org.emftext.language.sql.literal.ApproximateNumericLiteral parse_org_emftext_language_sql_literal_ApproximateNumericLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.ApproximateNumericLiteral element =  null;

        int parse_org_emftext_language_sql_literal_ApproximateNumericLiteral_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Sql.g:994:2: ( (a0= APPROXIMATE_NUMERIC_LITERAL ) )
            // Sql.g:995:2: (a0= APPROXIMATE_NUMERIC_LITERAL )
            {
            // Sql.g:995:2: (a0= APPROXIMATE_NUMERIC_LITERAL )
            // Sql.g:996:3: a0= APPROXIMATE_NUMERIC_LITERAL
            {
            a0=(Token)match(input,APPROXIMATE_NUMERIC_LITERAL,FOLLOW_APPROXIMATE_NUMERIC_LITERAL_in_parse_org_emftext_language_sql_literal_ApproximateNumericLiteral575); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createApproximateNumericLiteral();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("APPROXIMATE_NUMERIC_LITERAL");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.APPROXIMATE_NUMERIC_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
            				}
            				java.lang.Double resolved = (java.lang.Double) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.APPROXIMATE_NUMERIC_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_5_0_0_0, resolved, true);
            				copyLocalizationInfos((CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 53, 58);
            		addExpectedElement(null, 59, 61);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_emftext_language_sql_literal_ApproximateNumericLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_ApproximateNumericLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_CharacterStringLiteral"
    // Sql.g:1037:1: parse_org_emftext_language_sql_literal_CharacterStringLiteral returns [org.emftext.language.sql.literal.CharacterStringLiteral element = null] : ( (a0= '_' (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? (a2= QUOTED_STRING ) ( ( (a3_0= parse_org_emftext_language_sql_common_Separator ) (a4= QUOTED_STRING ) ) )* ;
    public final org.emftext.language.sql.literal.CharacterStringLiteral parse_org_emftext_language_sql_literal_CharacterStringLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.CharacterStringLiteral element =  null;

        int parse_org_emftext_language_sql_literal_CharacterStringLiteral_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a4=null;
        org.emftext.language.sql.common.SchemaQualifiedName a1_0 =null;

        org.emftext.language.sql.common.Separator a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Sql.g:1040:2: ( ( (a0= '_' (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? (a2= QUOTED_STRING ) ( ( (a3_0= parse_org_emftext_language_sql_common_Separator ) (a4= QUOTED_STRING ) ) )* )
            // Sql.g:1041:2: ( (a0= '_' (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? (a2= QUOTED_STRING ) ( ( (a3_0= parse_org_emftext_language_sql_common_Separator ) (a4= QUOTED_STRING ) ) )*
            {
            // Sql.g:1041:2: ( (a0= '_' (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==104) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Sql.g:1042:3: (a0= '_' (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:1042:3: (a0= '_' (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:1043:4: a0= '_' (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a0=(Token)match(input,104,FOLLOW_104_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral620); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createCharacterStringLiteral();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_6_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(), 62, 64);
                    			}

                    // Sql.g:1057:4: (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:1058:5: a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral646);
                    a1_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createCharacterStringLiteral();
                    						startIncompleteElement(element);
                    					}
                    					if (a1_0 != null) {
                    						if (a1_0 != null) {
                    							Object value = a1_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_6_0_0_0_0_0_1, a1_0, true);
                    						copyLocalizationInfos(a1_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 65);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 66);
            	}

            // Sql.g:1090:2: (a2= QUOTED_STRING )
            // Sql.g:1091:3: a2= QUOTED_STRING
            {
            a2=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral691); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createCharacterStringLiteral();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					addObjectToList(element, org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_6_0_0_1, resolved, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(), 67, 68);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 69, 74);
            		addExpectedElement(null, 75, 77);
            	}

            // Sql.g:1128:2: ( ( (a3_0= parse_org_emftext_language_sql_common_Separator ) (a4= QUOTED_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BRACKETED_COMMENT||LA6_0==SIMPLE_COMMENT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Sql.g:1129:3: ( (a3_0= parse_org_emftext_language_sql_common_Separator ) (a4= QUOTED_STRING ) )
            	    {
            	    // Sql.g:1129:3: ( (a3_0= parse_org_emftext_language_sql_common_Separator ) (a4= QUOTED_STRING ) )
            	    // Sql.g:1130:4: (a3_0= parse_org_emftext_language_sql_common_Separator ) (a4= QUOTED_STRING )
            	    {
            	    // Sql.g:1130:4: (a3_0= parse_org_emftext_language_sql_common_Separator )
            	    // Sql.g:1131:5: a3_0= parse_org_emftext_language_sql_common_Separator
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_Separator_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral727);
            	    a3_0=parse_org_emftext_language_sql_common_Separator();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createCharacterStringLiteral();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a3_0 != null) {
            	    						if (a3_0 != null) {
            	    							Object value = a3_0;
            	    							addObjectToList(element, org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__SEPARATORS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_6_0_0_2_0_0_0, a3_0, true);
            	    						copyLocalizationInfos(a3_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 78);
            	    			}

            	    // Sql.g:1156:4: (a4= QUOTED_STRING )
            	    // Sql.g:1157:5: a4= QUOTED_STRING
            	    {
            	    a4=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral761); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createCharacterStringLiteral();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a4 != null) {
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
            	    						tokenResolver.setOptions(getOptions());
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
            	    						}
            	    						java.lang.String resolved = (java.lang.String) resolvedObject;
            	    						if (resolved != null) {
            	    							Object value = resolved;
            	    							addObjectToList(element, org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_6_0_0_2_0_0_1, resolved, true);
            	    						copyLocalizationInfos((CommonToken) a4, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				// We've found the last token for this rule. The constructed EObject is now
            	    				// complete.
            	    				completedElement(element, true);
            	    				addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(), 79, 80);
            	    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 81, 86);
            	    				addExpectedElement(null, 87, 89);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(), 90, 91);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 92, 97);
            		addExpectedElement(null, 98, 100);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_emftext_language_sql_literal_CharacterStringLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_CharacterStringLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral"
    // Sql.g:1211:1: parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral returns [org.emftext.language.sql.literal.NationalCharacterStringLiteral element = null] : (a0= KEYWORD_N (a1= QUOTED_STRING ) ( ( (a2_0= parse_org_emftext_language_sql_common_Separator ) (a3= QUOTED_STRING ) ) )* |c0= parse_org_emftext_language_sql_literal_CharacterStringLiteral );
    public final org.emftext.language.sql.literal.NationalCharacterStringLiteral parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.NationalCharacterStringLiteral element =  null;

        int parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.emftext.language.sql.common.Separator a2_0 =null;

        org.emftext.language.sql.literal.CharacterStringLiteral c0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Sql.g:1214:2: (a0= KEYWORD_N (a1= QUOTED_STRING ) ( ( (a2_0= parse_org_emftext_language_sql_common_Separator ) (a3= QUOTED_STRING ) ) )* |c0= parse_org_emftext_language_sql_literal_CharacterStringLiteral )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_N) ) {
                alt8=1;
            }
            else if ( (LA8_0==QUOTED_STRING||LA8_0==104) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Sql.g:1215:2: a0= KEYWORD_N (a1= QUOTED_STRING ) ( ( (a2_0= parse_org_emftext_language_sql_common_Separator ) (a3= QUOTED_STRING ) ) )*
                    {
                    a0=(Token)match(input,KEYWORD_N,FOLLOW_KEYWORD_N_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral822); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createNationalCharacterStringLiteral();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_0, null, true);
                    		copyLocalizationInfos((CommonToken)a0, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, 101);
                    	}

                    // Sql.g:1229:2: (a1= QUOTED_STRING )
                    // Sql.g:1230:3: a1= QUOTED_STRING
                    {
                    a1=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral840); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (terminateParsing) {
                    				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    			}
                    			if (element == null) {
                    				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createNationalCharacterStringLiteral();
                    				startIncompleteElement(element);
                    			}
                    			if (a1 != null) {
                    				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
                    				tokenResolver.setOptions(getOptions());
                    				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES), result);
                    				Object resolvedObject = result.getResolvedToken();
                    				if (resolvedObject == null) {
                    					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
                    				}
                    				java.lang.String resolved = (java.lang.String) resolvedObject;
                    				if (resolved != null) {
                    					Object value = resolved;
                    					addObjectToList(element, org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES, value);
                    					completedElement(value, false);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_1, resolved, true);
                    				copyLocalizationInfos((CommonToken) a1, element);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral(), 102, 103);
                    		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 104, 109);
                    		addExpectedElement(null, 110, 112);
                    	}

                    // Sql.g:1267:2: ( ( (a2_0= parse_org_emftext_language_sql_common_Separator ) (a3= QUOTED_STRING ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==BRACKETED_COMMENT||LA7_0==SIMPLE_COMMENT) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Sql.g:1268:3: ( (a2_0= parse_org_emftext_language_sql_common_Separator ) (a3= QUOTED_STRING ) )
                    	    {
                    	    // Sql.g:1268:3: ( (a2_0= parse_org_emftext_language_sql_common_Separator ) (a3= QUOTED_STRING ) )
                    	    // Sql.g:1269:4: (a2_0= parse_org_emftext_language_sql_common_Separator ) (a3= QUOTED_STRING )
                    	    {
                    	    // Sql.g:1269:4: (a2_0= parse_org_emftext_language_sql_common_Separator )
                    	    // Sql.g:1270:5: a2_0= parse_org_emftext_language_sql_common_Separator
                    	    {
                    	    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_Separator_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral876);
                    	    a2_0=parse_org_emftext_language_sql_common_Separator();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (terminateParsing) {
                    	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    	    					}
                    	    					if (element == null) {
                    	    						element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createNationalCharacterStringLiteral();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					if (a2_0 != null) {
                    	    						if (a2_0 != null) {
                    	    							Object value = a2_0;
                    	    							addObjectToList(element, org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS, value);
                    	    							completedElement(value, true);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_2_0_0_0, a2_0, true);
                    	    						copyLocalizationInfos(a2_0, element);
                    	    					}
                    	    				}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				addExpectedElement(null, 113);
                    	    			}

                    	    // Sql.g:1295:4: (a3= QUOTED_STRING )
                    	    // Sql.g:1296:5: a3= QUOTED_STRING
                    	    {
                    	    a3=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral910); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (terminateParsing) {
                    	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    	    					}
                    	    					if (element == null) {
                    	    						element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createNationalCharacterStringLiteral();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					if (a3 != null) {
                    	    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
                    	    						tokenResolver.setOptions(getOptions());
                    	    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    	    						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES), result);
                    	    						Object resolvedObject = result.getResolvedToken();
                    	    						if (resolvedObject == null) {
                    	    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
                    	    						}
                    	    						java.lang.String resolved = (java.lang.String) resolvedObject;
                    	    						if (resolved != null) {
                    	    							Object value = resolved;
                    	    							addObjectToList(element, org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES, value);
                    	    							completedElement(value, false);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_2_0_0_1, resolved, true);
                    	    						copyLocalizationInfos((CommonToken) a3, element);
                    	    					}
                    	    				}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    				// expected elements (follow set)
                    	    				// We've found the last token for this rule. The constructed EObject is now
                    	    				// complete.
                    	    				completedElement(element, true);
                    	    				addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral(), 114, 115);
                    	    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 116, 121);
                    	    				addExpectedElement(null, 122, 124);
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
                    		// We've found the last token for this rule. The constructed EObject is now
                    		// complete.
                    		completedElement(element, true);
                    		addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral(), 125, 126);
                    		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 127, 132);
                    		addExpectedElement(null, 133, 135);
                    	}

                    }
                    break;
                case 2 :
                    // Sql.g:1350:2: c0= parse_org_emftext_language_sql_literal_CharacterStringLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_CharacterStringLiteral_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral961);
                    c0=parse_org_emftext_language_sql_literal_CharacterStringLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_DateLiteral"
    // Sql.g:1354:1: parse_org_emftext_language_sql_literal_DateLiteral returns [org.emftext.language.sql.literal.DateLiteral element = null] : a0= KEYWORD_DATE (a1= QUOTED_STRING ) ;
    public final org.emftext.language.sql.literal.DateLiteral parse_org_emftext_language_sql_literal_DateLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.DateLiteral element =  null;

        int parse_org_emftext_language_sql_literal_DateLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Sql.g:1357:2: (a0= KEYWORD_DATE (a1= QUOTED_STRING ) )
            // Sql.g:1358:2: a0= KEYWORD_DATE (a1= QUOTED_STRING )
            {
            a0=(Token)match(input,KEYWORD_DATE,FOLLOW_KEYWORD_DATE_in_parse_org_emftext_language_sql_literal_DateLiteral986); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createDateLiteral();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_8_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 136);
            	}

            // Sql.g:1372:2: (a1= QUOTED_STRING )
            // Sql.g:1373:3: a1= QUOTED_STRING
            {
            a1=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_DateLiteral1004); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createDateLiteral();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.DATE_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
            				}
            				java.time.LocalDate resolved = (java.time.LocalDate) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.DATE_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_8_0_0_1, resolved, true);
            				copyLocalizationInfos((CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 137, 142);
            		addExpectedElement(null, 143, 145);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_emftext_language_sql_literal_DateLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_DateLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_TimeLiteral"
    // Sql.g:1414:1: parse_org_emftext_language_sql_literal_TimeLiteral returns [org.emftext.language.sql.literal.TimeLiteral element = null] : a0= KEYWORD_TIME (a1= QUOTED_STRING ) ;
    public final org.emftext.language.sql.literal.TimeLiteral parse_org_emftext_language_sql_literal_TimeLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.TimeLiteral element =  null;

        int parse_org_emftext_language_sql_literal_TimeLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Sql.g:1417:2: (a0= KEYWORD_TIME (a1= QUOTED_STRING ) )
            // Sql.g:1418:2: a0= KEYWORD_TIME (a1= QUOTED_STRING )
            {
            a0=(Token)match(input,KEYWORD_TIME,FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_literal_TimeLiteral1040); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimeLiteral();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 146);
            	}

            // Sql.g:1432:2: (a1= QUOTED_STRING )
            // Sql.g:1433:3: a1= QUOTED_STRING
            {
            a1=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_TimeLiteral1058); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimeLiteral();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIME_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
            				}
            				java.time.LocalTime resolved = (java.time.LocalTime) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIME_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_1, resolved, true);
            				copyLocalizationInfos((CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 147, 152);
            		addExpectedElement(null, 153, 155);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_emftext_language_sql_literal_TimeLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_TimeLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_TimestampLiteral"
    // Sql.g:1474:1: parse_org_emftext_language_sql_literal_TimestampLiteral returns [org.emftext.language.sql.literal.TimestampLiteral element = null] : a0= KEYWORD_TIMESTAMP (a1= QUOTED_STRING ) ;
    public final org.emftext.language.sql.literal.TimestampLiteral parse_org_emftext_language_sql_literal_TimestampLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.TimestampLiteral element =  null;

        int parse_org_emftext_language_sql_literal_TimestampLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Sql.g:1477:2: (a0= KEYWORD_TIMESTAMP (a1= QUOTED_STRING ) )
            // Sql.g:1478:2: a0= KEYWORD_TIMESTAMP (a1= QUOTED_STRING )
            {
            a0=(Token)match(input,KEYWORD_TIMESTAMP,FOLLOW_KEYWORD_TIMESTAMP_in_parse_org_emftext_language_sql_literal_TimestampLiteral1094); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimestampLiteral();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 156);
            	}

            // Sql.g:1492:2: (a1= QUOTED_STRING )
            // Sql.g:1493:3: a1= QUOTED_STRING
            {
            a1=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_TimestampLiteral1112); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimestampLiteral();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIMESTAMP_LITERAL__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
            				}
            				java.time.ZonedDateTime resolved = (java.time.ZonedDateTime) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIMESTAMP_LITERAL__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_1, resolved, true);
            				copyLocalizationInfos((CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 157, 162);
            		addExpectedElement(null, 163, 165);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_emftext_language_sql_literal_TimestampLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_TimestampLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_literal_BooleanLiteral"
    // Sql.g:1534:1: parse_org_emftext_language_sql_literal_BooleanLiteral returns [org.emftext.language.sql.literal.BooleanLiteral element = null] : ( ( (a0= 'TRUE' |a1= 'FALSE' ) ) )? ;
    public final org.emftext.language.sql.literal.BooleanLiteral parse_org_emftext_language_sql_literal_BooleanLiteral() throws RecognitionException {
        org.emftext.language.sql.literal.BooleanLiteral element =  null;

        int parse_org_emftext_language_sql_literal_BooleanLiteral_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Sql.g:1537:2: ( ( ( (a0= 'TRUE' |a1= 'FALSE' ) ) )? )
            // Sql.g:1538:2: ( ( (a0= 'TRUE' |a1= 'FALSE' ) ) )?
            {
            // Sql.g:1538:2: ( ( (a0= 'TRUE' |a1= 'FALSE' ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==77||LA10_0==99) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Sql.g:1539:3: ( (a0= 'TRUE' |a1= 'FALSE' ) )
                    {
                    // Sql.g:1539:3: ( (a0= 'TRUE' |a1= 'FALSE' ) )
                    // Sql.g:1540:4: (a0= 'TRUE' |a1= 'FALSE' )
                    {
                    // Sql.g:1540:4: (a0= 'TRUE' |a1= 'FALSE' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==99) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==77) ) {
                        alt9=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;

                    }
                    switch (alt9) {
                        case 1 :
                            // Sql.g:1541:5: a0= 'TRUE'
                            {
                            a0=(Token)match(input,99,FOLLOW_99_in_parse_org_emftext_language_sql_literal_BooleanLiteral1163); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createBooleanLiteral();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_0, true, true);
                            					copyLocalizationInfos((CommonToken)a0, element);
                            					// set value of boolean attribute
                            					Object value = true;
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.BOOLEAN_LITERAL__VALUE), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:1554:10: a1= 'FALSE'
                            {
                            a1=(Token)match(input,77,FOLLOW_77_in_parse_org_emftext_language_sql_literal_BooleanLiteral1180); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createBooleanLiteral();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_0, false, true);
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
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 166, 171);
            		addExpectedElement(null, 172, 174);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_emftext_language_sql_literal_BooleanLiteral_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_BooleanLiteral"



    // $ANTLR start "parse_org_emftext_language_sql_schema_TableReference"
    // Sql.g:1581:1: parse_org_emftext_language_sql_schema_TableReference returns [org.emftext.language.sql.schema.TableReference element = null] : ( ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' ) )? (a4= IDENTIFIER ) ;
    public final org.emftext.language.sql.schema.TableReference parse_org_emftext_language_sql_schema_TableReference() throws RecognitionException {
        org.emftext.language.sql.schema.TableReference element =  null;

        int parse_org_emftext_language_sql_schema_TableReference_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Sql.g:1584:2: ( ( ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' ) )? (a4= IDENTIFIER ) )
            // Sql.g:1585:2: ( ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' ) )? (a4= IDENTIFIER )
            {
            // Sql.g:1585:2: ( ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENTIFIER) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==60) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // Sql.g:1586:3: ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' )
                    {
                    // Sql.g:1586:3: ( ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.' )
                    // Sql.g:1587:4: ( ( (a0= IDENTIFIER ) a1= '.' ) )? (a2= IDENTIFIER ) a3= '.'
                    {
                    // Sql.g:1587:4: ( ( (a0= IDENTIFIER ) a1= '.' ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==IDENTIFIER) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==60) ) {
                            int LA11_2 = input.LA(3);

                            if ( (LA11_2==IDENTIFIER) ) {
                                int LA11_3 = input.LA(4);

                                if ( (LA11_3==60) ) {
                                    alt11=1;
                                }
                            }
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // Sql.g:1588:5: ( (a0= IDENTIFIER ) a1= '.' )
                            {
                            // Sql.g:1588:5: ( (a0= IDENTIFIER ) a1= '.' )
                            // Sql.g:1589:6: (a0= IDENTIFIER ) a1= '.'
                            {
                            // Sql.g:1589:6: (a0= IDENTIFIER )
                            // Sql.g:1590:7: a0= IDENTIFIER
                            {
                            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_TableReference1254); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            							if (terminateParsing) {
                            								throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                            							}
                            							if (element == null) {
                            								element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableReference();
                            								startIncompleteElement(element);
                            							}
                            							if (a0 != null) {
                            								org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                            								tokenResolver.setOptions(getOptions());
                            								org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                            								tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__CATALOG_NAME), result);
                            								Object resolvedObject = result.getResolvedToken();
                            								if (resolvedObject == null) {
                            									addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
                            								}
                            								java.lang.String resolved = (java.lang.String) resolvedObject;
                            								if (resolved != null) {
                            									Object value = resolved;
                            									element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__CATALOG_NAME), value);
                            									completedElement(value, false);
                            								}
                            								collectHiddenTokens(element);
                            								retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_0_0_0_0_0_0_0, resolved, true);
                            								copyLocalizationInfos((CommonToken) a0, element);
                            							}
                            						}

                            }


                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, 175);
                            					}

                            a1=(Token)match(input,60,FOLLOW_60_in_parse_org_emftext_language_sql_schema_TableReference1299); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableReference();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_0_0_0_0_0_0_1, null, true);
                            						copyLocalizationInfos((CommonToken)a1, element);
                            					}

                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, 176);
                            					}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 177);
                    			}

                    // Sql.g:1646:4: (a2= IDENTIFIER )
                    // Sql.g:1647:5: a2= IDENTIFIER
                    {
                    a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_TableReference1354); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableReference();
                    						startIncompleteElement(element);
                    					}
                    					if (a2 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
                    						}
                    						java.lang.String resolved = (java.lang.String) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_0_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a2, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 178);
                    			}

                    a3=(Token)match(input,60,FOLLOW_60_in_parse_org_emftext_language_sql_schema_TableReference1387); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableReference();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_0_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 179);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 180);
            	}

            // Sql.g:1703:2: (a4= IDENTIFIER )
            // Sql.g:1704:3: a4= IDENTIFIER
            {
            a4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_TableReference1424); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableReference();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__TARGET), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.sql.schema.TableDefinition proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.TableReference, org.emftext.language.sql.schema.TableDefinition>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__TARGET), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__TARGET), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_1, proxy, true);
            				copyLocalizationInfos((CommonToken) a4, element);
            				copyLocalizationInfos((CommonToken) a4, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 181, 185);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_org_emftext_language_sql_schema_TableReference_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_TableReference"



    // $ANTLR start "parse_org_emftext_language_sql_schema_TableDefinition"
    // Sql.g:1748:1: parse_org_emftext_language_sql_schema_TableDefinition returns [org.emftext.language.sql.schema.TableDefinition element = null] : a0= KEYWORD_CREATE ( ( ()? ) | ( (a3= 'GLOBAL' |a4= 'LOCAL' ) ) a7= KEYWORD_TEMPORARY ) a8= KEYWORD_TABLE (a9_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) (a10_0= parse_org_emftext_language_sql_schema_TableContentsSource ) a11= ';' ;
    public final org.emftext.language.sql.schema.TableDefinition parse_org_emftext_language_sql_schema_TableDefinition() throws RecognitionException {
        org.emftext.language.sql.schema.TableDefinition element =  null;

        int parse_org_emftext_language_sql_schema_TableDefinition_StartIndex = input.index();

        Token a0=null;
        Token a3=null;
        Token a4=null;
        Token a7=null;
        Token a8=null;
        Token a11=null;
        org.emftext.language.sql.common.SchemaQualifiedName a9_0 =null;

        org.emftext.language.sql.schema.TableContentsSource a10_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Sql.g:1751:2: (a0= KEYWORD_CREATE ( ( ()? ) | ( (a3= 'GLOBAL' |a4= 'LOCAL' ) ) a7= KEYWORD_TEMPORARY ) a8= KEYWORD_TABLE (a9_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) (a10_0= parse_org_emftext_language_sql_schema_TableContentsSource ) a11= ';' )
            // Sql.g:1752:2: a0= KEYWORD_CREATE ( ( ()? ) | ( (a3= 'GLOBAL' |a4= 'LOCAL' ) ) a7= KEYWORD_TEMPORARY ) a8= KEYWORD_TABLE (a9_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) (a10_0= parse_org_emftext_language_sql_schema_TableContentsSource ) a11= ';'
            {
            a0=(Token)match(input,KEYWORD_CREATE,FOLLOW_KEYWORD_CREATE_in_parse_org_emftext_language_sql_schema_TableDefinition1460); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
            			startIncompleteElement(element);
            			// initialize enumeration attribute
            			Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.PERSISTENT_VALUE).getInstance();
            			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 186, 188);
            	}

            // Sql.g:1769:2: ( ( ()? ) | ( (a3= 'GLOBAL' |a4= 'LOCAL' ) ) a7= KEYWORD_TEMPORARY )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_TABLE) ) {
                alt15=1;
            }
            else if ( (LA15_0==80||LA15_0==84) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Sql.g:1770:3: ( ()? )
                    {
                    // Sql.g:1770:3: ( ()? )
                    // Sql.g:1771:4: ()?
                    {
                    // Sql.g:1771:4: ()?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==KEYWORD_TABLE) ) {
                        int LA13_1 = input.LA(2);

                        if ( (synpred13_Sql()) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // Sql.g:1772:4: 
                            {
                            }
                            break;

                    }


                    }


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, 189);
                    		}

                    }
                    break;
                case 2 :
                    // Sql.g:1779:6: ( (a3= 'GLOBAL' |a4= 'LOCAL' ) ) a7= KEYWORD_TEMPORARY
                    {
                    // Sql.g:1779:6: ( (a3= 'GLOBAL' |a4= 'LOCAL' ) )
                    // Sql.g:1780:4: (a3= 'GLOBAL' |a4= 'LOCAL' )
                    {
                    // Sql.g:1780:4: (a3= 'GLOBAL' |a4= 'LOCAL' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==80) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==84) ) {
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
                            // Sql.g:1781:5: a3= 'GLOBAL'
                            {
                            a3=(Token)match(input,80,FOLLOW_80_in_parse_org_emftext_language_sql_schema_TableDefinition1520); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                            						startIncompleteElement(element);
                            						// initialize enumeration attribute
                            						Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.PERSISTENT_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_1_0_1_0, null, true);
                            					copyLocalizationInfos((CommonToken)a3, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.GLOBAL_TEMPORARY_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:1797:10: a4= 'LOCAL'
                            {
                            a4=(Token)match(input,84,FOLLOW_84_in_parse_org_emftext_language_sql_schema_TableDefinition1537); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                            						startIncompleteElement(element);
                            						// initialize enumeration attribute
                            						Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.PERSISTENT_VALUE).getInstance();
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_1_0_1_0, null, true);
                            					copyLocalizationInfos((CommonToken)a4, element);
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
                    			addExpectedElement(null, 190);
                    		}

                    a7=(Token)match(input,KEYWORD_TEMPORARY,FOLLOW_KEYWORD_TEMPORARY_in_parse_org_emftext_language_sql_schema_TableDefinition1563); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
                    				startIncompleteElement(element);
                    				// initialize enumeration attribute
                    				Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.PERSISTENT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_1_0_1_1, null, true);
                    			copyLocalizationInfos((CommonToken)a7, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(null, 191);
                    		}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 192);
            	}

            a8=(Token)match(input,KEYWORD_TABLE,FOLLOW_KEYWORD_TABLE_in_parse_org_emftext_language_sql_schema_TableDefinition1587); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
            			startIncompleteElement(element);
            			// initialize enumeration attribute
            			Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.PERSISTENT_VALUE).getInstance();
            			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 193, 195);
            	}

            // Sql.g:1860:2: (a9_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
            // Sql.g:1861:3: a9_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_TableDefinition1605);
            a9_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
            				startIncompleteElement(element);
            				// initialize enumeration attribute
            				Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.PERSISTENT_VALUE).getInstance();
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
            			}
            			if (a9_0 != null) {
            				if (a9_0 != null) {
            					Object value = a9_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_3, a9_0, true);
            				copyLocalizationInfos(a9_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 196);
            	}

            // Sql.g:1889:2: (a10_0= parse_org_emftext_language_sql_schema_TableContentsSource )
            // Sql.g:1890:3: a10_0= parse_org_emftext_language_sql_schema_TableContentsSource
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableContentsSource_in_parse_org_emftext_language_sql_schema_TableDefinition1627);
            a10_0=parse_org_emftext_language_sql_schema_TableContentsSource();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
            				startIncompleteElement(element);
            				// initialize enumeration attribute
            				Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.PERSISTENT_VALUE).getInstance();
            				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
            			}
            			if (a10_0 != null) {
            				if (a10_0 != null) {
            					Object value = a10_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_5, a10_0, true);
            				copyLocalizationInfos(a10_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 197);
            	}

            a11=(Token)match(input,61,FOLLOW_61_in_parse_org_emftext_language_sql_schema_TableDefinition1645); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
            			startIncompleteElement(element);
            			// initialize enumeration attribute
            			Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableScope().getEEnumLiteral(org.emftext.language.sql.schema.TableScope.PERSISTENT_VALUE).getInstance();
            			element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), value);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 198, 200);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_emftext_language_sql_schema_TableDefinition_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_TableDefinition"



    // $ANTLR start "parse_org_emftext_language_sql_schema_TableElementList"
    // Sql.g:1940:1: parse_org_emftext_language_sql_schema_TableElementList returns [org.emftext.language.sql.schema.TableElementList element = null] : a0= '(' (a1_0= parse_org_emftext_language_sql_schema_TableElement ) ( (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) ) )* a4= ')' ;
    public final org.emftext.language.sql.schema.TableElementList parse_org_emftext_language_sql_schema_TableElementList() throws RecognitionException {
        org.emftext.language.sql.schema.TableElementList element =  null;

        int parse_org_emftext_language_sql_schema_TableElementList_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a4=null;
        org.emftext.language.sql.schema.TableElement a1_0 =null;

        org.emftext.language.sql.schema.TableElement a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Sql.g:1943:2: (a0= '(' (a1_0= parse_org_emftext_language_sql_schema_TableElement ) ( (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) ) )* a4= ')' )
            // Sql.g:1944:2: a0= '(' (a1_0= parse_org_emftext_language_sql_schema_TableElement ) ( (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) ) )* a4= ')'
            {
            a0=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_schema_TableElementList1674); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(), 201, 205);
            	}

            // Sql.g:1958:2: (a1_0= parse_org_emftext_language_sql_schema_TableElement )
            // Sql.g:1959:3: a1_0= parse_org_emftext_language_sql_schema_TableElement
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableElement_in_parse_org_emftext_language_sql_schema_TableElementList1692);
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
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_2, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 206, 207);
            	}

            // Sql.g:1984:2: ( (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==59) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Sql.g:1985:3: (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) )
            	    {
            	    // Sql.g:1985:3: (a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement ) )
            	    // Sql.g:1986:4: a2= ',' (a3_0= parse_org_emftext_language_sql_schema_TableElement )
            	    {
            	    a2=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_TableElementList1719); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_3_0_0_0, null, true);
            	    				copyLocalizationInfos((CommonToken)a2, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(), 208, 212);
            	    			}

            	    // Sql.g:2000:4: (a3_0= parse_org_emftext_language_sql_schema_TableElement )
            	    // Sql.g:2001:5: a3_0= parse_org_emftext_language_sql_schema_TableElement
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableElement_in_parse_org_emftext_language_sql_schema_TableElementList1745);
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
            	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_3_0_0_2, a3_0, true);
            	    						copyLocalizationInfos(a3_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 213, 214);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 215, 216);
            	}

            a4=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_TableElementList1786); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 217);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_org_emftext_language_sql_schema_TableElementList_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_TableElementList"



    // $ANTLR start "parse_org_emftext_language_sql_schema_Column"
    // Sql.g:2052:1: parse_org_emftext_language_sql_schema_Column returns [org.emftext.language.sql.schema.Column element = null] : (a0= IDENTIFIER ) (a1_0= parse_org_emftext_language_sql_datatype_DataType ) ( (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) ) )? ( (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint ) )? ( (a5= KEYWORD_COLLATE (a6_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ;
    public final org.emftext.language.sql.schema.Column parse_org_emftext_language_sql_schema_Column() throws RecognitionException {
        org.emftext.language.sql.schema.Column element =  null;

        int parse_org_emftext_language_sql_schema_Column_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a5=null;
        org.emftext.language.sql.datatype.DataType a1_0 =null;

        org.emftext.language.sql.schema.DefaultOption a3_0 =null;

        org.emftext.language.sql.schema.ColumnConstraint a4_0 =null;

        org.emftext.language.sql.common.SchemaQualifiedName a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Sql.g:2055:2: ( (a0= IDENTIFIER ) (a1_0= parse_org_emftext_language_sql_datatype_DataType ) ( (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) ) )? ( (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint ) )? ( (a5= KEYWORD_COLLATE (a6_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? )
            // Sql.g:2056:2: (a0= IDENTIFIER ) (a1_0= parse_org_emftext_language_sql_datatype_DataType ) ( (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) ) )? ( (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint ) )? ( (a5= KEYWORD_COLLATE (a6_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            {
            // Sql.g:2056:2: (a0= IDENTIFIER )
            // Sql.g:2057:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_Column1819); if (state.failed) return element;

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
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_0, resolved, true);
            				copyLocalizationInfos((CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 218, 226);
            	}

            // Sql.g:2092:2: (a1_0= parse_org_emftext_language_sql_datatype_DataType )
            // Sql.g:2093:3: a1_0= parse_org_emftext_language_sql_datatype_DataType
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_DataType_in_parse_org_emftext_language_sql_schema_Column1844);
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
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 227);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 228, 233);
            		addExpectedElement(null, 234, 236);
            	}

            // Sql.g:2120:2: ( (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_DEFAULT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Sql.g:2121:3: (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) )
                    {
                    // Sql.g:2121:3: (a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption ) )
                    // Sql.g:2122:4: a2= KEYWORD_DEFAULT (a3_0= parse_org_emftext_language_sql_schema_DefaultOption )
                    {
                    a2=(Token)match(input,KEYWORD_DEFAULT,FOLLOW_KEYWORD_DEFAULT_in_parse_org_emftext_language_sql_schema_Column1871); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 237, 254);
                    				addExpectedElement(null, 255, 257);
                    			}

                    // Sql.g:2137:4: (a3_0= parse_org_emftext_language_sql_schema_DefaultOption )
                    // Sql.g:2138:5: a3_0= parse_org_emftext_language_sql_schema_DefaultOption
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_DefaultOption_in_parse_org_emftext_language_sql_schema_Column1897);
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
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_2_0_0_1, a3_0, true);
                    						copyLocalizationInfos(a3_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 258, 263);
                    				addExpectedElement(null, 264, 266);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 267, 272);
            		addExpectedElement(null, 273, 275);
            	}

            // Sql.g:2172:2: ( (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_CONSTRAINT||LA18_0==KEYWORD_NOT||LA18_0==KEYWORD_REFERENCES||LA18_0==96||LA18_0==100) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Sql.g:2173:3: (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint )
                    {
                    // Sql.g:2173:3: (a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint )
                    // Sql.g:2174:4: a4_0= parse_org_emftext_language_sql_schema_ColumnConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_ColumnConstraint_in_parse_org_emftext_language_sql_schema_Column1947);
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
                    					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_3, a4_0, true);
                    					copyLocalizationInfos(a4_0, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 276, 278);
            	}

            // Sql.g:2200:2: ( (a5= KEYWORD_COLLATE (a6_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_COLLATE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Sql.g:2201:3: (a5= KEYWORD_COLLATE (a6_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:2201:3: (a5= KEYWORD_COLLATE (a6_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:2202:4: a5= KEYWORD_COLLATE (a6_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a5=(Token)match(input,KEYWORD_COLLATE,FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_schema_Column1982); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 279, 281);
                    			}

                    // Sql.g:2216:4: (a6_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:2217:5: a6_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_Column2008);
                    a6_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

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
                    					if (a6_0 != null) {
                    						if (a6_0 != null) {
                    							Object value = a6_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__COLLATION_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_4_0_0_1, a6_0, true);
                    						copyLocalizationInfos(a6_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 282, 283);
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
            		addExpectedElement(null, 284, 285);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_org_emftext_language_sql_schema_Column_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_Column"



    // $ANTLR start "parse_org_emftext_language_sql_schema_LiteralDefaultOption"
    // Sql.g:2257:1: parse_org_emftext_language_sql_schema_LiteralDefaultOption returns [org.emftext.language.sql.schema.LiteralDefaultOption element = null] : (a0_0= parse_org_emftext_language_sql_literal_Literal ) ;
    public final org.emftext.language.sql.schema.LiteralDefaultOption parse_org_emftext_language_sql_schema_LiteralDefaultOption() throws RecognitionException {
        org.emftext.language.sql.schema.LiteralDefaultOption element =  null;

        int parse_org_emftext_language_sql_schema_LiteralDefaultOption_StartIndex = input.index();

        org.emftext.language.sql.literal.Literal a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Sql.g:2260:2: ( (a0_0= parse_org_emftext_language_sql_literal_Literal ) )
            // Sql.g:2261:2: (a0_0= parse_org_emftext_language_sql_literal_Literal )
            {
            // Sql.g:2261:2: (a0_0= parse_org_emftext_language_sql_literal_Literal )
            // Sql.g:2262:3: a0_0= parse_org_emftext_language_sql_literal_Literal
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_Literal_in_parse_org_emftext_language_sql_schema_LiteralDefaultOption2068);
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
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_16_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 286, 291);
            		addExpectedElement(null, 292, 294);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_org_emftext_language_sql_schema_LiteralDefaultOption_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_LiteralDefaultOption"



    // $ANTLR start "parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption"
    // Sql.g:2293:1: parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption returns [org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption element = null] : (a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction ) ;
    public final org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption() throws RecognitionException {
        org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption element =  null;

        int parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption_StartIndex = input.index();

        org.emftext.language.sql.function.DatetimeValueFunction a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Sql.g:2296:2: ( (a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction ) )
            // Sql.g:2297:2: (a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction )
            {
            // Sql.g:2297:2: (a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction )
            // Sql.g:2298:3: a0_0= parse_org_emftext_language_sql_function_DatetimeValueFunction
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_function_DatetimeValueFunction_in_parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption2105);
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
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 295, 300);
            		addExpectedElement(null, 301, 303);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption"



    // $ANTLR start "parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption"
    // Sql.g:2329:1: parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption returns [org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption element = null] : (a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification ) ;
    public final org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption() throws RecognitionException {
        org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption element =  null;

        int parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption_StartIndex = input.index();

        org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Sql.g:2332:2: ( (a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification ) )
            // Sql.g:2333:2: (a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification )
            {
            // Sql.g:2333:2: (a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification )
            // Sql.g:2334:3: a0_0= parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification_in_parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption2142);
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
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 304, 309);
            		addExpectedElement(null, 310, 312);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption"



    // $ANTLR start "parse_org_emftext_language_sql_schema_NotNullColumnConstraint"
    // Sql.g:2365:1: parse_org_emftext_language_sql_schema_NotNullColumnConstraint returns [org.emftext.language.sql.schema.NotNullColumnConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? a2= KEYWORD_NOT a3= KEYWORD_NULL ;
    public final org.emftext.language.sql.schema.NotNullColumnConstraint parse_org_emftext_language_sql_schema_NotNullColumnConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.NotNullColumnConstraint element =  null;

        int parse_org_emftext_language_sql_schema_NotNullColumnConstraint_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a3=null;
        org.emftext.language.sql.common.SchemaQualifiedName a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // Sql.g:2368:2: ( ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? a2= KEYWORD_NOT a3= KEYWORD_NULL )
            // Sql.g:2369:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? a2= KEYWORD_NOT a3= KEYWORD_NULL
            {
            // Sql.g:2369:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_CONSTRAINT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Sql.g:2370:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:2370:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:2371:4: a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint2184); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getNotNullColumnConstraint(), 313, 315);
                    			}

                    // Sql.g:2385:4: (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:2386:5: a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint2210);
                    a1_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
                    						startIncompleteElement(element);
                    					}
                    					if (a1_0 != null) {
                    						if (a1_0 != null) {
                    							Object value = a1_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_0_0_0_1, a1_0, true);
                    						copyLocalizationInfos(a1_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 316);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 317);
            	}

            a2=(Token)match(input,KEYWORD_NOT,FOLLOW_KEYWORD_NOT_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint2251); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 318);
            	}

            a3=(Token)match(input,KEYWORD_NULL,FOLLOW_KEYWORD_NULL_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint2265); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 319, 321);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, parse_org_emftext_language_sql_schema_NotNullColumnConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_NotNullColumnConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_schema_UniqueColumnConstraint"
    // Sql.g:2451:1: parse_org_emftext_language_sql_schema_UniqueColumnConstraint returns [org.emftext.language.sql.schema.UniqueColumnConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ( (a2= 'UNIQUE' |a3= 'PRIMARY KEY' ) ) ;
    public final org.emftext.language.sql.schema.UniqueColumnConstraint parse_org_emftext_language_sql_schema_UniqueColumnConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.UniqueColumnConstraint element =  null;

        int parse_org_emftext_language_sql_schema_UniqueColumnConstraint_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a3=null;
        org.emftext.language.sql.common.SchemaQualifiedName a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // Sql.g:2454:2: ( ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ( (a2= 'UNIQUE' |a3= 'PRIMARY KEY' ) ) )
            // Sql.g:2455:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ( (a2= 'UNIQUE' |a3= 'PRIMARY KEY' ) )
            {
            // Sql.g:2455:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_CONSTRAINT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Sql.g:2456:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:2456:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:2457:4: a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint2303); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueColumnConstraint(), 322, 324);
                    			}

                    // Sql.g:2471:4: (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:2472:5: a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint2329);
                    a1_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
                    						startIncompleteElement(element);
                    					}
                    					if (a1_0 != null) {
                    						if (a1_0 != null) {
                    							Object value = a1_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_0_0_0_1, a1_0, true);
                    						copyLocalizationInfos(a1_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 325);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 326);
            	}

            // Sql.g:2504:2: ( (a2= 'UNIQUE' |a3= 'PRIMARY KEY' ) )
            // Sql.g:2505:3: (a2= 'UNIQUE' |a3= 'PRIMARY KEY' )
            {
            // Sql.g:2505:3: (a2= 'UNIQUE' |a3= 'PRIMARY KEY' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==100) ) {
                alt22=1;
            }
            else if ( (LA22_0==96) ) {
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
                    // Sql.g:2506:4: a2= 'UNIQUE'
                    {
                    a2=(Token)match(input,100,FOLLOW_100_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint2379); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueSpecificationKind().getEEnumLiteral(org.emftext.language.sql.schema.UniqueSpecificationKind.UNIQUE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:2519:8: a3= 'PRIMARY KEY'
                    {
                    a3=(Token)match(input,96,FOLLOW_96_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint2394); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
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
            		addExpectedElement(null, 327, 329);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, parse_org_emftext_language_sql_schema_UniqueColumnConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_UniqueColumnConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_schema_ReferentialColumnConstraint"
    // Sql.g:2544:1: parse_org_emftext_language_sql_schema_ReferentialColumnConstraint returns [org.emftext.language.sql.schema.ReferentialColumnConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? a2= KEYWORD_REFERENCES (a3_0= parse_org_emftext_language_sql_schema_TableReference ) ( (a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')' ) )? ;
    public final org.emftext.language.sql.schema.ReferentialColumnConstraint parse_org_emftext_language_sql_schema_ReferentialColumnConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.ReferentialColumnConstraint element =  null;

        int parse_org_emftext_language_sql_schema_ReferentialColumnConstraint_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        org.emftext.language.sql.common.SchemaQualifiedName a1_0 =null;

        org.emftext.language.sql.schema.TableReference a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // Sql.g:2547:2: ( ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? a2= KEYWORD_REFERENCES (a3_0= parse_org_emftext_language_sql_schema_TableReference ) ( (a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')' ) )? )
            // Sql.g:2548:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? a2= KEYWORD_REFERENCES (a3_0= parse_org_emftext_language_sql_schema_TableReference ) ( (a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')' ) )?
            {
            // Sql.g:2548:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_CONSTRAINT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Sql.g:2549:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:2549:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:2550:4: a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2439); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint(), 330, 332);
                    			}

                    // Sql.g:2564:4: (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:2565:5: a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2465);
                    a1_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    						startIncompleteElement(element);
                    					}
                    					if (a1_0 != null) {
                    						if (a1_0 != null) {
                    							Object value = a1_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_0_0_0_1, a1_0, true);
                    						copyLocalizationInfos(a1_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 333);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 334);
            	}

            a2=(Token)match(input,KEYWORD_REFERENCES,FOLLOW_KEYWORD_REFERENCES_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2506); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint(), 335, 337);
            	}

            // Sql.g:2611:2: (a3_0= parse_org_emftext_language_sql_schema_TableReference )
            // Sql.g:2612:3: a3_0= parse_org_emftext_language_sql_schema_TableReference
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableReference_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2524);
            a3_0=parse_org_emftext_language_sql_schema_TableReference();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
            				startIncompleteElement(element);
            			}
            			if (a3_0 != null) {
            				if (a3_0 != null) {
            					Object value = a3_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_2, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 338, 341);
            	}

            // Sql.g:2637:2: ( (a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Sql.g:2638:3: (a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')' )
                    {
                    // Sql.g:2638:3: (a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')' )
                    // Sql.g:2639:4: a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')'
                    {
                    a4=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2551); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 342);
                    			}

                    // Sql.g:2653:4: (a5= IDENTIFIER )
                    // Sql.g:2654:5: a5= IDENTIFIER
                    {
                    a5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2577); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    						startIncompleteElement(element);
                    					}
                    					if (a5 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
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
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_3_0_0_1, proxy, true);
                    						copyLocalizationInfos((CommonToken) a5, element);
                    						copyLocalizationInfos((CommonToken) a5, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 343, 344);
                    			}

                    // Sql.g:2693:4: ( (a6= ',' (a7= IDENTIFIER ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==59) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Sql.g:2694:5: (a6= ',' (a7= IDENTIFIER ) )
                    	    {
                    	    // Sql.g:2694:5: (a6= ',' (a7= IDENTIFIER ) )
                    	    // Sql.g:2695:6: a6= ',' (a7= IDENTIFIER )
                    	    {
                    	    a6=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2623); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_3_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((CommonToken)a6, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 345);
                    	    					}

                    	    // Sql.g:2709:6: (a7= IDENTIFIER )
                    	    // Sql.g:2710:7: a7= IDENTIFIER
                    	    {
                    	    a7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2657); if (state.failed) return element;

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
                    	    								retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_3_0_0_2_0_0_1, proxy, true);
                    	    								copyLocalizationInfos((CommonToken) a7, element);
                    	    								copyLocalizationInfos((CommonToken) a7, proxy);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 346, 347);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 348, 349);
                    			}

                    a8=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2725); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_3_0_0_3, null, true);
                    				copyLocalizationInfos((CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 350, 352);
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
            		addExpectedElement(null, 353, 355);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, parse_org_emftext_language_sql_schema_ReferentialColumnConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_ReferentialColumnConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_schema_UniqueTableConstraint"
    // Sql.g:2785:1: parse_org_emftext_language_sql_schema_UniqueTableConstraint returns [org.emftext.language.sql.schema.UniqueTableConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ( (a2= 'UNIQUE' |a3= 'PRIMARY KEY' ) ) a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')' ;
    public final org.emftext.language.sql.schema.UniqueTableConstraint parse_org_emftext_language_sql_schema_UniqueTableConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.UniqueTableConstraint element =  null;

        int parse_org_emftext_language_sql_schema_UniqueTableConstraint_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a3=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        org.emftext.language.sql.common.SchemaQualifiedName a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // Sql.g:2788:2: ( ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ( (a2= 'UNIQUE' |a3= 'PRIMARY KEY' ) ) a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')' )
            // Sql.g:2789:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ( (a2= 'UNIQUE' |a3= 'PRIMARY KEY' ) ) a6= '(' (a7= IDENTIFIER ) ( (a8= ',' (a9= IDENTIFIER ) ) )* a10= ')'
            {
            // Sql.g:2789:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_CONSTRAINT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Sql.g:2790:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:2790:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:2791:4: a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2782); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint(), 356, 358);
                    			}

                    // Sql.g:2805:4: (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:2806:5: a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2808);
                    a1_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
                    						startIncompleteElement(element);
                    					}
                    					if (a1_0 != null) {
                    						if (a1_0 != null) {
                    							Object value = a1_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0_0_0_1, a1_0, true);
                    						copyLocalizationInfos(a1_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 359);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 360);
            	}

            // Sql.g:2838:2: ( (a2= 'UNIQUE' |a3= 'PRIMARY KEY' ) )
            // Sql.g:2839:3: (a2= 'UNIQUE' |a3= 'PRIMARY KEY' )
            {
            // Sql.g:2839:3: (a2= 'UNIQUE' |a3= 'PRIMARY KEY' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==100) ) {
                alt27=1;
            }
            else if ( (LA27_0==96) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // Sql.g:2840:4: a2= 'UNIQUE'
                    {
                    a2=(Token)match(input,100,FOLLOW_100_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2858); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueSpecificationKind().getEEnumLiteral(org.emftext.language.sql.schema.UniqueSpecificationKind.UNIQUE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:2853:8: a3= 'PRIMARY KEY'
                    {
                    a3=(Token)match(input,96,FOLLOW_96_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2873); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
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
            		addExpectedElement(null, 361);
            	}

            a6=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2894); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 362);
            	}

            // Sql.g:2887:2: (a7= IDENTIFIER )
            // Sql.g:2888:3: a7= IDENTIFIER
            {
            a7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2912); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            				startIncompleteElement(element);
            			}
            			if (a7 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a7).getLine(), ((CommonToken) a7).getCharPositionInLine(), ((CommonToken) a7).getStartIndex(), ((CommonToken) a7).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.TableColumnsConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableColumnsConstraintColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_3, proxy, true);
            				copyLocalizationInfos((CommonToken) a7, element);
            				copyLocalizationInfos((CommonToken) a7, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 363, 364);
            	}

            // Sql.g:2927:2: ( (a8= ',' (a9= IDENTIFIER ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==59) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Sql.g:2928:3: (a8= ',' (a9= IDENTIFIER ) )
            	    {
            	    // Sql.g:2928:3: (a8= ',' (a9= IDENTIFIER ) )
            	    // Sql.g:2929:4: a8= ',' (a9= IDENTIFIER )
            	    {
            	    a8=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2942); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_4_0_0_0, null, true);
            	    				copyLocalizationInfos((CommonToken)a8, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 365);
            	    			}

            	    // Sql.g:2943:4: (a9= IDENTIFIER )
            	    // Sql.g:2944:5: a9= IDENTIFIER
            	    {
            	    a9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2968); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a9 != null) {
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            	    						tokenResolver.setOptions(getOptions());
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a9.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a9).getLine(), ((CommonToken) a9).getCharPositionInLine(), ((CommonToken) a9).getStartIndex(), ((CommonToken) a9).getStopIndex());
            	    						}
            	    						String resolved = (String) resolvedObject;
            	    						org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            	    						collectHiddenTokens(element);
            	    						registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.TableColumnsConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableColumnsConstraintColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), resolved, proxy);
            	    						if (proxy != null) {
            	    							Object value = proxy;
            	    							addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_4_0_0_1, proxy, true);
            	    						copyLocalizationInfos((CommonToken) a9, element);
            	    						copyLocalizationInfos((CommonToken) a9, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 366, 367);
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
            		addExpectedElement(null, 368, 369);
            	}

            a10=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint3014); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 370, 371);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, parse_org_emftext_language_sql_schema_UniqueTableConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_UniqueTableConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_schema_ReferentialTableConstraint"
    // Sql.g:3009:1: parse_org_emftext_language_sql_schema_ReferentialTableConstraint returns [org.emftext.language.sql.schema.ReferentialTableConstraint element = null] : ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? a2= KEYWORD_FOREIGN a3= KEYWORD_KEY a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')' a9= KEYWORD_REFERENCES (a10_0= parse_org_emftext_language_sql_schema_TableReference ) ( (a11= '(' (a12= IDENTIFIER ) ( (a13= ',' (a14= IDENTIFIER ) ) )* a15= ')' ) )? ;
    public final org.emftext.language.sql.schema.ReferentialTableConstraint parse_org_emftext_language_sql_schema_ReferentialTableConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.ReferentialTableConstraint element =  null;

        int parse_org_emftext_language_sql_schema_ReferentialTableConstraint_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        org.emftext.language.sql.common.SchemaQualifiedName a1_0 =null;

        org.emftext.language.sql.schema.TableReference a10_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // Sql.g:3012:2: ( ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? a2= KEYWORD_FOREIGN a3= KEYWORD_KEY a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')' a9= KEYWORD_REFERENCES (a10_0= parse_org_emftext_language_sql_schema_TableReference ) ( (a11= '(' (a12= IDENTIFIER ) ( (a13= ',' (a14= IDENTIFIER ) ) )* a15= ')' ) )? )
            // Sql.g:3013:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? a2= KEYWORD_FOREIGN a3= KEYWORD_KEY a4= '(' (a5= IDENTIFIER ) ( (a6= ',' (a7= IDENTIFIER ) ) )* a8= ')' a9= KEYWORD_REFERENCES (a10_0= parse_org_emftext_language_sql_schema_TableReference ) ( (a11= '(' (a12= IDENTIFIER ) ( (a13= ',' (a14= IDENTIFIER ) ) )* a15= ')' ) )?
            {
            // Sql.g:3013:2: ( (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_CONSTRAINT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Sql.g:3014:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:3014:3: (a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:3015:4: a0= KEYWORD_CONSTRAINT (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a0=(Token)match(input,KEYWORD_CONSTRAINT,FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3052); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_0_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint(), 372, 374);
                    			}

                    // Sql.g:3029:4: (a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:3030:5: a1_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3078);
                    a1_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    						startIncompleteElement(element);
                    					}
                    					if (a1_0 != null) {
                    						if (a1_0 != null) {
                    							Object value = a1_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_0_0_0_1, a1_0, true);
                    						copyLocalizationInfos(a1_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 375);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 376);
            	}

            a2=(Token)match(input,KEYWORD_FOREIGN,FOLLOW_KEYWORD_FOREIGN_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3119); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 377);
            	}

            a3=(Token)match(input,KEYWORD_KEY,FOLLOW_KEYWORD_KEY_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3133); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 378);
            	}

            a4=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3147); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 379);
            	}

            // Sql.g:3104:2: (a5= IDENTIFIER )
            // Sql.g:3105:3: a5= IDENTIFIER
            {
            a5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3165); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            				startIncompleteElement(element);
            			}
            			if (a5 != null) {
            				org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.TableColumnsConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableColumnsConstraintColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_4, proxy, true);
            				copyLocalizationInfos((CommonToken) a5, element);
            				copyLocalizationInfos((CommonToken) a5, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 380, 381);
            	}

            // Sql.g:3144:2: ( (a6= ',' (a7= IDENTIFIER ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==59) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Sql.g:3145:3: (a6= ',' (a7= IDENTIFIER ) )
            	    {
            	    // Sql.g:3145:3: (a6= ',' (a7= IDENTIFIER ) )
            	    // Sql.g:3146:4: a6= ',' (a7= IDENTIFIER )
            	    {
            	    a6=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3195); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_5_0_0_0, null, true);
            	    				copyLocalizationInfos((CommonToken)a6, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 382);
            	    			}

            	    // Sql.g:3160:4: (a7= IDENTIFIER )
            	    // Sql.g:3161:5: a7= IDENTIFIER
            	    {
            	    a7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3221); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a7 != null) {
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
            	    						tokenResolver.setOptions(getOptions());
            	    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a7).getLine(), ((CommonToken) a7).getCharPositionInLine(), ((CommonToken) a7).getStartIndex(), ((CommonToken) a7).getStopIndex());
            	    						}
            	    						String resolved = (String) resolvedObject;
            	    						org.emftext.language.sql.schema.Column proxy = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
            	    						collectHiddenTokens(element);
            	    						registerContextDependentProxy(new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragmentFactory<org.emftext.language.sql.schema.TableColumnsConstraint, org.emftext.language.sql.schema.Column>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableColumnsConstraintColumnsReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), resolved, proxy);
            	    						if (proxy != null) {
            	    							Object value = proxy;
            	    							addObjectToList(element, org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_5_0_0_1, proxy, true);
            	    						copyLocalizationInfos((CommonToken) a7, element);
            	    						copyLocalizationInfos((CommonToken) a7, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, 383, 384);
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
            		addExpectedElement(null, 385, 386);
            	}

            a8=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3267); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 387);
            	}

            a9=(Token)match(input,KEYWORD_REFERENCES,FOLLOW_KEYWORD_REFERENCES_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3281); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint(), 388, 390);
            	}

            // Sql.g:3235:2: (a10_0= parse_org_emftext_language_sql_schema_TableReference )
            // Sql.g:3236:3: a10_0= parse_org_emftext_language_sql_schema_TableReference
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableReference_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3299);
            a10_0=parse_org_emftext_language_sql_schema_TableReference();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
            				startIncompleteElement(element);
            			}
            			if (a10_0 != null) {
            				if (a10_0 != null) {
            					Object value = a10_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_8, a10_0, true);
            				copyLocalizationInfos(a10_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 391, 393);
            	}

            // Sql.g:3261:2: ( (a11= '(' (a12= IDENTIFIER ) ( (a13= ',' (a14= IDENTIFIER ) ) )* a15= ')' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==57) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Sql.g:3262:3: (a11= '(' (a12= IDENTIFIER ) ( (a13= ',' (a14= IDENTIFIER ) ) )* a15= ')' )
                    {
                    // Sql.g:3262:3: (a11= '(' (a12= IDENTIFIER ) ( (a13= ',' (a14= IDENTIFIER ) ) )* a15= ')' )
                    // Sql.g:3263:4: a11= '(' (a12= IDENTIFIER ) ( (a13= ',' (a14= IDENTIFIER ) ) )* a15= ')'
                    {
                    a11=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3326); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_9_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 394);
                    			}

                    // Sql.g:3277:4: (a12= IDENTIFIER )
                    // Sql.g:3278:5: a12= IDENTIFIER
                    {
                    a12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3352); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    						startIncompleteElement(element);
                    					}
                    					if (a12 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a12).getLine(), ((CommonToken) a12).getCharPositionInLine(), ((CommonToken) a12).getStartIndex(), ((CommonToken) a12).getStopIndex());
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
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_9_0_0_1, proxy, true);
                    						copyLocalizationInfos((CommonToken) a12, element);
                    						copyLocalizationInfos((CommonToken) a12, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 395, 396);
                    			}

                    // Sql.g:3317:4: ( (a13= ',' (a14= IDENTIFIER ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==59) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // Sql.g:3318:5: (a13= ',' (a14= IDENTIFIER ) )
                    	    {
                    	    // Sql.g:3318:5: (a13= ',' (a14= IDENTIFIER ) )
                    	    // Sql.g:3319:6: a13= ',' (a14= IDENTIFIER )
                    	    {
                    	    a13=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3398); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_9_0_0_2_0_0_0, null, true);
                    	    						copyLocalizationInfos((CommonToken)a13, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 397);
                    	    					}

                    	    // Sql.g:3333:6: (a14= IDENTIFIER )
                    	    // Sql.g:3334:7: a14= IDENTIFIER
                    	    {
                    	    a14=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3432); if (state.failed) return element;

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
                    	    								retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_9_0_0_2_0_0_1, proxy, true);
                    	    								copyLocalizationInfos((CommonToken) a14, element);
                    	    								copyLocalizationInfos((CommonToken) a14, proxy);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 398, 399);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 400, 401);
                    			}

                    a15=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3500); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_9_0_0_3, null, true);
                    				copyLocalizationInfos((CommonToken)a15, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 402, 403);
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
            		addExpectedElement(null, 404, 405);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, parse_org_emftext_language_sql_schema_ReferentialTableConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_ReferentialTableConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_ExactNumericType"
    // Sql.g:3409:1: parse_org_emftext_language_sql_datatype_ExactNumericType returns [org.emftext.language.sql.datatype.ExactNumericType element = null] : ( (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' ) ) ( (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }

            // Sql.g:3412:2: ( ( (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' ) ) ( (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' ) )? )
            // Sql.g:3413:2: ( (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' ) ) ( (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' ) )?
            {
            // Sql.g:3413:2: ( (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' ) )
            // Sql.g:3414:3: (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' )
            {
            // Sql.g:3414:3: (a0= 'NUMERIC' |a1= 'DECIMAL' |a2= 'DEC' |a3= 'SMALLINT' |a4= 'INTEGER' |a5= 'INT' |a6= 'BIGINT' )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt33=1;
                }
                break;
            case 75:
                {
                alt33=2;
                }
                break;
            case 74:
                {
                alt33=3;
                }
                break;
            case 98:
                {
                alt33=4;
                }
                break;
            case 82:
                {
                alt33=5;
                }
                break;
            case 81:
                {
                alt33=6;
                }
                break;
            case 62:
                {
                alt33=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // Sql.g:3415:4: a0= 'NUMERIC'
                    {
                    a0=(Token)match(input,94,FOLLOW_94_in_parse_org_emftext_language_sql_datatype_ExactNumericType3557); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.NUMERIC_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:3428:8: a1= 'DECIMAL'
                    {
                    a1=(Token)match(input,75,FOLLOW_75_in_parse_org_emftext_language_sql_datatype_ExactNumericType3572); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.DECIMAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:3441:8: a2= 'DEC'
                    {
                    a2=(Token)match(input,74,FOLLOW_74_in_parse_org_emftext_language_sql_datatype_ExactNumericType3587); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.DEC_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Sql.g:3454:8: a3= 'SMALLINT'
                    {
                    a3=(Token)match(input,98,FOLLOW_98_in_parse_org_emftext_language_sql_datatype_ExactNumericType3602); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.SMALLINT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Sql.g:3467:8: a4= 'INTEGER'
                    {
                    a4=(Token)match(input,82,FOLLOW_82_in_parse_org_emftext_language_sql_datatype_ExactNumericType3617); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.INTEGER_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 6 :
                    // Sql.g:3480:8: a5= 'INT'
                    {
                    a5=(Token)match(input,81,FOLLOW_81_in_parse_org_emftext_language_sql_datatype_ExactNumericType3632); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ExactNumericTypeKind.INT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 7 :
                    // Sql.g:3493:8: a6= 'BIGINT'
                    {
                    a6=(Token)match(input,62,FOLLOW_62_in_parse_org_emftext_language_sql_datatype_ExactNumericType3647); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_0, null, true);
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
            		addExpectedElement(null, 406, 407);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 408, 413);
            		addExpectedElement(null, 414, 416);
            	}

            // Sql.g:3515:2: ( (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==57) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Sql.g:3516:3: (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' )
                    {
                    // Sql.g:3516:3: (a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')' )
                    // Sql.g:3517:4: a9= '(' (a10= UNSIGNED_INTEGER ) ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )? a13= ')'
                    {
                    a9=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_datatype_ExactNumericType3677); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 417);
                    			}

                    // Sql.g:3531:4: (a10= UNSIGNED_INTEGER )
                    // Sql.g:3532:5: a10= UNSIGNED_INTEGER
                    {
                    a10=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ExactNumericType3703); if (state.failed) return element;

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
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a10, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 418, 419);
                    			}

                    // Sql.g:3567:4: ( (a11= ',' (a12= UNSIGNED_INTEGER ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==59) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Sql.g:3568:5: (a11= ',' (a12= UNSIGNED_INTEGER ) )
                            {
                            // Sql.g:3568:5: (a11= ',' (a12= UNSIGNED_INTEGER ) )
                            // Sql.g:3569:6: a11= ',' (a12= UNSIGNED_INTEGER )
                            {
                            a11=(Token)match(input,59,FOLLOW_59_in_parse_org_emftext_language_sql_datatype_ExactNumericType3749); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_2_0_0_0, null, true);
                            						copyLocalizationInfos((CommonToken)a11, element);
                            					}

                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, 420);
                            					}

                            // Sql.g:3583:6: (a12= UNSIGNED_INTEGER )
                            // Sql.g:3584:7: a12= UNSIGNED_INTEGER
                            {
                            a12=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ExactNumericType3783); if (state.failed) return element;

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
                            								retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_2_0_0_1, resolved, true);
                            								copyLocalizationInfos((CommonToken) a12, element);
                            							}
                            						}

                            }


                            if ( state.backtracking==0 ) {
                            						// expected elements (follow set)
                            						addExpectedElement(null, 421);
                            					}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 422);
                    			}

                    a13=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_ExactNumericType3851); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_3, null, true);
                    				copyLocalizationInfos((CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 423);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 424, 429);
                    				addExpectedElement(null, 430, 432);
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
            		addExpectedElement(null, 433);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 434, 439);
            		addExpectedElement(null, 440, 442);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, parse_org_emftext_language_sql_datatype_ExactNumericType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_ExactNumericType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_ApproximateNumericType"
    // Sql.g:3659:1: parse_org_emftext_language_sql_datatype_ApproximateNumericType returns [org.emftext.language.sql.datatype.ApproximateNumericType element = null] : ( (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE PRECISION' ) ) ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }

            // Sql.g:3662:2: ( ( (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE PRECISION' ) ) ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )? )
            // Sql.g:3663:2: ( (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE PRECISION' ) ) ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )?
            {
            // Sql.g:3663:2: ( (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE PRECISION' ) )
            // Sql.g:3664:3: (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE PRECISION' )
            {
            // Sql.g:3664:3: (a0= 'FLOAT' |a1= 'REAL' |a2= 'DOUBLE PRECISION' )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt36=1;
                }
                break;
            case 97:
                {
                alt36=2;
                }
                break;
            case 76:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // Sql.g:3665:4: a0= 'FLOAT'
                    {
                    a0=(Token)match(input,78,FOLLOW_78_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3908); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ApproximateNumericTypeKind.FLOAT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:3678:8: a1= 'REAL'
                    {
                    a1=(Token)match(input,97,FOLLOW_97_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3923); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ApproximateNumericTypeKind.REAL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:3691:8: a2= 'DOUBLE PRECISION'
                    {
                    a2=(Token)match(input,76,FOLLOW_76_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3938); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
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
            		addExpectedElement(null, 443, 444);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 445, 450);
            		addExpectedElement(null, 451, 453);
            	}

            // Sql.g:3713:2: ( (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Sql.g:3714:3: (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' )
                    {
                    // Sql.g:3714:3: (a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')' )
                    // Sql.g:3715:4: a5= '(' (a6= UNSIGNED_INTEGER ) a7= ')'
                    {
                    a5=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3968); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 454);
                    			}

                    // Sql.g:3729:4: (a6= UNSIGNED_INTEGER )
                    // Sql.g:3730:5: a6= UNSIGNED_INTEGER
                    {
                    a6=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3994); if (state.failed) return element;

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
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a6, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 455);
                    			}

                    a7=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4027); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 456);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 457, 462);
                    				addExpectedElement(null, 463, 465);
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
            		addExpectedElement(null, 466);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 467, 472);
            		addExpectedElement(null, 473, 475);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, parse_org_emftext_language_sql_datatype_ApproximateNumericType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_ApproximateNumericType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_CharacterStringType"
    // Sql.g:3798:1: parse_org_emftext_language_sql_datatype_CharacterStringType returns [org.emftext.language.sql.datatype.CharacterStringType element = null] : ( (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' ) ) ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )? ( (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ( (a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ;
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
        Token a13=null;
        org.emftext.language.sql.common.SchemaQualifiedName a12_0 =null;

        org.emftext.language.sql.common.SchemaQualifiedName a14_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }

            // Sql.g:3801:2: ( ( (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' ) ) ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )? ( (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ( (a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? )
            // Sql.g:3802:2: ( (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' ) ) ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )? ( (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ( (a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            {
            // Sql.g:3802:2: ( (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' ) )
            // Sql.g:3803:3: (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' )
            {
            // Sql.g:3803:3: (a0= 'CHARACTER' |a1= 'CHAR' |a2= 'VARCHAR' |a3= 'CHARACTER VARYING' |a4= 'CHAR VARYING' )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt38=1;
                }
                break;
            case 66:
                {
                alt38=2;
                }
                break;
            case 101:
                {
                alt38=3;
                }
                break;
            case 67:
                {
                alt38=4;
                }
                break;
            case 65:
                {
                alt38=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // Sql.g:3804:4: a0= 'CHARACTER'
                    {
                    a0=(Token)match(input,68,FOLLOW_68_in_parse_org_emftext_language_sql_datatype_CharacterStringType4084); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.CharacterStringTypeKind.CHARACTER_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:3817:8: a1= 'CHAR'
                    {
                    a1=(Token)match(input,66,FOLLOW_66_in_parse_org_emftext_language_sql_datatype_CharacterStringType4099); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.CharacterStringTypeKind.CHAR_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:3830:8: a2= 'VARCHAR'
                    {
                    a2=(Token)match(input,101,FOLLOW_101_in_parse_org_emftext_language_sql_datatype_CharacterStringType4114); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.CharacterStringTypeKind.VARCHAR_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Sql.g:3843:8: a3= 'CHARACTER VARYING'
                    {
                    a3=(Token)match(input,67,FOLLOW_67_in_parse_org_emftext_language_sql_datatype_CharacterStringType4129); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.CharacterStringTypeKind.CHARACTER_VARYING_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Sql.g:3856:8: a4= 'CHAR VARYING'
                    {
                    a4=(Token)match(input,65,FOLLOW_65_in_parse_org_emftext_language_sql_datatype_CharacterStringType4144); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_0, null, true);
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
            		addExpectedElement(null, 476, 479);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 480, 485);
            		addExpectedElement(null, 486, 488);
            	}

            // Sql.g:3878:2: ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==57) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Sql.g:3879:3: (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' )
                    {
                    // Sql.g:3879:3: (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' )
                    // Sql.g:3880:4: a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')'
                    {
                    a7=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_datatype_CharacterStringType4174); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 489);
                    			}

                    // Sql.g:3894:4: (a8= UNSIGNED_INTEGER )
                    // Sql.g:3895:5: a8= UNSIGNED_INTEGER
                    {
                    a8=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_CharacterStringType4200); if (state.failed) return element;

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
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a8, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 490);
                    			}

                    a9=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_CharacterStringType4233); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 491, 493);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 494, 499);
                    				addExpectedElement(null, 500, 502);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 503, 505);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 506, 511);
            		addExpectedElement(null, 512, 514);
            	}

            // Sql.g:3955:2: ( (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEYWORD_CHARACTER) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Sql.g:3956:3: (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:3956:3: (a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:3957:4: a10= KEYWORD_CHARACTER a11= KEYWORD_SET (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a10=(Token)match(input,KEYWORD_CHARACTER,FOLLOW_KEYWORD_CHARACTER_in_parse_org_emftext_language_sql_datatype_CharacterStringType4275); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 515);
                    			}

                    a11=(Token)match(input,KEYWORD_SET,FOLLOW_KEYWORD_SET_in_parse_org_emftext_language_sql_datatype_CharacterStringType4295); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType(), 516, 518);
                    			}

                    // Sql.g:3985:4: (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:3986:5: a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_datatype_CharacterStringType4321);
                    a12_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    						startIncompleteElement(element);
                    					}
                    					if (a12_0 != null) {
                    						if (a12_0 != null) {
                    							Object value = a12_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_2_0_0_2, a12_0, true);
                    						copyLocalizationInfos(a12_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 519, 520);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 521, 526);
                    				addExpectedElement(null, 527, 529);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 530, 531);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 532, 537);
            		addExpectedElement(null, 538, 540);
            	}

            // Sql.g:4022:2: ( (a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_COLLATE) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==IDENTIFIER) ) {
                    int LA41_3 = input.LA(3);

                    if ( (synpred50_Sql()) ) {
                        alt41=1;
                    }
                }
            }
            switch (alt41) {
                case 1 :
                    // Sql.g:4023:3: (a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:4023:3: (a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:4024:4: a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a13=(Token)match(input,KEYWORD_COLLATE,FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_datatype_CharacterStringType4371); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_3_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType(), 541, 543);
                    			}

                    // Sql.g:4038:4: (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:4039:5: a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_datatype_CharacterStringType4397);
                    a14_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
                    						startIncompleteElement(element);
                    					}
                    					if (a14_0 != null) {
                    						if (a14_0 != null) {
                    							Object value = a14_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_3_0_0_1, a14_0, true);
                    						copyLocalizationInfos(a14_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 544);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 545, 550);
                    				addExpectedElement(null, 551, 553);
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
            		addExpectedElement(null, 554);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 555, 560);
            		addExpectedElement(null, 561, 563);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, parse_org_emftext_language_sql_datatype_CharacterStringType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_CharacterStringType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_NationalCharacterStringType"
    // Sql.g:4083:1: parse_org_emftext_language_sql_datatype_NationalCharacterStringType returns [org.emftext.language.sql.datatype.NationalCharacterStringType element = null] : ( (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NATIONAL CHARACTER VARYING' |a3= 'NATIONAL CHAR VARYING' |a4= 'NCHAR' |a5= 'NCHAR VARYING' ) ) ( (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' ) )? ( (a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? ;
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
        org.emftext.language.sql.common.SchemaQualifiedName a12_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }

            // Sql.g:4086:2: ( ( (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NATIONAL CHARACTER VARYING' |a3= 'NATIONAL CHAR VARYING' |a4= 'NCHAR' |a5= 'NCHAR VARYING' ) ) ( (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' ) )? ( (a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )? )
            // Sql.g:4087:2: ( (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NATIONAL CHARACTER VARYING' |a3= 'NATIONAL CHAR VARYING' |a4= 'NCHAR' |a5= 'NCHAR VARYING' ) ) ( (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' ) )? ( (a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            {
            // Sql.g:4087:2: ( (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NATIONAL CHARACTER VARYING' |a3= 'NATIONAL CHAR VARYING' |a4= 'NCHAR' |a5= 'NCHAR VARYING' ) )
            // Sql.g:4088:3: (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NATIONAL CHARACTER VARYING' |a3= 'NATIONAL CHAR VARYING' |a4= 'NCHAR' |a5= 'NCHAR VARYING' )
            {
            // Sql.g:4088:3: (a0= 'NATIONAL CHARACTER' |a1= 'NATIONAL CHAR' |a2= 'NATIONAL CHARACTER VARYING' |a3= 'NATIONAL CHAR VARYING' |a4= 'NCHAR' |a5= 'NCHAR VARYING' )
            int alt42=6;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt42=1;
                }
                break;
            case 89:
                {
                alt42=2;
                }
                break;
            case 90:
                {
                alt42=3;
                }
                break;
            case 88:
                {
                alt42=4;
                }
                break;
            case 93:
                {
                alt42=5;
                }
                break;
            case 92:
                {
                alt42=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // Sql.g:4089:4: a0= 'NATIONAL CHARACTER'
                    {
                    a0=(Token)match(input,91,FOLLOW_91_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4462); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NATIONAL_CHARACTER_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:4102:8: a1= 'NATIONAL CHAR'
                    {
                    a1=(Token)match(input,89,FOLLOW_89_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4477); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NATIONAL_CHAR_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:4115:8: a2= 'NATIONAL CHARACTER VARYING'
                    {
                    a2=(Token)match(input,90,FOLLOW_90_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4492); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NATIONAL_CHARACTER_VARYING_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Sql.g:4128:8: a3= 'NATIONAL CHAR VARYING'
                    {
                    a3=(Token)match(input,88,FOLLOW_88_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4507); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NATIONAL_CHAR_VARYING_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Sql.g:4141:8: a4= 'NCHAR'
                    {
                    a4=(Token)match(input,93,FOLLOW_93_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4522); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NCHAR_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 6 :
                    // Sql.g:4154:8: a5= 'NCHAR VARYING'
                    {
                    a5=(Token)match(input,92,FOLLOW_92_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4537); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_0, null, true);
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
            		addExpectedElement(null, 564, 566);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 567, 572);
            		addExpectedElement(null, 573, 575);
            	}

            // Sql.g:4176:2: ( (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==57) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Sql.g:4177:3: (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' )
                    {
                    // Sql.g:4177:3: (a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')' )
                    // Sql.g:4178:4: a8= '(' (a9= UNSIGNED_INTEGER ) a10= ')'
                    {
                    a8=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4567); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 576);
                    			}

                    // Sql.g:4192:4: (a9= UNSIGNED_INTEGER )
                    // Sql.g:4193:5: a9= UNSIGNED_INTEGER
                    {
                    a9=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4593); if (state.failed) return element;

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
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a9, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 577);
                    			}

                    a10=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4626); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 578, 579);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 580, 585);
                    				addExpectedElement(null, 586, 588);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 589, 590);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 591, 596);
            		addExpectedElement(null, 597, 599);
            	}

            // Sql.g:4253:2: ( (a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_COLLATE) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==IDENTIFIER) ) {
                    int LA44_3 = input.LA(3);

                    if ( (synpred57_Sql()) ) {
                        alt44=1;
                    }
                }
            }
            switch (alt44) {
                case 1 :
                    // Sql.g:4254:3: (a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    {
                    // Sql.g:4254:3: (a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
                    // Sql.g:4255:4: a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    {
                    a11=(Token)match(input,KEYWORD_COLLATE,FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4668); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a11, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringType(), 600, 602);
                    			}

                    // Sql.g:4269:4: (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
                    // Sql.g:4270:5: a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4694);
                    a12_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
                    						startIncompleteElement(element);
                    					}
                    					if (a12_0 != null) {
                    						if (a12_0 != null) {
                    							Object value = a12_0;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME), value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_2_0_0_1, a12_0, true);
                    						copyLocalizationInfos(a12_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 603);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 604, 609);
                    				addExpectedElement(null, 610, 612);
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
            		addExpectedElement(null, 613);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 614, 619);
            		addExpectedElement(null, 620, 622);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, parse_org_emftext_language_sql_datatype_NationalCharacterStringType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_NationalCharacterStringType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType"
    // Sql.g:4314:1: parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType returns [org.emftext.language.sql.datatype.BinaryLargeObjectStringType element = null] : ( (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' ) ) ( (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' ) )? ;
    public final org.emftext.language.sql.datatype.BinaryLargeObjectStringType parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType() throws RecognitionException {
        org.emftext.language.sql.datatype.BinaryLargeObjectStringType element =  null;

        int parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a4=null;
        Token a6=null;
        org.emftext.language.sql.datatype.LargeObjectLength a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }

            // Sql.g:4317:2: ( ( (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' ) ) ( (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' ) )? )
            // Sql.g:4318:2: ( (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' ) ) ( (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' ) )?
            {
            // Sql.g:4318:2: ( (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' ) )
            // Sql.g:4319:3: (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' )
            {
            // Sql.g:4319:3: (a0= 'BINARY LARGE OBJECT' |a1= 'BLOB' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==63) ) {
                alt45=1;
            }
            else if ( (LA45_0==64) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // Sql.g:4320:4: a0= 'BINARY LARGE OBJECT'
                    {
                    a0=(Token)match(input,63,FOLLOW_63_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4759); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_28_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.BinaryLargeObjectStringTypeKind.BINARY_LARGE_OBJECT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:4333:8: a1= 'BLOB'
                    {
                    a1=(Token)match(input,64,FOLLOW_64_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4774); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_28_0_0_0, null, true);
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
            		addExpectedElement(null, 623, 624);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 625, 630);
            		addExpectedElement(null, 631, 633);
            	}

            // Sql.g:4355:2: ( (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Sql.g:4356:3: (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' )
                    {
                    // Sql.g:4356:3: (a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')' )
                    // Sql.g:4357:4: a4= '(' (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength ) a6= ')'
                    {
                    a4=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4804); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_28_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringType(), 634);
                    			}

                    // Sql.g:4371:4: (a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength )
                    // Sql.g:4372:5: a5_0= parse_org_emftext_language_sql_datatype_LargeObjectLength
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_LargeObjectLength_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4830);
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
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_28_0_0_1_0_0_1, a5_0, true);
                    						copyLocalizationInfos(a5_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 635);
                    			}

                    a6=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4858); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_28_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 636);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 637, 642);
                    				addExpectedElement(null, 643, 645);
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
            		addExpectedElement(null, 646);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 647, 652);
            		addExpectedElement(null, 653, 655);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_LargeObjectLength"
    // Sql.g:4430:1: parse_org_emftext_language_sql_datatype_LargeObjectLength returns [org.emftext.language.sql.datatype.LargeObjectLength element = null] : (a0= UNSIGNED_INTEGER ) ( ( (a1= 'K' |a2= 'M' |a3= 'G' ) ) )? ( ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }

            // Sql.g:4433:2: ( (a0= UNSIGNED_INTEGER ) ( ( (a1= 'K' |a2= 'M' |a3= 'G' ) ) )? ( ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) ) )? )
            // Sql.g:4434:2: (a0= UNSIGNED_INTEGER ) ( ( (a1= 'K' |a2= 'M' |a3= 'G' ) ) )? ( ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) ) )?
            {
            // Sql.g:4434:2: (a0= UNSIGNED_INTEGER )
            // Sql.g:4435:3: a0= UNSIGNED_INTEGER
            {
            a0=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4910); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_29_0_0_0, resolved, true);
            				copyLocalizationInfos((CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 656, 658);
            	}

            // Sql.g:4470:2: ( ( (a1= 'K' |a2= 'M' |a3= 'G' ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==79||LA48_0==83||LA48_0==87) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Sql.g:4471:3: ( (a1= 'K' |a2= 'M' |a3= 'G' ) )
                    {
                    // Sql.g:4471:3: ( (a1= 'K' |a2= 'M' |a3= 'G' ) )
                    // Sql.g:4472:4: (a1= 'K' |a2= 'M' |a3= 'G' )
                    {
                    // Sql.g:4472:4: (a1= 'K' |a2= 'M' |a3= 'G' )
                    int alt47=3;
                    switch ( input.LA(1) ) {
                    case 83:
                        {
                        alt47=1;
                        }
                        break;
                    case 87:
                        {
                        alt47=2;
                        }
                        break;
                    case 79:
                        {
                        alt47=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;

                    }

                    switch (alt47) {
                        case 1 :
                            // Sql.g:4473:5: a1= 'K'
                            {
                            a1=(Token)match(input,83,FOLLOW_83_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4946); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_29_0_0_1, null, true);
                            					copyLocalizationInfos((CommonToken)a1, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getMultiplier().getEEnumLiteral(org.emftext.language.sql.datatype.Multiplier.K_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:4486:10: a2= 'M'
                            {
                            a2=(Token)match(input,87,FOLLOW_87_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4963); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_29_0_0_1, null, true);
                            					copyLocalizationInfos((CommonToken)a2, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getMultiplier().getEEnumLiteral(org.emftext.language.sql.datatype.Multiplier.M_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 3 :
                            // Sql.g:4499:10: a3= 'G'
                            {
                            a3=(Token)match(input,79,FOLLOW_79_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4980); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_29_0_0_1, null, true);
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
            		addExpectedElement(null, 659, 660);
            	}

            // Sql.g:4520:2: ( ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0 >= 69 && LA50_0 <= 70)||LA50_0==95) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Sql.g:4521:3: ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) )
                    {
                    // Sql.g:4521:3: ( (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' ) )
                    // Sql.g:4522:4: (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' )
                    {
                    // Sql.g:4522:4: (a6= 'CHARACTERS' |a7= 'CODE_UNITS' |a8= 'OCTETS' )
                    int alt49=3;
                    switch ( input.LA(1) ) {
                    case 69:
                        {
                        alt49=1;
                        }
                        break;
                    case 70:
                        {
                        alt49=2;
                        }
                        break;
                    case 95:
                        {
                        alt49=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;

                    }

                    switch (alt49) {
                        case 1 :
                            // Sql.g:4523:5: a6= 'CHARACTERS'
                            {
                            a6=(Token)match(input,69,FOLLOW_69_in_parse_org_emftext_language_sql_datatype_LargeObjectLength5024); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_29_0_0_2, null, true);
                            					copyLocalizationInfos((CommonToken)a6, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharLengthUnits().getEEnumLiteral(org.emftext.language.sql.datatype.CharLengthUnits.CHARACTERS_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__UNITS), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Sql.g:4536:10: a7= 'CODE_UNITS'
                            {
                            a7=(Token)match(input,70,FOLLOW_70_in_parse_org_emftext_language_sql_datatype_LargeObjectLength5041); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_29_0_0_2, null, true);
                            					copyLocalizationInfos((CommonToken)a7, element);
                            					// set value of enumeration attribute
                            					Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharLengthUnits().getEEnumLiteral(org.emftext.language.sql.datatype.CharLengthUnits.CODE_UNITS_VALUE).getInstance();
                            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__UNITS), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 3 :
                            // Sql.g:4549:10: a8= 'OCTETS'
                            {
                            a8=(Token)match(input,95,FOLLOW_95_in_parse_org_emftext_language_sql_datatype_LargeObjectLength5058); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createLargeObjectLength();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_29_0_0_2, null, true);
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
            		addExpectedElement(null, 661);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, parse_org_emftext_language_sql_datatype_LargeObjectLength_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_LargeObjectLength"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_DateType"
    // Sql.g:4575:1: parse_org_emftext_language_sql_datatype_DateType returns [org.emftext.language.sql.datatype.DateType element = null] : a0= KEYWORD_DATE ;
    public final org.emftext.language.sql.datatype.DateType parse_org_emftext_language_sql_datatype_DateType() throws RecognitionException {
        org.emftext.language.sql.datatype.DateType element =  null;

        int parse_org_emftext_language_sql_datatype_DateType_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }

            // Sql.g:4578:2: (a0= KEYWORD_DATE )
            // Sql.g:4579:2: a0= KEYWORD_DATE
            {
            a0=(Token)match(input,KEYWORD_DATE,FOLLOW_KEYWORD_DATE_in_parse_org_emftext_language_sql_datatype_DateType5102); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDateType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_30_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 662);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 663, 668);
            		addExpectedElement(null, 669, 671);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, parse_org_emftext_language_sql_datatype_DateType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_DateType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_TimeType"
    // Sql.g:4600:1: parse_org_emftext_language_sql_datatype_TimeType returns [org.emftext.language.sql.datatype.TimeType element = null] : a0= KEYWORD_TIME ( (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' ) )? ( ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE ) )? ;
    public final org.emftext.language.sql.datatype.TimeType parse_org_emftext_language_sql_datatype_TimeType() throws RecognitionException {
        org.emftext.language.sql.datatype.TimeType element =  null;

        int parse_org_emftext_language_sql_datatype_TimeType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }

            // Sql.g:4603:2: (a0= KEYWORD_TIME ( (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' ) )? ( ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE ) )? )
            // Sql.g:4604:2: a0= KEYWORD_TIME ( (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' ) )? ( ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE ) )?
            {
            a0=(Token)match(input,KEYWORD_TIME,FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_datatype_TimeType5131); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 672, 674);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 675, 680);
            		addExpectedElement(null, 681, 683);
            	}

            // Sql.g:4620:2: ( (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==57) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // Sql.g:4621:3: (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' )
                    {
                    // Sql.g:4621:3: (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' )
                    // Sql.g:4622:4: a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')'
                    {
                    a1=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_datatype_TimeType5154); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 684);
                    			}

                    // Sql.g:4636:4: (a2= UNSIGNED_INTEGER )
                    // Sql.g:4637:5: a2= UNSIGNED_INTEGER
                    {
                    a2=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_TimeType5180); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
                    						startIncompleteElement(element);
                    					}
                    					if (a2 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__PRECISION), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
                    						}
                    						org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__PRECISION), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a2, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 685);
                    			}

                    a3=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_TimeType5213); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 686, 687);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 688, 693);
                    				addExpectedElement(null, 694, 696);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 697, 698);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 699, 704);
            		addExpectedElement(null, 705, 707);
            	}

            // Sql.g:4697:2: ( ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0 >= 102 && LA53_0 <= 103)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Sql.g:4698:3: ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE )
                    {
                    // Sql.g:4698:3: ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE )
                    // Sql.g:4699:4: ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE
                    {
                    // Sql.g:4699:4: ( (a4= 'WITH' |a5= 'WITHOUT' ) )
                    // Sql.g:4700:5: (a4= 'WITH' |a5= 'WITHOUT' )
                    {
                    // Sql.g:4700:5: (a4= 'WITH' |a5= 'WITHOUT' )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==102) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==103) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;

                    }
                    switch (alt52) {
                        case 1 :
                            // Sql.g:4701:6: a4= 'WITH'
                            {
                            a4=(Token)match(input,102,FOLLOW_102_in_parse_org_emftext_language_sql_datatype_TimeType5268); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_2_0_0_0, true, true);
                            						copyLocalizationInfos((CommonToken)a4, element);
                            						// set value of boolean attribute
                            						Object value = true;
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__WITH_TIME_ZONE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 2 :
                            // Sql.g:4714:12: a5= 'WITHOUT'
                            {
                            a5=(Token)match(input,103,FOLLOW_103_in_parse_org_emftext_language_sql_datatype_TimeType5287); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_2_0_0_0, false, true);
                            						copyLocalizationInfos((CommonToken)a5, element);
                            						// set value of boolean attribute
                            						Object value = false;
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__WITH_TIME_ZONE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;

                    }


                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 708);
                    			}

                    a7=(Token)match(input,KEYWORD_TIME,FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_datatype_TimeType5318); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 709);
                    			}

                    a8=(Token)match(input,KEYWORD_ZONE,FOLLOW_KEYWORD_ZONE_in_parse_org_emftext_language_sql_datatype_TimeType5338); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_2_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 710);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 711, 716);
                    				addExpectedElement(null, 717, 719);
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
            		addExpectedElement(null, 720);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 721, 726);
            		addExpectedElement(null, 727, 729);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, parse_org_emftext_language_sql_datatype_TimeType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_TimeType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_TimestampType"
    // Sql.g:4781:1: parse_org_emftext_language_sql_datatype_TimestampType returns [org.emftext.language.sql.datatype.TimestampType element = null] : a0= KEYWORD_TIMESTAMP ( (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' ) )? ( ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE ) )? ;
    public final org.emftext.language.sql.datatype.TimestampType parse_org_emftext_language_sql_datatype_TimestampType() throws RecognitionException {
        org.emftext.language.sql.datatype.TimestampType element =  null;

        int parse_org_emftext_language_sql_datatype_TimestampType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }

            // Sql.g:4784:2: (a0= KEYWORD_TIMESTAMP ( (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' ) )? ( ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE ) )? )
            // Sql.g:4785:2: a0= KEYWORD_TIMESTAMP ( (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' ) )? ( ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE ) )?
            {
            a0=(Token)match(input,KEYWORD_TIMESTAMP,FOLLOW_KEYWORD_TIMESTAMP_in_parse_org_emftext_language_sql_datatype_TimestampType5386); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 730, 732);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 733, 738);
            		addExpectedElement(null, 739, 741);
            	}

            // Sql.g:4801:2: ( (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==57) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Sql.g:4802:3: (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' )
                    {
                    // Sql.g:4802:3: (a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')' )
                    // Sql.g:4803:4: a1= '(' (a2= UNSIGNED_INTEGER ) a3= ')'
                    {
                    a1=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_datatype_TimestampType5409); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 742);
                    			}

                    // Sql.g:4817:4: (a2= UNSIGNED_INTEGER )
                    // Sql.g:4818:5: a2= UNSIGNED_INTEGER
                    {
                    a2=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_TimestampType5435); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
                    						startIncompleteElement(element);
                    					}
                    					if (a2 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__PRECISION), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
                    						}
                    						org.emftext.language.sql.UnsignedInteger resolved = (org.emftext.language.sql.UnsignedInteger) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__PRECISION), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a2, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 743);
                    			}

                    a3=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_datatype_TimestampType5468); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 744, 745);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 746, 751);
                    				addExpectedElement(null, 752, 754);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 755, 756);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 757, 762);
            		addExpectedElement(null, 763, 765);
            	}

            // Sql.g:4878:2: ( ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0 >= 102 && LA56_0 <= 103)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // Sql.g:4879:3: ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE )
                    {
                    // Sql.g:4879:3: ( ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE )
                    // Sql.g:4880:4: ( (a4= 'WITH' |a5= 'WITHOUT' ) ) a7= KEYWORD_TIME a8= KEYWORD_ZONE
                    {
                    // Sql.g:4880:4: ( (a4= 'WITH' |a5= 'WITHOUT' ) )
                    // Sql.g:4881:5: (a4= 'WITH' |a5= 'WITHOUT' )
                    {
                    // Sql.g:4881:5: (a4= 'WITH' |a5= 'WITHOUT' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==102) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==103) ) {
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
                            // Sql.g:4882:6: a4= 'WITH'
                            {
                            a4=(Token)match(input,102,FOLLOW_102_in_parse_org_emftext_language_sql_datatype_TimestampType5523); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_2_0_0_0, true, true);
                            						copyLocalizationInfos((CommonToken)a4, element);
                            						// set value of boolean attribute
                            						Object value = true;
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;
                        case 2 :
                            // Sql.g:4895:12: a5= 'WITHOUT'
                            {
                            a5=(Token)match(input,103,FOLLOW_103_in_parse_org_emftext_language_sql_datatype_TimestampType5542); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            						if (element == null) {
                            							element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
                            							startIncompleteElement(element);
                            						}
                            						collectHiddenTokens(element);
                            						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_2_0_0_0, false, true);
                            						copyLocalizationInfos((CommonToken)a5, element);
                            						// set value of boolean attribute
                            						Object value = false;
                            						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE), value);
                            						completedElement(value, false);
                            					}

                            }
                            break;

                    }


                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 766);
                    			}

                    a7=(Token)match(input,KEYWORD_TIME,FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_datatype_TimestampType5573); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_2_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 767);
                    			}

                    a8=(Token)match(input,KEYWORD_ZONE,FOLLOW_KEYWORD_ZONE_in_parse_org_emftext_language_sql_datatype_TimestampType5593); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_2_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(null, 768);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 769, 774);
                    				addExpectedElement(null, 775, 777);
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
            		addExpectedElement(null, 778);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 779, 784);
            		addExpectedElement(null, 785, 787);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, parse_org_emftext_language_sql_datatype_TimestampType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_TimestampType"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_BooleanType"
    // Sql.g:4962:1: parse_org_emftext_language_sql_datatype_BooleanType returns [org.emftext.language.sql.datatype.BooleanType element = null] : a0= KEYWORD_BOOLEAN ;
    public final org.emftext.language.sql.datatype.BooleanType parse_org_emftext_language_sql_datatype_BooleanType() throws RecognitionException {
        org.emftext.language.sql.datatype.BooleanType element =  null;

        int parse_org_emftext_language_sql_datatype_BooleanType_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }

            // Sql.g:4965:2: (a0= KEYWORD_BOOLEAN )
            // Sql.g:4966:2: a0= KEYWORD_BOOLEAN
            {
            a0=(Token)match(input,KEYWORD_BOOLEAN,FOLLOW_KEYWORD_BOOLEAN_in_parse_org_emftext_language_sql_datatype_BooleanType5641); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBooleanType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_33_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 788);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 789, 794);
            		addExpectedElement(null, 795, 797);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, parse_org_emftext_language_sql_datatype_BooleanType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_BooleanType"



    // $ANTLR start "parse_org_emftext_language_sql_function_DatetimeValueFunction"
    // Sql.g:4987:1: parse_org_emftext_language_sql_function_DatetimeValueFunction returns [org.emftext.language.sql.function.DatetimeValueFunction element = null] : ( (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' ) ) ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }

            // Sql.g:4990:2: ( ( (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' ) ) ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )? )
            // Sql.g:4991:2: ( (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' ) ) ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )?
            {
            // Sql.g:4991:2: ( (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' ) )
            // Sql.g:4992:3: (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' )
            {
            // Sql.g:4992:3: (a0= 'CURRENT_DATE' |a1= 'CURRENT_TIME' |a2= 'LOCALTIME' |a3= 'CURRENT_TIMESTAMP' |a4= 'LOCALTIMESTAMP' )
            int alt57=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt57=1;
                }
                break;
            case 72:
                {
                alt57=2;
                }
                break;
            case 85:
                {
                alt57=3;
                }
                break;
            case 73:
                {
                alt57=4;
                }
                break;
            case 86:
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
                    // Sql.g:4993:4: a0= 'CURRENT_DATE'
                    {
                    a0=(Token)match(input,71,FOLLOW_71_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5679); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunctionKind().getEEnumLiteral(org.emftext.language.sql.function.DatetimeValueFunctionKind.CURRENT_DATE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Sql.g:5006:8: a1= 'CURRENT_TIME'
                    {
                    a1=(Token)match(input,72,FOLLOW_72_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5694); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunctionKind().getEEnumLiteral(org.emftext.language.sql.function.DatetimeValueFunctionKind.CURRENT_TIME_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Sql.g:5019:8: a2= 'LOCALTIME'
                    {
                    a2=(Token)match(input,85,FOLLOW_85_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5709); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunctionKind().getEEnumLiteral(org.emftext.language.sql.function.DatetimeValueFunctionKind.LOCALTIME_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Sql.g:5032:8: a3= 'CURRENT_TIMESTAMP'
                    {
                    a3=(Token)match(input,73,FOLLOW_73_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5724); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a3, element);
                    				// set value of enumeration attribute
                    				Object value = org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunctionKind().getEEnumLiteral(org.emftext.language.sql.function.DatetimeValueFunctionKind.CURRENT_TIMESTAMP_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Sql.g:5045:8: a4= 'LOCALTIMESTAMP'
                    {
                    a4=(Token)match(input,86,FOLLOW_86_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5739); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_0, null, true);
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
            		addExpectedElement(null, 798);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 799, 804);
            		addExpectedElement(null, 805, 807);
            	}

            // Sql.g:5067:2: ( (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==57) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // Sql.g:5068:3: (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' )
                    {
                    // Sql.g:5068:3: (a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')' )
                    // Sql.g:5069:4: a7= '(' (a8= UNSIGNED_INTEGER ) a9= ')'
                    {
                    a7=(Token)match(input,57,FOLLOW_57_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5769); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_1_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 808);
                    			}

                    // Sql.g:5083:4: (a8= UNSIGNED_INTEGER )
                    // Sql.g:5084:5: a8= UNSIGNED_INTEGER
                    {
                    a8=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5795); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.emftext.language.sql.resource.sql.mopp.SqlTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    						startIncompleteElement(element);
                    					}
                    					if (a8 != null) {
                    						org.emftext.language.sql.resource.sql.ISqlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
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
                    						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_1_0_0_1, resolved, true);
                    						copyLocalizationInfos((CommonToken) a8, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 809);
                    			}

                    a9=(Token)match(input,58,FOLLOW_58_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5828); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_1_0_0_2, null, true);
                    				copyLocalizationInfos((CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				// We've found the last token for this rule. The constructed EObject is now
                    				// complete.
                    				completedElement(element, true);
                    				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 810, 815);
                    				addExpectedElement(null, 816, 818);
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
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 819, 824);
            		addExpectedElement(null, 825, 827);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, parse_org_emftext_language_sql_function_DatetimeValueFunction_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_function_DatetimeValueFunction"



    // $ANTLR start "parse_org_emftext_language_sql_expression_NullSpecification"
    // Sql.g:5150:1: parse_org_emftext_language_sql_expression_NullSpecification returns [org.emftext.language.sql.expression.NullSpecification element = null] : a0= KEYWORD_NULL ;
    public final org.emftext.language.sql.expression.NullSpecification parse_org_emftext_language_sql_expression_NullSpecification() throws RecognitionException {
        org.emftext.language.sql.expression.NullSpecification element =  null;

        int parse_org_emftext_language_sql_expression_NullSpecification_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return element; }

            // Sql.g:5153:2: (a0= KEYWORD_NULL )
            // Sql.g:5154:2: a0= KEYWORD_NULL
            {
            a0=(Token)match(input,KEYWORD_NULL,FOLLOW_KEYWORD_NULL_in_parse_org_emftext_language_sql_expression_NullSpecification5876); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.emftext.language.sql.expression.ExpressionFactory.eINSTANCE.createNullSpecification();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_35_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 828, 833);
            		addExpectedElement(null, 834, 836);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, parse_org_emftext_language_sql_expression_NullSpecification_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_expression_NullSpecification"



    // $ANTLR start "parse_org_emftext_language_sql_common_Statement"
    // Sql.g:5174:1: parse_org_emftext_language_sql_common_Statement returns [org.emftext.language.sql.common.Statement element = null] : (c0= parse_org_emftext_language_sql_common_SimpleComment |c1= parse_org_emftext_language_sql_common_BracketedComment |c2= parse_org_emftext_language_sql_schema_TableDefinition );
    public final org.emftext.language.sql.common.Statement parse_org_emftext_language_sql_common_Statement() throws RecognitionException {
        org.emftext.language.sql.common.Statement element =  null;

        int parse_org_emftext_language_sql_common_Statement_StartIndex = input.index();

        org.emftext.language.sql.common.SimpleComment c0 =null;

        org.emftext.language.sql.common.BracketedComment c1 =null;

        org.emftext.language.sql.schema.TableDefinition c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return element; }

            // Sql.g:5175:2: (c0= parse_org_emftext_language_sql_common_SimpleComment |c1= parse_org_emftext_language_sql_common_BracketedComment |c2= parse_org_emftext_language_sql_schema_TableDefinition )
            int alt59=3;
            switch ( input.LA(1) ) {
            case SIMPLE_COMMENT:
                {
                alt59=1;
                }
                break;
            case BRACKETED_COMMENT:
                {
                alt59=2;
                }
                break;
            case KEYWORD_CREATE:
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
                    // Sql.g:5176:2: c0= parse_org_emftext_language_sql_common_SimpleComment
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SimpleComment_in_parse_org_emftext_language_sql_common_Statement5901);
                    c0=parse_org_emftext_language_sql_common_SimpleComment();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:5177:4: c1= parse_org_emftext_language_sql_common_BracketedComment
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_BracketedComment_in_parse_org_emftext_language_sql_common_Statement5911);
                    c1=parse_org_emftext_language_sql_common_BracketedComment();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:5178:4: c2= parse_org_emftext_language_sql_schema_TableDefinition
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableDefinition_in_parse_org_emftext_language_sql_common_Statement5921);
                    c2=parse_org_emftext_language_sql_schema_TableDefinition();

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
            if ( state.backtracking>0 ) { memoize(input, 38, parse_org_emftext_language_sql_common_Statement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_common_Statement"



    // $ANTLR start "parse_org_emftext_language_sql_common_Separator"
    // Sql.g:5182:1: parse_org_emftext_language_sql_common_Separator returns [org.emftext.language.sql.common.Separator element = null] : (c0= parse_org_emftext_language_sql_common_SimpleComment |c1= parse_org_emftext_language_sql_common_BracketedComment );
    public final org.emftext.language.sql.common.Separator parse_org_emftext_language_sql_common_Separator() throws RecognitionException {
        org.emftext.language.sql.common.Separator element =  null;

        int parse_org_emftext_language_sql_common_Separator_StartIndex = input.index();

        org.emftext.language.sql.common.SimpleComment c0 =null;

        org.emftext.language.sql.common.BracketedComment c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return element; }

            // Sql.g:5183:2: (c0= parse_org_emftext_language_sql_common_SimpleComment |c1= parse_org_emftext_language_sql_common_BracketedComment )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==SIMPLE_COMMENT) ) {
                alt60=1;
            }
            else if ( (LA60_0==BRACKETED_COMMENT) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // Sql.g:5184:2: c0= parse_org_emftext_language_sql_common_SimpleComment
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SimpleComment_in_parse_org_emftext_language_sql_common_Separator5942);
                    c0=parse_org_emftext_language_sql_common_SimpleComment();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:5185:4: c1= parse_org_emftext_language_sql_common_BracketedComment
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_common_BracketedComment_in_parse_org_emftext_language_sql_common_Separator5952);
                    c1=parse_org_emftext_language_sql_common_BracketedComment();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 39, parse_org_emftext_language_sql_common_Separator_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_common_Separator"



    // $ANTLR start "parse_org_emftext_language_sql_schema_TableContentsSource"
    // Sql.g:5189:1: parse_org_emftext_language_sql_schema_TableContentsSource returns [org.emftext.language.sql.schema.TableContentsSource element = null] : c0= parse_org_emftext_language_sql_schema_TableElementList ;
    public final org.emftext.language.sql.schema.TableContentsSource parse_org_emftext_language_sql_schema_TableContentsSource() throws RecognitionException {
        org.emftext.language.sql.schema.TableContentsSource element =  null;

        int parse_org_emftext_language_sql_schema_TableContentsSource_StartIndex = input.index();

        org.emftext.language.sql.schema.TableElementList c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return element; }

            // Sql.g:5190:2: (c0= parse_org_emftext_language_sql_schema_TableElementList )
            // Sql.g:5191:2: c0= parse_org_emftext_language_sql_schema_TableElementList
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_TableElementList_in_parse_org_emftext_language_sql_schema_TableContentsSource5973);
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
            if ( state.backtracking>0 ) { memoize(input, 40, parse_org_emftext_language_sql_schema_TableContentsSource_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_TableContentsSource"



    // $ANTLR start "parse_org_emftext_language_sql_schema_TableElement"
    // Sql.g:5195:1: parse_org_emftext_language_sql_schema_TableElement returns [org.emftext.language.sql.schema.TableElement element = null] : (c0= parse_org_emftext_language_sql_schema_Column |c1= parse_org_emftext_language_sql_schema_UniqueTableConstraint |c2= parse_org_emftext_language_sql_schema_ReferentialTableConstraint );
    public final org.emftext.language.sql.schema.TableElement parse_org_emftext_language_sql_schema_TableElement() throws RecognitionException {
        org.emftext.language.sql.schema.TableElement element =  null;

        int parse_org_emftext_language_sql_schema_TableElement_StartIndex = input.index();

        org.emftext.language.sql.schema.Column c0 =null;

        org.emftext.language.sql.schema.UniqueTableConstraint c1 =null;

        org.emftext.language.sql.schema.ReferentialTableConstraint c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return element; }

            // Sql.g:5196:2: (c0= parse_org_emftext_language_sql_schema_Column |c1= parse_org_emftext_language_sql_schema_UniqueTableConstraint |c2= parse_org_emftext_language_sql_schema_ReferentialTableConstraint )
            int alt61=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt61=1;
                }
                break;
            case KEYWORD_CONSTRAINT:
                {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==IDENTIFIER) ) {
                    switch ( input.LA(3) ) {
                    case 60:
                        {
                        int LA61_6 = input.LA(4);

                        if ( (LA61_6==IDENTIFIER) ) {
                            switch ( input.LA(5) ) {
                            case 60:
                                {
                                int LA61_8 = input.LA(6);

                                if ( (LA61_8==IDENTIFIER) ) {
                                    int LA61_9 = input.LA(7);

                                    if ( (LA61_9==96||LA61_9==100) ) {
                                        alt61=2;
                                    }
                                    else if ( (LA61_9==KEYWORD_FOREIGN) ) {
                                        alt61=3;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return element;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 61, 9, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 61, 8, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case 96:
                            case 100:
                                {
                                alt61=2;
                                }
                                break;
                            case KEYWORD_FOREIGN:
                                {
                                alt61=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 61, 7, input);

                                throw nvae;

                            }

                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 61, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 96:
                    case 100:
                        {
                        alt61=2;
                        }
                        break;
                    case KEYWORD_FOREIGN:
                        {
                        alt61=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 5, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;

                }
                }
                break;
            case 96:
            case 100:
                {
                alt61=2;
                }
                break;
            case KEYWORD_FOREIGN:
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
                    // Sql.g:5197:2: c0= parse_org_emftext_language_sql_schema_Column
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_Column_in_parse_org_emftext_language_sql_schema_TableElement5994);
                    c0=parse_org_emftext_language_sql_schema_Column();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:5198:4: c1= parse_org_emftext_language_sql_schema_UniqueTableConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_UniqueTableConstraint_in_parse_org_emftext_language_sql_schema_TableElement6004);
                    c1=parse_org_emftext_language_sql_schema_UniqueTableConstraint();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:5199:4: c2= parse_org_emftext_language_sql_schema_ReferentialTableConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_ReferentialTableConstraint_in_parse_org_emftext_language_sql_schema_TableElement6014);
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
            if ( state.backtracking>0 ) { memoize(input, 41, parse_org_emftext_language_sql_schema_TableElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_TableElement"



    // $ANTLR start "parse_org_emftext_language_sql_datatype_DataType"
    // Sql.g:5203:1: parse_org_emftext_language_sql_datatype_DataType returns [org.emftext.language.sql.datatype.DataType element = null] : (c0= parse_org_emftext_language_sql_datatype_ExactNumericType |c1= parse_org_emftext_language_sql_datatype_ApproximateNumericType |c2= parse_org_emftext_language_sql_datatype_CharacterStringType |c3= parse_org_emftext_language_sql_datatype_NationalCharacterStringType |c4= parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType |c5= parse_org_emftext_language_sql_datatype_DateType |c6= parse_org_emftext_language_sql_datatype_TimeType |c7= parse_org_emftext_language_sql_datatype_TimestampType |c8= parse_org_emftext_language_sql_datatype_BooleanType );
    public final org.emftext.language.sql.datatype.DataType parse_org_emftext_language_sql_datatype_DataType() throws RecognitionException {
        org.emftext.language.sql.datatype.DataType element =  null;

        int parse_org_emftext_language_sql_datatype_DataType_StartIndex = input.index();

        org.emftext.language.sql.datatype.ExactNumericType c0 =null;

        org.emftext.language.sql.datatype.ApproximateNumericType c1 =null;

        org.emftext.language.sql.datatype.CharacterStringType c2 =null;

        org.emftext.language.sql.datatype.NationalCharacterStringType c3 =null;

        org.emftext.language.sql.datatype.BinaryLargeObjectStringType c4 =null;

        org.emftext.language.sql.datatype.DateType c5 =null;

        org.emftext.language.sql.datatype.TimeType c6 =null;

        org.emftext.language.sql.datatype.TimestampType c7 =null;

        org.emftext.language.sql.datatype.BooleanType c8 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return element; }

            // Sql.g:5204:2: (c0= parse_org_emftext_language_sql_datatype_ExactNumericType |c1= parse_org_emftext_language_sql_datatype_ApproximateNumericType |c2= parse_org_emftext_language_sql_datatype_CharacterStringType |c3= parse_org_emftext_language_sql_datatype_NationalCharacterStringType |c4= parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType |c5= parse_org_emftext_language_sql_datatype_DateType |c6= parse_org_emftext_language_sql_datatype_TimeType |c7= parse_org_emftext_language_sql_datatype_TimestampType |c8= parse_org_emftext_language_sql_datatype_BooleanType )
            int alt62=9;
            switch ( input.LA(1) ) {
            case 62:
            case 74:
            case 75:
            case 81:
            case 82:
            case 94:
            case 98:
                {
                alt62=1;
                }
                break;
            case 76:
            case 78:
            case 97:
                {
                alt62=2;
                }
                break;
            case 65:
            case 66:
            case 67:
            case 68:
            case 101:
                {
                alt62=3;
                }
                break;
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
                {
                alt62=4;
                }
                break;
            case 63:
            case 64:
                {
                alt62=5;
                }
                break;
            case KEYWORD_DATE:
                {
                alt62=6;
                }
                break;
            case KEYWORD_TIME:
                {
                alt62=7;
                }
                break;
            case KEYWORD_TIMESTAMP:
                {
                alt62=8;
                }
                break;
            case KEYWORD_BOOLEAN:
                {
                alt62=9;
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
                    // Sql.g:5205:2: c0= parse_org_emftext_language_sql_datatype_ExactNumericType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_ExactNumericType_in_parse_org_emftext_language_sql_datatype_DataType6035);
                    c0=parse_org_emftext_language_sql_datatype_ExactNumericType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:5206:4: c1= parse_org_emftext_language_sql_datatype_ApproximateNumericType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_ApproximateNumericType_in_parse_org_emftext_language_sql_datatype_DataType6045);
                    c1=parse_org_emftext_language_sql_datatype_ApproximateNumericType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:5207:4: c2= parse_org_emftext_language_sql_datatype_CharacterStringType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_CharacterStringType_in_parse_org_emftext_language_sql_datatype_DataType6055);
                    c2=parse_org_emftext_language_sql_datatype_CharacterStringType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Sql.g:5208:4: c3= parse_org_emftext_language_sql_datatype_NationalCharacterStringType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_NationalCharacterStringType_in_parse_org_emftext_language_sql_datatype_DataType6065);
                    c3=parse_org_emftext_language_sql_datatype_NationalCharacterStringType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Sql.g:5209:4: c4= parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_in_parse_org_emftext_language_sql_datatype_DataType6075);
                    c4=parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // Sql.g:5210:4: c5= parse_org_emftext_language_sql_datatype_DateType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_DateType_in_parse_org_emftext_language_sql_datatype_DataType6085);
                    c5=parse_org_emftext_language_sql_datatype_DateType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // Sql.g:5211:4: c6= parse_org_emftext_language_sql_datatype_TimeType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_TimeType_in_parse_org_emftext_language_sql_datatype_DataType6095);
                    c6=parse_org_emftext_language_sql_datatype_TimeType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 8 :
                    // Sql.g:5212:4: c7= parse_org_emftext_language_sql_datatype_TimestampType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_TimestampType_in_parse_org_emftext_language_sql_datatype_DataType6105);
                    c7=parse_org_emftext_language_sql_datatype_TimestampType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c7; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 9 :
                    // Sql.g:5213:4: c8= parse_org_emftext_language_sql_datatype_BooleanType
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_datatype_BooleanType_in_parse_org_emftext_language_sql_datatype_DataType6115);
                    c8=parse_org_emftext_language_sql_datatype_BooleanType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c8; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 42, parse_org_emftext_language_sql_datatype_DataType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_datatype_DataType"



    // $ANTLR start "parse_org_emftext_language_sql_schema_DefaultOption"
    // Sql.g:5217:1: parse_org_emftext_language_sql_schema_DefaultOption returns [org.emftext.language.sql.schema.DefaultOption element = null] : (c0= parse_org_emftext_language_sql_schema_LiteralDefaultOption |c1= parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption |c2= parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption );
    public final org.emftext.language.sql.schema.DefaultOption parse_org_emftext_language_sql_schema_DefaultOption() throws RecognitionException {
        org.emftext.language.sql.schema.DefaultOption element =  null;

        int parse_org_emftext_language_sql_schema_DefaultOption_StartIndex = input.index();

        org.emftext.language.sql.schema.LiteralDefaultOption c0 =null;

        org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption c1 =null;

        org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return element; }

            // Sql.g:5218:2: (c0= parse_org_emftext_language_sql_schema_LiteralDefaultOption |c1= parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption |c2= parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption )
            int alt63=3;
            switch ( input.LA(1) ) {
            case EOF:
            case APPROXIMATE_NUMERIC_LITERAL:
            case EXACT_NUMERIC_LITERAL:
            case KEYWORD_COLLATE:
            case KEYWORD_CONSTRAINT:
            case KEYWORD_DATE:
            case KEYWORD_N:
            case KEYWORD_NOT:
            case KEYWORD_REFERENCES:
            case KEYWORD_TIME:
            case KEYWORD_TIMESTAMP:
            case QUOTED_STRING:
            case UNSIGNED_INTEGER:
            case 58:
            case 59:
            case 77:
            case 96:
            case 99:
            case 100:
            case 104:
                {
                alt63=1;
                }
                break;
            case 71:
            case 72:
            case 73:
            case 85:
            case 86:
                {
                alt63=2;
                }
                break;
            case KEYWORD_NULL:
                {
                alt63=3;
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
                    // Sql.g:5219:2: c0= parse_org_emftext_language_sql_schema_LiteralDefaultOption
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_LiteralDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption6136);
                    c0=parse_org_emftext_language_sql_schema_LiteralDefaultOption();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:5220:4: c1= parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption6146);
                    c1=parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:5221:4: c2= parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption6156);
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
            if ( state.backtracking>0 ) { memoize(input, 43, parse_org_emftext_language_sql_schema_DefaultOption_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_DefaultOption"



    // $ANTLR start "parse_org_emftext_language_sql_schema_ColumnConstraint"
    // Sql.g:5225:1: parse_org_emftext_language_sql_schema_ColumnConstraint returns [org.emftext.language.sql.schema.ColumnConstraint element = null] : (c0= parse_org_emftext_language_sql_schema_NotNullColumnConstraint |c1= parse_org_emftext_language_sql_schema_UniqueColumnConstraint |c2= parse_org_emftext_language_sql_schema_ReferentialColumnConstraint );
    public final org.emftext.language.sql.schema.ColumnConstraint parse_org_emftext_language_sql_schema_ColumnConstraint() throws RecognitionException {
        org.emftext.language.sql.schema.ColumnConstraint element =  null;

        int parse_org_emftext_language_sql_schema_ColumnConstraint_StartIndex = input.index();

        org.emftext.language.sql.schema.NotNullColumnConstraint c0 =null;

        org.emftext.language.sql.schema.UniqueColumnConstraint c1 =null;

        org.emftext.language.sql.schema.ReferentialColumnConstraint c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return element; }

            // Sql.g:5226:2: (c0= parse_org_emftext_language_sql_schema_NotNullColumnConstraint |c1= parse_org_emftext_language_sql_schema_UniqueColumnConstraint |c2= parse_org_emftext_language_sql_schema_ReferentialColumnConstraint )
            int alt64=3;
            switch ( input.LA(1) ) {
            case KEYWORD_CONSTRAINT:
                {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==IDENTIFIER) ) {
                    switch ( input.LA(3) ) {
                    case 60:
                        {
                        int LA64_6 = input.LA(4);

                        if ( (LA64_6==IDENTIFIER) ) {
                            switch ( input.LA(5) ) {
                            case 60:
                                {
                                int LA64_8 = input.LA(6);

                                if ( (LA64_8==IDENTIFIER) ) {
                                    switch ( input.LA(7) ) {
                                    case KEYWORD_NOT:
                                        {
                                        alt64=1;
                                        }
                                        break;
                                    case 96:
                                    case 100:
                                        {
                                        alt64=2;
                                        }
                                        break;
                                    case KEYWORD_REFERENCES:
                                        {
                                        alt64=3;
                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return element;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 64, 9, input);

                                        throw nvae;

                                    }

                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 64, 8, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case KEYWORD_NOT:
                                {
                                alt64=1;
                                }
                                break;
                            case 96:
                            case 100:
                                {
                                alt64=2;
                                }
                                break;
                            case KEYWORD_REFERENCES:
                                {
                                alt64=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 7, input);

                                throw nvae;

                            }

                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 64, 6, input);

                            throw nvae;

                        }
                        }
                        break;
                    case KEYWORD_NOT:
                        {
                        alt64=1;
                        }
                        break;
                    case 96:
                    case 100:
                        {
                        alt64=2;
                        }
                        break;
                    case KEYWORD_REFERENCES:
                        {
                        alt64=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 5, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;

                }
                }
                break;
            case KEYWORD_NOT:
                {
                alt64=1;
                }
                break;
            case 96:
            case 100:
                {
                alt64=2;
                }
                break;
            case KEYWORD_REFERENCES:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // Sql.g:5227:2: c0= parse_org_emftext_language_sql_schema_NotNullColumnConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_NotNullColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint6177);
                    c0=parse_org_emftext_language_sql_schema_NotNullColumnConstraint();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:5228:4: c1= parse_org_emftext_language_sql_schema_UniqueColumnConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_UniqueColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint6187);
                    c1=parse_org_emftext_language_sql_schema_UniqueColumnConstraint();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:5229:4: c2= parse_org_emftext_language_sql_schema_ReferentialColumnConstraint
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint6197);
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
            if ( state.backtracking>0 ) { memoize(input, 44, parse_org_emftext_language_sql_schema_ColumnConstraint_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_schema_ColumnConstraint"



    // $ANTLR start "parse_org_emftext_language_sql_literal_Literal"
    // Sql.g:5233:1: parse_org_emftext_language_sql_literal_Literal returns [org.emftext.language.sql.literal.Literal element = null] : (c0= parse_org_emftext_language_sql_literal_ExactNumericLiteral |c1= parse_org_emftext_language_sql_literal_ApproximateNumericLiteral |c2= parse_org_emftext_language_sql_literal_CharacterStringLiteral |c3= parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral |c4= parse_org_emftext_language_sql_literal_DateLiteral |c5= parse_org_emftext_language_sql_literal_TimeLiteral |c6= parse_org_emftext_language_sql_literal_TimestampLiteral |c7= parse_org_emftext_language_sql_literal_BooleanLiteral );
    public final org.emftext.language.sql.literal.Literal parse_org_emftext_language_sql_literal_Literal() throws RecognitionException {
        org.emftext.language.sql.literal.Literal element =  null;

        int parse_org_emftext_language_sql_literal_Literal_StartIndex = input.index();

        org.emftext.language.sql.literal.ExactNumericLiteral c0 =null;

        org.emftext.language.sql.literal.ApproximateNumericLiteral c1 =null;

        org.emftext.language.sql.literal.CharacterStringLiteral c2 =null;

        org.emftext.language.sql.literal.NationalCharacterStringLiteral c3 =null;

        org.emftext.language.sql.literal.DateLiteral c4 =null;

        org.emftext.language.sql.literal.TimeLiteral c5 =null;

        org.emftext.language.sql.literal.TimestampLiteral c6 =null;

        org.emftext.language.sql.literal.BooleanLiteral c7 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return element; }

            // Sql.g:5234:2: (c0= parse_org_emftext_language_sql_literal_ExactNumericLiteral |c1= parse_org_emftext_language_sql_literal_ApproximateNumericLiteral |c2= parse_org_emftext_language_sql_literal_CharacterStringLiteral |c3= parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral |c4= parse_org_emftext_language_sql_literal_DateLiteral |c5= parse_org_emftext_language_sql_literal_TimeLiteral |c6= parse_org_emftext_language_sql_literal_TimestampLiteral |c7= parse_org_emftext_language_sql_literal_BooleanLiteral )
            int alt65=8;
            switch ( input.LA(1) ) {
            case EXACT_NUMERIC_LITERAL:
            case UNSIGNED_INTEGER:
                {
                alt65=1;
                }
                break;
            case APPROXIMATE_NUMERIC_LITERAL:
                {
                alt65=2;
                }
                break;
            case 104:
                {
                int LA65_3 = input.LA(2);

                if ( (LA65_3==IDENTIFIER) ) {
                    int LA65_10 = input.LA(3);

                    if ( (LA65_10==60) ) {
                        int LA65_12 = input.LA(4);

                        if ( (LA65_12==IDENTIFIER) ) {
                            int LA65_13 = input.LA(5);

                            if ( (LA65_13==60) ) {
                                int LA65_14 = input.LA(6);

                                if ( (LA65_14==IDENTIFIER) ) {
                                    int LA65_15 = input.LA(7);

                                    if ( (LA65_15==QUOTED_STRING) ) {
                                        int LA65_4 = input.LA(8);

                                        if ( (synpred96_Sql()) ) {
                                            alt65=3;
                                        }
                                        else if ( (synpred97_Sql()) ) {
                                            alt65=4;
                                        }
                                        else {
                                            if (state.backtracking>0) {state.failed=true; return element;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 65, 4, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return element;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 65, 15, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 65, 14, input);

                                    throw nvae;

                                }
                            }
                            else if ( (LA65_13==QUOTED_STRING) ) {
                                int LA65_4 = input.LA(6);

                                if ( (synpred96_Sql()) ) {
                                    alt65=3;
                                }
                                else if ( (synpred97_Sql()) ) {
                                    alt65=4;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return element;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 65, 4, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return element;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 65, 13, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 12, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA65_10==QUOTED_STRING) ) {
                        int LA65_4 = input.LA(4);

                        if ( (synpred96_Sql()) ) {
                            alt65=3;
                        }
                        else if ( (synpred97_Sql()) ) {
                            alt65=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 10, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 3, input);

                    throw nvae;

                }
                }
                break;
            case QUOTED_STRING:
                {
                int LA65_4 = input.LA(2);

                if ( (synpred96_Sql()) ) {
                    alt65=3;
                }
                else if ( (synpred97_Sql()) ) {
                    alt65=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 4, input);

                    throw nvae;

                }
                }
                break;
            case KEYWORD_N:
                {
                alt65=4;
                }
                break;
            case KEYWORD_DATE:
                {
                alt65=5;
                }
                break;
            case KEYWORD_TIME:
                {
                alt65=6;
                }
                break;
            case KEYWORD_TIMESTAMP:
                {
                alt65=7;
                }
                break;
            case EOF:
            case KEYWORD_COLLATE:
            case KEYWORD_CONSTRAINT:
            case KEYWORD_NOT:
            case KEYWORD_REFERENCES:
            case 58:
            case 59:
            case 77:
            case 96:
            case 99:
            case 100:
                {
                alt65=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }

            switch (alt65) {
                case 1 :
                    // Sql.g:5235:2: c0= parse_org_emftext_language_sql_literal_ExactNumericLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_ExactNumericLiteral_in_parse_org_emftext_language_sql_literal_Literal6218);
                    c0=parse_org_emftext_language_sql_literal_ExactNumericLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Sql.g:5236:4: c1= parse_org_emftext_language_sql_literal_ApproximateNumericLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_ApproximateNumericLiteral_in_parse_org_emftext_language_sql_literal_Literal6228);
                    c1=parse_org_emftext_language_sql_literal_ApproximateNumericLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Sql.g:5237:4: c2= parse_org_emftext_language_sql_literal_CharacterStringLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_CharacterStringLiteral_in_parse_org_emftext_language_sql_literal_Literal6238);
                    c2=parse_org_emftext_language_sql_literal_CharacterStringLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Sql.g:5238:4: c3= parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral_in_parse_org_emftext_language_sql_literal_Literal6248);
                    c3=parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Sql.g:5239:4: c4= parse_org_emftext_language_sql_literal_DateLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_DateLiteral_in_parse_org_emftext_language_sql_literal_Literal6258);
                    c4=parse_org_emftext_language_sql_literal_DateLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // Sql.g:5240:4: c5= parse_org_emftext_language_sql_literal_TimeLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_TimeLiteral_in_parse_org_emftext_language_sql_literal_Literal6268);
                    c5=parse_org_emftext_language_sql_literal_TimeLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // Sql.g:5241:4: c6= parse_org_emftext_language_sql_literal_TimestampLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_TimestampLiteral_in_parse_org_emftext_language_sql_literal_Literal6278);
                    c6=parse_org_emftext_language_sql_literal_TimestampLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 8 :
                    // Sql.g:5242:4: c7= parse_org_emftext_language_sql_literal_BooleanLiteral
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_BooleanLiteral_in_parse_org_emftext_language_sql_literal_Literal6288);
                    c7=parse_org_emftext_language_sql_literal_BooleanLiteral();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c7; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 45, parse_org_emftext_language_sql_literal_Literal_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_literal_Literal"



    // $ANTLR start "parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification"
    // Sql.g:5246:1: parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification returns [org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification element = null] : c0= parse_org_emftext_language_sql_expression_NullSpecification ;
    public final org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification() throws RecognitionException {
        org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification element =  null;

        int parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification_StartIndex = input.index();

        org.emftext.language.sql.expression.NullSpecification c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return element; }

            // Sql.g:5247:2: (c0= parse_org_emftext_language_sql_expression_NullSpecification )
            // Sql.g:5248:2: c0= parse_org_emftext_language_sql_expression_NullSpecification
            {
            pushFollow(FOLLOW_parse_org_emftext_language_sql_expression_NullSpecification_in_parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification6309);
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
            if ( state.backtracking>0 ) { memoize(input, 46, parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification"

    // $ANTLR start synpred13_Sql
    public final void synpred13_Sql_fragment() throws RecognitionException {
        // Sql.g:1772:4: ()
        // Sql.g:1772:4: 
        {
        }

    }
    // $ANTLR end synpred13_Sql

    // $ANTLR start synpred50_Sql
    public final void synpred50_Sql_fragment() throws RecognitionException {
        Token a13=null;
        org.emftext.language.sql.common.SchemaQualifiedName a14_0 =null;


        // Sql.g:4023:3: ( (a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )
        // Sql.g:4023:3: (a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
        {
        // Sql.g:4023:3: (a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
        // Sql.g:4024:4: a13= KEYWORD_COLLATE (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
        {
        a13=(Token)match(input,KEYWORD_COLLATE,FOLLOW_KEYWORD_COLLATE_in_synpred50_Sql4371); if (state.failed) return ;

        // Sql.g:4038:4: (a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
        // Sql.g:4039:5: a14_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
        {
        pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_synpred50_Sql4397);
        a14_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred50_Sql

    // $ANTLR start synpred57_Sql
    public final void synpred57_Sql_fragment() throws RecognitionException {
        Token a11=null;
        org.emftext.language.sql.common.SchemaQualifiedName a12_0 =null;


        // Sql.g:4254:3: ( (a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) ) )
        // Sql.g:4254:3: (a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
        {
        // Sql.g:4254:3: (a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName ) )
        // Sql.g:4255:4: a11= KEYWORD_COLLATE (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
        {
        a11=(Token)match(input,KEYWORD_COLLATE,FOLLOW_KEYWORD_COLLATE_in_synpred57_Sql4668); if (state.failed) return ;

        // Sql.g:4269:4: (a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName )
        // Sql.g:4270:5: a12_0= parse_org_emftext_language_sql_common_SchemaQualifiedName
        {
        pushFollow(FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_synpred57_Sql4694);
        a12_0=parse_org_emftext_language_sql_common_SchemaQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred57_Sql

    // $ANTLR start synpred96_Sql
    public final void synpred96_Sql_fragment() throws RecognitionException {
        org.emftext.language.sql.literal.CharacterStringLiteral c2 =null;


        // Sql.g:5237:4: (c2= parse_org_emftext_language_sql_literal_CharacterStringLiteral )
        // Sql.g:5237:4: c2= parse_org_emftext_language_sql_literal_CharacterStringLiteral
        {
        pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_CharacterStringLiteral_in_synpred96_Sql6238);
        c2=parse_org_emftext_language_sql_literal_CharacterStringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred96_Sql

    // $ANTLR start synpred97_Sql
    public final void synpred97_Sql_fragment() throws RecognitionException {
        org.emftext.language.sql.literal.NationalCharacterStringLiteral c3 =null;


        // Sql.g:5238:4: (c3= parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral )
        // Sql.g:5238:4: c3= parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral
        {
        pushFollow(FOLLOW_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral_in_synpred97_Sql6248);
        c3=parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred97_Sql

    // Delegated rules

    public final boolean synpred97_Sql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_Sql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_Sql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_Sql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_Sql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_Sql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_Sql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_Sql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Sql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Sql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SQLScript_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_Statement_in_parse_org_emftext_language_sql_common_SQLScript130 = new BitSet(new long[]{0x0040000000001022L});
    public static final BitSet FOLLOW_SIMPLE_COMMENT_in_parse_org_emftext_language_sql_common_SimpleComment190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKETED_COMMENT_in_parse_org_emftext_language_sql_common_BracketedComment230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_common_SchemaQualifiedName296 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_parse_org_emftext_language_sql_common_SchemaQualifiedName341 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_common_SchemaQualifiedName396 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_parse_org_emftext_language_sql_common_SchemaQualifiedName429 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_common_SchemaQualifiedName466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACT_NUMERIC_LITERAL_in_parse_org_emftext_language_sql_literal_ExactNumericLiteral506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_literal_ExactNumericLiteral535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APPROXIMATE_NUMERIC_LITERAL_in_parse_org_emftext_language_sql_literal_ApproximateNumericLiteral575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral620 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral646 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral691 = new BitSet(new long[]{0x0040000000000022L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_Separator_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral727 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_CharacterStringLiteral761 = new BitSet(new long[]{0x0040000000000022L});
    public static final BitSet FOLLOW_KEYWORD_N_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral822 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral840 = new BitSet(new long[]{0x0040000000000022L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_Separator_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral876 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral910 = new BitSet(new long[]{0x0040000000000022L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_CharacterStringLiteral_in_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_DATE_in_parse_org_emftext_language_sql_literal_DateLiteral986 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_DateLiteral1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_literal_TimeLiteral1040 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_TimeLiteral1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_TIMESTAMP_in_parse_org_emftext_language_sql_literal_TimestampLiteral1094 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_parse_org_emftext_language_sql_literal_TimestampLiteral1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_parse_org_emftext_language_sql_literal_BooleanLiteral1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_parse_org_emftext_language_sql_literal_BooleanLiteral1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_TableReference1254 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_parse_org_emftext_language_sql_schema_TableReference1299 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_TableReference1354 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_parse_org_emftext_language_sql_schema_TableReference1387 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_TableReference1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CREATE_in_parse_org_emftext_language_sql_schema_TableDefinition1460 = new BitSet(new long[]{0x0000000000400000L,0x0000000000110000L});
    public static final BitSet FOLLOW_80_in_parse_org_emftext_language_sql_schema_TableDefinition1520 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_84_in_parse_org_emftext_language_sql_schema_TableDefinition1537 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_TEMPORARY_in_parse_org_emftext_language_sql_schema_TableDefinition1563 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_TABLE_in_parse_org_emftext_language_sql_schema_TableDefinition1587 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_TableDefinition1605 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableContentsSource_in_parse_org_emftext_language_sql_schema_TableDefinition1627 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_parse_org_emftext_language_sql_schema_TableDefinition1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_schema_TableElementList1674 = new BitSet(new long[]{0x0000000000008880L,0x0000001100000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableElement_in_parse_org_emftext_language_sql_schema_TableElementList1692 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_TableElementList1719 = new BitSet(new long[]{0x0000000000008880L,0x0000001100000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableElement_in_parse_org_emftext_language_sql_schema_TableElementList1745 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_TableElementList1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_Column1819 = new BitSet(new long[]{0xC000000003002100L,0x000000267F065C1FL});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_DataType_in_parse_org_emftext_language_sql_schema_Column1844 = new BitSet(new long[]{0x0000000000144C02L,0x0000001100000000L});
    public static final BitSet FOLLOW_KEYWORD_DEFAULT_in_parse_org_emftext_language_sql_schema_Column1871 = new BitSet(new long[]{0x00A00000030A2050L,0x0000010800602380L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_DefaultOption_in_parse_org_emftext_language_sql_schema_Column1897 = new BitSet(new long[]{0x0000000000140C02L,0x0000001100000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_ColumnConstraint_in_parse_org_emftext_language_sql_schema_Column1947 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_schema_Column1982 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_Column2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_Literal_in_parse_org_emftext_language_sql_schema_LiteralDefaultOption2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_function_DatetimeValueFunction_in_parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification_in_parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint2184 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint2210 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_NOT_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint2251 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_NULL_in_parse_org_emftext_language_sql_schema_NotNullColumnConstraint2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint2303 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint2329 = new BitSet(new long[]{0x0000000000000000L,0x0000001100000000L});
    public static final BitSet FOLLOW_100_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_parse_org_emftext_language_sql_schema_UniqueColumnConstraint2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2439 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2465 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_REFERENCES_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2506 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableReference_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2524 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2551 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2577 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2623 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2657 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2782 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2808 = new BitSet(new long[]{0x0000000000000000L,0x0000001100000000L});
    public static final BitSet FOLLOW_100_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2858 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_96_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2873 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2894 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2912 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2942 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint2968 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_UniqueTableConstraint3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_CONSTRAINT_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3052 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3078 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_FOREIGN_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3119 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_KEY_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3133 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3147 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3165 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3195 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3221 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3267 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_REFERENCES_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3281 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableReference_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3299 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3326 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3352 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3398 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3432 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_schema_ReferentialTableConstraint3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_parse_org_emftext_language_sql_datatype_ExactNumericType3557 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_75_in_parse_org_emftext_language_sql_datatype_ExactNumericType3572 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_74_in_parse_org_emftext_language_sql_datatype_ExactNumericType3587 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_98_in_parse_org_emftext_language_sql_datatype_ExactNumericType3602 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_82_in_parse_org_emftext_language_sql_datatype_ExactNumericType3617 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_81_in_parse_org_emftext_language_sql_datatype_ExactNumericType3632 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_62_in_parse_org_emftext_language_sql_datatype_ExactNumericType3647 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_datatype_ExactNumericType3677 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ExactNumericType3703 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_parse_org_emftext_language_sql_datatype_ExactNumericType3749 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ExactNumericType3783 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_ExactNumericType3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3908 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_97_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3923 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_76_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3938 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3968 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType3994 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_ApproximateNumericType4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_parse_org_emftext_language_sql_datatype_CharacterStringType4084 = new BitSet(new long[]{0x0200000000000602L});
    public static final BitSet FOLLOW_66_in_parse_org_emftext_language_sql_datatype_CharacterStringType4099 = new BitSet(new long[]{0x0200000000000602L});
    public static final BitSet FOLLOW_101_in_parse_org_emftext_language_sql_datatype_CharacterStringType4114 = new BitSet(new long[]{0x0200000000000602L});
    public static final BitSet FOLLOW_67_in_parse_org_emftext_language_sql_datatype_CharacterStringType4129 = new BitSet(new long[]{0x0200000000000602L});
    public static final BitSet FOLLOW_65_in_parse_org_emftext_language_sql_datatype_CharacterStringType4144 = new BitSet(new long[]{0x0200000000000602L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_datatype_CharacterStringType4174 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_CharacterStringType4200 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_CharacterStringType4233 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_KEYWORD_CHARACTER_in_parse_org_emftext_language_sql_datatype_CharacterStringType4275 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_SET_in_parse_org_emftext_language_sql_datatype_CharacterStringType4295 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_datatype_CharacterStringType4321 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_datatype_CharacterStringType4371 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_datatype_CharacterStringType4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4462 = new BitSet(new long[]{0x0200000000000402L});
    public static final BitSet FOLLOW_89_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4477 = new BitSet(new long[]{0x0200000000000402L});
    public static final BitSet FOLLOW_90_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4492 = new BitSet(new long[]{0x0200000000000402L});
    public static final BitSet FOLLOW_88_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4507 = new BitSet(new long[]{0x0200000000000402L});
    public static final BitSet FOLLOW_93_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4522 = new BitSet(new long[]{0x0200000000000402L});
    public static final BitSet FOLLOW_92_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4537 = new BitSet(new long[]{0x0200000000000402L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4567 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4593 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4626 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_KEYWORD_COLLATE_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4668 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_parse_org_emftext_language_sql_datatype_NationalCharacterStringType4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4759 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_64_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4774 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4804 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_LargeObjectLength_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4830 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4910 = new BitSet(new long[]{0x0000000000000002L,0x0000000080888060L});
    public static final BitSet FOLLOW_83_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4946 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000060L});
    public static final BitSet FOLLOW_87_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4963 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000060L});
    public static final BitSet FOLLOW_79_in_parse_org_emftext_language_sql_datatype_LargeObjectLength4980 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000060L});
    public static final BitSet FOLLOW_69_in_parse_org_emftext_language_sql_datatype_LargeObjectLength5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_parse_org_emftext_language_sql_datatype_LargeObjectLength5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_parse_org_emftext_language_sql_datatype_LargeObjectLength5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_DATE_in_parse_org_emftext_language_sql_datatype_DateType5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_datatype_TimeType5131 = new BitSet(new long[]{0x0200000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_datatype_TimeType5154 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_TimeType5180 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_TimeType5213 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_102_in_parse_org_emftext_language_sql_datatype_TimeType5268 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_103_in_parse_org_emftext_language_sql_datatype_TimeType5287 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_datatype_TimeType5318 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_ZONE_in_parse_org_emftext_language_sql_datatype_TimeType5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_TIMESTAMP_in_parse_org_emftext_language_sql_datatype_TimestampType5386 = new BitSet(new long[]{0x0200000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_datatype_TimestampType5409 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_datatype_TimestampType5435 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_datatype_TimestampType5468 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_102_in_parse_org_emftext_language_sql_datatype_TimestampType5523 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_103_in_parse_org_emftext_language_sql_datatype_TimestampType5542 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_TIME_in_parse_org_emftext_language_sql_datatype_TimestampType5573 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_KEYWORD_ZONE_in_parse_org_emftext_language_sql_datatype_TimestampType5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_BOOLEAN_in_parse_org_emftext_language_sql_datatype_BooleanType5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5679 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_72_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5694 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_85_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5709 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_73_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5724 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_86_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5739 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5769 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5795 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_parse_org_emftext_language_sql_function_DatetimeValueFunction5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_NULL_in_parse_org_emftext_language_sql_expression_NullSpecification5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SimpleComment_in_parse_org_emftext_language_sql_common_Statement5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_BracketedComment_in_parse_org_emftext_language_sql_common_Statement5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableDefinition_in_parse_org_emftext_language_sql_common_Statement5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SimpleComment_in_parse_org_emftext_language_sql_common_Separator5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_BracketedComment_in_parse_org_emftext_language_sql_common_Separator5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_TableElementList_in_parse_org_emftext_language_sql_schema_TableContentsSource5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_Column_in_parse_org_emftext_language_sql_schema_TableElement5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_UniqueTableConstraint_in_parse_org_emftext_language_sql_schema_TableElement6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_ReferentialTableConstraint_in_parse_org_emftext_language_sql_schema_TableElement6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_ExactNumericType_in_parse_org_emftext_language_sql_datatype_DataType6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_ApproximateNumericType_in_parse_org_emftext_language_sql_datatype_DataType6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_CharacterStringType_in_parse_org_emftext_language_sql_datatype_DataType6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_NationalCharacterStringType_in_parse_org_emftext_language_sql_datatype_DataType6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_in_parse_org_emftext_language_sql_datatype_DataType6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_DateType_in_parse_org_emftext_language_sql_datatype_DataType6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_TimeType_in_parse_org_emftext_language_sql_datatype_DataType6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_TimestampType_in_parse_org_emftext_language_sql_datatype_DataType6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_datatype_BooleanType_in_parse_org_emftext_language_sql_datatype_DataType6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_LiteralDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption_in_parse_org_emftext_language_sql_schema_DefaultOption6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_NotNullColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_UniqueColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_schema_ReferentialColumnConstraint_in_parse_org_emftext_language_sql_schema_ColumnConstraint6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_ExactNumericLiteral_in_parse_org_emftext_language_sql_literal_Literal6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_ApproximateNumericLiteral_in_parse_org_emftext_language_sql_literal_Literal6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_CharacterStringLiteral_in_parse_org_emftext_language_sql_literal_Literal6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral_in_parse_org_emftext_language_sql_literal_Literal6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_DateLiteral_in_parse_org_emftext_language_sql_literal_Literal6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_TimeLiteral_in_parse_org_emftext_language_sql_literal_Literal6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_TimestampLiteral_in_parse_org_emftext_language_sql_literal_Literal6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_BooleanLiteral_in_parse_org_emftext_language_sql_literal_Literal6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_expression_NullSpecification_in_parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_COLLATE_in_synpred50_Sql4371 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_synpred50_Sql4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_COLLATE_in_synpred57_Sql4668 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_common_SchemaQualifiedName_in_synpred57_Sql4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_CharacterStringLiteral_in_synpred96_Sql6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral_in_synpred97_Sql6248 = new BitSet(new long[]{0x0000000000000002L});

}