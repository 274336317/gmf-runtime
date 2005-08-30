/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2002, 2005.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.emf.ui.services.parser;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

/**
 * Parser that permit the clients to register themselves
 * with the semantic element changes with the event handler.
 * If the the semantic element has semantic children then
 * the Parser will also register the listener so it can
 * listener to changes in them to.
 * 
 * @author nbalaba
 */
public interface ISemanticParser
	extends IParser {

	/**
	 * Obtains the semantic elements which this parser uses to formulate text
	 * for the specified <code>element</code>.
	 * 
	 * @param element The element that the receiver wishes to listen for changes on.
	 * @return List A list of semantic elements that this parser is responsible for parsing.
	 *   This should include the <code>element</code> itself and, optionally, other elements
	 *   somehow related to it 
	 */
	public List getSemanticElementsBeingParsed(EObject element);

	/**
	 * Determines if the event affects the semantic elements the parser uses to
	 * display strings. If true, the client should update the semantic elements
	 * to listen to
	 * 
	 * @param listener
	 *            the receiver (listener) of the event
	 * @param notification
	 *            the event notification
	 * @return <code>true</code> if the event affects the semantic
	 *         elements, otherwise <code>false</code>.
	 */
	public boolean areSemanticElementsAffected(EObject listener,
			Object notification);

}