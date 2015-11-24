package org.emftext.language.sql;

import org.emftext.language.sql.common.SchemaQualifiedName;

public class Helper {
    public String formatSchemaQualifiedName(SchemaQualifiedName name) {
        return name.getCatalogName();
        
    }
}
