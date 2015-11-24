package org.emftext.language.sql;

public class SchemaQualifiedName_ {

    private Identifier catalogName;
    private Identifier schemaName;
    private Identifier identifier;

    private SchemaQualifiedName_(Identifier identifier) {
        this.identifier = identifier;
    }

    private SchemaQualifiedName_(Identifier identifier, Identifier unqualifiedSchemaName) {
        this.identifier = identifier;
        this.schemaName = unqualifiedSchemaName;
    }

    private SchemaQualifiedName_(Identifier identifier, Identifier unqualifiedSchemaName,
            Identifier catalogName) {
        this.identifier = identifier;
        this.schemaName = unqualifiedSchemaName;
        this.catalogName = catalogName;
    }

    public static SchemaQualifiedName_ valueOf(String str) {
        String[] parts = str.split("\\.", 3);
        switch (parts.length) {
        case 1:
            return new SchemaQualifiedName_(Identifier.valueOf(parts[0]));
        case 2:
            return new SchemaQualifiedName_(Identifier.valueOf(parts[1]), Identifier.valueOf(parts[0]));
        case 3:
            return new SchemaQualifiedName_(Identifier.valueOf(parts[2]), Identifier.valueOf(parts[1]),
                    Identifier.valueOf(parts[0]));
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        String result = identifier.toString();
        if (schemaName != null) {
            result = schemaName.toString() + "." + result;
            if (catalogName != null) {
                result = catalogName.toString() + "." + result;
            }
        }
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        SchemaQualifiedName_ name = null;
        if (obj instanceof SchemaQualifiedName_) {
            name = (SchemaQualifiedName_) obj;
        }
        else if (obj instanceof String) {
            name = SchemaQualifiedName_.valueOf((String) obj);
        }
        return name != null
                && (catalogName == null && name.catalogName == null || catalogName.equals(name.catalogName))
                && (schemaName == null && name.schemaName == null || schemaName.equals(name.schemaName))
                && (identifier != null && identifier.equals(name.identifier));
    }

    public boolean startsWith(String prefix) {
        return (catalogName != null && catalogName.startsWith(prefix))
                || (schemaName != null && schemaName.startsWith(prefix))
                || (identifier != null && identifier.startsWith(prefix));
    }

}