/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004, 2005.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */

package org.eclipse.gmf.runtime.emf.core.clipboard;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.gmf.runtime.common.core.util.Trace;
import org.eclipse.gmf.runtime.emf.core.internal.plugin.MSLDebugOptions;
import org.eclipse.gmf.runtime.emf.core.internal.plugin.MSLPlugin;


/**
 * @author Yasser Lulu 
 */
public class CopyingResourceSet
	extends ResourceSetImpl {

	private ResourceSetImpl mslResourceSet;

	private Map resourcesMap;

	/**
	 * 
	 */
	public CopyingResourceSet(ResourceSet resourceSet) {
		mslResourceSet = (ResourceSetImpl) resourceSet;
		resourcesMap = new HashMap();
		setURIResourceMap(new HashMap());
	}

	public Map getResourcesMap() {
		return resourcesMap;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.ResourceSet#getEObject(org.eclipse.emf.common.util.URI, boolean)
	 */
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		EObject eObject = mslResourceSet.getEObject(uri, loadOnDemand);
		if (eObject == null) {
			return super.getEObject(uri, loadOnDemand);
		}
		return eObject;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.ResourceSet#getResource(org.eclipse.emf.common.util.URI, boolean)
	 */
	public Resource getResource(URI uri, boolean loadOnDemand) {
		Resource resource = mslResourceSet.getResource(uri, loadOnDemand);
		if (resource == null) {
			return super.getResource(uri, loadOnDemand);
		}
		return resource;
	}
	
	
	

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceSetImpl#getURIResourceMap()
	 */
	public Map getURIResourceMap() {
		return mslResourceSet.getURIResourceMap();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceSetImpl#createResource(org.eclipse.emf.common.util.URI)
	 */
	public Resource createResource(URI uri) {
		throwUnsupportedOperationException("createResource",//$NON-NLS-1$
			new UnsupportedOperationException(
				"Can't create resources on MSLCopyingResourceSet"));//$NON-NLS-1$
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotificationRequired()
	 */
	public boolean eNotificationRequired() {
		return false;
	}

	private void throwUnsupportedOperationException(String methodName,
		UnsupportedOperationException ex) {
		Trace.throwing(MSLPlugin.getDefault(),
			MSLDebugOptions.EXCEPTIONS_THROWING, getClass(), methodName, ex);
		throw ex;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceSetImpl#getAdapterFactories()
	 */
	public EList getAdapterFactories() {
		return mslResourceSet.getAdapterFactories();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceSetImpl#getLoadOptions()
	 */
	public Map getLoadOptions() {
		return mslResourceSet.getLoadOptions();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceSetImpl#getPackageRegistry()
	 */
	public Registry getPackageRegistry() {
		return mslResourceSet.getPackageRegistry();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceSetImpl#getResourceFactoryRegistry()
	 */
	public org.eclipse.emf.ecore.resource.Resource.Factory.Registry getResourceFactoryRegistry() {
		return mslResourceSet.getResourceFactoryRegistry();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceSetImpl#getURIConverter()
	 */
	public URIConverter getURIConverter() {
		return mslResourceSet.getURIConverter();
	}
}