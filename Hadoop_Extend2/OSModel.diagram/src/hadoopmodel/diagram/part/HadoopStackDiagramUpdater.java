package hadoopmodel.diagram.part;

import hadoopmodel.Cloud;
import hadoopmodel.HadoopCluster;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.Server;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterHadoopcluster_master_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterHadoopcluster_slave_hostOnEditPart;
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
		for (Iterator<?> it = modelElement.getHadoopcluster().iterator(); it
				.hasNext();) {
			HadoopCluster childElement = (HadoopCluster) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HadoopClusterEditPart.VISUAL_ID) {
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getContainedLinks(View view) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case CloudEditPart.VISUAL_ID:
			return getCloud_1000ContainedLinks(view);
		case HadoopClusterEditPart.VISUAL_ID:
			return getHadoopCluster_2009ContainedLinks(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getIncomingLinks(View view) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case HadoopClusterEditPart.VISUAL_ID:
			return getHadoopCluster_2009IncomingLinks(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getOutgoingLinks(View view) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case HadoopClusterEditPart.VISUAL_ID:
			return getHadoopCluster_2009OutgoingLinks(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_2001OutgoingLinks(view);
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
	public static List<HadoopStackLinkDescriptor> getHadoopCluster_2009ContainedLinks(
			View view) {
		HadoopCluster modelElement = (HadoopCluster) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_master_hostOn_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_slave_hostOn_4013(modelElement));
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
	public static List<HadoopStackLinkDescriptor> getHadoopCluster_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
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
		result.addAll(getIncomingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_master_hostOn_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_slave_hostOn_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHadoopCluster_2009OutgoingLinks(
			View view) {
		HadoopCluster modelElement = (HadoopCluster) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_master_hostOn_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_slave_hostOn_4013(modelElement));
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
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_master_hostOn_4012(
			Server target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getHadoopCluster_Hadoopcluster_master_hostOn()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.HadoopClusterHadoopcluster_master_hostOn_4012,
						HadoopClusterHadoopcluster_master_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_slave_hostOn_4013(
			Server target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getHadoopCluster_Hadoopcluster_slave_hostOn()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.HadoopClusterHadoopcluster_slave_hostOn_4013,
						HadoopClusterHadoopcluster_slave_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_master_hostOn_4012(
			HadoopCluster source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Server destination = source.getHadoopcluster_master_hostOn();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(
				source,
				destination,
				HadoopStackElementTypes.HadoopClusterHadoopcluster_master_hostOn_4012,
				HadoopClusterHadoopcluster_master_hostOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_HadoopCluster_Hadoopcluster_slave_hostOn_4013(
			HadoopCluster source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		for (Iterator<?> destinations = source.getHadoopcluster_slave_hostOn()
				.iterator(); destinations.hasNext();) {
			Server destination = (Server) destinations.next();
			result.add(new HadoopStackLinkDescriptor(
					source,
					destination,
					HadoopStackElementTypes.HadoopClusterHadoopcluster_slave_hostOn_4013,
					HadoopClusterHadoopcluster_slave_hostOnEditPart.VISUAL_ID));
		}
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
