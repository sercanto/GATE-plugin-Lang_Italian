package italian;

import gate.creole.PackagedController;
import gate.creole.metadata.AutoInstance;
import gate.creole.metadata.AutoInstanceParam;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Italian IE System",
    comment = "Ready-made Italian IE application",
    autoinstances = @AutoInstance(parameters = {
	@AutoInstanceParam(name="pipelineURL", value="italian.gapp"),
	@AutoInstanceParam(name="menu", value="Italian")}))
public class ItalianIE extends PackagedController {

  private static final long serialVersionUID = 5965895217633412732L;

}
