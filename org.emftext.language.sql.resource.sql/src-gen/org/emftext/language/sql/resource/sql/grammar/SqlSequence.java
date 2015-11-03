/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;


public class SqlSequence extends org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement {
	
	public SqlSequence(org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality, org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.emftext.language.sql.resource.sql.util.SqlStringUtil.explode(getChildren(), " ");
	}
	
}
