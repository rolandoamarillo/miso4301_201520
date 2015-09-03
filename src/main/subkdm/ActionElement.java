/**
 */
package main.subkdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.subkdm.ActionElement#getKind <em>Kind</em>}</li>
 *   <li>{@link main.subkdm.ActionElement#getCodeElement <em>Code Element</em>}</li>
 *   <li>{@link main.subkdm.ActionElement#getActionRelation <em>Action Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.subkdm.SubkdmPackage#getActionElement()
 * @model
 * @generated
 */
public interface ActionElement extends AbstractCodeElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see main.subkdm.SubkdmPackage#getActionElement_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link main.subkdm.ActionElement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link main.subkdm.AbstractCodeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see main.subkdm.SubkdmPackage#getActionElement_CodeElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCodeElement> getCodeElement();

	/**
	 * Returns the value of the '<em><b>Action Relation</b></em>' containment reference list.
	 * The list contents are of type {@link main.subkdm.AbstractActionRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Relation</em>' containment reference list.
	 * @see main.subkdm.SubkdmPackage#getActionElement_ActionRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractActionRelationship> getActionRelation();

} // ActionElement
