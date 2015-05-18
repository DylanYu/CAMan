package hadoopmodel.diagram.navigator;

import hadoopmodel.Cloud;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterHadoopcluster_master_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterHadoopcluster_slave_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HadoopClusterJava_jdk_versionEditPart;
import hadoopmodel.diagram.edit.parts.ServerEditPart;
import hadoopmodel.diagram.edit.parts.ServerServer_nameEditPart;
import hadoopmodel.diagram.part.HadoopStackDiagramEditorPlugin;
import hadoopmodel.diagram.part.HadoopStackVisualIDRegistry;
import hadoopmodel.diagram.providers.HadoopStackElementTypes;
import hadoopmodel.diagram.providers.HadoopStackParserProvider;

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

/**
 * @generated
 */
public class HadoopStackNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		HadoopStackDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		HadoopStackDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof HadoopStackNavigatorItem
				&& !isOwnView(((HadoopStackNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof HadoopStackNavigatorGroup) {
			HadoopStackNavigatorGroup group = (HadoopStackNavigatorGroup) element;
			return HadoopStackDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof HadoopStackNavigatorItem) {
			HadoopStackNavigatorItem navigatorItem = (HadoopStackNavigatorItem) element;
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
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case CloudEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.sei.pku.edu.cn/rsa/hadoopmodel?Cloud", HadoopStackElementTypes.Cloud_1000); //$NON-NLS-1$
		case ServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/hadoopmodel?Server", HadoopStackElementTypes.Server_2001); //$NON-NLS-1$
		case HadoopClusterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HadoopCluster", HadoopStackElementTypes.HadoopCluster_2009); //$NON-NLS-1$
		case HadoopClusterHadoopcluster_master_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HadoopCluster?hadoopcluster_master_hostOn", HadoopStackElementTypes.HadoopClusterHadoopcluster_master_hostOn_4012); //$NON-NLS-1$
		case HadoopClusterHadoopcluster_slave_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HadoopCluster?hadoopcluster_slave_hostOn", HadoopStackElementTypes.HadoopClusterHadoopcluster_slave_hostOn_4013); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = HadoopStackDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& HadoopStackElementTypes.isKnownElementType(elementType)) {
			image = HadoopStackElementTypes.getImage(elementType);
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
		if (element instanceof HadoopStackNavigatorGroup) {
			HadoopStackNavigatorGroup group = (HadoopStackNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof HadoopStackNavigatorItem) {
			HadoopStackNavigatorItem navigatorItem = (HadoopStackNavigatorItem) element;
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
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {
		case CloudEditPart.VISUAL_ID:
			return getCloud_1000Text(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_2001Text(view);
		case HadoopClusterEditPart.VISUAL_ID:
			return getHadoopCluster_2009Text(view);
		case HadoopClusterHadoopcluster_master_hostOnEditPart.VISUAL_ID:
			return getHadoopClusterHadoopcluster_master_hostOn_4012Text(view);
		case HadoopClusterHadoopcluster_slave_hostOnEditPart.VISUAL_ID:
			return getHadoopClusterHadoopcluster_slave_hostOn_4013Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCloud_1000Text(View view) {
		Cloud domainModelElement = (Cloud) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCloud_name();
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServer_2001Text(View view) {
		IParser parser = HadoopStackParserProvider.getParser(
				HadoopStackElementTypes.Server_2001,
				view.getElement() != null ? view.getElement() : view,
				HadoopStackVisualIDRegistry
						.getType(ServerServer_nameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHadoopCluster_2009Text(View view) {
		IParser parser = HadoopStackParserProvider
				.getParser(
						HadoopStackElementTypes.HadoopCluster_2009,
						view.getElement() != null ? view.getElement() : view,
						HadoopStackVisualIDRegistry
								.getType(HadoopClusterJava_jdk_versionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHadoopClusterHadoopcluster_master_hostOn_4012Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHadoopClusterHadoopcluster_slave_hostOn_4013Text(View view) {
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
		return CloudEditPart.MODEL_ID.equals(HadoopStackVisualIDRegistry
				.getModelID(view));
	}

}
