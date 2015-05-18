package hadoopmodel.diagram.providers;

import hadoopmodel.diagram.part.HadoopStackDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = HadoopStackDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			HadoopStackDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
