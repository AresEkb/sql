/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;

public class SqlParseResult implements org.emftext.language.sql.resource.sql.ISqlParseResult {
	
	private EObject root;
	
	private org.emftext.language.sql.resource.sql.ISqlLocationMap locationMap;
	
	private Collection<org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource>> commands = new ArrayList<org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource>>();
	
	public SqlParseResult() {
		super();
	}
	
	public EObject getRoot() {
		return root;
	}
	
	public org.emftext.language.sql.resource.sql.ISqlLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void setRoot(EObject root) {
		this.root = root;
	}
	
	public void setLocationMap(org.emftext.language.sql.resource.sql.ISqlLocationMap locationMap) {
		this.locationMap = locationMap;
	}
	
	public Collection<org.emftext.language.sql.resource.sql.ISqlCommand<org.emftext.language.sql.resource.sql.ISqlTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
