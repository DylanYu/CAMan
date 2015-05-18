package hadoopmodel.diagram.providers;

import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HBaseMasterEditPart;
import hadoopmodel.diagram.edit.parts.HBaseMasterHbasemaster_dependOnEditPart;
import hadoopmodel.diagram.edit.parts.HBaseMasterHbasemaster_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HBaseRegionServerEditPart;
import hadoopmodel.diagram.edit.parts.HBaseRegionServerHbaseregionserver_connectToEditPart;
import hadoopmodel.diagram.edit.parts.HBaseRegionServerHbaseregionserver_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_connectToEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeHdfsnamenode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.JavaEditPart;
import hadoopmodel.diagram.edit.parts.JavaJava_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.ServerEditPart;
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
	public static final IElementType HDFSDataNode_2004 = getElementType("OSModel.diagram.HDFSDataNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HBaseMaster_2007 = getElementType("OSModel.diagram.HBaseMaster_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDFSNameNode_2005 = getElementType("OSModel.diagram.HDFSNameNode_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HBaseRegionServer_2008 = getElementType("OSModel.diagram.HBaseRegionServer_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Java_2003 = getElementType("OSModel.diagram.Java_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDFSNameNodeHdfsnamenode_hostOn_4001 = getElementType("OSModel.diagram.HDFSNameNodeHdfsnamenode_hostOn_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HBaseRegionServerHbaseregionserver_connectTo_4009 = getElementType("OSModel.diagram.HBaseRegionServerHbaseregionserver_connectTo_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JavaJava_hostOn_4008 = getElementType("OSModel.diagram.JavaJava_hostOn_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDFSDataNodeHdfsdatanode_connectTo_4005 = getElementType("OSModel.diagram.HDFSDataNodeHdfsdatanode_connectTo_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HBaseMasterHbasemaster_hostOn_4010 = getElementType("OSModel.diagram.HBaseMasterHbasemaster_hostOn_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HDFSDataNodeHdfsdatanode_hostOn_4006 = getElementType("OSModel.diagram.HDFSDataNodeHdfsdatanode_hostOn_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HBaseMasterHbasemaster_dependOn_4011 = getElementType("OSModel.diagram.HBaseMasterHbasemaster_dependOn_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HBaseRegionServerHbaseregionserver_hostOn_4012 = getElementType("OSModel.diagram.HBaseRegionServerHbaseregionserver_hostOn_4012"); //$NON-NLS-1$

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

			elements.put(HDFSDataNode_2004,
					HadoopmodelPackage.eINSTANCE.getHDFSDataNode());

			elements.put(HBaseMaster_2007,
					HadoopmodelPackage.eINSTANCE.getHBaseMaster());

			elements.put(HDFSNameNode_2005,
					HadoopmodelPackage.eINSTANCE.getHDFSNameNode());

			elements.put(HBaseRegionServer_2008,
					HadoopmodelPackage.eINSTANCE.getHBaseRegionServer());

			elements.put(Java_2003, HadoopmodelPackage.eINSTANCE.getJava());

			elements.put(HDFSNameNodeHdfsnamenode_hostOn_4001,
					HadoopmodelPackage.eINSTANCE
							.getHDFSNameNode_Hdfsnamenode_hostOn());

			elements.put(HBaseRegionServerHbaseregionserver_connectTo_4009,
					HadoopmodelPackage.eINSTANCE
							.getHBaseRegionServer_Hbaseregionserver_connectTo());

			elements.put(JavaJava_hostOn_4008,
					HadoopmodelPackage.eINSTANCE.getJava_Java_hostOn());

			elements.put(HDFSDataNodeHdfsdatanode_connectTo_4005,
					HadoopmodelPackage.eINSTANCE
							.getHDFSDataNode_Hdfsdatanode_connectTo());

			elements.put(HBaseMasterHbasemaster_hostOn_4010,
					HadoopmodelPackage.eINSTANCE
							.getHBaseMaster_Hbasemaster_hostOn());

			elements.put(HDFSDataNodeHdfsdatanode_hostOn_4006,
					HadoopmodelPackage.eINSTANCE
							.getHDFSDataNode_Hdfsdatanode_hostOn());

			elements.put(HBaseMasterHbasemaster_dependOn_4011,
					HadoopmodelPackage.eINSTANCE
							.getHBaseMaster_Hbasemaster_dependOn());

			elements.put(HBaseRegionServerHbaseregionserver_hostOn_4012,
					HadoopmodelPackage.eINSTANCE
							.getHBaseRegionServer_Hbaseregionserver_hostOn());
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
			KNOWN_ELEMENT_TYPES.add(HDFSDataNode_2004);
			KNOWN_ELEMENT_TYPES.add(HBaseMaster_2007);
			KNOWN_ELEMENT_TYPES.add(HDFSNameNode_2005);
			KNOWN_ELEMENT_TYPES.add(HBaseRegionServer_2008);
			KNOWN_ELEMENT_TYPES.add(Java_2003);
			KNOWN_ELEMENT_TYPES.add(HDFSNameNodeHdfsnamenode_hostOn_4001);
			KNOWN_ELEMENT_TYPES
					.add(HBaseRegionServerHbaseregionserver_connectTo_4009);
			KNOWN_ELEMENT_TYPES.add(JavaJava_hostOn_4008);
			KNOWN_ELEMENT_TYPES.add(HDFSDataNodeHdfsdatanode_connectTo_4005);
			KNOWN_ELEMENT_TYPES.add(HBaseMasterHbasemaster_hostOn_4010);
			KNOWN_ELEMENT_TYPES.add(HDFSDataNodeHdfsdatanode_hostOn_4006);
			KNOWN_ELEMENT_TYPES.add(HBaseMasterHbasemaster_dependOn_4011);
			KNOWN_ELEMENT_TYPES
					.add(HBaseRegionServerHbaseregionserver_hostOn_4012);
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
		case HDFSDataNodeEditPart.VISUAL_ID:
			return HDFSDataNode_2004;
		case HBaseMasterEditPart.VISUAL_ID:
			return HBaseMaster_2007;
		case HDFSNameNodeEditPart.VISUAL_ID:
			return HDFSNameNode_2005;
		case HBaseRegionServerEditPart.VISUAL_ID:
			return HBaseRegionServer_2008;
		case JavaEditPart.VISUAL_ID:
			return Java_2003;
		case HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID:
			return HDFSNameNodeHdfsnamenode_hostOn_4001;
		case HBaseRegionServerHbaseregionserver_connectToEditPart.VISUAL_ID:
			return HBaseRegionServerHbaseregionserver_connectTo_4009;
		case JavaJava_hostOnEditPart.VISUAL_ID:
			return JavaJava_hostOn_4008;
		case HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID:
			return HDFSDataNodeHdfsdatanode_connectTo_4005;
		case HBaseMasterHbasemaster_hostOnEditPart.VISUAL_ID:
			return HBaseMasterHbasemaster_hostOn_4010;
		case HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID:
			return HDFSDataNodeHdfsdatanode_hostOn_4006;
		case HBaseMasterHbasemaster_dependOnEditPart.VISUAL_ID:
			return HBaseMasterHbasemaster_dependOn_4011;
		case HBaseRegionServerHbaseregionserver_hostOnEditPart.VISUAL_ID:
			return HBaseRegionServerHbaseregionserver_hostOn_4012;
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
