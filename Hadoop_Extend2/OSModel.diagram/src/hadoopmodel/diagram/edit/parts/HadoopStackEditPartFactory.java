package hadoopmodel.diagram.edit.parts;

import hadoopmodel.diagram.part.HadoopStackVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class HadoopStackEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (HadoopStackVisualIDRegistry.getVisualID(view)) {

			case CloudEditPart.VISUAL_ID:
				return new CloudEditPart(view);

			case HadoopClusterEditPart.VISUAL_ID:
				return new HadoopClusterEditPart(view);

			case HadoopClusterJava_jdk_versionEditPart.VISUAL_ID:
				return new HadoopClusterJava_jdk_versionEditPart(view);

			case ServerEditPart.VISUAL_ID:
				return new ServerEditPart(view);

			case ServerServer_nameEditPart.VISUAL_ID:
				return new ServerServer_nameEditPart(view);

			case HadoopClusterHadoopcluster_master_hostOnEditPart.VISUAL_ID:
				return new HadoopClusterHadoopcluster_master_hostOnEditPart(
						view);

			case HadoopClusterHadoopcluster_slave_hostOnEditPart.VISUAL_ID:
				return new HadoopClusterHadoopcluster_slave_hostOnEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
