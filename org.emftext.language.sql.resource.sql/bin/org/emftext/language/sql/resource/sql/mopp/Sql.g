grammar Sql;

options {
	superClass = SqlANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.emftext.language.sql.resource.sql.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;
}

@lexer::members {
	public List<RecognitionException> lexerExceptions  = new ArrayList<RecognitionException>();
	public List<Integer> lexerExceptionPositions = new ArrayList<Integer>();
	
	public void reportError(RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionPositions.add(((ANTLRStringStream) input).index());
	}
}
@header{
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
}

@members{
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
	
}

start returns [ EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 0, 2);
		expectedElementsIndexOfLastCompleteElement = 2;
	}
	(
		c0 = parse_org_emftext_language_sql_common_SQLScript{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_emftext_language_sql_common_SQLScript returns [org.emftext.language.sql.common.SQLScript element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_org_emftext_language_sql_common_Statement				{
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
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 3, 5);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 6, 8);
	}
	
;

parse_org_emftext_language_sql_common_SimpleComment returns [org.emftext.language.sql.common.SimpleComment element = null]
@init{
}
:
	(
		a0 = SIMPLE_COMMENT		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 9, 11);
		addExpectedElement(null, 12, 13);
	}
	
;

parse_org_emftext_language_sql_common_BracketedComment returns [org.emftext.language.sql.common.BracketedComment element = null]
@init{
}
:
	(
		a0 = BRACKETED_COMMENT		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 14, 16);
		addExpectedElement(null, 17, 18);
	}
	
;

parse_org_emftext_language_sql_common_SchemaQualifiedName returns [org.emftext.language.sql.common.SchemaQualifiedName element = null]
@init{
}
:
	(
		(
			(
				(
					(
						a0 = IDENTIFIER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 19);
					}
					
					a1 = '.' {
						if (element == null) {
							element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSchemaQualifiedName();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_0_0_0_0_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a1, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, 20);
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(null, 21);
			}
			
			(
				a2 = IDENTIFIER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 22);
			}
			
			a3 = '.' {
				if (element == null) {
					element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSchemaQualifiedName();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_0_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 23);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 24);
	}
	
	(
		a4 = IDENTIFIER		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 25);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 26);
		addExpectedElement(null, 27, 34);
	}
	
;

parse_org_emftext_language_sql_literal_ExactNumericLiteral returns [org.emftext.language.sql.literal.ExactNumericLiteral element = null]
@init{
}
:
	(
		a0 = EXACT_NUMERIC_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 35, 40);
		addExpectedElement(null, 41, 43);
	}
	
	
	|	(
		a1 = UNSIGNED_INTEGER		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 44, 49);
		addExpectedElement(null, 50, 52);
	}
	
;

parse_org_emftext_language_sql_literal_ApproximateNumericLiteral returns [org.emftext.language.sql.literal.ApproximateNumericLiteral element = null]
@init{
}
:
	(
		a0 = APPROXIMATE_NUMERIC_LITERAL		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 53, 58);
		addExpectedElement(null, 59, 61);
	}
	
;

parse_org_emftext_language_sql_literal_CharacterStringLiteral returns [org.emftext.language.sql.literal.CharacterStringLiteral element = null]
@init{
}
:
	(
		(
			a0 = '_' {
				if (element == null) {
					element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createCharacterStringLiteral();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_6_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(), 62, 64);
			}
			
			(
				a1_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 65);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 66);
	}
	
	(
		a2 = QUOTED_STRING		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(), 67, 68);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 69, 74);
		addExpectedElement(null, 75, 77);
	}
	
	(
		(
			(
				a3_0 = parse_org_emftext_language_sql_common_Separator				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 78);
			}
			
			(
				a4 = QUOTED_STRING				
				{
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
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(), 79, 80);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 81, 86);
				addExpectedElement(null, 87, 89);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(), 90, 91);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 92, 97);
		addExpectedElement(null, 98, 100);
	}
	
;

parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral returns [org.emftext.language.sql.literal.NationalCharacterStringLiteral element = null]
@init{
}
:
	a0 = KEYWORD_N {
		if (element == null) {
			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createNationalCharacterStringLiteral();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 101);
	}
	
	(
		a1 = QUOTED_STRING		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral(), 102, 103);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 104, 109);
		addExpectedElement(null, 110, 112);
	}
	
	(
		(
			(
				a2_0 = parse_org_emftext_language_sql_common_Separator				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 113);
			}
			
			(
				a3 = QUOTED_STRING				
				{
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
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral(), 114, 115);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 116, 121);
				addExpectedElement(null, 122, 124);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral(), 125, 126);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 127, 132);
		addExpectedElement(null, 133, 135);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_emftext_language_sql_literal_CharacterStringLiteral{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_sql_literal_DateLiteral returns [org.emftext.language.sql.literal.DateLiteral element = null]
@init{
}
:
	a0 = KEYWORD_DATE {
		if (element == null) {
			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createDateLiteral();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_8_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 136);
	}
	
	(
		a1 = QUOTED_STRING		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 137, 142);
		addExpectedElement(null, 143, 145);
	}
	
;

parse_org_emftext_language_sql_literal_TimeLiteral returns [org.emftext.language.sql.literal.TimeLiteral element = null]
@init{
}
:
	a0 = KEYWORD_TIME {
		if (element == null) {
			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimeLiteral();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 146);
	}
	
	(
		a1 = QUOTED_STRING		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 147, 152);
		addExpectedElement(null, 153, 155);
	}
	
;

parse_org_emftext_language_sql_literal_TimestampLiteral returns [org.emftext.language.sql.literal.TimestampLiteral element = null]
@init{
}
:
	a0 = KEYWORD_TIMESTAMP {
		if (element == null) {
			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createTimestampLiteral();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 156);
	}
	
	(
		a1 = QUOTED_STRING		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 157, 162);
		addExpectedElement(null, 163, 165);
	}
	
;

parse_org_emftext_language_sql_literal_BooleanLiteral returns [org.emftext.language.sql.literal.BooleanLiteral element = null]
@init{
}
:
	(
		(
			(
				a0 = 'TRUE' {
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
				|				a1 = 'FALSE' {
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
			)
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 166, 171);
		addExpectedElement(null, 172, 174);
	}
	
;

parse_org_emftext_language_sql_schema_TableReference returns [org.emftext.language.sql.schema.TableReference element = null]
@init{
}
:
	(
		(
			(
				(
					(
						a0 = IDENTIFIER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 175);
					}
					
					a1 = '.' {
						if (element == null) {
							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableReference();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_0_0_0_0_0_0_1, null, true);
						copyLocalizationInfos((CommonToken)a1, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, 176);
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(null, 177);
			}
			
			(
				a2 = IDENTIFIER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 178);
			}
			
			a3 = '.' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableReference();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_0_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 179);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 180);
	}
	
	(
		a4 = IDENTIFIER		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 181, 185);
	}
	
;

parse_org_emftext_language_sql_schema_TableDefinition returns [org.emftext.language.sql.schema.TableDefinition element = null]
@init{
}
:
	a0 = KEYWORD_CREATE {
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
	{
		// expected elements (follow set)
		addExpectedElement(null, 186, 188);
	}
	
	(
		(
			(
			)?		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 189);
		}
		
		
		|		(
			(
				a3 = 'GLOBAL' {
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
				|				a4 = 'LOCAL' {
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
			)
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 190);
		}
		
		a7 = KEYWORD_TEMPORARY {
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
		{
			// expected elements (follow set)
			addExpectedElement(null, 191);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 192);
	}
	
	a8 = KEYWORD_TABLE {
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
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 193, 195);
	}
	
	(
		a9_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 196);
	}
	
	(
		a10_0 = parse_org_emftext_language_sql_schema_TableContentsSource		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 197);
	}
	
	a11 = ';' {
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
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 198, 200);
	}
	
;

parse_org_emftext_language_sql_schema_TableElementList returns [org.emftext.language.sql.schema.TableElementList element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(), 201, 205);
	}
	
	(
		a1_0 = parse_org_emftext_language_sql_schema_TableElement		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 206, 207);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(), 208, 212);
			}
			
			(
				a3_0 = parse_org_emftext_language_sql_schema_TableElement				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 213, 214);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, 215, 216);
	}
	
	a4 = ')' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 217);
	}
	
;

