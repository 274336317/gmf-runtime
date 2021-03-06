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

package org.eclipse.gmf.examples.runtime.diagram.geoshapes.internal.providers;

import java.util.HashMap;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.examples.runtime.diagram.geoshapes.internal.views.factories.GeoshapesDiagramViewFactory;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;

/**
 * 
 * @author qili
 * @canBeSeenBy org.eclipse.gmf.examples.runtime.diagram.geoshapes.*
 * 
 * View provider for the geoshape diagram.
 */
public class DiagramViewProvider extends AbstractViewProvider { 

	HashMap diagramMap = new HashMap(); 
	{
		diagramMap.put("Geoshape", GeoshapesDiagramViewFactory.class);//$NON-NLS-1$
	}
	
	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.internal.services.view.AbstractViewProvider#getDiagramViewClass(IAdaptable, java.lang.String)
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		return (Class) diagramMap.get(diagramKind);
	}
}

