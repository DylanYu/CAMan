package osmodel.diagram.providers;

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

import osmodel.OsmodelPackage;
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
import osmodel.diagram.part.OSModelDiagramEditorPlugin;

/**
 * @generated
 */
public class OSModelElementTypes {

	/**
	 * @generated
	 */
	private OSModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			OSModelDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ClusterWrap_1000 = getElementType("OSModel.diagram.ClusterWrap_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MySQLWrap_2005 = getElementType("OSModel.diagram.MySQLWrap_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WebWrap_2001 = getElementType("OSModel.diagram.WebWrap_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServerWrap_2002 = getElementType("OSModel.diagram.ServerWrap_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PHPWrap_2003 = getElementType("OSModel.diagram.PHPWrap_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ApacheWrap_2004 = getElementType("OSModel.diagram.ApacheWrap_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WebWrapWeb_connectTo_4004 = getElementType("OSModel.diagram.WebWrapWeb_connectTo_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SoftwareSoftware_hostOn_4006 = getElementType("OSModel.diagram.SoftwareSoftware_hostOn_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WebWrapWeb_dependOn_4007 = getElementType("OSModel.diagram.WebWrapWeb_dependOn_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PHPWrapPhp_dependOn_4009 = getElementType("OSModel.diagram.PHPWrapPhp_dependOn_4009"); //$NON-NLS-1$

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

			elements.put(ClusterWrap_1000,
					OsmodelPackage.eINSTANCE.getClusterWrap());

			elements.put(MySQLWrap_2005,
					OsmodelPackage.eINSTANCE.getMySQLWrap());

			elements.put(WebWrap_2001, OsmodelPackage.eINSTANCE.getWebWrap());

			elements.put(ServerWrap_2002,
					OsmodelPackage.eINSTANCE.getServerWrap());

			elements.put(PHPWrap_2003, OsmodelPackage.eINSTANCE.getPHPWrap());

			elements.put(ApacheWrap_2004,
					OsmodelPackage.eINSTANCE.getApacheWrap());

			elements.put(WebWrapWeb_connectTo_4004,
					OsmodelPackage.eINSTANCE.getWebWrap_Web_connectTo());

			elements.put(SoftwareSoftware_hostOn_4006,
					OsmodelPackage.eINSTANCE.getSoftware_Software_hostOn());

			elements.put(WebWrapWeb_dependOn_4007,
					OsmodelPackage.eINSTANCE.getWebWrap_Web_dependOn());

			elements.put(PHPWrapPhp_dependOn_4009,
					OsmodelPackage.eINSTANCE.getPHPWrap_Php_dependOn());
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
			KNOWN_ELEMENT_TYPES.add(ClusterWrap_1000);
			KNOWN_ELEMENT_TYPES.add(MySQLWrap_2005);
			KNOWN_ELEMENT_TYPES.add(WebWrap_2001);
			KNOWN_ELEMENT_TYPES.add(ServerWrap_2002);
			KNOWN_ELEMENT_TYPES.add(PHPWrap_2003);
			KNOWN_ELEMENT_TYPES.add(ApacheWrap_2004);
			KNOWN_ELEMENT_TYPES.add(WebWrapWeb_connectTo_4004);
			KNOWN_ELEMENT_TYPES.add(SoftwareSoftware_hostOn_4006);
			KNOWN_ELEMENT_TYPES.add(WebWrapWeb_dependOn_4007);
			KNOWN_ELEMENT_TYPES.add(PHPWrapPhp_dependOn_4009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ClusterWrapEditPart.VISUAL_ID:
			return ClusterWrap_1000;
		case MySQLWrapEditPart.VISUAL_ID:
			return MySQLWrap_2005;
		case WebWrapEditPart.VISUAL_ID:
			return WebWrap_2001;
		case ServerWrapEditPart.VISUAL_ID:
			return ServerWrap_2002;
		case PHPWrapEditPart.VISUAL_ID:
			return PHPWrap_2003;
		case ApacheWrapEditPart.VISUAL_ID:
			return ApacheWrap_2004;
		case WebWrapWeb_connectToEditPart.VISUAL_ID:
			return WebWrapWeb_connectTo_4004;
		case SoftwareSoftware_hostOnEditPart.VISUAL_ID:
			return SoftwareSoftware_hostOn_4006;
		case WebWrapWeb_dependOnEditPart.VISUAL_ID:
			return WebWrapWeb_dependOn_4007;
		case PHPWrapPhp_dependOnEditPart.VISUAL_ID:
			return PHPWrapPhp_dependOn_4009;
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
			return osmodel.diagram.providers.OSModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return osmodel.diagram.providers.OSModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return osmodel.diagram.providers.OSModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
