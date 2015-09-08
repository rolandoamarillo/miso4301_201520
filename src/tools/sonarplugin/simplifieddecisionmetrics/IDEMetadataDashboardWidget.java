package tools.sonarplugin.simplifieddecisionmetrics;

import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;
import org.sonar.api.web.AbstractRubyTemplate;

@UserRole(UserRole.USER)
public class IDEMetadataDashboardWidget extends AbstractRubyTemplate implements
		RubyRailsWidget {

	public String getId() {
		return "idemetadata";
	}

	public String getTitle() {
		return "IDE Metadata";
	}

	@Override
	protected String getTemplatePath() {
		// uncomment next line for change reloading during development
		// return
		// "c:/projects/xxxxx/src/main/resources/xxxxx/sonar/idemetadata/idemetadata_widget.html.erb";
		return "/xxxxx/sonar/idemetadata/idemetadata_widget.html.erb";
	}

}
