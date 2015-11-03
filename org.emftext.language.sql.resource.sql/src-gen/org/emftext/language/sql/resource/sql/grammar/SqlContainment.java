/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.grammar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqlContainment extends org.emftext.language.sql.resource.sql.grammar.SqlTerminal {
	
	private final EClass[] allowedTypes;
	
	public SqlContainment(EStructuralFeature feature, org.emftext.language.sql.resource.sql.grammar.SqlCardinality cardinality, EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	@Override
	public boolean hasContainment(EClass metaclass) {
		for (EClass allowedType : allowedTypes) {
			if (allowedType == metaclass) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.emftext.language.sql.resource.sql.util.SqlStringUtil.explode(allowedTypes, ", ", new org.emftext.language.sql.resource.sql.ISqlFunction1<String, EClass>() {
				public String execute(EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
