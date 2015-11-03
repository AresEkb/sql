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
	
}

start returns [ EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 0);
		expectedElementsIndexOfLastCompleteElement = 0;
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
				a0_0 = parse_org_emftext_language_sql_common_DirectSQLStatement				{
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
				addExpectedElement(null, 1);
			}
			
			a1 = ';' {
				if (element == null) {
					element = org.emftext.language.sql.common.CommonFactory.eINSTANCE.createSQLScript();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_0_0_0_0_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 2);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), 3);
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
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 4, 5);
	}
	
	(
		(
			(
				(
					a1 = 'GLOBAL' {
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
					|					a2 = 'LOCAL' {
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
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 6);
			}
			
			a5 = KEYWORD_TEMPORARY {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 7);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 8);
	}
	
	a6 = KEYWORD_TABLE {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 9, 10);
	}
	
	(
		(
			a7 = IDENTIFIER			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 11);
		}
		
		
		|		(
			a8 = SCHEMA_QUALIFIED_NAME			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 12);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), 13);
	}
	
	(
		a9_0 = parse_org_emftext_language_sql_schema_TableContentsSource		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 14, 15);
	}
	
	(
		(
			a10 = KEYWORD_ON {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 16);
			}
			
			a11 = KEYWORD_COMMIT {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 17);
			}
			
			(
				(
					a12 = 'PRESERVE' {
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
					|					a13 = 'DELETE' {
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
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 18);
			}
			
			a16 = KEYWORD_ROWS {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableDefinition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_1_0_0_5_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 19);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 20);
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
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(), 21, 25);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 26, 27);
	}
	
	(
		(
			a2 = ',' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(), 28, 32);
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
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_2_0_0_1, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 33, 34);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, 35, 36);
	}
	
	a4 = ')' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createTableElementList();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_2_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 37, 38);
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 39, 45);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 46);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 47, 52);
		addExpectedElement(null, 53, 55);
	}
	
	(
		(
			a2 = KEYWORD_DEFAULT {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 56, 68);
				addExpectedElement(null, 69, 71);
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
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_2_0_0_1, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 72, 77);
				addExpectedElement(null, 78, 80);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 81, 86);
		addExpectedElement(null, 87, 89);
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
						element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__CONSTRAINT_DEFINITION), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_3, a4_0, true);
					copyLocalizationInfos(a4_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 90, 92);
	}
	
	(
		(
			a5 = KEYWORD_COLLATE {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createColumn();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_3_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 93, 94);
			}
			
			(
				(
					a6 = IDENTIFIER					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 95, 96);
				}
				
				
				|				(
					a7 = SCHEMA_QUALIFIED_NAME					
					{
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
				)
				{
					// expected elements (follow set)
					// We've found the last token for this rule. The constructed EObject is now
					// complete.
					completedElement(element, true);
					addExpectedElement(null, 97, 98);
				}
				
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 99, 100);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 101, 102);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_4_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 103, 108);
		addExpectedElement(null, 109, 111);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_5_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 112, 117);
		addExpectedElement(null, 118, 120);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_6_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 121, 126);
		addExpectedElement(null, 127, 129);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 130, 131);
			}
			
			(
				(
					a1 = IDENTIFIER					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 132);
				}
				
				
				|				(
					a2 = SCHEMA_QUALIFIED_NAME					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 133);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 134);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 135);
	}
	
	a3 = KEYWORD_NOT {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 136);
	}
	
	a4 = KEYWORD_NULL {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createNotNullColumnConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_7_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 137, 139);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_8_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 140, 141);
			}
			
			(
				(
					a1 = IDENTIFIER					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 142);
				}
				
				
				|				(
					a2 = SCHEMA_QUALIFIED_NAME					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 143);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 144);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 145);
	}
	
	(
		(
			a3 = 'UNIQUE' {
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
			|			a4 = 'PRIMARY KEY' {
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
		)
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 146, 148);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 149, 150);
			}
			
			(
				(
					a1 = IDENTIFIER					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 151);
				}
				
				
				|				(
					a2 = SCHEMA_QUALIFIED_NAME					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 152);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 153);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 154);
	}
	
	a3 = KEYWORD_REFERENCES {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 155, 156);
	}
	
	(
		(
			a4 = IDENTIFIER			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 157, 160);
		}
		
		
		|		(
			a5 = SCHEMA_QUALIFIED_NAME			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 161, 164);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 165, 168);
	}
	
	(
		(
			a6 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 169);
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
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_3_0_0_1, proxy, true);
						copyLocalizationInfos((CommonToken) a7, element);
						copyLocalizationInfos((CommonToken) a7, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 170, 171);
			}
			
			(
				(
					a8 = ',' {
						if (element == null) {
							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_3_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a8, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, 172);
					}
					
					(
						a9 = IDENTIFIER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 173, 174);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, 175, 176);
			}
			
			a10 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialColumnConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_9_0_0_3_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 177, 179);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 180, 182);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 183, 184);
			}
			
			(
				(
					a1 = IDENTIFIER					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 185);
				}
				
				
				|				(
					a2 = SCHEMA_QUALIFIED_NAME					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 186);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 187);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 188);
	}
	
	(
		(
			a3 = 'UNIQUE' {
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
			|			a4 = 'PRIMARY KEY' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 189);
	}
	
	a7 = '(' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 190);
	}
	
	(
		a8 = IDENTIFIER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 191, 192);
	}
	
	(
		(
			a9 = ',' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 193);
			}
			
			(
				a10 = IDENTIFIER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 194, 195);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, 196, 197);
	}
	
	a11 = ')' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createUniqueTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_10_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 198, 199);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 200, 201);
			}
			
			(
				(
					a1 = IDENTIFIER					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 202);
				}
				
				
				|				(
					a2 = SCHEMA_QUALIFIED_NAME					
					{
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
				)
				{
					// expected elements (follow set)
					addExpectedElement(null, 203);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 204);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 205);
	}
	
	a3 = KEYWORD_FOREIGN {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 206);
	}
	
	a4 = KEYWORD_KEY {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 207);
	}
	
	a5 = '(' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 208);
	}
	
	(
		a6 = IDENTIFIER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 209, 210);
	}
	
	(
		(
			a7 = ',' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 211);
			}
			
			(
				a8 = IDENTIFIER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 212, 213);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, 214, 215);
	}
	
	a9 = ')' {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 216);
	}
	
	a10 = KEYWORD_REFERENCES {
		if (element == null) {
			element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 217, 218);
	}
	
	(
		(
			a11 = IDENTIFIER			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 219, 221);
		}
		
		
		|		(
			a12 = SCHEMA_QUALIFIED_NAME			
			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(null, 222, 224);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 225, 227);
	}
	
	(
		(
			a13 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 228);
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
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_9_0_0_1, proxy, true);
						copyLocalizationInfos((CommonToken) a14, element);
						copyLocalizationInfos((CommonToken) a14, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 229, 230);
			}
			
			(
				(
					a15 = ',' {
						if (element == null) {
							element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_9_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a15, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, 231);
					}
					
					(
						a16 = IDENTIFIER						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 232, 233);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, 234, 235);
			}
			
			a17 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.schema.SchemaFactory.eINSTANCE.createReferentialTableConstraint();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_11_0_0_9_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a17, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 236, 237);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 238, 239);
	}
	
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
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_12_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 240);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 241, 246);
		addExpectedElement(null, 247, 249);
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
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_13_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 250);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 251, 256);
		addExpectedElement(null, 257, 259);
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
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_14_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 260);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 261, 266);
		addExpectedElement(null, 267, 269);
	}
	
