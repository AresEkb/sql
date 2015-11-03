/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class SqlResourceFactory implements Resource.Factory {
	
	public SqlResourceFactory() {
		super();
	}
	
	public Resource createResource(URI uri) {
		return new org.emftext.language.sql.resource.sql.mopp.SqlResource(uri);
	}
	
}
