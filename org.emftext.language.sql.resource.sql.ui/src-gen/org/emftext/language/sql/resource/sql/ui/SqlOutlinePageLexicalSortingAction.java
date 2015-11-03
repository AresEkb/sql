/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.ui;

import org.eclipse.jface.action.IAction;

public class SqlOutlinePageLexicalSortingAction extends org.emftext.language.sql.resource.sql.ui.AbstractSqlOutlinePageAction {
	
	public SqlOutlinePageLexicalSortingAction(org.emftext.language.sql.resource.sql.ui.SqlOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
