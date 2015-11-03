/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql;

import java.util.Collection;

public interface ISqlProblem {
	public String getMessage();
	public org.emftext.language.sql.resource.sql.SqlEProblemSeverity getSeverity();
	public org.emftext.language.sql.resource.sql.SqlEProblemType getType();
	public Collection<org.emftext.language.sql.resource.sql.ISqlQuickFix> getQuickFixes();
}
