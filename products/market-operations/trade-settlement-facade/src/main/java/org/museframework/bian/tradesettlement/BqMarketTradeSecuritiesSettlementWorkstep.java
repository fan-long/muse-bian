package org.museframework.bian.tradesettlement;

import org.museframework.bian.tradesettlement.dto.ExchangeMarketTradeSecuritiesSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.ExchangeMarketTradeSecuritiesSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.ExecuteMarketTradeSecuritiesSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.ExecuteMarketTradeSecuritiesSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.InitiateMarketTradeSecuritiesSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.InitiateMarketTradeSecuritiesSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.NotifyMarketTradeSecuritiesSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.NotifyMarketTradeSecuritiesSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.RequestMarketTradeSecuritiesSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.RequestMarketTradeSecuritiesSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.RetrieveMarketTradeSecuritiesSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.RetrieveMarketTradeSecuritiesSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.UpdateMarketTradeSecuritiesSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.UpdateMarketTradeSecuritiesSettlementWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Market Trade Cash Settlement Workstep in the context of executing the Market Trade Cash Settlement Workstep")
@GenericDomain(name="TradeSettlement", group="MarketTradeSecuritiesSettlementWorkstep")
public interface BqMarketTradeSecuritiesSettlementWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Market Trade Securities Settlement Workstep")
    ExchangeMarketTradeSecuritiesSettlementWorkstepResponse exchangeMarketTradeSecuritiesSettlementWorkstep(ExchangeMarketTradeSecuritiesSettlementWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Trade Securities Settlement Workstep")
    ExecuteMarketTradeSecuritiesSettlementWorkstepResponse executeMarketTradeSecuritiesSettlementWorkstep(ExecuteMarketTradeSecuritiesSettlementWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Trade Securities Settlement Workstep")
    InitiateMarketTradeSecuritiesSettlementWorkstepResponse initiateMarketTradeSecuritiesSettlementWorkstep(InitiateMarketTradeSecuritiesSettlementWorkstepRequest req);

    @Description("Notify Market Trade Securities Settlement Workstep")
    NotifyMarketTradeSecuritiesSettlementWorkstepResponse notifyMarketTradeSecuritiesSettlementWorkstep(NotifyMarketTradeSecuritiesSettlementWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Trade Securities Settlement Workstep")
    RequestMarketTradeSecuritiesSettlementWorkstepResponse requestMarketTradeSecuritiesSettlementWorkstep(RequestMarketTradeSecuritiesSettlementWorkstepRequest req);

    @Description("Retrieve Market Trade Securities Settlement Workstep")
    RetrieveMarketTradeSecuritiesSettlementWorkstepResponse retrieveMarketTradeSecuritiesSettlementWorkstep(RetrieveMarketTradeSecuritiesSettlementWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Trade Securities Settlement Workstep")
    UpdateMarketTradeSecuritiesSettlementWorkstepResponse updateMarketTradeSecuritiesSettlementWorkstep(UpdateMarketTradeSecuritiesSettlementWorkstepRequest req);
}