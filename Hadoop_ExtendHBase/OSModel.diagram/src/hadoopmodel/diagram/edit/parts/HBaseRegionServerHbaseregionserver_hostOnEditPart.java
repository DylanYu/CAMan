package hadoopmodel.diagram.edit.parts;

import hadoopmodel.diagram.edit.policies.HBaseRegionServerHbaseregionserver_hostOnItemSemanticEditPolicy;

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
public class HBaseRegionServerHbaseregionserver_hostOnEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4012;

	/**
	 * @generated
	 */
	public HBaseRegionServerHbaseregionserver_hostOnEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new HBaseRegionServerHbaseregionserver_hostOnItemSemanticEditPolicy());
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
		return new HBaseRegionServerHbaseregionserver_hostOnFigure();
	}

	/**
	 * @generated
	 */
	public HBaseRegionServerHbaseregionserver_hostOnFigure getPrimaryShape() {
		return (HBaseRegionServerHbaseregionserver_hostOnFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HBaseRegionServerHbaseregionserver_hostOnFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public HBaseRegionServerHbaseregionserver_hostOnFigure() {

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
