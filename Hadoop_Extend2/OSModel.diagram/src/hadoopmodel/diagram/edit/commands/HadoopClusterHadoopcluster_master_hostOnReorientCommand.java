package hadoopmodel.diagram.edit.commands;

import hadoopmodel.HadoopCluster;
import hadoopmodel.Server;
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
public class HadoopClusterHadoopcluster_master_hostOnReorientCommand extends
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
	public HadoopClusterHadoopcluster_master_hostOnReorientCommand(
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
		if (false == referenceOwner instanceof HadoopCluster) {
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
		if (!(oldEnd instanceof Server && newEnd instanceof HadoopCluster)) {
			return false;
		}
		return HadoopStackBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistHadoopClusterHadoopcluster_master_hostOn_4012(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Server && newEnd instanceof Server)) {
			return false;
		}
		return HadoopStackBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistHadoopClusterHadoopcluster_master_hostOn_4012(
						getOldSource(), getNewTarget());
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
		getOldSource().setHadoopcluster_master_hostOn(null);
		getNewSource().setHadoopcluster_master_hostOn(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setHadoopcluster_master_hostOn(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected HadoopCluster getOldSource() {
		return (HadoopCluster) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected HadoopCluster getNewSource() {
		return (HadoopCluster) newEnd;
	}

	/**
	 * @generated
	 */
	protected Server getOldTarget() {
		return (Server) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Server getNewTarget() {
		return (Server) newEnd;
	}
}
