package tools.sonarplugin.simplifieddecisionmetrics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

public class KDM2SDMTransformation extends EpsilonExecuter {

	public static void main(String[] args) throws Exception {
		new KDM2SDMTransformation().execute();
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public String getSource() throws Exception {
		return "transformation/m2m/micro2sdm.etl";
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("sourcemodel", "models/kdmResultadoSub.xmi",
				"metamodel/SubKDM.ecore", true, false));
		models.add(createEmfModel("targetmodel", "models/SDM.xmi",
				"metamodel/SubKDM.ecore", false, true));
		return models;
	}

}
