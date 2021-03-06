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

import org.eclipse.gmf.runtime.common.core.service.IProvider;
import org.eclipse.gmf.runtime.common.ui.services.dnd.core.IListenerContext;

/**
 * An operation that gets the transfer adapter listener
 * 
 * @author Vishy Ramaswamy
 */
public final class GetTransferAdapterOperation
	extends ListenerOperation {

	/**
	 * Constructor for GetTransferAdapterOperation.
	 * 
	 * @param context
	 *            The listener context
	 */
	public GetTransferAdapterOperation(IListenerContext context) {
		super(context);
	}

	/**
	 * Executes this operation on the <code>ITransferAdapterProvider</code>
	 * provider.
	 * 
	 * @param provider
	 *            The provider on which to execute this operation.
	 * @see org.eclipse.gmf.runtime.common.core.service.IOperation#execute(org.eclipse.gmf.runtime.common.core.service.IProvider)
	 */
	public Object execute(IProvider provider) {
		if (provider instanceof ITransferAdapterProvider
			&& getContext().getOperationType() != null) {
			/* Get the adapter */
			if (getContext().getOperationType().equals(IListenerContext.DRAG)) {
				return ((ITransferAdapterProvider) provider)
					.getTransferDragSourceAdapter(getContext().getTransferId());
			} else if (getContext().getOperationType().equals(
				IListenerContext.DROP)) {
				return ((ITransferAdapterProvider) provider)
					.getTransferDropTargetAdapter(getContext().getTransferId());
			}
		}

		return null;
	}
}