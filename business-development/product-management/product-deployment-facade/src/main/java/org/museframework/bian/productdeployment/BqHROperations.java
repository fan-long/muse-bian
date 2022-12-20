package org.museframework.bian.productdeployment;

import org.museframework.bian.productdeployment.dto.RequestHROperationsRequest;
import org.museframework.bian.productdeployment.dto.RequestHROperationsResponse;
import org.museframework.bian.productdeployment.dto.RetrieveHROperationsRequest;
import org.museframework.bian.productdeployment.dto.RetrieveHROperationsResponse;
import org.museframework.bian.productdeployment.dto.UpdateHROperationsRequest;
import org.museframework.bian.productdeployment.dto.UpdateHROperationsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="ProductDeployment", group="HROperations")
public interface BqHROperations {
    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to the staff operations tasks of the deployment")
    UpdateHROperationsResponse updateHROperations(UpdateHROperationsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a staff operations related deployment task")
    RequestHROperationsResponse requestHROperations(RequestHROperationsRequest req);

    @Description("ReBQ Retrieve details about a staff operations related deployment task or deliverable")
    RetrieveHROperationsResponse retrieveHROperations(RetrieveHROperationsRequest req);
}