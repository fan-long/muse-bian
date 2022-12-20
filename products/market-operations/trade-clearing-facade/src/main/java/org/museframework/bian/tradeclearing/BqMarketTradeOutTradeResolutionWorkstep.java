package org.museframework.bian.tradeclearing;

import org.museframework.bian.tradeclearing.dto.ExchangeMarketTradeOutTradeResolutionWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.ExchangeMarketTradeOutTradeResolutionWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.ExecuteMarketTradeOutTradeResolutionWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.ExecuteMarketTradeOutTradeResolutionWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.InitiateMarketTradeOutTradeResolutionWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.InitiateMarketTradeOutTradeResolutionWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.NotifyMarketTradeOutTradeResolutionWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.NotifyMarketTradeOutTradeResolutionWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.RequestMarketTradeOutTradeResolutionWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.RequestMarketTradeOutTradeResolutionWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.RetrieveMarketTradeOutTradeResolutionWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.RetrieveMarketTradeOutTradeResolutionWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.UpdateMarketTradeOutTradeResolutionWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.UpdateMarketTradeOutTradeResolutionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Market Trade Settlement Initiation Workstep in the context of executing the Market Trade Settlement Initiation Workstep")
@GenericDomain(name="TradeClearing", group="MarketTradeOutTradeResolutionWorkstep")
public interface BqMarketTradeOutTradeResolutionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Market Trade Out Trade Resolution Workstep")
    ExchangeMarketTradeOutTradeResolutionWorkstepResponse exchangeMarketTradeOutTradeResolutionWorkstep(ExchangeMarketTradeOutTradeResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Trade Out Trade Resolution Workstep")
    ExecuteMarketTradeOutTradeResolutionWorkstepResponse executeMarketTradeOutTradeResolutionWorkstep(ExecuteMarketTradeOutTradeResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Trade Out Trade Resolution Workstep")
    InitiateMarketTradeOutTradeResolutionWorkstepResponse initiateMarketTradeOutTradeResolutionWorkstep(InitiateMarketTradeOutTradeResolutionWorkstepRequest req);

    @Description("Notify Market Trade Out Trade Resolution Workstep")
    NotifyMarketTradeOutTradeResolutionWorkstepResponse notifyMarketTradeOutTradeResolutionWorkstep(NotifyMarketTradeOutTradeResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Trade Out Trade Resolution Workstep")
    RequestMarketTradeOutTradeResolutionWorkstepResponse requestMarketTradeOutTradeResolutionWorkstep(RequestMarketTradeOutTradeResolutionWorkstepRequest req);

    @Description("Retrieve Market Trade Out Trade Resolution Workstep")
    RetrieveMarketTradeOutTradeResolutionWorkstepResponse retrieveMarketTradeOutTradeResolutionWorkstep(RetrieveMarketTradeOutTradeResolutionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Trade Out Trade Resolution Workstep")
    UpdateMarketTradeOutTradeResolutionWorkstepResponse updateMarketTradeOutTradeResolutionWorkstep(UpdateMarketTradeOutTradeResolutionWorkstepRequest req);
}