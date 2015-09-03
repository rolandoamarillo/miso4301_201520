/**
 */
package main.subkdm.impl;

import main.subkdm.AbstractActionRelationship;
import main.subkdm.AbstractCodeRelationship;
import main.subkdm.ActionElement;
import main.subkdm.BlockUnit;
import main.subkdm.CallableKind;
import main.subkdm.CallableUnit;
import main.subkdm.Calls;
import main.subkdm.CatchUnit;
import main.subkdm.ClassUnit;
import main.subkdm.CodeItem;
import main.subkdm.CodeModel;
import main.subkdm.CodeUnit;
import main.subkdm.CommentUnit;
import main.subkdm.ComputationalObject;
import main.subkdm.ControlElement;
import main.subkdm.Creates;
import main.subkdm.DataElement;
import main.subkdm.DataType;
import main.subkdm.ExceptionUnit;
import main.subkdm.ExportKind;
import main.subkdm.Extends;
import main.subkdm.FinallyUnit;
import main.subkdm.HasValue;
import main.subkdm.ImplementationOf;
import main.subkdm.Implements;
import main.subkdm.Imports;
import main.subkdm.InterfaceUnit;
import main.subkdm.MethoKind;
import main.subkdm.MethodUnit;
import main.subkdm.ModelElement;
import main.subkdm.Module;
import main.subkdm.ParameterKind;
import main.subkdm.ParameterUnit;
import main.subkdm.Reads;
import main.subkdm.Segment;
import main.subkdm.Signature;
import main.subkdm.StorableKind;
import main.subkdm.StorableUnit;
import main.subkdm.SubkdmFactory;
import main.subkdm.SubkdmPackage;
import main.subkdm.TemplateUnit;
import main.subkdm.TryUnit;
import main.subkdm.Writes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubkdmFactoryImpl extends EFactoryImpl implements SubkdmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubkdmFactory init() {
		try {
			SubkdmFactory theSubkdmFactory = (SubkdmFactory)EPackage.Registry.INSTANCE.getEFactory(SubkdmPackage.eNS_URI);
			if (theSubkdmFactory != null) {
				return theSubkdmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SubkdmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubkdmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SubkdmPackage.CODE_MODEL: return createCodeModel();
			case SubkdmPackage.ABSTRACT_CODE_RELATIONSHIP: return createAbstractCodeRelationship();
			case SubkdmPackage.CODE_ITEM: return createCodeItem();
			case SubkdmPackage.MODULE: return createModule();
			case SubkdmPackage.PACKAGE: return createPackage();
			case SubkdmPackage.DATA_TYPE: return createDataType();
			case SubkdmPackage.CLASS_UNIT: return createClassUnit();
			case SubkdmPackage.INTERFACE_UNIT: return createInterfaceUnit();
			case SubkdmPackage.COMPUTATIONAL_OBJECT: return createComputationalObject();
			case SubkdmPackage.CONTROL_ELEMENT: return createControlElement();
			case SubkdmPackage.CALLABLE_UNIT: return createCallableUnit();
			case SubkdmPackage.METHOD_UNIT: return createMethodUnit();
			case SubkdmPackage.DATA_ELEMENT: return createDataElement();
			case SubkdmPackage.STORABLE_UNIT: return createStorableUnit();
			case SubkdmPackage.COMMENT_UNIT: return createCommentUnit();
			case SubkdmPackage.IMPORTS: return createImports();
			case SubkdmPackage.IMPLEMENTS: return createImplements();
			case SubkdmPackage.EXTENDS: return createExtends();
			case SubkdmPackage.PARAMETER_UNIT: return createParameterUnit();
			case SubkdmPackage.TEMPLATE_UNIT: return createTemplateUnit();
			case SubkdmPackage.CODE_UNIT: return createCodeUnit();
			case SubkdmPackage.SIGNATURE: return createSignature();
			case SubkdmPackage.IMPLEMENTATION_OF: return createImplementationOf();
			case SubkdmPackage.HAS_VALUE: return createHasValue();
			case SubkdmPackage.ACTION_ELEMENT: return createActionElement();
			case SubkdmPackage.BLOCK_UNIT: return createBlockUnit();
			case SubkdmPackage.EXCEPTION_UNIT: return createExceptionUnit();
			case SubkdmPackage.TRY_UNIT: return createTryUnit();
			case SubkdmPackage.CATCH_UNIT: return createCatchUnit();
			case SubkdmPackage.FINALLY_UNIT: return createFinallyUnit();
			case SubkdmPackage.ABSTRACT_ACTION_RELATIONSHIP: return createAbstractActionRelationship();
			case SubkdmPackage.CALLS: return createCalls();
			case SubkdmPackage.READS: return createReads();
			case SubkdmPackage.WRITES: return createWrites();
			case SubkdmPackage.CREATES: return createCreates();
			case SubkdmPackage.SEGMENT: return createSegment();
			case SubkdmPackage.MODEL_ELEMENT: return createModelElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SubkdmPackage.METHO_KIND:
				return createMethoKindFromString(eDataType, initialValue);
			case SubkdmPackage.CALLABLE_KIND:
				return createCallableKindFromString(eDataType, initialValue);
			case SubkdmPackage.STORABLE_KIND:
				return createStorableKindFromString(eDataType, initialValue);
			case SubkdmPackage.EXPORT_KIND:
				return createExportKindFromString(eDataType, initialValue);
			case SubkdmPackage.PARAMETER_KIND:
				return createParameterKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SubkdmPackage.METHO_KIND:
				return convertMethoKindToString(eDataType, instanceValue);
			case SubkdmPackage.CALLABLE_KIND:
				return convertCallableKindToString(eDataType, instanceValue);
			case SubkdmPackage.STORABLE_KIND:
				return convertStorableKindToString(eDataType, instanceValue);
			case SubkdmPackage.EXPORT_KIND:
				return convertExportKindToString(eDataType, instanceValue);
			case SubkdmPackage.PARAMETER_KIND:
				return convertParameterKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeModel createCodeModel() {
		CodeModelImpl codeModel = new CodeModelImpl();
		return codeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCodeRelationship createAbstractCodeRelationship() {
		AbstractCodeRelationshipImpl abstractCodeRelationship = new AbstractCodeRelationshipImpl();
		return abstractCodeRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeItem createCodeItem() {
		CodeItemImpl codeItem = new CodeItemImpl();
		return codeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public main.subkdm.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUnit createClassUnit() {
		ClassUnitImpl classUnit = new ClassUnitImpl();
		return classUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceUnit createInterfaceUnit() {
		InterfaceUnitImpl interfaceUnit = new InterfaceUnitImpl();
		return interfaceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationalObject createComputationalObject() {
		ComputationalObjectImpl computationalObject = new ComputationalObjectImpl();
		return computationalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlElement createControlElement() {
		ControlElementImpl controlElement = new ControlElementImpl();
		return controlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableUnit createCallableUnit() {
		CallableUnitImpl callableUnit = new CallableUnitImpl();
		return callableUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodUnit createMethodUnit() {
		MethodUnitImpl methodUnit = new MethodUnitImpl();
		return methodUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorableUnit createStorableUnit() {
		StorableUnitImpl storableUnit = new StorableUnitImpl();
		return storableUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentUnit createCommentUnit() {
		CommentUnitImpl commentUnit = new CommentUnitImpl();
		return commentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imports createImports() {
		ImportsImpl imports = new ImportsImpl();
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implements createImplements() {
		ImplementsImpl implements_ = new ImplementsImpl();
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extends createExtends() {
		ExtendsImpl extends_ = new ExtendsImpl();
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterUnit createParameterUnit() {
		ParameterUnitImpl parameterUnit = new ParameterUnitImpl();
		return parameterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateUnit createTemplateUnit() {
		TemplateUnitImpl templateUnit = new TemplateUnitImpl();
		return templateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeUnit createCodeUnit() {
		CodeUnitImpl codeUnit = new CodeUnitImpl();
		return codeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationOf createImplementationOf() {
		ImplementationOfImpl implementationOf = new ImplementationOfImpl();
		return implementationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasValue createHasValue() {
		HasValueImpl hasValue = new HasValueImpl();
		return hasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionElement createActionElement() {
		ActionElementImpl actionElement = new ActionElementImpl();
		return actionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockUnit createBlockUnit() {
		BlockUnitImpl blockUnit = new BlockUnitImpl();
		return blockUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionUnit createExceptionUnit() {
		ExceptionUnitImpl exceptionUnit = new ExceptionUnitImpl();
		return exceptionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryUnit createTryUnit() {
		TryUnitImpl tryUnit = new TryUnitImpl();
		return tryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchUnit createCatchUnit() {
		CatchUnitImpl catchUnit = new CatchUnitImpl();
		return catchUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinallyUnit createFinallyUnit() {
		FinallyUnitImpl finallyUnit = new FinallyUnitImpl();
		return finallyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActionRelationship createAbstractActionRelationship() {
		AbstractActionRelationshipImpl abstractActionRelationship = new AbstractActionRelationshipImpl();
		return abstractActionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calls createCalls() {
		CallsImpl calls = new CallsImpl();
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reads createReads() {
		ReadsImpl reads = new ReadsImpl();
		return reads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writes createWrites() {
		WritesImpl writes = new WritesImpl();
		return writes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creates createCreates() {
		CreatesImpl creates = new CreatesImpl();
		return creates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethoKind createMethoKindFromString(EDataType eDataType, String initialValue) {
		MethoKind result = MethoKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethoKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableKind createCallableKindFromString(EDataType eDataType, String initialValue) {
		CallableKind result = CallableKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallableKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorableKind createStorableKindFromString(EDataType eDataType, String initialValue) {
		StorableKind result = StorableKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorableKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportKind createExportKindFromString(EDataType eDataType, String initialValue) {
		ExportKind result = ExportKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExportKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterKind createParameterKindFromString(EDataType eDataType, String initialValue) {
		ParameterKind result = ParameterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubkdmPackage getSubkdmPackage() {
		return (SubkdmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SubkdmPackage getPackage() {
		return SubkdmPackage.eINSTANCE;
	}

} //SubkdmFactoryImpl