parse_org_emftext_language_sql_schema_Column returns [org.emftext.language.sql.schema.Column element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 218, 226);
	}
	
	(
		a1_0 = parse_org_emftext_language_sql_datatype_DataType		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 227);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 228, 233);
		addExpectedElement(null, 234, 236);
	}
	
	(
		(
			a2 = KEYWORD_DEFAULT {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 237, 254);
				addExpectedElement(null, 255, 257);
			}
			
			(
				a3_0 = parse_org_emftext_language_sql_schema_DefaultOption				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 258, 263);
				addExpectedElement(null, 264, 266);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 267, 272);
		addExpectedElement(null, 273, 275);
	}
	
	(
		(
			a4_0 = parse_org_emftext_language_sql_schema_ColumnConstraint			{
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
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__CONSTRAINT), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_3, a4_0, true);
					copyLocalizationInfos(a4_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 276, 278);
	}
	
	(
		(
			a5 = KEYWORD_COLLATE {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 279, 281);
			}
			
			(
				a6_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 282, 283);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 284, 285);
	}
	
;

parse_org_emftext_language_sql_schema_LiteralDefaultOption returns [org.emftext.language.sql.schema.LiteralDefaultOption element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_sql_literal_Literal		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 286, 291);
		addExpectedElement(null, 292, 294);
	}
	
;

parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption returns [org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_sql_function_DatetimeValueFunction		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 295, 300);
		addExpectedElement(null, 301, 303);
	}
	
;

parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption returns [org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption element = null]
@init{
}
:
	(
		a0_0 = parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 304, 309);
		addExpectedElement(null, 310, 312);
	}
	
;

parse_org_emftext_language_sql_schema_NotNullColumnConstraint returns [org.emftext.language.sql.schema.NotNullColumnConstraint element = null]
@init{
}
:
	(
		(
			a0 = KEYWORD_CONSTRAINT {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getNotNullColumnConstraint(), 313, 315);
			}
			
			(
				a1_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 316);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 317);
	}
	
	a2 = KEYWORD_NOT {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 318);
	}
	
	a3 = KEYWORD_NULL {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 319, 321);
	}
	
;

parse_org_emftext_language_sql_schema_UniqueColumnConstraint returns [org.emftext.language.sql.schema.UniqueColumnConstraint element = null]
@init{
}
:
	(
		(
			a0 = KEYWORD_CONSTRAINT {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueColumnConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueColumnConstraint(), 322, 324);
			}
			
			(
				a1_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 325);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 326);
	}
	
	(
		(
			a2 = 'UNIQUE' {
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
			|			a3 = 'PRIMARY KEY' {
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
		)
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 327, 329);
	}
	
;

parse_org_emftext_language_sql_schema_ReferentialColumnConstraint returns [org.emftext.language.sql.schema.ReferentialColumnConstraint element = null]
@init{
}
:
	(
		(
			a0 = KEYWORD_CONSTRAINT {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint(), 330, 332);
			}
			
			(
				a1_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 333);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 334);
	}
	
	a2 = KEYWORD_REFERENCES {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint(), 335, 337);
	}
	
	(
		a3_0 = parse_org_emftext_language_sql_schema_TableReference		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 338, 341);
	}
	
	(
		(
			a4 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 342);
			}
			
			(
				a5 = IDENTIFIER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 343, 344);
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, 345);
					}
					
					(
						a7 = IDENTIFIER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 346, 347);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, 348, 349);
			}
			
			a8 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_3_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 350, 352);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 353, 355);
	}
	
;

parse_org_emftext_language_sql_schema_UniqueTableConstraint returns [org.emftext.language.sql.schema.UniqueTableConstraint element = null]
@init{
}
:
	(
		(
			a0 = KEYWORD_CONSTRAINT {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint(), 356, 358);
			}
			
			(
				a1_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 359);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 360);
	}
	
	(
		(
			a2 = 'UNIQUE' {
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
			|			a3 = 'PRIMARY KEY' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 361);
	}
	
	a6 = '(' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 362);
	}
	
	(
		a7 = IDENTIFIER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 363, 364);
	}
	
	(
		(
			a8 = ',' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 365);
			}
			
			(
				a9 = IDENTIFIER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 366, 367);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, 368, 369);
	}
	
	a10 = ')' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 370, 371);
	}
	
;

