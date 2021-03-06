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

package org.eclipse.gmf.runtime.common.ui.services.dnd.internal.core;

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.dnd.core.IListenerContext;

/**
 * The abstract parent of all drag and drop listener operations. This class
 * maintains a reference to the <code>IListenerContext</code>.
 * 
 * @author Vishy Ramaswamy
 */
public abstract class ListenerOperation
	implements IOperation {

	/**
	 * Attribute for the <code>IListenerContext</code>.
	 */
	private final IListenerContext context;

	/**
	 * Create a ListenerOperation.
	 * 
	 * @param aContext
	 *            the IListenerContext to keep a reference to
	 */
	public ListenerOperation(IListenerContext aContext) {
		assert null != aContext : "aContext cannot be null"; //$NON-NLS-1$
		this.context = aContext;
	}

	/**
	 * Returns the context.
	 * 
	 * @return The <code>context</code> instance variable
	 */
	public final IListenerContext getContext() {
		return context;
	}
}