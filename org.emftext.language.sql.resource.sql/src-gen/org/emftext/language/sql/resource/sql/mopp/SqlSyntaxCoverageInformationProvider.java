/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import org.eclipse.emf.ecore.EClass;

public class SqlSyntaxCoverageInformationProvider {
	
	public EClass[] getClassesWithSyntax() {
		return new EClass[] {
			org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(),
			org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSimpleComment(),
			org.emftext.language.sql.common.CommonPackage.eINSTANCE.getBracketedComment(),
			org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSchemaQualifiedName(),
			org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getExactNumericLiteral(),
			org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getApproximateNumericLiteral(),
			org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getCharacterStringLiteral(),
			org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getNationalCharacterStringLiteral(),
			org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getDateLiteral(),
			org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getTimeLiteral(),
			org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getTimestampLiteral(),
			org.emftext.language.sql.literal.LiteralPackage.eINSTANCE.getBooleanLiteral(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableReference(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableDefinition(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getTableElementList(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getColumn(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getLiteralDefaultOption(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getDatetimeValueFunctionDefaultOption(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getImplicitlyTypedValueSpecificationDefaultOption(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getNotNullColumnConstraint(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueColumnConstraint(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialColumnConstraint(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint(),
			org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getExactNumericType(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getApproximateNumericType(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getCharacterStringType(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getNationalCharacterStringType(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBinaryLargeObjectStringType(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getLargeObjectLength(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getDateType(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getTimeType(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getTimestampType(),
			org.emftext.language.sql.datatype.DatatypePackage.eINSTANCE.getBooleanType(),
			org.emftext.language.sql.function.FunctionPackage.eINSTANCE.getDatetimeValueFunction(),
			org.emftext.language.sql.expression.ExpressionPackage.eINSTANCE.getNullSpecification(),
		};
	}
	
	public EClass[] getStartSymbols() {
		return new EClass[] {
			org.emftext.language.sql.common.CommonPackage.eINSTANCE.getSQLScript(),
		};
	}
	
}
