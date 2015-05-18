package hadoopmodel.diagram.navigator;

import hadoopmodel.Cloud;
import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_connectToEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_data_dirEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeHdfsnamenode_data_dirEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeHdfsnamenode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.JavaEditPart;
import hadoopmodel.diagram.edit.parts.JavaJava_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.JavaJava_jdk_versionEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerJobtracker_data_dirEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerJobtracker_dependOnEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerJobtracker_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.ServerEditPart;
import hadoopmodel.diagram.edit.parts.ServerServer_nameEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerTasktracker_connectToEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerTasktracker_data_dirEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerTasktracker_hostOnEditPart;
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
		case JobTrackerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/hadoopmodel?JobTracker", HadoopStackElementTypes.JobTracker_2002); //$NON-NLS-1$
		case JavaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/hadoopmodel?Java", HadoopStackElementTypes.Java_2003); //$NON-NLS-1$
		case HDFSDataNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HDFSDataNode", HadoopStackElementTypes.HDFSDataNode_2004); //$NON-NLS-1$
		case HDFSNameNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HDFSNameNode", HadoopStackElementTypes.HDFSNameNode_2005); //$NON-NLS-1$
		case TaskTrackerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.sei.pku.edu.cn/rsa/hadoopmodel?TaskTracker", HadoopStackElementTypes.TaskTracker_2006); //$NON-NLS-1$
		case HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HDFSNameNode?hdfsnamenode_hostOn", HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001); //$NON-NLS-1$
		case JobTrackerJobtracker_dependOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?JobTracker?jobtracker_dependOn", HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002); //$NON-NLS-1$
		case JobTrackerJobtracker_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?JobTracker?jobtracker_hostOn", HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003); //$NON-NLS-1$
		case TaskTrackerTasktracker_connectToEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?TaskTracker?tasktracker_connectTo", HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004); //$NON-NLS-1$
		case HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HDFSDataNode?hdfsdatanode_connectTo", HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005); //$NON-NLS-1$
		case HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?HDFSDataNode?hdfsdatanode_hostOn", HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006); //$NON-NLS-1$
		case TaskTrackerTasktracker_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?TaskTracker?tasktracker_hostOn", HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007); //$NON-NLS-1$
		case JavaJava_hostOnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.sei.pku.edu.cn/rsa/hadoopmodel?Java?java_hostOn", HadoopStackElementTypes.JavaJava_hostOn_4008); //$NON-NLS-1$
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
		case JobTrackerEditPart.VISUAL_ID:
			return getJobTracker_2002Text(view);
		case JavaEditPart.VISUAL_ID:
			return getJava_2003Text(view);
		case HDFSDataNodeEditPart.VISUAL_ID:
			return getHDFSDataNode_2004Text(view);
		case HDFSNameNodeEditPart.VISUAL_ID:
			return getHDFSNameNode_2005Text(view);
		case TaskTrackerEditPart.VISUAL_ID:
			return getTaskTracker_2006Text(view);
		case HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID:
			return getHDFSNameNodeHdfsnamenode_hostOn_4001Text(view);
		case JobTrackerJobtracker_dependOnEditPart.VISUAL_ID:
			return getJobTrackerJobtracker_dependOn_4002Text(view);
		case JobTrackerJobtracker_hostOnEditPart.VISUAL_ID:
			return getJobTrackerJobtracker_hostOn_4003Text(view);
		case TaskTrackerTasktracker_connectToEditPart.VISUAL_ID:
			return getTaskTrackerTasktracker_connectTo_4004Text(view);
		case HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID:
			return getHDFSDataNodeHdfsdatanode_connectTo_4005Text(view);
		case HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID:
			return getHDFSDataNodeHdfsdatanode_hostOn_4006Text(view);
		case TaskTrackerTasktracker_hostOnEditPart.VISUAL_ID:
			return getTaskTrackerTasktracker_hostOn_4007Text(view);
		case JavaJava_hostOnEditPart.VISUAL_ID:
			return getJavaJava_hostOn_4008Text(view);
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
	private String getJobTracker_2002Text(View view) {
		IParser parser = HadoopStackParserProvider
				.getParser(
						HadoopStackElementTypes.JobTracker_2002,
						view.getElement() != null ? view.getElement() : view,
						HadoopStackVisualIDRegistry
								.getType(JobTrackerJobtracker_data_dirEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJava_2003Text(View view) {
		IParser parser = HadoopStackParserProvider.getParser(
				HadoopStackElementTypes.Java_2003,
				view.getElement() != null ? view.getElement() : view,
				HadoopStackVisualIDRegistry
						.getType(JavaJava_jdk_versionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHDFSDataNode_2004Text(View view) {
		IParser parser = HadoopStackParserProvider
				.getParser(
						HadoopStackElementTypes.HDFSDataNode_2004,
						view.getElement() != null ? view.getElement() : view,
						HadoopStackVisualIDRegistry
								.getType(HDFSDataNodeHdfsdatanode_data_dirEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHDFSNameNode_2005Text(View view) {
		IParser parser = HadoopStackParserProvider
				.getParser(
						HadoopStackElementTypes.HDFSNameNode_2005,
						view.getElement() != null ? view.getElement() : view,
						HadoopStackVisualIDRegistry
								.getType(HDFSNameNodeHdfsnamenode_data_dirEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskTracker_2006Text(View view) {
		IParser parser = HadoopStackParserProvider
				.getParser(
						HadoopStackElementTypes.TaskTracker_2006,
						view.getElement() != null ? view.getElement() : view,
						HadoopStackVisualIDRegistry
								.getType(TaskTrackerTasktracker_data_dirEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HadoopStackDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHDFSNameNodeHdfsnamenode_hostOn_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getJobTrackerJobtracker_dependOn_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getJobTrackerJobtracker_hostOn_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTaskTrackerTasktracker_connectTo_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHDFSDataNodeHdfsdatanode_connectTo_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHDFSDataNodeHdfsdatanode_hostOn_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTaskTrackerTasktracker_hostOn_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getJavaJava_hostOn_4008Text(View view) {
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