;

parse_org_emftext_language_sql_literal_IntervalLiteral returns [org.emftext.language.sql.literal.IntervalLiteral element = null]
@init{
}
:
	a0 = KEYWORD_INTERVAL {
		if (element == null) {
			element = org.emftext.language.sql.literal.LiteralFactory.eINSTANCE.createIntervalLiteral();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_15_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 270);
	}
	
	(
		(
			a1 = '+' {
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
			|			a2 = '-' {
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
		)
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 271, 276);
		addExpectedElement(null, 277, 279);
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
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_16_0_0_0, true, true);
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
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_16_0_0_0, false, true);
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
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 280, 285);
		addExpectedElement(null, 286, 288);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_0, null, true);
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
		addExpectedElement(null, 289, 292);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 293, 298);
		addExpectedElement(null, 299, 301);
	}
	
	(
		(
			a7 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 302);
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
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_1_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a8, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 303);
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 304, 306);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 307, 312);
				addExpectedElement(null, 313, 315);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 316, 318);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 319, 324);
		addExpectedElement(null, 325, 327);
	}
	
	(
		(
			a10 = KEYWORD_CHARACTER {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 328);
			}
			
			a11 = KEYWORD_SET {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 329);
			}
			
			(
				a12 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 330, 331);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 332, 337);
				addExpectedElement(null, 338, 340);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 341, 342);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 343, 348);
		addExpectedElement(null, 349, 351);
	}
	
	(
		(
			a13 = KEYWORD_COLLATE {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_17_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 352);
			}
			
			(
				a14 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 353);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 354, 359);
				addExpectedElement(null, 360, 362);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 363);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 364, 369);
		addExpectedElement(null, 370, 372);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.NationalCharacterStringTypeKind.NATIONAL_CHAR_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), value);
				completedElement(value, false);
			}
			|			a2 = 'NCHAR' {
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
			|			a3 = 'NATIONAL CHARACTER VARYING' {
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
			|			a4 = 'NATIONAL CHAR VARYING' {
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
			|			a5 = 'NCHAR VARYING' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 373, 375);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 376, 381);
		addExpectedElement(null, 382, 384);
	}
	
	(
		(
			a8 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 385);
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
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_1_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a9, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 386);
			}
			
			a10 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 387, 388);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 389, 394);
				addExpectedElement(null, 395, 397);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 398, 399);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 400, 405);
		addExpectedElement(null, 406, 408);
	}
	
	(
		(
			a11 = KEYWORD_COLLATE {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createNationalCharacterStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_18_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 409);
			}
			
			(
				a12 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 410);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 411, 416);
				addExpectedElement(null, 417, 419);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 420);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 421, 426);
		addExpectedElement(null, 427, 429);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_0, null, true);
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
		addExpectedElement(null, 430, 431);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 432, 437);
		addExpectedElement(null, 438, 440);
	}
	
	(
		(
			a4 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringType(), 441);
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
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_1_0_0_1, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 442);
			}
			
			a6 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createBinaryLargeObjectStringType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_19_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 443);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 444, 449);
				addExpectedElement(null, 450, 452);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 453);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 454, 459);
		addExpectedElement(null, 460, 462);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 463, 465);
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
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_1, null, true);
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
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_1, null, true);
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
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_1, null, true);
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
		addExpectedElement(null, 466, 467);
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
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_2, null, true);
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
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_2, null, true);
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
					retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_20_0_0_2, null, true);
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
		addExpectedElement(null, 468);
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
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_21_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 469);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 470, 475);
		addExpectedElement(null, 476, 478);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_0, null, true);
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
		addExpectedElement(null, 479, 480);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 481, 486);
		addExpectedElement(null, 487, 489);
	}
	
	(
		(
			a9 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 490);
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
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 491, 492);
			}
			
			(
				(
					a11 = ',' {
						if (element == null) {
							element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_2_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a11, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(null, 493);
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
								retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_2_0_0_1, resolved, true);
								copyLocalizationInfos((CommonToken) a12, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 494);
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(null, 495);
			}
			
			a13 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createExactNumericType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_22_0_0_1_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 496);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 497, 502);
				addExpectedElement(null, 503, 505);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 506);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 507, 512);
		addExpectedElement(null, 513, 515);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of enumeration attribute
				Object value = org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericTypeKind().getEEnumLiteral(org.emftext.language.sql.datatype.ApproximateNumericTypeKind.REAL_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND), value);
				completedElement(value, false);
			}
			|			a2 = 'DOUBLE_PRECISION' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 516, 517);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 518, 523);
		addExpectedElement(null, 524, 526);
	}
	
	(
		(
			a5 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 527);
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
						retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_1_0_0_1, resolved, true);
						copyLocalizationInfos((CommonToken) a6, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 528);
			}
			
			a7 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createApproximateNumericType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_23_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(null, 529);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 530, 535);
				addExpectedElement(null, 536, 538);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 539);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 540, 545);
		addExpectedElement(null, 546, 548);
	}
	
