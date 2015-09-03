/**
 */
package main.SimplifiedDecisionMetrics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.SimplifiedDecisionMetrics.Measurement#getMeasurant <em>Measurant</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface Measurement extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link main.SimplifiedDecisionMetrics.MofElement#getMeasurant <em>Measurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurant</em>' reference.
	 * @see #setMeasurant(MofElement)
	 * @see main.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getMeasurement_Measurant()
	 * @see main.SimplifiedDecisionMetrics.MofElement#getMeasurant
	 * @model opposite="measurant"
	 * @generated
	 */
	MofElement getMeasurant();

	/**
	 * Sets the value of the '{@link main.SimplifiedDecisionMetrics.Measurement#getMeasurant <em>Measurant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurant</em>' reference.
	 * @see #getMeasurant()
	 * @generated
	 */
	void setMeasurant(MofElement value);

} // Measurement
