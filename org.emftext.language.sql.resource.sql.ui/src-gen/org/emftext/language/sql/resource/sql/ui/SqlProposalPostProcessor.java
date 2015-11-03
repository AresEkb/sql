/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.ui;

import java.util.List;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class SqlProposalPostProcessor {
	
	public List<org.emftext.language.sql.resource.sql.ui.SqlCompletionProposal> process(List<org.emftext.language.sql.resource.sql.ui.SqlCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
