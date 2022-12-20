package org.museframework.bian.trustservices;

import org.museframework.bian.trustservices.dto.ExchangeTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.trustservices.dto.ExchangeTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.trustservices.dto.ExecuteTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.trustservices.dto.ExecuteTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.trustservices.dto.InitiateTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.trustservices.dto.InitiateTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.trustservices.dto.NotifyTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.trustservices.dto.NotifyTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.trustservices.dto.RequestTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.trustservices.dto.RequestTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.trustservices.dto.RetrieveTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.trustservices.dto.RetrieveTrustTaxandExpenseFulfillmentResponse;
import org.museframework.bian.trustservices.dto.UpdateTrustTaxandExpenseFulfillmentRequest;
import org.museframework.bian.trustservices.dto.UpdateTrustTaxandExpenseFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Estate, Inheritance and Income Tax Fulfillment arrangement within the Trust Estate, Inheritance and Income Tax Fulfillment")
@GenericDomain(name="TrustServices", group="TrustTaxandExpenseFulfillment")
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