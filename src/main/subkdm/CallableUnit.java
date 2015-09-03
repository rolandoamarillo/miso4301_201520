/**
 */
package main.subkdm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.subkdm.CallableUnit#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.subkdm.SubkdmPackage#getCallableUnit()
 * @model
 * @generated
 */
public interface CallableUnit extends ControlElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link main.subkdm.MethoKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see main.subkdm.MethoKind
	 * @see #setKind(MethoKind)
	 * @see main.subkdm.SubkdmPackage#getCallableUnit_Kind()
	 * @model
	 * @generated
	 */
	MethoKind getKind();

	/**
	 * Sets the value of the '{@link main.subkdm.CallableUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see main.subkdm.MethoKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MethoKind value);

} // CallableUnit
