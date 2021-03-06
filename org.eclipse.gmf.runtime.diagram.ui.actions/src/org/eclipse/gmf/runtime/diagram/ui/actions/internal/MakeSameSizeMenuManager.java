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


package org.eclipse.gmf.runtime.diagram.ui.actions.internal;

import org.eclipse.gmf.runtime.common.ui.action.ActionMenuManager;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.actions.internal.l10n.DiagramUIActionsMessages;
import org.eclipse.jface.action.Action;

/**
 * The ZOrder menu manager. It contains all Order-related actions
 * 
 * @author jschofie
 */
public class MakeSameSizeMenuManager extends ActionMenuManager {

	/**
	 * The order menu action containing the UI for the zorder menu manager
	 */
	private static class MakeSameMenuAction extends Action {
		public MakeSameMenuAction() {
			setText(DiagramUIActionsMessages.SameSizeMenuManager_MakeSameSize_ActionLabelText);
			setToolTipText(DiagramUIActionsMessages.SameSizeMenuManager_MakeSameSize_ActionToolTipText);
		}
	}

	/**
	 * Creates a new instance of the arrange menu manager
	 */
	public MakeSameSizeMenuManager() {
		super(ActionIds.MENU_MAKE_SAME_SIZE, new MakeSameMenuAction(), true);
	}
}
