/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class to represent placeholders in a grammar.
 */
public class SqlPlaceholder extends org.emftext.language.sql.resource.sql.grammar.SqlTerminal {
	
	private final String tokenName;
	
	public SqlPlaceholder(EStructuralFeature feature, String tokenName, org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
