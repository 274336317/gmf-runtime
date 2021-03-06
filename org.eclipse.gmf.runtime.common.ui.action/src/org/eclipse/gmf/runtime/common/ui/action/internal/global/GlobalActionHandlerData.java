/******************************************************************************
 * Copyright (c) 2002, 2003 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.common.ui.action.internal.global;

import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandler;

/**
 * A tuple that contains the <code>IGlobalActionHandler</code> and its
 * associated <code>IGlobalActionContext</code>
 * 
 * @author Vishy Ramaswamy
 */
public final class GlobalActionHandlerData {

    /**
     * Attribute for the handler
     */
    final private IGlobalActionHandler handler;

    /**
     * Attribute for the context
     */
    final private IGlobalActionContext context;

    /**
     * Constructor for GlobalActionHandlerData.
     * 
     * @param handler attribute for the context
     * @param context attribute for the handler
     */
    public GlobalActionHandlerData(
        IGlobalActionHandler handler,
        IGlobalActionContext context) {
        super();

        assert null != handler;
        assert null != context;

        this.handler = handler;
        this.context = context;
    }

    /**
     * Returns the handler.
     * @return IGlobalActionHandler
     */
    public IGlobalActionHandler getHandler() {
        return handler;
    }

    /**
     * Returns the context.
     * @return IGlobalActionContext
     */
    public IGlobalActionContext getContext() {
        return context;
    }
}
