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

package org.eclipse.gmf.runtime.common.ui.services.dnd.drag;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Interface that contains the context information relevant to the drag source.
 * 
 * @author Vishy Ramaswamy
 */
public interface IDragSourceContext {

	/**
	 * Returns the selection of the drag source viewer
	 * 
	 * @return The selection of the drag source viewer
	 */
	public ISelection getSelection();

	/**
	 * Returns the active <code>IWorkbenchPart</code> associated with the drag
	 * source viewer.
	 * 
	 * @return The active <code>IWorkbenchPart</code>
	 */
	public IWorkbenchPart getActivePart();
}