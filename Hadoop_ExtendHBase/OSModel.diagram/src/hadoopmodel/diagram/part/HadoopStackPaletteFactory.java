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
		paletteContainer.add(createHDFSNameNode4CreationTool());
		paletteContainer
				.add(createHDFSNameNodeHdfsnamenode_hostOn5CreationTool());
		paletteContainer.add(createHDFSDataNode6CreationTool());
		paletteContainer
				.add(createHDFSDataNodeHdfsdatanode_connectTo7CreationTool());
		paletteContainer
				.add(createHDFSDataNodeHdfsdatanode_hostOn8CreationTool());
		paletteContainer.add(createHBaseMaster9CreationTool());
		paletteContainer
				.add(createHBaseMasterHbasemaster_dependOn10CreationTool());
		paletteContainer
				.add(createHBaseMasterHbasemaster_hostOn11CreationTool());
		paletteContainer.add(createHBaseRegionServer12CreationTool());
		paletteContainer
				.add(createHBaseRegionServerHbaseregionserver_connectTo13CreationTool());
		paletteContainer
				.add(createHBaseRegionServerHbaseregionserver_hostOn14CreationTool());
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
	private ToolEntry createHDFSNameNode4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.HDFSNameNode4CreationTool_title,
				Messages.HDFSNameNode4CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSNameNode_2005));
		entry.setId("createHDFSNameNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSNameNode_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHDFSNameNodeHdfsnamenode_hostOn5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HDFSNameNodeHdfsnamenode_hostOn5CreationTool_title,
				Messages.HDFSNameNodeHdfsnamenode_hostOn5CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001));
		entry.setId("createHDFSNameNodeHdfsnamenode_hostOn5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHDFSDataNode6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.HDFSDataNode6CreationTool_title,
				Messages.HDFSDataNode6CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSDataNode_2004));
		entry.setId("createHDFSDataNode6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSDataNode_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHDFSDataNodeHdfsdatanode_connectTo7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HDFSDataNodeHdfsdatanode_connectTo7CreationTool_title,
				Messages.HDFSDataNodeHdfsdatanode_connectTo7CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005));
		entry.setId("createHDFSDataNodeHdfsdatanode_connectTo7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHDFSDataNodeHdfsdatanode_hostOn8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HDFSDataNodeHdfsdatanode_hostOn8CreationTool_title,
				Messages.HDFSDataNodeHdfsdatanode_hostOn8CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006));
		entry.setId("createHDFSDataNodeHdfsdatanode_hostOn8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHBaseMaster9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.HBaseMaster9CreationTool_title,
				Messages.HBaseMaster9CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HBaseMaster_2007));
		entry.setId("createHBaseMaster9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HBaseMaster_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHBaseMasterHbasemaster_dependOn10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HBaseMasterHbasemaster_dependOn10CreationTool_title,
				Messages.HBaseMasterHbasemaster_dependOn10CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HBaseMasterHbasemaster_dependOn_4011));
		entry.setId("createHBaseMasterHbasemaster_dependOn10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HBaseMasterHbasemaster_dependOn_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHBaseMasterHbasemaster_hostOn11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HBaseMasterHbasemaster_hostOn11CreationTool_title,
				Messages.HBaseMasterHbasemaster_hostOn11CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HBaseMasterHbasemaster_hostOn_4010));
		entry.setId("createHBaseMasterHbasemaster_hostOn11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HBaseMasterHbasemaster_hostOn_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHBaseRegionServer12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.HBaseRegionServer12CreationTool_title,
				Messages.HBaseRegionServer12CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HBaseRegionServer_2008));
		entry.setId("createHBaseRegionServer12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HBaseRegionServer_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHBaseRegionServerHbaseregionserver_connectTo13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HBaseRegionServerHbaseregionserver_connectTo13CreationTool_title,
				Messages.HBaseRegionServerHbaseregionserver_connectTo13CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_connectTo_4009));
		entry.setId("createHBaseRegionServerHbaseregionserver_connectTo13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_connectTo_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHBaseRegionServerHbaseregionserver_hostOn14CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HBaseRegionServerHbaseregionserver_hostOn14CreationTool_title,
				Messages.HBaseRegionServerHbaseregionserver_hostOn14CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012));
		entry.setId("createHBaseRegionServerHbaseregionserver_hostOn14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
