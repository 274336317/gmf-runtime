/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2002, 2003.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.emf.clipboard.core;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;

import org.eclipse.gmf.runtime.emf.clipboard.core.internal.ClipboardDebugOptions;
import org.eclipse.gmf.runtime.emf.clipboard.core.internal.ClipboardPlugin;

/**
 * Abstract specification of a copy or paste operation.  Maintains a progress
 * monitor, support utility, and provides some reusable features.
 * <p>
 * <b>Note</b> that this class is not intended to be extended
 * by clients.  Clients may not instantiate it.
 * </p>
 * 
 * @author Yasser Lulu 
 */
public abstract class ClipboardOperation {

	/** The size of a single work unit in the progress monitor. */
	public static final int WORK_UNIT = 1;

	/** The total amount of work accorded to a progress monitor. */
	public static final int TOTAL_WORK = 100;

	private IProgressMonitor monitor;

	private IClipboardSupport clipboardSupport;

	/**
	 * Initializes me with my progress monitor and clipboard support.
	 * 
	 * @param monitor a progress monitor, or <code>null</code> if
	 *     no progress tracking is needed
	 * @param clipboardSupport the clipboard support object
	 */
	public ClipboardOperation(IProgressMonitor monitor,
			IClipboardSupport clipboardSupport) {
		this.monitor = (monitor != null) ? monitor : new NullProgressMonitor();
		this.clipboardSupport = clipboardSupport;
	}

	/**
	 * Obtains my progress monitor.
	 * 
	 * @return my progress monitor (never <code>null</code>)
	 */
	protected IProgressMonitor getProgressMonitor() {
		return monitor;
	}

	/**
	 * Queries whether I have been cancelled, by cancellation of my progress
	 * monitor.
	 * 
	 * @return whether I have been cancelled
	 */
	protected boolean isCancelled() {
		return getProgressMonitor().isCanceled();
	}

	/**
	 * Obtains the clipboard support object that I rely on to make decisions
	 * about copy/paste semantics.
	 * 
	 * @return my clipboard support
	 */
	protected final IClipboardSupport getClipboardOperationHelper() {
		// TODO: Rename this as getClipboardSupport()
		return clipboardSupport;
	}

	/**
	 * Traces and logs a caught exception.
	 *  
	 * @param methodName the method in which the exception was caught
	 * @param ex the exception that was caught
	 */
	protected void catchException(String methodName, Exception ex) {
		ClipboardPlugin.catching(getClass(), methodName, ex);
	}

	/**
	 * Traces and logs a thrown exception.
	 *  
	 * @param methodName the method in which the exception was thrown
	 * @param ex the exception that was thrown
	 * 
	 * @throws RuntimeException the <code>ex</code> parameter
	 */
	protected void throwException(String methodName, RuntimeException ex) {
		ClipboardPlugin.throwing(getClass(), methodName, ex);
		throw ex;
	}

	/**
	 * Throws, traces, and logs a cancellation exception.
	 *  
	 * @param methodName the method in which the exception was caught
	 * 
	 * @throws OperationCanceledException always
	 */
	protected void throwCancelException(String methodName) {
		throwException(methodName, new OperationCanceledException(
			"Operation Canceled")); //$NON-NLS-1$
	}

}