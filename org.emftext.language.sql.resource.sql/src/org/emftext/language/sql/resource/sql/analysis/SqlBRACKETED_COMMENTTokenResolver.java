/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.emftext.language.sql.resource.sql.ISqlTokenResolveResult;

public class SqlBRACKETED_COMMENTTokenResolver implements org.emftext.language.sql.resource.sql.ISqlTokenResolver {
	
    public String deResolve(Object value, EStructuralFeature feature, EObject container) {
        return "/*" + ((String) value) + "*/";
    }

    public void resolve(String lexem, EStructuralFeature feature, ISqlTokenResolveResult result) {
        result.setResolvedToken(lexem.substring(2, lexem.length() - 2));
    }

    public void setOptions(Map<?, ?> options) {
    }
	
}
