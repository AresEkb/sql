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
import org.emftext.language.sql.resource.sql.ISqlTokenResolver;

public class SqlIDENTIFIERTokenResolver implements ISqlTokenResolver {
	
    public String deResolve(Object value, EStructuralFeature feature, EObject container) {
        return Helper.formatIdentifier((String) value);
    }

    public void resolve(String lexem, EStructuralFeature feature, ISqlTokenResolveResult result) {
        try {
            result.setResolvedToken(Helper.parseIdentifier(lexem));
        }
        catch (Exception e) {
            result.setErrorMessage(e.getMessage());
        }
    }

    public void setOptions(Map<?, ?> options) {
    }

}
