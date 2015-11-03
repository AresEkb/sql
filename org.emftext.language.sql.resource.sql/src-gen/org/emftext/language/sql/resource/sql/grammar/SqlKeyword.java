/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;


/**
 * A class to represent a keyword in the grammar.
 */
public class SqlKeyword extends org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement {
	
	private final String value;
	
	public SqlKeyword(String value, org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return "\"" + value + "\"";
	}
	
}
