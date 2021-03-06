/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql;


/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ISqlResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.emftext.language.sql.resource.sql.ISqlResourcePostProcessor getResourcePostProcessor();
	
}
