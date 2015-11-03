/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql.mopp;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <p>
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * </p>
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class SqlContextDependentURIFragmentFactory<ContainerType extends EObject, ReferenceType extends EObject>  implements org.emftext.language.sql.resource.sql.ISqlContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.emftext.language.sql.resource.sql.ISqlReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public SqlContextDependentURIFragmentFactory(org.emftext.language.sql.resource.sql.ISqlReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.emftext.language.sql.resource.sql.ISqlContextDependentURIFragment<?> create(String identifier, ContainerType container, EReference reference, int positionInReference, EObject proxy) {
		
		return new org.emftext.language.sql.resource.sql.mopp.SqlContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.emftext.language.sql.resource.sql.ISqlReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
