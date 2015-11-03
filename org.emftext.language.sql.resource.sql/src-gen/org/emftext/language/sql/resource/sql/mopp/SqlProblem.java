/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SqlProblem implements org.emftext.language.sql.resource.sql.ISqlProblem {
	
	private String message;
	private org.emftext.language.sql.resource.sql.SqlEProblemType type;
	private org.emftext.language.sql.resource.sql.SqlEProblemSeverity severity;
	private Collection<org.emftext.language.sql.resource.sql.ISqlQuickFix> quickFixes;
	
	public SqlProblem(String message, org.emftext.language.sql.resource.sql.SqlEProblemType type, org.emftext.language.sql.resource.sql.SqlEProblemSeverity severity) {
		this(message, type, severity, Collections.<org.emftext.language.sql.resource.sql.ISqlQuickFix>emptySet());
	}
	
	public SqlProblem(String message, org.emftext.language.sql.resource.sql.SqlEProblemType type, org.emftext.language.sql.resource.sql.SqlEProblemSeverity severity, org.emftext.language.sql.resource.sql.ISqlQuickFix quickFix) {
		this(message, type, severity, Collections.singleton(quickFix));
	}
	
	public SqlProblem(String message, org.emftext.language.sql.resource.sql.SqlEProblemType type, org.emftext.language.sql.resource.sql.SqlEProblemSeverity severity, Collection<org.emftext.language.sql.resource.sql.ISqlQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new LinkedHashSet<org.emftext.language.sql.resource.sql.ISqlQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.emftext.language.sql.resource.sql.SqlEProblemType getType() {
		return type;
	}
	
	public org.emftext.language.sql.resource.sql.SqlEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Collection<org.emftext.language.sql.resource.sql.ISqlQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