parse_org_emftext_language_sql_schema_ReferentialTableConstraint returns [org.emftext.language.sql.schema.ReferentialTableConstraint element = null]
@init{
}
:
	(
		(
			a0 = KEYWORD_CONSTRAINT {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint(), 372, 374);
			}
			
			(
				a1_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 375);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 376);
	}
	
	a2 = KEYWORD_FOREIGN {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 377);
	}
	
	a3 = KEYWORD_KEY {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 378);
	}
	
	a4 = '(' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 379);
	}
	
	(
		a5 = IDENTIFIER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 380, 381);
	}
	
	(
		(
			a6 = ',' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 382);
			}
			
			(
				a7 = IDENTIFIER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 383, 384);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, 385, 386);
	}
	
	a8 = ')' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 387);
	}
	
	a9 = KEYWORD_REFERENCES {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint(), 388, 390);
	}
	
	(
		a10_0 = parse_org_emftext_language_sql_schema_TableReference		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 391, 393);
	}
	
	(
		(
			a11 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 394);
			}
			
			(
				a12 = IDENTIFIER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 395, 396);
			}
			
			(
				(
					a13 = ',' {
						if (element == null) {
							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_9_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a13, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, 397);
					}
					
					(
						a14 = IDENTIFIER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 398, 399);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, 400, 401);
			}
			
			a15 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_9_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 402, 403);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 404, 405);
	}
	
;

parse_org_emftext_language_sql_datatype_ExactNumericType returns [org.emftext.language.sql.datatype.ExactNumericType element = null]
@init{
}
:
	(
		(
			a0 = 'NUMERIC' {
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
			|			a1 = 'DECIMAL' {
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
			|			a2 = 'DEC' {
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
			|			a3 = 'SMALLINT' {
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
			|			a4 = 'INTEGER' {
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
			|			a5 = 'INT' {
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
			|			a6 = 'BIGINT' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 406, 407);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 408, 413);
		addExpectedElement(null, 414, 416);
	}
	
	(
		(
			a9 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 417);
			}
			
			(
				a10 = UNSIGNED_INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 418, 419);
			}
			
			(
				(
					a11 = ',' {
						if (element == null) {
							element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a11, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, 420);
					}
					
					(
						a12 = UNSIGNED_INTEGER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 421);
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(null, 422);
			}
			
			a13 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 423);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 424, 429);
				addExpectedElement(null, 430, 432);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 433);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 434, 439);
		addExpectedElement(null, 440, 442);
	}
	
;

parse_org_emftext_language_sql_datatype_ApproximateNumericType returns [org.emftext.language.sql.datatype.ApproximateNumericType element = null]
@init{
}
:
	(
		(
			a0 = 'FLOAT' {
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
			|			a1 = 'REAL' {
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
			|			a2 = 'DOUBLE PRECISION' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 443, 444);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 445, 450);
		addExpectedElement(null, 451, 453);
	}
	
	(
		(
			a5 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 454);
			}
			
			(
				a6 = UNSIGNED_INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 455);
			}
			
			a7 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 456);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 457, 462);
				addExpectedElement(null, 463, 465);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 466);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 467, 472);
		addExpectedElement(null, 473, 475);
	}
	
;

parse_org_emftext_language_sql_datatype_CharacterStringType returns [org.emftext.language.sql.datatype.CharacterStringType element = null]
@init{
}
:
	(
		(
			a0 = 'CHARACTER' {
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
			|			a1 = 'CHAR' {
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
			|			a2 = 'VARCHAR' {
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
			|			a3 = 'CHARACTER VARYING' {
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
			|			a4 = 'CHAR VARYING' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 476, 479);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 480, 485);
		addExpectedElement(null, 486, 488);
	}
	
	(
		(
			a7 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 489);
			}
			
			(
				a8 = UNSIGNED_INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 490);
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 491, 493);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 494, 499);
				addExpectedElement(null, 500, 502);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 503, 505);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 506, 511);
		addExpectedElement(null, 512, 514);
	}
	
	(
		(
			a10 = KEYWORD_CHARACTER {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 515);
			}
			
			a11 = KEYWORD_SET {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType(), 516, 518);
			}
			
			(
				a12_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 519, 520);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 521, 526);
				addExpectedElement(null, 527, 529);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 530, 531);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 532, 537);
		addExpectedElement(null, 538, 540);
	}
	
	(
		(
			a13 = KEYWORD_COLLATE {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType(), 541, 543);
			}
			
			(
				a14_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 544);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 545, 550);
				addExpectedElement(null, 551, 553);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 554);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 555, 560);
		addExpectedElement(null, 561, 563);
	}
	
;

