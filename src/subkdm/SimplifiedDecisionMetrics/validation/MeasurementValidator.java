/**
 *
 * $Id$
 */
package subkdm.SimplifiedDecisionMetrics.validation;

import subkdm.SimplifiedDecisionMetrics.MofElement;

/**
 * A sample validator interface for {@link subkdm.SimplifiedDecisionMetrics.Measurement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MeasurementValidator {
	boolean validate();

	boolean validateMeasurant(MofElement value);
}
