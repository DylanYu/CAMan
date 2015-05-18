package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.edit.commands.HadoopMasterCreateCommand;
import hadoopmodel.diagram.edit.commands.HadoopSlaveCreateCommand;
import hadoopmodel.diagram.edit.commands.ServerCreateCommand;
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
		if (HadoopStackElementTypes.HadoopMaster_2007 == req.getElementType()) {
			return getGEFWrapper(new HadoopMasterCreateCommand(req));
		}
		if (HadoopStackElementTypes.Server_2001 == req.getElementType()) {
			return getGEFWrapper(new ServerCreateCommand(req));
		}
		if (HadoopStackElementTypes.HadoopSlave_2008 == req.getElementType()) {
			return getGEFWrapper(new HadoopSlaveCreateCommand(req));
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