;

parse_org_emftext_language_sql_datatype_DatetimeType returns [org.emftext.language.sql.datatype.DatetimeType element = null]
@init{
}
:
	(
		(
			a0 = 'DATE' {
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
			|			a1 = 'TIME' {
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
			|			a2 = 'TIMESTAMP' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 549, 551);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 552, 557);
		addExpectedElement(null, 558, 560);
	}
	
	(
		(
			a5 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 561);
			}
			
			(
				a6 = UNSIGNED_INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 562);
			}
			
			a7 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.datatype.DatatypeFactory.eINSTANCE.createDatetimeType();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_24_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 563, 564);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 565, 570);
				addExpectedElement(null, 571, 573);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 574, 575);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 576, 581);
		addExpectedElement(null, 582, 584);
	}
	
	(
		(
			(
				a8 = 'WITH TIME ZONE' {
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
				|				a9 = 'WITHOUT TIME ZONE' {
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
			)
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 585);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 586, 591);
		addExpectedElement(null, 592, 594);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
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
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_0, null, true);
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
		addExpectedElement(null, 595);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 596, 601);
		addExpectedElement(null, 602, 604);
	}
	
	(
		(
			a7 = '(' {
				if (element == null) {
					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, 605);
			}
			
			(
				a8 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 606);
			}
			
			a9 = ')' {
				if (element == null) {
					element = org.emftext.language.sql.function.FunctionFactory.eINSTANCE.createDatetimeValueFunction();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_25_0_0_1_0_0_2, null, true);
				copyLocalizationInfos((CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 607, 612);
				addExpectedElement(null, 613, 615);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 616, 621);
		addExpectedElement(null, 622, 624);
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
		retrieveLayoutInformation(element, org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.SQL_26_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), 625, 630);
		addExpectedElement(null, 631, 633);
	}
	
