package tools.sonarplugin.simplifieddecisionmetrics;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

public class IDEMetadataMetrics implements Metrics {

	public static final Metric IDE_IS_JAVA = new Metric.Builder("ide_is_java", // metric
																				// identifier
			"Java project", // metric name
			Metric.ValueType.BOOL)
			// metric data type
			.setDescription(
					"Whether the project is configured as Java in the IDE")
			.setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL)
			.create();

	public List<Metric> getMetrics() {
		return Arrays.asList(IDE_IS_JAVA);
	}

}
