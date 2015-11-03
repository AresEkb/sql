/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class SqlAbstractExpectedElement implements org.emftext.language.sql.resource.sql.ISqlExpectedElement {
	
	private EClass ruleMetaclass;
	
	private Set<org.emftext.language.sql.resource.sql.util.SqlPair<org.emftext.language.sql.resource.sql.ISqlExpectedElement, org.emftext.language.sql.resource.sql.mopp.SqlContainedFeature[]>> followers = new LinkedHashSet<org.emftext.language.sql.resource.sql.util.SqlPair<org.emftext.language.sql.resource.sql.ISqlExpectedElement, org.emftext.language.sql.resource.sql.mopp.SqlContainedFeature[]>>();
	
	public SqlAbstractExpectedElement(EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.emftext.language.sql.resource.sql.ISqlExpectedElement follower, org.emftext.language.sql.resource.sql.mopp.SqlContainedFeature[] path) {
		followers.add(new org.emftext.language.sql.resource.sql.util.SqlPair<org.emftext.language.sql.resource.sql.ISqlExpectedElement, org.emftext.language.sql.resource.sql.mopp.SqlContainedFeature[]>(follower, path));
	}
	
	public Collection<org.emftext.language.sql.resource.sql.util.SqlPair<org.emftext.language.sql.resource.sql.ISqlExpectedElement, org.emftext.language.sql.resource.sql.mopp.SqlContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
