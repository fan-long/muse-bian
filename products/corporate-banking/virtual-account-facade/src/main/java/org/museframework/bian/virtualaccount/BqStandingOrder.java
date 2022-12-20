package org.museframework.bian.virtualaccount;

import org.museframework.bian.virtualaccount.dto.CaptureStandingOrderRequest;
import org.museframework.bian.virtualaccount.dto.CaptureStandingOrderResponse;
import org.museframework.bian.virtualaccount.dto.GrantStandingOrderRequest;
import org.museframework.bian.virtualaccount.dto.GrantStandingOrderResponse;
import org.museframework.bian.virtualaccount.dto.InitiateStandingOrderRequest;
import org.museframework.bian.virtualaccount.dto.InitiateStandingOrderResponse;
import org.museframework.bian.virtualaccount.dto.RequestStandingOrderRequest;
import org.museframework.bian.virtualaccount.dto.RequestStandingOrderResponse;
import org.museframework.bian.virtualaccount.dto.RetrieveStandingOrderRequest;
import org.museframework.bian.virtualaccount.dto.RetrieveStandingOrderResponse;
import org.museframework.bian.virtualaccount.dto.UpdateStandingOrderRequest;
import org.museframework.bian.virtualaccount.dto.UpdateStandingOrderResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment")
@GenericDomain(name="VirtualAccount", group="StandingOrder")
public interface BqStandingOrder {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Standing Order activity or event related information")
    CaptureStandingOrderResponse captureStandingOrder(CaptureStandingOrderRequest req);

    @GenericDtxEndpoint
    @Description("GrBQ Obtain permission to act in relation to Standing Order")
    GrantStandingOrderResponse grantStandingOrder(GrantStandingOrderRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Standing Order")
    InitiateStandingOrderResponse initiateStandingOrder(InitiateStandingOrderRequest req);

    @Description("ReBQ Retrieve details about any aspect of Standing Order")
    RetrieveStandingOrderResponse retrieveStandingOrder(RetrieveStandingOrderRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Standing Order")
    RequestStandingOrderResponse requestStandingOrder(RequestStandingOrderRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Standing Order")
    UpdateStandingOrderResponse updateStandingOrder(UpdateStandingOrderRequest req);
}