parse_org_emftext_language_sql_datatype_NationalCharacterStringType returns [org.emftext.language.sql.datatype.NationalCharacterStringType element = null]
@init{
}
:
	(
		(
			a0 = 'NATIONAL CHARACTER' {
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
			|			a1 = 'NATIONAL CHAR' {
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
			|			a2 = 'NATIONAL CHARACTER VARYING' {
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
			|			a3 = 'NATIONAL CHAR VARYING' {
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
			|			a4 = 'NCHAR' {
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
			|			a5 = 'NCHAR VARYING' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 564, 566);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 567, 572);
		addExpectedElement(null, 573, 575);
	}
	
	(
		(
			a8 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 576);
			}
			
			(
				a9 = UNSIGNED_INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 577);
			}
			
			a10 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 578, 579);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 580, 585);
				addExpectedElement(null, 586, 588);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 589, 590);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 591, 596);
		addExpectedElement(null, 597, 599);
	}
	
	(
		(
			a11 = KEYWORD_COLLATE {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_27_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringType(), 600, 602);
			}
			
			(
				a12_0 = parse_org_emftext_language_sql_common_SchemaQualifiedName				{
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
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 603);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 604, 609);
				addExpectedElement(null, 610, 612);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 613);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 614, 619);
		addExpectedElement(null, 620, 622);
	}
	
;

parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType returns [org.emftext.language.sql.datatype.BinaryLargeObjectStringType element = null]
@init{
}
:
	(
		(
			a0 = 'BINARY LARGE OBJECT' {
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
			|			a1 = 'BLOB' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 623, 624);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 625, 630);
		addExpectedElement(null, 631, 633);
	}
	
	(
		(
			a4 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_28_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringType(), 634);
			}
			
			(
				a5_0 = parse_org_emftext_language_sql_datatype_LargeObjectLength				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 635);
			}
			
			a6 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_28_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 636);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 637, 642);
				addExpectedElement(null, 643, 645);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 646);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 647, 652);
		addExpectedElement(null, 653, 655);
	}
	
;

parse_org_emftext_language_sql_datatype_LargeObjectLength returns [org.emftext.language.sql.datatype.LargeObjectLength element = null]
@init{
}
:
	(
		a0 = UNSIGNED_INTEGER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 656, 658);
	}
	
	(
		(
			(
				a1 = 'K' {
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
				|				a2 = 'M' {
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
				|				a3 = 'G' {
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
			)
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 659, 660);
	}
	
	(
		(
			(
				a6 = 'CHARACTERS' {
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
				|				a7 = 'CODE_UNITS' {
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
				|				a8 = 'OCTETS' {
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
			)
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 661);
	}
	
;

parse_org_emftext_language_sql_datatype_DateType returns [org.emftext.language.sql.datatype.DateType element = null]
@init{
}
:
	a0 = KEYWORD_DATE {
		if (element == null) {
			element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDateType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_30_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 662);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 663, 668);
		addExpectedElement(null, 669, 671);
	}
	
;

parse_org_emftext_language_sql_datatype_TimeType returns [org.emftext.language.sql.datatype.TimeType element = null]
@init{
}
:
	a0 = KEYWORD_TIME {
		if (element == null) {
			element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 672, 674);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 675, 680);
		addExpectedElement(null, 681, 683);
	}
	
	(
		(
			a1 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 684);
			}
			
			(
				a2 = UNSIGNED_INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 685);
			}
			
			a3 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 686, 687);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 688, 693);
				addExpectedElement(null, 694, 696);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 697, 698);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 699, 704);
		addExpectedElement(null, 705, 707);
	}
	
	(
		(
			(
				(
					a4 = 'WITH' {
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
					|					a5 = 'WITHOUT' {
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
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 708);
			}
			
			a7 = KEYWORD_TIME {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 709);
			}
			
			a8 = KEYWORD_ZONE {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimeType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_31_0_0_2_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 710);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 711, 716);
				addExpectedElement(null, 717, 719);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 720);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 721, 726);
		addExpectedElement(null, 727, 729);
	}
	
;

parse_org_emftext_language_sql_datatype_TimestampType returns [org.emftext.language.sql.datatype.TimestampType element = null]
@init{
}
:
	a0 = KEYWORD_TIMESTAMP {
		if (element == null) {
			element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 730, 732);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 733, 738);
		addExpectedElement(null, 739, 741);
	}
	
	(
		(
			a1 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 742);
			}
			
			(
				a2 = UNSIGNED_INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 743);
			}
			
			a3 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 744, 745);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 746, 751);
				addExpectedElement(null, 752, 754);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 755, 756);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 757, 762);
		addExpectedElement(null, 763, 765);
	}
	
	(
		(
			(
				(
					a4 = 'WITH' {
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
					|					a5 = 'WITHOUT' {
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
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 766);
			}
			
			a7 = KEYWORD_TIME {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 767);
			}
			
			a8 = KEYWORD_ZONE {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createTimestampType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_32_0_0_2_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 768);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 769, 774);
				addExpectedElement(null, 775, 777);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 778);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 779, 784);
		addExpectedElement(null, 785, 787);
	}
	
