package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.providers.HadoopStackElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class HadoopClusterHadoopcluster_slave_hostOnItemSemanticEditPolicy
		extends HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HadoopClusterHadoopcluster_slave_hostOnItemSemanticEditPolicy() {
		super(
				HadoopStackElementTypes.HadoopClusterHadoopcluster_slave_hostOn_4013);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
