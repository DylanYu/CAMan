package hadoopmodel.diagram.providers.assistants;

import hadoopmodel.diagram.providers.HadoopStackElementTypes;
import hadoopmodel.diagram.providers.HadoopStackModelingAssistantProvider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HadoopStackModelingAssistantProviderOfCloudEditPart extends
		HadoopStackModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(HadoopStackElementTypes.HadoopCluster_2009);
		types.add(HadoopStackElementTypes.Server_2001);
		return types;
	}

}
