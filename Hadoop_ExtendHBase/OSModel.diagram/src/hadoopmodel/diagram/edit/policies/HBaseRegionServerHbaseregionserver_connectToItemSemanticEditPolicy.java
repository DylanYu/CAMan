package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.providers.HadoopStackElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class HBaseRegionServerHbaseregionserver_connectToItemSemanticEditPolicy
		extends HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HBaseRegionServerHbaseregionserver_connectToItemSemanticEditPolicy() {
		super(
				HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_connectTo_4009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
