package org.museframework.bian.productdeployment;

import org.museframework.bian.productdeployment.dto.RequestServicingRequest;
import org.museframework.bian.productdeployment.dto.RequestServicingResponse;
import org.museframework.bian.productdeployment.dto.RetrieveServicingRequest;
import org.museframework.bian.productdeployment.dto.RetrieveServicingResponse;
import org.museframework.bian.productdeployment.dto.UpdateServicingRequest;
import org.museframework.bian.productdeployment.dto.UpdateServicingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="ProductDeployment", group="Servicing")
public interface BqServicing {
    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to the servicing tasks of the deployment")
    UpdateServicingResponse updateServicing(UpdateServicingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a servicing related deployment task")
    RequestServicingResponse requestServicing(RequestServicingRequest req);

    @Description("ReBQ Retrieve details about a servicing related deployment task or deliverable")
    RetrieveServicingResponse retrieveServicing(RetrieveServicingRequest req);
}