/******************************************************************************
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.draw2d.ui.render.awt.internal.svg.metafile;

import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;

/**
 * This is used to force the drawing of lines to be suppressed.  When the metafile
 * specifies a pen type of 'PS_NULL', this is used.
 * 
 * @author dhabib
 */
class NullStroke implements Stroke
{

	/* (non-Javadoc)
	 * @see java.awt.Stroke#createStrokedShape(java.awt.Shape)
	 */
	public Shape createStrokedShape(Shape p)
	{
		// Return an empty shape so nothing gets drawn.
		return new GeneralPath();
	}

}
