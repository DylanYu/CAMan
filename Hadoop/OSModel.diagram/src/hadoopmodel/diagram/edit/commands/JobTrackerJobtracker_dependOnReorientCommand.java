package hadoopmodel.diagram.edit.commands;

import hadoopmodel.HDFSNameNode;
import hadoopmodel.JobTracker;
import hadoopmodel.diagram.edit.policies.HadoopStackBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class JobTrackerJobtracker_dependOnReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public JobTrackerJobtracker_dependOnReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof JobTracker) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof HDFSNameNode && newEnd instanceof JobTracker)) {
			return false;
		}
		return HadoopStackBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistJobTrackerJobtracker_dependOn_4002(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof HDFSNameNode && newEnd instanceof HDFSNameNode)) {
			return false;
		}
		return HadoopStackBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistJobTrackerJobtracker_dependOn_4002(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setJobtracker_dependOn(null);
		getNewSource().setJobtracker_dependOn(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setJobtracker_dependOn(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected JobTracker getOldSource() {
		return (JobTracker) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected JobTracker getNewSource() {
		return (JobTracker) newEnd;
	}

	/**
	 * @generated
	 */
	protected HDFSNameNode getOldTarget() {
		return (HDFSNameNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected HDFSNameNode getNewTarget() {
		return (HDFSNameNode) newEnd;
	}
}
