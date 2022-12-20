package org.museframework.bian.systemdevelopment;

import org.museframework.bian.systemdevelopment.dto.CaptureUsageSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.CaptureUsageSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RequestUsageSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RequestUsageSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RetrieveUsageSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RetrieveUsageSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.UpdateUsageSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.UpdateUsageSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="SystemDevelopment", group="UsageSpecification")
public interface BqUsageSpecification {
    @GenericDtxEndpoint
    @Description("UpBQ Update aspects of the usage specification")
    UpdateUsageSpecificationResponse updateUsageSpecification(UpdateUsageSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture details relating to the usage specification activity")
    CaptureUsageSpecificationResponse captureUsageSpecification(CaptureUsageSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the usage specification")
    RequestUsageSpecificationResponse requestUsageSpecification(RequestUsageSpecificationRequest req);

    @Description("ReBQ Retrieve details about the usage specification tasks")
    RetrieveUsageSpecificationResponse retrieveUsageSpecification(RetrieveUsageSpecificationRequest req);
}