package org.museframework.bian.productdeployment;

import org.museframework.bian.productdeployment.dto.RequestProductionSupportRequest;
import org.museframework.bian.productdeployment.dto.RequestProductionSupportResponse;
import org.museframework.bian.productdeployment.dto.RetrieveProductionSupportRequest;
import org.museframework.bian.productdeployment.dto.RetrieveProductionSupportResponse;
import org.museframework.bian.productdeployment.dto.UpdateProductionSupportRequest;
import org.museframework.bian.productdeployment.dto.UpdateProductionSupportResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="ProductDeployment", group="ProductionSupport")
public interface BqProductionSupport {
    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to the production support tasks of the deployment")
    UpdateProductionSupportResponse updateProductionSupport(UpdateProductionSupportRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a production support related deployment task")
    RequestProductionSupportResponse requestProductionSupport(RequestProductionSupportRequest req);

    @Description("ReBQ Retrieve details about a production support related deployment task or deliverable")
    RetrieveProductionSupportResponse retrieveProductionSupport(RetrieveProductionSupportRequest req);
}