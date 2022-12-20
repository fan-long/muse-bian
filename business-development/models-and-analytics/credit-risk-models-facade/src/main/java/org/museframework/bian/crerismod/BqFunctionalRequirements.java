package org.museframework.bian.crerismod;

import org.museframework.bian.crerismod.dto.CaptureFunctionalRequirementsRequest;
import org.museframework.bian.crerismod.dto.CaptureFunctionalRequirementsResponse;
import org.museframework.bian.crerismod.dto.RequestFunctionalRequirementsRequest;
import org.museframework.bian.crerismod.dto.RequestFunctionalRequirementsResponse;
import org.museframework.bian.crerismod.dto.RetrieveFunctionalRequirementsRequest;
import org.museframework.bian.crerismod.dto.RetrieveFunctionalRequirementsResponse;
import org.museframework.bian.crerismod.dto.UpdateFunctionalRequirementsRequest;
import org.museframework.bian.crerismod.dto.UpdateFunctionalRequirementsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="CreditRiskModels", group="FunctionalRequirements")
public interface BqFunctionalRequirements {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Functional Requirements activity or event related information")
    CaptureFunctionalRequirementsResponse captureFunctionalRequirements(CaptureFunctionalRequirementsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Functional Requirements")
    RetrieveFunctionalRequirementsResponse retrieveFunctionalRequirements(RetrieveFunctionalRequirementsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Functional Requirements")
    RequestFunctionalRequirementsResponse requestFunctionalRequirements(RequestFunctionalRequirementsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Functional Requirements")
    UpdateFunctionalRequirementsResponse updateFunctionalRequirements(UpdateFunctionalRequirementsRequest req);
}