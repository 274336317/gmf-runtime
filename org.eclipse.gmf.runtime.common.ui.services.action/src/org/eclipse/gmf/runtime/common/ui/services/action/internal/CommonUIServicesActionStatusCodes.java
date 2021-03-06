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

package org.eclipse.gmf.runtime.common.ui.services.action.internal;

/**
 * A list of status codes for this plug-in.
 * 
 * @author ldamus
 *
 */
public final class CommonUIServicesActionStatusCodes {

	/**
	 * This class should not be instantiated since it is a static constant
	 * class.
	 * 
	 */
	private CommonUIServicesActionStatusCodes() {
		/* private constructor */
	}

	/**
	 * Status code indicating that everything is OK.
	 */
	public static final int OK = 0;

	/**
	 * Status code indicating that an error occurred during plug-in start-up.
	 */
	public static final int PLUGIN_STARTUP_FAILURE = 1;

	/**
	 * Status code indicating that an error occurred during plug-in shut-down.
	 */
	public static final int PLUGIN_SHUTDOWN_FAILURE = 2;

	/**
	 * Status code indicating that an error occurred with an action.
	 */
	public static final int ACTION_FAILURE = 3;

	/**
	 * Status code indicating that an error occurred with a service.
	 */
	public static final int SERVICE_FAILURE = 4;
    
    /**
     * Status code indicating that an error occurred with a resource, such
     * as loading an image file.
     */
    public static final int RESOURCE_FAILURE = 5;
    
    /**
     * Status code indicating that a UI error occurred.
     */
    public static final int GENERAL_UI_FAILURE = 6;

	/**
	 * Status code warning that an exception was ignored
	 */
	public static final int IGNORED_EXCEPTION_WARNING = 7;
}