;

parse_org_emftext_language_sql_datatype_BooleanType returns [org.emftext.language.sql.datatype.BooleanType element = null]
@init{
}
:
	a0 = KEYWORD_BOOLEAN {
		if (element == null) {
			element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBooleanType();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_33_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 788);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 789, 794);
		addExpectedElement(null, 795, 797);
	}
	
;

parse_org_emftext_language_sql_function_DatetimeValueFunction returns [org.emftext.language.sql.function.DatetimeValueFunction element = null]
@init{
}
:
	(
		(
			a0 = 'CURRENT_DATE' {
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
			|			a1 = 'CURRENT_TIME' {
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
			|			a2 = 'LOCALTIME' {
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
			|			a3 = 'CURRENT_TIMESTAMP' {
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
			|			a4 = 'LOCALTIMESTAMP' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 798);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 799, 804);
		addExpectedElement(null, 805, 807);
	}
	
	(
		(
			a7 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 808);
			}
			
			(
				a8 = UNSIGNED_INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 809);
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_34_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 810, 815);
				addExpectedElement(null, 816, 818);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 819, 824);
		addExpectedElement(null, 825, 827);
	}
	
;

parse_org_emftext_language_sql_expression_NullSpecification returns [org.emftext.language.sql.expression.NullSpecification element = null]
@init{
}
:
	a0 = KEYWORD_NULL {
		if (element == null) {
			element = org.emftext.language.sql.expression.ExpressionFactory.eINSTANCE.createNullSpecification();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_35_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 828, 833);
		addExpectedElement(null, 834, 836);
	}
	
;

