package osmodel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import osmodel.diagram.edit.commands.ApacheWrapCreateCommand;
import osmodel.diagram.edit.commands.MySQLWrapCreateCommand;
import osmodel.diagram.edit.commands.PHPWrapCreateCommand;
import osmodel.diagram.edit.commands.ServerWrapCreateCommand;
import osmodel.diagram.edit.commands.WebWrapCreateCommand;
import osmodel.diagram.providers.OSModelElementTypes;

/**
 * @generated
 */
public class ClusterWrapItemSemanticEditPolicy extends
		OSModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClusterWrapItemSemanticEditPolicy() {
		super(OSModelElementTypes.ClusterWrap_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OSModelElementTypes.MySQLWrap_2005 == req.getElementType()) {
			return getGEFWrapper(new MySQLWrapCreateCommand(req));
		}
		if (OSModelElementTypes.WebWrap_2001 == req.getElementType()) {
			return getGEFWrapper(new WebWrapCreateCommand(req));
		}
		if (OSModelElementTypes.ServerWrap_2002 == req.getElementType()) {
			return getGEFWrapper(new ServerWrapCreateCommand(req));
		}
		if (OSModelElementTypes.PHPWrap_2003 == req.getElementType()) {
			return getGEFWrapper(new PHPWrapCreateCommand(req));
		}
		if (OSModelElementTypes.ApacheWrap_2004 == req.getElementType()) {
			return getGEFWrapper(new ApacheWrapCreateCommand(req));
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
