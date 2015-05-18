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
		paletteContainer.add(createCloud1CreationTool());
		paletteContainer.add(createCloudServer2CreationTool());
		paletteContainer.add(createCloudHadoopcluster3CreationTool());
		paletteContainer.add(createServer4CreationTool());
		paletteContainer.add(createHadoopCluster5CreationTool());
		paletteContainer
				.add(createHadoopClusterHadoopcluster_master_hostOn6CreationTool());
		paletteContainer
				.add(createHadoopClusterHadoopcluster_slave_hostOn7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloud1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Cloud1CreationTool_title,
				Messages.Cloud1CreationTool_desc, null, null) {
		};
		entry.setId("createCloud1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloudServer2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CloudServer2CreationTool_title,
				Messages.CloudServer2CreationTool_desc, null, null) {
		};
		entry.setId("createCloudServer2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloudHadoopcluster3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CloudHadoopcluster3CreationTool_title,
				Messages.CloudHadoopcluster3CreationTool_desc, null, null) {
		};
		entry.setId("createCloudHadoopcluster3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServer4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Server4CreationTool_title,
				Messages.Server4CreationTool_desc,
				Collections.singletonList(HadoopStackElementTypes.Server_2001));
		entry.setId("createServer4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.Server_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHadoopCluster5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.HadoopCluster5CreationTool_title,
				Messages.HadoopCluster5CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HadoopCluster_2009));
		entry.setId("createHadoopCluster5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HadoopCluster_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHadoopClusterHadoopcluster_master_hostOn6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HadoopClusterHadoopcluster_master_hostOn6CreationTool_title,
				Messages.HadoopClusterHadoopcluster_master_hostOn6CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HadoopClusterHadoopcluster_master_hostOn_4012));
		entry.setId("createHadoopClusterHadoopcluster_master_hostOn6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HadoopClusterHadoopcluster_master_hostOn_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHadoopClusterHadoopcluster_slave_hostOn7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HadoopClusterHadoopcluster_slave_hostOn7CreationTool_title,
				Messages.HadoopClusterHadoopcluster_slave_hostOn7CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HadoopClusterHadoopcluster_slave_hostOn_4013));
		entry.setId("createHadoopClusterHadoopcluster_slave_hostOn7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HadoopClusterHadoopcluster_slave_hostOn_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
