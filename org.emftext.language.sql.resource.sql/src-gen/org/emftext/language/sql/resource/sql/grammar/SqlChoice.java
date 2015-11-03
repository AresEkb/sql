/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;


public class SqlChoice extends org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement {
	
	public SqlChoice(org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality, org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.emftext.language.sql.resource.sql.util.SqlStringUtil.explode(getChildren(), "|");
	}
	
}
