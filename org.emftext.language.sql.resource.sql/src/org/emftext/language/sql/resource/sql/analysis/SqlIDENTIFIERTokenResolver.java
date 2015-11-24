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
//        String result = (String) value;
//        if (result.contains(DOUBLE_QUOTE) || !result.equals(result.toUpperCase()) || isReservedWord(result)) {
//            return DOUBLE_QUOTE + result.replace(DOUBLE_QUOTE, DOUBLE_QUOTE_SYMBOL) + DOUBLE_QUOTE;
//        }
//        else {
//            return result;
//        }
    }

    public void resolve(String lexem, EStructuralFeature feature, ISqlTokenResolveResult result) {
        try {
            result.setResolvedToken(Helper.parseIdentifier(lexem));
        }
        catch (Exception e) {
            result.setErrorMessage(e.getCause().getMessage());
        }
//        if (lexem.startsWith(DOUBLE_QUOTE) && lexem.endsWith(DOUBLE_QUOTE) && lexem.length() >= 2) {
//            lexem = lexem.substring(1, lexem.length() - 1);
//            lexem = lexem.replace(DOUBLE_QUOTE_SYMBOL, DOUBLE_QUOTE);
//        }
//        else if (isReservedWord(lexem)) {
//            result.setErrorMessage(String.format("Reserved word %s must be quoted when used as identifier", lexem.toUpperCase()));
//            return;
//        }
//        else {
//            lexem = lexem.toUpperCase();
//        }
//        result.setResolvedToken(lexem);
    }

    public void setOptions(Map<?, ?> options) {
    }

}
