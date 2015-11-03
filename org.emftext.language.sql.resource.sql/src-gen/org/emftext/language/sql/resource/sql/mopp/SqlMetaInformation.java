/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource.Factory;

public class SqlMetaInformation implements org.emftext.language.sql.resource.sql.ISqlMetaInformation {
	
	public String getSyntaxName() {
		return "sql";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/sql";
	}
	
	public org.emftext.language.sql.resource.sql.ISqlTextScanner createLexer() {
		return new org.emftext.language.sql.resource.sql.mopp.SqlAntlrScanner(new org.emftext.language.sql.resource.sql.mopp.SqlLexer());
	}
	
	public org.emftext.language.sql.resource.sql.ISqlTextParser createParser(InputStream inputStream, String encoding) {
		return new org.emftext.language.sql.resource.sql.mopp.SqlParser().createInstance(inputStream, encoding);
	}
	
	public org.emftext.language.sql.resource.sql.ISqlTextPrinter createPrinter(OutputStream outputStream, org.emftext.language.sql.resource.sql.ISqlTextResource resource) {
		return new org.emftext.language.sql.resource.sql.mopp.SqlPrinter2(outputStream, resource);
	}
	
	public EClass[] getClassesWithSyntax() {
		return new org.emftext.language.sql.resource.sql.mopp.SqlSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public EClass[] getStartSymbols() {
		return new org.emftext.language.sql.resource.sql.mopp.SqlSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.emftext.language.sql.resource.sql.ISqlReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.emftext.language.sql.resource.sql.mopp.SqlReferenceResolverSwitch();
	}
	
	public org.emftext.language.sql.resource.sql.ISqlTokenResolverFactory getTokenResolverFactory() {
		return new org.emftext.language.sql.resource.sql.mopp.SqlTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.emftext.language.sql/model/sql.cs";
	}
	
	public String[] getTokenNames() {
		return org.emftext.language.sql.resource.sql.mopp.SqlParser.tokenNames;
	}
	
	public org.emftext.language.sql.resource.sql.ISqlTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.emftext.language.sql.resource.sql.mopp.SqlTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public Collection<org.emftext.language.sql.resource.sql.ISqlBracketPair> getBracketPairs() {
		return new org.emftext.language.sql.resource.sql.mopp.SqlBracketInformationProvider().getBracketPairs();
	}
	
	public EClass[] getFoldableClasses() {
		return new org.emftext.language.sql.resource.sql.mopp.SqlFoldingInformationProvider().getFoldableClasses();
	}
	
	public Factory createResourceFactory() {
		return new org.emftext.language.sql.resource.sql.mopp.SqlResourceFactory();
	}
	
	public org.emftext.language.sql.resource.sql.mopp.SqlNewFileContentProvider getNewFileContentProvider() {
		return new org.emftext.language.sql.resource.sql.mopp.SqlNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.emftext.language.sql.resource.sql.mopp.SqlResourceFactoryDelegator());
		}
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.emftext.language.sql.resource.sql.ui.launchConfigurationType";
	}
	
	public org.emftext.language.sql.resource.sql.ISqlNameProvider createNameProvider() {
		return new org.emftext.language.sql.resource.sql.analysis.SqlDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.emftext.language.sql.resource.sql.mopp.SqlAntlrTokenHelper tokenHelper = new org.emftext.language.sql.resource.sql.mopp.SqlAntlrTokenHelper();
		List<String> highlightableTokens = new ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.emftext.language.sql.resource.sql.mopp.SqlTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
