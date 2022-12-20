package org.museframework.bian.systemdevelopment;

import org.museframework.bian.systemdevelopment.dto.CaptureTestingSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.CaptureTestingSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RequestTestingSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RequestTestingSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.RetrieveTestingSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.RetrieveTestingSpecificationResponse;
import org.museframework.bian.systemdevelopment.dto.UpdateTestingSpecificationRequest;
import org.museframework.bian.systemdevelopment.dto.UpdateTestingSpecificationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="SystemDevelopment", group="TestingSpecification")
public interface BqTestingSpecification {
    @GenericDtxEndpoint
    @Description("UpBQ Update aspects of the testing specification")
    UpdateTestingSpecificationResponse updateTestingSpecification(UpdateTestingSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture details relating to the testing specification activity")
    CaptureTestingSpecificationResponse captureTestingSpecification(CaptureTestingSpecificationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the testing specification")
    RequestTestingSpecificationResponse requestTestingSpecification(RequestTestingSpecificationRequest req);

    @Description("ReBQ Retrieve details about the testing specification tasks")
    RetrieveTestingSpecificationResponse retrieveTestingSpecification(RetrieveTestingSpecificationRequest req);
}