package osmodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import osmodel.ClusterWrap;
import osmodel.OsmodelPackage;
import osmodel.diagram.edit.parts.ApacheWrapEditPart;
import osmodel.diagram.edit.parts.ApacheWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.ClusterWrapEditPart;
import osmodel.diagram.edit.parts.MySQLWrapEditPart;
import osmodel.diagram.edit.parts.MySQLWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.PHPWrapEditPart;
import osmodel.diagram.edit.parts.PHPWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.ServerWrapEditPart;
import osmodel.diagram.edit.parts.ServerWrapServer_nameEditPart;
import osmodel.diagram.edit.parts.WebWrapEditPart;
import osmodel.diagram.edit.parts.WebWrapSoftware_nameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class OSModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "OSModel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ClusterWrapEditPart.MODEL_ID.equals(view.getType())) {
				return ClusterWrapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return osmodel.diagram.part.OSModelVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				OSModelDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (OsmodelPackage.eINSTANCE.getClusterWrap().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ClusterWrap) domainElement)) {
			return ClusterWrapEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = osmodel.diagram.part.OSModelVisualIDRegistry
				.getModelID(containerView);
		if (!ClusterWrapEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ClusterWrapEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = osmodel.diagram.part.OSModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ClusterWrapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ClusterWrapEditPart.VISUAL_ID:
			if (OsmodelPackage.eINSTANCE.getMySQLWrap().isSuperTypeOf(
					domainElement.eClass())) {
				return MySQLWrapEditPart.VISUAL_ID;
			}
			if (OsmodelPackage.eINSTANCE.getWebWrap().isSuperTypeOf(
					domainElement.eClass())) {
				return WebWrapEditPart.VISUAL_ID;
			}
			if (OsmodelPackage.eINSTANCE.getServerWrap().isSuperTypeOf(
					domainElement.eClass())) {
				return ServerWrapEditPart.VISUAL_ID;
			}
			if (OsmodelPackage.eINSTANCE.getPHPWrap().isSuperTypeOf(
					domainElement.eClass())) {
				return PHPWrapEditPart.VISUAL_ID;
			}
			if (OsmodelPackage.eINSTANCE.getApacheWrap().isSuperTypeOf(
					domainElement.eClass())) {
				return ApacheWrapEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = osmodel.diagram.part.OSModelVisualIDRegistry
				.getModelID(containerView);
		if (!ClusterWrapEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ClusterWrapEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = osmodel.diagram.part.OSModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ClusterWrapEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ClusterWrapEditPart.VISUAL_ID:
			if (MySQLWrapEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WebWrapEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServerWrapEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PHPWrapEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApacheWrapEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MySQLWrapEditPart.VISUAL_ID:
			if (MySQLWrapSoftware_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WebWrapEditPart.VISUAL_ID:
			if (WebWrapSoftware_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServerWrapEditPart.VISUAL_ID:
			if (ServerWrapServer_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PHPWrapEditPart.VISUAL_ID:
			if (PHPWrapSoftware_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApacheWrapEditPart.VISUAL_ID:
			if (ApacheWrapSoftware_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ClusterWrap element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ClusterWrapEditPart.VISUAL_ID:
			return false;
		case WebWrapEditPart.VISUAL_ID:
		case ServerWrapEditPart.VISUAL_ID:
		case PHPWrapEditPart.VISUAL_ID:
		case ApacheWrapEditPart.VISUAL_ID:
		case MySQLWrapEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */

		public int getVisualID(View view) {
			return osmodel.diagram.part.OSModelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return osmodel.diagram.part.OSModelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return osmodel.diagram.part.OSModelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return osmodel.diagram.part.OSModelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return osmodel.diagram.part.OSModelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return osmodel.diagram.part.OSModelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
