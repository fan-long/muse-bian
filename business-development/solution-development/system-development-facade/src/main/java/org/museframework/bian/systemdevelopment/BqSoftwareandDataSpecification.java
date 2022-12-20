package org.museframework.bian.systemdevelopment;

import org.museframework.bian.systemdevelopment.dto.CaptureSoftwareandDataSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.CaptureSoftwareandDataSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RequestSoftwareandDataSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RequestSoftwareandDataSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RetrieveSoftwareandDataSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RetrieveSoftwareandDataSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.UpdateSoftwareandDataSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.UpdateSoftwareandDataSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="SystemDevelopment", group="SoftwareandDataSpecification")
public interface BqSoftwareandDataSpecification {
    @GenericDtxEndpoint
    @Description("UpBQ Update aspects of the software and data specification")
    UpdateSoftwareandDataSpecificationResponse updateSoftwareandDataSpecification(UpdateSoftwareandDataSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture details relating to the software and data specification activity")
    CaptureSoftwareandDataSpecificationResponse captureSoftwareandDataSpecification(CaptureSoftwareandDataSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the software and data specification")
    RequestSoftwareandDataSpecificationResponse requestSoftwareandDataSpecification(RequestSoftwareandDataSpecificationRequest req);

    @Description("ReBQ Retrieve details about the software and data specification tasks")
    RetrieveSoftwareandDataSpecificationResponse retrieveSoftwareandDataSpecification(RetrieveSoftwareandDataSpecificationRequest req);
}