parse_org_emftext_language_sql_common_Statement returns [org.emftext.language.sql.common.Statement element = null]
:
	c0 = parse_org_emftext_language_sql_common_SimpleComment{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_sql_common_BracketedComment{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_sql_schema_TableDefinition{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_sql_common_Separator returns [org.emftext.language.sql.common.Separator element = null]
:
	c0 = parse_org_emftext_language_sql_common_SimpleComment{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_sql_common_BracketedComment{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_sql_schema_TableContentsSource returns [org.emftext.language.sql.schema.TableContentsSource element = null]
:
	c0 = parse_org_emftext_language_sql_schema_TableElementList{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_sql_schema_TableElement returns [org.emftext.language.sql.schema.TableElement element = null]
:
	c0 = parse_org_emftext_language_sql_schema_Column{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_sql_schema_UniqueTableConstraint{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_sql_schema_ReferentialTableConstraint{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_sql_datatype_DataType returns [org.emftext.language.sql.datatype.DataType element = null]
:
	c0 = parse_org_emftext_language_sql_datatype_ExactNumericType{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_sql_datatype_ApproximateNumericType{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_sql_datatype_CharacterStringType{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_sql_datatype_NationalCharacterStringType{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_emftext_language_sql_datatype_DateType{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_emftext_language_sql_datatype_TimeType{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_emftext_language_sql_datatype_TimestampType{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_org_emftext_language_sql_datatype_BooleanType{ element = c8; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_sql_schema_DefaultOption returns [org.emftext.language.sql.schema.DefaultOption element = null]
:
	c0 = parse_org_emftext_language_sql_schema_LiteralDefaultOption{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_sql_schema_ColumnConstraint returns [org.emftext.language.sql.schema.ColumnConstraint element = null]
:
	c0 = parse_org_emftext_language_sql_schema_NotNullColumnConstraint{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_sql_schema_UniqueColumnConstraint{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_sql_schema_ReferentialColumnConstraint{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_sql_literal_Literal returns [org.emftext.language.sql.literal.Literal element = null]
:
	c0 = parse_org_emftext_language_sql_literal_ExactNumericLiteral{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_sql_literal_ApproximateNumericLiteral{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_sql_literal_CharacterStringLiteral{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_sql_literal_NationalCharacterStringLiteral{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_sql_literal_DateLiteral{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_emftext_language_sql_literal_TimeLiteral{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_emftext_language_sql_literal_TimestampLiteral{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_emftext_language_sql_literal_BooleanLiteral{ element = c7; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_emftext_language_sql_expression_ImplicitlyTypedValueSpecification returns [org.emftext.language.sql.expression.ImplicitlyTypedValueSpecification element = null]
:
	c0 = parse_org_emftext_language_sql_expression_NullSpecification{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

fragment LETTER_A:('a'|'A');
fragment LETTER_B:('b'|'B');
fragment LETTER_C:('c'|'C');
fragment LETTER_D:('d'|'D');
fragment LETTER_E:('e'|'E');
fragment LETTER_F:('f'|'F');
fragment LETTER_G:('g'|'G');
fragment LETTER_H:('h'|'H');
fragment LETTER_I:('i'|'I');
fragment LETTER_J:('j'|'J');
fragment LETTER_K:('k'|'K');
fragment LETTER_L:('l'|'L');
fragment LETTER_M:('m'|'M');
fragment LETTER_N:('n'|'N');
fragment LETTER_O:('o'|'O');
fragment LETTER_P:('p'|'P');
fragment LETTER_Q:('q'|'Q');
fragment LETTER_R:('r'|'R');
fragment LETTER_S:('s'|'S');
fragment LETTER_T:('t'|'T');
fragment LETTER_U:('u'|'U');
fragment LETTER_V:('v'|'V');
fragment LETTER_W:('w'|'W');
fragment LETTER_X:('x'|'X');
fragment LETTER_Y:('y'|'Y');
fragment LETTER_Z:('z'|'Z');

KEYWORD_N: (LETTER_N);

KEYWORD_DATE: (LETTER_D LETTER_A LETTER_T LETTER_E);

KEYWORD_TIME: (LETTER_T LETTER_I LETTER_M LETTER_E);

KEYWORD_TIMESTAMP: (LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P);

KEYWORD_CREATE: (LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E);

KEYWORD_TEMPORARY: (LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y);

KEYWORD_TABLE: (LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E);

KEYWORD_DEFAULT: (LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T);

KEYWORD_COLLATE: (LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E);

KEYWORD_CONSTRAINT: (LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T);

KEYWORD_NOT: (LETTER_N LETTER_O LETTER_T);

KEYWORD_NULL: (LETTER_N LETTER_U LETTER_L LETTER_L);

KEYWORD_REFERENCES: (LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S);

KEYWORD_FOREIGN: (LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N);

KEYWORD_KEY: (LETTER_K LETTER_E LETTER_Y);

KEYWORD_CHARACTER: (LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R);

KEYWORD_SET: (LETTER_S LETTER_E LETTER_T);

KEYWORD_ZONE: (LETTER_Z LETTER_O LETTER_N LETTER_E);

KEYWORD_BOOLEAN: (LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N);

WHITESPACE:
	(('\u0009'|'\u000A'|'\u000B'|'\u000C'|'\u000D'|'\u0020'|'\u00A0'|'\u2000'|'\u2001'|'\u2002'|'\u2003'|'\u2004'|'\u2005'|'\u2006'|'\u2007'|'\u2008'|'\u2009'|'\u200A'|'\u200B'|'\u200C'|'\u200D'|'\u200E'|'\u200F'|'\u2028'|'\u2029'|'\u3000'|'\uFEFF'))
	{ _channel = 99; }
;
SIMPLE_COMMENT:
	('-''-'(~('\n'|'\r'|'\uffff'))*)
;
BRACKETED_COMMENT:
	('/''*'.*'*''/')
;
UNSIGNED_INTEGER:
	((('0'..'9'))+)
;
EXACT_NUMERIC_LITERAL:
	(((('0'..'9'))+('.'((('0'..'9'))+)?)?|'.'(('0'..'9'))+))
;
APPROXIMATE_NUMERIC_LITERAL:
	(((('0'..'9'))+('.'((('0'..'9'))+)?)?|'.'(('0'..'9'))+)'E'('+'|'-')?(('0'..'9'))+)
;
QUOTED_STRING:
	('\''(~('\''|('\r\n'|'\r'|'\n'))|('\'''\''))*'\'')
;
IDENTIFIER:
	((('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|(('0'..'9')|'_'))*|'"'(~('"'|('\r\n'|'\r'|'\n'))|('"''"'))+'"'))
;

