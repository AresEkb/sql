/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class SqlExpectedBooleanTerminal extends org.emftext.language.sql.resource.sql.mopp.SqlAbstractExpectedElement {
	
	private org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal booleanTerminal;
	
	public SqlExpectedBooleanTerminal(org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public org.emftext.language.sql.resource.sql.grammar.SqlBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement getSyntaxElement() {
		return booleanTerminal;
	}
	
	private EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof SqlExpectedBooleanTerminal) {
			return getFeature().equals(((SqlExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		Set<String> tokenNames = new LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
