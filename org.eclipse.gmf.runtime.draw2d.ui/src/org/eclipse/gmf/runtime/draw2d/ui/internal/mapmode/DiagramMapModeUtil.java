/******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package org.eclipse.gmf.runtime.draw2d.ui.internal.mapmode;

import org.eclipse.draw2d.geometry.Translatable;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;


/**
 * @author sshaw
 * 
 * Internal MapMode util to extract a scale value from the IMapMode interface.  The scale factor
 * shouldn't be exposed through public API to allow future support for non linear scaling coordinate
 * systems.
 */
public class DiagramMapModeUtil extends MapModeUtil {

	private static class TranslatableDouble implements Translatable {

		double scale = 1.0;
		
		public void performScale(double factor) {
			scale = factor;
		}

		public void performTranslate(int dx, int dy) {
			// do nothing
		}

		protected double getScale() {
			return scale;
		}
	}
	
	private static TranslatableDouble SCALE = new TranslatableDouble();
	
	static public double getScale( IMapMode mm ) {
		mm.LPtoDP(SCALE);
		return SCALE.getScale();
	}
}
