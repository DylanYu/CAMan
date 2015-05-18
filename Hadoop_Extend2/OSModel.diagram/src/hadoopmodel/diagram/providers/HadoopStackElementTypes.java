package hadoopmodel.diagram.providers;

import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterHadoopcluster_master_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterHadoopcluster_slave_hostOnEditPart;
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
	public static final IElementType HadoopCluster_2009 = getElementType("OSModel.diagram.HadoopCluster_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Server_2001 = getElementType("OSModel.diagram.Server_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HadoopClusterHadoopcluster_master_hostOn_4012 = getElementType("OSModel.diagram.HadoopClusterHadoopcluster_master_hostOn_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HadoopClusterHadoopcluster_slave_hostOn_4013 = getElementType("OSModel.diagram.HadoopClusterHadoopcluster_slave_hostOn_4013"); //$NON-NLS-1$

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

			elements.put(HadoopCluster_2009,
					HadoopmodelPackage.eINSTANCE.getHadoopCluster());

			elements.put(Server_2001, HadoopmodelPackage.eINSTANCE.getServer());

			elements.put(HadoopClusterHadoopcluster_master_hostOn_4012,
					HadoopmodelPackage.eINSTANCE
							.getHadoopCluster_Hadoopcluster_master_hostOn());

			elements.put(HadoopClusterHadoopcluster_slave_hostOn_4013,
					HadoopmodelPackage.eINSTANCE
							.getHadoopCluster_Hadoopcluster_slave_hostOn());
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
			KNOWN_ELEMENT_TYPES.add(HadoopCluster_2009);
			KNOWN_ELEMENT_TYPES.add(Server_2001);
			KNOWN_ELEMENT_TYPES
					.add(HadoopClusterHadoopcluster_master_hostOn_4012);
			KNOWN_ELEMENT_TYPES
					.add(HadoopClusterHadoopcluster_slave_hostOn_4013);
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
		case HadoopClusterEditPart.VISUAL_ID:
			return HadoopCluster_2009;
		case ServerEditPart.VISUAL_ID:
			return Server_2001;
		case HadoopClusterHadoopcluster_master_hostOnEditPart.VISUAL_ID:
			return HadoopClusterHadoopcluster_master_hostOn_4012;
		case HadoopClusterHadoopcluster_slave_hostOnEditPart.VISUAL_ID:
			return HadoopClusterHadoopcluster_slave_hostOn_4013;
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
