package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.providers.HadoopStackElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class HBaseRegionServerHbaseregionserver_hostOnItemSemanticEditPolicy
		extends HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HBaseRegionServerHbaseregionserver_hostOnItemSemanticEditPolicy() {
		super(
				HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
