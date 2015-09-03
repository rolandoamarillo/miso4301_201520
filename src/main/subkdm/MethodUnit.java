/**
 */
package main.subkdm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.subkdm.MethodUnit#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.subkdm.SubkdmPackage#getMethodUnit()
 * @model
 * @generated
 */
public interface MethodUnit extends ControlElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link main.subkdm.CallableKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see main.subkdm.CallableKind
	 * @see #setKind(CallableKind)
	 * @see main.subkdm.SubkdmPackage#getMethodUnit_Kind()
	 * @model
	 * @generated
	 */
	CallableKind getKind();

	/**
	 * Sets the value of the '{@link main.subkdm.MethodUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see main.subkdm.CallableKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CallableKind value);

} // MethodUnit
