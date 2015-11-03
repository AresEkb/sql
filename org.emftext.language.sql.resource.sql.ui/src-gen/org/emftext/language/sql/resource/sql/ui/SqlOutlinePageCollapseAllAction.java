/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.ui;

import org.eclipse.jface.action.IAction;

public class SqlOutlinePageCollapseAllAction extends org.emftext.language.sql.resource.sql.ui.AbstractSqlOutlinePageAction {
	
	public SqlOutlinePageCollapseAllAction(org.emftext.language.sql.resource.sql.ui.SqlOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
