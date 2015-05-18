package hadoopmodel.diagram.edit.parts;

import hadoopmodel.diagram.edit.policies.HadoopSlaveHadoopslave_connectToItemSemanticEditPolicy;

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
public class HadoopSlaveHadoopslave_connectToEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4009;

	/**
	 * @generated
	 */
	public HadoopSlaveHadoopslave_connectToEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HadoopSlaveHadoopslave_connectToItemSemanticEditPolicy());
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
		return new HadoopSlaveHadoopslave_connectToFigure();
	}

	/**
	 * @generated
	 */
	public HadoopSlaveHadoopslave_connectToFigure getPrimaryShape() {
		return (HadoopSlaveHadoopslave_connectToFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HadoopSlaveHadoopslave_connectToFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public HadoopSlaveHadoopslave_connectToFigure() {

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
