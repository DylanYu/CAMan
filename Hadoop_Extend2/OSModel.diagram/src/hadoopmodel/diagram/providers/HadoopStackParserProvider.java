package hadoopmodel.diagram.providers;

import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.diagram.edit.parts.HadoopClusterJava_jdk_versionEditPart;
import hadoopmodel.diagram.edit.parts.ServerServer_nameEditPart;
import hadoopmodel.diagram.parsers.MessageFormatParser;
import hadoopmodel.diagram.part.HadoopStackVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class HadoopStackParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser hadoopClusterJava_jdk_version_5009Parser;

	/**
	 * @generated
	 */
	private IParser getHadoopClusterJava_jdk_version_5009Parser() {
		if (hadoopClusterJava_jdk_version_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { HadoopmodelPackage.eINSTANCE
					.getJava_Java_jdk_version() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hadoopClusterJava_jdk_version_5009Parser = parser;
		}
		return hadoopClusterJava_jdk_version_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser serverServer_name_5001Parser;

	/**
	 * @generated
	 */
	private IParser getServerServer_name_5001Parser() {
		if (serverServer_name_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { HadoopmodelPackage.eINSTANCE
					.getServer_Server_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serverServer_name_5001Parser = parser;
		}
		return serverServer_name_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case HadoopClusterJava_jdk_versionEditPart.VISUAL_ID:
			return getHadoopClusterJava_jdk_version_5009Parser();
		case ServerServer_nameEditPart.VISUAL_ID:
			return getServerServer_name_5001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(HadoopStackVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(HadoopStackVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (HadoopStackElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
