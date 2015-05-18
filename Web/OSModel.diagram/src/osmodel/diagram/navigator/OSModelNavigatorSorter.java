package osmodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import osmodel.diagram.part.OSModelVisualIDRegistry;

/**
 * @generated
 */
public class OSModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4011;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof OSModelNavigatorItem) {
			OSModelNavigatorItem item = (OSModelNavigatorItem) element;
			return OSModelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
