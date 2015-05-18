package hadoopmodel.diagram.edit.parts;

import hadoopmodel.diagram.edit.policies.HadoopClusterHadoopcluster_slave_hostOnItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class HadoopClusterHadoopcluster_slave_hostOnEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4013;

	/**
	 * @generated
	 */
	public HadoopClusterHadoopcluster_slave_hostOnEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new HadoopClusterHadoopcluster_slave_hostOnItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new HadoopClusterHadoopcluster_master_hostOnFigure();
	}

	/**
	 * @generated
	 */
	public HadoopClusterHadoopcluster_master_hostOnFigure getPrimaryShape() {
		return (HadoopClusterHadoopcluster_master_hostOnFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HadoopClusterHadoopcluster_master_hostOnFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public HadoopClusterHadoopcluster_master_hostOnFigure() {

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
