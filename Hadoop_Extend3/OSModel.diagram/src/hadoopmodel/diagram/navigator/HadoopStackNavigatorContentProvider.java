package hadoopmodel.diagram.navigator;

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
import hadoopmodel.diagram.part.HadoopStackVisualIDRegistry;
import hadoopmodel.diagram.part.Messages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class HadoopStackNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public HadoopStackNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<HadoopStackNavigatorItem> result = new ArrayList<HadoopStackNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, CloudEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof HadoopStackNavigatorGroup) {
			HadoopStackNavigatorGroup group = (HadoopStackNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof HadoopStackNavigatorItem) {
			HadoopStackNavigatorItem navigatorItem = (HadoopStackNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (HadoopStackVisualIDRegistry.getVisualID(view)) {

		case CloudEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			HadoopStackNavigatorGroup links = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_Cloud_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(ServerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSDataNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSNameNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseRegionServerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry.getType(JavaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseRegionServerHbaseregionserver_connectToEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(JavaJava_hostOnEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterHbasemaster_hostOnEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterHbasemaster_dependOnEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseRegionServerHbaseregionserver_hostOnEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ServerEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Node sv = (Node) view;
			HadoopStackNavigatorGroup incominglinks = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_Server_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(JavaJava_hostOnEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterHbasemaster_hostOnEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseRegionServerHbaseregionserver_hostOnEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case JavaEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Node sv = (Node) view;
			HadoopStackNavigatorGroup outgoinglinks = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_Java_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(JavaJava_hostOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HDFSDataNodeEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Node sv = (Node) view;
			HadoopStackNavigatorGroup outgoinglinks = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HDFSDataNode_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HDFSNameNodeEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Node sv = (Node) view;
			HadoopStackNavigatorGroup outgoinglinks = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HDFSNameNode_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup incominglinks = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HDFSNameNode_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterHbasemaster_dependOnEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case HBaseMasterEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Node sv = (Node) view;
			HadoopStackNavigatorGroup incominglinks = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseMaster_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup outgoinglinks = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseMaster_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseRegionServerHbaseregionserver_connectToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterHbasemaster_hostOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterHbasemaster_dependOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HBaseRegionServerEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Node sv = (Node) view;
			HadoopStackNavigatorGroup outgoinglinks = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseRegionServer_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseRegionServerHbaseregionserver_connectToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseRegionServerHbaseregionserver_hostOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HadoopStackNavigatorGroup target = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HDFSNameNodeHdfsnamenode_hostOn_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup source = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HDFSNameNodeHdfsnamenode_hostOn_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(ServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSNameNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HadoopStackNavigatorGroup target = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HDFSDataNodeHdfsdatanode_connectTo_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup source = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HDFSDataNodeHdfsdatanode_connectTo_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSNameNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSDataNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HadoopStackNavigatorGroup target = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HDFSDataNodeHdfsdatanode_hostOn_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup source = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HDFSDataNodeHdfsdatanode_hostOn_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(ServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSDataNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case JavaJava_hostOnEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HadoopStackNavigatorGroup target = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_JavaJava_hostOn_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup source = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_JavaJava_hostOn_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(ServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry.getType(JavaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HBaseRegionServerHbaseregionserver_connectToEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HadoopStackNavigatorGroup target = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseRegionServerHbaseregionserver_connectTo_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup source = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseRegionServerHbaseregionserver_connectTo_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseRegionServerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HBaseMasterHbasemaster_hostOnEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HadoopStackNavigatorGroup target = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseMasterHbasemaster_hostOn_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup source = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseMasterHbasemaster_hostOn_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(ServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HBaseMasterHbasemaster_dependOnEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HadoopStackNavigatorGroup target = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseMasterHbasemaster_dependOn_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup source = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseMasterHbasemaster_dependOn_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HDFSNameNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseMasterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case HBaseRegionServerHbaseregionserver_hostOnEditPart.VISUAL_ID: {
			LinkedList<HadoopStackAbstractNavigatorItem> result = new LinkedList<HadoopStackAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HadoopStackNavigatorGroup target = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseRegionServerHbaseregionserver_hostOn_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HadoopStackNavigatorGroup source = new HadoopStackNavigatorGroup(
					Messages.NavigatorGroupName_HBaseRegionServerHbaseregionserver_hostOn_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(ServerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HadoopStackVisualIDRegistry
							.getType(HBaseRegionServerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CloudEditPart.MODEL_ID.equals(HadoopStackVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<HadoopStackNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<HadoopStackNavigatorItem> result = new ArrayList<HadoopStackNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new HadoopStackNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof HadoopStackAbstractNavigatorItem) {
			HadoopStackAbstractNavigatorItem abstractNavigatorItem = (HadoopStackAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
