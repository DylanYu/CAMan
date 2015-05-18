package osmodel.diagram.providers;

import osmodel.diagram.part.OSModelDiagramEditorPlugin;

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
		ElementInitializers cached = OSModelDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			OSModelDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
