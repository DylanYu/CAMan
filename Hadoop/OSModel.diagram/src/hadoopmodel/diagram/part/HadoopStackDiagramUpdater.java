package hadoopmodel.diagram.part;

import hadoopmodel.Cloud;
import hadoopmodel.HDFSDataNode;
import hadoopmodel.HDFSNameNode;
import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.Java;
import hadoopmodel.JobTracker;
import hadoopmodel.Server;
import hadoopmodel.TaskTracker;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_connectToEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeHdfsnamenode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.JavaEditPart;
import hadoopmodel.diagram.edit.parts.JavaJava_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerJobtracker_dependOnEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerJobtracker_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.ServerEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerTasktracker_connectToEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerTasktracker_hostOnEditPart;
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
		for (Iterator<?> it = modelElement.getServer().iterator(); it.hasNext();) {
			Server childElement = (Server) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ServerEditPart.VISUAL_ID) {
				result.add(new HadoopStackNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHdfsnamenode().iterator(); it
				.hasNext();) {
			HDFSNameNode childElement = (HDFSNameNode) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HDFSNameNodeEditPart.VISUAL_ID) {
				result.add(new HadoopStackNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHdfsdatanode().iterator(); it
				.hasNext();) {
			HDFSDataNode childElement = (HDFSDataNode) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HDFSDataNodeEditPart.VISUAL_ID) {
				result.add(new HadoopStackNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTasktracker().iterator(); it
				.hasNext();) {
			TaskTracker childElement = (TaskTracker) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TaskTrackerEditPart.VISUAL_ID) {
				result.add(new HadoopStackNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getJobtracker().iterator(); it
				.hasNext();) {
			JobTracker childElement = (JobTracker) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JobTrackerEditPart.VISUAL_ID) {
				result.add(new HadoopStackNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getJava().iterator(); it.hasNext();) {
			Java childElement = (Java) it.next();
			int visualID = HadoopStackVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JavaEditPart.VISUAL_ID) {
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
		case ServerEditPart.VISUAL_ID:
			return getServer_2001ContainedLinks(view);
		case HDFSNameNodeEditPart.VISUAL_ID:
			return getHDFSNameNode_2005ContainedLinks(view);
		case HDFSDataNodeEditPart.VISUAL_ID:
			return getHDFSDataNode_2004ContainedLinks(view);
		case TaskTrackerEditPart.VISUAL_ID:
			return getTaskTracker_2006ContainedLinks(view);
		case JobTrackerEditPart.VISUAL_ID:
			return getJobTracker_2002ContainedLinks(view);
		case JavaEditPart.VISUAL_ID:
			return getJava_2003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getIncomingLinks(View view) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case ServerEditPart.VISUAL_ID:
			return getServer_2001IncomingLinks(view);
		case HDFSNameNodeEditPart.VISUAL_ID:
			return getHDFSNameNode_2005IncomingLinks(view);
		case HDFSDataNodeEditPart.VISUAL_ID:
			return getHDFSDataNode_2004IncomingLinks(view);
		case TaskTrackerEditPart.VISUAL_ID:
			return getTaskTracker_2006IncomingLinks(view);
		case JobTrackerEditPart.VISUAL_ID:
			return getJobTracker_2002IncomingLinks(view);
		case JavaEditPart.VISUAL_ID:
			return getJava_2003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getOutgoingLinks(View view) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case ServerEditPart.VISUAL_ID:
			return getServer_2001OutgoingLinks(view);
		case HDFSNameNodeEditPart.VISUAL_ID:
			return getHDFSNameNode_2005OutgoingLinks(view);
		case HDFSDataNodeEditPart.VISUAL_ID:
			return getHDFSDataNode_2004OutgoingLinks(view);
		case TaskTrackerEditPart.VISUAL_ID:
			return getTaskTracker_2006OutgoingLinks(view);
		case JobTrackerEditPart.VISUAL_ID:
			return getJobTracker_2002OutgoingLinks(view);
		case JavaEditPart.VISUAL_ID:
			return getJava_2003OutgoingLinks(view);
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
	public static List<HadoopStackLinkDescriptor> getServer_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHDFSNameNode_2005ContainedLinks(
			View view) {
		HDFSNameNode modelElement = (HDFSNameNode) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HDFSNameNode_Hdfsnamenode_hostOn_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHDFSDataNode_2004ContainedLinks(
			View view) {
		HDFSDataNode modelElement = (HDFSDataNode) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_hostOn_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_connectTo_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getTaskTracker_2006ContainedLinks(
			View view) {
		TaskTracker modelElement = (TaskTracker) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TaskTracker_Tasktracker_connectTo_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TaskTracker_Tasktracker_hostOn_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getJobTracker_2002ContainedLinks(
			View view) {
		JobTracker modelElement = (JobTracker) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_JobTracker_Jobtracker_hostOn_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_JobTracker_Jobtracker_dependOn_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getJava_2003ContainedLinks(
			View view) {
		Java modelElement = (Java) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Java_Java_hostOn_4008(modelElement));
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
		result.addAll(getIncomingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_hostOn_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_JobTracker_Jobtracker_hostOn_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_HDFSNameNode_Hdfsnamenode_hostOn_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_TaskTracker_Tasktracker_hostOn_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Java_Java_hostOn_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHDFSNameNode_2005IncomingLinks(
			View view) {
		HDFSNameNode modelElement = (HDFSNameNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_connectTo_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_JobTracker_Jobtracker_dependOn_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHDFSDataNode_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getTaskTracker_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getJobTracker_2002IncomingLinks(
			View view) {
		JobTracker modelElement = (JobTracker) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_TaskTracker_Tasktracker_connectTo_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getJava_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
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
	public static List<HadoopStackLinkDescriptor> getHDFSNameNode_2005OutgoingLinks(
			View view) {
		HDFSNameNode modelElement = (HDFSNameNode) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HDFSNameNode_Hdfsnamenode_hostOn_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getHDFSDataNode_2004OutgoingLinks(
			View view) {
		HDFSDataNode modelElement = (HDFSDataNode) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_hostOn_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_connectTo_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getTaskTracker_2006OutgoingLinks(
			View view) {
		TaskTracker modelElement = (TaskTracker) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TaskTracker_Tasktracker_connectTo_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_TaskTracker_Tasktracker_hostOn_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getJobTracker_2002OutgoingLinks(
			View view) {
		JobTracker modelElement = (JobTracker) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_JobTracker_Jobtracker_hostOn_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_JobTracker_Jobtracker_dependOn_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HadoopStackLinkDescriptor> getJava_2003OutgoingLinks(
			View view) {
		Java modelElement = (Java) view.getElement();
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Java_Java_hostOn_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_hostOn_4006(
			Server target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getHDFSDataNode_Hdfsdatanode_hostOn()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006,
						HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_JobTracker_Jobtracker_hostOn_4003(
			Server target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getJobTracker_Jobtracker_hostOn()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003,
						JobTrackerJobtracker_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_HDFSNameNode_Hdfsnamenode_hostOn_4001(
			Server target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getHDFSNameNode_Hdfsnamenode_hostOn()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001,
						HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_TaskTracker_Tasktracker_connectTo_4004(
			JobTracker target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getTaskTracker_Tasktracker_connectTo()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004,
						TaskTrackerTasktracker_connectToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_connectTo_4005(
			HDFSNameNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getHDFSDataNode_Hdfsdatanode_connectTo()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005,
						HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_TaskTracker_Tasktracker_hostOn_4007(
			Server target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getTaskTracker_Tasktracker_hostOn()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007,
						TaskTrackerTasktracker_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_JobTracker_Jobtracker_dependOn_4002(
			HDFSNameNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getJobTracker_Jobtracker_dependOn()) {
				result.add(new HadoopStackLinkDescriptor(
						setting.getEObject(),
						target,
						HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002,
						JobTrackerJobtracker_dependOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getIncomingFeatureModelFacetLinks_Java_Java_hostOn_4008(
			Server target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == HadoopmodelPackage.eINSTANCE
					.getJava_Java_hostOn()) {
				result.add(new HadoopStackLinkDescriptor(setting.getEObject(),
						target, HadoopStackElementTypes.JavaJava_hostOn_4008,
						JavaJava_hostOnEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_hostOn_4006(
			HDFSDataNode source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Server destination = source.getHdfsdatanode_hostOn();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006,
				HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_JobTracker_Jobtracker_hostOn_4003(
			JobTracker source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Server destination = source.getJobtracker_hostOn();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003,
				JobTrackerJobtracker_hostOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_HDFSNameNode_Hdfsnamenode_hostOn_4001(
			HDFSNameNode source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Server destination = source.getHdfsnamenode_hostOn();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001,
				HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_TaskTracker_Tasktracker_connectTo_4004(
			TaskTracker source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		JobTracker destination = source.getTasktracker_connectTo();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004,
				TaskTrackerTasktracker_connectToEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_HDFSDataNode_Hdfsdatanode_connectTo_4005(
			HDFSDataNode source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		HDFSNameNode destination = source.getHdfsdatanode_connectTo();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(
				source,
				destination,
				HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005,
				HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_TaskTracker_Tasktracker_hostOn_4007(
			TaskTracker source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Server destination = source.getTasktracker_hostOn();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007,
				TaskTrackerTasktracker_hostOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_JobTracker_Jobtracker_dependOn_4002(
			JobTracker source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		HDFSNameNode destination = source.getJobtracker_dependOn();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002,
				JobTrackerJobtracker_dependOnEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HadoopStackLinkDescriptor> getOutgoingFeatureModelFacetLinks_Java_Java_hostOn_4008(
			Java source) {
		LinkedList<HadoopStackLinkDescriptor> result = new LinkedList<HadoopStackLinkDescriptor>();
		Server destination = source.getJava_hostOn();
		if (destination == null) {
			return result;
		}
		result.add(new HadoopStackLinkDescriptor(source, destination,
				HadoopStackElementTypes.JavaJava_hostOn_4008,
				JavaJava_hostOnEditPart.VISUAL_ID));
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
