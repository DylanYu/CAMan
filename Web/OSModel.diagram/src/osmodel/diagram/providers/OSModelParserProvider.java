package osmodel.diagram.providers;

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

import osmodel.OsmodelPackage;
import osmodel.diagram.edit.parts.ApacheWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.MySQLWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.PHPWrapSoftware_nameEditPart;
import osmodel.diagram.edit.parts.ServerWrapServer_nameEditPart;
import osmodel.diagram.edit.parts.WebWrapSoftware_nameEditPart;
import osmodel.diagram.parsers.MessageFormatParser;
import osmodel.diagram.part.OSModelVisualIDRegistry;

/**
 * @generated
 */
public class OSModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser mySQLWrapSoftware_name_5005Parser;

	/**
	 * @generated
	 */
	private IParser getMySQLWrapSoftware_name_5005Parser() {
		if (mySQLWrapSoftware_name_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { OsmodelPackage.eINSTANCE
					.getSoftware_Software_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mySQLWrapSoftware_name_5005Parser = parser;
		}
		return mySQLWrapSoftware_name_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser webWrapSoftware_name_5001Parser;

	/**
	 * @generated
	 */
	private IParser getWebWrapSoftware_name_5001Parser() {
		if (webWrapSoftware_name_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { OsmodelPackage.eINSTANCE
					.getSoftware_Software_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			webWrapSoftware_name_5001Parser = parser;
		}
		return webWrapSoftware_name_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser serverWrapServer_name_5002Parser;

	/**
	 * @generated
	 */
	private IParser getServerWrapServer_name_5002Parser() {
		if (serverWrapServer_name_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { OsmodelPackage.eINSTANCE
					.getServerWrap_Server_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serverWrapServer_name_5002Parser = parser;
		}
		return serverWrapServer_name_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser pHPWrapSoftware_name_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPHPWrapSoftware_name_5003Parser() {
		if (pHPWrapSoftware_name_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { OsmodelPackage.eINSTANCE
					.getSoftware_Software_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pHPWrapSoftware_name_5003Parser = parser;
		}
		return pHPWrapSoftware_name_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser apacheWrapSoftware_name_5004Parser;

	/**
	 * @generated
	 */
	private IParser getApacheWrapSoftware_name_5004Parser() {
		if (apacheWrapSoftware_name_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { OsmodelPackage.eINSTANCE
					.getSoftware_Software_name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			apacheWrapSoftware_name_5004Parser = parser;
		}
		return apacheWrapSoftware_name_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MySQLWrapSoftware_nameEditPart.VISUAL_ID:
			return getMySQLWrapSoftware_name_5005Parser();
		case WebWrapSoftware_nameEditPart.VISUAL_ID:
			return getWebWrapSoftware_name_5001Parser();
		case ServerWrapServer_nameEditPart.VISUAL_ID:
			return getServerWrapServer_name_5002Parser();
		case PHPWrapSoftware_nameEditPart.VISUAL_ID:
			return getPHPWrapSoftware_name_5003Parser();
		case ApacheWrapSoftware_nameEditPart.VISUAL_ID:
			return getApacheWrapSoftware_name_5004Parser();
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
			return getParser(OSModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(OSModelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (OSModelElementTypes.getElement(hint) == null) {
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
