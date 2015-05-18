package hadoopmodel.diagram.providers.assistants;

import hadoopmodel.diagram.edit.parts.HBaseMasterEditPart;
import hadoopmodel.diagram.edit.parts.HBaseRegionServerEditPart;
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
public class HadoopStackModelingAssistantProviderOfHBaseRegionServerEditPart
		extends HadoopStackModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((HBaseRegionServerEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			HBaseRegionServerEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_connectTo_4009);
		types.add(HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012);
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
				(HBaseRegionServerEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			HBaseRegionServerEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof HBaseMasterEditPart) {
			types.add(HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_connectTo_4009);
		}
		if (targetEditPart instanceof ServerEditPart) {
			types.add(HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012);
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
		return doGetTypesForTarget((HBaseRegionServerEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			HBaseRegionServerEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_connectTo_4009) {
			types.add(HadoopStackElementTypes.HBaseMaster_2007);
		} else if (relationshipType == HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012) {
			types.add(HadoopStackElementTypes.Server_2001);
		}
		return types;
	}

}
