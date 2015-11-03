/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;


public class SqlWhiteSpace extends org.emftext.language.sql.resource.sql.grammar.SqlFormattingElement {
	
	private final int amount;
	
	public SqlWhiteSpace(int amount, org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
