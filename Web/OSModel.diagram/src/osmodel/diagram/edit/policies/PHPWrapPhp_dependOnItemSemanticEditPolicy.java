package osmodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import osmodel.diagram.providers.OSModelElementTypes;

/**
 * @generated
 */
public class PHPWrapPhp_dependOnItemSemanticEditPolicy extends
		OSModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PHPWrapPhp_dependOnItemSemanticEditPolicy() {
		super(OSModelElementTypes.PHPWrapPhp_dependOn_4009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
