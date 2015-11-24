/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.analysis;

import java.util.Map;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.sql.resource.sql.ISqlTokenResolveResult;
import org.emftext.language.sql.resource.sql.ISqlTokenResolver;

public class SqlQUOTED_STRINGTokenResolver implements ISqlTokenResolver {

    private static final String QUOTE = "'";
    private static final String QUOTE_SYMBOL = "''";

    public String deResolve(Object value, EStructuralFeature feature, EObject container) {
        String result = EcoreUtil.convertToString((EDataType) feature.getEType(), value);
        return QUOTE + result.replace(QUOTE, QUOTE_SYMBOL) + QUOTE;
    }

    public void resolve(String lexem, EStructuralFeature feature, ISqlTokenResolveResult result) {
        lexem = lexem.substring(1, lexem.length() - 1);
        lexem = lexem.replace(QUOTE_SYMBOL, QUOTE);
        try {
            result.setResolvedToken(EcoreUtil.createFromString((EDataType) feature.getEType(), lexem));
        }
        catch (Exception e) {
            result.setErrorMessage(e.getMessage());
        }
    }

    public void setOptions(Map<?, ?> options) {
    }

}
