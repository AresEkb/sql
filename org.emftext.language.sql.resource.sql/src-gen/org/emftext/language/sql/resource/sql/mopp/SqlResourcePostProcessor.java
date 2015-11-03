/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;


public class SqlResourcePostProcessor implements org.emftext.language.sql.resource.sql.ISqlResourcePostProcessor {
	
	public void process(org.emftext.language.sql.resource.sql.mopp.SqlResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
