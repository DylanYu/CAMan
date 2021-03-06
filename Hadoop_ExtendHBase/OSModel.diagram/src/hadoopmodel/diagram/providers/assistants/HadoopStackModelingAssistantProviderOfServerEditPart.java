package hadoopmodel.diagram.providers.assistants;

import hadoopmodel.diagram.edit.parts.ServerEditPart;
import hadoopmodel.diagram.providers.HadoopStackElementTypes;
import hadoopmodel.diagram.providers.HadoopStackModelingAssistantProvider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class HadoopStackModelingAssistantProviderOfServerEditPart extends
		HadoopStackModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ServerEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ServerEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001);
		types.add(HadoopStackElementTypes.JavaJava_hostOn_4008);
		types.add(HadoopStackElementTypes.HBaseMasterHbasemaster_hostOn_4010);
		types.add(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006);
		types.add(HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ServerEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ServerEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001) {
			types.add(HadoopStackElementTypes.HDFSNameNode_2005);
		} else if (relationshipType == HadoopStackElementTypes.JavaJava_hostOn_4008) {
			types.add(HadoopStackElementTypes.Java_2003);
		} else if (relationshipType == HadoopStackElementTypes.HBaseMasterHbasemaster_hostOn_4010) {
			types.add(HadoopStackElementTypes.HBaseMaster_2007);
		} else if (relationshipType == HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006) {
			types.add(HadoopStackElementTypes.HDFSDataNode_2004);
		} else if (relationshipType == HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012) {
			types.add(HadoopStackElementTypes.HBaseRegionServer_2008);
		}
		return types;
	}

}
