package hadoopmodel.diagram.providers.assistants;

import hadoopmodel.diagram.edit.parts.HDFSNameNodeEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerEditPart;
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
public class HadoopStackModelingAssistantProviderOfJobTrackerEditPart extends
		HadoopStackModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((JobTrackerEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(JobTrackerEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003);
		types.add(HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002);
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
				(JobTrackerEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			JobTrackerEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ServerEditPart) {
			types.add(HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003);
		}
		if (targetEditPart instanceof HDFSNameNodeEditPart) {
			types.add(HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002);
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
		return doGetTypesForTarget((JobTrackerEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(JobTrackerEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003) {
			types.add(HadoopStackElementTypes.Server_2001);
		} else if (relationshipType == HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002) {
			types.add(HadoopStackElementTypes.HDFSNameNode_2005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((JobTrackerEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(JobTrackerEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004);
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
		return doGetTypesForSource((JobTrackerEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(JobTrackerEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004) {
			types.add(HadoopStackElementTypes.TaskTracker_2006);
		}
		return types;
	}

}
