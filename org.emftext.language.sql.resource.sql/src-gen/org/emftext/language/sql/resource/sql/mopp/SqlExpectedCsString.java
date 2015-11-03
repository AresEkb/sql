/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.Collections;
import java.util.Set;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class SqlExpectedCsString extends org.emftext.language.sql.resource.sql.mopp.SqlAbstractExpectedElement {
	
	private org.emftext.language.sql.resource.sql.grammar.SqlKeyword keyword;
	
	public SqlExpectedCsString(org.emftext.language.sql.resource.sql.grammar.SqlKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement getSyntaxElement() {
		return keyword;
	}
	
	public Set<String> getTokenNames() {
		return Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof SqlExpectedCsString) {
			return getValue().equals(((SqlExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
