/******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/


package org.eclipse.gmf.examples.runtime.emf.clipboard.library;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;


/**
 * Custom library resource that uses UUIDs for URI fragments.
 */
public class LibraryResource
	extends XMIResourceImpl {

	/**
	 * Initializes me.
	 */
	public LibraryResource() {
		super();
	}

	/**
	 * Initializes me with my URI.
	 * 
	 * @param uri my URI
	 */
	public LibraryResource(URI uri) {
		super(uri);
	}

	/**
	 * We want to use UUIDs.
	 * 
	 * @return <code>true</code>, always
	 */
	protected boolean useUUIDs() {
		return true;
	}
}
