package org.museframework.bian.productdeployment;

import org.museframework.bian.productdeployment.dto.RequestProductionRequest;
import org.museframework.bian.productdeployment.dto.RequestProductionResponse;
import org.museframework.bian.productdeployment.dto.RetrieveProductionRequest;
import org.museframework.bian.productdeployment.dto.RetrieveProductionResponse;
import org.museframework.bian.productdeployment.dto.UpdateProductionRequest;
import org.museframework.bian.productdeployment.dto.UpdateProductionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="ProductDeployment", group="Production")
public interface BqProduction {
    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to the production tasks of the deployment")
    UpdateProductionResponse updateProduction(UpdateProductionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a production related deployment task")
    RequestProductionResponse requestProduction(RequestProductionRequest req);

    @Description("ReBQ Retrieve details about a production related deployment task or deliverable")
    RetrieveProductionResponse retrieveProduction(RetrieveProductionRequest req);
}