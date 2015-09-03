/**
 */
package main.SimplifiedDecisionMetrics;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.SimplifiedDecisionMetrics.Observation#getWhenObserved <em>When Observed</em>}</li>
 *   <li>{@link main.SimplifiedDecisionMetrics.Observation#getMeasures <em>Measures</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends EObject {
	/**
	 * Returns the value of the '<em><b>When Observed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Observed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Observed</em>' attribute.
	 * @see #setWhenObserved(Date)
	 * @see main.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getObservation_WhenObserved()
	 * @model
	 * @generated
	 */
	Date getWhenObserved();

	/**
	 * Sets the value of the '{@link main.SimplifiedDecisionMetrics.Observation#getWhenObserved <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Observed</em>' attribute.
	 * @see #getWhenObserved()
	 * @generated
	 */
	void setWhenObserved(Date value);

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
	 * The list contents are of type {@link main.SimplifiedDecisionMetrics.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' containment reference list.
	 * @see main.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getObservation_Measures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getMeasures();

} // Observation
