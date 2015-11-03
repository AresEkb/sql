/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.ui;

import org.eclipse.core.resources.IResource;

public class SqlUIMetaInformation extends org.emftext.language.sql.resource.sql.mopp.SqlMetaInformation {
	
	public org.emftext.language.sql.resource.sql.ISqlHoverTextProvider getHoverTextProvider() {
		return new org.emftext.language.sql.resource.sql.ui.SqlHoverTextProvider();
	}
	
	public org.emftext.language.sql.resource.sql.ui.SqlImageProvider getImageProvider() {
		return org.emftext.language.sql.resource.sql.ui.SqlImageProvider.INSTANCE;
	}
	
	public org.emftext.language.sql.resource.sql.ui.SqlColorManager createColorManager() {
		return new org.emftext.language.sql.resource.sql.ui.SqlColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.emftext.language.sql.resource.sql.ISqlTextResource,
	 * org.emftext.language.sql.resource.sql.ui.SqlColorManager) instead.
	 */
	public org.emftext.language.sql.resource.sql.ui.SqlTokenScanner createTokenScanner(org.emftext.language.sql.resource.sql.ui.SqlColorManager colorManager) {
		return (org.emftext.language.sql.resource.sql.ui.SqlTokenScanner) createTokenScanner(null, colorManager);
	}
	
	public org.emftext.language.sql.resource.sql.ui.ISqlTokenScanner createTokenScanner(org.emftext.language.sql.resource.sql.ISqlTextResource resource, org.emftext.language.sql.resource.sql.ui.SqlColorManager colorManager) {
		return new org.emftext.language.sql.resource.sql.ui.SqlTokenScanner(resource, colorManager);
	}
	
	public org.emftext.language.sql.resource.sql.ui.SqlCodeCompletionHelper createCodeCompletionHelper() {
		return new org.emftext.language.sql.resource.sql.ui.SqlCodeCompletionHelper();
	}
	
	@SuppressWarnings("rawtypes")
	public Object createResourceAdapter(Object adaptableObject, Class adapterType, IResource resource) {
		return new org.emftext.language.sql.resource.sql.ui.debug.SqlLineBreakpointAdapter();
	}
	
}
