package org.museframework.bian.productdeployment;

import org.museframework.bian.productdeployment.dto.RequestSalesandMarketingRequest;
import org.museframework.bian.productdeployment.dto.RequestSalesandMarketingResponse;
import org.museframework.bian.productdeployment.dto.RetrieveSalesandMarketingRequest;
import org.museframework.bian.productdeployment.dto.RetrieveSalesandMarketingResponse;
import org.museframework.bian.productdeployment.dto.UpdateSalesandMarketingRequest;
import org.museframework.bian.productdeployment.dto.UpdateSalesandMarketingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them  Examples: Functional module specification")
@GenericDomain(name="ProductDeployment", group="SalesandMarketing")
public interface BqSalesandMarketing {
    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to the sales and marketing tasks of the deployment")
    UpdateSalesandMarketingResponse updateSalesandMarketing(UpdateSalesandMarketingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in a sales and marketing related deployment task")
    RequestSalesandMarketingResponse requestSalesandMarketing(RequestSalesandMarketingRequest req);

    @Description("ReBQ Retrieve details about a sales and marketing related deployment task or deliverable")
    RetrieveSalesandMarketingResponse retrieveSalesandMarketing(RetrieveSalesandMarketingRequest req);
}