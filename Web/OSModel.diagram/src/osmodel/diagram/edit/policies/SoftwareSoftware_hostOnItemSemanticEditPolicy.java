package osmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import osmodel.diagram.providers.OSModelElementTypes;

/**
 * @generated
 */
public class SoftwareSoftware_hostOnItemSemanticEditPolicy extends
		OSModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SoftwareSoftware_hostOnItemSemanticEditPolicy() {
		super(OSModelElementTypes.SoftwareSoftware_hostOn_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
