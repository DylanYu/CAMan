package osmodel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import osmodel.diagram.providers.OSModelElementTypes;
import osmodel.diagram.providers.OSModelModelingAssistantProvider;

/**
 * @generated
 */
public class OSModelModelingAssistantProviderOfClusterWrapEditPart extends
		OSModelModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(OSModelElementTypes.MySQLWrap_2005);
		types.add(OSModelElementTypes.WebWrap_2001);
		types.add(OSModelElementTypes.ServerWrap_2002);
		types.add(OSModelElementTypes.PHPWrap_2003);
		types.add(OSModelElementTypes.ApacheWrap_2004);
		return types;
	}

}
