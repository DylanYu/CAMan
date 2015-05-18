package hadoopmodel.diagram.navigator;

import hadoopmodel.Cloud;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HadoopMasterEditPart;
import hadoopmodel.diagram.edit.parts.HadoopMasterHadoopmaster_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HadoopMasterJava_jdk_versionEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveHadoopslave_connectToEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveHadoopslave_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveJava_jdk_versionEditPart;
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
		case HadoopMasterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HadoopMaster", HadoopStackElementTypes.HadoopMaster_2007); //$NON-NLS-1$
		case HadoopSlaveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HadoopSlave", HadoopStackElementTypes.HadoopSlave_2008); //$NON-NLS-1$
		case HadoopSlaveHadoopslave_connectToEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HadoopSlave?hadoopslave_connectTo", HadoopStackElementTypes.HadoopSlaveHadoopslave_connectTo_4009); //$NON-NLS-1$
		case HadoopMasterHadoopmaster_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HadoopMaster?hadoopmaster_hostOn", HadoopStackElementTypes.HadoopMasterHadoopmaster_hostOn_4010); //$NON-NLS-1$
		case HadoopSlaveHadoopslave_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HadoopSlave?hadoopslave_hostOn", HadoopStackElementTypes.HadoopSlaveHadoopslave_hostOn_4011); //$NON-NLS-1$
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
		case HadoopMasterEditPart.VISUAL_ID:
			return getHadoopMaster_2007Text(view);
		case HadoopSlaveEditPart.VISUAL_ID:
			return getHadoopSlave_2008Text(view);
		case HadoopSlaveHadoopslave_connectToEditPart.VISUAL_ID:
			return getHadoopSlaveHadoopslave_connectTo_4009Text(view);
		case HadoopMasterHadoopmaster_hostOnEditPart.VISUAL_ID:
			return getHadoopMasterHadoopmaster_hostOn_4010Text(view);
		case HadoopSlaveHadoopslave_hostOnEditPart.VISUAL_ID:
			return getHadoopSlaveHadoopslave_hostOn_4011Text(view);
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
	private String getHadoopMaster_2007Text(View view) {
		IParser parser = HadoopStackParserProvider
				.getParser(
						HadoopStackElementTypes.HadoopMaster_2007,
						view.getElement() != null ? view.getElement() : view,
						HadoopStackVisualIDRegistry
								.getType(HadoopMasterJava_jdk_versionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHadoopSlave_2008Text(View view) {
		IParser parser = HadoopStackParserProvider
				.getParser(
						HadoopStackElementTypes.HadoopSlave_2008,
						view.getElement() != null ? view.getElement() : view,
						HadoopStackVisualIDRegistry
								.getType(HadoopSlaveJava_jdk_versionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHadoopSlaveHadoopslave_connectTo_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHadoopMasterHadoopmaster_hostOn_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHadoopSlaveHadoopslave_hostOn_4011Text(View view) {
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
