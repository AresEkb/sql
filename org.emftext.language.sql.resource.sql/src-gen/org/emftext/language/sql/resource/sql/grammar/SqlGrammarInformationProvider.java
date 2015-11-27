/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;

import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

public class SqlGrammarInformationProvider {
	
	public final static EStructuralFeature ANONYMOUS_FEATURE = EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static SqlGrammarInformationProvider INSTANCE = new SqlGrammarInformationProvider();
	
	private Set<String> keywords;
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_0_0_0_0_0_0_0 = INSTANCE.getSQL_0_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_0_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SQL_SCRIPT__STATEMENTS), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlLineBreak SQL_0_0_0_0_0_0_1 = INSTANCE.getSQL_0_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlLineBreak getSQL_0_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlLineBreak(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_0_0_0_0_0_0 = INSTANCE.getSQL_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_0_0_0_0_0_0_0, SQL_0_0_0_0_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_0_0_0_0_0 = INSTANCE.getSQL_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_0_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_0_0_0_0 = INSTANCE.getSQL_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_0_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.STAR);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_0_0_0 = INSTANCE.getSQL_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_0_0 = INSTANCE.getSQL_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_0_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class SQLScript
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_0 = INSTANCE.getSQL_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(), SQL_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_1_0_0_0 = INSTANCE.getSQL_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSimpleComment().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SIMPLE_COMMENT__VALUE), "SIMPLE_COMMENT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_1_0_0 = INSTANCE.getSQL_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_1_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_1_0 = INSTANCE.getSQL_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_1_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * SimpleComment
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_1 = INSTANCE.getSQL_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSimpleComment(), SQL_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_2_0_0_0 = INSTANCE.getSQL_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getBracketedComment().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.BRACKETED_COMMENT__VALUE), "BRACKETED_COMMENT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_2_0_0 = INSTANCE.getSQL_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_2_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_2_0 = INSTANCE.getSQL_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_2_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * BracketedComment
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_2 = INSTANCE.getSQL_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getBracketedComment(), SQL_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_3_0_0_0_0_0_0_0_0_0 = INSTANCE.getSQL_3_0_0_0_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_3_0_0_0_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__CATALOG_NAME), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_3_0_0_0_0_0_0_0_0_1 = INSTANCE.getSQL_3_0_0_0_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_3_0_0_0_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(".", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_3_0_0_0_0_0_0_0_0 = INSTANCE.getSQL_3_0_0_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_3_0_0_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_3_0_0_0_0_0_0_0_0_0, SQL_3_0_0_0_0_0_0_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_3_0_0_0_0_0_0_0 = INSTANCE.getSQL_3_0_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_3_0_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_3_0_0_0_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_3_0_0_0_0_0_0 = INSTANCE.getSQL_3_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_3_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_3_0_0_0_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_3_0_0_0_0_0_1 = INSTANCE.getSQL_3_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_3_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__SCHEMA_NAME), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_3_0_0_0_0_0_2 = INSTANCE.getSQL_3_0_0_0_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_3_0_0_0_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(".", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_3_0_0_0_0_0 = INSTANCE.getSQL_3_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_3_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_3_0_0_0_0_0_0, SQL_3_0_0_0_0_0_1, SQL_3_0_0_0_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_3_0_0_0_0 = INSTANCE.getSQL_3_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_3_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_3_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_3_0_0_0 = INSTANCE.getSQL_3_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_3_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_3_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_3_0_0_1 = INSTANCE.getSQL_3_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_3_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName().getEStructuralFeature(org.emftext.language.sql.common.CommonPackage.SCHEMA_QUALIFIED_NAME__NAME), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_3_0_0 = INSTANCE.getSQL_3_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_3_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_3_0_0_0, SQL_3_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_3_0 = INSTANCE.getSQL_3_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_3_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_3_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * SchemaQualifiedName
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_3 = INSTANCE.getSQL_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), SQL_3_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_4_0_0_0 = INSTANCE.getSQL_4_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_4_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getExactNumericLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE), "EXACT_NUMERIC_LITERAL", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_4_0_0 = INSTANCE.getSQL_4_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_4_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_4_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_4_0_1_0 = INSTANCE.getSQL_4_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_4_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getExactNumericLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.EXACT_NUMERIC_LITERAL__VALUE), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_4_0_1 = INSTANCE.getSQL_4_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_4_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_4_0_1_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_4_0 = INSTANCE.getSQL_4_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_4_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_4_0_0, SQL_4_0_1);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ExactNumericLiteral
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_4 = INSTANCE.getSQL_4();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_4() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getExactNumericLiteral(), SQL_4_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_5_0_0_0 = INSTANCE.getSQL_5_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_5_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getApproximateNumericLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.APPROXIMATE_NUMERIC_LITERAL__VALUE), "APPROXIMATE_NUMERIC_LITERAL", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_5_0_0 = INSTANCE.getSQL_5_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_5_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_5_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_5_0 = INSTANCE.getSQL_5_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_5_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_5_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ApproximateNumericLiteral
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_5 = INSTANCE.getSQL_5();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_5() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getApproximateNumericLiteral(), SQL_5_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_6_0_0_0_0_0_0 = INSTANCE.getSQL_6_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_6_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("_", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_6_0_0_0_0_0_1 = INSTANCE.getSQL_6_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_6_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__CHARACTER_SET_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_6_0_0_0_0_0 = INSTANCE.getSQL_6_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_6_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_6_0_0_0_0_0_0, SQL_6_0_0_0_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_6_0_0_0_0 = INSTANCE.getSQL_6_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_6_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_6_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_6_0_0_0 = INSTANCE.getSQL_6_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_6_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_6_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_6_0_0_1 = INSTANCE.getSQL_6_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_6_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES), "QUOTED_STRING", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_6_0_0_2_0_0_0 = INSTANCE.getSQL_6_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_6_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__SEPARATORS), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSeparator(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_6_0_0_2_0_0_1 = INSTANCE.getSQL_6_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_6_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.CHARACTER_STRING_LITERAL__VALUES), "QUOTED_STRING", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_6_0_0_2_0_0 = INSTANCE.getSQL_6_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_6_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_6_0_0_2_0_0_0, SQL_6_0_0_2_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_6_0_0_2_0 = INSTANCE.getSQL_6_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_6_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_6_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_6_0_0_2 = INSTANCE.getSQL_6_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_6_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_6_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.STAR);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_6_0_0 = INSTANCE.getSQL_6_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_6_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_6_0_0_0, SQL_6_0_0_1, SQL_6_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_6_0 = INSTANCE.getSQL_6_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_6_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_6_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * CharacterStringLiteral
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_6 = INSTANCE.getSQL_6();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_6() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(), SQL_6_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_7_0_0_0 = INSTANCE.getSQL_7_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_7_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("N", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_7_0_0_1 = INSTANCE.getSQL_7_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_7_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES), "QUOTED_STRING", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_7_0_0_2_0_0_0 = INSTANCE.getSQL_7_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_7_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__SEPARATORS), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSeparator(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_7_0_0_2_0_0_1 = INSTANCE.getSQL_7_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_7_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.NATIONAL_CHARACTER_STRING_LITERAL__VALUES), "QUOTED_STRING", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_7_0_0_2_0_0 = INSTANCE.getSQL_7_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_7_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_7_0_0_2_0_0_0, SQL_7_0_0_2_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_7_0_0_2_0 = INSTANCE.getSQL_7_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_7_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_7_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_7_0_0_2 = INSTANCE.getSQL_7_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_7_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_7_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.STAR);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_7_0_0 = INSTANCE.getSQL_7_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_7_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_7_0_0_0, SQL_7_0_0_1, SQL_7_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_7_0 = INSTANCE.getSQL_7_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_7_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_7_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * NationalCharacterStringLiteral
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_7 = INSTANCE.getSQL_7();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_7() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral(), SQL_7_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_8_0_0_0 = INSTANCE.getSQL_8_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_8_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("DATE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_8_0_0_1 = INSTANCE.getSQL_8_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_8_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getDateLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.DATE_LITERAL__VALUE), "QUOTED_STRING", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_8_0_0 = INSTANCE.getSQL_8_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_8_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_8_0_0_0, SQL_8_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_8_0 = INSTANCE.getSQL_8_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_8_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_8_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class DateLiteral
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_8 = INSTANCE.getSQL_8();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_8() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getDateLiteral(), SQL_8_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_9_0_0_0 = INSTANCE.getSQL_9_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_9_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("TIME", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_9_0_0_1 = INSTANCE.getSQL_9_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_9_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getTimeLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIME_LITERAL__VALUE), "QUOTED_STRING", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_9_0_0 = INSTANCE.getSQL_9_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_9_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_9_0_0_0, SQL_9_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_9_0 = INSTANCE.getSQL_9_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_9_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_9_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class TimeLiteral
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_9 = INSTANCE.getSQL_9();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_9() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getTimeLiteral(), SQL_9_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_10_0_0_0 = INSTANCE.getSQL_10_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_10_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("TIMESTAMP", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_10_0_0_1 = INSTANCE.getSQL_10_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_10_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getTimestampLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.TIMESTAMP_LITERAL__VALUE), "QUOTED_STRING", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_10_0_0 = INSTANCE.getSQL_10_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_10_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_10_0_0_0, SQL_10_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_10_0 = INSTANCE.getSQL_10_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_10_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_10_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * TimestampLiteral
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_10 = INSTANCE.getSQL_10();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_10() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getTimestampLiteral(), SQL_10_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal SQL_11_0_0_0 = INSTANCE.getSQL_11_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal getSQL_11_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getBooleanLiteral().getEStructuralFeature(org.emftext.language.sql.literal.LiteralPackage.BOOLEAN_LITERAL__VALUE), "TRUE", "FALSE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_11_0_0 = INSTANCE.getSQL_11_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_11_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_11_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_11_0 = INSTANCE.getSQL_11_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_11_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_11_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * BooleanLiteral
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_11 = INSTANCE.getSQL_11();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_11() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getBooleanLiteral(), SQL_11_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_12_0_0_0_0_0_0_0_0_0 = INSTANCE.getSQL_12_0_0_0_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_12_0_0_0_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableReference().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__CATALOG_NAME), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_12_0_0_0_0_0_0_0_0_1 = INSTANCE.getSQL_12_0_0_0_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_12_0_0_0_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(".", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_12_0_0_0_0_0_0_0_0 = INSTANCE.getSQL_12_0_0_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_12_0_0_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_12_0_0_0_0_0_0_0_0_0, SQL_12_0_0_0_0_0_0_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_12_0_0_0_0_0_0_0 = INSTANCE.getSQL_12_0_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_12_0_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_12_0_0_0_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_12_0_0_0_0_0_0 = INSTANCE.getSQL_12_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_12_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_12_0_0_0_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_12_0_0_0_0_0_1 = INSTANCE.getSQL_12_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_12_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableReference().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__SCHEMA_NAME), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_12_0_0_0_0_0_2 = INSTANCE.getSQL_12_0_0_0_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_12_0_0_0_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(".", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_12_0_0_0_0_0 = INSTANCE.getSQL_12_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_12_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_12_0_0_0_0_0_0, SQL_12_0_0_0_0_0_1, SQL_12_0_0_0_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_12_0_0_0_0 = INSTANCE.getSQL_12_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_12_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_12_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_12_0_0_0 = INSTANCE.getSQL_12_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_12_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_12_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_12_0_0_1 = INSTANCE.getSQL_12_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_12_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableReference().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_REFERENCE__TARGET), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_12_0_0 = INSTANCE.getSQL_12_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_12_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_12_0_0_0, SQL_12_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_12_0 = INSTANCE.getSQL_12_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_12_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_12_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * TableReference
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_12 = INSTANCE.getSQL_12();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_12() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableReference(), SQL_12_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_13_0_0_0 = INSTANCE.getSQL_13_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_13_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("CREATE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_13_0_0_1_0_0_0 = INSTANCE.getSQL_13_0_0_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_13_0_0_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), new String[] {"PERSISTENT", "", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_13_0_0_1_0_0 = INSTANCE.getSQL_13_0_0_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_13_0_0_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_13_0_0_1_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_13_0_0_1_0_1_0 = INSTANCE.getSQL_13_0_0_1_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_13_0_0_1_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCOPE), new String[] {"GLOBAL_TEMPORARY", "GLOBAL", "LOCAL_TEMPORARY", "LOCAL", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_13_0_0_1_0_1_1 = INSTANCE.getSQL_13_0_0_1_0_1_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_13_0_0_1_0_1_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("TEMPORARY", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_13_0_0_1_0_1 = INSTANCE.getSQL_13_0_0_1_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_13_0_0_1_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_13_0_0_1_0_1_0, SQL_13_0_0_1_0_1_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_13_0_0_1_0 = INSTANCE.getSQL_13_0_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_13_0_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_13_0_0_1_0_0, SQL_13_0_0_1_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_13_0_0_1 = INSTANCE.getSQL_13_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_13_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_13_0_0_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_13_0_0_2 = INSTANCE.getSQL_13_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_13_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("TABLE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_13_0_0_3 = INSTANCE.getSQL_13_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_13_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__SCHEMA_QUALIFIED_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlLineBreak SQL_13_0_0_4 = INSTANCE.getSQL_13_0_0_4();
	private org.emftext.language.sql.resource.sql.grammar.SqlLineBreak getSQL_13_0_0_4() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlLineBreak(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_13_0_0_5 = INSTANCE.getSQL_13_0_0_5();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_13_0_0_5() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_DEFINITION__CONTENTS_SOURCE), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableContentsSource(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_13_0_0_6 = INSTANCE.getSQL_13_0_0_6();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_13_0_0_6() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(";", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlLineBreak SQL_13_0_0_7 = INSTANCE.getSQL_13_0_0_7();
	private org.emftext.language.sql.resource.sql.grammar.SqlLineBreak getSQL_13_0_0_7() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlLineBreak(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_13_0_0 = INSTANCE.getSQL_13_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_13_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_13_0_0_0, SQL_13_0_0_1, SQL_13_0_0_2, SQL_13_0_0_3, SQL_13_0_0_4, SQL_13_0_0_5, SQL_13_0_0_6, SQL_13_0_0_7);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_13_0 = INSTANCE.getSQL_13_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_13_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_13_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * TableDefinition
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_13 = INSTANCE.getSQL_13();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_13() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(), SQL_13_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_14_0_0_0 = INSTANCE.getSQL_14_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_14_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlLineBreak SQL_14_0_0_1 = INSTANCE.getSQL_14_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlLineBreak getSQL_14_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlLineBreak(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_14_0_0_2 = INSTANCE.getSQL_14_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_14_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_ELEMENT_LIST__ELEMENTS), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElement(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_14_0_0_3_0_0_0 = INSTANCE.getSQL_14_0_0_3_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_14_0_0_3_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(",", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlLineBreak SQL_14_0_0_3_0_0_1 = INSTANCE.getSQL_14_0_0_3_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlLineBreak getSQL_14_0_0_3_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlLineBreak(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_14_0_0_3_0_0_2 = INSTANCE.getSQL_14_0_0_3_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_14_0_0_3_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.TABLE_ELEMENT_LIST__ELEMENTS), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElement(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_14_0_0_3_0_0 = INSTANCE.getSQL_14_0_0_3_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_14_0_0_3_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_14_0_0_3_0_0_0, SQL_14_0_0_3_0_0_1, SQL_14_0_0_3_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_14_0_0_3_0 = INSTANCE.getSQL_14_0_0_3_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_14_0_0_3_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_14_0_0_3_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_14_0_0_3 = INSTANCE.getSQL_14_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_14_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_14_0_0_3_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.STAR);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlLineBreak SQL_14_0_0_4 = INSTANCE.getSQL_14_0_0_4();
	private org.emftext.language.sql.resource.sql.grammar.SqlLineBreak getSQL_14_0_0_4() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlLineBreak(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_14_0_0_5 = INSTANCE.getSQL_14_0_0_5();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_14_0_0_5() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_14_0_0 = INSTANCE.getSQL_14_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_14_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_14_0_0_0, SQL_14_0_0_1, SQL_14_0_0_2, SQL_14_0_0_3, SQL_14_0_0_4, SQL_14_0_0_5);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_14_0 = INSTANCE.getSQL_14_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_14_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_14_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * TableElementList
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_14 = INSTANCE.getSQL_14();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_14() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(), SQL_14_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_15_0_0_0 = INSTANCE.getSQL_15_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_15_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__NAME), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_15_0_0_1 = INSTANCE.getSQL_15_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_15_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__DATA_TYPE), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getDataType(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_15_0_0_2_0_0_0 = INSTANCE.getSQL_15_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_15_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("DEFAULT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_15_0_0_2_0_0_1 = INSTANCE.getSQL_15_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_15_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__DEFAULT_OPTION), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getDefaultOption(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_15_0_0_2_0_0 = INSTANCE.getSQL_15_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_15_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_15_0_0_2_0_0_0, SQL_15_0_0_2_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_15_0_0_2_0 = INSTANCE.getSQL_15_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_15_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_15_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_15_0_0_2 = INSTANCE.getSQL_15_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_15_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_15_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_15_0_0_3 = INSTANCE.getSQL_15_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_15_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__CONSTRAINT_DEFINITION), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK, new EClass[] {org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumnConstraint(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_15_0_0_4_0_0_0 = INSTANCE.getSQL_15_0_0_4_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_15_0_0_4_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("COLLATE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_15_0_0_4_0_0_1 = INSTANCE.getSQL_15_0_0_4_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_15_0_0_4_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.COLUMN__COLLATION_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_15_0_0_4_0_0 = INSTANCE.getSQL_15_0_0_4_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_15_0_0_4_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_15_0_0_4_0_0_0, SQL_15_0_0_4_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_15_0_0_4_0 = INSTANCE.getSQL_15_0_0_4_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_15_0_0_4_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_15_0_0_4_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_15_0_0_4 = INSTANCE.getSQL_15_0_0_4();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_15_0_0_4() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_15_0_0_4_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_15_0_0 = INSTANCE.getSQL_15_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_15_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_15_0_0_0, SQL_15_0_0_1, SQL_15_0_0_2, SQL_15_0_0_3, SQL_15_0_0_4);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_15_0 = INSTANCE.getSQL_15_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_15_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_15_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class Column
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_15 = INSTANCE.getSQL_15();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_15() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(), SQL_15_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_16_0_0_0 = INSTANCE.getSQL_16_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_16_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getLiteralDefaultOption().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.LITERAL_DEFAULT_OPTION__LITERAL), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getLiteral(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_16_0_0 = INSTANCE.getSQL_16_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_16_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_16_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_16_0 = INSTANCE.getSQL_16_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_16_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_16_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * LiteralDefaultOption
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_16 = INSTANCE.getSQL_16();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_16() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getLiteralDefaultOption(), SQL_16_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_17_0_0_0 = INSTANCE.getSQL_17_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_17_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getDatetimeValueFunctionDefaultOption().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.DATETIME_VALUE_FUNCTION_DEFAULT_OPTION__FUNCTION), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunction(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_17_0_0 = INSTANCE.getSQL_17_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_17_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_17_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_17_0 = INSTANCE.getSQL_17_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_17_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_17_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * DatetimeValueFunctionDefaultOption
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_17 = INSTANCE.getSQL_17();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_17() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getDatetimeValueFunctionDefaultOption(), SQL_17_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_18_0_0_0 = INSTANCE.getSQL_18_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_18_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getImplicitlyTypedValueSpecificationDefaultOption().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.IMPLICITLY_TYPED_VALUE_SPECIFICATION_DEFAULT_OPTION__SPECIFICATION), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.expression.ExpressionPackage.eINSTANCE.getImplicitlyTypedValueSpecification(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_18_0_0 = INSTANCE.getSQL_18_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_18_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_18_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_18_0 = INSTANCE.getSQL_18_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_18_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_18_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ImplicitlyTypedValueSpecificationDefaultOption
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_18 = INSTANCE.getSQL_18();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_18() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getImplicitlyTypedValueSpecificationDefaultOption(), SQL_18_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_19_0_0_0_0_0_0 = INSTANCE.getSQL_19_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_19_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("CONSTRAINT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_19_0_0_0_0_0_1 = INSTANCE.getSQL_19_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_19_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getNotNullColumnConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.NOT_NULL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_19_0_0_0_0_0 = INSTANCE.getSQL_19_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_19_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_19_0_0_0_0_0_0, SQL_19_0_0_0_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_19_0_0_0_0 = INSTANCE.getSQL_19_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_19_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_19_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_19_0_0_0 = INSTANCE.getSQL_19_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_19_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_19_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_19_0_0_1 = INSTANCE.getSQL_19_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_19_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("NOT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_19_0_0_2 = INSTANCE.getSQL_19_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_19_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("NULL", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_19_0_0 = INSTANCE.getSQL_19_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_19_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_19_0_0_0, SQL_19_0_0_1, SQL_19_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_19_0 = INSTANCE.getSQL_19_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_19_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_19_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * NotNullColumnConstraint
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_19 = INSTANCE.getSQL_19();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_19() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getNotNullColumnConstraint(), SQL_19_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_20_0_0_0_0_0_0 = INSTANCE.getSQL_20_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_20_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("CONSTRAINT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_20_0_0_0_0_0_1 = INSTANCE.getSQL_20_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_20_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueColumnConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_20_0_0_0_0_0 = INSTANCE.getSQL_20_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_20_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_20_0_0_0_0_0_0, SQL_20_0_0_0_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_20_0_0_0_0 = INSTANCE.getSQL_20_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_20_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_20_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_20_0_0_0 = INSTANCE.getSQL_20_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_20_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_20_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_20_0_0_1 = INSTANCE.getSQL_20_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_20_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueColumnConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_COLUMN_CONSTRAINT__KIND), new String[] {"UNIQUE", "UNIQUE", "PRIMARY_KEY", "PRIMARY KEY", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_20_0_0 = INSTANCE.getSQL_20_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_20_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_20_0_0_0, SQL_20_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_20_0 = INSTANCE.getSQL_20_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_20_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_20_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * UniqueColumnConstraint
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_20 = INSTANCE.getSQL_20();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_20() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueColumnConstraint(), SQL_20_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_21_0_0_0_0_0_0 = INSTANCE.getSQL_21_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_21_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("CONSTRAINT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_21_0_0_0_0_0_1 = INSTANCE.getSQL_21_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_21_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__SCHEMA_QUALIFIED_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_21_0_0_0_0_0 = INSTANCE.getSQL_21_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_21_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_21_0_0_0_0_0_0, SQL_21_0_0_0_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_21_0_0_0_0 = INSTANCE.getSQL_21_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_21_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_21_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_21_0_0_0 = INSTANCE.getSQL_21_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_21_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_21_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_21_0_0_1 = INSTANCE.getSQL_21_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_21_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("REFERENCES", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_21_0_0_2 = INSTANCE.getSQL_21_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_21_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_TABLE), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableReference(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_21_0_0_3_0_0_0 = INSTANCE.getSQL_21_0_0_3_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_21_0_0_3_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_21_0_0_3_0_0_1 = INSTANCE.getSQL_21_0_0_3_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_21_0_0_3_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_21_0_0_3_0_0_2_0_0_0 = INSTANCE.getSQL_21_0_0_3_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_21_0_0_3_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(",", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_21_0_0_3_0_0_2_0_0_1 = INSTANCE.getSQL_21_0_0_3_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_21_0_0_3_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_COLUMN_CONSTRAINT__REFERENCED_COLUMNS), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_21_0_0_3_0_0_2_0_0 = INSTANCE.getSQL_21_0_0_3_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_21_0_0_3_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_21_0_0_3_0_0_2_0_0_0, SQL_21_0_0_3_0_0_2_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_21_0_0_3_0_0_2_0 = INSTANCE.getSQL_21_0_0_3_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_21_0_0_3_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_21_0_0_3_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_21_0_0_3_0_0_2 = INSTANCE.getSQL_21_0_0_3_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_21_0_0_3_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_21_0_0_3_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.STAR);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_21_0_0_3_0_0_3 = INSTANCE.getSQL_21_0_0_3_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_21_0_0_3_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_21_0_0_3_0_0 = INSTANCE.getSQL_21_0_0_3_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_21_0_0_3_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_21_0_0_3_0_0_0, SQL_21_0_0_3_0_0_1, SQL_21_0_0_3_0_0_2, SQL_21_0_0_3_0_0_3);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_21_0_0_3_0 = INSTANCE.getSQL_21_0_0_3_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_21_0_0_3_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_21_0_0_3_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_21_0_0_3 = INSTANCE.getSQL_21_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_21_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_21_0_0_3_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_21_0_0 = INSTANCE.getSQL_21_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_21_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_21_0_0_0, SQL_21_0_0_1, SQL_21_0_0_2, SQL_21_0_0_3);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_21_0 = INSTANCE.getSQL_21_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_21_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_21_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ReferentialColumnConstraint
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_21 = INSTANCE.getSQL_21();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_21() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint(), SQL_21_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_22_0_0_0_0_0_0 = INSTANCE.getSQL_22_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_22_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("CONSTRAINT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_22_0_0_0_0_0_1 = INSTANCE.getSQL_22_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_22_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_22_0_0_0_0_0 = INSTANCE.getSQL_22_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_22_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_22_0_0_0_0_0_0, SQL_22_0_0_0_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_22_0_0_0_0 = INSTANCE.getSQL_22_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_22_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_22_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_22_0_0_0 = INSTANCE.getSQL_22_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_22_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_22_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_22_0_0_1 = INSTANCE.getSQL_22_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_22_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__KIND), new String[] {"UNIQUE", "UNIQUE", "PRIMARY_KEY", "PRIMARY KEY", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_22_0_0_2 = INSTANCE.getSQL_22_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_22_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_22_0_0_3 = INSTANCE.getSQL_22_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_22_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_22_0_0_4_0_0_0 = INSTANCE.getSQL_22_0_0_4_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_22_0_0_4_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(",", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_22_0_0_4_0_0_1 = INSTANCE.getSQL_22_0_0_4_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_22_0_0_4_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.UNIQUE_TABLE_CONSTRAINT__COLUMNS), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_22_0_0_4_0_0 = INSTANCE.getSQL_22_0_0_4_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_22_0_0_4_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_22_0_0_4_0_0_0, SQL_22_0_0_4_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_22_0_0_4_0 = INSTANCE.getSQL_22_0_0_4_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_22_0_0_4_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_22_0_0_4_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_22_0_0_4 = INSTANCE.getSQL_22_0_0_4();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_22_0_0_4() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_22_0_0_4_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.STAR);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_22_0_0_5 = INSTANCE.getSQL_22_0_0_5();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_22_0_0_5() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_22_0_0 = INSTANCE.getSQL_22_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_22_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_22_0_0_0, SQL_22_0_0_1, SQL_22_0_0_2, SQL_22_0_0_3, SQL_22_0_0_4, SQL_22_0_0_5);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_22_0 = INSTANCE.getSQL_22_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_22_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_22_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * UniqueTableConstraint
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_22 = INSTANCE.getSQL_22();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_22() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint(), SQL_22_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_0_0_0_0 = INSTANCE.getSQL_23_0_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("CONSTRAINT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_23_0_0_0_0_0_1 = INSTANCE.getSQL_23_0_0_0_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_23_0_0_0_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__SCHEMA_QUALIFIED_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_23_0_0_0_0_0 = INSTANCE.getSQL_23_0_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_23_0_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0_0_0_0_0, SQL_23_0_0_0_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_23_0_0_0_0 = INSTANCE.getSQL_23_0_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_23_0_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_23_0_0_0 = INSTANCE.getSQL_23_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_23_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_23_0_0_0_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_1 = INSTANCE.getSQL_23_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("FOREIGN", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_2 = INSTANCE.getSQL_23_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("KEY", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_3 = INSTANCE.getSQL_23_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_23_0_0_4 = INSTANCE.getSQL_23_0_0_4();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_23_0_0_4() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_5_0_0_0 = INSTANCE.getSQL_23_0_0_5_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_5_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(",", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_23_0_0_5_0_0_1 = INSTANCE.getSQL_23_0_0_5_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_23_0_0_5_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__COLUMNS), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_23_0_0_5_0_0 = INSTANCE.getSQL_23_0_0_5_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_23_0_0_5_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0_5_0_0_0, SQL_23_0_0_5_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_23_0_0_5_0 = INSTANCE.getSQL_23_0_0_5_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_23_0_0_5_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0_5_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_23_0_0_5 = INSTANCE.getSQL_23_0_0_5();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_23_0_0_5() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_23_0_0_5_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.STAR);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_6 = INSTANCE.getSQL_23_0_0_6();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_6() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_7 = INSTANCE.getSQL_23_0_0_7();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_7() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("REFERENCES", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_23_0_0_8 = INSTANCE.getSQL_23_0_0_8();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_23_0_0_8() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_TABLE), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableReference(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_9_0_0_0 = INSTANCE.getSQL_23_0_0_9_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_9_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_23_0_0_9_0_0_1 = INSTANCE.getSQL_23_0_0_9_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_23_0_0_9_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_9_0_0_2_0_0_0 = INSTANCE.getSQL_23_0_0_9_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_9_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(",", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_23_0_0_9_0_0_2_0_0_1 = INSTANCE.getSQL_23_0_0_9_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_23_0_0_9_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint().getEStructuralFeature(org.emftext.language.sql.schema.SchemaPackage.REFERENTIAL_TABLE_CONSTRAINT__REFERENCED_COLUMNS), "IDENTIFIER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_23_0_0_9_0_0_2_0_0 = INSTANCE.getSQL_23_0_0_9_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_23_0_0_9_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0_9_0_0_2_0_0_0, SQL_23_0_0_9_0_0_2_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_23_0_0_9_0_0_2_0 = INSTANCE.getSQL_23_0_0_9_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_23_0_0_9_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0_9_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_23_0_0_9_0_0_2 = INSTANCE.getSQL_23_0_0_9_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_23_0_0_9_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_23_0_0_9_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.STAR);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_23_0_0_9_0_0_3 = INSTANCE.getSQL_23_0_0_9_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_23_0_0_9_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_23_0_0_9_0_0 = INSTANCE.getSQL_23_0_0_9_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_23_0_0_9_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0_9_0_0_0, SQL_23_0_0_9_0_0_1, SQL_23_0_0_9_0_0_2, SQL_23_0_0_9_0_0_3);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_23_0_0_9_0 = INSTANCE.getSQL_23_0_0_9_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_23_0_0_9_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0_9_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_23_0_0_9 = INSTANCE.getSQL_23_0_0_9();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_23_0_0_9() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_23_0_0_9_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_23_0_0 = INSTANCE.getSQL_23_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_23_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0_0, SQL_23_0_0_1, SQL_23_0_0_2, SQL_23_0_0_3, SQL_23_0_0_4, SQL_23_0_0_5, SQL_23_0_0_6, SQL_23_0_0_7, SQL_23_0_0_8, SQL_23_0_0_9);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_23_0 = INSTANCE.getSQL_23_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_23_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_23_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ReferentialTableConstraint
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_23 = INSTANCE.getSQL_23();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_23() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint(), SQL_23_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_24_0_0_0 = INSTANCE.getSQL_24_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_24_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__KIND), new String[] {"NUMERIC", "NUMERIC", "DECIMAL", "DECIMAL", "DEC", "DEC", "SMALLINT", "SMALLINT", "INTEGER", "INTEGER", "INT", "INT", "BIGINT", "BIGINT", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_24_0_0_1_0_0_0 = INSTANCE.getSQL_24_0_0_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_24_0_0_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_24_0_0_1_0_0_1 = INSTANCE.getSQL_24_0_0_1_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_24_0_0_1_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__PRECISION), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_24_0_0_1_0_0_2_0_0_0 = INSTANCE.getSQL_24_0_0_1_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_24_0_0_1_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(",", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_24_0_0_1_0_0_2_0_0_1 = INSTANCE.getSQL_24_0_0_1_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_24_0_0_1_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.EXACT_NUMERIC_TYPE__SCALE), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_24_0_0_1_0_0_2_0_0 = INSTANCE.getSQL_24_0_0_1_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_24_0_0_1_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_24_0_0_1_0_0_2_0_0_0, SQL_24_0_0_1_0_0_2_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_24_0_0_1_0_0_2_0 = INSTANCE.getSQL_24_0_0_1_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_24_0_0_1_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_24_0_0_1_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_24_0_0_1_0_0_2 = INSTANCE.getSQL_24_0_0_1_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_24_0_0_1_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_24_0_0_1_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_24_0_0_1_0_0_3 = INSTANCE.getSQL_24_0_0_1_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_24_0_0_1_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_24_0_0_1_0_0 = INSTANCE.getSQL_24_0_0_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_24_0_0_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_24_0_0_1_0_0_0, SQL_24_0_0_1_0_0_1, SQL_24_0_0_1_0_0_2, SQL_24_0_0_1_0_0_3);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_24_0_0_1_0 = INSTANCE.getSQL_24_0_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_24_0_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_24_0_0_1_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_24_0_0_1 = INSTANCE.getSQL_24_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_24_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_24_0_0_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_24_0_0 = INSTANCE.getSQL_24_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_24_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_24_0_0_0, SQL_24_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_24_0 = INSTANCE.getSQL_24_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_24_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_24_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ExactNumericType
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_24 = INSTANCE.getSQL_24();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_24() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericType(), SQL_24_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_25_0_0_0 = INSTANCE.getSQL_25_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_25_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__KIND), new String[] {"FLOAT", "FLOAT", "REAL", "REAL", "DOUBLE_PRECISION", "DOUBLE PRECISION", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_25_0_0_1_0_0_0 = INSTANCE.getSQL_25_0_0_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_25_0_0_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_25_0_0_1_0_0_1 = INSTANCE.getSQL_25_0_0_1_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_25_0_0_1_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.APPROXIMATE_NUMERIC_TYPE__PRECISION), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_25_0_0_1_0_0_2 = INSTANCE.getSQL_25_0_0_1_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_25_0_0_1_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_25_0_0_1_0_0 = INSTANCE.getSQL_25_0_0_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_25_0_0_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_25_0_0_1_0_0_0, SQL_25_0_0_1_0_0_1, SQL_25_0_0_1_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_25_0_0_1_0 = INSTANCE.getSQL_25_0_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_25_0_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_25_0_0_1_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_25_0_0_1 = INSTANCE.getSQL_25_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_25_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_25_0_0_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_25_0_0 = INSTANCE.getSQL_25_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_25_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_25_0_0_0, SQL_25_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_25_0 = INSTANCE.getSQL_25_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_25_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_25_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * ApproximateNumericType
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_25 = INSTANCE.getSQL_25();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_25() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericType(), SQL_25_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_26_0_0_0 = INSTANCE.getSQL_26_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_26_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__KIND), new String[] {"CHARACTER", "CHARACTER", "CHAR", "CHAR", "VARCHAR", "VARCHAR", "CHARACTER_VARYING", "CHARACTER VARYING", "CHAR_VARYING", "CHAR VARYING", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_26_0_0_1_0_0_0 = INSTANCE.getSQL_26_0_0_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_26_0_0_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_26_0_0_1_0_0_1 = INSTANCE.getSQL_26_0_0_1_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_26_0_0_1_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__LENGTH), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_26_0_0_1_0_0_2 = INSTANCE.getSQL_26_0_0_1_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_26_0_0_1_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_26_0_0_1_0_0 = INSTANCE.getSQL_26_0_0_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_26_0_0_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_26_0_0_1_0_0_0, SQL_26_0_0_1_0_0_1, SQL_26_0_0_1_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_26_0_0_1_0 = INSTANCE.getSQL_26_0_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_26_0_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_26_0_0_1_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_26_0_0_1 = INSTANCE.getSQL_26_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_26_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_26_0_0_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_26_0_0_2_0_0_0 = INSTANCE.getSQL_26_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_26_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("CHARACTER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_26_0_0_2_0_0_1 = INSTANCE.getSQL_26_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_26_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("SET", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_26_0_0_2_0_0_2 = INSTANCE.getSQL_26_0_0_2_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_26_0_0_2_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__CHARACTER_SET_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_26_0_0_2_0_0 = INSTANCE.getSQL_26_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_26_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_26_0_0_2_0_0_0, SQL_26_0_0_2_0_0_1, SQL_26_0_0_2_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_26_0_0_2_0 = INSTANCE.getSQL_26_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_26_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_26_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_26_0_0_2 = INSTANCE.getSQL_26_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_26_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_26_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_26_0_0_3_0_0_0 = INSTANCE.getSQL_26_0_0_3_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_26_0_0_3_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("COLLATE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_26_0_0_3_0_0_1 = INSTANCE.getSQL_26_0_0_3_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_26_0_0_3_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.CHARACTER_STRING_TYPE__COLLATION_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_26_0_0_3_0_0 = INSTANCE.getSQL_26_0_0_3_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_26_0_0_3_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_26_0_0_3_0_0_0, SQL_26_0_0_3_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_26_0_0_3_0 = INSTANCE.getSQL_26_0_0_3_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_26_0_0_3_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_26_0_0_3_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_26_0_0_3 = INSTANCE.getSQL_26_0_0_3();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_26_0_0_3() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_26_0_0_3_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_26_0_0 = INSTANCE.getSQL_26_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_26_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_26_0_0_0, SQL_26_0_0_1, SQL_26_0_0_2, SQL_26_0_0_3);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_26_0 = INSTANCE.getSQL_26_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_26_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_26_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * CharacterStringType
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_26 = INSTANCE.getSQL_26();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_26() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType(), SQL_26_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_27_0_0_0 = INSTANCE.getSQL_27_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_27_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__KIND), new String[] {"NATIONAL_CHARACTER", "NATIONAL CHARACTER", "NATIONAL_CHAR", "NATIONAL CHAR", "NATIONAL_CHARACTER_VARYING", "NATIONAL CHARACTER VARYING", "NATIONAL_CHAR_VARYING", "NATIONAL CHAR VARYING", "NCHAR", "NCHAR", "NCHAR_VARYING", "NCHAR VARYING", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_27_0_0_1_0_0_0 = INSTANCE.getSQL_27_0_0_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_27_0_0_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_27_0_0_1_0_0_1 = INSTANCE.getSQL_27_0_0_1_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_27_0_0_1_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__LENGTH), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_27_0_0_1_0_0_2 = INSTANCE.getSQL_27_0_0_1_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_27_0_0_1_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_27_0_0_1_0_0 = INSTANCE.getSQL_27_0_0_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_27_0_0_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_27_0_0_1_0_0_0, SQL_27_0_0_1_0_0_1, SQL_27_0_0_1_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_27_0_0_1_0 = INSTANCE.getSQL_27_0_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_27_0_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_27_0_0_1_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_27_0_0_1 = INSTANCE.getSQL_27_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_27_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_27_0_0_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_27_0_0_2_0_0_0 = INSTANCE.getSQL_27_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_27_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("COLLATE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_27_0_0_2_0_0_1 = INSTANCE.getSQL_27_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_27_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.NATIONAL_CHARACTER_STRING_TYPE__COLLATION_NAME), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_27_0_0_2_0_0 = INSTANCE.getSQL_27_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_27_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_27_0_0_2_0_0_0, SQL_27_0_0_2_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_27_0_0_2_0 = INSTANCE.getSQL_27_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_27_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_27_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_27_0_0_2 = INSTANCE.getSQL_27_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_27_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_27_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_27_0_0 = INSTANCE.getSQL_27_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_27_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_27_0_0_0, SQL_27_0_0_1, SQL_27_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_27_0 = INSTANCE.getSQL_27_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_27_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_27_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * NationalCharacterStringType
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_27 = INSTANCE.getSQL_27();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_27() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringType(), SQL_27_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_28_0_0_0 = INSTANCE.getSQL_28_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_28_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__KIND), new String[] {"BINARY_LARGE_OBJECT", "BINARY LARGE OBJECT", "BLOB", "BLOB", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_28_0_0_1_0_0_0 = INSTANCE.getSQL_28_0_0_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_28_0_0_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlContainment SQL_28_0_0_1_0_0_1 = INSTANCE.getSQL_28_0_0_1_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlContainment getSQL_28_0_0_1_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlContainment(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.BINARY_LARGE_OBJECT_STRING_TYPE__LENGTH), org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, new EClass[] {org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getLargeObjectLength(), }, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_28_0_0_1_0_0_2 = INSTANCE.getSQL_28_0_0_1_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_28_0_0_1_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_28_0_0_1_0_0 = INSTANCE.getSQL_28_0_0_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_28_0_0_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_28_0_0_1_0_0_0, SQL_28_0_0_1_0_0_1, SQL_28_0_0_1_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_28_0_0_1_0 = INSTANCE.getSQL_28_0_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_28_0_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_28_0_0_1_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_28_0_0_1 = INSTANCE.getSQL_28_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_28_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_28_0_0_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_28_0_0 = INSTANCE.getSQL_28_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_28_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_28_0_0_0, SQL_28_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_28_0 = INSTANCE.getSQL_28_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_28_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_28_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * BinaryLargeObjectStringType
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_28 = INSTANCE.getSQL_28();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_28() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringType(), SQL_28_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_29_0_0_0 = INSTANCE.getSQL_29_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_29_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getLargeObjectLength().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__VALUE), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_29_0_0_1 = INSTANCE.getSQL_29_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_29_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getLargeObjectLength().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__MULTIPLIER), new String[] {"K", "K", "M", "M", "G", "G", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_29_0_0_2 = INSTANCE.getSQL_29_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_29_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getLargeObjectLength().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.LARGE_OBJECT_LENGTH__UNITS), new String[] {"CHARACTERS", "CHARACTERS", "CODE_UNITS", "CODE_UNITS", "OCTETS", "OCTETS", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_29_0_0 = INSTANCE.getSQL_29_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_29_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_29_0_0_0, SQL_29_0_0_1, SQL_29_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_29_0 = INSTANCE.getSQL_29_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_29_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_29_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * LargeObjectLength
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_29 = INSTANCE.getSQL_29();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_29() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getLargeObjectLength(), SQL_29_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_30_0_0_0 = INSTANCE.getSQL_30_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_30_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("DATE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_30_0_0 = INSTANCE.getSQL_30_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_30_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_30_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_30_0 = INSTANCE.getSQL_30_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_30_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_30_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class DateType
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_30 = INSTANCE.getSQL_30();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_30() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getDateType(), SQL_30_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_31_0_0_0 = INSTANCE.getSQL_31_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_31_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("TIME", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_31_0_0_1_0_0_0 = INSTANCE.getSQL_31_0_0_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_31_0_0_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_31_0_0_1_0_0_1 = INSTANCE.getSQL_31_0_0_1_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_31_0_0_1_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getTimeType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__PRECISION), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_31_0_0_1_0_0_2 = INSTANCE.getSQL_31_0_0_1_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_31_0_0_1_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_31_0_0_1_0_0 = INSTANCE.getSQL_31_0_0_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_31_0_0_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_31_0_0_1_0_0_0, SQL_31_0_0_1_0_0_1, SQL_31_0_0_1_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_31_0_0_1_0 = INSTANCE.getSQL_31_0_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_31_0_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_31_0_0_1_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_31_0_0_1 = INSTANCE.getSQL_31_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_31_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_31_0_0_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal SQL_31_0_0_2_0_0_0 = INSTANCE.getSQL_31_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal getSQL_31_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getTimeType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIME_TYPE__WITH_TIME_ZONE), "WITH", "WITHOUT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_31_0_0_2_0_0_1 = INSTANCE.getSQL_31_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_31_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("TIME", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_31_0_0_2_0_0_2 = INSTANCE.getSQL_31_0_0_2_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_31_0_0_2_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("ZONE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_31_0_0_2_0_0 = INSTANCE.getSQL_31_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_31_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_31_0_0_2_0_0_0, SQL_31_0_0_2_0_0_1, SQL_31_0_0_2_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_31_0_0_2_0 = INSTANCE.getSQL_31_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_31_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_31_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_31_0_0_2 = INSTANCE.getSQL_31_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_31_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_31_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_31_0_0 = INSTANCE.getSQL_31_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_31_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_31_0_0_0, SQL_31_0_0_1, SQL_31_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_31_0 = INSTANCE.getSQL_31_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_31_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_31_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class TimeType
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_31 = INSTANCE.getSQL_31();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_31() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getTimeType(), SQL_31_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_32_0_0_0 = INSTANCE.getSQL_32_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_32_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("TIMESTAMP", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_32_0_0_1_0_0_0 = INSTANCE.getSQL_32_0_0_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_32_0_0_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_32_0_0_1_0_0_1 = INSTANCE.getSQL_32_0_0_1_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_32_0_0_1_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getTimestampType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__PRECISION), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_32_0_0_1_0_0_2 = INSTANCE.getSQL_32_0_0_1_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_32_0_0_1_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_32_0_0_1_0_0 = INSTANCE.getSQL_32_0_0_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_32_0_0_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_32_0_0_1_0_0_0, SQL_32_0_0_1_0_0_1, SQL_32_0_0_1_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_32_0_0_1_0 = INSTANCE.getSQL_32_0_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_32_0_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_32_0_0_1_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_32_0_0_1 = INSTANCE.getSQL_32_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_32_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_32_0_0_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal SQL_32_0_0_2_0_0_0 = INSTANCE.getSQL_32_0_0_2_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal getSQL_32_0_0_2_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getTimestampType().getEStructuralFeature(org.emftext.language.sql.datatype.DatatypePackage.TIMESTAMP_TYPE__WITH_TIME_ZONE), "WITH", "WITHOUT", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_32_0_0_2_0_0_1 = INSTANCE.getSQL_32_0_0_2_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_32_0_0_2_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("TIME", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_32_0_0_2_0_0_2 = INSTANCE.getSQL_32_0_0_2_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_32_0_0_2_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("ZONE", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_32_0_0_2_0_0 = INSTANCE.getSQL_32_0_0_2_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_32_0_0_2_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_32_0_0_2_0_0_0, SQL_32_0_0_2_0_0_1, SQL_32_0_0_2_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_32_0_0_2_0 = INSTANCE.getSQL_32_0_0_2_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_32_0_0_2_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_32_0_0_2_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_32_0_0_2 = INSTANCE.getSQL_32_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_32_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_32_0_0_2_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_32_0_0 = INSTANCE.getSQL_32_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_32_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_32_0_0_0, SQL_32_0_0_1, SQL_32_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_32_0 = INSTANCE.getSQL_32_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_32_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_32_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * TimestampType
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_32 = INSTANCE.getSQL_32();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_32() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getTimestampType(), SQL_32_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_33_0_0_0 = INSTANCE.getSQL_33_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_33_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("BOOLEAN", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_33_0_0 = INSTANCE.getSQL_33_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_33_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_33_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_33_0 = INSTANCE.getSQL_33_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_33_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_33_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class BooleanType
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_33 = INSTANCE.getSQL_33();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_33() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBooleanType(), SQL_33_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal SQL_34_0_0_0 = INSTANCE.getSQL_34_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal getSQL_34_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal(org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunction().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__KIND), new String[] {"CURRENT_DATE", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIME", "LOCALTIME", "LOCALTIME", "CURRENT_TIMESTAMP", "CURRENT_TIMESTAMP", "LOCALTIMESTAMP", "LOCALTIMESTAMP", }, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_34_0_0_1_0_0_0 = INSTANCE.getSQL_34_0_0_1_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_34_0_0_1_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("(", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder SQL_34_0_0_1_0_0_1 = INSTANCE.getSQL_34_0_0_1_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder getSQL_34_0_0_1_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlPlaceholder(org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunction().getEStructuralFeature(org.emftext.language.sql.function.FunctionPackage.DATETIME_VALUE_FUNCTION__PRECISION), "UNSIGNED_INTEGER", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, 0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_34_0_0_1_0_0_2 = INSTANCE.getSQL_34_0_0_1_0_0_2();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_34_0_0_1_0_0_2() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword(")", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_34_0_0_1_0_0 = INSTANCE.getSQL_34_0_0_1_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_34_0_0_1_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_34_0_0_1_0_0_0, SQL_34_0_0_1_0_0_1, SQL_34_0_0_1_0_0_2);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_34_0_0_1_0 = INSTANCE.getSQL_34_0_0_1_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_34_0_0_1_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_34_0_0_1_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlCompound SQL_34_0_0_1 = INSTANCE.getSQL_34_0_0_1();
	private org.emftext.language.sql.resource.sql.grammar.SqlCompound getSQL_34_0_0_1() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlCompound(SQL_34_0_0_1_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.QUESTIONMARK);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_34_0_0 = INSTANCE.getSQL_34_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_34_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_34_0_0_0, SQL_34_0_0_1);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_34_0 = INSTANCE.getSQL_34_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_34_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_34_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * DatetimeValueFunction
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_34 = INSTANCE.getSQL_34();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_34() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunction(), SQL_34_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlKeyword SQL_35_0_0_0 = INSTANCE.getSQL_35_0_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword getSQL_35_0_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlKeyword("NULL", org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlSequence SQL_35_0_0 = INSTANCE.getSQL_35_0_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlSequence getSQL_35_0_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_35_0_0_0);
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlChoice SQL_35_0 = INSTANCE.getSQL_35_0();
	private org.emftext.language.sql.resource.sql.grammar.SqlChoice getSQL_35_0() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE, SQL_35_0_0);
	}
	
	/**
	 * This constant refers to the definition of the syntax for meta class
	 * NullSpecification
	 */
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule SQL_35 = INSTANCE.getSQL_35();
	private org.emftext.language.sql.resource.sql.grammar.SqlRule getSQL_35() {
		return new org.emftext.language.sql.resource.sql.grammar.SqlRule(org.emftext.language.sql.expression.ExpressionPackage.eINSTANCE.getNullSpecification(), SQL_35_0, org.emftext.language.sql.resource.sql.grammar.SqlCardinality.ONE);
	}
	
	
	public static String getSyntaxElementID(org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (Field field : org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement) org.emftext.language.sql.resource.sql.grammar.SqlGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static org.emftext.language.sql.resource.sql.grammar.SqlRule[] RULES = new org.emftext.language.sql.resource.sql.grammar.SqlRule[] {
		SQL_0,
		SQL_1,
		SQL_2,
		SQL_3,
		SQL_4,
		SQL_5,
		SQL_6,
		SQL_7,
		SQL_8,
		SQL_9,
		SQL_10,
		SQL_11,
		SQL_12,
		SQL_13,
		SQL_14,
		SQL_15,
		SQL_16,
		SQL_17,
		SQL_18,
		SQL_19,
		SQL_20,
		SQL_21,
		SQL_22,
		SQL_23,
		SQL_24,
		SQL_25,
		SQL_26,
		SQL_27,
		SQL_28,
		SQL_29,
		SQL_30,
		SQL_31,
		SQL_32,
		SQL_33,
		SQL_34,
		SQL_35,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new LinkedHashSet<String>();
			for (org.emftext.language.sql.resource.sql.grammar.SqlRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement element, Set<String> keywords) {
		if (element instanceof org.emftext.language.sql.resource.sql.grammar.SqlKeyword) {
			keywords.add(((org.emftext.language.sql.resource.sql.grammar.SqlKeyword) element).getValue());
		} else if (element instanceof org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal) {
			keywords.add(((org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal) {
			org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal terminal = (org.emftext.language.sql.resource.sql.grammar.SqlEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
