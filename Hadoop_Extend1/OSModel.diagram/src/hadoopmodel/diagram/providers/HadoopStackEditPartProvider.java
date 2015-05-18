package hadoopmodel.diagram.providers;

import hadoopmodel.diagram.edit.parts.CloudEditPart;
import hadoopmodel.diagram.edit.parts.HadoopStackEditPartFactory;
import hadoopmodel.diagram.part.HadoopStackVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class HadoopStackEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public HadoopStackEditPartProvider() {
		super(new HadoopStackEditPartFactory(),
				HadoopStackVisualIDRegistry.TYPED_INSTANCE,
				CloudEditPart.MODEL_ID);
	}

}
