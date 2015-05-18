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
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(HadoopStackElementTypes.Server_2001);
		types.add(HadoopStackElementTypes.HDFSDataNode_2004);
		types.add(HadoopStackElementTypes.HBaseMaster_2007);
		types.add(HadoopStackElementTypes.HDFSNameNode_2005);
		types.add(HadoopStackElementTypes.HBaseRegionServer_2008);
		types.add(HadoopStackElementTypes.Java_2003);
		return types;
	}

}
