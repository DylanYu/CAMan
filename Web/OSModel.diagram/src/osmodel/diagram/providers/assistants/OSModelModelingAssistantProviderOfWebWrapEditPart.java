package osmodel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import osmodel.diagram.edit.parts.MySQLWrapEditPart;
import osmodel.diagram.edit.parts.PHPWrapEditPart;
import osmodel.diagram.edit.parts.ServerWrapEditPart;
import osmodel.diagram.edit.parts.WebWrapEditPart;
import osmodel.diagram.providers.OSModelElementTypes;
import osmodel.diagram.providers.OSModelModelingAssistantProvider;

/**
 * @generated
 */
public class OSModelModelingAssistantProviderOfWebWrapEditPart extends
		OSModelModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((WebWrapEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(WebWrapEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(OSModelElementTypes.WebWrapWeb_connectTo_4004);
		types.add(OSModelElementTypes.SoftwareSoftware_hostOn_4006);
		types.add(OSModelElementTypes.WebWrapWeb_dependOn_4007);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((WebWrapEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			WebWrapEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof MySQLWrapEditPart) {
			types.add(OSModelElementTypes.WebWrapWeb_connectTo_4004);
		}
		if (targetEditPart instanceof ServerWrapEditPart) {
			types.add(OSModelElementTypes.SoftwareSoftware_hostOn_4006);
		}
		if (targetEditPart instanceof PHPWrapEditPart) {
			types.add(OSModelElementTypes.WebWrapWeb_dependOn_4007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((WebWrapEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(WebWrapEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == OSModelElementTypes.WebWrapWeb_connectTo_4004) {
			types.add(OSModelElementTypes.MySQLWrap_2005);
		} else if (relationshipType == OSModelElementTypes.SoftwareSoftware_hostOn_4006) {
			types.add(OSModelElementTypes.ServerWrap_2002);
		} else if (relationshipType == OSModelElementTypes.WebWrapWeb_dependOn_4007) {
			types.add(OSModelElementTypes.PHPWrap_2003);
		}
		return types;
	}

}
