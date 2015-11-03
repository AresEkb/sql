/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;


public class SqlCompound extends org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement {
	
	public SqlCompound(org.emftext.language.sql.resource.sql.grammar.SqlChoice choice, org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality) {
		super(cardinality, new org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
