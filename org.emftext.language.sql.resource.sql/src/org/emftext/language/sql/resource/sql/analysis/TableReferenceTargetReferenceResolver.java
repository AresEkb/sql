/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.analysis;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.sql.common.SQLScript;
import org.emftext.language.sql.resource.sql.ISqlReferenceResolveResult;
import org.emftext.language.sql.resource.sql.ISqlReferenceResolver;
import org.emftext.language.sql.schema.TableDefinition;
import org.emftext.language.sql.schema.TableReference;

public class TableReferenceTargetReferenceResolver implements ISqlReferenceResolver<TableReference, TableDefinition> {

    public void resolve(String identifier, TableReference container, EReference reference, int position,
            boolean resolveFuzzy, final ISqlReferenceResolveResult<TableDefinition> result) {

        SQLScript sqlScript = (SQLScript) EcoreUtil.getRootContainer(container);

        String catalogName = container.getCatalogName();
        Predicate<TableDefinition> filter = !Helper.isEmpty(catalogName)
                ? table -> catalogName.equals(table.getSchemaQualifiedName().getCatalogName())
                : table -> true;

        String schemaName = container.getSchemaName();
        Predicate<TableDefinition> filter2 = !Helper.isEmpty(schemaName)
                ? table -> schemaName.equals(table.getSchemaQualifiedName().getSchemaName())
                : table -> true;

        Stream<TableDefinition> tables = sqlScript.getStatements().stream()
                .filter(stmt -> stmt instanceof TableDefinition)
                .map(table -> (TableDefinition) table)
                .filter(filter.and(filter2));

        Consumer<TableDefinition> addMapping =
                table -> result.addMapping(table.getSchemaQualifiedName().getName(), table);

        if (resolveFuzzy) {
            tables.filter(table -> table.getSchemaQualifiedName() != null &&
                                   table.getSchemaQualifiedName().getName().toUpperCase().startsWith(identifier.toUpperCase()))
                  .forEach(addMapping);
        } else {
            tables.filter(table -> table.getSchemaQualifiedName() != null &&
                                   table.getSchemaQualifiedName().getName().equals(identifier))
                  .findFirst()
                  .ifPresent(addMapping);
        }
    }
    
    public String deResolve(TableDefinition element, TableReference container, EReference reference) {
        return element.getSchemaQualifiedName().getName();
    }

    public void setOptions(Map<?, ?> options) {
    }

}
