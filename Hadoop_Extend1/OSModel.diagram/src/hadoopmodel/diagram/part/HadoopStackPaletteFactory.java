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
		paletteContainer.add(createCloudHadoopmaster3CreationTool());
		paletteContainer.add(createCloudHadoopslave4CreationTool());
		paletteContainer.add(createServer5CreationTool());
		paletteContainer.add(createHadoopMaster6CreationTool());
		paletteContainer
				.add(createHadoopMasterHadoopmaster_hostOn7CreationTool());
		paletteContainer.add(createHadoopSlave8CreationTool());
		paletteContainer
				.add(createHadoopSlaveHadoopslave_connectTo9CreationTool());
		paletteContainer
				.add(createHadoopSlaveHadoopslave_hostOn10CreationTool());
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
	private ToolEntry createCloudHadoopmaster3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CloudHadoopmaster3CreationTool_title,
				Messages.CloudHadoopmaster3CreationTool_desc, null, null) {
		};
		entry.setId("createCloudHadoopmaster3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloudHadoopslave4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CloudHadoopslave4CreationTool_title,
				Messages.CloudHadoopslave4CreationTool_desc, null, null) {
		};
		entry.setId("createCloudHadoopslave4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServer5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Server5CreationTool_title,
				Messages.Server5CreationTool_desc,
				Collections.singletonList(HadoopStackElementTypes.Server_2001));
		entry.setId("createServer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.Server_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHadoopMaster6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.HadoopMaster6CreationTool_title,
				Messages.HadoopMaster6CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HadoopMaster_2007));
		entry.setId("createHadoopMaster6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HadoopMaster_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHadoopMasterHadoopmaster_hostOn7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HadoopMasterHadoopmaster_hostOn7CreationTool_title,
				Messages.HadoopMasterHadoopmaster_hostOn7CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HadoopMasterHadoopmaster_hostOn_4010));
		entry.setId("createHadoopMasterHadoopmaster_hostOn7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HadoopMasterHadoopmaster_hostOn_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHadoopSlave8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.HadoopSlave8CreationTool_title,
				Messages.HadoopSlave8CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HadoopSlave_2008));
		entry.setId("createHadoopSlave8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HadoopSlave_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHadoopSlaveHadoopslave_connectTo9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HadoopSlaveHadoopslave_connectTo9CreationTool_title,
				Messages.HadoopSlaveHadoopslave_connectTo9CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HadoopSlaveHadoopslave_connectTo_4009));
		entry.setId("createHadoopSlaveHadoopslave_connectTo9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HadoopSlaveHadoopslave_connectTo_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHadoopSlaveHadoopslave_hostOn10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.HadoopSlaveHadoopslave_hostOn10CreationTool_title,
				Messages.HadoopSlaveHadoopslave_hostOn10CreationTool_desc,
				Collections
						.singletonList(HadoopStackElementTypes.HadoopSlaveHadoopslave_hostOn_4011));
		entry.setId("createHadoopSlaveHadoopslave_hostOn10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HadoopStackElementTypes
				.getImageDescriptor(HadoopStackElementTypes.HadoopSlaveHadoopslave_hostOn_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
