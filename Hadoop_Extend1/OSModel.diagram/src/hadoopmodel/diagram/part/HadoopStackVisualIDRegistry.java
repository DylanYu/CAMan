package hadoopmodel.diagram.part;

import hadoopmodel.Cloud;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HadoopMasterEditPart;
import hadoopmodel.diagram.edit.parts.HadoopMasterJava_jdk_versionEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveJava_jdk_versionEditPart;
import hadoopmodel.diagram.edit.parts.ServerEditPart;
import hadoopmodel.diagram.edit.parts.ServerServer_nameEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class HadoopStackVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "OSModel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CloudEditPart.MODEL_ID.equals(view.getType())) {
				return CloudEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
				.getVisualID(view.getType());
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
				HadoopStackDiagramEditorPlugin.getInstance().logError(
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
		if (HadoopmodelPackage.eINSTANCE.getCloud().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Cloud) domainElement)) {
			return CloudEditPart.VISUAL_ID;
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
		String containerModelID = hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
				.getModelID(containerView);
		if (!CloudEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CloudEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CloudEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CloudEditPart.VISUAL_ID:
			if (HadoopmodelPackage.eINSTANCE.getHadoopMaster().isSuperTypeOf(
					domainElement.eClass())) {
				return HadoopMasterEditPart.VISUAL_ID;
			}
			if (HadoopmodelPackage.eINSTANCE.getServer().isSuperTypeOf(
					domainElement.eClass())) {
				return ServerEditPart.VISUAL_ID;
			}
			if (HadoopmodelPackage.eINSTANCE.getHadoopSlave().isSuperTypeOf(
					domainElement.eClass())) {
				return HadoopSlaveEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
				.getModelID(containerView);
		if (!CloudEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (CloudEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CloudEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CloudEditPart.VISUAL_ID:
			if (HadoopMasterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HadoopSlaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HadoopMasterEditPart.VISUAL_ID:
			if (HadoopMasterJava_jdk_versionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServerEditPart.VISUAL_ID:
			if (ServerServer_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HadoopSlaveEditPart.VISUAL_ID:
			if (HadoopSlaveJava_jdk_versionEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(Cloud element) {
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
		case CloudEditPart.VISUAL_ID:
			return false;
		case ServerEditPart.VISUAL_ID:
		case HadoopMasterEditPart.VISUAL_ID:
		case HadoopSlaveEditPart.VISUAL_ID:
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
		@Override
		public int getVisualID(View view) {
			return hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return hadoopmodel.diagram.part.HadoopStackVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
