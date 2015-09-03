/**
 */
package main.subkdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Code Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link main.subkdm.AbstractCodeElement#getCodeRelation <em>Code Relation</em>}</li>
 *   <li>{@link main.subkdm.AbstractCodeElement#getComment <em>Comment</em>}</li>
 *   <li>{@link main.subkdm.AbstractCodeElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see main.subkdm.SubkdmPackage#getAbstractCodeElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCodeElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Code Relation</b></em>' containment reference list.
	 * The list contents are of type {@link main.subkdm.AbstractCodeRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Relation</em>' containment reference list.
	 * @see main.subkdm.SubkdmPackage#getAbstractCodeElement_CodeRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCodeRelationship> getCodeRelation();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link main.subkdm.CommentUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see main.subkdm.SubkdmPackage#getAbstractCodeElement_Comment()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommentUnit> getComment();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see main.subkdm.SubkdmPackage#getAbstractCodeElement_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link main.subkdm.AbstractCodeElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractCodeElement
