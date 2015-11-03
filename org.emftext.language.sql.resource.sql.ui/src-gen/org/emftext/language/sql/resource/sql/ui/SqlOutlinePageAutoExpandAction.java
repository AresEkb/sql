/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.ui;

import org.eclipse.jface.action.IAction;

public class SqlOutlinePageAutoExpandAction extends org.emftext.language.sql.resource.sql.ui.AbstractSqlOutlinePageAction {
	
	public SqlOutlinePageAutoExpandAction(org.emftext.language.sql.resource.sql.ui.SqlOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
