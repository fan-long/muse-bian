package org.museframework.bian.tradeclearing;

import org.museframework.bian.tradeclearing.dto.ExchangeMarketTradeSettlementInitiationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.ExchangeMarketTradeSettlementInitiationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.ExecuteMarketTradeSettlementInitiationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.ExecuteMarketTradeSettlementInitiationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.InitiateMarketTradeSettlementInitiationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.InitiateMarketTradeSettlementInitiationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.NotifyMarketTradeSettlementInitiationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.NotifyMarketTradeSettlementInitiationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.RequestMarketTradeSettlementInitiationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.RequestMarketTradeSettlementInitiationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.RetrieveMarketTradeSettlementInitiationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.RetrieveMarketTradeSettlementInitiationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.UpdateMarketTradeSettlementInitiationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.UpdateMarketTradeSettlementInitiationWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Market Trade Settlement Initiation Workstep in the context of executing the Market Trade Settlement Initiation Workstep")
@GenericDomain(name="TradeClearing", group="MarketTradeSettlementInitiationWorkstep")
public interface BqMarketTradeSettlementInitiationWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Market Trade Settlement Initiation Workstep")
    ExchangeMarketTradeSettlementInitiationWorkstepResponse exchangeMarketTradeSettlementInitiationWorkstep(ExchangeMarketTradeSettlementInitiationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Trade Settlement Initiation Workstep")
    ExecuteMarketTradeSettlementInitiationWorkstepResponse executeMarketTradeSettlementInitiationWorkstep(ExecuteMarketTradeSettlementInitiationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Trade Settlement Initiation Workstep")
    InitiateMarketTradeSettlementInitiationWorkstepResponse initiateMarketTradeSettlementInitiationWorkstep(InitiateMarketTradeSettlementInitiationWorkstepRequest req);

    @Description("Notify Market Trade Settlement Initiation Workstep")
    NotifyMarketTradeSettlementInitiationWorkstepResponse notifyMarketTradeSettlementInitiationWorkstep(NotifyMarketTradeSettlementInitiationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Trade Settlement Initiation Workstep")
    RequestMarketTradeSettlementInitiationWorkstepResponse requestMarketTradeSettlementInitiationWorkstep(RequestMarketTradeSettlementInitiationWorkstepRequest req);

    @Description("Retrieve Market Trade Settlement Initiation Workstep")
    RetrieveMarketTradeSettlementInitiationWorkstepResponse retrieveMarketTradeSettlementInitiationWorkstep(RetrieveMarketTradeSettlementInitiationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Trade Settlement Initiation Workstep")
    UpdateMarketTradeSettlementInitiationWorkstepResponse updateMarketTradeSettlementInitiationWorkstep(UpdateMarketTradeSettlementInitiationWorkstepRequest req);
}