/**
 */
package main.subkdm.impl;

import java.util.Collection;

import main.subkdm.ClassUnit;
import main.subkdm.CodeItem;
import main.subkdm.SubkdmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link main.subkdm.impl.ClassUnitImpl#getCodeElement <em>Code Element</em>}</li>
 *   <li>{@link main.subkdm.impl.ClassUnitImpl#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassUnitImpl extends DataTypeImpl implements ClassUnit {
	/**
	 * The cached value of the '{@link #getCodeElement() <em>Code Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeItem> codeElement;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubkdmPackage.Literals.CLASS_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeItem> getCodeElement() {
		if (codeElement == null) {
			codeElement = new EObjectContainmentEList<CodeItem>(CodeItem.class, this, SubkdmPackage.CLASS_UNIT__CODE_ELEMENT);
		}
		return codeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubkdmPackage.CLASS_UNIT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SubkdmPackage.CLASS_UNIT__CODE_ELEMENT:
				return ((InternalEList<?>)getCodeElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubkdmPackage.CLASS_UNIT__CODE_ELEMENT:
				return getCodeElement();
			case SubkdmPackage.CLASS_UNIT__IS_ABSTRACT:
				return isIsAbstract();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SubkdmPackage.CLASS_UNIT__CODE_ELEMENT:
				getCodeElement().clear();
				getCodeElement().addAll((Collection<? extends CodeItem>)newValue);
				return;
			case SubkdmPackage.CLASS_UNIT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SubkdmPackage.CLASS_UNIT__CODE_ELEMENT:
				getCodeElement().clear();
				return;
			case SubkdmPackage.CLASS_UNIT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SubkdmPackage.CLASS_UNIT__CODE_ELEMENT:
				return codeElement != null && !codeElement.isEmpty();
			case SubkdmPackage.CLASS_UNIT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassUnitImpl
