/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.sql.resource.sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * </p>
 * 
 * @see org.emftext.language.sql.resource.sql.ISqlOptions
 */
public interface ISqlDelegatingReferenceResolver<ContainerType extends EObject, ReferenceType extends EObject> extends org.emftext.language.sql.resource.sql.ISqlReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(org.emftext.language.sql.resource.sql.ISqlReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
