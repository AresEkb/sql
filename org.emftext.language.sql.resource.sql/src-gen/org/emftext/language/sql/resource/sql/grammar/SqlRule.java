/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * A class to represent a rules in the grammar.
 */
public class SqlRule extends org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement {
	
	private final EClass metaclass;
	
	public SqlRule(EClass metaclass, org.emftext.language.sql.resource.sql.grammar.SqlChoice choice, org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality) {
		super(cardinality, new org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public EClass getMetaclass() {
		return metaclass;
	}
	
	public org.emftext.language.sql.resource.sql.grammar.SqlChoice getDefinition() {
		return (org.emftext.language.sql.resource.sql.grammar.SqlChoice) getChildren()[0];
	}
	
	@Deprecated
	public String toString() {
		return metaclass == null ? "null" : metaclass.getName() + " ::= " + getDefinition().toString();
	}
	
}

