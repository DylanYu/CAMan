package hadoopmodel.diagram.providers;

import hadoopmodel.HadoopmodelPackage;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_data_dirEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeHdfsnamenode_data_dirEditPart;
import hadoopmodel.diagram.edit.parts.JavaJava_jdk_versionEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerJobtracker_data_dirEditPart;
import hadoopmodel.diagram.edit.parts.ServerServer_nameEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerTasktracker_data_dirEditPart;
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
	private IParser hDFSNameNodeHdfsnamenode_data_dir_5005Parser;

	/**
	 * @generated
	 */
	private IParser getHDFSNameNodeHdfsnamenode_data_dir_5005Parser() {
		if (hDFSNameNodeHdfsnamenode_data_dir_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { HadoopmodelPackage.eINSTANCE
					.getHDFSNameNode_Hdfsnamenode_data_dir() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hDFSNameNodeHdfsnamenode_data_dir_5005Parser = parser;
		}
		return hDFSNameNodeHdfsnamenode_data_dir_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser hDFSDataNodeHdfsdatanode_data_dir_5004Parser;

	/**
	 * @generated
	 */
	private IParser getHDFSDataNodeHdfsdatanode_data_dir_5004Parser() {
		if (hDFSDataNodeHdfsdatanode_data_dir_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { HadoopmodelPackage.eINSTANCE
					.getHDFSDataNode_Hdfsdatanode_data_dir() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hDFSDataNodeHdfsdatanode_data_dir_5004Parser = parser;
		}
		return hDFSDataNodeHdfsdatanode_data_dir_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskTrackerTasktracker_data_dir_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTaskTrackerTasktracker_data_dir_5006Parser() {
		if (taskTrackerTasktracker_data_dir_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { HadoopmodelPackage.eINSTANCE
					.getTaskTracker_Tasktracker_data_dir() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskTrackerTasktracker_data_dir_5006Parser = parser;
		}
		return taskTrackerTasktracker_data_dir_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser jobTrackerJobtracker_data_dir_5002Parser;

	/**
	 * @generated
	 */
	private IParser getJobTrackerJobtracker_data_dir_5002Parser() {
		if (jobTrackerJobtracker_data_dir_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { HadoopmodelPackage.eINSTANCE
					.getJobTracker_Jobtracker_data_dir() };
			MessageFormatParser parser = new MessageFormatParser(features);
			jobTrackerJobtracker_data_dir_5002Parser = parser;
		}
		return jobTrackerJobtracker_data_dir_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser javaJava_jdk_version_5003Parser;

	/**
	 * @generated
	 */
	private IParser getJavaJava_jdk_version_5003Parser() {
		if (javaJava_jdk_version_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { HadoopmodelPackage.eINSTANCE
					.getJava_Java_jdk_version() };
			MessageFormatParser parser = new MessageFormatParser(features);
			javaJava_jdk_version_5003Parser = parser;
		}
		return javaJava_jdk_version_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ServerServer_nameEditPart.VISUAL_ID:
			return getServerServer_name_5001Parser();
		case HDFSNameNodeHdfsnamenode_data_dirEditPart.VISUAL_ID:
			return getHDFSNameNodeHdfsnamenode_data_dir_5005Parser();
		case HDFSDataNodeHdfsdatanode_data_dirEditPart.VISUAL_ID:
			return getHDFSDataNodeHdfsdatanode_data_dir_5004Parser();
		case TaskTrackerTasktracker_data_dirEditPart.VISUAL_ID:
			return getTaskTrackerTasktracker_data_dir_5006Parser();
		case JobTrackerJobtracker_data_dirEditPart.VISUAL_ID:
			return getJobTrackerJobtracker_data_dir_5002Parser();
		case JavaJava_jdk_versionEditPart.VISUAL_ID:
			return getJavaJava_jdk_version_5003Parser();
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
