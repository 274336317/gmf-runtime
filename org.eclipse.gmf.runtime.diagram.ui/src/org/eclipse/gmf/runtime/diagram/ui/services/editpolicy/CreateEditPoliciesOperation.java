/******************************************************************************
 * Copyright (c) 2002, 2008 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.diagram.ui.services.editpolicy;

import org.eclipse.core.runtime.Assert;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProvider;

/**
 * The operation used with the EditPolicy Service.
 * 
 * @author chmahone
 */
public class CreateEditPoliciesOperation implements IOperation {

	/** the editPart */
	private final EditPart editPart;

	/**
	 * Constructor for <code>CreateEditPoliciesOperation</code>.
	 * @param editPart edit part to associate with this opertion
	 */
	public CreateEditPoliciesOperation(EditPart editPart) {
		Assert.isNotNull(editPart);
		this.editPart = editPart;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.common.core.service.IOperation#execute(org.eclipse.gmf.runtime.common.core.service.IProvider)
	 */
	public Object execute(IProvider provider) {
		Assert.isNotNull(provider);

		((IEditPolicyProvider) provider).createEditPolicies(getEditPart());
		return null;
	}

	/**
	 * Returns the editpart.
	 * @return the editpart
	 */
	public final EditPart getEditPart() {
		return editPart;
	}

}
