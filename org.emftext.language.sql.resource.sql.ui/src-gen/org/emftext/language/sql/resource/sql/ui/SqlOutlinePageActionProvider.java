/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.ui;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.action.IAction;

public class SqlOutlinePageActionProvider {
	
	public List<IAction> getActions(org.emftext.language.sql.resource.sql.ui.SqlOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		List<IAction> defaultActions = new ArrayList<IAction>();
		defaultActions.add(new org.emftext.language.sql.resource.sql.ui.SqlOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.emftext.language.sql.resource.sql.ui.SqlOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.sql.resource.sql.ui.SqlOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.sql.resource.sql.ui.SqlOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.emftext.language.sql.resource.sql.ui.SqlOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.emftext.language.sql.resource.sql.ui.SqlOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
