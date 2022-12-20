package org.museframework.bian.productdeployment;

import org.museframework.bian.productdeployment.dto.RequestSystemsRequest;
import org.museframework.bian.productdeployment.dto.RequestSystemsResponse;
import org.museframework.bian.productdeployment.dto.RetrieveSystemsRequest;
import org.museframework.bian.productdeployment.dto.RetrieveSystemsResponse;
import org.museframework.bian.productdeployment.dto.UpdateSystemsRequest;
import org.museframework.bian.productdeployment.dto.UpdateSystemsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="ProductDeployment", group="Systems")
public interface BqSystems {
    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to the systems tasks of the deployment")
    UpdateSystemsResponse updateSystems(UpdateSystemsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a systems related deployment task")
    RequestSystemsResponse requestSystems(RequestSystemsRequest req);

    @Description("ReBQ Retrieve details about a systems related deployment task or deliverable")
    RetrieveSystemsResponse retrieveSystems(RetrieveSystemsRequest req);
}