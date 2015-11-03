/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import org.antlr.runtime3_4_0.CommonToken;
import org.antlr.runtime3_4_0.Token;

public class SqlANTLRTextToken extends org.emftext.language.sql.resource.sql.mopp.SqlTextToken {
	
	private final static org.emftext.language.sql.resource.sql.ISqlMetaInformation metaInformation = new org.emftext.language.sql.resource.sql.mopp.SqlMetaInformation();
	
	public SqlANTLRTextToken(Token antlrToken) {
		super(getTokenName(metaInformation.getTokenNames(), antlrToken.getType()), antlrToken.getText(), ((CommonToken) antlrToken).getStartIndex(), ((CommonToken) antlrToken).getStopIndex() - ((CommonToken) antlrToken).getStartIndex() + 1, antlrToken.getLine(), antlrToken.getCharPositionInLine(), canBeUsedForSyntaxHighlighting(antlrToken.getType()));
	}
	
	public static String getTokenName(String[] tokenNames, int index) {
		if (tokenNames == null) {
			return null;
		}
		String tokenName = tokenNames[index];
		if (tokenName != null && tokenName.startsWith("'")) {
			tokenName = tokenName.substring(1, tokenName.length() - 1).trim();
		}
		return tokenName;
	}
	
	public static boolean canBeUsedForSyntaxHighlighting(int tokenType) {
		if (tokenType < 0) {
			return false;
		}
		if (tokenType == Token.UP) {
			return false;
		}
		if (tokenType == Token.DOWN) {
			return false;
		}
		if (tokenType == Token.EOR_TOKEN_TYPE) {
			return false;
		}
		if (tokenType == Token.INVALID_TOKEN_TYPE) {
			return false;
		}
		return true;
	}
	
}
