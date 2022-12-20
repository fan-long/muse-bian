package org.museframework.bian.productdesign;

import org.museframework.bian.productdesign.dto.CaptureFunctionalRequirementsRequest;
import org.museframework.bian.productdesign.dto.CaptureFunctionalRequirementsResponse;
import org.museframework.bian.productdesign.dto.RequestFunctionalRequirementsRequest;
import org.museframework.bian.productdesign.dto.RequestFunctionalRequirementsResponse;
import org.museframework.bian.productdesign.dto.RetrieveFunctionalRequirementsRequest;
import org.museframework.bian.productdesign.dto.RetrieveFunctionalRequirementsResponse;
import org.museframework.bian.productdesign.dto.UpdateFunctionalRequirementsRequest;
import org.museframework.bian.productdesign.dto.UpdateFunctionalRequirementsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="ProductDesign", group="FunctionalRequirements")
public interface BqFunctionalRequirements {
    @GenericDtxEndpoint
    @Description("UpBQ Update the functional requirements or other properties of a the specification")
    UpdateFunctionalRequirementsResponse updateFunctionalRequirements(UpdateFunctionalRequirementsRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture usage reports for the product or service specification")
    CaptureFunctionalRequirementsResponse captureFunctionalRequirements(CaptureFunctionalRequirementsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request changes or improvements to the specification")
    RequestFunctionalRequirementsResponse requestFunctionalRequirements(RequestFunctionalRequirementsRequest req);

    @Description("ReBQ Retrieve details about the product or service specification and any associated properties")
    RetrieveFunctionalRequirementsResponse retrieveFunctionalRequirements(RetrieveFunctionalRequirementsRequest req);
}