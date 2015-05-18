package osmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import osmodel.diagram.providers.OSModelElementTypes;

/**
 * @generated
 */
public class WebWrapWeb_connectToItemSemanticEditPolicy extends
		OSModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WebWrapWeb_connectToItemSemanticEditPolicy() {
		super(OSModelElementTypes.WebWrapWeb_connectTo_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
