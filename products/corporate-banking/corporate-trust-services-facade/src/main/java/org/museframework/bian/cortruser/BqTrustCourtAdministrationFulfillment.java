package org.museframework.bian.cortruser;

import org.museframework.bian.cortruser.dto.ExchangeTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExchangeTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.cortruser.dto.ExecuteTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExecuteTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.cortruser.dto.InitiateTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.cortruser.dto.InitiateTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.cortruser.dto.NotifyTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.cortruser.dto.NotifyTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RequestTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RequestTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RetrieveTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RetrieveTrustCourtAdministrationFulfillmentResponse;
import org.museframework.bian.cortruser.dto.UpdateTrustCourtAdministrationFulfillmentRequest;
import org.museframework.bian.cortruser.dto.UpdateTrustCourtAdministrationFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment")
@GenericDomain(name="CorporateTrustServices", group="TrustCourtAdministrationFulfillment")
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