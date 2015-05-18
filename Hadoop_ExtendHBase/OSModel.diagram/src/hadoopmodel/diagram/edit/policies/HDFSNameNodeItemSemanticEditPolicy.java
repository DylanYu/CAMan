package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.edit.commands.HBaseMasterHbasemaster_dependOnCreateCommand;
import hadoopmodel.diagram.edit.commands.HBaseMasterHbasemaster_dependOnReorientCommand;
import hadoopmodel.diagram.edit.commands.HDFSDataNodeHdfsdatanode_connectToCreateCommand;
import hadoopmodel.diagram.edit.commands.HDFSDataNodeHdfsdatanode_connectToReorientCommand;
import hadoopmodel.diagram.edit.commands.HDFSNameNodeHdfsnamenode_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.HDFSNameNodeHdfsnamenode_hostOnReorientCommand;
import hadoopmodel.diagram.edit.parts.HBaseMasterHbasemaster_dependOnEditPart;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_connectToEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeHdfsnamenode_hostOnEditPart;
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
public class HDFSNameNodeItemSemanticEditPolicy extends
		HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HDFSNameNodeItemSemanticEditPolicy() {
		super(HadoopStackElementTypes.HDFSNameNode_2005);
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
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == HBaseMasterHbasemaster_dependOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (HadoopStackVisualIDRegistry.getVisualID(outgoingLink) == HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
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
			return getGEFWrapper(new HDFSNameNodeHdfsnamenode_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.HBaseMasterHbasemaster_dependOn_4011 == req
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
			return null;
		}
		if (HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_connectTo_4005 == req
				.getElementType()) {
			return getGEFWrapper(new HDFSDataNodeHdfsdatanode_connectToCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.HBaseMasterHbasemaster_dependOn_4011 == req
				.getElementType()) {
			return getGEFWrapper(new HBaseMasterHbasemaster_dependOnCreateCommand(
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
		case HDFSDataNodeHdfsdatanode_connectToEditPart.VISUAL_ID:
			return getGEFWrapper(new HDFSDataNodeHdfsdatanode_connectToReorientCommand(
					req));
		case HBaseMasterHbasemaster_dependOnEditPart.VISUAL_ID:
			return getGEFWrapper(new HBaseMasterHbasemaster_dependOnReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
