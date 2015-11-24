/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;


public class SqlTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.emftext.language.sql.resource.sql.ISqlTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("SIMPLE_COMMENT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x99, 0x99, 0x99}, null, false, true, false, false);
		}
		if ("BRACKETED_COMMENT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x99, 0x99, 0x99}, null, false, true, false, false);
		}
		if ("QUOTED_STRING".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x00, 0x00, 0x99}, null, false, true, false, false);
		}
		if ("EXACT_NUMERIC_LITERAL".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x00, 0x99, 0x00}, null, false, false, false, false);
		}
		if ("APPROXIMATE_NUMERIC_LITERAL".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x00, 0x99, 0x00}, null, false, false, false, false);
		}
		if ("UNSIGNED_INTEGER".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x00, 0x99, 0x00}, null, false, false, false, false);
		}
		if ("KEYWORD_N".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_DATE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_TIME".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_TIMESTAMP".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TRUE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FALSE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_CREATE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("GLOBAL".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LOCAL".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_TEMPORARY".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_TABLE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_DEFAULT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_COLLATE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_CONSTRAINT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_NOT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_NULL".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("UNIQUE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("PRIMARY KEY".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_REFERENCES".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_FOREIGN".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_KEY".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NUMERIC".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DECIMAL".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DEC".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("SMALLINT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INTEGER".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("INT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BIGINT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FLOAT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REAL".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("DOUBLE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_PRECISION".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_CHARACTER".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CHAR".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("VARCHAR".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_VARYING".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_SET".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_NATIONAL".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NCHAR".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BINARY".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_LARGE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_OBJECT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("BLOB".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("K".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("M".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("G".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CHARACTERS".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CODE_UNITS".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OCTETS".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WITH".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WITHOUT".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_ZONE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("KEYWORD_BOOLEAN".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CURRENT_DATE".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CURRENT_TIME".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LOCALTIME".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("CURRENT_TIMESTAMP".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LOCALTIMESTAMP".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
