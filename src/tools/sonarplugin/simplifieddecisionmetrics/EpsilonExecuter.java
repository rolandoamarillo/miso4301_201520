package tools.sonarplugin.simplifieddecisionmetrics;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;

public abstract class EpsilonExecuter {
	protected IEolExecutableModule module;
	protected List<Variable> parameters = new ArrayList<Variable>();

	protected Object result;

	public abstract IEolExecutableModule createModule();

	public abstract String getSource() throws Exception;

	public abstract List<IModel> getModels() throws Exception;

	public void postProcess() {
	};

	public void preProcess() {
	};

	public void execute() throws Exception {

		module = createModule();
		module.parse(getFile(getSource()));

		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}

		for (IModel model : getModels()) {
			module.getContext().getModelRepository().addModel(model);
		}

		for (Variable parameter : parameters) {
			module.getContext().getFrameStack().put(parameter);
		}

		preProcess();
		result = execute(module);
		postProcess();

		module.getContext().getModelRepository().dispose();
	}

	public List<Variable> getParameters() {
		return parameters;
	}

	protected Object execute(IEolExecutableModule module)
			throws EolRuntimeException {
		return module.execute();
	}

	protected EmfModel createEmfModel(String name, String model,
			String metamodel, boolean readOnLoad, boolean storeOnDisposal)
			throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		// StringProperties properties = new StringProperties();
		// properties.put(EmfModel.PROPERTY_NAME, name);
		// properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
		// getFile(metamodel).toURI().toString());
		// properties.put(EmfModel.PROPERTY_MODEL_URI, getFile(model).toURI()
		// .toString());
		// properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		// properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal +
		// "");
		// emfModel.load(properties, null);
		emfModel.setName(name);
		emfModel.setMetamodelFile(metamodel);
		System.out.println(metamodel);
		emfModel.setModelFile(model);
		emfModel.setReadOnLoad(readOnLoad);
		emfModel.setStoredOnDisposal(storeOnDisposal);
		emfModel.load();
		return emfModel;
	}

	protected EmfModel createEmfModelByURI(String name, String model,
			String metamodel, boolean readOnLoad, boolean storeOnDisposal)
			throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		// StringProperties properties = new StringProperties();
		// properties.put(EmfModel.PROPERTY_NAME, name);
		// properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		// properties.put(EmfModel.PROPERTY_MODEL_URI, getFile(model).toURI()
		// .toString());
		// properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		// properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal +
		// "");
		emfModel.setName(name);
		emfModel.setMetamodelUri(metamodel);
		emfModel.setModelFile(getFile(model).toURI().toString());
		emfModel.setReadOnLoad(readOnLoad);
		emfModel.setStoredOnDisposal(storeOnDisposal);
		emfModel.load();
		// emfModel.load(properties, null);
		return emfModel;
	}

	protected File getFile(String fileName) throws URISyntaxException {
		System.out.println("Getting file: " + fileName);
		File file = new File(fileName);
		// if (file.exists()) {
		// System.out.println(file.exists());
		// System.out.println(file.getAbsolutePath());
		// System.out.println(file.isDirectory());
		// }
		// // URI binUri = EpsilonExecuter.class.getResource(fileName).toURI();
		// URI binUri = file.toURI();
		// URI uri = null;
		//
		// if (binUri.toString().indexOf("bin") > -1) {
		// uri = new URI(binUri.toString().replaceAll("bin", "src"));
		// } else {
		// uri = binUri;
		// }

		return file;
	}

	public static void bubble_sort(int[] numbers) {
		int n = numbers.length;
		int k;
		int count = 0;
		for (int m = n; m >= 0; m--) {
			count = 0;
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (numbers[i] > numbers[k]) {
					// swapNumbers(i, k, numbers);
				} else {
					count++;
				}
			}
			if (count == n - 1) {
				break;
			}
			// printNumbers(numbers);
		}
	}
}
