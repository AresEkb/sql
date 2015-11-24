/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The SqlTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class SqlTokenResolverFactory implements org.emftext.language.sql.resource.sql.ISqlTokenResolverFactory {
	
	private Map<String, org.emftext.language.sql.resource.sql.ISqlTokenResolver> tokenName2TokenResolver;
	private Map<String, org.emftext.language.sql.resource.sql.ISqlTokenResolver> featureName2CollectInTokenResolver;
	private static org.emftext.language.sql.resource.sql.ISqlTokenResolver defaultResolver = new org.emftext.language.sql.resource.sql.analysis.SqlDefaultTokenResolver();
	
	public SqlTokenResolverFactory() {
		tokenName2TokenResolver = new LinkedHashMap<String, org.emftext.language.sql.resource.sql.ISqlTokenResolver>();
		featureName2CollectInTokenResolver = new LinkedHashMap<String, org.emftext.language.sql.resource.sql.ISqlTokenResolver>();
		registerTokenResolver("SIMPLE_COMMENT", new org.emftext.language.sql.resource.sql.analysis.SqlSIMPLE_COMMENTTokenResolver());
		registerTokenResolver("BRACKETED_COMMENT", new org.emftext.language.sql.resource.sql.analysis.SqlBRACKETED_COMMENTTokenResolver());
		registerTokenResolver("UNSIGNED_INTEGER", new org.emftext.language.sql.resource.sql.analysis.SqlUNSIGNED_INTEGERTokenResolver());
		registerTokenResolver("EXACT_NUMERIC_LITERAL", new org.emftext.language.sql.resource.sql.analysis.SqlEXACT_NUMERIC_LITERALTokenResolver());
		registerTokenResolver("APPROXIMATE_NUMERIC_LITERAL", new org.emftext.language.sql.resource.sql.analysis.SqlAPPROXIMATE_NUMERIC_LITERALTokenResolver());
		registerTokenResolver("QUOTED_STRING", new org.emftext.language.sql.resource.sql.analysis.SqlQUOTED_STRINGTokenResolver());
		registerTokenResolver("IDENTIFIER", new org.emftext.language.sql.resource.sql.analysis.SqlIDENTIFIERTokenResolver());
	}
	
	public org.emftext.language.sql.resource.sql.ISqlTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.emftext.language.sql.resource.sql.ISqlTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.emftext.language.sql.resource.sql.ISqlTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.emftext.language.sql.resource.sql.ISqlTokenResolver internalCreateResolver(Map<String, org.emftext.language.sql.resource.sql.ISqlTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(Map<String, org.emftext.language.sql.resource.sql.ISqlTokenResolver> resolverMap, String key, org.emftext.language.sql.resource.sql.ISqlTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
