package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.edit.commands.JobTrackerJobtracker_dependOnCreateCommand;
import hadoopmodel.diagram.edit.commands.JobTrackerJobtracker_dependOnReorientCommand;
import hadoopmodel.diagram.edit.commands.JobTrackerJobtracker_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.JobTrackerJobtracker_hostOnReorientCommand;
import hadoopmodel.diagram.edit.commands.TaskTrackerTasktracker_connectToCreateCommand;
import hadoopmodel.diagram.edit.commands.TaskTrackerTasktracker_connectToReorientCommand;
import hadoopmodel.diagram.edit.parts.JobTrackerJobtracker_dependOnEditPart;
import hadoopmodel.diagram.edit.parts.JobTrackerJobtracker_hostOnEditPart;
import hadoopmodel.diagram.edit.parts.TaskTrackerTasktracker_connectToEditPart;
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
public class JobTrackerItemSemanticEditPolicy extends
		HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JobTrackerItemSemanticEditPolicy() {
		super(HadoopStackElementTypes.JobTracker_2002);
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
			if (HadoopStackVisualIDRegistry.getVisualID(incomingLink) == TaskTrackerTasktracker_connectToEditPart.VISUAL_ID) {
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
			if (HadoopStackVisualIDRegistry.getVisualID(outgoingLink) == JobTrackerJobtracker_hostOnEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(outgoingLink) == JobTrackerJobtracker_dependOnEditPart.VISUAL_ID) {
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
		if (HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003 == req
				.getElementType()) {
			return getGEFWrapper(new JobTrackerJobtracker_hostOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002 == req
				.getElementType()) {
			return getGEFWrapper(new JobTrackerJobtracker_dependOnCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (HadoopStackElementTypes.JobTrackerJobtracker_hostOn_4003 == req
				.getElementType()) {
			return null;
		}
		if (HadoopStackElementTypes.TaskTrackerTasktracker_connectTo_4004 == req
				.getElementType()) {
			return getGEFWrapper(new TaskTrackerTasktracker_connectToCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (HadoopStackElementTypes.JobTrackerJobtracker_dependOn_4002 == req
				.getElementType()) {
			return null;
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
		case JobTrackerJobtracker_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new JobTrackerJobtracker_hostOnReorientCommand(
					req));
		case TaskTrackerTasktracker_connectToEditPart.VISUAL_ID:
			return getGEFWrapper(new TaskTrackerTasktracker_connectToReorientCommand(
					req));
		case JobTrackerJobtracker_dependOnEditPart.VISUAL_ID:
			return getGEFWrapper(new JobTrackerJobtracker_dependOnReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
