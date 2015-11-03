/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * org.emftext.language.sql.resource.sql.ISqlReferenceResolveResult interface that
 * collects mappings in a list.
 * </p>
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class SqlReferenceResolveResult<ReferenceType> implements org.emftext.language.sql.resource.sql.ISqlReferenceResolveResult<ReferenceType> {
	
	private Collection<org.emftext.language.sql.resource.sql.ISqlReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private Set<org.emftext.language.sql.resource.sql.ISqlQuickFix> quickFixes;
	
	public SqlReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Collection<org.emftext.language.sql.resource.sql.ISqlQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<org.emftext.language.sql.resource.sql.ISqlQuickFix>();
		}
		return Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.emftext.language.sql.resource.sql.ISqlQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<org.emftext.language.sql.resource.sql.ISqlQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public Collection<org.emftext.language.sql.resource.sql.ISqlReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new ArrayList<org.emftext.language.sql.resource.sql.ISqlReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.emftext.language.sql.resource.sql.mopp.SqlElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, URI uri, String warning) {
		if (mappings == null) {
			mappings = new ArrayList<org.emftext.language.sql.resource.sql.ISqlReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.emftext.language.sql.resource.sql.mopp.SqlURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
