package org.museframework.bian.privateplacement;

import org.museframework.bian.privateplacement.dto.ExchangePrivatePlacementFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.ExchangePrivatePlacementFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.ExecutePrivatePlacementFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.ExecutePrivatePlacementFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.InitiatePrivatePlacementFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.InitiatePrivatePlacementFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.NotifyPrivatePlacementFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.NotifyPrivatePlacementFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.RequestPrivatePlacementFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.RequestPrivatePlacementFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.RetrievePrivatePlacementFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.RetrievePrivatePlacementFulfillmentResponse;
import org.museframework.bian.privateplacement.dto.UpdatePrivatePlacementFulfillmentRequest;
import org.museframework.bian.privateplacement.dto.UpdatePrivatePlacementFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Private Placement Fulfillment arrangement within the Private Placement Fulfillment")
@GenericDomain(name="PrivatePlacement", group="PrivatePlacementFulfillment")
public interface BqPrivatePlacementFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Private Placement Fulfillment")
    ExchangePrivatePlacementFulfillmentResponse exchangePrivatePlacementFulfillment(ExchangePrivatePlacementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Private Placement Fulfillment")
    ExecutePrivatePlacementFulfillmentResponse executePrivatePlacementFulfillment(ExecutePrivatePlacementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Private Placement Fulfillment")
    InitiatePrivatePlacementFulfillmentResponse initiatePrivatePlacementFulfillment(InitiatePrivatePlacementFulfillmentRequest req);

    @Description("Notify Private Placement Fulfillment")
    NotifyPrivatePlacementFulfillmentResponse notifyPrivatePlacementFulfillment(NotifyPrivatePlacementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Private Placement Fulfillment")
    RequestPrivatePlacementFulfillmentResponse requestPrivatePlacementFulfillment(RequestPrivatePlacementFulfillmentRequest req);

    @Description("Retrieve Private Placement Fulfillment")
    RetrievePrivatePlacementFulfillmentResponse retrievePrivatePlacementFulfillment(RetrievePrivatePlacementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Private Placement Fulfillment")
    UpdatePrivatePlacementFulfillmentResponse updatePrivatePlacementFulfillment(UpdatePrivatePlacementFulfillmentRequest req);
}