/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class SqlSyntaxElement {
	
	private SqlSyntaxElement[] children;
	private SqlSyntaxElement parent;
	private org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality;
	
	public SqlSyntaxElement(org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality, SqlSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (SqlSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(SqlSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public SqlSyntaxElement getParent() {
		return parent;
	}
	
	/**
	 * Returns the rule of this syntax element. The rule is determined by the
	 * containment hierarchy in the CS model.
	 */
	public org.emftext.language.sql.resource.sql.grammar.SqlRule getRule() {
		if (this instanceof org.emftext.language.sql.resource.sql.grammar.SqlRule) {
			return (org.emftext.language.sql.resource.sql.grammar.SqlRule) this;
		}
		return parent.getRule();
	}
	
	public SqlSyntaxElement[] getChildren() {
		if (children == null) {
			return new SqlSyntaxElement[0];
		}
		return children;
	}
	
	public EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.emftext.language.sql.resource.sql.grammar.SqlCardinality getCardinality() {
		return cardinality;
	}
	
	public boolean hasContainment(EClass metaclass) {
		org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement[] children = getChildren();
		for (org.emftext.language.sql.resource.sql.grammar.SqlSyntaxElement child : children) {
			if (child.hasContainment(metaclass)) {
				return true;
			}
		}
		return false;
	}
	
}
