package hadoopmodel.diagram.providers.assistants;

import hadoopmodel.diagram.edit.parts.JobTrackerEditPart;
import hadoopmodel.diagram.edit.parts.ServerEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerEditPart;
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
public class HadoopStackModelingAssistantProviderOfTaskTrackerEditPart extends
		HadoopStackModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TaskTrackerEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(TaskTrackerEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004);
		types.add(HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007);
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
				(TaskTrackerEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			TaskTrackerEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof JobTrackerEditPart) {
			types.add(HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004);
		}
		if (targetEditPart instanceof ServerEditPart) {
			types.add(HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007);
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
		return doGetTypesForTarget((TaskTrackerEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(TaskTrackerEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004) {
			types.add(HadoopStackElementTypes.JobTracker_2002);
		} else if (relationshipType == HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007) {
			types.add(HadoopStackElementTypes.Server_2001);
		}
		return types;
	}

}
