package hadoopmodel.diagram.providers;

import hadoopmodel.HadoopmodelPackage;
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
import hadoopmodel.diagram.part.HadoopStackDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class HadoopStackElementTypes {

	/**
	 * @generated
	 */
	private HadoopStackElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			HadoopStackDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Cloud_1000 = getElementType("OSModel.diagram.Cloud_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Server_2001 = getElementType("OSModel.diagram.Server_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDFSNameNode_2005 = getElementType("OSModel.diagram.HDFSNameNode_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDFSDataNode_2004 = getElementType("OSModel.diagram.HDFSDataNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskTracker_2006 = getElementType("OSModel.diagram.TaskTracker_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JobTracker_2002 = getElementType("OSModel.diagram.JobTracker_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Java_2003 = getElementType("OSModel.diagram.Java_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDFSDataNodeHdfsdatanode_hostOn_4006 = getElementType("OSModel.diagram.HDFSDataNodeHdfsdatanode_hostOn_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JobTrackerJobtracker_hostOn_4003 = getElementType("OSModel.diagram.JobTrackerJobtracker_hostOn_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDFSNameNodeHdfsnamenode_hostOn_4001 = getElementType("OSModel.diagram.HDFSNameNodeHdfsnamenode_hostOn_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskTrackerTasktracker_connectTo_4004 = getElementType("OSModel.diagram.TaskTrackerTasktracker_connectTo_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDFSDataNodeHdfsdatanode_connectTo_4005 = getElementType("OSModel.diagram.HDFSDataNodeHdfsdatanode_connectTo_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskTrackerTasktracker_hostOn_4007 = getElementType("OSModel.diagram.TaskTrackerTasktracker_hostOn_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JobTrackerJobtracker_dependOn_4002 = getElementType("OSModel.diagram.JobTrackerJobtracker_dependOn_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JavaJava_hostOn_4008 = getElementType("OSModel.diagram.JavaJava_hostOn_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Cloud_1000, HadoopmodelPackage.eINSTANCE.getCloud());

			elements.put(Server_2001, HadoopmodelPackage.eINSTANCE.getServer());

			elements.put(HDFSNameNode_2005,
					HadoopmodelPackage.eINSTANCE.getHDFSNameNode());

			elements.put(HDFSDataNode_2004,
					HadoopmodelPackage.eINSTANCE.getHDFSDataNode());

			elements.put(TaskTracker_2006,
					HadoopmodelPackage.eINSTANCE.getTaskTracker());

			elements.put(JobTracker_2002,
					HadoopmodelPackage.eINSTANCE.getJobTracker());

			elements.put(Java_2003, HadoopmodelPackage.eINSTANCE.getJava());

			elements.put(HDFSDataNodeHdfsdatanode_hostOn_4006,
					HadoopmodelPackage.eINSTANCE
							.getHDFSDataNode_Hdfsdatanode_hostOn());

			elements.put(JobTrackerJobtracker_hostOn_4003,
					HadoopmodelPackage.eINSTANCE
							.getJobTracker_Jobtracker_hostOn());

			elements.put(HDFSNameNodeHdfsnamenode_hostOn_4001,
					HadoopmodelPackage.eINSTANCE
							.getHDFSNameNode_Hdfsnamenode_hostOn());

			elements.put(TaskTrackerTasktracker_connectTo_4004,
					HadoopmodelPackage.eINSTANCE
							.getTaskTracker_Tasktracker_connectTo());

			elements.put(HDFSDataNodeHdfsdatanode_connectTo_4005,
					HadoopmodelPackage.eINSTANCE
							.getHDFSDataNode_Hdfsdatanode_connectTo());

			elements.put(TaskTrackerTasktracker_hostOn_4007,
					HadoopmodelPackage.eINSTANCE
							.getTaskTracker_Tasktracker_hostOn());

			elements.put(JobTrackerJobtracker_dependOn_4002,
					HadoopmodelPackage.eINSTANCE
							.getJobTracker_Jobtracker_dependOn());

			elements.put(JavaJava_hostOn_4008,
					HadoopmodelPackage.eINSTANCE.getJava_Java_hostOn());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Cloud_1000);
			KNOWN_ELEMENT_TYPES.add(Server_2001);
			KNOWN_ELEMENT_TYPES.add(HDFSNameNode_2005);
			KNOWN_ELEMENT_TYPES.add(HDFSDataNode_2004);
			KNOWN_ELEMENT_TYPES.add(TaskTracker_2006);
			KNOWN_ELEMENT_TYPES.add(JobTracker_2002);
			KNOWN_ELEMENT_TYPES.add(Java_2003);
			KNOWN_ELEMENT_TYPES.add(HDFSDataNodeHdfsdatanode_hostOn_4006);
			KNOWN_ELEMENT_TYPES.add(JobTrackerJobtracker_hostOn_4003);
			KNOWN_ELEMENT_TYPES.add(HDFSNameNodeHdfsnamenode_hostOn_4001);
			KNOWN_ELEMENT_TYPES.add(TaskTrackerTasktracker_connectTo_4004);
			KNOWN_ELEMENT_TYPES.add(HDFSDataNodeHdfsdatanode_connectTo_4005);
			KNOWN_ELEMENT_TYPES.add(TaskTrackerTasktracker_hostOn_4007);
			KNOWN_ELEMENT_TYPES.add(JobTrackerJobtracker_dependOn_4002);
			KNOWN_ELEMENT_TYPES.add(JavaJava_hostOn_4008);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CloudEditPart.VISUAL_ID:
			return Cloud_1000;
		case ServerEditPart.VISUAL_ID:
			return Server_2001;
		case HDFSNameNodeEditPart.VISUAL_ID:
			return HDFSNameNode_2005;
		case HDFSDataNodeEditPart.VISUAL_ID:
			return HDFSDataNode_2004;
		case TaskTrackerEditPart.VISUAL_ID:
			return TaskTracker_2006;
		case JobTrackerEditPart.VISUAL_ID:
			return JobTracker_2002;
		case JavaEditPart.VISUAL_ID:
			return Java_2003;
		case HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID:
			return HDFSDataNodeHdfsdatanode_hostOn_4006;
		case JobTrackerJobtracker_hostOnEditPart.VISUAL_ID:
			return JobTrackerJobtracker_hostOn_4003;
		case HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID:
			return HDFSNameNodeHdfsnamenode_hostOn_4001;
		case TaskTrackerTasktracker_connectToEditPart.VISUAL_ID:
			return TaskTrackerTasktracker_connectTo_4004;
		case HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID:
			return HDFSDataNodeHdfsdatanode_connectTo_4005;
		case TaskTrackerTasktracker_hostOnEditPart.VISUAL_ID:
			return TaskTrackerTasktracker_hostOn_4007;
		case JobTrackerJobtracker_dependOnEditPart.VISUAL_ID:
			return JobTrackerJobtracker_dependOn_4002;
		case JavaJava_hostOnEditPart.VISUAL_ID:
			return JavaJava_hostOn_4008;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return hadoopmodel.diagram.providers.HadoopStackElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return hadoopmodel.diagram.providers.HadoopStackElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return hadoopmodel.diagram.providers.HadoopStackElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
