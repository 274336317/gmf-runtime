/******************************************************************************
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.common.ui.services.internal.elementselection;

import org.eclipse.gmf.runtime.common.core.service.IProvider;
import org.eclipse.gmf.runtime.common.ui.services.elementselection.IElementSelectionInput;
import org.eclipse.gmf.runtime.common.ui.services.elementselection.IMatchingObjectsOperation;

/**
 * The matching objects operation used by the element selection service.
 * 
 * @author Anthony Hunter
 */
public class MatchingObjectsOperation
    implements IMatchingObjectsOperation {

    /**
     * the element selection input.
     */
    private IElementSelectionInput input;

    /**
     * Constructor for a MatchingObjectsOperation
     * 
     * @param input
     *            the element selection input.
     */
    public MatchingObjectsOperation(IElementSelectionInput input) {
        super();
        this.input = input;
    }

    /**
     * {@inheritDoc}
     */
    public IElementSelectionInput getElementSelectionInput() {
        return input;
    }

    public Object execute(IProvider provider) {
        assert true : "MatchingObjectsOperation.execute() should not be executed"; //$NON-NLS-1$
        return null;
    }

}
