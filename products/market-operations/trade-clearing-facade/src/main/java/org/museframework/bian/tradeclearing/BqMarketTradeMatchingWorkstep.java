package org.museframework.bian.tradeclearing;

import org.museframework.bian.tradeclearing.dto.ExchangeMarketTradeMatchingWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.ExchangeMarketTradeMatchingWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.ExecuteMarketTradeMatchingWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.ExecuteMarketTradeMatchingWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.InitiateMarketTradeMatchingWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.InitiateMarketTradeMatchingWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.NotifyMarketTradeMatchingWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.NotifyMarketTradeMatchingWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.RequestMarketTradeMatchingWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.RequestMarketTradeMatchingWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.RetrieveMarketTradeMatchingWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.RetrieveMarketTradeMatchingWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.UpdateMarketTradeMatchingWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.UpdateMarketTradeMatchingWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Market Trade Settlement Initiation Workstep in the context of executing the Market Trade Settlement Initiation Workstep")
@GenericDomain(name="TradeClearing", group="MarketTradeMatchingWorkstep")
public interface BqMarketTradeMatchingWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Market Trade Matching Workstep")
    ExchangeMarketTradeMatchingWorkstepResponse exchangeMarketTradeMatchingWorkstep(ExchangeMarketTradeMatchingWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Trade Matching Workstep")
    ExecuteMarketTradeMatchingWorkstepResponse executeMarketTradeMatchingWorkstep(ExecuteMarketTradeMatchingWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Trade Matching Workstep")
    InitiateMarketTradeMatchingWorkstepResponse initiateMarketTradeMatchingWorkstep(InitiateMarketTradeMatchingWorkstepRequest req);

    @Description("Notify Market Trade Matching Workstep")
    NotifyMarketTradeMatchingWorkstepResponse notifyMarketTradeMatchingWorkstep(NotifyMarketTradeMatchingWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Trade Matching Workstep")
    RequestMarketTradeMatchingWorkstepResponse requestMarketTradeMatchingWorkstep(RequestMarketTradeMatchingWorkstepRequest req);

    @Description("Retrieve Market Trade Matching Workstep")
    RetrieveMarketTradeMatchingWorkstepResponse retrieveMarketTradeMatchingWorkstep(RetrieveMarketTradeMatchingWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Trade Matching Workstep")
    UpdateMarketTradeMatchingWorkstepResponse updateMarketTradeMatchingWorkstep(UpdateMarketTradeMatchingWorkstepRequest req);
}