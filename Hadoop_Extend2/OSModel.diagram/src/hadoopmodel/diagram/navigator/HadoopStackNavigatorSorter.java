package hadoopmodel.diagram.navigator;

import hadoopmodel.diagram.part.HadoopStackVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class HadoopStackNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4015;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof HadoopStackNavigatorItem) {
			HadoopStackNavigatorItem item = (HadoopStackNavigatorItem) element;
			return HadoopStackVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
