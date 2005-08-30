/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2005.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.emf.type.core;

import java.net.URL;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

/**
 * Represents an element type that maps directly to a metamodel element type (
 * <code>EClass</code>). There is only one metamodel type registered with the
 * {@link org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry}for a given EClass.
 * <P>
 * Provides an edit helper for editing model elements with the same
 * <code>EClass</code>.
 * 
 * @author ldamus
 */
public class MetamodelType
	extends ElementType
	implements IMetamodelType {

	/**
	 * The edit helper.
	 */
	private IEditHelper editHelper;

	/**
	 * Constructs a new metamodel type.
	 * 
	 * @param id
	 *            the id
	 * @param iconURL
	 *            the URL for the icon
	 * @param displayName
	 *            the display name
	 * @param eClass
	 *            the metaclass
	 * @param editHelper
	 *            the edit helper
	 */
	public MetamodelType(String id, URL iconURL, String displayName,
			EClass eClass, IEditHelper editHelper) {

		super(id, iconURL, displayName, eClass);
		this.editHelper = editHelper;
	}
	

	/**
	 * Constructs a new metamodel type using values from the type descriptor.
	 * 
	 * @param descriptor
	 *            the metamodel type descriptor.
	 */
	public MetamodelType(IMetamodelTypeDescriptor descriptor) {

		this(descriptor.getId(), descriptor.getIconURL(), descriptor.getName(),
				descriptor.getEClass(), descriptor.getEditHelper());

	}

	/**
	 * Gets the edit helper. May activate the plugin in which the edit helper is
	 * defined.
	 * 
	 * @return the edit helper.
	 */
	public IEditHelper getEditHelper() {
		
		if (editHelper == null) {
			IElementType[] superTypes = getAllSuperTypes();
			
			if (superTypes.length > 0) {
				editHelper = superTypes[superTypes.length - 1].getEditHelper();
			}
		}
		return editHelper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.xtools.emf.msl.type.IElementType#getCommand(com.ibm.xtools.emf.msl.type.edit.EditCommandRequest)
	 */
	public ICommand getEditCommand(IEditCommandRequest request) {
		return getEditHelper().getEditCommand(request);
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.type.core.IElementType#getAllSuperTypes()
	 */
	public IElementType[] getAllSuperTypes() {

		if (super.getAllSuperTypes() == null) {
			LinkedHashSet result = new LinkedHashSet();
			List supertypes = getEClass().getEAllSuperTypes();

			for (int i = 0; i < supertypes.size(); i++) {
				EClass nextEClass = (EClass) supertypes.get(i);
				IElementType nextElementType = ElementTypeRegistry
					.getInstance().getElementType(nextEClass);

				if (nextElementType != null) {
					result.add(nextElementType);
				}
			}
			setAllSupertypes((IElementType[]) result
				.toArray(new IElementType[] {}));
		}
		return super.getAllSuperTypes();
	}

}