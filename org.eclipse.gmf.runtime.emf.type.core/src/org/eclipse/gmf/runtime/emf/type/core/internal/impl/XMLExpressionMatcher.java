/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2005.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.emf.type.core.internal.impl;

import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.expressions.EvaluationResult;
import org.eclipse.core.expressions.Expression;
import org.eclipse.core.expressions.ExpressionConverter;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.common.core.util.Log;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.gmf.runtime.emf.type.core.internal.EMFTypePlugin;
import org.eclipse.gmf.runtime.emf.type.core.internal.EMFTypePluginStatusCodes;
import org.eclipse.gmf.runtime.emf.type.core.internal.l10n.ResourceManager;

/**
 * Element matcher that matches model elements using an XML expression.
 * 
 * @author ldamus
 */
public class XMLExpressionMatcher
	implements IElementMatcher {
	
	/**
	 * Variable representing the container of the element being tested.
	 */
	public static final String ECONTAINER_VARIABLE = "eContainer"; //$NON-NLS-1$
	
	/**
	 * The element ID in which this expression is contributed.
	 */
	private final String id;
	
	/**
	 * The XML expression.
	 */
	private final Expression xmlExpression;

	/**
	 * Constructs a new XML expression matcher.
	 * 
	 * @param config
	 *            the expression configuration element
	 */
	public XMLExpressionMatcher(IConfigurationElement config, String id)
		throws CoreException {
		
		this.id = id;

		try {
			xmlExpression = ExpressionConverter.getDefault().perform(config);

		} catch (CoreException e) {
			throw EMFTypePluginStatusCodes.getInitException(id,
				EMFTypePluginStatusCodes.ENABLEMENT_INVALID_EXPRESSION_KEY, e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.emf.core.type.IElementMatcher#matches(org.eclipse.emf.ecore.EObject)
	 */
	public boolean matches(EObject eObject) {

		try {
			EvaluationContext evaluationContext = new EvaluationContext(null, eObject);
			
			EObject container = eObject.eContainer();
			
			if (container != null) {
				evaluationContext.addVariable(ECONTAINER_VARIABLE, container);
			}
			
			EvaluationResult result = xmlExpression.evaluate(evaluationContext);
			
			if (result == EvaluationResult.TRUE) {
				return true;
			}

		} catch (CoreException e) {
			Log.error(EMFTypePlugin.getPlugin(),
				EMFTypePluginStatusCodes.EXPRESSION_EVALUATION_FAILURE,
				ResourceManager.getMessage(
					EMFTypePluginStatusCodes.EXPRESSION_EVALUATION_FAILURE_KEY,
					new Object[] {id}), e);
		}

		return false;
	}

}