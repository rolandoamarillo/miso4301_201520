/**
 */
package main.subkdm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reads</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.subkdm.Reads#getFrom <em>From</em>}</li>
 *   <li>{@link main.subkdm.Reads#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.subkdm.SubkdmPackage#getReads()
 * @model
 * @generated
 */
public interface Reads extends AbstractActionRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ActionElement)
	 * @see main.subkdm.SubkdmPackage#getReads_From()
	 * @model
	 * @generated
	 */
	ActionElement getFrom();

	/**
	 * Sets the value of the '{@link main.subkdm.Reads#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ActionElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(DataElement)
	 * @see main.subkdm.SubkdmPackage#getReads_To()
	 * @model
	 * @generated
	 */
	DataElement getTo();

	/**
	 * Sets the value of the '{@link main.subkdm.Reads#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(DataElement value);

} // Reads
