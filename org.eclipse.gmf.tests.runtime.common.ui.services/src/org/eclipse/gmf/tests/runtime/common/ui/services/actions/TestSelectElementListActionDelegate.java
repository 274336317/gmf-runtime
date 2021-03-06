/******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.tests.runtime.common.ui.services.actions;

import java.util.List;

import org.eclipse.gmf.runtime.common.ui.services.elementselection.AbstractElementSelectionInput;
import org.eclipse.gmf.runtime.common.ui.services.elementselection.ElementSelectionService;
import org.eclipse.gmf.runtime.common.ui.services.elementselection.IMatchingObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Action to launch to test the SelectElementList.
 * 
 * @author Anthony Hunter
 */
public class TestSelectElementListActionDelegate
    extends AbstractTestElementSelectionServiceActionDelegate {

    /**
     * {@inheritDoc}
     */
    public void run(IAction action) {
        AbstractElementSelectionInput input = new AbstractElementSelectionInput(
            filter, context, scope, inputString);
        List results = ElementSelectionService.getInstance()
            .getMatchingObjects(input);
        if (results.size() == 0) {
            MessageDialog.openInformation(window.getShell(),
                "Result", "Received Nothing");//$NON-NLS-2$//$NON-NLS-1$
        } else {
            MessageDialog.openInformation(window.getShell(),
                "Result", "Received " //$NON-NLS-2$//$NON-NLS-1$
                    + results.size()
                    + " matches, first one "//$NON-NLS-1$
                    + ((IMatchingObject) results.get(0)).getDisplayName());
        }
    }
}