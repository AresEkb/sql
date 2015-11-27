/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * This class provides an implementation of the
 * org.emftext.language.sql.resource.sql.ISqlTextDiagnostic interface. However, it
 * is recommended to use the
 * org.emftext.language.sql.resource.sql.mopp.SqlPrinter2 instead, because it
 * provides advanced printing features. There are even some features (e.g.,
 * printing enumeration terminals) which are only supported by that class.
 */
public class SqlPrinter implements org.emftext.language.sql.resource.sql.ISqlTextPrinter {
	
	protected org.emftext.language.sql.resource.sql.ISqlTokenResolverFactory tokenResolverFactory = new org.emftext.language.sql.resource.sql.mopp.SqlTokenResolverFactory();
	
	protected OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.emftext.language.sql.resource.sql.ISqlTextResource resource;
	
	private Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public SqlPrinter(OutputStream outputStream, org.emftext.language.sql.resource.sql.ISqlTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(Map<String, Integer> featureCounter, Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(EObject element, PrintWriter out, String globaltab) {
		if (element == null) {
			throw new IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.emftext.language.sql.common.SQLScript) {
			print_org_emftext_language_sql_common_SQLScript((org.emftext.language.sql.common.SQLScript) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.common.SimpleComment) {
			print_org_emftext_language_sql_common_SimpleComment((org.emftext.language.sql.common.SimpleComment) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.common.BracketedComment) {
			print_org_emftext_language_sql_common_BracketedComment((org.emftext.language.sql.common.BracketedComment) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.common.SchemaQualifiedName) {
			print_org_emftext_language_sql_common_SchemaQualifiedName((org.emftext.language.sql.common.SchemaQualifiedName) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.literal.ExactNumericLiteral) {
			print_org_emftext_language_sql_literal_ExactNumericLiteral((org.emftext.language.sql.literal.ExactNumericLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.literal.ApproximateNumericLiteral) {
			print_org_emftext_language_sql_literal_ApproximateNumericLiteral((org.emftext.language.sql.literal.ApproximateNumericLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.literal.CharacterStringLiteral) {
			print_org_emftext_language_sql_literal_CharacterStringLiteral((org.emftext.language.sql.literal.CharacterStringLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.literal.NationalCharacterStringLiteral) {
			print_org_emftext_language_sql_literal_NationalCharacterStringLiteral((org.emftext.language.sql.literal.NationalCharacterStringLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.literal.DateLiteral) {
			print_org_emftext_language_sql_literal_DateLiteral((org.emftext.language.sql.literal.DateLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.literal.TimeLiteral) {
			print_org_emftext_language_sql_literal_TimeLiteral((org.emftext.language.sql.literal.TimeLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.literal.TimestampLiteral) {
			print_org_emftext_language_sql_literal_TimestampLiteral((org.emftext.language.sql.literal.TimestampLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.literal.BooleanLiteral) {
			print_org_emftext_language_sql_literal_BooleanLiteral((org.emftext.language.sql.literal.BooleanLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.TableReference) {
			print_org_emftext_language_sql_schema_TableReference((org.emftext.language.sql.schema.TableReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.TableDefinition) {
			print_org_emftext_language_sql_schema_TableDefinition((org.emftext.language.sql.schema.TableDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.TableElementList) {
			print_org_emftext_language_sql_schema_TableElementList((org.emftext.language.sql.schema.TableElementList) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.Column) {
			print_org_emftext_language_sql_schema_Column((org.emftext.language.sql.schema.Column) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.LiteralDefaultOption) {
			print_org_emftext_language_sql_schema_LiteralDefaultOption((org.emftext.language.sql.schema.LiteralDefaultOption) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption) {
			print_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption((org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption) {
			print_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption((org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.NotNullColumnConstraint) {
			print_org_emftext_language_sql_schema_NotNullColumnConstraint((org.emftext.language.sql.schema.NotNullColumnConstraint) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.UniqueColumnConstraint) {
			print_org_emftext_language_sql_schema_UniqueColumnConstraint((org.emftext.language.sql.schema.UniqueColumnConstraint) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.ReferentialColumnConstraint) {
			print_org_emftext_language_sql_schema_ReferentialColumnConstraint((org.emftext.language.sql.schema.ReferentialColumnConstraint) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.UniqueTableConstraint) {
			print_org_emftext_language_sql_schema_UniqueTableConstraint((org.emftext.language.sql.schema.UniqueTableConstraint) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.schema.ReferentialTableConstraint) {
			print_org_emftext_language_sql_schema_ReferentialTableConstraint((org.emftext.language.sql.schema.ReferentialTableConstraint) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.ExactNumericType) {
			print_org_emftext_language_sql_datatype_ExactNumericType((org.emftext.language.sql.datatype.ExactNumericType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.ApproximateNumericType) {
			print_org_emftext_language_sql_datatype_ApproximateNumericType((org.emftext.language.sql.datatype.ApproximateNumericType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.CharacterStringType) {
			print_org_emftext_language_sql_datatype_CharacterStringType((org.emftext.language.sql.datatype.CharacterStringType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.NationalCharacterStringType) {
			print_org_emftext_language_sql_datatype_NationalCharacterStringType((org.emftext.language.sql.datatype.NationalCharacterStringType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.BinaryLargeObjectStringType) {
			print_org_emftext_language_sql_datatype_BinaryLargeObjectStringType((org.emftext.language.sql.datatype.BinaryLargeObjectStringType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.LargeObjectLength) {
			print_org_emftext_language_sql_datatype_LargeObjectLength((org.emftext.language.sql.datatype.LargeObjectLength) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.DateType) {
			print_org_emftext_language_sql_datatype_DateType((org.emftext.language.sql.datatype.DateType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.TimeType) {
			print_org_emftext_language_sql_datatype_TimeType((org.emftext.language.sql.datatype.TimeType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.TimestampType) {
			print_org_emftext_language_sql_datatype_TimestampType((org.emftext.language.sql.datatype.TimestampType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.datatype.BooleanType) {
			print_org_emftext_language_sql_datatype_BooleanType((org.emftext.language.sql.datatype.BooleanType) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.function.DatetimeValueFunction) {
			print_org_emftext_language_sql_function_DatetimeValueFunction((org.emftext.language.sql.function.DatetimeValueFunction) element, globaltab, out);
			return;
		}
		if (element instanceof org.emftext.language.sql.expression.NullSpecification) {
			print_org_emftext_language_sql_expression_NullSpecification((org.emftext.language.sql.expression.NullSpecification) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.emftext.language.sql.resource.sql.mopp.SqlReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.emftext.language.sql.resource.sql.mopp.SqlReferenceResolverSwitch) new org.emftext.language.sql.resource.sql.mopp.SqlMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, EObject cause) {
		org.emftext.language.sql.resource.sql.ISqlTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.emftext.language.sql.resource.sql.mopp.SqlProblem(errorMessage, org.emftext.language.sql.resource.sql.SqlEProblemType.PRINT_PROBLEM, org.emftext.language.sql.resource.sql.SqlEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(Map<?,?> options) {
		this.options = options;
	}
	
	public Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public org.emftext.language.sql.resource.sql.ISqlTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(EObject element) throws java.io.IOException {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
	}
	
	public void print_org_emftext_language_sql_common_SQLScript(org.emftext.language.sql.common.SQLScript element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SQL_SCRIPT__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_sql_common_SQLScript_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_sql_common_SQLScript_0(org.emftext.language.sql.common.SQLScript element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SQL_SCRIPT__STATEMENTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	
	public void print_org_emftext_language_sql_common_SimpleComment(org.emftext.language.sql.common.SimpleComment element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SIMPLE_COMMENT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SIMPLE_COMMENT__VALUE));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("SIMPLE_COMMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SIMPLE_COMMENT__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_common_BracketedComment(org.emftext.language.sql.common.BracketedComment element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.BRACKETED_COMMENT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.BRACKETED_COMMENT__VALUE));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("BRACKETED_COMMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.BRACKETED_COMMENT__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_common_SchemaQualifiedName(org.emftext.language.sql.common.SchemaQualifiedName element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME));
		printCountingMap.put("catalogName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME));
		printCountingMap.put("schemaName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_common_SchemaQualifiedName_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__NAME));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_common_SchemaQualifiedName_0(org.emftext.language.sql.common.SchemaQualifiedName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_common_SchemaQualifiedName_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("schemaName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("schemaName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_common_SchemaQualifiedName_0_0(org.emftext.language.sql.common.SchemaQualifiedName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("catalogName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("catalogName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_sql_literal_ExactNumericLiteral(org.emftext.language.sql.literal.ExactNumericLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"value"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"value"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("value");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE));
					if (o != null) {
						org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE), element));
						out.print(" ");
					}
					printCountingMap.put("value", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("value");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE));
				if (o != null) {
					org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("EXACT_NUMERIC_LITERAL");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE), element));
					out.print(" ");
				}
				printCountingMap.put("value", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_sql_literal_ApproximateNumericLiteral(org.emftext.language.sql.literal.ApproximateNumericLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.APPROXIMATE_NUMERIC_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.APPROXIMATE_NUMERIC_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("APPROXIMATE_NUMERIC_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.APPROXIMATE_NUMERIC_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_literal_CharacterStringLiteral(org.emftext.language.sql.literal.CharacterStringLiteral element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES));
		printCountingMap.put("values", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__SEPARATORS));
		printCountingMap.put("separators", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME));
		printCountingMap.put("characterSetName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_literal_CharacterStringLiteral_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("values");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES), element));
				out.print(" ");
			}
			printCountingMap.put("values", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_sql_literal_CharacterStringLiteral_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_sql_literal_CharacterStringLiteral_0(org.emftext.language.sql.literal.CharacterStringLiteral element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("_");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("characterSetName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("characterSetName", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_literal_CharacterStringLiteral_1(org.emftext.language.sql.literal.CharacterStringLiteral element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("separators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__SEPARATORS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("separators", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("values");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES), element));
				out.print(" ");
			}
			printCountingMap.put("values", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_literal_NationalCharacterStringLiteral(org.emftext.language.sql.literal.NationalCharacterStringLiteral element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES));
		printCountingMap.put("values", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS));
		printCountingMap.put("separators", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("N");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("values");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES), element));
				out.print(" ");
			}
			printCountingMap.put("values", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_sql_literal_NationalCharacterStringLiteral_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_emftext_language_sql_literal_NationalCharacterStringLiteral_0(org.emftext.language.sql.literal.NationalCharacterStringLiteral element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("separators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("separators", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("values");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES), element));
				out.print(" ");
			}
			printCountingMap.put("values", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_literal_DateLiteral(org.emftext.language.sql.literal.DateLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.DATE_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("DATE");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.DATE_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.DATE_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_literal_TimeLiteral(org.emftext.language.sql.literal.TimeLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIME_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("TIME");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIME_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIME_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_literal_TimestampLiteral(org.emftext.language.sql.literal.TimestampLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIMESTAMP_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("TIMESTAMP");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIMESTAMP_LITERAL__VALUE));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIMESTAMP_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_literal_BooleanLiteral(org.emftext.language.sql.literal.BooleanLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.BOOLEAN_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.BOOLEAN_LITERAL__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_TableReference(org.emftext.language.sql.schema.TableReference element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__CATALOG_NAME));
		printCountingMap.put("catalogName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME));
		printCountingMap.put("schemaName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_TableReference_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__TARGET));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableReferenceTargetReferenceResolver().deResolve((org.emftext.language.sql.schema.TableDefinition) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__TARGET)), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_TableReference_0(org.emftext.language.sql.schema.TableReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_TableReference_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("schemaName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("schemaName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_schema_TableReference_0_0(org.emftext.language.sql.schema.TableReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("catalogName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__CATALOG_NAME));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__CATALOG_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("catalogName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_sql_schema_TableDefinition(org.emftext.language.sql.schema.TableDefinition element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME));
		printCountingMap.put("schemaQualifiedName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE));
		printCountingMap.put("scope", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE));
		printCountingMap.put("contentsSource", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("CREATE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_emftext_language_sql_schema_TableDefinition_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("TABLE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("schemaQualifiedName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("schemaQualifiedName", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("contentsSource");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("contentsSource", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	public void print_org_emftext_language_sql_schema_TableDefinition_0(org.emftext.language.sql.schema.TableDefinition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"scope"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"scope"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (EnumTerminal)
				count = printCountingMap.get("scope");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE));
					if (o != null) {
					}
					printCountingMap.put("scope", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print("TEMPORARY");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (EnumTerminal)
			count = printCountingMap.get("scope");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE));
				if (o != null) {
				}
				printCountingMap.put("scope", count - 1);
			}
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_TableElementList(org.emftext.language.sql.schema.TableElementList element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_ELEMENT_LIST__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_ELEMENT_LIST__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_ELEMENT_LIST__ELEMENTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_sql_schema_TableElementList_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_schema_TableElementList_0(org.emftext.language.sql.schema.TableElementList element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_ELEMENT_LIST__ELEMENTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_Column(org.emftext.language.sql.schema.Column element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__DATA_TYPE));
		printCountingMap.put("dataType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__DEFAULT_OPTION));
		printCountingMap.put("defaultOption", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__CONSTRAINT_DEFINITION));
		printCountingMap.put("constraintDefinition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__COLLATION_NAME));
		printCountingMap.put("collationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__NAME));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__DATA_TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("dataType", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_Column_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constraintDefinition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__CONSTRAINT_DEFINITION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("constraintDefinition", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_Column_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_Column_0(org.emftext.language.sql.schema.Column element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("DEFAULT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("defaultOption");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__DEFAULT_OPTION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("defaultOption", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_Column_1(org.emftext.language.sql.schema.Column element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("COLLATE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("collationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__COLLATION_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("collationName", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_LiteralDefaultOption(org.emftext.language.sql.schema.LiteralDefaultOption element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.LITERAL_DEFAULT_OPTION__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL));
		printCountingMap.put("literal", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("literal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("literal", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_DatetimeValueFunctionDefaultOption(org.emftext.language.sql.schema.DatetimeValueFunctionDefaultOption element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION));
		printCountingMap.put("function", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("function");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("function", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_ImplicitlyTypedValueSpecificationDefaultOption(org.emftext.language.sql.schema.ImplicitlyTypedValueSpecificationDefaultOption element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION));
		printCountingMap.put("specification", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("specification");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("specification", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_NotNullColumnConstraint(org.emftext.language.sql.schema.NotNullColumnConstraint element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
		printCountingMap.put("schemaQualifiedName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_NotNullColumnConstraint_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("NOT");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("NULL");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_schema_NotNullColumnConstraint_0(org.emftext.language.sql.schema.NotNullColumnConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("CONSTRAINT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("schemaQualifiedName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("schemaQualifiedName", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_UniqueColumnConstraint(org.emftext.language.sql.schema.UniqueColumnConstraint element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
		printCountingMap.put("schemaQualifiedName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_UniqueColumnConstraint_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_UniqueColumnConstraint_0(org.emftext.language.sql.schema.UniqueColumnConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("CONSTRAINT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("schemaQualifiedName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("schemaQualifiedName", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_ReferentialColumnConstraint(org.emftext.language.sql.schema.ReferentialColumnConstraint element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS));
		printCountingMap.put("referencedColumns", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE));
		printCountingMap.put("referencedTable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
		printCountingMap.put("schemaQualifiedName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_ReferentialColumnConstraint_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("REFERENCES");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("referencedTable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("referencedTable", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_ReferentialColumnConstraint_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_ReferentialColumnConstraint_0(org.emftext.language.sql.schema.ReferentialColumnConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("CONSTRAINT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("schemaQualifiedName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("schemaQualifiedName", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_ReferentialColumnConstraint_1(org.emftext.language.sql.schema.ReferentialColumnConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("referencedColumns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedColumnsReferenceResolver().deResolve((org.emftext.language.sql.schema.Column) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS)), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS), element));
				out.print(" ");
			}
			printCountingMap.put("referencedColumns", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_sql_schema_ReferentialColumnConstraint_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_schema_ReferentialColumnConstraint_1_0(org.emftext.language.sql.schema.ReferentialColumnConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("referencedColumns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedColumnsReferenceResolver().deResolve((org.emftext.language.sql.schema.Column) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS)), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS), element));
				out.print(" ");
			}
			printCountingMap.put("referencedColumns", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_UniqueTableConstraint(org.emftext.language.sql.schema.UniqueTableConstraint element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
		printCountingMap.put("schemaQualifiedName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS));
		printCountingMap.put("columns", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_UniqueTableConstraint_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("columns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableColumnsConstraintColumnsReferenceResolver().deResolve((org.emftext.language.sql.schema.Column) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS)), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), element));
				out.print(" ");
			}
			printCountingMap.put("columns", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_sql_schema_UniqueTableConstraint_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_schema_UniqueTableConstraint_0(org.emftext.language.sql.schema.UniqueTableConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("CONSTRAINT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("schemaQualifiedName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("schemaQualifiedName", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_UniqueTableConstraint_1(org.emftext.language.sql.schema.UniqueTableConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("columns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableColumnsConstraintColumnsReferenceResolver().deResolve((org.emftext.language.sql.schema.Column) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS)), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), element));
				out.print(" ");
			}
			printCountingMap.put("columns", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_schema_ReferentialTableConstraint(org.emftext.language.sql.schema.ReferentialTableConstraint element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS));
		printCountingMap.put("referencedColumns", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE));
		printCountingMap.put("referencedTable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
		printCountingMap.put("schemaQualifiedName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS));
		printCountingMap.put("columns", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_ReferentialTableConstraint_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("FOREIGN");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("KEY");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("columns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableColumnsConstraintColumnsReferenceResolver().deResolve((org.emftext.language.sql.schema.Column) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS)), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), element));
				out.print(" ");
			}
			printCountingMap.put("columns", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_sql_schema_ReferentialTableConstraint_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("REFERENCES");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("referencedTable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("referencedTable", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_schema_ReferentialTableConstraint_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_ReferentialTableConstraint_0(org.emftext.language.sql.schema.ReferentialTableConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("CONSTRAINT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("schemaQualifiedName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("schemaQualifiedName", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_ReferentialTableConstraint_1(org.emftext.language.sql.schema.ReferentialTableConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("columns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getTableColumnsConstraintColumnsReferenceResolver().deResolve((org.emftext.language.sql.schema.Column) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS)), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), element));
				out.print(" ");
			}
			printCountingMap.put("columns", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_schema_ReferentialTableConstraint_2(org.emftext.language.sql.schema.ReferentialTableConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("referencedColumns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedColumnsReferenceResolver().deResolve((org.emftext.language.sql.schema.Column) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS)), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS), element));
				out.print(" ");
			}
			printCountingMap.put("referencedColumns", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_emftext_language_sql_schema_ReferentialTableConstraint_2_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_schema_ReferentialTableConstraint_2_0(org.emftext.language.sql.schema.ReferentialTableConstraint element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("referencedColumns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferentialConstraintReferencedColumnsReferenceResolver().deResolve((org.emftext.language.sql.schema.Column) o, element, (EReference) element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS)), element.eClass().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS), element));
				out.print(" ");
			}
			printCountingMap.put("referencedColumns", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_datatype_ExactNumericType(org.emftext.language.sql.datatype.ExactNumericType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION));
		printCountingMap.put("precision", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__SCALE));
		printCountingMap.put("scale", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_ExactNumericType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_datatype_ExactNumericType_0(org.emftext.language.sql.datatype.ExactNumericType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("precision");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION), element));
				out.print(" ");
			}
			printCountingMap.put("precision", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_ExactNumericType_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_datatype_ExactNumericType_0_0(org.emftext.language.sql.datatype.ExactNumericType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("scale");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__SCALE));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__SCALE), element));
				out.print(" ");
			}
			printCountingMap.put("scale", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_datatype_ApproximateNumericType(org.emftext.language.sql.datatype.ApproximateNumericType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION));
		printCountingMap.put("precision", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_ApproximateNumericType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_datatype_ApproximateNumericType_0(org.emftext.language.sql.datatype.ApproximateNumericType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("precision");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION), element));
				out.print(" ");
			}
			printCountingMap.put("precision", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_sql_datatype_CharacterStringType(org.emftext.language.sql.datatype.CharacterStringType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__LENGTH));
		printCountingMap.put("length", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME));
		printCountingMap.put("characterSetName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME));
		printCountingMap.put("collationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_CharacterStringType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_CharacterStringType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_CharacterStringType_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_datatype_CharacterStringType_0(org.emftext.language.sql.datatype.CharacterStringType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("length");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__LENGTH));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__LENGTH), element));
				out.print(" ");
			}
			printCountingMap.put("length", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_datatype_CharacterStringType_1(org.emftext.language.sql.datatype.CharacterStringType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("CHARACTER");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SET");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("characterSetName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("characterSetName", count - 1);
		}
	}
	
	public void print_org_emftext_language_sql_datatype_CharacterStringType_2(org.emftext.language.sql.datatype.CharacterStringType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("COLLATE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("collationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("collationName", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_datatype_NationalCharacterStringType(org.emftext.language.sql.datatype.NationalCharacterStringType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH));
		printCountingMap.put("length", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME));
		printCountingMap.put("collationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_NationalCharacterStringType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_NationalCharacterStringType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_datatype_NationalCharacterStringType_0(org.emftext.language.sql.datatype.NationalCharacterStringType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("length");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH), element));
				out.print(" ");
			}
			printCountingMap.put("length", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_datatype_NationalCharacterStringType_1(org.emftext.language.sql.datatype.NationalCharacterStringType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("COLLATE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("collationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("collationName", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_datatype_BinaryLargeObjectStringType(org.emftext.language.sql.datatype.BinaryLargeObjectStringType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH));
		printCountingMap.put("length", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_datatype_BinaryLargeObjectStringType_0(org.emftext.language.sql.datatype.BinaryLargeObjectStringType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("length");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("length", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_sql_datatype_LargeObjectLength(org.emftext.language.sql.datatype.LargeObjectLength element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER));
		printCountingMap.put("multiplier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__UNITS));
		printCountingMap.put("units", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__VALUE));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("multiplier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER));
			if (o != null) {
			}
			printCountingMap.put("multiplier", count - 1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("units");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__UNITS));
			if (o != null) {
			}
			printCountingMap.put("units", count - 1);
		}
	}
	
	
	public void print_org_emftext_language_sql_datatype_DateType(org.emftext.language.sql.datatype.DateType element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("DATE");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_sql_datatype_TimeType(org.emftext.language.sql.datatype.TimeType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__PRECISION));
		printCountingMap.put("precision", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__WITH_TIME_ZONE));
		printCountingMap.put("withTimeZone", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("TIME");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_TimeType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_TimeType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_datatype_TimeType_0(org.emftext.language.sql.datatype.TimeType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("precision");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__PRECISION));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__PRECISION), element));
				out.print(" ");
			}
			printCountingMap.put("precision", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_datatype_TimeType_1(org.emftext.language.sql.datatype.TimeType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("withTimeZone");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__WITH_TIME_ZONE));
			if (o != null) {
			}
			printCountingMap.put("withTimeZone", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("TIME");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("ZONE");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_sql_datatype_TimestampType(org.emftext.language.sql.datatype.TimestampType element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__PRECISION));
		printCountingMap.put("precision", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE));
		printCountingMap.put("withTimeZone", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("TIMESTAMP");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_TimestampType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_datatype_TimestampType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_datatype_TimestampType_0(org.emftext.language.sql.datatype.TimestampType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("precision");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__PRECISION));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__PRECISION), element));
				out.print(" ");
			}
			printCountingMap.put("precision", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_emftext_language_sql_datatype_TimestampType_1(org.emftext.language.sql.datatype.TimestampType element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("withTimeZone");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE));
			if (o != null) {
			}
			printCountingMap.put("withTimeZone", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("TIME");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("ZONE");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_sql_datatype_BooleanType(org.emftext.language.sql.datatype.BooleanType element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("BOOLEAN");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_sql_function_DatetimeValueFunction(org.emftext.language.sql.function.DatetimeValueFunction element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND));
		printCountingMap.put("kind", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION));
		printCountingMap.put("precision", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("kind");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND));
			if (o != null) {
			}
			printCountingMap.put("kind", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_emftext_language_sql_function_DatetimeValueFunction_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_emftext_language_sql_function_DatetimeValueFunction_0(org.emftext.language.sql.function.DatetimeValueFunction element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("precision");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION));
			if (o != null) {
				org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver = tokenResolverFactory.createTokenResolver("UNSIGNED_INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION), element));
				out.print(" ");
			}
			printCountingMap.put("precision", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_emftext_language_sql_expression_NullSpecification(org.emftext.language.sql.expression.NullSpecification element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("NULL");
		out.print(" ");
	}
	
	
}
