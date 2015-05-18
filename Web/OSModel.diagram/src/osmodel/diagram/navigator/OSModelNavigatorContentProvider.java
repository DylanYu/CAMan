package osmodel.diagram.navigator;

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
import osmodel.diagram.part.Messages;
import osmodel.diagram.part.OSModelVisualIDRegistry;

/**
 * @generated
 */
public class OSModelNavigatorContentProvider implements ICommonContentProvider {

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
	public OSModelNavigatorContentProvider() {
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
			ArrayList<OSModelNavigatorItem> result = new ArrayList<OSModelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, ClusterWrapEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof OSModelNavigatorGroup) {
			OSModelNavigatorGroup group = (OSModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof OSModelNavigatorItem) {
			OSModelNavigatorItem navigatorItem = (OSModelNavigatorItem) parentElement;
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
		switch (OSModelVisualIDRegistry.getVisualID(view)) {

		case ClusterWrapEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			OSModelNavigatorGroup links = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_ClusterWrap_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(MySQLWrapEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OSModelVisualIDRegistry.getType(WebWrapEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(ServerWrapEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OSModelVisualIDRegistry.getType(PHPWrapEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(ApacheWrapEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(WebWrapWeb_connectToEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(SoftwareSoftware_hostOnEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(WebWrapWeb_dependOnEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(PHPWrapPhp_dependOnEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case WebWrapEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OSModelNavigatorGroup outgoinglinks = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_WebWrap_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(WebWrapWeb_connectToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(SoftwareSoftware_hostOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(WebWrapWeb_dependOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ServerWrapEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OSModelNavigatorGroup incominglinks = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_ServerWrap_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(SoftwareSoftware_hostOnEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PHPWrapEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OSModelNavigatorGroup outgoinglinks = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_PHPWrap_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OSModelNavigatorGroup incominglinks = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_PHPWrap_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(SoftwareSoftware_hostOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(WebWrapWeb_dependOnEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(PHPWrapPhp_dependOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ApacheWrapEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OSModelNavigatorGroup outgoinglinks = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_ApacheWrap_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OSModelNavigatorGroup incominglinks = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_ApacheWrap_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(SoftwareSoftware_hostOnEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(PHPWrapPhp_dependOnEditPart.VISUAL_ID));
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

		case MySQLWrapEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			OSModelNavigatorGroup incominglinks = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_MySQLWrap_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OSModelNavigatorGroup outgoinglinks = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_MySQLWrap_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(WebWrapWeb_connectToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(SoftwareSoftware_hostOnEditPart.VISUAL_ID));
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

		case WebWrapWeb_connectToEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OSModelNavigatorGroup target = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_WebWrapWeb_connectTo_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OSModelNavigatorGroup source = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_WebWrapWeb_connectTo_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(MySQLWrapEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OSModelVisualIDRegistry.getType(WebWrapEditPart.VISUAL_ID));
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

		case SoftwareSoftware_hostOnEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OSModelNavigatorGroup target = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_SoftwareSoftware_hostOn_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OSModelNavigatorGroup source = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_SoftwareSoftware_hostOn_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(ServerWrapEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(MySQLWrapEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OSModelVisualIDRegistry.getType(WebWrapEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OSModelVisualIDRegistry.getType(PHPWrapEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(ApacheWrapEditPart.VISUAL_ID));
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

		case WebWrapWeb_dependOnEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OSModelNavigatorGroup target = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_WebWrapWeb_dependOn_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OSModelNavigatorGroup source = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_WebWrapWeb_dependOn_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OSModelVisualIDRegistry.getType(PHPWrapEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OSModelVisualIDRegistry.getType(WebWrapEditPart.VISUAL_ID));
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

		case PHPWrapPhp_dependOnEditPart.VISUAL_ID: {
			LinkedList<OSModelAbstractNavigatorItem> result = new LinkedList<OSModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			OSModelNavigatorGroup target = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_PHPWrapPhp_dependOn_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			OSModelNavigatorGroup source = new OSModelNavigatorGroup(
					Messages.NavigatorGroupName_PHPWrapPhp_dependOn_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					OSModelVisualIDRegistry
							.getType(ApacheWrapEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					OSModelVisualIDRegistry.getType(PHPWrapEditPart.VISUAL_ID));
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
		return ClusterWrapEditPart.MODEL_ID.equals(OSModelVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<OSModelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<OSModelNavigatorItem> result = new ArrayList<OSModelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new OSModelNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof OSModelAbstractNavigatorItem) {
			OSModelAbstractNavigatorItem abstractNavigatorItem = (OSModelAbstractNavigatorItem) element;
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