;

parse_org_emftext_language_sql_common_DirectSQLStatement returns [org.emftext.language.sql.common.DirectSQLStatement element = null]
:
	c0 = parse_org_emftext_language_sql_schema_TableDefinition{ element = c0; /* this is a subclass or primitive expression choice */ }
	
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
	c0 = parse_org_emftext_language_sql_datatype_CharacterStringType{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_sql_datatype_NationalCharacterStringType{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_sql_datatype_BinaryLargeObjectStringType{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_sql_datatype_BooleanType{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_sql_datatype_ExactNumericType{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_emftext_language_sql_datatype_ApproximateNumericType{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_emftext_language_sql_datatype_DatetimeType{ element = c6; /* this is a subclass or primitive expression choice */ }
	
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
	c0 = parse_org_emftext_language_sql_literal_DateLiteral{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_emftext_language_sql_literal_TimeLiteral{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_emftext_language_sql_literal_TimestampLiteral{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_emftext_language_sql_literal_IntervalLiteral{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_emftext_language_sql_literal_BooleanLiteral{ element = c4; /* this is a subclass or primitive expression choice */ }
	
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

KEYWORD_CREATE: (LETTER_C LETTER_R LETTER_E LETTER_A LETTER_T LETTER_E);

KEYWORD_TEMPORARY: (LETTER_T LETTER_E LETTER_M LETTER_P LETTER_O LETTER_R LETTER_A LETTER_R LETTER_Y);

KEYWORD_TABLE: (LETTER_T LETTER_A LETTER_B LETTER_L LETTER_E);

KEYWORD_ON: (LETTER_O LETTER_N);

KEYWORD_COMMIT: (LETTER_C LETTER_O LETTER_M LETTER_M LETTER_I LETTER_T);

KEYWORD_ROWS: (LETTER_R LETTER_O LETTER_W LETTER_S);

KEYWORD_DEFAULT: (LETTER_D LETTER_E LETTER_F LETTER_A LETTER_U LETTER_L LETTER_T);

KEYWORD_COLLATE: (LETTER_C LETTER_O LETTER_L LETTER_L LETTER_A LETTER_T LETTER_E);

KEYWORD_CONSTRAINT: (LETTER_C LETTER_O LETTER_N LETTER_S LETTER_T LETTER_R LETTER_A LETTER_I LETTER_N LETTER_T);

KEYWORD_NOT: (LETTER_N LETTER_O LETTER_T);

KEYWORD_NULL: (LETTER_N LETTER_U LETTER_L LETTER_L);

KEYWORD_REFERENCES: (LETTER_R LETTER_E LETTER_F LETTER_E LETTER_R LETTER_E LETTER_N LETTER_C LETTER_E LETTER_S);

KEYWORD_FOREIGN: (LETTER_F LETTER_O LETTER_R LETTER_E LETTER_I LETTER_G LETTER_N);

KEYWORD_KEY: (LETTER_K LETTER_E LETTER_Y);

KEYWORD_DATE: (LETTER_D LETTER_A LETTER_T LETTER_E);

KEYWORD_TIME: (LETTER_T LETTER_I LETTER_M LETTER_E);

KEYWORD_TIMESTAMP: (LETTER_T LETTER_I LETTER_M LETTER_E LETTER_S LETTER_T LETTER_A LETTER_M LETTER_P);

KEYWORD_INTERVAL: (LETTER_I LETTER_N LETTER_T LETTER_E LETTER_R LETTER_V LETTER_A LETTER_L);

KEYWORD_CHARACTER: (LETTER_C LETTER_H LETTER_A LETTER_R LETTER_A LETTER_C LETTER_T LETTER_E LETTER_R);

KEYWORD_SET: (LETTER_S LETTER_E LETTER_T);

KEYWORD_BOOLEAN: (LETTER_B LETTER_O LETTER_O LETTER_L LETTER_E LETTER_A LETTER_N);

BOOLEAN_LITERAL:
	(('TRUE' | 'FALSE' | 'UNKNOWN'))
	{ _channel = 99; }
;
UNSIGNED_INTEGER:
	((('0'..'9'))+)
;
IDENTIFIER:
	(('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9'))*)
;
SCHEMA_QUALIFIED_NAME:
	(((('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9'))*'.')?('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9'))*'.')('A'..'Z'|'a'..'z')(('A'..'Z'|'a'..'z')|('0'..'9'))*)
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;

