package osmodel.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import osmodel.diagram.providers.OSModelElementTypes;

/**
 * @generated
 */
public class OSModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createOsmodel1Group());
	}

	/**
	 * Creates "osmodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createOsmodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Osmodel1Group_title);
		paletteContainer.setId("createOsmodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createServerWrap1CreationTool());
		paletteContainer.add(createWebWrap2CreationTool());
		paletteContainer.add(createSoftwareSoftware_hostOn3CreationTool());
		paletteContainer.add(createWebWrapWeb_dependOn4CreationTool());
		paletteContainer.add(createWebWrapWeb_connectTo5CreationTool());
		paletteContainer.add(createPHPWrap6CreationTool());
		paletteContainer.add(createSoftwareSoftware_hostOn27CreationTool());
		paletteContainer.add(createPHPWrapPhp_dependOn8CreationTool());
		paletteContainer.add(createApacheWrap9CreationTool());
		paletteContainer.add(createSoftwareSoftware_hostOn310CreationTool());
		paletteContainer.add(createMySQLWrap11CreationTool());
		paletteContainer.add(createSoftwareSoftware_hostOn412CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServerWrap1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ServerWrap1CreationTool_title,
				Messages.ServerWrap1CreationTool_desc,
				Collections.singletonList(OSModelElementTypes.ServerWrap_2002));
		entry.setId("createServerWrap1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OSModelElementTypes
				.getImageDescriptor(OSModelElementTypes.ServerWrap_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWebWrap2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.WebWrap2CreationTool_title,
				Messages.WebWrap2CreationTool_desc,
				Collections.singletonList(OSModelElementTypes.WebWrap_2001));
		entry.setId("createWebWrap2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OSModelElementTypes
				.getImageDescriptor(OSModelElementTypes.WebWrap_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftwareSoftware_hostOn3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.SoftwareSoftware_hostOn3CreationTool_title,
				Messages.SoftwareSoftware_hostOn3CreationTool_desc,
				Collections
						.singletonList(OSModelElementTypes.SoftwareSoftware_hostOn_4006));
		entry.setId("createSoftwareSoftware_hostOn3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OSModelElementTypes
				.getImageDescriptor(OSModelElementTypes.SoftwareSoftware_hostOn_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWebWrapWeb_dependOn4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.WebWrapWeb_dependOn4CreationTool_title,
				Messages.WebWrapWeb_dependOn4CreationTool_desc,
				Collections
						.singletonList(OSModelElementTypes.WebWrapWeb_dependOn_4007));
		entry.setId("createWebWrapWeb_dependOn4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OSModelElementTypes
				.getImageDescriptor(OSModelElementTypes.WebWrapWeb_dependOn_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWebWrapWeb_connectTo5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.WebWrapWeb_connectTo5CreationTool_title,
				Messages.WebWrapWeb_connectTo5CreationTool_desc,
				Collections
						.singletonList(OSModelElementTypes.WebWrapWeb_connectTo_4004));
		entry.setId("createWebWrapWeb_connectTo5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OSModelElementTypes
				.getImageDescriptor(OSModelElementTypes.WebWrapWeb_connectTo_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPHPWrap6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.PHPWrap6CreationTool_title,
				Messages.PHPWrap6CreationTool_desc,
				Collections.singletonList(OSModelElementTypes.PHPWrap_2003));
		entry.setId("createPHPWrap6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OSModelElementTypes
				.getImageDescriptor(OSModelElementTypes.PHPWrap_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftwareSoftware_hostOn27CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SoftwareSoftware_hostOn27CreationTool_title,
				Messages.SoftwareSoftware_hostOn27CreationTool_desc, null, null) {
		};
		entry.setId("createSoftwareSoftware_hostOn27CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPHPWrapPhp_dependOn8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.PHPWrapPhp_dependOn8CreationTool_title,
				Messages.PHPWrapPhp_dependOn8CreationTool_desc,
				Collections
						.singletonList(OSModelElementTypes.PHPWrapPhp_dependOn_4009));
		entry.setId("createPHPWrapPhp_dependOn8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OSModelElementTypes
				.getImageDescriptor(OSModelElementTypes.PHPWrapPhp_dependOn_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createApacheWrap9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ApacheWrap9CreationTool_title,
				Messages.ApacheWrap9CreationTool_desc,
				Collections.singletonList(OSModelElementTypes.ApacheWrap_2004));
		entry.setId("createApacheWrap9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OSModelElementTypes
				.getImageDescriptor(OSModelElementTypes.ApacheWrap_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftwareSoftware_hostOn310CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SoftwareSoftware_hostOn310CreationTool_title,
				Messages.SoftwareSoftware_hostOn310CreationTool_desc, null,
				null) {
		};
		entry.setId("createSoftwareSoftware_hostOn310CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMySQLWrap11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MySQLWrap11CreationTool_title,
				Messages.MySQLWrap11CreationTool_desc,
				Collections.singletonList(OSModelElementTypes.MySQLWrap_2005));
		entry.setId("createMySQLWrap11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(OSModelElementTypes
				.getImageDescriptor(OSModelElementTypes.MySQLWrap_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftwareSoftware_hostOn412CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SoftwareSoftware_hostOn412CreationTool_title,
				Messages.SoftwareSoftware_hostOn412CreationTool_desc, null,
				null) {
		};
		entry.setId("createSoftwareSoftware_hostOn412CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
