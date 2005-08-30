/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2003, 2004.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.draw2d.ui.render.internal.svg.metafile;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;

import org.apache.batik.transcoder.TranscoderException;

/**
 * @author dhabib
 * @canBeSeenBy org.eclipse.gmf.runtime.draw2d.ui.render.*
 *
 */
public class RoundRect implements IEmf2SvgConverter, IWmf2SvgConverter, IRenderToPath
{
	private static final int	EMF_RECT_OFFSET			= 0;
	private static final int	EMF_CORNER_OFFSET		= 16;

	private static final int	WMF_ELBOW_HEIGHT_OFFSET	= 0;
	private static final int	WMF_ELBOW_WIDTH_OFFSET	= 2;
	private static final int	WMF_BOTTOM_OFFSET		= 4;
	private static final int	WMF_RIGHT_OFFSET		= 6;
	private static final int	WMF_TOP_OFFSET			= 8;
	private static final int	WMF_LEFT_OFFSET			= 10;
	
	private Rectangle	m_rect			= null;
	private Dimension	m_corner		= null;

	public void readWMFRecord( Record rec ) throws IOException
	{
		int elbowHeight	= rec.getShortAt( WMF_ELBOW_HEIGHT_OFFSET );
		int elbowWidth 	= rec.getShortAt( WMF_ELBOW_WIDTH_OFFSET );

		int bottom 	= rec.getShortAt( WMF_BOTTOM_OFFSET );
		int right 	= rec.getShortAt( WMF_RIGHT_OFFSET );
		int top 	= rec.getShortAt( WMF_TOP_OFFSET );
		int left 	= rec.getShortAt( WMF_LEFT_OFFSET );
		
		m_rect = new Rectangle( left, top, right - left, bottom - top );
		m_corner = new Dimension( elbowWidth, elbowHeight );
	}
	
	public void readEMFRecord( Record rec ) throws IOException
	{
		m_rect 		= rec.getRectangleLAt( EMF_RECT_OFFSET );
		m_corner 	= rec.getDimensionLAt( EMF_CORNER_OFFSET );
	}

	public void render( Graphics2D g, DeviceContext context ) throws TranscoderException
	{
		Shape s = getShape( context );
		
		GdiBrush brush = context.getCurBrush();
		
		if( brush != null )
		{
			brush.fill( s, g, context );
		}
		
		GdiPen pen = context.getCurPen();
		
		if( pen != null )
		{
			pen.apply( g, context );
			g.draw( s );
		}
	}

	public void render( DeviceContext context ) throws TranscoderException
	{
		Shape s = getShape( context );
		context.getGdiPath().appendFigure( s );
	}
	
	private Shape getShape( DeviceContext context )
	{
		int x 				= context.convertXToSVGLogicalUnits( m_rect.x );
		int y 				= context.convertYToSVGLogicalUnits( m_rect.y );
		int w 				= context.scaleX( m_rect.width );
		int h 				= context.scaleY( m_rect.height );
		int cornerWidth		= context.scaleX( m_corner.width );
		int cornerHeight	= context.scaleY( m_corner.height );
		
		return new RoundRectangle2D.Double( x, y, w, h, cornerWidth, cornerHeight );
	}

}
