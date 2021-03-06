/******************************************************************************
 * Copyright (c) 2002, 2006 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.common.core.resources;

/**
 * Convenience interface for the bookmark type and its attributes
 * 
 * @author bagrodia Created on: Oct 2, 2003
 */
public interface IBookmark
	extends IMarker {

	/** bookmark type */
	public static final String TYPE = "org.eclipse.gmf.runtime.common.ui.services.bookmark"; //$NON-NLS-1$

	/*
	 * ====================================================================
	 * Marker attributes:
	 * ====================================================================
	 */
}