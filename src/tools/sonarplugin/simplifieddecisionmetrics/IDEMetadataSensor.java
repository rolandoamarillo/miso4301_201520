package tools.sonarplugin.simplifieddecisionmetrics;

import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.measures.Measure;
import org.sonar.api.resources.Project;
import org.sonar.api.scan.filesystem.ModuleFileSystem;

public class IDEMetadataSensor implements Sensor {

	private ModuleFileSystem fileSystem;

	public IDEMetadataSensor(ModuleFileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}

	public boolean shouldExecuteOnProject(Project projectInfo) {
		return true;
	}

	public void analyse(Project projectInfo, SensorContext sensorContext) {
		Measure measure = new Measure(IDEMetadataMetrics.IDE_IS_JAVA,
				projectInfo.getLanguageKey().equalsIgnoreCase("java") ? 1d : 0d); // for
																					// boolean
																					// values,
																					// 1
																					// is
																					// true,
																					// 0
																					// is
																					// false
		sensorContext.saveMeasure(measure);
	}

}
