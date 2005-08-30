/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.draw2d.ui.render.internal.svg.metafile;

/**
 * Represents an thrown by the transcoder.
 * @author dhabib
 * @canBeSeenBy org.eclipse.gmf.runtime.draw2d.ui.render.*
 */
public class TranscoderException extends Exception
{
	private Exception m_exception	= null;
	private boolean recoverable = true;
	
	/**
	 * Creates a new TranscoderException with the specified message.
	 * @param detailMessage
	 */
	public TranscoderException( String detailMessage )
	{
		super( detailMessage );
	}
	
	/**
	 * Accessor method indicating whether the exception should be logged or not.
	 * @return true if it is possible to recover from the exception, false otherwise
	 */
	public boolean isRecoverable() {
		return recoverable;
	}
	
	/**
	 * Creates a new TranscoderException with the specified message.
	 * @param detailMessage
	 * @param recoverable boolean indicating whether the exception is recoverable or not.  The exception
	 * could be during the autosensing phase in which case the client should handle the exception.
	 */
	public TranscoderException( Exception e, boolean recoverable )
	{
		this( e );
		this.recoverable = recoverable;
	}

	/**
	 * Creates a new TranscoderException wrapping the specified exception.
	 * @param e
	 */
	public TranscoderException( Exception e )
	{
		super( e.getMessage() );
		m_exception = e;
	}
	
	/**
	 * Creates a new TranscoderException with the specified message and
	 * wrapping the specified exception
	 * @param detailMessage
	 * @param e
	 */
	public TranscoderException( String detailMessage, Exception e )
	{
		super( detailMessage );
		m_exception = e;
	}
	
	/**
	 * @return The wrapped exception.
	 */
	public Exception getException()
	{
		return m_exception;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	public String getMessage()
	{
		if( super.getMessage() != null && super.getMessage().length() > 0 )
		{
			return super.getMessage();
		}
		else if( m_exception != null )
		{
			return m_exception.getMessage();
		}
		
		return "";//$NON-NLS-1$
	}
}
