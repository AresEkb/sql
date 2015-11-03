/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqlReferenceResolverSwitch implements org.emftext.language.sql.resource.sql.ISqlReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private Map<Object, Object> options;
	
	protected org.emftext.language.sql.resource.sql.analysis.ReferentialConstraintReferencedTableReferenceResolver referentialConstraintReferencedTableReferenceResolver = new org.emftext.language.sql.resource.sql.analysis.ReferentialConstraintReferencedTableReferenceResolver();
	protected org.emftext.language.sql.resource.sql.analysis.ReferentialConstraintReferencedColumnsReferenceResolver referentialConstraintReferencedColumnsReferenceResolver = new org.emftext.language.sql.resource.sql.analysis.ReferentialConstraintReferencedColumnsReferenceResolver();
	protected org.emftext.language.sql.resource.sql.analysis.UniqueTableConstraintColumnsReferenceResolver uniqueTableConstraintColumnsReferenceResolver = new org.emftext.language.sql.resource.sql.analysis.UniqueTableConstraintColumnsReferenceResolver();
	protected org.emftext.language.sql.resource.sql.analysis.ReferentialTableConstraintColumnsReferenceResolver referentialTableConstraintColumnsReferenceResolver = new org.emftext.language.sql.resource.sql.analysis.ReferentialTableConstraintColumnsReferenceResolver();
	
	public org.emftext.language.sql.resource.sql.ISqlReferenceResolver<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.TableDefinition> getReferentialConstraintReferencedTableReferenceResolver() {
		return getResolverChain(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialConstraint_ReferencedTable(), referentialConstraintReferencedTableReferenceResolver);
	}
	
	public org.emftext.language.sql.resource.sql.ISqlReferenceResolver<org.emftext.language.sql.schema.ReferentialConstraint, org.emftext.language.sql.schema.Column> getReferentialConstraintReferencedColumnsReferenceResolver() {
		return getResolverChain(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialConstraint_ReferencedColumns(), referentialConstraintReferencedColumnsReferenceResolver);
	}
	
	public org.emftext.language.sql.resource.sql.ISqlReferenceResolver<org.emftext.language.sql.schema.UniqueTableConstraint, org.emftext.language.sql.schema.Column> getUniqueTableConstraintColumnsReferenceResolver() {
		return getResolverChain(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint_Columns(), uniqueTableConstraintColumnsReferenceResolver);
	}
	
	public org.emftext.language.sql.resource.sql.ISqlReferenceResolver<org.emftext.language.sql.schema.ReferentialTableConstraint, org.emftext.language.sql.schema.Column> getReferentialTableConstraintColumnsReferenceResolver() {
		return getResolverChain(org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint_Columns(), referentialTableConstraintColumnsReferenceResolver);
	}
	
	public void setOptions(Map<?, ?> options) {
		if (options != null) {
			this.options = new LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		referentialConstraintReferencedTableReferenceResolver.setOptions(options);
		referentialConstraintReferencedColumnsReferenceResolver.setOptions(options);
		uniqueTableConstraintColumnsReferenceResolver.setOptions(options);
		referentialTableConstraintColumnsReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, EObject container, EReference reference, int position, org.emftext.language.sql.resource.sql.ISqlReferenceResolveResult<EObject> result) {
		if (container == null) {
			return;
		}
		if (org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialConstraint().isInstance(container)) {
			SqlFuzzyResolveResult<org.emftext.language.sql.schema.TableDefinition> frr = new SqlFuzzyResolveResult<org.emftext.language.sql.schema.TableDefinition>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("referencedTable")) {
				referentialConstraintReferencedTableReferenceResolver.resolve(identifier, (org.emftext.language.sql.schema.ReferentialConstraint) container, (EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialConstraint().isInstance(container)) {
			SqlFuzzyResolveResult<org.emftext.language.sql.schema.Column> frr = new SqlFuzzyResolveResult<org.emftext.language.sql.schema.Column>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("referencedColumns")) {
				referentialConstraintReferencedColumnsReferenceResolver.resolve(identifier, (org.emftext.language.sql.schema.ReferentialConstraint) container, (EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint().isInstance(container)) {
			SqlFuzzyResolveResult<org.emftext.language.sql.schema.Column> frr = new SqlFuzzyResolveResult<org.emftext.language.sql.schema.Column>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("columns")) {
				uniqueTableConstraintColumnsReferenceResolver.resolve(identifier, (org.emftext.language.sql.schema.UniqueTableConstraint) container, (EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint().isInstance(container)) {
			SqlFuzzyResolveResult<org.emftext.language.sql.schema.Column> frr = new SqlFuzzyResolveResult<org.emftext.language.sql.schema.Column>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("columns")) {
				referentialTableConstraintColumnsReferenceResolver.resolve(identifier, (org.emftext.language.sql.schema.ReferentialTableConstraint) container, (EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.emftext.language.sql.resource.sql.ISqlReferenceResolver<? extends EObject, ? extends EObject> getResolver(EStructuralFeature reference) {
		if (reference == org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialConstraint_ReferencedTable()) {
			return getResolverChain(reference, referentialConstraintReferencedTableReferenceResolver);
		}
		if (reference == org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialConstraint_ReferencedColumns()) {
			return getResolverChain(reference, referentialConstraintReferencedColumnsReferenceResolver);
		}
		if (reference == org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getUniqueTableConstraint_Columns()) {
			return getResolverChain(reference, uniqueTableConstraintColumnsReferenceResolver);
		}
		if (reference == org.emftext.language.sql.schema.SchemaPackage.eINSTANCE.getReferentialTableConstraint_Columns()) {
			return getResolverChain(reference, referentialTableConstraintColumnsReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public <ContainerType extends EObject, ReferenceType extends EObject> org.emftext.language.sql.resource.sql.ISqlReferenceResolver<ContainerType, ReferenceType> getResolverChain(EStructuralFeature reference, org.emftext.language.sql.resource.sql.ISqlReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.emftext.language.sql.resource.sql.ISqlOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof Map)) {
			// send this to the error log
			new org.emftext.language.sql.resource.sql.util.SqlRuntimeUtil().logWarning("Found value with invalid type for option " + org.emftext.language.sql.resource.sql.ISqlOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		Map<?,?> resolverMap = (Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.emftext.language.sql.resource.sql.ISqlReferenceResolver) {
			org.emftext.language.sql.resource.sql.ISqlReferenceResolver replacingResolver = (org.emftext.language.sql.resource.sql.ISqlReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.emftext.language.sql.resource.sql.ISqlDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.emftext.language.sql.resource.sql.ISqlDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof Collection) {
			Collection replacingResolvers = (Collection) resolverValue;
			org.emftext.language.sql.resource.sql.ISqlReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.emftext.language.sql.resource.sql.ISqlReferenceCache) {
					org.emftext.language.sql.resource.sql.ISqlReferenceResolver nextResolver = (org.emftext.language.sql.resource.sql.ISqlReferenceResolver) next;
					if (nextResolver instanceof org.emftext.language.sql.resource.sql.ISqlDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.emftext.language.sql.resource.sql.ISqlDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.emftext.language.sql.resource.sql.util.SqlRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.sql.resource.sql.ISqlOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.sql.resource.sql.ISqlDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.emftext.language.sql.resource.sql.util.SqlRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.sql.resource.sql.ISqlOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.sql.resource.sql.ISqlDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
