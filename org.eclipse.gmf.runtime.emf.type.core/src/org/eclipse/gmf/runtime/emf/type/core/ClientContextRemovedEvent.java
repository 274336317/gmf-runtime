/*
 * Copyright (c) 2015 Christian W. Damus and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Christian W. Damus - initial API and implementation 
 */

package org.eclipse.gmf.runtime.emf.type.core;

/**
 * A notification that a {@linkplain #getClientContext() client context} has
 * been removed from the {@linkplain ClientContextManager context manager}.
 * 
 * @since 1.9
 */
public class ClientContextRemovedEvent {

	private IClientContext clientContext;

	/**
	 * Initializes me with the client context that was removed.
	 * 
	 * @param clientContext
	 *            the removed client context
	 */
	ClientContextRemovedEvent(IClientContext clientContext) {
		super();

		this.clientContext = clientContext;
	}

	/**
	 * Queries the identifier of the client context that was removed. Note that,
	 * because the client context is no longer actually available in the manager
	 * to be looked up, it is {@linkplain #getClientContext() provided} by this
	 * event object.
	 * 
	 * @return the removed client context's identifier
	 * 
	 * @see #getClientContext()
	 */
	public String getClientContextId() {
		return clientContext.getId();
	}

	/**
	 * Queries the client context that was removed.
	 * 
	 * @return the removed clientContext
	 */
	public IClientContext getClientContext() {
		return clientContext;
	}
}
