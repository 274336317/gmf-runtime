/******************************************************************************
 * Copyright (c) 2002, 2005 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.common.ui.printing.internal;

import org.eclipse.core.runtime.Plugin;

/**
 * The main plugin class to be used in the desktop.
 * 
 * @author wdiu Wayne Diu
 */
public class PrintingPlugin
	extends Plugin {

	/**
	 * The shared instance.
	 */
	private static PrintingPlugin plugin;

	/**
	 * The constructor.
	 */
	public PrintingPlugin() {
		super();
		plugin = this;
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @return PrintPreviewPlugin
	 */
	public static PrintingPlugin getDefault() {
		return plugin;
	}


	/**
	 * Retrieves the unique identifier of this plug-in.
	 * 
	 * @return A non-empty string which is unique within the plug-in registry.
	 */
	public static String getPluginId() {
		return getDefault().getBundle().getSymbolicName();
	}
}