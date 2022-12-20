package org.museframework.bian.publicoffering;

import org.museframework.bian.publicoffering.dto.ExchangePublicPlacementRoadshowandMarketingFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.ExchangePublicPlacementRoadshowandMarketingFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.ExecutePublicPlacementRoadshowandMarketingFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.ExecutePublicPlacementRoadshowandMarketingFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.InitiatePublicPlacementRoadshowandMarketingFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.InitiatePublicPlacementRoadshowandMarketingFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.NotifyPublicPlacementRoadshowandMarketingFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.NotifyPublicPlacementRoadshowandMarketingFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.RequestPublicPlacementRoadshowandMarketingFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.RequestPublicPlacementRoadshowandMarketingFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.RetrievePublicPlacementRoadshowandMarketingFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.RetrievePublicPlacementRoadshowandMarketingFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.UpdatePublicPlacementRoadshowandMarketingFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.UpdatePublicPlacementRoadshowandMarketingFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Public Placement IPO and Underwriting Fulfillment arrangement within the Public Placement IPO and Underwriting Fulfillment")
@GenericDomain(name="PublicOffering", group="PublicPlacementRoadshowandMarketingFulfillment")
public interface BqPublicPlacementRoadshowandMarketingFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Public Placement Roadshow and Marketing Fulfillment")
    ExchangePublicPlacementRoadshowandMarketingFulfillmentResponse exchangePublicPlacementRoadshowandMarketingFulfillment(ExchangePublicPlacementRoadshowandMarketingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Public Placement Roadshow and Marketing Fulfillment")
    ExecutePublicPlacementRoadshowandMarketingFulfillmentResponse executePublicPlacementRoadshowandMarketingFulfillment(ExecutePublicPlacementRoadshowandMarketingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Public Placement Roadshow and Marketing Fulfillment")
    InitiatePublicPlacementRoadshowandMarketingFulfillmentResponse initiatePublicPlacementRoadshowandMarketingFulfillment(InitiatePublicPlacementRoadshowandMarketingFulfillmentRequest req);

    @Description("Notify Public Placement Roadshow and Marketing Fulfillment")
    NotifyPublicPlacementRoadshowandMarketingFulfillmentResponse notifyPublicPlacementRoadshowandMarketingFulfillment(NotifyPublicPlacementRoadshowandMarketingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Public Placement Roadshow and Marketing Fulfillment")
    RequestPublicPlacementRoadshowandMarketingFulfillmentResponse requestPublicPlacementRoadshowandMarketingFulfillment(RequestPublicPlacementRoadshowandMarketingFulfillmentRequest req);

    @Description("Retrieve Public Placement Roadshow and Marketing Fulfillment")
    RetrievePublicPlacementRoadshowandMarketingFulfillmentResponse retrievePublicPlacementRoadshowandMarketingFulfillment(RetrievePublicPlacementRoadshowandMarketingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Public Placement Roadshow and Marketing Fulfillment")
    UpdatePublicPlacementRoadshowandMarketingFulfillmentResponse updatePublicPlacementRoadshowandMarketingFulfillment(UpdatePublicPlacementRoadshowandMarketingFulfillmentRequest req);
}