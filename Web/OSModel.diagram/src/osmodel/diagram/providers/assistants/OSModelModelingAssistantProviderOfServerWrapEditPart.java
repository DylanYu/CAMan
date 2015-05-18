package osmodel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import osmodel.diagram.edit.parts.ServerWrapEditPart;
import osmodel.diagram.providers.OSModelElementTypes;
import osmodel.diagram.providers.OSModelModelingAssistantProvider;

/**
 * @generated
 */
public class OSModelModelingAssistantProviderOfServerWrapEditPart extends
		OSModelModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ServerWrapEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ServerWrapEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(OSModelElementTypes.SoftwareSoftware_hostOn_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ServerWrapEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ServerWrapEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == OSModelElementTypes.SoftwareSoftware_hostOn_4006) {
			types.add(OSModelElementTypes.MySQLWrap_2005);
			types.add(OSModelElementTypes.WebWrap_2001);
			types.add(OSModelElementTypes.PHPWrap_2003);
			types.add(OSModelElementTypes.ApacheWrap_2004);
		}
		return types;
	}

}
