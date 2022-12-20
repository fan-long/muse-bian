package org.museframework.bian.cusbehmod;

import org.museframework.bian.cusbehmod.dto.CaptureFunctionalRequirementsRequest;
import org.museframework.bian.cusbehmod.dto.CaptureFunctionalRequirementsResponse;
import org.museframework.bian.cusbehmod.dto.RequestFunctionalRequirementsRequest;
import org.museframework.bian.cusbehmod.dto.RequestFunctionalRequirementsResponse;
import org.museframework.bian.cusbehmod.dto.RetrieveFunctionalRequirementsRequest;
import org.museframework.bian.cusbehmod.dto.RetrieveFunctionalRequirementsResponse;
import org.museframework.bian.cusbehmod.dto.UpdateFunctionalRequirementsRequest;
import org.museframework.bian.cusbehmod.dto.UpdateFunctionalRequirementsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="CustomerBehaviorModels", group="FunctionalRequirements")
public interface BqFunctionalRequirements {
    @GenericDtxEndpoint
    @Description("UpBQ Update the requirements or other properties of a model")
    UpdateFunctionalRequirementsResponse updateFunctionalRequirements(UpdateFunctionalRequirementsRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture usage reports for a customer behavior model")
    CaptureFunctionalRequirementsResponse captureFunctionalRequirements(CaptureFunctionalRequirementsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request changes or improvements to a model")
    RequestFunctionalRequirementsResponse requestFunctionalRequirements(RequestFunctionalRequirementsRequest req);

    @Description("ReBQ Retrieve details about the model specification and properties")
    RetrieveFunctionalRequirementsResponse retrieveFunctionalRequirements(RetrieveFunctionalRequirementsRequest req);
}