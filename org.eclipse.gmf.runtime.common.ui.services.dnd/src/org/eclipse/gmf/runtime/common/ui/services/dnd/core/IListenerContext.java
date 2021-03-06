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

package org.eclipse.gmf.runtime.common.ui.services.dnd.core;

/**
 * Interface for accessing the attributes used to determine the drag and drop
 * transfer adapters and listeners
 * 
 * @author Vishy Ramaswamy
 */
public interface IListenerContext {

	/**
	 * Constant for requesting all supporting transfer ids
	 */
	public static final String ALL_TRANSFERS = "ALL_TRANSFERS"; //$NON-NLS-1$

	/**
	 * Constant for drag operation type
	 */
	public static final String DRAG = "drag"; //$NON-NLS-1$

	/**
	 * Constant for drop operation type
	 */
	public static final String DROP = "drop"; //$NON-NLS-1$

	/**
	 * Returns the operation type
	 * 
	 * @return Returns the operation type
	 */
	public String getOperationType();

	/**
	 * Returns the transfer id requested
	 * 
	 * @return the transfer id
	 */
	public String getTransferId();
}