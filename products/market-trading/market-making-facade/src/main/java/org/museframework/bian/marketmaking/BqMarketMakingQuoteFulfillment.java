package org.museframework.bian.marketmaking;

import org.museframework.bian.marketmaking.dto.ExchangeMarketMakingQuoteFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.ExchangeMarketMakingQuoteFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.ExecuteMarketMakingQuoteFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.ExecuteMarketMakingQuoteFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.InitiateMarketMakingQuoteFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.InitiateMarketMakingQuoteFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.NotifyMarketMakingQuoteFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.NotifyMarketMakingQuoteFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.RequestMarketMakingQuoteFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.RequestMarketMakingQuoteFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.RetrieveMarketMakingQuoteFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.RetrieveMarketMakingQuoteFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.UpdateMarketMakingQuoteFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.UpdateMarketMakingQuoteFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Market Making Security Traded Position Fulfillment arrangement within the Market Making Security Traded Position Fulfillment")
@GenericDomain(name="MarketMaking", group="MarketMakingQuoteFulfillment")
public interface BqMarketMakingQuoteFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Market Making Quote Fulfillment")
    ExchangeMarketMakingQuoteFulfillmentResponse exchangeMarketMakingQuoteFulfillment(ExchangeMarketMakingQuoteFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Making Quote Fulfillment")
    ExecuteMarketMakingQuoteFulfillmentResponse executeMarketMakingQuoteFulfillment(ExecuteMarketMakingQuoteFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Making Quote Fulfillment")
    InitiateMarketMakingQuoteFulfillmentResponse initiateMarketMakingQuoteFulfillment(InitiateMarketMakingQuoteFulfillmentRequest req);

    @Description("Notify Market Making Quote Fulfillment")
    NotifyMarketMakingQuoteFulfillmentResponse notifyMarketMakingQuoteFulfillment(NotifyMarketMakingQuoteFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Making Quote Fulfillment")
    RequestMarketMakingQuoteFulfillmentResponse requestMarketMakingQuoteFulfillment(RequestMarketMakingQuoteFulfillmentRequest req);

    @Description("Retrieve Market Making Quote Fulfillment")
    RetrieveMarketMakingQuoteFulfillmentResponse retrieveMarketMakingQuoteFulfillment(RetrieveMarketMakingQuoteFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Making Quote Fulfillment")
    UpdateMarketMakingQuoteFulfillmentResponse updateMarketMakingQuoteFulfillment(UpdateMarketMakingQuoteFulfillmentRequest req);
}