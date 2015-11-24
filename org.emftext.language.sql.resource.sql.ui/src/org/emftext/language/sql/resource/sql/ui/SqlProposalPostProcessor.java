/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.ecore.EAttribute;
import org.emftext.language.sql.common.SQLScript;
import org.emftext.language.sql.resource.sql.analysis.Helper;
import org.emftext.language.sql.schema.SchemaPackage;
import org.emftext.language.sql.schema.TableDefinition;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class SqlProposalPostProcessor {

    public List<SqlCompletionProposal> process(List<SqlCompletionProposal> proposals) {
        List<SqlCompletionProposal> newProposals = new ArrayList<SqlCompletionProposal>();

        EAttribute catalogNameFeature = SchemaPackage.eINSTANCE.getTableReference_CatalogName();
        EAttribute schemaNameFeature = SchemaPackage.eINSTANCE.getTableReference_SchemaName();
        
        for (SqlCompletionProposal proposal : proposals) {
            if (catalogNameFeature.equals(proposal.getStructuralFeature())) {
                addTableReferenceProposal(newProposals, proposal, table -> table.getSchemaQualifiedName().getCatalogName());
            }
            else if (schemaNameFeature.equals(proposal.getStructuralFeature())) {
                addTableReferenceProposal(newProposals, proposal, table -> table.getSchemaQualifiedName().getSchemaName());
            }
            else {
                newProposals.add(proposal);
            }
        }
        
        return newProposals;
    }

    private static void addTableReferenceProposal(List<SqlCompletionProposal> proposals, SqlCompletionProposal oldProposal,
            Function<TableDefinition, String> nameGetter) {
        SQLScript sqlScript = (SQLScript) oldProposal.getRoot();
        String prefix = oldProposal.getPrefix().toUpperCase();
        sqlScript.getStatements().stream()
                .filter(stmt -> stmt instanceof TableDefinition)
                .map(table -> (TableDefinition) table)
                .map(nameGetter)
                .filter(name -> name != null && name.length() > 0)
                .filter(name -> name.toUpperCase().startsWith(prefix))
                .forEach(name -> proposals.add(new SqlCompletionProposal(
                        oldProposal.getExpectedTerminal(), Helper.formatIdentifier(name), oldProposal.getPrefix(), true,
                        oldProposal.getStructuralFeature(), oldProposal.getContainer())));
    }

}
