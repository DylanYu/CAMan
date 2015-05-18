package hadoopmodel.diagram.providers;

import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HadoopMasterEditPart;
import hadoopmodel.diagram.edit.parts.HadoopMasterHadoopmaster_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveHadoopslave_connectToEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveHadoopslave_hostOnEditPart;
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
	public static final IElementType HadoopMaster_2007 = getElementType("OSModel.diagram.HadoopMaster_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Server_2001 = getElementType("OSModel.diagram.Server_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HadoopSlave_2008 = getElementType("OSModel.diagram.HadoopSlave_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HadoopSlaveHadoopslave_connectTo_4009 = getElementType("OSModel.diagram.HadoopSlaveHadoopslave_connectTo_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HadoopMasterHadoopmaster_hostOn_4010 = getElementType("OSModel.diagram.HadoopMasterHadoopmaster_hostOn_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HadoopSlaveHadoopslave_hostOn_4011 = getElementType("OSModel.diagram.HadoopSlaveHadoopslave_hostOn_4011"); //$NON-NLS-1$

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

			elements.put(HadoopMaster_2007,
					HadoopmodelPackage.eINSTANCE.getHadoopMaster());

			elements.put(Server_2001, HadoopmodelPackage.eINSTANCE.getServer());

			elements.put(HadoopSlave_2008,
					HadoopmodelPackage.eINSTANCE.getHadoopSlave());

			elements.put(HadoopSlaveHadoopslave_connectTo_4009,
					HadoopmodelPackage.eINSTANCE
							.getHadoopSlave_Hadoopslave_connectTo());

			elements.put(HadoopMasterHadoopmaster_hostOn_4010,
					HadoopmodelPackage.eINSTANCE
							.getHadoopMaster_Hadoopmaster_hostOn());

			elements.put(HadoopSlaveHadoopslave_hostOn_4011,
					HadoopmodelPackage.eINSTANCE
							.getHadoopSlave_Hadoopslave_hostOn());
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
			KNOWN_ELEMENT_TYPES.add(HadoopMaster_2007);
			KNOWN_ELEMENT_TYPES.add(Server_2001);
			KNOWN_ELEMENT_TYPES.add(HadoopSlave_2008);
			KNOWN_ELEMENT_TYPES.add(HadoopSlaveHadoopslave_connectTo_4009);
			KNOWN_ELEMENT_TYPES.add(HadoopMasterHadoopmaster_hostOn_4010);
			KNOWN_ELEMENT_TYPES.add(HadoopSlaveHadoopslave_hostOn_4011);
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
		case HadoopMasterEditPart.VISUAL_ID:
			return HadoopMaster_2007;
		case ServerEditPart.VISUAL_ID:
			return Server_2001;
		case HadoopSlaveEditPart.VISUAL_ID:
			return HadoopSlave_2008;
		case HadoopSlaveHadoopslave_connectToEditPart.VISUAL_ID:
			return HadoopSlaveHadoopslave_connectTo_4009;
		case HadoopMasterHadoopmaster_hostOnEditPart.VISUAL_ID:
			return HadoopMasterHadoopmaster_hostOn_4010;
		case HadoopSlaveHadoopslave_hostOnEditPart.VISUAL_ID:
			return HadoopSlaveHadoopslave_hostOn_4011;
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
