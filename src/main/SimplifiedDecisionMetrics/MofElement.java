/**
 */
package main.SimplifiedDecisionMetrics;

import main.subkdm.ModelElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mof Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.SimplifiedDecisionMetrics.MofElement#getMeasurant <em>Measurant</em>}</li>
 *   <li>{@link main.SimplifiedDecisionMetrics.MofElement#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getMofElement()
 * @model
 * @generated
 */
public interface MofElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurant</b></em>' reference list.
	 * The list contents are of type {@link main.SimplifiedDecisionMetrics.Measurement}.
	 * It is bidirectional and its opposite is '{@link main.SimplifiedDecisionMetrics.Measurement#getMeasurant <em>Measurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurant</em>' reference list.
	 * @see main.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getMofElement_Measurant()
	 * @see main.SimplifiedDecisionMetrics.Measurement#getMeasurant
	 * @model opposite="measurant"
	 * @generated
	 */
	EList<Measurement> getMeasurant();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ModelElement)
	 * @see main.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getMofElement_Element()
	 * @model
	 * @generated
	 */
	ModelElement getElement();

	/**
	 * Sets the value of the '{@link main.SimplifiedDecisionMetrics.MofElement#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ModelElement value);

} // MofElement
