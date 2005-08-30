/*
 * Created on Sep 17, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.gmf.runtime.draw2d.ui.internal.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapMode;


/**
 * A copy of GEF's ImageFigure that takes care of himetric conversion
 * 
 * @author melaasar
 */
public class ImageFigureEx
	extends Figure {

	private Image img;

	private Dimension size = new Dimension();

	private int alignment;

	/**
	 * Constructor <br>
	 * The default alignment is <code>PositionConstants.CENTER</code>.
	 */
	public ImageFigureEx() {
		this(null, PositionConstants.CENTER);
	}

	/**
	 * Constructor <br>
	 * The default alignment is <code>PositionConstants.CENTER</code>.
	 * 
	 * @param image
	 *            The Image to be displayed
	 */
	public ImageFigureEx(Image image) {
		this(image, PositionConstants.CENTER);
	}

	/**
	 * Constructor
	 * 
	 * @param image
	 *            The Image to be displayed
	 * @param alignment
	 *            A PositionConstant indicating the alignment
	 * 
	 * @see ImageFigure#setImage(Image)
	 * @see ImageFigure#setAlignment(int)
	 */
	public ImageFigureEx(Image image, int alignment) {
		setImage(image);
		setAlignment(alignment);
	}

	/**
	 * @return The Image that this Figure displays
	 */
	public Image getImage() {
		return img;
	}

	/**
	 * Returns the size of the Image that this Figure displays; or (0,0) if no
	 * Image has been set.
	 * 
	 * @see org.eclipse.draw2d.Figure#getPreferredSize(int, int)
	 */
	public Dimension getPreferredSize(int wHint, int hHint) {
		return size;
	}

	/**
	 * @see org.eclipse.draw2d.Figure#paintFigure(Graphics)
	 */
	protected void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);

		if (getImage() == null)
			return;

		int x, y;
		Rectangle area = getClientArea();
		switch (alignment & PositionConstants.NORTH_SOUTH) {
			case PositionConstants.NORTH:
				y = area.y;
				break;
			case PositionConstants.SOUTH:
				y = area.y + area.height - size.height;
				break;
			default:
				y = (area.height - size.height) / 2 + area.y;
				break;
		}
		switch (alignment & PositionConstants.EAST_WEST) {
			case PositionConstants.EAST:
				x = area.x + area.width - size.width;
				break;
			case PositionConstants.WEST:
				x = area.x;
				break;
			default:
				x = (area.width - size.width) / 2 + area.x;
				break;
		}
		graphics.drawImage(getImage(), x, y);
	}

	/**
	 * Sets the alignment of the Image within this Figure. The alignment comes
	 * into play when the ImageFigure is larger than the Image. The alignment
	 * could be any valid combination of the following:
	 * 
	 * <UL>
	 * <LI>PositionConstants.NORTH</LI>
	 * <LI>PositionConstants.SOUTH</LI>
	 * <LI>PositionConstants.EAST</LI>
	 * <LI>PositionConstants.WEST</LI>
	 * <LI>PositionConstants.CENTER or PositionConstants.NONE</LI>
	 * </UL>
	 * 
	 * @param flag
	 *            A constant indicating the alignment
	 */
	public void setAlignment(int flag) {
		alignment = flag;
	}

	/**
	 * Sets the Image that this ImageFigure displays.
	 * <p>
	 * IMPORTANT: Note that it is the client's responsibility to dispose the
	 * given image.
	 * 
	 * @param image
	 *            The Image to be displayed. It can be <code>null</code>.
	 */
	public void setImage(Image image) {
		if (img == image)
			return;
		img = image;
		if (img != null) {
			org.eclipse.swt.graphics.Rectangle r = image.getBounds();
			size = new Dimension(MapMode.DPtoLP(r.width), MapMode.DPtoLP(r.height));
		}
		else
			size = new Dimension();
		revalidate();
		repaint();
	}
}

