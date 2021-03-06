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

package org.eclipse.gmf.runtime.emf.type.core;

/**
 * Abstract superclass for types wishing to define constants that represent
 * element types contributed in the
 * <code>org.eclipse.gmf.runtime.emf.type.core.elementTypes</code> extension point.
 * <P>
 * Provides a convenience method that will access the
 * <code>ElementTypeRegistry</code> to get element types by ID.
 * 
 * @author ldamus
 */
public abstract class AbstractElementTypeEnumerator {

	/**
	 * Gets the element type for <code>id</code> from the
	 * <code>ElementTypeRegistry</code>.
	 * 
	 * @param id
	 *            the element type identifier
	 * @return element type for <code>id</code> from the
	 *         <code>ElementTypeRegistry</code>, or <code>null</code> if
	 *         there is no element type with that ID.
	 */
	protected static final IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}
}