package osmodel.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import osmodel.diagram.edit.parts.ClusterWrapEditPart;
import osmodel.diagram.edit.parts.OSModelEditPartFactory;
import osmodel.diagram.part.OSModelVisualIDRegistry;

/**
 * @generated
 */
public class OSModelEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public OSModelEditPartProvider() {
		super(new OSModelEditPartFactory(),
				OSModelVisualIDRegistry.TYPED_INSTANCE,
				ClusterWrapEditPart.MODEL_ID);
	}

}
