package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.providers.HadoopStackElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class JobTrackerJobtracker_dependOnItemSemanticEditPolicy extends
		HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JobTrackerJobtracker_dependOnItemSemanticEditPolicy() {
		super(HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
