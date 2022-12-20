package org.museframework.bian.productdeployment;

import org.museframework.bian.productdeployment.dto.RequestITOperationsRequest;
import org.museframework.bian.productdeployment.dto.RequestITOperationsResponse;
import org.museframework.bian.productdeployment.dto.RetrieveITOperationsRequest;
import org.museframework.bian.productdeployment.dto.RetrieveITOperationsResponse;
import org.museframework.bian.productdeployment.dto.UpdateITOperationsRequest;
import org.museframework.bian.productdeployment.dto.UpdateITOperationsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="ProductDeployment", group="ITOperations")
public interface BqITOperations {
    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to the IT operations tasks of the deployment")
    UpdateITOperationsResponse updateITOperations(UpdateITOperationsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in an IT operations related deployment task")
    RequestITOperationsResponse requestITOperations(RequestITOperationsRequest req);

    @Description("ReBQ Retrieve details about an IT operations related deployment task or deliverable")
    RetrieveITOperationsResponse retrieveITOperations(RetrieveITOperationsRequest req);
}