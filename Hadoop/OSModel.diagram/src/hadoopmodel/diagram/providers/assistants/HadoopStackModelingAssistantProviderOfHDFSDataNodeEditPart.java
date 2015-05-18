package hadoopmodel.diagram.providers.assistants;

import hadoopmodel.diagram.edit.parts.HDFSDataNodeEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeEditPart;
import hadoopmodel.diagram.edit.parts.ServerEditPart;
import hadoopmodel.diagram.providers.HadoopStackElementTypes;
import hadoopmodel.diagram.providers.HadoopStackModelingAssistantProvider;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HadoopStackModelingAssistantProviderOfHDFSDataNodeEditPart extends
		HadoopStackModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((HDFSDataNodeEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(HDFSDataNodeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006);
		types.add(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005);
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
		return doGetRelTypesOnSourceAndTarget(
				(HDFSDataNodeEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			HDFSDataNodeEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ServerEditPart) {
			types.add(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006);
		}
		if (targetEditPart instanceof HDFSNameNodeEditPart) {
			types.add(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005);
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
		return doGetTypesForTarget((HDFSDataNodeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(HDFSDataNodeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006) {
			types.add(HadoopStackElementTypes.Server_2001);
		} else if (relationshipType == HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005) {
			types.add(HadoopStackElementTypes.HDFSNameNode_2005);
		}
		return types;
	}

}
