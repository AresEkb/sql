/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.analysis;

import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.sql.common.SQLScript;
import org.emftext.language.sql.resource.sql.ISqlReferenceResolveResult;
import org.emftext.language.sql.resource.sql.ISqlReferenceResolver;
import org.emftext.language.sql.schema.ReferentialConstraint;
import org.emftext.language.sql.schema.TableDefinition;

public class ReferentialConstraintReferencedTableReferenceResolver
        implements ISqlReferenceResolver<ReferentialConstraint, TableDefinition> {

    public void resolve(String identifier, ReferentialConstraint container, EReference reference, int position,
            boolean resolveFuzzy, final ISqlReferenceResolveResult<TableDefinition> result) {
        SQLScript sqlScript = (SQLScript) EcoreUtil.getRootContainer(container);
        Stream<TableDefinition> tables = sqlScript.getStatements().stream()
            .filter(stmt -> stmt instanceof TableDefinition)
            .map(table -> (TableDefinition) table);

        Consumer<TableDefinition> addMapping = table -> result.addMapping(table.getName().toString(), table);
        
        if (resolveFuzzy) {
            tables
                .filter(table -> table.getName().startsWith(identifier))
                .forEach(addMapping);
        } else {
            tables
                .filter(table -> table.getName().equals(identifier))
                .findFirst()
                .ifPresent(addMapping);
        }
    }

    public String deResolve(TableDefinition element, ReferentialConstraint container, EReference reference) {
        return element.getName().toString();
    }

    public void setOptions(Map<?, ?> options) {
    }

}
