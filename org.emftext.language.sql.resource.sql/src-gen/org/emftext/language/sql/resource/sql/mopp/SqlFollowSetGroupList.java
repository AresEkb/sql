/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used when computing code completion proposals hold groups of
 * expected elements which belong to the same follow set.
 */
public class SqlFollowSetGroupList {
	
	private int lastFollowSetID = -1;
	private List<org.emftext.language.sql.resource.sql.mopp.SqlFollowSetGroup> followSetGroups = new ArrayList<org.emftext.language.sql.resource.sql.mopp.SqlFollowSetGroup>();
	
	public SqlFollowSetGroupList(List<org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal> expectedTerminals) {
		for (org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal expectedTerminal : expectedTerminals) {
			addExpectedTerminal(expectedTerminal);
		}
	}
	
	private void addExpectedTerminal(org.emftext.language.sql.resource.sql.mopp.SqlExpectedTerminal expectedTerminal) {
		org.emftext.language.sql.resource.sql.mopp.SqlFollowSetGroup group;
		
		int followSetID = expectedTerminal.getFollowSetID();
		if (followSetID == lastFollowSetID) {
			if (followSetGroups.isEmpty()) {
				group = addNewGroup();
			} else {
				group = followSetGroups.get(followSetGroups.size() - 1);
			}
		} else {
			group = addNewGroup();
			lastFollowSetID = followSetID;
		}
		
		group.add(expectedTerminal);
	}
	
	public List<org.emftext.language.sql.resource.sql.mopp.SqlFollowSetGroup> getFollowSetGroups() {
		return followSetGroups;
	}
	
	private org.emftext.language.sql.resource.sql.mopp.SqlFollowSetGroup addNewGroup() {
		org.emftext.language.sql.resource.sql.mopp.SqlFollowSetGroup group = new org.emftext.language.sql.resource.sql.mopp.SqlFollowSetGroup();
		followSetGroups.add(group);
		return group;
	}
	
}
