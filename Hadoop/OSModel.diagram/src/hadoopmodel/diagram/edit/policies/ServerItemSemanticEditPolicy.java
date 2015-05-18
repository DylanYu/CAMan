package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.edit.commands.HDFSDataNodeHdfsdatanode_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.HDFSDataNodeHdfsdatanode_hostOnReorientCommand;
import hadoopmodel.diagram.edit.commands.HDFSNameNodeHdfsnamenode_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.HDFSNameNodeHdfsnamenode_hostOnReorientCommand;
import hadoopmodel.diagram.edit.commands.JavaJava_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.JavaJava_hostOnReorientCommand;
import hadoopmodel.diagram.edit.commands.JobTrackerJobtracker_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.JobTrackerJobtracker_hostOnReorientCommand;
import hadoopmodel.diagram.edit.commands.TaskTrackerTasktracker_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.TaskTrackerTasktracker_hostOnReorientCommand;
import hadoopmodel.diagram.edit.parts.HDFSDataNodeHdfsdatanode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.HDFSNameNodeHdfsnamenode_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.JavaJava_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerJobtracker_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerTasktracker_hostOnEditPart;
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
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == JobTrackerJobtracker_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == TaskTrackerTasktracker_hostOnEditPart.VISUAL_ID) {
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
		if (HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.JavaJava_hostOn_4008 == req
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
		if (HadoopStackElementTypes.HDFSDataNodeHdfsdatanode_hostOn_4006 == req
				.getElementType()) {
			return getGEFWrapper(new HDFSDataNodeHdfsdatanode_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003 == req
				.getElementType()) {
			return getGEFWrapper(new JobTrackerJobtracker_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.HDFSNameNodeHdfsnamenode_hostOn_4001 == req
				.getElementType()) {
			return getGEFWrapper(new HDFSNameNodeHdfsnamenode_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.TaskTrackerTasktracker_hostOn_4007 == req
				.getElementType()) {
			return getGEFWrapper(new TaskTrackerTasktracker_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.JavaJava_hostOn_4008 == req
				.getElementType()) {
			return getGEFWrapper(new JavaJava_hostOnCreateCommand(req,
					req.getSource(), req.getTarget()));
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
		case HDFSDataNodeHdfsdatanode_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new HDFSDataNodeHdfsdatanode_hostOnReorientCommand(
					req));
		case JobTrackerJobtracker_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new JobTrackerJobtracker_hostOnReorientCommand(
					req));
		case HDFSNameNodeHdfsnamenode_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new HDFSNameNodeHdfsnamenode_hostOnReorientCommand(
					req));
		case TaskTrackerTasktracker_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new TaskTrackerTasktracker_hostOnReorientCommand(
					req));
		case JavaJava_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new JavaJava_hostOnReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
