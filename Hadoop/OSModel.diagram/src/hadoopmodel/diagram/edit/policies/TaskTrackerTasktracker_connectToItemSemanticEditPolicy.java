package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.providers.HadoopStackElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class TaskTrackerTasktracker_connectToItemSemanticEditPolicy extends
		HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TaskTrackerTasktracker_connectToItemSemanticEditPolicy() {
		super(HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
