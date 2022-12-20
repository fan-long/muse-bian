package org.museframework.bian.fraudmodel;

import org.museframework.bian.fraudmodel.dto.CaptureFunctionalRequirementsRequest;
import org.museframework.bian.fraudmodel.dto.CaptureFunctionalRequirementsResponse;
import org.museframework.bian.fraudmodel.dto.RequestFunctionalRequirementsRequest;
import org.museframework.bian.fraudmodel.dto.RequestFunctionalRequirementsResponse;
import org.museframework.bian.fraudmodel.dto.RetrieveFunctionalRequirementsRequest;
import org.museframework.bian.fraudmodel.dto.RetrieveFunctionalRequirementsResponse;
import org.museframework.bian.fraudmodel.dto.UpdateFunctionalRequirementsRequest;
import org.museframework.bian.fraudmodel.dto.UpdateFunctionalRequirementsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="FraudModel", group="FunctionalRequirements")
public interface BqFunctionalRequirements {
    @GenericDtxEndpoint
    @Description("UpBQ Update the requirements or other properties of a model")
    UpdateFunctionalRequirementsResponse updateFunctionalRequirements(UpdateFunctionalRequirementsRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture usage reports for a fraud model")
    CaptureFunctionalRequirementsResponse captureFunctionalRequirements(CaptureFunctionalRequirementsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request changes or improvements to a model")
    RequestFunctionalRequirementsResponse requestFunctionalRequirements(RequestFunctionalRequirementsRequest req);

    @Description("ReBQ Retrieve details about the model specification and properties")
    RetrieveFunctionalRequirementsResponse retrieveFunctionalRequirements(RetrieveFunctionalRequirementsRequest req);
}