package org.museframework.bian.cortruser;

import org.museframework.bian.cortruser.dto.ExchangeTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExchangeTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.cortruser.dto.ExecuteTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExecuteTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.cortruser.dto.InitiateTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.cortruser.dto.InitiateTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.cortruser.dto.NotifyTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.cortruser.dto.NotifyTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RequestTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RequestTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RetrieveTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RetrieveTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.cortruser.dto.UpdateTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.cortruser.dto.UpdateTrustTaxandExpenseFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment")
@GenericDomain(name="CorporateTrustServices", group="TrustTaxandExpenseFulfillment")
public interface BqTrustTaxandExpenseFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Trust Tax and Expense Fulfillment")
    ExchangeTrustTaxandExpenseFulfillmentResponse exchangeTrustTaxandExpenseFulfillment(ExchangeTrustTaxandExpenseFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trust Tax and Expense Fulfillment")
    ExecuteTrustTaxandExpenseFulfillmentResponse executeTrustTaxandExpenseFulfillment(ExecuteTrustTaxandExpenseFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trust Tax and Expense Fulfillment")
    InitiateTrustTaxandExpenseFulfillmentResponse initiateTrustTaxandExpenseFulfillment(InitiateTrustTaxandExpenseFulfillmentRequest req);

    @Description("Notify Trust Tax and Expense Fulfillment")
    NotifyTrustTaxandExpenseFulfillmentResponse notifyTrustTaxandExpenseFulfillment(NotifyTrustTaxandExpenseFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Trust Tax and Expense Fulfillment")
    RequestTrustTaxandExpenseFulfillmentResponse requestTrustTaxandExpenseFulfillment(RequestTrustTaxandExpenseFulfillmentRequest req);

    @Description("Retrieve Trust Tax and Expense Fulfillment")
    RetrieveTrustTaxandExpenseFulfillmentResponse retrieveTrustTaxandExpenseFulfillment(RetrieveTrustTaxandExpenseFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Trust Tax and Expense Fulfillment")
    UpdateTrustTaxandExpenseFulfillmentResponse updateTrustTaxandExpenseFulfillment(UpdateTrustTaxandExpenseFulfillmentRequest req);
}