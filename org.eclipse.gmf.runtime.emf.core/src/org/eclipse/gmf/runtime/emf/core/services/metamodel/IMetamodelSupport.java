/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.emf.core.services.metamodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * The MSL uses this interface to make callbacks to meta-model providers.
 * meta-model providers implement this interface which is used to implement
 * meta-model specific semantics.
 * 
 * @author rafikj
 */
public interface IMetamodelSupport {

	/**
	 * Can an object be destroyed?
	 * 
	 * @param eObject
	 *            the EMF object.
	 * @return True if eObject can be destroyed else false.
	 */
	public boolean canDestroy(EObject eObject);

	/**
	 * Can a class contain another class.
	 * 
	 * @param eContainer
	 *            The potential container?
	 * @param eReference
	 *            The EMF reference.
	 * @param eClass
	 *            the EMF class.
	 * @return True if eContainer can contain eClass else false.
	 */
	public boolean canContain(EClass eContainer, EReference eReference,
			EClass eClass);

	/**
	 * Handle element events. This is the place to implement semantic procs.
	 * 
	 * @param event
	 *            The event to handle.
	 */
	public void handleEvent(Notification event);

	/**
	 * Post-process the root object of a newly created or loaded resource.
	 * 
	 * @param root
	 *            The root object.
	 */
	public void postProcess(EObject root);
}