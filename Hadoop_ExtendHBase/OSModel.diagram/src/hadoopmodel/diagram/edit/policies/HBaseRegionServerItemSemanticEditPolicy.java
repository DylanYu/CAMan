package hadoopmodel.diagram.edit.policies;

import hadoopmodel.diagram.edit.commands.HBaseRegionServerHbaseregionserver_connectToCreateCommand;
import hadoopmodel.diagram.edit.commands.HBaseRegionServerHbaseregionserver_connectToReorientCommand;
import hadoopmodel.diagram.edit.commands.HBaseRegionServerHbaseregionserver_hostOnCreateCommand;
import hadoopmodel.diagram.edit.commands.HBaseRegionServerHbaseregionserver_hostOnReorientCommand;
import hadoopmodel.diagram.edit.parts.HBaseRegionServerHbaseregionserver_connectToEditPart;
import hadoopmodel.diagram.edit.parts.HBaseRegionServerHbaseregionserver_hostOnEditPart;
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
public class HBaseRegionServerItemSemanticEditPolicy extends
		HadoopStackBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HBaseRegionServerItemSemanticEditPolicy() {
		super(HadoopStackElementTypes.HBaseRegionServer_2008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (HadoopStackVisualIDRegistry.getVisualID(outgoingLink) == HBaseRegionServerHbaseregionserver_connectToEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (HadoopStackVisualIDRegistry.getVisualID(outgoingLink) == HBaseRegionServerHbaseregionserver_hostOnEditPart.VISUAL_ID) {
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
		if (HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_connectTo_4009 == req
				.getElementType()) {
			return getGEFWrapper(new HBaseRegionServerHbaseregionserver_connectToCreateCommand(
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
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (HadoopStackElementTypes.HBaseRegionServerHbaseregionserver_connectTo_4009 == req
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
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case HBaseRegionServerHbaseregionserver_connectToEditPart.VISUAL_ID:
			return getGEFWrapper(new HBaseRegionServerHbaseregionserver_connectToReorientCommand(
					req));
		case HBaseRegionServerHbaseregionserver_hostOnEditPart.VISUAL_ID:
			return getGEFWrapper(new HBaseRegionServerHbaseregionserver_hostOnReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
