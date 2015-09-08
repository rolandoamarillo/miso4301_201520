/**
 *
 * $Id$
 */
package subkdm.kdmObjects.validation;

import org.eclipse.emf.common.util.EList;

import subkdm.kdmObjects.AbstractCodeElement;

import subkdm.kdmRelations.AbstractActionRelationship;

/**
 * A sample validator interface for {@link subkdm.kdmObjects.ActionElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActionElementValidator {
	boolean validate();

	boolean validateKind(String value);
	boolean validateCodeElement(EList<AbstractCodeElement> value);
	boolean validateActionRelation(EList<AbstractActionRelationship> value);
}