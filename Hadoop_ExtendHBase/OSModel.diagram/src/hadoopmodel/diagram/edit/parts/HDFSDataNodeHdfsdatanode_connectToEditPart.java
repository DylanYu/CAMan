package hadoopmodel.diagram.edit.parts;

import hadoopmodel.diagram.edit.policies.HDFSDataNodeHdfsdatanode_connectToItemSemanticEditPolicy;

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
public class HDFSDataNodeHdfsdatanode_connectToEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public HDFSDataNodeHdfsdatanode_connectToEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HDFSDataNodeHdfsdatanode_connectToItemSemanticEditPolicy());
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
		return new HDFSDataNodeHdfsdatanode_connectToFigure();
	}

	/**
	 * @generated
	 */
	public HDFSDataNodeHdfsdatanode_connectToFigure getPrimaryShape() {
		return (HDFSDataNodeHdfsdatanode_connectToFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HDFSDataNodeHdfsdatanode_connectToFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public HDFSDataNodeHdfsdatanode_connectToFigure() {

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
