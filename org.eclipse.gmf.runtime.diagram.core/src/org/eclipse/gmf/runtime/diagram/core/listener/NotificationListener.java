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

package org.eclipse.gmf.runtime.diagram.core.listener;

import org.eclipse.emf.common.notify.Notification;

/**
 * Defines an EMF {@link Notification} listener; any class interested in
 * listening to post-commit events from the {@link DiagramEventBroker} which
 * implements this interface. The notifyChanged method will get called by the
 * {@link DiagramEventBroker#handleElementEvent(Notification)}
 * 
 * @author mmostafa
 * 
 */
public interface NotificationListener {

	/**
	 * Will be called when a Notification event gets sent from the
	 * DiagramEventBroker after the transaction has been closed.
	 * 
	 * @param notification
	 *            the notification object
	 */
	public void notifyChanged(Notification notification);

}
