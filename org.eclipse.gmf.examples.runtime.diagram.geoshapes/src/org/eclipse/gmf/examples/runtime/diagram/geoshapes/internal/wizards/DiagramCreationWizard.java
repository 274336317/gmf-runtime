/******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.examples.runtime.diagram.geoshapes.internal.wizards;

import org.eclipse.gmf.examples.runtime.diagram.geoshapes.internal.l10n.ExampleDiagramGeoshapeMessages;
import org.eclipse.gmf.examples.runtime.diagram.geoshapes.internal.l10n.ExampleDiagramGeoshapePluginImages;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.wizards.EditorCreationWizard;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;


/**
 * @author qili
 * @canBeSeenBy org.eclipse.gmf.examples.runtime.diagram.geoshapes.*
 *
 * Create Diagram Wizard
 */
public class DiagramCreationWizard extends EditorCreationWizard{
	
	/**
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	public void addPages() {
		super.addPages();

		if (page == null)
			page = new DiagramWizardPage(getWorkbench(), getSelection());

		addPage(page);
	}
	
	public void init(IWorkbench workbench, IStructuredSelection sel) {
		super.init(workbench, sel);

		setWindowTitle(ExampleDiagramGeoshapeMessages.
				CreationWizard_New_Geoshape_Diagram);
		setDefaultPageImageDescriptor(ExampleDiagramGeoshapePluginImages.DESC_GEOSHAPES_WIZARD);
		setNeedsProgressMonitor(true);
	}

}
