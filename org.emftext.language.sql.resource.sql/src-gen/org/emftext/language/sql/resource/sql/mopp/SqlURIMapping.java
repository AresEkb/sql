/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * org.emftext.language.sql.resource.sql.ISqlURIMapping interface that can map
 * identifiers to URIs.
 * </p>
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * org.emftext.language.sql.resource.sql.ISqlURIMapping.
 */
public class SqlURIMapping<ReferenceType> implements org.emftext.language.sql.resource.sql.ISqlURIMapping<ReferenceType> {
	
	private URI uri;
	private String identifier;
	private String warning;
	
	public SqlURIMapping(String identifier, URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
