package osmodel.diagram.part;

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

import osmodel.ApacheWrap;
import osmodel.ClusterWrap;
import osmodel.MySQLWrap;
import osmodel.OsmodelPackage;
import osmodel.PHPWrap;
import osmodel.ServerWrap;
import osmodel.Software;
import osmodel.WebWrap;
import osmodel.diagram.edit.parts.ApacheWrapEditPart;
import osmodel.diagram.edit.parts.ClusterWrapEditPart;
import osmodel.diagram.edit.parts.MySQLWrapEditPart;
import osmodel.diagram.edit.parts.PHPWrapEditPart;
import osmodel.diagram.edit.parts.PHPWrapPhp_dependOnEditPart;
import osmodel.diagram.edit.parts.ServerWrapEditPart;
import osmodel.diagram.edit.parts.SoftwareSoftware_hostOnEditPart;
import osmodel.diagram.edit.parts.WebWrapEditPart;
import osmodel.diagram.edit.parts.WebWrapWeb_connectToEditPart;
import osmodel.diagram.edit.parts.WebWrapWeb_dependOnEditPart;
import osmodel.diagram.providers.OSModelElementTypes;

/**
 * @generated
 */
public class OSModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<OSModelNodeDescriptor> getSemanticChildren(View view) {
		switch (OSModelVisualIDRegistry.getVisualID(view)) {
		case ClusterWrapEditPart.VISUAL_ID:
			return getClusterWrap_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OSModelNodeDescriptor> getClusterWrap_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ClusterWrap modelElement = (ClusterWrap) view.getElement();
		LinkedList<OSModelNodeDescriptor> result = new LinkedList<OSModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSoftwares().iterator(); it
				.hasNext();) {
			Software childElement = (Software) it.next();
			int visualID = OSModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MySQLWrapEditPart.VISUAL_ID) {
				result.add(new OSModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WebWrapEditPart.VISUAL_ID) {
				result.add(new OSModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PHPWrapEditPart.VISUAL_ID) {
				result.add(new OSModelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ApacheWrapEditPart.VISUAL_ID) {
				result.add(new OSModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getServers().iterator(); it
				.hasNext();) {
			ServerWrap childElement = (ServerWrap) it.next();
			int visualID = OSModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ServerWrapEditPart.VISUAL_ID) {
				result.add(new OSModelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getContainedLinks(View view) {
		switch (OSModelVisualIDRegistry.getVisualID(view)) {
		case ClusterWrapEditPart.VISUAL_ID:
			return getClusterWrap_1000ContainedLinks(view);
		case MySQLWrapEditPart.VISUAL_ID:
			return getMySQLWrap_2005ContainedLinks(view);
		case WebWrapEditPart.VISUAL_ID:
			return getWebWrap_2001ContainedLinks(view);
		case ServerWrapEditPart.VISUAL_ID:
			return getServerWrap_2002ContainedLinks(view);
		case PHPWrapEditPart.VISUAL_ID:
			return getPHPWrap_2003ContainedLinks(view);
		case ApacheWrapEditPart.VISUAL_ID:
			return getApacheWrap_2004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getIncomingLinks(View view) {
		switch (OSModelVisualIDRegistry.getVisualID(view)) {
		case MySQLWrapEditPart.VISUAL_ID:
			return getMySQLWrap_2005IncomingLinks(view);
		case WebWrapEditPart.VISUAL_ID:
			return getWebWrap_2001IncomingLinks(view);
		case ServerWrapEditPart.VISUAL_ID:
			return getServerWrap_2002IncomingLinks(view);
		case PHPWrapEditPart.VISUAL_ID:
			return getPHPWrap_2003IncomingLinks(view);
		case ApacheWrapEditPart.VISUAL_ID:
			return getApacheWrap_2004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (OSModelVisualIDRegistry.getVisualID(view)) {
		case MySQLWrapEditPart.VISUAL_ID:
			return getMySQLWrap_2005OutgoingLinks(view);
		case WebWrapEditPart.VISUAL_ID:
			return getWebWrap_2001OutgoingLinks(view);
		case ServerWrapEditPart.VISUAL_ID:
			return getServerWrap_2002OutgoingLinks(view);
		case PHPWrapEditPart.VISUAL_ID:
			return getPHPWrap_2003OutgoingLinks(view);
		case ApacheWrapEditPart.VISUAL_ID:
			return getApacheWrap_2004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getClusterWrap_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getMySQLWrap_2005ContainedLinks(
			View view) {
		MySQLWrap modelElement = (MySQLWrap) view.getElement();
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Software_Software_hostOn_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getWebWrap_2001ContainedLinks(
			View view) {
		WebWrap modelElement = (WebWrap) view.getElement();
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_WebWrap_Web_connectTo_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Software_Software_hostOn_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_WebWrap_Web_dependOn_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getServerWrap_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getPHPWrap_2003ContainedLinks(
			View view) {
		PHPWrap modelElement = (PHPWrap) view.getElement();
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Software_Software_hostOn_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PHPWrap_Php_dependOn_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getApacheWrap_2004ContainedLinks(
			View view) {
		ApacheWrap modelElement = (ApacheWrap) view.getElement();
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Software_Software_hostOn_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getMySQLWrap_2005IncomingLinks(
			View view) {
		MySQLWrap modelElement = (MySQLWrap) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_WebWrap_Web_connectTo_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getWebWrap_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getServerWrap_2002IncomingLinks(
			View view) {
		ServerWrap modelElement = (ServerWrap) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Software_Software_hostOn_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getPHPWrap_2003IncomingLinks(
			View view) {
		PHPWrap modelElement = (PHPWrap) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_WebWrap_Web_dependOn_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getApacheWrap_2004IncomingLinks(
			View view) {
		ApacheWrap modelElement = (ApacheWrap) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PHPWrap_Php_dependOn_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getMySQLWrap_2005OutgoingLinks(
			View view) {
		MySQLWrap modelElement = (MySQLWrap) view.getElement();
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Software_Software_hostOn_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getWebWrap_2001OutgoingLinks(
			View view) {
		WebWrap modelElement = (WebWrap) view.getElement();
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_WebWrap_Web_connectTo_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Software_Software_hostOn_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_WebWrap_Web_dependOn_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getServerWrap_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getPHPWrap_2003OutgoingLinks(
			View view) {
		PHPWrap modelElement = (PHPWrap) view.getElement();
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Software_Software_hostOn_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PHPWrap_Php_dependOn_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<OSModelLinkDescriptor> getApacheWrap_2004OutgoingLinks(
			View view) {
		ApacheWrap modelElement = (ApacheWrap) view.getElement();
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Software_Software_hostOn_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OSModelLinkDescriptor> getIncomingFeatureModelFacetLinks_WebWrap_Web_connectTo_4004(
			MySQLWrap target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == OsmodelPackage.eINSTANCE
					.getWebWrap_Web_connectTo()) {
				result.add(new OSModelLinkDescriptor(setting.getEObject(),
						target, OSModelElementTypes.WebWrapWeb_connectTo_4004,
						WebWrapWeb_connectToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OSModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Software_Software_hostOn_4006(
			ServerWrap target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == OsmodelPackage.eINSTANCE
					.getSoftware_Software_hostOn()) {
				result.add(new OSModelLinkDescriptor(setting.getEObject(),
						target,
						OSModelElementTypes.SoftwareSoftware_hostOn_4006,
						SoftwareSoftware_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OSModelLinkDescriptor> getIncomingFeatureModelFacetLinks_WebWrap_Web_dependOn_4007(
			PHPWrap target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == OsmodelPackage.eINSTANCE
					.getWebWrap_Web_dependOn()) {
				result.add(new OSModelLinkDescriptor(setting.getEObject(),
						target, OSModelElementTypes.WebWrapWeb_dependOn_4007,
						WebWrapWeb_dependOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OSModelLinkDescriptor> getIncomingFeatureModelFacetLinks_PHPWrap_Php_dependOn_4009(
			ApacheWrap target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == OsmodelPackage.eINSTANCE
					.getPHPWrap_Php_dependOn()) {
				result.add(new OSModelLinkDescriptor(setting.getEObject(),
						target, OSModelElementTypes.PHPWrapPhp_dependOn_4009,
						PHPWrapPhp_dependOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OSModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_WebWrap_Web_connectTo_4004(
			WebWrap source) {
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		MySQLWrap destination = source.getWeb_connectTo();
		if (destination == null) {
			return result;
		}
		result.add(new OSModelLinkDescriptor(source, destination,
				OSModelElementTypes.WebWrapWeb_connectTo_4004,
				WebWrapWeb_connectToEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OSModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Software_Software_hostOn_4006(
			Software source) {
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		ServerWrap destination = source.getSoftware_hostOn();
		if (destination == null) {
			return result;
		}
		result.add(new OSModelLinkDescriptor(source, destination,
				OSModelElementTypes.SoftwareSoftware_hostOn_4006,
				SoftwareSoftware_hostOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OSModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_WebWrap_Web_dependOn_4007(
			WebWrap source) {
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		PHPWrap destination = source.getWeb_dependOn();
		if (destination == null) {
			return result;
		}
		result.add(new OSModelLinkDescriptor(source, destination,
				OSModelElementTypes.WebWrapWeb_dependOn_4007,
				WebWrapWeb_dependOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<OSModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_PHPWrap_Php_dependOn_4009(
			PHPWrap source) {
		LinkedList<OSModelLinkDescriptor> result = new LinkedList<OSModelLinkDescriptor>();
		ApacheWrap destination = source.getPhp_dependOn();
		if (destination == null) {
			return result;
		}
		result.add(new OSModelLinkDescriptor(source, destination,
				OSModelElementTypes.PHPWrapPhp_dependOn_4009,
				PHPWrapPhp_dependOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */

		public List<OSModelNodeDescriptor> getSemanticChildren(View view) {
			return OSModelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */

		public List<OSModelLinkDescriptor> getContainedLinks(View view) {
			return OSModelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */

		public List<OSModelLinkDescriptor> getIncomingLinks(View view) {
			return OSModelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */

		public List<OSModelLinkDescriptor> getOutgoingLinks(View view) {
			return OSModelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
