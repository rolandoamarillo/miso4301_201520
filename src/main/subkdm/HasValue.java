/**
 */
package main.subkdm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.subkdm.HasValue#getFrom <em>From</em>}</li>
 *   <li>{@link main.subkdm.HasValue#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.subkdm.SubkdmPackage#getHasValue()
 * @model
 * @generated
 */
public interface HasValue extends AbstractCodeRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(CodeItem)
	 * @see main.subkdm.SubkdmPackage#getHasValue_From()
	 * @model
	 * @generated
	 */
	CodeItem getFrom();

	/**
	 * Sets the value of the '{@link main.subkdm.HasValue#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(CodeItem value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(AbstractCodeElement)
	 * @see main.subkdm.SubkdmPackage#getHasValue_To()
	 * @model
	 * @generated
	 */
	AbstractCodeElement getTo();

	/**
	 * Sets the value of the '{@link main.subkdm.HasValue#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AbstractCodeElement value);

} // HasValue
