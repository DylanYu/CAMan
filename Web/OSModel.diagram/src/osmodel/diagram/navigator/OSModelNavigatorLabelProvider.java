package osmodel.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import osmodel.ClusterWrap;
import osmodel.diagram.edit.parts.ApacheWrapEditPart;
import osmodel.diagram.edit.parts.ApacheWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.ClusterWrapEditPart;
import osmodel.diagram.edit.parts.MySQLWrapEditPart;
import osmodel.diagram.edit.parts.MySQLWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.PHPWrapEditPart;
import osmodel.diagram.edit.parts.PHPWrapPhp_dependOnEditPart;
import osmodel.diagram.edit.parts.PHPWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.ServerWrapEditPart;
import osmodel.diagram.edit.parts.ServerWrapServer_nameEditPart;
import osmodel.diagram.edit.parts.SoftwareSoftware_hostOnEditPart;
import osmodel.diagram.edit.parts.WebWrapEditPart;
import osmodel.diagram.edit.parts.WebWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.WebWrapWeb_connectToEditPart;
import osmodel.diagram.edit.parts.WebWrapWeb_dependOnEditPart;
import osmodel.diagram.part.OSModelDiagramEditorPlugin;
import osmodel.diagram.part.OSModelVisualIDRegistry;
import osmodel.diagram.providers.OSModelElementTypes;
import osmodel.diagram.providers.OSModelParserProvider;

/**
 * @generated
 */
public class OSModelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		OSModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		OSModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof OSModelNavigatorItem
				&& !isOwnView(((OSModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof OSModelNavigatorGroup) {
			OSModelNavigatorGroup group = (OSModelNavigatorGroup) element;
			return OSModelDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof OSModelNavigatorItem) {
			OSModelNavigatorItem navigatorItem = (OSModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (OSModelVisualIDRegistry.getVisualID(view)) {
		case ClusterWrapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.sei.pku.edu.cn/rsa/osmodel?ClusterWrap", OSModelElementTypes.ClusterWrap_1000); //$NON-NLS-1$
		case WebWrapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/osmodel?WebWrap", OSModelElementTypes.WebWrap_2001); //$NON-NLS-1$
		case ServerWrapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/osmodel?ServerWrap", OSModelElementTypes.ServerWrap_2002); //$NON-NLS-1$
		case PHPWrapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/osmodel?PHPWrap", OSModelElementTypes.PHPWrap_2003); //$NON-NLS-1$
		case ApacheWrapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/osmodel?ApacheWrap", OSModelElementTypes.ApacheWrap_2004); //$NON-NLS-1$
		case MySQLWrapEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/osmodel?MySQLWrap", OSModelElementTypes.MySQLWrap_2005); //$NON-NLS-1$
		case WebWrapWeb_connectToEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/osmodel?WebWrap?web_connectTo", OSModelElementTypes.WebWrapWeb_connectTo_4004); //$NON-NLS-1$
		case SoftwareSoftware_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/osmodel?Software?software_hostOn", OSModelElementTypes.SoftwareSoftware_hostOn_4006); //$NON-NLS-1$
		case WebWrapWeb_dependOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/osmodel?WebWrap?web_dependOn", OSModelElementTypes.WebWrapWeb_dependOn_4007); //$NON-NLS-1$
		case PHPWrapPhp_dependOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/osmodel?PHPWrap?php_dependOn", OSModelElementTypes.PHPWrapPhp_dependOn_4009); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = OSModelDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& OSModelElementTypes.isKnownElementType(elementType)) {
			image = OSModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof OSModelNavigatorGroup) {
			OSModelNavigatorGroup group = (OSModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof OSModelNavigatorItem) {
			OSModelNavigatorItem navigatorItem = (OSModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (OSModelVisualIDRegistry.getVisualID(view)) {
		case ClusterWrapEditPart.VISUAL_ID:
			return getClusterWrap_1000Text(view);
		case WebWrapEditPart.VISUAL_ID:
			return getWebWrap_2001Text(view);
		case ServerWrapEditPart.VISUAL_ID:
			return getServerWrap_2002Text(view);
		case PHPWrapEditPart.VISUAL_ID:
			return getPHPWrap_2003Text(view);
		case ApacheWrapEditPart.VISUAL_ID:
			return getApacheWrap_2004Text(view);
		case MySQLWrapEditPart.VISUAL_ID:
			return getMySQLWrap_2005Text(view);
		case WebWrapWeb_connectToEditPart.VISUAL_ID:
			return getWebWrapWeb_connectTo_4004Text(view);
		case SoftwareSoftware_hostOnEditPart.VISUAL_ID:
			return getSoftwareSoftware_hostOn_4006Text(view);
		case WebWrapWeb_dependOnEditPart.VISUAL_ID:
			return getWebWrapWeb_dependOn_4007Text(view);
		case PHPWrapPhp_dependOnEditPart.VISUAL_ID:
			return getPHPWrapPhp_dependOn_4009Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getClusterWrap_1000Text(View view) {
		ClusterWrap domainModelElement = (ClusterWrap) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			OSModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWebWrap_2001Text(View view) {
		IParser parser = OSModelParserProvider.getParser(
				OSModelElementTypes.WebWrap_2001,
				view.getElement() != null ? view.getElement() : view,
				OSModelVisualIDRegistry
						.getType(WebWrapSoftware_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OSModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServerWrap_2002Text(View view) {
		IParser parser = OSModelParserProvider.getParser(
				OSModelElementTypes.ServerWrap_2002,
				view.getElement() != null ? view.getElement() : view,
				OSModelVisualIDRegistry
						.getType(ServerWrapServer_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OSModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPHPWrap_2003Text(View view) {
		IParser parser = OSModelParserProvider.getParser(
				OSModelElementTypes.PHPWrap_2003,
				view.getElement() != null ? view.getElement() : view,
				OSModelVisualIDRegistry
						.getType(PHPWrapSoftware_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OSModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getApacheWrap_2004Text(View view) {
		IParser parser = OSModelParserProvider.getParser(
				OSModelElementTypes.ApacheWrap_2004,
				view.getElement() != null ? view.getElement() : view,
				OSModelVisualIDRegistry
						.getType(ApacheWrapSoftware_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OSModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMySQLWrap_2005Text(View view) {
		IParser parser = OSModelParserProvider.getParser(
				OSModelElementTypes.MySQLWrap_2005,
				view.getElement() != null ? view.getElement() : view,
				OSModelVisualIDRegistry
						.getType(MySQLWrapSoftware_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			OSModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWebWrapWeb_connectTo_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSoftwareSoftware_hostOn_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWebWrapWeb_dependOn_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPHPWrapPhp_dependOn_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ClusterWrapEditPart.MODEL_ID.equals(OSModelVisualIDRegistry
				.getModelID(view));
	}

}
