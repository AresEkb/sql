package org.emftext.language.sql.resource.sql.post;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.emftext.language.sql.Identifier;
import org.emftext.language.sql.resource.sql.ISqlOptionProvider;
import org.emftext.language.sql.resource.sql.ISqlOptions;
import org.emftext.language.sql.resource.sql.ISqlProblem;
import org.emftext.language.sql.resource.sql.ISqlQuickFix;
import org.emftext.language.sql.resource.sql.ISqlResourcePostProcessor;
import org.emftext.language.sql.resource.sql.ISqlResourcePostProcessorProvider;
import org.emftext.language.sql.resource.sql.SqlEProblemSeverity;
import org.emftext.language.sql.resource.sql.SqlEProblemType;
import org.emftext.language.sql.resource.sql.mopp.SqlProblem;
import org.emftext.language.sql.resource.sql.mopp.SqlQuickFix;
import org.emftext.language.sql.resource.sql.mopp.SqlResource;
import org.emftext.language.sql.schema.Column;

public class PostProcessor implements ISqlResourcePostProcessor, ISqlResourcePostProcessorProvider, ISqlOptionProvider {

    @Override
    public Map<?, ?> getOptions() {
        return Collections.singletonMap(ISqlOptions.RESOURCE_POSTPROCESSOR_PROVIDER, this);
    }

    @Override
    public ISqlResourcePostProcessor getResourcePostProcessor() {
        return this;
    }

    @Override
    public void process(SqlResource resource) {
        //EObject root = resource.getContents().get(0);
        /*
         * for (Diagnostic error : resource.getErrors()) {
         * System.out.println(error.getMessage()); //error. }
         */
/*
        TreeIterator<EObject> allContents = resource.getAllContents();
        while (allContents.hasNext()) {
            EObject next = allContents.next();
            if (next instanceof Column) {
                Column entity = (Column) next;
                if (entity.getName().isReservedWord()) {
                    String displayString = "Fix the name";
                    ISqlQuickFix quickFix = new SqlQuickFix(displayString, null, entity) {

                        @Override
                        public void applyChanges() {
                            EObject contextObject = getContextObjects().iterator().next();
                            Column contextEntity = (Column) contextObject;
                            contextEntity.setName(Identifier.valueOf("GoodName"));
                        }
                    };
                    SqlEProblemSeverity severity = SqlEProblemSeverity.ERROR;
                    SqlEProblemType type = SqlEProblemType.ANALYSIS_PROBLEM;
                    String message = "Name of entity need to be fixed.";
                    ISqlProblem problem = new SqlProblem(message, type, severity, quickFix);
                    resource.addProblem(problem, entity);
                }
            }
        }
*/
    }

    @Override
    public void terminate() {
    }

}
