/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;


public class SqlLineBreak extends org.emftext.language.sql.resource.sql.grammar.SqlFormattingElement {
	
	private final int tabs;
	
	public SqlLineBreak(org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
