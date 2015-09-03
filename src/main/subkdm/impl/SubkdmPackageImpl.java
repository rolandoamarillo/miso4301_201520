/**
 */
package main.subkdm.impl;

import main.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage;

import main.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl;

import main.subkdm.AbstractActionRelationship;
import main.subkdm.AbstractCodeElement;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubkdmPackageImpl extends EPackageImpl implements SubkdmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCodeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCodeRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storableUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finallyUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActionRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methoKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callableKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storableKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exportKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see main.subkdm.SubkdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubkdmPackageImpl() {
		super(eNS_URI, SubkdmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SubkdmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SubkdmPackage init() {
		if (isInited) return (SubkdmPackage)EPackage.Registry.INSTANCE.getEPackage(SubkdmPackage.eNS_URI);

		// Obtain or create and register package
		SubkdmPackageImpl theSubkdmPackage = (SubkdmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SubkdmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SubkdmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SimplifiedDecisionMetricsPackageImpl theSimplifiedDecisionMetricsPackage = (SimplifiedDecisionMetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimplifiedDecisionMetricsPackage.eNS_URI) instanceof SimplifiedDecisionMetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimplifiedDecisionMetricsPackage.eNS_URI) : SimplifiedDecisionMetricsPackage.eINSTANCE);

		// Create package meta-data objects
		theSubkdmPackage.createPackageContents();
		theSimplifiedDecisionMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theSubkdmPackage.initializePackageContents();
		theSimplifiedDecisionMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSubkdmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SubkdmPackage.eNS_URI, theSubkdmPackage);
		return theSubkdmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeModel() {
		return codeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeModel_CodeElement() {
		return (EReference)codeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeModel_Name() {
		return (EAttribute)codeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCodeElement() {
		return abstractCodeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCodeElement_CodeRelation() {
		return (EReference)abstractCodeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCodeElement_Comment() {
		return (EReference)abstractCodeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCodeElement_Name() {
		return (EAttribute)abstractCodeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCodeRelationship() {
		return abstractCodeRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeItem() {
		return codeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_CodeElement() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassUnit() {
		return classUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassUnit_CodeElement() {
		return (EReference)classUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassUnit_IsAbstract() {
		return (EAttribute)classUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceUnit() {
		return interfaceUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceUnit_CodeElement() {
		return (EReference)interfaceUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputationalObject() {
		return computationalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlElement() {
		return controlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlElement_CodeElement() {
		return (EReference)controlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlElement_Type() {
		return (EReference)controlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallableUnit() {
		return callableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallableUnit_Kind() {
		return (EAttribute)callableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodUnit() {
		return methodUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodUnit_Kind() {
		return (EAttribute)methodUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElement() {
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_CodeElement() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Type() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_Ext() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_Size() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorableUnit() {
		return storableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorableUnit_Kind() {
		return (EAttribute)storableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentUnit() {
		return commentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentUnit_Text() {
		return (EAttribute)commentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImports() {
		return importsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImports_From() {
		return (EReference)importsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImports_To() {
		return (EReference)importsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplements() {
		return implementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplements_From() {
		return (EReference)implementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplements_To() {
		return (EReference)implementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtends() {
		return extendsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtends_From() {
		return (EReference)extendsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtends_To() {
		return (EReference)extendsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterUnit() {
		return parameterUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterUnit_Kind() {
		return (EAttribute)parameterUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterUnit_Pos() {
		return (EAttribute)parameterUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateUnit() {
		return templateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateUnit_CodeElement() {
		return (EReference)templateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeUnit() {
		return codeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_ParameterUnit() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationOf() {
		return implementationOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationOf_To() {
		return (EReference)implementationOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationOf_From() {
		return (EReference)implementationOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasValue() {
		return hasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasValue_From() {
		return (EReference)hasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasValue_To() {
		return (EReference)hasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionElement() {
		return actionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionElement_Kind() {
		return (EAttribute)actionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionElement_CodeElement() {
		return (EReference)actionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionElement_ActionRelation() {
		return (EReference)actionElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockUnit() {
		return blockUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionUnit() {
		return exceptionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTryUnit() {
		return tryUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchUnit() {
		return catchUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinallyUnit() {
		return finallyUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractActionRelationship() {
		return abstractActionRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalls() {
		return callsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalls_From() {
		return (EReference)callsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalls_To() {
		return (EReference)callsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReads() {
		return readsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReads_From() {
		return (EReference)readsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReads_To() {
		return (EReference)readsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrites() {
		return writesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWrites_From() {
		return (EReference)writesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWrites_To() {
		return (EReference)writesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreates() {
		return createsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreates_From() {
		return (EReference)createsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreates_To() {
		return (EReference)createsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegment() {
		return segmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegment_Model() {
		return (EReference)segmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegment_Name() {
		return (EAttribute)segmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethoKind() {
		return methoKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallableKind() {
		return callableKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStorableKind() {
		return storableKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExportKind() {
		return exportKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterKind() {
		return parameterKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubkdmFactory getSubkdmFactory() {
		return (SubkdmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		codeModelEClass = createEClass(CODE_MODEL);
		createEReference(codeModelEClass, CODE_MODEL__CODE_ELEMENT);
		createEAttribute(codeModelEClass, CODE_MODEL__NAME);

		abstractCodeElementEClass = createEClass(ABSTRACT_CODE_ELEMENT);
		createEReference(abstractCodeElementEClass, ABSTRACT_CODE_ELEMENT__CODE_RELATION);
		createEReference(abstractCodeElementEClass, ABSTRACT_CODE_ELEMENT__COMMENT);
		createEAttribute(abstractCodeElementEClass, ABSTRACT_CODE_ELEMENT__NAME);

		abstractCodeRelationshipEClass = createEClass(ABSTRACT_CODE_RELATIONSHIP);

		codeItemEClass = createEClass(CODE_ITEM);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__CODE_ELEMENT);

		packageEClass = createEClass(PACKAGE);

		dataTypeEClass = createEClass(DATA_TYPE);

		classUnitEClass = createEClass(CLASS_UNIT);
		createEReference(classUnitEClass, CLASS_UNIT__CODE_ELEMENT);
		createEAttribute(classUnitEClass, CLASS_UNIT__IS_ABSTRACT);

		interfaceUnitEClass = createEClass(INTERFACE_UNIT);
		createEReference(interfaceUnitEClass, INTERFACE_UNIT__CODE_ELEMENT);

		computationalObjectEClass = createEClass(COMPUTATIONAL_OBJECT);

		controlElementEClass = createEClass(CONTROL_ELEMENT);
		createEReference(controlElementEClass, CONTROL_ELEMENT__CODE_ELEMENT);
		createEReference(controlElementEClass, CONTROL_ELEMENT__TYPE);

		callableUnitEClass = createEClass(CALLABLE_UNIT);
		createEAttribute(callableUnitEClass, CALLABLE_UNIT__KIND);

		methodUnitEClass = createEClass(METHOD_UNIT);
		createEAttribute(methodUnitEClass, METHOD_UNIT__KIND);

		dataElementEClass = createEClass(DATA_ELEMENT);
		createEReference(dataElementEClass, DATA_ELEMENT__CODE_ELEMENT);
		createEReference(dataElementEClass, DATA_ELEMENT__TYPE);
		createEAttribute(dataElementEClass, DATA_ELEMENT__EXT);
		createEAttribute(dataElementEClass, DATA_ELEMENT__SIZE);

		storableUnitEClass = createEClass(STORABLE_UNIT);
		createEAttribute(storableUnitEClass, STORABLE_UNIT__KIND);

		commentUnitEClass = createEClass(COMMENT_UNIT);
		createEAttribute(commentUnitEClass, COMMENT_UNIT__TEXT);

		importsEClass = createEClass(IMPORTS);
		createEReference(importsEClass, IMPORTS__FROM);
		createEReference(importsEClass, IMPORTS__TO);

		implementsEClass = createEClass(IMPLEMENTS);
		createEReference(implementsEClass, IMPLEMENTS__FROM);
		createEReference(implementsEClass, IMPLEMENTS__TO);

		extendsEClass = createEClass(EXTENDS);
		createEReference(extendsEClass, EXTENDS__FROM);
		createEReference(extendsEClass, EXTENDS__TO);

		parameterUnitEClass = createEClass(PARAMETER_UNIT);
		createEAttribute(parameterUnitEClass, PARAMETER_UNIT__KIND);
		createEAttribute(parameterUnitEClass, PARAMETER_UNIT__POS);

		templateUnitEClass = createEClass(TEMPLATE_UNIT);
		createEReference(templateUnitEClass, TEMPLATE_UNIT__CODE_ELEMENT);

		codeUnitEClass = createEClass(CODE_UNIT);

		signatureEClass = createEClass(SIGNATURE);
		createEReference(signatureEClass, SIGNATURE__PARAMETER_UNIT);

		implementationOfEClass = createEClass(IMPLEMENTATION_OF);
		createEReference(implementationOfEClass, IMPLEMENTATION_OF__TO);
		createEReference(implementationOfEClass, IMPLEMENTATION_OF__FROM);

		hasValueEClass = createEClass(HAS_VALUE);
		createEReference(hasValueEClass, HAS_VALUE__FROM);
		createEReference(hasValueEClass, HAS_VALUE__TO);

		actionElementEClass = createEClass(ACTION_ELEMENT);
		createEAttribute(actionElementEClass, ACTION_ELEMENT__KIND);
		createEReference(actionElementEClass, ACTION_ELEMENT__CODE_ELEMENT);
		createEReference(actionElementEClass, ACTION_ELEMENT__ACTION_RELATION);

		blockUnitEClass = createEClass(BLOCK_UNIT);

		exceptionUnitEClass = createEClass(EXCEPTION_UNIT);

		tryUnitEClass = createEClass(TRY_UNIT);

		catchUnitEClass = createEClass(CATCH_UNIT);

		finallyUnitEClass = createEClass(FINALLY_UNIT);

		abstractActionRelationshipEClass = createEClass(ABSTRACT_ACTION_RELATIONSHIP);

		callsEClass = createEClass(CALLS);
		createEReference(callsEClass, CALLS__FROM);
		createEReference(callsEClass, CALLS__TO);

		readsEClass = createEClass(READS);
		createEReference(readsEClass, READS__FROM);
		createEReference(readsEClass, READS__TO);

		writesEClass = createEClass(WRITES);
		createEReference(writesEClass, WRITES__FROM);
		createEReference(writesEClass, WRITES__TO);

		createsEClass = createEClass(CREATES);
		createEReference(createsEClass, CREATES__FROM);
		createEReference(createsEClass, CREATES__TO);

		segmentEClass = createEClass(SEGMENT);
		createEReference(segmentEClass, SEGMENT__MODEL);
		createEAttribute(segmentEClass, SEGMENT__NAME);

		modelElementEClass = createEClass(MODEL_ELEMENT);

		// Create enums
		methoKindEEnum = createEEnum(METHO_KIND);
		callableKindEEnum = createEEnum(CALLABLE_KIND);
		storableKindEEnum = createEEnum(STORABLE_KIND);
		exportKindEEnum = createEEnum(EXPORT_KIND);
		parameterKindEEnum = createEEnum(PARAMETER_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeModelEClass.getESuperTypes().add(this.getModelElement());
		abstractCodeElementEClass.getESuperTypes().add(this.getModelElement());
		codeItemEClass.getESuperTypes().add(this.getAbstractCodeElement());
		moduleEClass.getESuperTypes().add(this.getCodeItem());
		packageEClass.getESuperTypes().add(this.getModule());
		dataTypeEClass.getESuperTypes().add(this.getCodeItem());
		classUnitEClass.getESuperTypes().add(this.getDataType());
		interfaceUnitEClass.getESuperTypes().add(this.getDataType());
		computationalObjectEClass.getESuperTypes().add(this.getCodeItem());
		controlElementEClass.getESuperTypes().add(this.getComputationalObject());
		callableUnitEClass.getESuperTypes().add(this.getControlElement());
		methodUnitEClass.getESuperTypes().add(this.getControlElement());
		dataElementEClass.getESuperTypes().add(this.getComputationalObject());
		storableUnitEClass.getESuperTypes().add(this.getDataElement());
		importsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		implementsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		extendsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		parameterUnitEClass.getESuperTypes().add(this.getDataElement());
		templateUnitEClass.getESuperTypes().add(this.getDataType());
		signatureEClass.getESuperTypes().add(this.getDataType());
		implementationOfEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		hasValueEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		actionElementEClass.getESuperTypes().add(this.getAbstractCodeElement());
		blockUnitEClass.getESuperTypes().add(this.getActionElement());
		exceptionUnitEClass.getESuperTypes().add(this.getBlockUnit());
		tryUnitEClass.getESuperTypes().add(this.getExceptionUnit());
		catchUnitEClass.getESuperTypes().add(this.getExceptionUnit());
		finallyUnitEClass.getESuperTypes().add(this.getExceptionUnit());
		callsEClass.getESuperTypes().add(this.getAbstractActionRelationship());
		readsEClass.getESuperTypes().add(this.getAbstractActionRelationship());
		writesEClass.getESuperTypes().add(this.getAbstractActionRelationship());
		createsEClass.getESuperTypes().add(this.getAbstractActionRelationship());
		segmentEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(codeModelEClass, CodeModel.class, "CodeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeModel_CodeElement(), this.getAbstractCodeElement(), null, "codeElement", null, 0, -1, CodeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCodeElementEClass, AbstractCodeElement.class, "AbstractCodeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCodeElement_CodeRelation(), this.getAbstractCodeRelationship(), null, "codeRelation", null, 0, -1, AbstractCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCodeElement_Comment(), this.getCommentUnit(), null, "comment", null, 0, -1, AbstractCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCodeElement_Name(), ecorePackage.getEString(), "name", "", 0, 1, AbstractCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCodeRelationshipEClass, AbstractCodeRelationship.class, "AbstractCodeRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeItemEClass, CodeItem.class, "CodeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_CodeElement(), this.getAbstractCodeElement(), null, "codeElement", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, main.subkdm.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classUnitEClass, ClassUnit.class, "ClassUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassUnit_CodeElement(), this.getCodeItem(), null, "codeElement", null, 0, -1, ClassUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassUnit_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, ClassUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceUnitEClass, InterfaceUnit.class, "InterfaceUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceUnit_CodeElement(), this.getCodeItem(), null, "codeElement", null, 0, -1, InterfaceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computationalObjectEClass, ComputationalObject.class, "ComputationalObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlElementEClass, ControlElement.class, "ControlElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlElement_CodeElement(), this.getAbstractCodeElement(), null, "codeElement", null, 0, -1, ControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlElement_Type(), this.getDataType(), null, "type", null, 0, 1, ControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callableUnitEClass, CallableUnit.class, "CallableUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallableUnit_Kind(), this.getMethoKind(), "kind", null, 0, 1, CallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodUnitEClass, MethodUnit.class, "MethodUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodUnit_Kind(), this.getCallableKind(), "kind", null, 0, 1, MethodUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataElementEClass, DataElement.class, "DataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataElement_CodeElement(), this.getDataType(), null, "codeElement", null, 0, -1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataElement_Type(), this.getDataType(), null, "type", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataElement_Ext(), ecorePackage.getEString(), "ext", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataElement_Size(), ecorePackage.getEInt(), "size", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storableUnitEClass, StorableUnit.class, "StorableUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorableUnit_Kind(), this.getStorableKind(), "kind", null, 0, 1, StorableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentUnitEClass, CommentUnit.class, "CommentUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentUnit_Text(), ecorePackage.getEString(), "text", null, 0, 1, CommentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importsEClass, Imports.class, "Imports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImports_From(), this.getCodeItem(), null, "from", null, 1, 1, Imports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImports_To(), this.getCodeItem(), null, "to", null, 1, 1, Imports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementsEClass, Implements.class, "Implements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplements_From(), this.getCodeItem(), null, "from", null, 1, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplements_To(), this.getCodeItem(), null, "to", null, 1, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendsEClass, Extends.class, "Extends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtends_From(), this.getDataType(), null, "from", null, 1, 1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtends_To(), this.getDataType(), null, "to", null, 1, 1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterUnitEClass, ParameterUnit.class, "ParameterUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterUnit_Kind(), this.getParameterKind(), "kind", null, 0, 1, ParameterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterUnit_Pos(), ecorePackage.getEInt(), "pos", null, 0, 1, ParameterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateUnitEClass, TemplateUnit.class, "TemplateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateUnit_CodeElement(), this.getCodeUnit(), null, "codeElement", null, 0, -1, TemplateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeUnitEClass, CodeUnit.class, "CodeUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignature_ParameterUnit(), this.getParameterUnit(), null, "parameterUnit", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationOfEClass, ImplementationOf.class, "ImplementationOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementationOf_To(), this.getCodeItem(), null, "to", null, 0, 1, ImplementationOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationOf_From(), this.getCodeItem(), null, "from", null, 0, 1, ImplementationOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasValueEClass, HasValue.class, "HasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasValue_From(), this.getCodeItem(), null, "from", null, 0, 1, HasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHasValue_To(), this.getAbstractCodeElement(), null, "to", null, 0, 1, HasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionElementEClass, ActionElement.class, "ActionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionElement_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, ActionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionElement_CodeElement(), this.getAbstractCodeElement(), null, "codeElement", null, 0, -1, ActionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionElement_ActionRelation(), this.getAbstractActionRelationship(), null, "actionRelation", null, 0, -1, ActionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockUnitEClass, BlockUnit.class, "BlockUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionUnitEClass, ExceptionUnit.class, "ExceptionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tryUnitEClass, TryUnit.class, "TryUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catchUnitEClass, CatchUnit.class, "CatchUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finallyUnitEClass, FinallyUnit.class, "FinallyUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractActionRelationshipEClass, AbstractActionRelationship.class, "AbstractActionRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callsEClass, Calls.class, "Calls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalls_From(), this.getActionElement(), null, "from", null, 0, 1, Calls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalls_To(), this.getControlElement(), null, "to", null, 0, 1, Calls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readsEClass, Reads.class, "Reads", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReads_From(), this.getActionElement(), null, "from", null, 0, 1, Reads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReads_To(), this.getDataElement(), null, "to", null, 0, 1, Reads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writesEClass, Writes.class, "Writes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWrites_From(), this.getActionElement(), null, "from", null, 0, 1, Writes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWrites_To(), this.getDataElement(), null, "to", null, 0, 1, Writes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createsEClass, Creates.class, "Creates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreates_From(), this.getActionElement(), null, "from", null, 0, 1, Creates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreates_To(), this.getDataType(), null, "to", null, 0, 1, Creates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSegment_Model(), this.getCodeModel(), null, "model", null, 0, -1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(methoKindEEnum, MethoKind.class, "MethoKind");
		addEEnumLiteral(methoKindEEnum, MethoKind.METHOD);
		addEEnumLiteral(methoKindEEnum, MethoKind.CONSTRUCTOS);
		addEEnumLiteral(methoKindEEnum, MethoKind.DESTRUCTOR);
		addEEnumLiteral(methoKindEEnum, MethoKind.OPERATOR);
		addEEnumLiteral(methoKindEEnum, MethoKind.VIRTUAL);
		addEEnumLiteral(methoKindEEnum, MethoKind.ABSTRACT);
		addEEnumLiteral(methoKindEEnum, MethoKind.UNKNOWN);

		initEEnum(callableKindEEnum, CallableKind.class, "CallableKind");
		addEEnumLiteral(callableKindEEnum, CallableKind.EXTERNAL);
		addEEnumLiteral(callableKindEEnum, CallableKind.REGULAR);
		addEEnumLiteral(callableKindEEnum, CallableKind.OPERATOR);
		addEEnumLiteral(callableKindEEnum, CallableKind.STORED);
		addEEnumLiteral(callableKindEEnum, CallableKind.UNKNOWN);

		initEEnum(storableKindEEnum, StorableKind.class, "StorableKind");
		addEEnumLiteral(storableKindEEnum, StorableKind.GLOBAL);
		addEEnumLiteral(storableKindEEnum, StorableKind.LOCAL);
		addEEnumLiteral(storableKindEEnum, StorableKind.STATIC);
		addEEnumLiteral(storableKindEEnum, StorableKind.EXTERNAL);
		addEEnumLiteral(storableKindEEnum, StorableKind.REGISTER);
		addEEnumLiteral(storableKindEEnum, StorableKind.UNKNOWN);

		initEEnum(exportKindEEnum, ExportKind.class, "ExportKind");
		addEEnumLiteral(exportKindEEnum, ExportKind.PUBLIC);
		addEEnumLiteral(exportKindEEnum, ExportKind.PRIVATE);
		addEEnumLiteral(exportKindEEnum, ExportKind.PROTECTED);
		addEEnumLiteral(exportKindEEnum, ExportKind.FINAL);
		addEEnumLiteral(exportKindEEnum, ExportKind.UNKNOWN);

		initEEnum(parameterKindEEnum, ParameterKind.class, "ParameterKind");
		addEEnumLiteral(parameterKindEEnum, ParameterKind.BY_VALUE);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.BY_NAME);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.BY_REFERENCE);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.VARIADIC);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.RETURN);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.THROWS);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.EXCEPTION);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.CATCHALL);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.UNKNOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //SubkdmPackageImpl
