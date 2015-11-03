/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql;


/**
 * Implementors of this interface provide an EMF resource.
 */
public interface ISqlResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public org.emftext.language.sql.resource.sql.ISqlTextResource getResource();
	
}
