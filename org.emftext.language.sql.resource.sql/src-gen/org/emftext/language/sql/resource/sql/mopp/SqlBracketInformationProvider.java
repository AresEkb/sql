/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class provides information about how brackets must be handled in the
 * editor (e.g., whether they must be closed automatically).
 */
public class SqlBracketInformationProvider {
	
	public Collection<org.emftext.language.sql.resource.sql.ISqlBracketPair> getBracketPairs() {
		Collection<org.emftext.language.sql.resource.sql.ISqlBracketPair> result = new ArrayList<org.emftext.language.sql.resource.sql.ISqlBracketPair>();
		result.add(new org.emftext.language.sql.resource.sql.mopp.SqlBracketPair("(", ")", true, false));
		return result;
	}
	
}
