package org.museframework.bian.notionalpooling;

import org.museframework.bian.notionalpooling.dto.ExchangeNotionalAccountArrangementFulfillmentRequest;
import org.museframework.bian.notionalpooling.dto.ExchangeNotionalAccountArrangementFulfillmentResponse;
import org.museframework.bian.notionalpooling.dto.ExecuteNotionalAccountArrangementFulfillmentRequest;
import org.museframework.bian.notionalpooling.dto.ExecuteNotionalAccountArrangementFulfillmentResponse;
import org.museframework.bian.notionalpooling.dto.InitiateNotionalAccountArrangementFulfillmentRequest;
import org.museframework.bian.notionalpooling.dto.InitiateNotionalAccountArrangementFulfillmentResponse;
import org.museframework.bian.notionalpooling.dto.NotifyNotionalAccountArrangementFulfillmentRequest;
import org.museframework.bian.notionalpooling.dto.NotifyNotionalAccountArrangementFulfillmentResponse;
import org.museframework.bian.notionalpooling.dto.RequestNotionalAccountArrangementFulfillmentRequest;
import org.museframework.bian.notionalpooling.dto.RequestNotionalAccountArrangementFulfillmentResponse;
import org.museframework.bian.notionalpooling.dto.RetrieveNotionalAccountArrangementFulfillmentRequest;
import org.museframework.bian.notionalpooling.dto.RetrieveNotionalAccountArrangementFulfillmentResponse;
import org.museframework.bian.notionalpooling.dto.UpdateNotionalAccountArrangementFulfillmentRequest;
import org.museframework.bian.notionalpooling.dto.UpdateNotionalAccountArrangementFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Notional Account Interest Allocation Fulfillment arrangement within the Notional Account Interest Allocation Fulfillment")
@GenericDomain(name="NotionalPooling", group="NotionalAccountArrangementFulfillment")
public interface BqNotionalAccountArrangementFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Notional Account Arrangement Fulfillment")
    ExchangeNotionalAccountArrangementFulfillmentResponse exchangeNotionalAccountArrangementFulfillment(ExchangeNotionalAccountArrangementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Notional Account Arrangement Fulfillment")
    ExecuteNotionalAccountArrangementFulfillmentResponse executeNotionalAccountArrangementFulfillment(ExecuteNotionalAccountArrangementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Notional Account Arrangement Fulfillment")
    InitiateNotionalAccountArrangementFulfillmentResponse initiateNotionalAccountArrangementFulfillment(InitiateNotionalAccountArrangementFulfillmentRequest req);

    @Description("Notify Notional Account Arrangement Fulfillment")
    NotifyNotionalAccountArrangementFulfillmentResponse notifyNotionalAccountArrangementFulfillment(NotifyNotionalAccountArrangementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Notional Account Arrangement Fulfillment")
    RequestNotionalAccountArrangementFulfillmentResponse requestNotionalAccountArrangementFulfillment(RequestNotionalAccountArrangementFulfillmentRequest req);

    @Description("Retrieve Notional Account Arrangement Fulfillment")
    RetrieveNotionalAccountArrangementFulfillmentResponse retrieveNotionalAccountArrangementFulfillment(RetrieveNotionalAccountArrangementFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Notional Account Arrangement Fulfillment")
    UpdateNotionalAccountArrangementFulfillmentResponse updateNotionalAccountArrangementFulfillment(UpdateNotionalAccountArrangementFulfillmentRequest req);
}