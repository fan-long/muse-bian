package org.museframework.bian.trustservices;

import org.museframework.bian.trustservices.dto.ExchangeTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.trustservices.dto.ExchangeTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.trustservices.dto.ExecuteTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.trustservices.dto.ExecuteTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.trustservices.dto.InitiateTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.trustservices.dto.InitiateTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.trustservices.dto.NotifyTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.trustservices.dto.NotifyTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.trustservices.dto.RequestTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.trustservices.dto.RequestTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.trustservices.dto.RetrieveTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.trustservices.dto.RetrieveTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.trustservices.dto.UpdateTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.trustservices.dto.UpdateTrustCourtAdministrationFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Estate, Inheritance and Income Tax Fulfillment arrangement within the Trust Estate, Inheritance and Income Tax Fulfillment")
@GenericDomain(name="TrustServices", group="TrustCourtAdministrationFulfillment")
public interface BqTrustCourtAdministrationFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Trust Court Administration Fulfillment")
    ExchangeTrustCourtAdministrationFulfillmentResponse exchangeTrustCourtAdministrationFulfillment(ExchangeTrustCourtAdministrationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trust Court Administration Fulfillment")
    ExecuteTrustCourtAdministrationFulfillmentResponse executeTrustCourtAdministrationFulfillment(ExecuteTrustCourtAdministrationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trust Court Administration Fulfillment")
    InitiateTrustCourtAdministrationFulfillmentResponse initiateTrustCourtAdministrationFulfillment(InitiateTrustCourtAdministrationFulfillmentRequest req);

    @Description("Notify Trust Court Administration Fulfillment")
    NotifyTrustCourtAdministrationFulfillmentResponse notifyTrustCourtAdministrationFulfillment(NotifyTrustCourtAdministrationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Trust Court Administration Fulfillment")
    RequestTrustCourtAdministrationFulfillmentResponse requestTrustCourtAdministrationFulfillment(RequestTrustCourtAdministrationFulfillmentRequest req);

    @Description("Retrieve Trust Court Administration Fulfillment")
    RetrieveTrustCourtAdministrationFulfillmentResponse retrieveTrustCourtAdministrationFulfillment(RetrieveTrustCourtAdministrationFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Trust Court Administration Fulfillment")
    UpdateTrustCourtAdministrationFulfillmentResponse updateTrustCourtAdministrationFulfillment(UpdateTrustCourtAdministrationFulfillmentRequest req);
}