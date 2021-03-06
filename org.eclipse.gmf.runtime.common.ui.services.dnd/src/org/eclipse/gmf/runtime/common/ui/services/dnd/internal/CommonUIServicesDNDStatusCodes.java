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

package org.eclipse.gmf.runtime.common.ui.services.dnd.internal;

/**
 * A list of status codes for this plug-in.
 * 
 * @author khussey
 *  
 */
public final class CommonUIServicesDNDStatusCodes {

	/**
	 * This class should not be instantiated since it is a static constant
	 * class.
	 *  
	 */
	private CommonUIServicesDNDStatusCodes() {
		/* private constructor */
	}

	/**
	 * Status code indicating that everything is OK.
	 */
	public static final int OK = 0;

	/**
	 * Status code indicating that an error occurred with a service.
	 */
	public static final int SERVICE_FAILURE = 1;

	/**
	 * Status code indicating that an error occurred with the drag action.
	 */
	public static final int DRAG_ACTION_FAILURE = 2;

	/**
	 * Status code indicating that an error occurred with the drop action.
	 */
	public static final int DROP_ACTION_FAILURE = 3;

	/**
	 * Status code warning that an exception was ignored
	 */
	public static final int IGNORED_EXCEPTION_WARNING = 4;
}