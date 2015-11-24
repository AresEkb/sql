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
        
        Stream<Column> columns = Stream.of(container.getReferencedTable().getTarget())
            .filter(table -> table != null)
            .map(table -> table.getContentsSource())
            .filter(src -> src instanceof TableElementList)
            .flatMap(list -> ((TableElementList) list).getElements().stream())
            .filter(element -> element instanceof Column)
            .map(col -> (Column) col);

        Consumer<Column> addMapping = col -> result.addMapping(col.getName(), col);
        
        if (resolveFuzzy) {
            columns
                .filter(col -> !container.getReferencedColumns().contains(col))
                .filter(col -> col.getName().startsWith(identifier))
                .forEach(addMapping);
        } else {
            columns
                .filter(col -> col.getName().equals(identifier))
                .findFirst()
                .ifPresent(addMapping);
//                .ifPresent(new Consumer<Column>() {
//                    @Override
//                    public void accept(Column col) {
//                        int pos = container.getReferencedColumns().indexOf(col);
//                        if (pos >= 0 && pos >= position) {
//                            result.setErrorMessage("Referenced columns must be unique");
//                        }
//                        else {
//                            addMapping.accept(col);
//                        }
//                    }
//                });
        }
    }
    
    public String deResolve(Column element, ReferentialConstraint container, EReference reference) {
        return element.getName();
    }

    public void setOptions(Map<?, ?> options) {
    }

}
