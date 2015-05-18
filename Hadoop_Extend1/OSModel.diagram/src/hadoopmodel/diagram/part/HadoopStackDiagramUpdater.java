package hadoopmodel.diagram.part;

import hadoopmodel.Cloud;
import hadoopmodel.HadoopMaster;
import hadoopmodel.HadoopSlave;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.Server;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HadoopMasterEditPart;
import hadoopmodel.diagram.edit.parts.HadoopMasterHadoopmaster_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveHadoopslave_connectToEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveHadoopslave_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.ServerEditPart;
import hadoopmodel.diagram.providers.HadoopStackElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class HadoopStackDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<HadoopStackNodeDescriptor> getSemanticChildren(View view) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case CloudEditPart.VISUAL_ID:
			return getCloud_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackNodeDescriptor> getCloud_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Cloud modelElement = (Cloud) view.getElement();
		LinkedList<HadoopStackNodeDescriptor> result = new LinkedList<HadoopStackNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHadoopmaster().iterator(); it
				.hasNext();) {
			HadoopMaster childElement = (HadoopMaster) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HadoopMasterEditPart.VISUAL_ID) {
				result.add(new HadoopStackNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getServer().iterator(); it.hasNext();) {
			Server childElement = (Server) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ServerEditPart.VISUAL_ID) {
				result.add(new HadoopStackNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHadoopslave().iterator(); it
				.hasNext();) {
			HadoopSlave childElement = (HadoopSlave) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HadoopSlaveEditPart.VISUAL_ID) {
				result.add(new HadoopStackNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getContainedLinks(View view) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case CloudEditPart.VISUAL_ID:
			return getCloud_1000ContainedLinks(view);
		case HadoopMasterEditPart.VISUAL_ID:
			return getHadoopMaster_2007ContainedLinks(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_2001ContainedLinks(view);
		case HadoopSlaveEditPart.VISUAL_ID:
			return getHadoopSlave_2008ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getIncomingLinks(View view) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case HadoopMasterEditPart.VISUAL_ID:
			return getHadoopMaster_2007IncomingLinks(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_2001IncomingLinks(view);
		case HadoopSlaveEditPart.VISUAL_ID:
			return getHadoopSlave_2008IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getOutgoingLinks(View view) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case HadoopMasterEditPart.VISUAL_ID:
			return getHadoopMaster_2007OutgoingLinks(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_2001OutgoingLinks(view);
		case HadoopSlaveEditPart.VISUAL_ID:
			return getHadoopSlave_2008OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getCloud_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHadoopMaster_2007ContainedLinks(
			View view) {
		HadoopMaster modelElement = (HadoopMaster) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopMaster_Hadoopmaster_hostOn_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getServer_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHadoopSlave_2008ContainedLinks(
			View view) {
		HadoopSlave modelElement = (HadoopSlave) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_connectTo_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_hostOn_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHadoopMaster_2007IncomingLinks(
			View view) {
		HadoopMaster modelElement = (HadoopMaster) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_connectTo_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getServer_2001IncomingLinks(
			View view) {
		Server modelElement = (Server) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HadoopMaster_Hadoopmaster_hostOn_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_hostOn_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHadoopSlave_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHadoopMaster_2007OutgoingLinks(
			View view) {
		HadoopMaster modelElement = (HadoopMaster) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopMaster_Hadoopmaster_hostOn_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getServer_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHadoopSlave_2008OutgoingLinks(
			View view) {
		HadoopSlave modelElement = (HadoopSlave) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_connectTo_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_hostOn_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_connectTo_4009(
			HadoopMaster target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getHadoopSlave_Hadoopslave_connectTo()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.HadoopSlaveHadoopslave_connectTo_4009,
						HadoopSlaveHadoopslave_connectToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_HadoopMaster_Hadoopmaster_hostOn_4010(
			Server target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getHadoopMaster_Hadoopmaster_hostOn()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.HadoopMasterHadoopmaster_hostOn_4010,
						HadoopMasterHadoopmaster_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_hostOn_4011(
			Server target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getHadoopSlave_Hadoopslave_hostOn()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.HadoopSlaveHadoopslave_hostOn_4011,
						HadoopSlaveHadoopslave_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_connectTo_4009(
			HadoopSlave source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		HadoopMaster destination = source.getHadoopslave_connectTo();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.HadoopSlaveHadoopslave_connectTo_4009,
				HadoopSlaveHadoopslave_connectToEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_HadoopMaster_Hadoopmaster_hostOn_4010(
			HadoopMaster source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Server destination = source.getHadoopmaster_hostOn();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.HadoopMasterHadoopmaster_hostOn_4010,
				HadoopMasterHadoopmaster_hostOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_HadoopSlave_Hadoopslave_hostOn_4011(
			HadoopSlave source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Server destination = source.getHadoopslave_hostOn();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.HadoopSlaveHadoopslave_hostOn_4011,
				HadoopSlaveHadoopslave_hostOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<HadoopStackNodeDescriptor> getSemanticChildren(View view) {
			return HadoopStackDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<HadoopStackLinkDescriptor> getContainedLinks(View view) {
			return HadoopStackDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<HadoopStackLinkDescriptor> getIncomingLinks(View view) {
			return HadoopStackDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<HadoopStackLinkDescriptor> getOutgoingLinks(View view) {
			return HadoopStackDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
