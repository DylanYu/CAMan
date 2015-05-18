package osmodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import osmodel.diagram.part.OSModelVisualIDRegistry;

/**
 * @generated
 */
public class OSModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (OSModelVisualIDRegistry.getVisualID(view)) {

			case ClusterWrapEditPart.VISUAL_ID:
				return new ClusterWrapEditPart(view);

			case MySQLWrapEditPart.VISUAL_ID:
				return new MySQLWrapEditPart(view);

			case MySQLWrapSoftware_nameEditPart.VISUAL_ID:
				return new MySQLWrapSoftware_nameEditPart(view);

			case WebWrapEditPart.VISUAL_ID:
				return new WebWrapEditPart(view);

			case WebWrapSoftware_nameEditPart.VISUAL_ID:
				return new WebWrapSoftware_nameEditPart(view);

			case ServerWrapEditPart.VISUAL_ID:
				return new ServerWrapEditPart(view);

			case ServerWrapServer_nameEditPart.VISUAL_ID:
				return new ServerWrapServer_nameEditPart(view);

			case PHPWrapEditPart.VISUAL_ID:
				return new PHPWrapEditPart(view);

			case PHPWrapSoftware_nameEditPart.VISUAL_ID:
				return new PHPWrapSoftware_nameEditPart(view);

			case ApacheWrapEditPart.VISUAL_ID:
				return new ApacheWrapEditPart(view);

			case ApacheWrapSoftware_nameEditPart.VISUAL_ID:
				return new ApacheWrapSoftware_nameEditPart(view);

			case WebWrapWeb_connectToEditPart.VISUAL_ID:
				return new WebWrapWeb_connectToEditPart(view);

			case SoftwareSoftware_hostOnEditPart.VISUAL_ID:
				return new SoftwareSoftware_hostOnEditPart(view);

			case WebWrapWeb_dependOnEditPart.VISUAL_ID:
				return new WebWrapWeb_dependOnEditPart(view);

			case PHPWrapPhp_dependOnEditPart.VISUAL_ID:
				return new PHPWrapPhp_dependOnEditPart(view);

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
