/*
* 
*/
package AGSN.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import AGSN.diagram.providers.AGSNElementTypes;

/**
 * @generated
 */
public class AdditionalLinkItemSemanticEditPolicy extends AGSNBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AdditionalLinkItemSemanticEditPolicy() {
		super(AGSNElementTypes.AdditionalLink_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
