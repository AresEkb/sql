/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.util;

import java.io.File;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * Class SqlTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.emftext.language.sql.resource.sql.util.SqlResourceUtil.
 */
public class SqlTextResourceUtil {
	
	/**
	 * Use org.emftext.language.sql.resource.sql.util.SqlResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated
	public static org.emftext.language.sql.resource.sql.mopp.SqlResource getResource(IFile file) {
		return new org.emftext.language.sql.resource.sql.util.SqlEclipseProxy().getResource(file);
	}
	
	/**
	 * Use org.emftext.language.sql.resource.sql.util.SqlResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated
	public static org.emftext.language.sql.resource.sql.mopp.SqlResource getResource(File file, Map<?,?> options) {
		return org.emftext.language.sql.resource.sql.util.SqlResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use org.emftext.language.sql.resource.sql.util.SqlResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated
	public static org.emftext.language.sql.resource.sql.mopp.SqlResource getResource(URI uri) {
		return org.emftext.language.sql.resource.sql.util.SqlResourceUtil.getResource(uri);
	}
	
	/**
	 * Use org.emftext.language.sql.resource.sql.util.SqlResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated
	public static org.emftext.language.sql.resource.sql.mopp.SqlResource getResource(URI uri, Map<?,?> options) {
		return org.emftext.language.sql.resource.sql.util.SqlResourceUtil.getResource(uri, options);
	}
	
}
