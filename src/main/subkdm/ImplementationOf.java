/**
 */
package main.subkdm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.subkdm.ImplementationOf#getTo <em>To</em>}</li>
 *   <li>{@link main.subkdm.ImplementationOf#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.subkdm.SubkdmPackage#getImplementationOf()
 * @model
 * @generated
 */
public interface ImplementationOf extends AbstractCodeRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CodeItem)
	 * @see main.subkdm.SubkdmPackage#getImplementationOf_To()
	 * @model
	 * @generated
	 */
	CodeItem getTo();

	/**
	 * Sets the value of the '{@link main.subkdm.ImplementationOf#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CodeItem value);

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
	 * @see main.subkdm.SubkdmPackage#getImplementationOf_From()
	 * @model
	 * @generated
	 */
	CodeItem getFrom();

	/**
	 * Sets the value of the '{@link main.subkdm.ImplementationOf#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(CodeItem value);

} // ImplementationOf
