package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.edit.commands.HBaseMasterHbasemaster_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.HBaseMasterHbasemaster_hostOnReorientCommand;
import hadoopmodel.diagram.edit.commands.HBaseRegionServerHbaseregionserver_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.HBaseRegionServerHbaseregionserver_hostOnReorientCommand;
import hadoopmodel.diagram.edit.commands.HDFSDataNodeHdfsdatanode_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.HDFSDataNodeHdfsdatanode_hostOnReorientCommand;
import hadoopmodel.diagram.edit.commands.HDFSNameNodeHdfsnamenode_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.HDFSNameNodeHdfsnamenode_hostOnReorientCommand;
import hadoopmodel.diagram.edit.commands.JavaJava_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.JavaJava_hostOnReorientCommand;
import hadoopmodel.diagram.edit.parts.HBaseMasterHbasemaster_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HBaseRegionServerHbaseregionserver_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeHdfsnamenode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.JavaJava_hostOnEditPart;
import hadoopmodel.diagram.part.HadoopStackVisualIDRegistry;
import hadoopmodel.diagram.providers.HadoopStackElementTypes;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ServerItemSemanticEditPolicy extends
		HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServerItemSemanticEditPolicy() {
		super(HadoopStackElementTypes.Server_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == JavaJava_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == HBaseMasterHbasemaster_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == HBaseRegionServerHbaseregionserver_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.JavaJava_hostOn_4008 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.HBaseMasterHbasemaster_hostOn_4010 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001 == req
				.getElementType()) {
			return getGEFWrapper(new HDFSNameNodeHdfsnamenode_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.JavaJava_hostOn_4008 == req
				.getElementType()) {
			return getGEFWrapper(new JavaJava_hostOnCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.HBaseMasterHbasemaster_hostOn_4010 == req
				.getElementType()) {
			return getGEFWrapper(new HBaseMasterHbasemaster_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006 == req
				.getElementType()) {
			return getGEFWrapper(new HDFSDataNodeHdfsdatanode_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_hostOn_4012 == req
				.getElementType()) {
			return getGEFWrapper(new HBaseRegionServerHbaseregionserver_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new HDFSNameNodeHdfsnamenode_hostOnReorientCommand(
					req));
		case JavaJava_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new JavaJava_hostOnReorientCommand(req));
		case HBaseMasterHbasemaster_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new HBaseMasterHbasemaster_hostOnReorientCommand(
					req));
		case HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new HDFSDataNodeHdfsdatanode_hostOnReorientCommand(
					req));
		case HBaseRegionServerHbaseregionserver_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new HBaseRegionServerHbaseregionserver_hostOnReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
