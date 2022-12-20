package org.museframework.bian.marketmaking;

import org.museframework.bian.marketmaking.dto.ExchangeMarketMakingBuyandSellOrderFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.ExchangeMarketMakingBuyandSellOrderFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.ExecuteMarketMakingBuyandSellOrderFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.ExecuteMarketMakingBuyandSellOrderFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.InitiateMarketMakingBuyandSellOrderFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.InitiateMarketMakingBuyandSellOrderFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.NotifyMarketMakingBuyandSellOrderFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.NotifyMarketMakingBuyandSellOrderFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.RequestMarketMakingBuyandSellOrderFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.RequestMarketMakingBuyandSellOrderFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.RetrieveMarketMakingBuyandSellOrderFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.RetrieveMarketMakingBuyandSellOrderFulfillmentResponse;
import org.museframework.bian.marketmaking.dto.UpdateMarketMakingBuyandSellOrderFulfillmentRequest;
import org.museframework.bian.marketmaking.dto.UpdateMarketMakingBuyandSellOrderFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Market Making Security Traded Position Fulfillment arrangement within the Market Making Security Traded Position Fulfillment")
@GenericDomain(name="MarketMaking", group="MarketMakingBuyandSellOrderFulfillment")
public interface BqMarketMakingBuyandSellOrderFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Market Making Buy and Sell Order Fulfillment")
    ExchangeMarketMakingBuyandSellOrderFulfillmentResponse exchangeMarketMakingBuyandSellOrderFulfillment(ExchangeMarketMakingBuyandSellOrderFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Making Buy and Sell Order Fulfillment")
    ExecuteMarketMakingBuyandSellOrderFulfillmentResponse executeMarketMakingBuyandSellOrderFulfillment(ExecuteMarketMakingBuyandSellOrderFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Making Buy and Sell Order Fulfillment")
    InitiateMarketMakingBuyandSellOrderFulfillmentResponse initiateMarketMakingBuyandSellOrderFulfillment(InitiateMarketMakingBuyandSellOrderFulfillmentRequest req);

    @Description("Notify Market Making Buy and Sell Order Fulfillment")
    NotifyMarketMakingBuyandSellOrderFulfillmentResponse notifyMarketMakingBuyandSellOrderFulfillment(NotifyMarketMakingBuyandSellOrderFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Making Buy and Sell Order Fulfillment")
    RequestMarketMakingBuyandSellOrderFulfillmentResponse requestMarketMakingBuyandSellOrderFulfillment(RequestMarketMakingBuyandSellOrderFulfillmentRequest req);

    @Description("Retrieve Market Making Buy and Sell Order Fulfillment")
    RetrieveMarketMakingBuyandSellOrderFulfillmentResponse retrieveMarketMakingBuyandSellOrderFulfillment(RetrieveMarketMakingBuyandSellOrderFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Making Buy and Sell Order Fulfillment")
    UpdateMarketMakingBuyandSellOrderFulfillmentResponse updateMarketMakingBuyandSellOrderFulfillment(UpdateMarketMakingBuyandSellOrderFulfillmentRequest req);
}