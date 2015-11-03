/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql;


/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ISqlCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
