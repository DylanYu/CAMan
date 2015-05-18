package hadoopmodel.diagram.part;

import hadoopmodel.diagram.providers.HadoopStackElementTypes;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class HadoopStackPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createHadoopmodel1Group());
	}

	/**
	 * Creates "hadoopmodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createHadoopmodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Hadoopmodel1Group_title);
		paletteContainer.setId("createHadoopmodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createServer1CreationTool());
		paletteContainer.add(createJava2CreationTool());
		paletteContainer.add(createJavaJava_hostOn3CreationTool());
		paletteContainer.add(createJobTracker4CreationTool());
		paletteContainer
				.add(createJobTrackerJobtracker_dependOn5CreationTool());
		paletteContainer.add(createJobTrackerJobtracker_hostOn6CreationTool());
		paletteContainer.add(createTaskTracker7CreationTool());
		paletteContainer
				.add(createTaskTrackerTasktracker_connectTo8CreationTool());
		paletteContainer
				.add(createTaskTrackerTasktracker_hostOn9CreationTool());
		paletteContainer.add(createHDFSNameNode10CreationTool());
		paletteContainer
				.add(createHDFSNameNodeHdfsnamenode_hostOn11CreationTool());
		paletteContainer.add(createHDFSDataNode12CreationTool());
		paletteContainer
				.add(createHDFSDataNodeHdfsdatanode_connectTo13CreationTool());
		paletteContainer
				.add(createHDFSDataNodeHdfsdatanode_hostOn14CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServer1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Server1CreationTool_title,
				Messages.Server1CreationTool_desc,
				Collections.singletonList(HadoopStackElementTypes.Server_2001));
		entry.setId("createServer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.Server_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJava2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Java2CreationTool_title,
				Messages.Java2CreationTool_desc,
				Collections.singletonList(HadoopStackElementTypes.Java_2003));
		entry.setId("createJava2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.Java_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJavaJava_hostOn3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.JavaJava_hostOn3CreationTool_title,
				Messages.JavaJava_hostOn3CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.JavaJava_hostOn_4008));
		entry.setId("createJavaJava_hostOn3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.JavaJava_hostOn_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJobTracker4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.JobTracker4CreationTool_title,
				Messages.JobTracker4CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.JobTracker_2002));
		entry.setId("createJobTracker4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.JobTracker_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJobTrackerJobtracker_dependOn5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.JobTrackerJobtracker_dependOn5CreationTool_title,
				Messages.JobTrackerJobtracker_dependOn5CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002));
		entry.setId("createJobTrackerJobtracker_dependOn5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJobTrackerJobtracker_hostOn6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.JobTrackerJobtracker_hostOn6CreationTool_title,
				Messages.JobTrackerJobtracker_hostOn6CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003));
		entry.setId("createJobTrackerJobtracker_hostOn6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTaskTracker7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TaskTracker7CreationTool_title,
				Messages.TaskTracker7CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.TaskTracker_2006));
		entry.setId("createTaskTracker7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.TaskTracker_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTaskTrackerTasktracker_connectTo8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.TaskTrackerTasktracker_connectTo8CreationTool_title,
				Messages.TaskTrackerTasktracker_connectTo8CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004));
		entry.setId("createTaskTrackerTasktracker_connectTo8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTaskTrackerTasktracker_hostOn9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.TaskTrackerTasktracker_hostOn9CreationTool_title,
				Messages.TaskTrackerTasktracker_hostOn9CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007));
		entry.setId("createTaskTrackerTasktracker_hostOn9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHDFSNameNode10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.HDFSNameNode10CreationTool_title,
				Messages.HDFSNameNode10CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSNameNode_2005));
		entry.setId("createHDFSNameNode10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSNameNode_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHDFSNameNodeHdfsnamenode_hostOn11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HDFSNameNodeHdfsnamenode_hostOn11CreationTool_title,
				Messages.HDFSNameNodeHdfsnamenode_hostOn11CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001));
		entry.setId("createHDFSNameNodeHdfsnamenode_hostOn11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHDFSDataNode12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.HDFSDataNode12CreationTool_title,
				Messages.HDFSDataNode12CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSDataNode_2004));
		entry.setId("createHDFSDataNode12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSDataNode_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHDFSDataNodeHdfsdatanode_connectTo13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HDFSDataNodeHdfsdatanode_connectTo13CreationTool_title,
				Messages.HDFSDataNodeHdfsdatanode_connectTo13CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005));
		entry.setId("createHDFSDataNodeHdfsdatanode_connectTo13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHDFSDataNodeHdfsdatanode_hostOn14CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HDFSDataNodeHdfsdatanode_hostOn14CreationTool_title,
				Messages.HDFSDataNodeHdfsdatanode_hostOn14CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006));
		entry.setId("createHDFSDataNodeHdfsdatanode_hostOn14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
