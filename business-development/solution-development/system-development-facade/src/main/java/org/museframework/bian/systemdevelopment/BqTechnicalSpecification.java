package org.museframework.bian.systemdevelopment;

import org.museframework.bian.systemdevelopment.dto.CaptureTechnicalSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.CaptureTechnicalSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RequestTechnicalSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RequestTechnicalSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RetrieveTechnicalSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RetrieveTechnicalSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.UpdateTechnicalSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.UpdateTechnicalSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="SystemDevelopment", group="TechnicalSpecification")
public interface BqTechnicalSpecification {
    @GenericDtxEndpoint
    @Description("UpBQ Update aspects of the technical specification")
    UpdateTechnicalSpecificationResponse updateTechnicalSpecification(UpdateTechnicalSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture details relating to the technical specification activity")
    CaptureTechnicalSpecificationResponse captureTechnicalSpecification(CaptureTechnicalSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the technical specification")
    RequestTechnicalSpecificationResponse requestTechnicalSpecification(RequestTechnicalSpecificationRequest req);

    @Description("ReBQ Retrieve details about the technical specification tasks")
    RetrieveTechnicalSpecificationResponse retrieveTechnicalSpecification(RetrieveTechnicalSpecificationRequest req);
}