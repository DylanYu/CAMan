package hadoopmodel.diagram.providers;

import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.diagram.edit.parts.HadoopMasterJava_jdk_versionEditPart;
import hadoopmodel.diagram.edit.parts.HadoopSlaveJava_jdk_versionEditPart;
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
	private IParser hadoopMasterJava_jdk_version_5007Parser;

	/**
	 * @generated
	 */
	private IParser getHadoopMasterJava_jdk_version_5007Parser() {
		if (hadoopMasterJava_jdk_version_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { HadoopmodelPackage.eINSTANCE
					.getJava_Java_jdk_version() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hadoopMasterJava_jdk_version_5007Parser = parser;
		}
		return hadoopMasterJava_jdk_version_5007Parser;
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
	private IParser hadoopSlaveJava_jdk_version_5008Parser;

	/**
	 * @generated
	 */
	private IParser getHadoopSlaveJava_jdk_version_5008Parser() {
		if (hadoopSlaveJava_jdk_version_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { HadoopmodelPackage.eINSTANCE
					.getJava_Java_jdk_version() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hadoopSlaveJava_jdk_version_5008Parser = parser;
		}
		return hadoopSlaveJava_jdk_version_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case HadoopMasterJava_jdk_versionEditPart.VISUAL_ID:
			return getHadoopMasterJava_jdk_version_5007Parser();
		case ServerServer_nameEditPart.VISUAL_ID:
			return getServerServer_name_5001Parser();
		case HadoopSlaveJava_jdk_versionEditPart.VISUAL_ID:
			return getHadoopSlaveJava_jdk_version_5008Parser();
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
