package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.edit.commands.HDFSDataNodeCreateCommand;
import hadoopmodel.diagram.edit.commands.HDFSNameNodeCreateCommand;
import hadoopmodel.diagram.edit.commands.JavaCreateCommand;
import hadoopmodel.diagram.edit.commands.JobTrackerCreateCommand;
import hadoopmodel.diagram.edit.commands.ServerCreateCommand;
import hadoopmodel.diagram.edit.commands.TaskTrackerCreateCommand;
import hadoopmodel.diagram.providers.HadoopStackElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class CloudItemSemanticEditPolicy extends
		HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CloudItemSemanticEditPolicy() {
		super(HadoopStackElementTypes.Cloud_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HadoopStackElementTypes.Server_2001 == req.getElementType()) {
			return getGEFWrapper(new ServerCreateCommand(req));
		}
		if (HadoopStackElementTypes.HDFSNameNode_2005 == req.getElementType()) {
			return getGEFWrapper(new HDFSNameNodeCreateCommand(req));
		}
		if (HadoopStackElementTypes.HDFSDataNode_2004 == req.getElementType()) {
			return getGEFWrapper(new HDFSDataNodeCreateCommand(req));
		}
		if (HadoopStackElementTypes.TaskTracker_2006 == req.getElementType()) {
			return getGEFWrapper(new TaskTrackerCreateCommand(req));
		}
		if (HadoopStackElementTypes.JobTracker_2002 == req.getElementType()) {
			return getGEFWrapper(new JobTrackerCreateCommand(req));
		}
		if (HadoopStackElementTypes.Java_2003 == req.getElementType()) {
			return getGEFWrapper(new JavaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
