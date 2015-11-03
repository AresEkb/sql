/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.ui;

import org.eclipse.jface.action.IAction;

public class SqlOutlinePageTypeSortingAction extends org.emftext.language.sql.resource.sql.ui.AbstractSqlOutlinePageAction {
	
	public SqlOutlinePageTypeSortingAction(org.emftext.language.sql.resource.sql.ui.SqlOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
