package org.museframework.bian.publicoffering;

import org.museframework.bian.publicoffering.dto.ExchangePublicPlacementProspectusFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.ExchangePublicPlacementProspectusFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.ExecutePublicPlacementProspectusFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.ExecutePublicPlacementProspectusFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.InitiatePublicPlacementProspectusFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.InitiatePublicPlacementProspectusFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.NotifyPublicPlacementProspectusFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.NotifyPublicPlacementProspectusFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.RequestPublicPlacementProspectusFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.RequestPublicPlacementProspectusFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.RetrievePublicPlacementProspectusFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.RetrievePublicPlacementProspectusFulfillmentResponse;
import org.museframework.bian.publicoffering.dto.UpdatePublicPlacementProspectusFulfillmentRequest;
import org.museframework.bian.publicoffering.dto.UpdatePublicPlacementProspectusFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Public Placement IPO and Underwriting Fulfillment arrangement within the Public Placement IPO and Underwriting Fulfillment")
@GenericDomain(name="PublicOffering", group="PublicPlacementProspectusFulfillment")
public interface BqPublicPlacementProspectusFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Public Placement Prospectus Fulfillment")
    ExchangePublicPlacementProspectusFulfillmentResponse exchangePublicPlacementProspectusFulfillment(ExchangePublicPlacementProspectusFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Public Placement Prospectus Fulfillment")
    ExecutePublicPlacementProspectusFulfillmentResponse executePublicPlacementProspectusFulfillment(ExecutePublicPlacementProspectusFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Public Placement Prospectus Fulfillment")
    InitiatePublicPlacementProspectusFulfillmentResponse initiatePublicPlacementProspectusFulfillment(InitiatePublicPlacementProspectusFulfillmentRequest req);

    @Description("Notify Public Placement Prospectus Fulfillment")
    NotifyPublicPlacementProspectusFulfillmentResponse notifyPublicPlacementProspectusFulfillment(NotifyPublicPlacementProspectusFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Public Placement Prospectus Fulfillment")
    RequestPublicPlacementProspectusFulfillmentResponse requestPublicPlacementProspectusFulfillment(RequestPublicPlacementProspectusFulfillmentRequest req);

    @Description("Retrieve Public Placement Prospectus Fulfillment")
    RetrievePublicPlacementProspectusFulfillmentResponse retrievePublicPlacementProspectusFulfillment(RetrievePublicPlacementProspectusFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Public Placement Prospectus Fulfillment")
    UpdatePublicPlacementProspectusFulfillmentResponse updatePublicPlacementProspectusFulfillment(UpdatePublicPlacementProspectusFulfillmentRequest req);
}