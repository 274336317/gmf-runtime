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
package org.eclipse.gmf.tests.runtime.common.ui.services.elementselection.testproviders;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * An element selection provider used by the tests.
 * 
 * @author Anthony Hunter
 */
public class BlueTestElementSectionProvider
    extends AbstractTestElementSelectionProvider {

    protected String getTestElementComponent() {
        return "Blue";//$NON-NLS-1$;
    }

    protected Image getTestElementImage() {
        return PlatformUI.getWorkbench().getSharedImages().getImage(
            ISharedImages.IMG_OBJS_INFO_TSK);
    }

}
