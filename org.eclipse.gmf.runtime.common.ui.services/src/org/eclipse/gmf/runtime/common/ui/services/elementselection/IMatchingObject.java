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
package org.eclipse.gmf.runtime.common.ui.services.elementselection;

import org.eclipse.swt.graphics.Image;

/**
 * Interface describing a matching object returned by the element selection
 * service.
 * 
 * @author Anthony Hunter <a href="mailto:anthonyh@ca.ibm.com">
 *         anthonyh@ca.ibm.com </a>
 */
public interface IMatchingObject {

	/**
	 * Retrieve the name of the matching object, which is used when filtering
	 * (we filter on the concrete name, not the display name).
	 * 
	 * @return the name of the matching object
	 */
	public String getName();

	/**
	 * Retrieve the display name of the matching object, which is used to as
	 * display text by the label provider.
	 * 
	 * @return the display name of the matching object.
	 */
	public String getDisplayName();

	/**
	 * Retrieve the image of the matching object, which is used to as display
	 * icon by the label provider.
	 * 
	 * @return the image of the matching object.
	 */
	public Image getImage();

	/**
	 * Retrieve the type selection provider that that provided this matching
	 * object.
	 * 
	 * @return the type selection provider.
	 */
	public IElementSelectionProvider getProvider();
}
