/******************************************************************************
 * Copyright (c) 2010 Obeo and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Mariot Chauvin (Obeo) <mariot.chauvin@obeo.fr> - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.diagram.ui.editpolicies;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;

/**
 * Extension of the GEF Layout EditPolicy.
 * 
 * @since 1.4
 */
public abstract class LayoutEditPolicy extends org.eclipse.gef.editpolicies.LayoutEditPolicy {

	/*
	 * Override to erase in case of GMF drop request, see https://bugs.eclipse.org/bugs/show_bug.cgi?id=276033
	 * (non-Javadoc)
	 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#eraseTargetFeedback(org.eclipse.gef.Request)
	 */
	@Override
	public void eraseTargetFeedback(Request request) {
		super.eraseTargetFeedback(request);
		if (RequestConstants.REQ_DROP.equals(request.getType()))
				eraseLayoutTargetFeedback(request);
	}

	
	
}
