/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.ui;

import org.eclipse.emf.ecore.EObject;

public class SqlHoverTextProvider implements org.emftext.language.sql.resource.sql.ISqlHoverTextProvider {
	
	private org.emftext.language.sql.resource.sql.ui.SqlDefaultHoverTextProvider defaultProvider = new org.emftext.language.sql.resource.sql.ui.SqlDefaultHoverTextProvider();
	
	public String getHoverText(EObject container, EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
