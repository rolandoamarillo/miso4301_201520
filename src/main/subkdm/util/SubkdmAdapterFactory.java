/**
 */
package main.subkdm.util;

import main.subkdm.AbstractActionRelationship;
import main.subkdm.AbstractCodeElement;
import main.subkdm.AbstractCodeRelationship;
import main.subkdm.ActionElement;
import main.subkdm.BlockUnit;
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
import main.subkdm.Extends;
import main.subkdm.FinallyUnit;
import main.subkdm.HasValue;
import main.subkdm.ImplementationOf;
import main.subkdm.Implements;
import main.subkdm.Imports;
import main.subkdm.InterfaceUnit;
import main.subkdm.MethodUnit;
import main.subkdm.ModelElement;
import main.subkdm.Module;
import main.subkdm.ParameterUnit;
import main.subkdm.Reads;
import main.subkdm.Segment;
import main.subkdm.Signature;
import main.subkdm.StorableUnit;
import main.subkdm.SubkdmPackage;
import main.subkdm.TemplateUnit;
import main.subkdm.TryUnit;
import main.subkdm.Writes;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see main.subkdm.SubkdmPackage
 * @generated
 */
public class SubkdmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SubkdmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubkdmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SubkdmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubkdmSwitch<Adapter> modelSwitch =
		new SubkdmSwitch<Adapter>() {
			@Override
			public Adapter caseCodeModel(CodeModel object) {
				return createCodeModelAdapter();
			}
			@Override
			public Adapter caseAbstractCodeElement(AbstractCodeElement object) {
				return createAbstractCodeElementAdapter();
			}
			@Override
			public Adapter caseAbstractCodeRelationship(AbstractCodeRelationship object) {
				return createAbstractCodeRelationshipAdapter();
			}
			@Override
			public Adapter caseCodeItem(CodeItem object) {
				return createCodeItemAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter casePackage(main.subkdm.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseClassUnit(ClassUnit object) {
				return createClassUnitAdapter();
			}
			@Override
			public Adapter caseInterfaceUnit(InterfaceUnit object) {
				return createInterfaceUnitAdapter();
			}
			@Override
			public Adapter caseComputationalObject(ComputationalObject object) {
				return createComputationalObjectAdapter();
			}
			@Override
			public Adapter caseControlElement(ControlElement object) {
				return createControlElementAdapter();
			}
			@Override
			public Adapter caseCallableUnit(CallableUnit object) {
				return createCallableUnitAdapter();
			}
			@Override
			public Adapter caseMethodUnit(MethodUnit object) {
				return createMethodUnitAdapter();
			}
			@Override
			public Adapter caseDataElement(DataElement object) {
				return createDataElementAdapter();
			}
			@Override
			public Adapter caseStorableUnit(StorableUnit object) {
				return createStorableUnitAdapter();
			}
			@Override
			public Adapter caseCommentUnit(CommentUnit object) {
				return createCommentUnitAdapter();
			}
			@Override
			public Adapter caseImports(Imports object) {
				return createImportsAdapter();
			}
			@Override
			public Adapter caseImplements(Implements object) {
				return createImplementsAdapter();
			}
			@Override
			public Adapter caseExtends(Extends object) {
				return createExtendsAdapter();
			}
			@Override
			public Adapter caseParameterUnit(ParameterUnit object) {
				return createParameterUnitAdapter();
			}
			@Override
			public Adapter caseTemplateUnit(TemplateUnit object) {
				return createTemplateUnitAdapter();
			}
			@Override
			public Adapter caseCodeUnit(CodeUnit object) {
				return createCodeUnitAdapter();
			}
			@Override
			public Adapter caseSignature(Signature object) {
				return createSignatureAdapter();
			}
			@Override
			public Adapter caseImplementationOf(ImplementationOf object) {
				return createImplementationOfAdapter();
			}
			@Override
			public Adapter caseHasValue(HasValue object) {
				return createHasValueAdapter();
			}
			@Override
			public Adapter caseActionElement(ActionElement object) {
				return createActionElementAdapter();
			}
			@Override
			public Adapter caseBlockUnit(BlockUnit object) {
				return createBlockUnitAdapter();
			}
			@Override
			public Adapter caseExceptionUnit(ExceptionUnit object) {
				return createExceptionUnitAdapter();
			}
			@Override
			public Adapter caseTryUnit(TryUnit object) {
				return createTryUnitAdapter();
			}
			@Override
			public Adapter caseCatchUnit(CatchUnit object) {
				return createCatchUnitAdapter();
			}
			@Override
			public Adapter caseFinallyUnit(FinallyUnit object) {
				return createFinallyUnitAdapter();
			}
			@Override
			public Adapter caseAbstractActionRelationship(AbstractActionRelationship object) {
				return createAbstractActionRelationshipAdapter();
			}
			@Override
			public Adapter caseCalls(Calls object) {
				return createCallsAdapter();
			}
			@Override
			public Adapter caseReads(Reads object) {
				return createReadsAdapter();
			}
			@Override
			public Adapter caseWrites(Writes object) {
				return createWritesAdapter();
			}
			@Override
			public Adapter caseCreates(Creates object) {
				return createCreatesAdapter();
			}
			@Override
			public Adapter caseSegment(Segment object) {
				return createSegmentAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.CodeModel <em>Code Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.CodeModel
	 * @generated
	 */
	public Adapter createCodeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.AbstractCodeElement <em>Abstract Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.AbstractCodeElement
	 * @generated
	 */
	public Adapter createAbstractCodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.AbstractCodeRelationship <em>Abstract Code Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.AbstractCodeRelationship
	 * @generated
	 */
	public Adapter createAbstractCodeRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.CodeItem <em>Code Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.CodeItem
	 * @generated
	 */
	public Adapter createCodeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.ClassUnit <em>Class Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.ClassUnit
	 * @generated
	 */
	public Adapter createClassUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.InterfaceUnit <em>Interface Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.InterfaceUnit
	 * @generated
	 */
	public Adapter createInterfaceUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.ComputationalObject <em>Computational Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.ComputationalObject
	 * @generated
	 */
	public Adapter createComputationalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.ControlElement <em>Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.ControlElement
	 * @generated
	 */
	public Adapter createControlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.CallableUnit <em>Callable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.CallableUnit
	 * @generated
	 */
	public Adapter createCallableUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.MethodUnit <em>Method Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.MethodUnit
	 * @generated
	 */
	public Adapter createMethodUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.DataElement
	 * @generated
	 */
	public Adapter createDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.StorableUnit <em>Storable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.StorableUnit
	 * @generated
	 */
	public Adapter createStorableUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.CommentUnit <em>Comment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.CommentUnit
	 * @generated
	 */
	public Adapter createCommentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Imports
	 * @generated
	 */
	public Adapter createImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Implements
	 * @generated
	 */
	public Adapter createImplementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Extends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Extends
	 * @generated
	 */
	public Adapter createExtendsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.ParameterUnit <em>Parameter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.ParameterUnit
	 * @generated
	 */
	public Adapter createParameterUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.TemplateUnit <em>Template Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.TemplateUnit
	 * @generated
	 */
	public Adapter createTemplateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.CodeUnit <em>Code Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.CodeUnit
	 * @generated
	 */
	public Adapter createCodeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.ImplementationOf <em>Implementation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.ImplementationOf
	 * @generated
	 */
	public Adapter createImplementationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.HasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.HasValue
	 * @generated
	 */
	public Adapter createHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.ActionElement
	 * @generated
	 */
	public Adapter createActionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.BlockUnit <em>Block Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.BlockUnit
	 * @generated
	 */
	public Adapter createBlockUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.ExceptionUnit <em>Exception Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.ExceptionUnit
	 * @generated
	 */
	public Adapter createExceptionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.TryUnit <em>Try Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.TryUnit
	 * @generated
	 */
	public Adapter createTryUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.CatchUnit <em>Catch Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.CatchUnit
	 * @generated
	 */
	public Adapter createCatchUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.FinallyUnit <em>Finally Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.FinallyUnit
	 * @generated
	 */
	public Adapter createFinallyUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.AbstractActionRelationship <em>Abstract Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.AbstractActionRelationship
	 * @generated
	 */
	public Adapter createAbstractActionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Calls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Calls
	 * @generated
	 */
	public Adapter createCallsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Reads <em>Reads</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Reads
	 * @generated
	 */
	public Adapter createReadsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Writes <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Writes
	 * @generated
	 */
	public Adapter createWritesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Creates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Creates
	 * @generated
	 */
	public Adapter createCreatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.subkdm.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see main.subkdm.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SubkdmAdapterFactory
