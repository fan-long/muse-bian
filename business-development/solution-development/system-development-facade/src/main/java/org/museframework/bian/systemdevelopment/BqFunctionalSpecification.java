package org.museframework.bian.systemdevelopment;

import org.museframework.bian.systemdevelopment.dto.CaptureFunctionalSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.CaptureFunctionalSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RequestFunctionalSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RequestFunctionalSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RetrieveFunctionalSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RetrieveFunctionalSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.UpdateFunctionalSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.UpdateFunctionalSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="SystemDevelopment", group="FunctionalSpecification")
public interface BqFunctionalSpecification {
    @GenericDtxEndpoint
    @Description("UpBQ Update aspects of the functional specification")
    UpdateFunctionalSpecificationResponse updateFunctionalSpecification(UpdateFunctionalSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture details relating to the functional specification activity")
    CaptureFunctionalSpecificationResponse captureFunctionalSpecification(CaptureFunctionalSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the functional specification")
    RequestFunctionalSpecificationResponse requestFunctionalSpecification(RequestFunctionalSpecificationRequest req);

    @Description("ReBQ Retrieve details about the functional specification tasks")
    RetrieveFunctionalSpecificationResponse retrieveFunctionalSpecification(RetrieveFunctionalSpecificationRequest req);
}