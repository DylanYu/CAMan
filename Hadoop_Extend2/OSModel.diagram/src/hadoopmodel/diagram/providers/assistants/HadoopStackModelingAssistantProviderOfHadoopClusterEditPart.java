package hadoopmodel.diagram.providers.assistants;

import hadoopmodel.diagram.edit.parts.HadoopClusterEditPart;
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
public class HadoopStackModelingAssistantProviderOfHadoopClusterEditPart extends
		HadoopStackModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((HadoopClusterEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(HadoopClusterEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(HadoopStackElementTypes.HadoopClusterHadoopcluster_master_hostOn_4012);
		types.add(HadoopStackElementTypes.HadoopClusterHadoopcluster_slave_hostOn_4013);
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
				(HadoopClusterEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			HadoopClusterEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ServerEditPart) {
			types.add(HadoopStackElementTypes.HadoopClusterHadoopcluster_master_hostOn_4012);
		}
		if (targetEditPart instanceof ServerEditPart) {
			types.add(HadoopStackElementTypes.HadoopClusterHadoopcluster_slave_hostOn_4013);
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
		return doGetTypesForTarget((HadoopClusterEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(HadoopClusterEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HadoopStackElementTypes.HadoopClusterHadoopcluster_master_hostOn_4012) {
			types.add(HadoopStackElementTypes.Server_2001);
		} else if (relationshipType == HadoopStackElementTypes.HadoopClusterHadoopcluster_slave_hostOn_4013) {
			types.add(HadoopStackElementTypes.Server_2001);
		}
		return types;
	}

}
