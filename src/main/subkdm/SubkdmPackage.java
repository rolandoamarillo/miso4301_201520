/**
 */
package main.subkdm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see main.subkdm.SubkdmFactory
 * @model kind="package"
 * @generated
 */
public interface SubkdmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subkdm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://subkdm/subkdm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "h";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubkdmPackage eINSTANCE = main.subkdm.impl.SubkdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ModelElementImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 37;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.CodeModelImpl <em>Code Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.CodeModelImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getCodeModel()
	 * @generated
	 */
	int CODE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__CODE_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__NAME = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Code Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.AbstractCodeElementImpl <em>Abstract Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.AbstractCodeElementImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getAbstractCodeElement()
	 * @generated
	 */
	int ABSTRACT_CODE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__CODE_RELATION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__COMMENT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.AbstractCodeRelationshipImpl <em>Abstract Code Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.AbstractCodeRelationshipImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getAbstractCodeRelationship()
	 * @generated
	 */
	int ABSTRACT_CODE_RELATIONSHIP = 2;

	/**
	 * The number of structural features of the '<em>Abstract Code Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Code Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.CodeItemImpl <em>Code Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.CodeItemImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getCodeItem()
	 * @generated
	 */
	int CODE_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__CODE_RELATION = ABSTRACT_CODE_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__COMMENT = ABSTRACT_CODE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__NAME = ABSTRACT_CODE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Code Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM_FEATURE_COUNT = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM_OPERATION_COUNT = ABSTRACT_CODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ModuleImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 4;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = CODE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CODE_ELEMENT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = CODE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.PackageImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CODE_RELATION = MODULE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMMENT = MODULE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CODE_ELEMENT = MODULE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.DataTypeImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CODE_ITEM__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CODE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ClassUnitImpl <em>Class Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ClassUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getClassUnit()
	 * @generated
	 */
	int CLASS_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__CODE_RELATION = DATA_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__CODE_ELEMENT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__IS_ABSTRACT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.InterfaceUnitImpl <em>Interface Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.InterfaceUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getInterfaceUnit()
	 * @generated
	 */
	int INTERFACE_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__CODE_RELATION = DATA_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__CODE_ELEMENT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ComputationalObjectImpl <em>Computational Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ComputationalObjectImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getComputationalObject()
	 * @generated
	 */
	int COMPUTATIONAL_OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__NAME = CODE_ITEM__NAME;

	/**
	 * The number of structural features of the '<em>Computational Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computational Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT_OPERATION_COUNT = CODE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ControlElementImpl <em>Control Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ControlElementImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getControlElement()
	 * @generated
	 */
	int CONTROL_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__CODE_RELATION = COMPUTATIONAL_OBJECT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__COMMENT = COMPUTATIONAL_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__NAME = COMPUTATIONAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__CODE_ELEMENT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__TYPE = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT_FEATURE_COUNT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT_OPERATION_COUNT = COMPUTATIONAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.CallableUnitImpl <em>Callable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.CallableUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getCallableUnit()
	 * @generated
	 */
	int CALLABLE_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__CODE_RELATION = CONTROL_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__COMMENT = CONTROL_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__NAME = CONTROL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__CODE_ELEMENT = CONTROL_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__TYPE = CONTROL_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__KIND = CONTROL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Callable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Callable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT_OPERATION_COUNT = CONTROL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.MethodUnitImpl <em>Method Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.MethodUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getMethodUnit()
	 * @generated
	 */
	int METHOD_UNIT = 12;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__CODE_RELATION = CONTROL_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__COMMENT = CONTROL_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__NAME = CONTROL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__CODE_ELEMENT = CONTROL_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__TYPE = CONTROL_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__KIND = CONTROL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT_OPERATION_COUNT = CONTROL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.DataElementImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CODE_RELATION = COMPUTATIONAL_OBJECT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__COMMENT = COMPUTATIONAL_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NAME = COMPUTATIONAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CODE_ELEMENT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__TYPE = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__EXT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SIZE = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_OPERATION_COUNT = COMPUTATIONAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.StorableUnitImpl <em>Storable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.StorableUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getStorableUnit()
	 * @generated
	 */
	int STORABLE_UNIT = 14;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__KIND = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.CommentUnitImpl <em>Comment Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.CommentUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getCommentUnit()
	 * @generated
	 */
	int COMMENT_UNIT = 15;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Comment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ImportsImpl <em>Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ImportsImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getImports()
	 * @generated
	 */
	int IMPORTS = 16;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ImplementsImpl <em>Implements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ImplementsImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getImplements()
	 * @generated
	 */
	int IMPLEMENTS = 17;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ExtendsImpl <em>Extends</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ExtendsImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getExtends()
	 * @generated
	 */
	int EXTENDS = 18;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ParameterUnitImpl <em>Parameter Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ParameterUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getParameterUnit()
	 * @generated
	 */
	int PARAMETER_UNIT = 19;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__KIND = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__POS = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.TemplateUnitImpl <em>Template Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.TemplateUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getTemplateUnit()
	 * @generated
	 */
	int TEMPLATE_UNIT = 20;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__CODE_RELATION = DATA_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__CODE_ELEMENT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.CodeUnitImpl <em>Code Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.CodeUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getCodeUnit()
	 * @generated
	 */
	int CODE_UNIT = 21;

	/**
	 * The number of structural features of the '<em>Code Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Code Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.SignatureImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 22;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__CODE_RELATION = DATA_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETER_UNIT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ImplementationOfImpl <em>Implementation Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ImplementationOfImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getImplementationOf()
	 * @generated
	 */
	int IMPLEMENTATION_OF = 23;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implementation Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Implementation Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.HasValueImpl <em>Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.HasValueImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getHasValue()
	 * @generated
	 */
	int HAS_VALUE = 24;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__FROM = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__TO = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ActionElementImpl <em>Action Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ActionElementImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getActionElement()
	 * @generated
	 */
	int ACTION_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__CODE_RELATION = ABSTRACT_CODE_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__COMMENT = ABSTRACT_CODE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__NAME = ABSTRACT_CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__KIND = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__CODE_ELEMENT = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__ACTION_RELATION = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_FEATURE_COUNT = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_OPERATION_COUNT = ABSTRACT_CODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.BlockUnitImpl <em>Block Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.BlockUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getBlockUnit()
	 * @generated
	 */
	int BLOCK_UNIT = 26;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__CODE_RELATION = ACTION_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__COMMENT = ACTION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__NAME = ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__KIND = ACTION_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__CODE_ELEMENT = ACTION_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__ACTION_RELATION = ACTION_ELEMENT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Block Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT_FEATURE_COUNT = ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT_OPERATION_COUNT = ACTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ExceptionUnitImpl <em>Exception Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ExceptionUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getExceptionUnit()
	 * @generated
	 */
	int EXCEPTION_UNIT = 27;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__CODE_RELATION = BLOCK_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__COMMENT = BLOCK_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__NAME = BLOCK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__KIND = BLOCK_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__CODE_ELEMENT = BLOCK_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__ACTION_RELATION = BLOCK_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Exception Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT_FEATURE_COUNT = BLOCK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exception Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT_OPERATION_COUNT = BLOCK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.TryUnitImpl <em>Try Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.TryUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getTryUnit()
	 * @generated
	 */
	int TRY_UNIT = 28;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__CODE_RELATION = EXCEPTION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__COMMENT = EXCEPTION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__NAME = EXCEPTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__KIND = EXCEPTION_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__CODE_ELEMENT = EXCEPTION_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__ACTION_RELATION = EXCEPTION_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Try Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT_FEATURE_COUNT = EXCEPTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Try Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT_OPERATION_COUNT = EXCEPTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.CatchUnitImpl <em>Catch Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.CatchUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getCatchUnit()
	 * @generated
	 */
	int CATCH_UNIT = 29;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__CODE_RELATION = EXCEPTION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__COMMENT = EXCEPTION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__NAME = EXCEPTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__KIND = EXCEPTION_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__CODE_ELEMENT = EXCEPTION_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__ACTION_RELATION = EXCEPTION_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Catch Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT_FEATURE_COUNT = EXCEPTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catch Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT_OPERATION_COUNT = EXCEPTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.FinallyUnitImpl <em>Finally Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.FinallyUnitImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getFinallyUnit()
	 * @generated
	 */
	int FINALLY_UNIT = 30;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__CODE_RELATION = EXCEPTION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__COMMENT = EXCEPTION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__NAME = EXCEPTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__KIND = EXCEPTION_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__CODE_ELEMENT = EXCEPTION_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__ACTION_RELATION = EXCEPTION_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Finally Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT_FEATURE_COUNT = EXCEPTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Finally Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT_OPERATION_COUNT = EXCEPTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.AbstractActionRelationshipImpl <em>Abstract Action Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.AbstractActionRelationshipImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getAbstractActionRelationship()
	 * @generated
	 */
	int ABSTRACT_ACTION_RELATIONSHIP = 31;

	/**
	 * The number of structural features of the '<em>Abstract Action Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Action Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.CallsImpl <em>Calls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.CallsImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getCalls()
	 * @generated
	 */
	int CALLS = 32;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Calls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_OPERATION_COUNT = ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.ReadsImpl <em>Reads</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.ReadsImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getReads()
	 * @generated
	 */
	int READS = 33;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_OPERATION_COUNT = ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.WritesImpl <em>Writes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.WritesImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getWrites()
	 * @generated
	 */
	int WRITES = 34;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Writes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Writes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_OPERATION_COUNT = ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.CreatesImpl <em>Creates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.CreatesImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getCreates()
	 * @generated
	 */
	int CREATES = 35;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__FROM = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__TO = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Creates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Creates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES_OPERATION_COUNT = ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.impl.SegmentImpl
	 * @see main.subkdm.impl.SubkdmPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 36;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link main.subkdm.MethoKind <em>Metho Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.MethoKind
	 * @see main.subkdm.impl.SubkdmPackageImpl#getMethoKind()
	 * @generated
	 */
	int METHO_KIND = 38;

	/**
	 * The meta object id for the '{@link main.subkdm.CallableKind <em>Callable Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.CallableKind
	 * @see main.subkdm.impl.SubkdmPackageImpl#getCallableKind()
	 * @generated
	 */
	int CALLABLE_KIND = 39;

	/**
	 * The meta object id for the '{@link main.subkdm.StorableKind <em>Storable Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.StorableKind
	 * @see main.subkdm.impl.SubkdmPackageImpl#getStorableKind()
	 * @generated
	 */
	int STORABLE_KIND = 40;

	/**
	 * The meta object id for the '{@link main.subkdm.ExportKind <em>Export Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.ExportKind
	 * @see main.subkdm.impl.SubkdmPackageImpl#getExportKind()
	 * @generated
	 */
	int EXPORT_KIND = 41;

	/**
	 * The meta object id for the '{@link main.subkdm.ParameterKind <em>Parameter Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see main.subkdm.ParameterKind
	 * @see main.subkdm.impl.SubkdmPackageImpl#getParameterKind()
	 * @generated
	 */
	int PARAMETER_KIND = 42;


	/**
	 * Returns the meta object for class '{@link main.subkdm.CodeModel <em>Code Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Model</em>'.
	 * @see main.subkdm.CodeModel
	 * @generated
	 */
	EClass getCodeModel();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.CodeModel#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see main.subkdm.CodeModel#getCodeElement()
	 * @see #getCodeModel()
	 * @generated
	 */
	EReference getCodeModel_CodeElement();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.CodeModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see main.subkdm.CodeModel#getName()
	 * @see #getCodeModel()
	 * @generated
	 */
	EAttribute getCodeModel_Name();

	/**
	 * Returns the meta object for class '{@link main.subkdm.AbstractCodeElement <em>Abstract Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Code Element</em>'.
	 * @see main.subkdm.AbstractCodeElement
	 * @generated
	 */
	EClass getAbstractCodeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.AbstractCodeElement#getCodeRelation <em>Code Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Relation</em>'.
	 * @see main.subkdm.AbstractCodeElement#getCodeRelation()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EReference getAbstractCodeElement_CodeRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.AbstractCodeElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see main.subkdm.AbstractCodeElement#getComment()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EReference getAbstractCodeElement_Comment();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.AbstractCodeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see main.subkdm.AbstractCodeElement#getName()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EAttribute getAbstractCodeElement_Name();

	/**
	 * Returns the meta object for class '{@link main.subkdm.AbstractCodeRelationship <em>Abstract Code Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Code Relationship</em>'.
	 * @see main.subkdm.AbstractCodeRelationship
	 * @generated
	 */
	EClass getAbstractCodeRelationship();

	/**
	 * Returns the meta object for class '{@link main.subkdm.CodeItem <em>Code Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Item</em>'.
	 * @see main.subkdm.CodeItem
	 * @generated
	 */
	EClass getCodeItem();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see main.subkdm.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.Module#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see main.subkdm.Module#getCodeElement()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_CodeElement();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see main.subkdm.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link main.subkdm.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see main.subkdm.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link main.subkdm.ClassUnit <em>Class Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Unit</em>'.
	 * @see main.subkdm.ClassUnit
	 * @generated
	 */
	EClass getClassUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.ClassUnit#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see main.subkdm.ClassUnit#getCodeElement()
	 * @see #getClassUnit()
	 * @generated
	 */
	EReference getClassUnit_CodeElement();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.ClassUnit#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see main.subkdm.ClassUnit#isIsAbstract()
	 * @see #getClassUnit()
	 * @generated
	 */
	EAttribute getClassUnit_IsAbstract();

	/**
	 * Returns the meta object for class '{@link main.subkdm.InterfaceUnit <em>Interface Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Unit</em>'.
	 * @see main.subkdm.InterfaceUnit
	 * @generated
	 */
	EClass getInterfaceUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.InterfaceUnit#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see main.subkdm.InterfaceUnit#getCodeElement()
	 * @see #getInterfaceUnit()
	 * @generated
	 */
	EReference getInterfaceUnit_CodeElement();

	/**
	 * Returns the meta object for class '{@link main.subkdm.ComputationalObject <em>Computational Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computational Object</em>'.
	 * @see main.subkdm.ComputationalObject
	 * @generated
	 */
	EClass getComputationalObject();

	/**
	 * Returns the meta object for class '{@link main.subkdm.ControlElement <em>Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Element</em>'.
	 * @see main.subkdm.ControlElement
	 * @generated
	 */
	EClass getControlElement();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.ControlElement#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see main.subkdm.ControlElement#getCodeElement()
	 * @see #getControlElement()
	 * @generated
	 */
	EReference getControlElement_CodeElement();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.ControlElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see main.subkdm.ControlElement#getType()
	 * @see #getControlElement()
	 * @generated
	 */
	EReference getControlElement_Type();

	/**
	 * Returns the meta object for class '{@link main.subkdm.CallableUnit <em>Callable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Unit</em>'.
	 * @see main.subkdm.CallableUnit
	 * @generated
	 */
	EClass getCallableUnit();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.CallableUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see main.subkdm.CallableUnit#getKind()
	 * @see #getCallableUnit()
	 * @generated
	 */
	EAttribute getCallableUnit_Kind();

	/**
	 * Returns the meta object for class '{@link main.subkdm.MethodUnit <em>Method Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Unit</em>'.
	 * @see main.subkdm.MethodUnit
	 * @generated
	 */
	EClass getMethodUnit();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.MethodUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see main.subkdm.MethodUnit#getKind()
	 * @see #getMethodUnit()
	 * @generated
	 */
	EAttribute getMethodUnit_Kind();

	/**
	 * Returns the meta object for class '{@link main.subkdm.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see main.subkdm.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.DataElement#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see main.subkdm.DataElement#getCodeElement()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_CodeElement();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.DataElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see main.subkdm.DataElement#getType()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.DataElement#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see main.subkdm.DataElement#getExt()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Ext();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.DataElement#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see main.subkdm.DataElement#getSize()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Size();

	/**
	 * Returns the meta object for class '{@link main.subkdm.StorableUnit <em>Storable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storable Unit</em>'.
	 * @see main.subkdm.StorableUnit
	 * @generated
	 */
	EClass getStorableUnit();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.StorableUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see main.subkdm.StorableUnit#getKind()
	 * @see #getStorableUnit()
	 * @generated
	 */
	EAttribute getStorableUnit_Kind();

	/**
	 * Returns the meta object for class '{@link main.subkdm.CommentUnit <em>Comment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Unit</em>'.
	 * @see main.subkdm.CommentUnit
	 * @generated
	 */
	EClass getCommentUnit();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.CommentUnit#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see main.subkdm.CommentUnit#getText()
	 * @see #getCommentUnit()
	 * @generated
	 */
	EAttribute getCommentUnit_Text();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imports</em>'.
	 * @see main.subkdm.Imports
	 * @generated
	 */
	EClass getImports();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Imports#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see main.subkdm.Imports#getFrom()
	 * @see #getImports()
	 * @generated
	 */
	EReference getImports_From();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Imports#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see main.subkdm.Imports#getTo()
	 * @see #getImports()
	 * @generated
	 */
	EReference getImports_To();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements</em>'.
	 * @see main.subkdm.Implements
	 * @generated
	 */
	EClass getImplements();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Implements#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see main.subkdm.Implements#getFrom()
	 * @see #getImplements()
	 * @generated
	 */
	EReference getImplements_From();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Implements#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see main.subkdm.Implements#getTo()
	 * @see #getImplements()
	 * @generated
	 */
	EReference getImplements_To();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Extends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extends</em>'.
	 * @see main.subkdm.Extends
	 * @generated
	 */
	EClass getExtends();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Extends#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see main.subkdm.Extends#getFrom()
	 * @see #getExtends()
	 * @generated
	 */
	EReference getExtends_From();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Extends#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see main.subkdm.Extends#getTo()
	 * @see #getExtends()
	 * @generated
	 */
	EReference getExtends_To();

	/**
	 * Returns the meta object for class '{@link main.subkdm.ParameterUnit <em>Parameter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Unit</em>'.
	 * @see main.subkdm.ParameterUnit
	 * @generated
	 */
	EClass getParameterUnit();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.ParameterUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see main.subkdm.ParameterUnit#getKind()
	 * @see #getParameterUnit()
	 * @generated
	 */
	EAttribute getParameterUnit_Kind();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.ParameterUnit#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see main.subkdm.ParameterUnit#getPos()
	 * @see #getParameterUnit()
	 * @generated
	 */
	EAttribute getParameterUnit_Pos();

	/**
	 * Returns the meta object for class '{@link main.subkdm.TemplateUnit <em>Template Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Unit</em>'.
	 * @see main.subkdm.TemplateUnit
	 * @generated
	 */
	EClass getTemplateUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.TemplateUnit#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see main.subkdm.TemplateUnit#getCodeElement()
	 * @see #getTemplateUnit()
	 * @generated
	 */
	EReference getTemplateUnit_CodeElement();

	/**
	 * Returns the meta object for class '{@link main.subkdm.CodeUnit <em>Code Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Unit</em>'.
	 * @see main.subkdm.CodeUnit
	 * @generated
	 */
	EClass getCodeUnit();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see main.subkdm.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.Signature#getParameterUnit <em>Parameter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Unit</em>'.
	 * @see main.subkdm.Signature#getParameterUnit()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ParameterUnit();

	/**
	 * Returns the meta object for class '{@link main.subkdm.ImplementationOf <em>Implementation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Of</em>'.
	 * @see main.subkdm.ImplementationOf
	 * @generated
	 */
	EClass getImplementationOf();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.ImplementationOf#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see main.subkdm.ImplementationOf#getTo()
	 * @see #getImplementationOf()
	 * @generated
	 */
	EReference getImplementationOf_To();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.ImplementationOf#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see main.subkdm.ImplementationOf#getFrom()
	 * @see #getImplementationOf()
	 * @generated
	 */
	EReference getImplementationOf_From();

	/**
	 * Returns the meta object for class '{@link main.subkdm.HasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Value</em>'.
	 * @see main.subkdm.HasValue
	 * @generated
	 */
	EClass getHasValue();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.HasValue#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see main.subkdm.HasValue#getFrom()
	 * @see #getHasValue()
	 * @generated
	 */
	EReference getHasValue_From();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.HasValue#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see main.subkdm.HasValue#getTo()
	 * @see #getHasValue()
	 * @generated
	 */
	EReference getHasValue_To();

	/**
	 * Returns the meta object for class '{@link main.subkdm.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Element</em>'.
	 * @see main.subkdm.ActionElement
	 * @generated
	 */
	EClass getActionElement();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.ActionElement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see main.subkdm.ActionElement#getKind()
	 * @see #getActionElement()
	 * @generated
	 */
	EAttribute getActionElement_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.ActionElement#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see main.subkdm.ActionElement#getCodeElement()
	 * @see #getActionElement()
	 * @generated
	 */
	EReference getActionElement_CodeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.ActionElement#getActionRelation <em>Action Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Relation</em>'.
	 * @see main.subkdm.ActionElement#getActionRelation()
	 * @see #getActionElement()
	 * @generated
	 */
	EReference getActionElement_ActionRelation();

	/**
	 * Returns the meta object for class '{@link main.subkdm.BlockUnit <em>Block Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Unit</em>'.
	 * @see main.subkdm.BlockUnit
	 * @generated
	 */
	EClass getBlockUnit();

	/**
	 * Returns the meta object for class '{@link main.subkdm.ExceptionUnit <em>Exception Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Unit</em>'.
	 * @see main.subkdm.ExceptionUnit
	 * @generated
	 */
	EClass getExceptionUnit();

	/**
	 * Returns the meta object for class '{@link main.subkdm.TryUnit <em>Try Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Unit</em>'.
	 * @see main.subkdm.TryUnit
	 * @generated
	 */
	EClass getTryUnit();

	/**
	 * Returns the meta object for class '{@link main.subkdm.CatchUnit <em>Catch Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Unit</em>'.
	 * @see main.subkdm.CatchUnit
	 * @generated
	 */
	EClass getCatchUnit();

	/**
	 * Returns the meta object for class '{@link main.subkdm.FinallyUnit <em>Finally Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finally Unit</em>'.
	 * @see main.subkdm.FinallyUnit
	 * @generated
	 */
	EClass getFinallyUnit();

	/**
	 * Returns the meta object for class '{@link main.subkdm.AbstractActionRelationship <em>Abstract Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Action Relationship</em>'.
	 * @see main.subkdm.AbstractActionRelationship
	 * @generated
	 */
	EClass getAbstractActionRelationship();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Calls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calls</em>'.
	 * @see main.subkdm.Calls
	 * @generated
	 */
	EClass getCalls();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Calls#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see main.subkdm.Calls#getFrom()
	 * @see #getCalls()
	 * @generated
	 */
	EReference getCalls_From();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Calls#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see main.subkdm.Calls#getTo()
	 * @see #getCalls()
	 * @generated
	 */
	EReference getCalls_To();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Reads <em>Reads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reads</em>'.
	 * @see main.subkdm.Reads
	 * @generated
	 */
	EClass getReads();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Reads#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see main.subkdm.Reads#getFrom()
	 * @see #getReads()
	 * @generated
	 */
	EReference getReads_From();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Reads#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see main.subkdm.Reads#getTo()
	 * @see #getReads()
	 * @generated
	 */
	EReference getReads_To();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Writes <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writes</em>'.
	 * @see main.subkdm.Writes
	 * @generated
	 */
	EClass getWrites();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Writes#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see main.subkdm.Writes#getFrom()
	 * @see #getWrites()
	 * @generated
	 */
	EReference getWrites_From();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Writes#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see main.subkdm.Writes#getTo()
	 * @see #getWrites()
	 * @generated
	 */
	EReference getWrites_To();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Creates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creates</em>'.
	 * @see main.subkdm.Creates
	 * @generated
	 */
	EClass getCreates();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Creates#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see main.subkdm.Creates#getFrom()
	 * @see #getCreates()
	 * @generated
	 */
	EReference getCreates_From();

	/**
	 * Returns the meta object for the reference '{@link main.subkdm.Creates#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see main.subkdm.Creates#getTo()
	 * @see #getCreates()
	 * @generated
	 */
	EReference getCreates_To();

	/**
	 * Returns the meta object for class '{@link main.subkdm.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see main.subkdm.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link main.subkdm.Segment#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see main.subkdm.Segment#getModel()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Model();

	/**
	 * Returns the meta object for the attribute '{@link main.subkdm.Segment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see main.subkdm.Segment#getName()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Name();

	/**
	 * Returns the meta object for class '{@link main.subkdm.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see main.subkdm.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for enum '{@link main.subkdm.MethoKind <em>Metho Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metho Kind</em>'.
	 * @see main.subkdm.MethoKind
	 * @generated
	 */
	EEnum getMethoKind();

	/**
	 * Returns the meta object for enum '{@link main.subkdm.CallableKind <em>Callable Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Callable Kind</em>'.
	 * @see main.subkdm.CallableKind
	 * @generated
	 */
	EEnum getCallableKind();

	/**
	 * Returns the meta object for enum '{@link main.subkdm.StorableKind <em>Storable Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storable Kind</em>'.
	 * @see main.subkdm.StorableKind
	 * @generated
	 */
	EEnum getStorableKind();

	/**
	 * Returns the meta object for enum '{@link main.subkdm.ExportKind <em>Export Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Export Kind</em>'.
	 * @see main.subkdm.ExportKind
	 * @generated
	 */
	EEnum getExportKind();

	/**
	 * Returns the meta object for enum '{@link main.subkdm.ParameterKind <em>Parameter Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Kind</em>'.
	 * @see main.subkdm.ParameterKind
	 * @generated
	 */
	EEnum getParameterKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubkdmFactory getSubkdmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link main.subkdm.impl.CodeModelImpl <em>Code Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.CodeModelImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getCodeModel()
		 * @generated
		 */
		EClass CODE_MODEL = eINSTANCE.getCodeModel();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_MODEL__CODE_ELEMENT = eINSTANCE.getCodeModel_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_MODEL__NAME = eINSTANCE.getCodeModel_Name();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.AbstractCodeElementImpl <em>Abstract Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.AbstractCodeElementImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getAbstractCodeElement()
		 * @generated
		 */
		EClass ABSTRACT_CODE_ELEMENT = eINSTANCE.getAbstractCodeElement();

		/**
		 * The meta object literal for the '<em><b>Code Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_ELEMENT__CODE_RELATION = eINSTANCE.getAbstractCodeElement_CodeRelation();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_ELEMENT__COMMENT = eINSTANCE.getAbstractCodeElement_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CODE_ELEMENT__NAME = eINSTANCE.getAbstractCodeElement_Name();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.AbstractCodeRelationshipImpl <em>Abstract Code Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.AbstractCodeRelationshipImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getAbstractCodeRelationship()
		 * @generated
		 */
		EClass ABSTRACT_CODE_RELATIONSHIP = eINSTANCE.getAbstractCodeRelationship();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.CodeItemImpl <em>Code Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.CodeItemImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getCodeItem()
		 * @generated
		 */
		EClass CODE_ITEM = eINSTANCE.getCodeItem();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ModuleImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CODE_ELEMENT = eINSTANCE.getModule_CodeElement();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.PackageImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.DataTypeImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ClassUnitImpl <em>Class Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ClassUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getClassUnit()
		 * @generated
		 */
		EClass CLASS_UNIT = eINSTANCE.getClassUnit();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_UNIT__CODE_ELEMENT = eINSTANCE.getClassUnit_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_UNIT__IS_ABSTRACT = eINSTANCE.getClassUnit_IsAbstract();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.InterfaceUnitImpl <em>Interface Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.InterfaceUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getInterfaceUnit()
		 * @generated
		 */
		EClass INTERFACE_UNIT = eINSTANCE.getInterfaceUnit();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_UNIT__CODE_ELEMENT = eINSTANCE.getInterfaceUnit_CodeElement();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ComputationalObjectImpl <em>Computational Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ComputationalObjectImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getComputationalObject()
		 * @generated
		 */
		EClass COMPUTATIONAL_OBJECT = eINSTANCE.getComputationalObject();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ControlElementImpl <em>Control Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ControlElementImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getControlElement()
		 * @generated
		 */
		EClass CONTROL_ELEMENT = eINSTANCE.getControlElement();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ELEMENT__CODE_ELEMENT = eINSTANCE.getControlElement_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ELEMENT__TYPE = eINSTANCE.getControlElement_Type();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.CallableUnitImpl <em>Callable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.CallableUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getCallableUnit()
		 * @generated
		 */
		EClass CALLABLE_UNIT = eINSTANCE.getCallableUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_UNIT__KIND = eINSTANCE.getCallableUnit_Kind();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.MethodUnitImpl <em>Method Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.MethodUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getMethodUnit()
		 * @generated
		 */
		EClass METHOD_UNIT = eINSTANCE.getMethodUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_UNIT__KIND = eINSTANCE.getMethodUnit_Kind();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.DataElementImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__CODE_ELEMENT = eINSTANCE.getDataElement_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__TYPE = eINSTANCE.getDataElement_Type();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__EXT = eINSTANCE.getDataElement_Ext();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__SIZE = eINSTANCE.getDataElement_Size();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.StorableUnitImpl <em>Storable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.StorableUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getStorableUnit()
		 * @generated
		 */
		EClass STORABLE_UNIT = eINSTANCE.getStorableUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORABLE_UNIT__KIND = eINSTANCE.getStorableUnit_Kind();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.CommentUnitImpl <em>Comment Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.CommentUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getCommentUnit()
		 * @generated
		 */
		EClass COMMENT_UNIT = eINSTANCE.getCommentUnit();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_UNIT__TEXT = eINSTANCE.getCommentUnit_Text();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ImportsImpl <em>Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ImportsImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getImports()
		 * @generated
		 */
		EClass IMPORTS = eINSTANCE.getImports();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTS__FROM = eINSTANCE.getImports_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTS__TO = eINSTANCE.getImports_To();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ImplementsImpl <em>Implements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ImplementsImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getImplements()
		 * @generated
		 */
		EClass IMPLEMENTS = eINSTANCE.getImplements();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS__FROM = eINSTANCE.getImplements_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS__TO = eINSTANCE.getImplements_To();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ExtendsImpl <em>Extends</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ExtendsImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getExtends()
		 * @generated
		 */
		EClass EXTENDS = eINSTANCE.getExtends();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS__FROM = eINSTANCE.getExtends_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS__TO = eINSTANCE.getExtends_To();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ParameterUnitImpl <em>Parameter Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ParameterUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getParameterUnit()
		 * @generated
		 */
		EClass PARAMETER_UNIT = eINSTANCE.getParameterUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_UNIT__KIND = eINSTANCE.getParameterUnit_Kind();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_UNIT__POS = eINSTANCE.getParameterUnit_Pos();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.TemplateUnitImpl <em>Template Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.TemplateUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getTemplateUnit()
		 * @generated
		 */
		EClass TEMPLATE_UNIT = eINSTANCE.getTemplateUnit();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_UNIT__CODE_ELEMENT = eINSTANCE.getTemplateUnit_CodeElement();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.CodeUnitImpl <em>Code Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.CodeUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getCodeUnit()
		 * @generated
		 */
		EClass CODE_UNIT = eINSTANCE.getCodeUnit();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.SignatureImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Parameter Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETER_UNIT = eINSTANCE.getSignature_ParameterUnit();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ImplementationOfImpl <em>Implementation Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ImplementationOfImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getImplementationOf()
		 * @generated
		 */
		EClass IMPLEMENTATION_OF = eINSTANCE.getImplementationOf();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_OF__TO = eINSTANCE.getImplementationOf_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_OF__FROM = eINSTANCE.getImplementationOf_From();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.HasValueImpl <em>Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.HasValueImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getHasValue()
		 * @generated
		 */
		EClass HAS_VALUE = eINSTANCE.getHasValue();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_VALUE__FROM = eINSTANCE.getHasValue_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_VALUE__TO = eINSTANCE.getHasValue_To();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ActionElementImpl <em>Action Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ActionElementImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getActionElement()
		 * @generated
		 */
		EClass ACTION_ELEMENT = eINSTANCE.getActionElement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ELEMENT__KIND = eINSTANCE.getActionElement_Kind();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ELEMENT__CODE_ELEMENT = eINSTANCE.getActionElement_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Action Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ELEMENT__ACTION_RELATION = eINSTANCE.getActionElement_ActionRelation();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.BlockUnitImpl <em>Block Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.BlockUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getBlockUnit()
		 * @generated
		 */
		EClass BLOCK_UNIT = eINSTANCE.getBlockUnit();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ExceptionUnitImpl <em>Exception Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ExceptionUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getExceptionUnit()
		 * @generated
		 */
		EClass EXCEPTION_UNIT = eINSTANCE.getExceptionUnit();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.TryUnitImpl <em>Try Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.TryUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getTryUnit()
		 * @generated
		 */
		EClass TRY_UNIT = eINSTANCE.getTryUnit();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.CatchUnitImpl <em>Catch Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.CatchUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getCatchUnit()
		 * @generated
		 */
		EClass CATCH_UNIT = eINSTANCE.getCatchUnit();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.FinallyUnitImpl <em>Finally Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.FinallyUnitImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getFinallyUnit()
		 * @generated
		 */
		EClass FINALLY_UNIT = eINSTANCE.getFinallyUnit();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.AbstractActionRelationshipImpl <em>Abstract Action Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.AbstractActionRelationshipImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getAbstractActionRelationship()
		 * @generated
		 */
		EClass ABSTRACT_ACTION_RELATIONSHIP = eINSTANCE.getAbstractActionRelationship();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.CallsImpl <em>Calls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.CallsImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getCalls()
		 * @generated
		 */
		EClass CALLS = eINSTANCE.getCalls();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLS__FROM = eINSTANCE.getCalls_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLS__TO = eINSTANCE.getCalls_To();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ReadsImpl <em>Reads</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ReadsImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getReads()
		 * @generated
		 */
		EClass READS = eINSTANCE.getReads();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS__FROM = eINSTANCE.getReads_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READS__TO = eINSTANCE.getReads_To();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.WritesImpl <em>Writes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.WritesImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getWrites()
		 * @generated
		 */
		EClass WRITES = eINSTANCE.getWrites();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES__FROM = eINSTANCE.getWrites_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITES__TO = eINSTANCE.getWrites_To();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.CreatesImpl <em>Creates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.CreatesImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getCreates()
		 * @generated
		 */
		EClass CREATES = eINSTANCE.getCreates();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATES__FROM = eINSTANCE.getCreates_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATES__TO = eINSTANCE.getCreates_To();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.SegmentImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__MODEL = eINSTANCE.getSegment_Model();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__NAME = eINSTANCE.getSegment_Name();

		/**
		 * The meta object literal for the '{@link main.subkdm.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.impl.ModelElementImpl
		 * @see main.subkdm.impl.SubkdmPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '{@link main.subkdm.MethoKind <em>Metho Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.MethoKind
		 * @see main.subkdm.impl.SubkdmPackageImpl#getMethoKind()
		 * @generated
		 */
		EEnum METHO_KIND = eINSTANCE.getMethoKind();

		/**
		 * The meta object literal for the '{@link main.subkdm.CallableKind <em>Callable Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.CallableKind
		 * @see main.subkdm.impl.SubkdmPackageImpl#getCallableKind()
		 * @generated
		 */
		EEnum CALLABLE_KIND = eINSTANCE.getCallableKind();

		/**
		 * The meta object literal for the '{@link main.subkdm.StorableKind <em>Storable Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.StorableKind
		 * @see main.subkdm.impl.SubkdmPackageImpl#getStorableKind()
		 * @generated
		 */
		EEnum STORABLE_KIND = eINSTANCE.getStorableKind();

		/**
		 * The meta object literal for the '{@link main.subkdm.ExportKind <em>Export Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.ExportKind
		 * @see main.subkdm.impl.SubkdmPackageImpl#getExportKind()
		 * @generated
		 */
		EEnum EXPORT_KIND = eINSTANCE.getExportKind();

		/**
		 * The meta object literal for the '{@link main.subkdm.ParameterKind <em>Parameter Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see main.subkdm.ParameterKind
		 * @see main.subkdm.impl.SubkdmPackageImpl#getParameterKind()
		 * @generated
		 */
		EEnum PARAMETER_KIND = eINSTANCE.getParameterKind();

	}

} //SubkdmPackage
