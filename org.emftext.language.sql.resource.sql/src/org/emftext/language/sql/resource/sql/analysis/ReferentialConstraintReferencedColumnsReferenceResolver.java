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
import org.emftext.language.sql.resource.sql.ISqlReferenceResolveResult;
import org.emftext.language.sql.resource.sql.ISqlReferenceResolver;
import org.emftext.language.sql.schema.Column;
import org.emftext.language.sql.schema.ReferentialConstraint;
import org.emftext.language.sql.schema.TableElementList;

public class ReferentialConstraintReferencedColumnsReferenceResolver
        implements ISqlReferenceResolver<ReferentialConstraint, Column> {

    public void resolve(String identifier, ReferentialConstraint container, EReference reference, int position,
            boolean resolveFuzzy, final ISqlReferenceResolveResult<Column> result) {
        Stream<Column> columns = Stream.of(container.getReferencedTable())
            .map(table -> table.getContentsSource())
            .filter(src -> src instanceof TableElementList)
            .flatMap(list -> ((TableElementList) list).getElements().stream())
            .filter(element -> element instanceof Column)
            .map(col -> (Column) col);

        Consumer<Column> addMapping = col -> result.addMapping(col.getName().toString(), col);
        
        if (resolveFuzzy) {
            columns
                .filter(col -> col.getName().startsWith(identifier))
                .forEach(addMapping);
        } else {
            columns
                .filter(col -> col.getName().equals(identifier))
                .findFirst()
                .ifPresent(addMapping);
        }
    }
    
    public String deResolve(Column element, ReferentialConstraint container, EReference reference) {
        return element.getName().toString();
    }

    public void setOptions(Map<?, ?> options) {
    }

}
