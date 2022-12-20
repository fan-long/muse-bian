package org.museframework.bian.tradesettlement;

import org.museframework.bian.tradesettlement.dto.ExchangeMarketTradeCashSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.ExchangeMarketTradeCashSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.ExecuteMarketTradeCashSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.ExecuteMarketTradeCashSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.InitiateMarketTradeCashSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.InitiateMarketTradeCashSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.NotifyMarketTradeCashSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.NotifyMarketTradeCashSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.RequestMarketTradeCashSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.RequestMarketTradeCashSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.RetrieveMarketTradeCashSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.RetrieveMarketTradeCashSettlementWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.UpdateMarketTradeCashSettlementWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.UpdateMarketTradeCashSettlementWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Market Trade Cash Settlement Workstep in the context of executing the Market Trade Cash Settlement Workstep")
@GenericDomain(name="TradeSettlement", group="MarketTradeCashSettlementWorkstep")
public interface BqMarketTradeCashSettlementWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Market Trade Cash Settlement Workstep")
    ExchangeMarketTradeCashSettlementWorkstepResponse exchangeMarketTradeCashSettlementWorkstep(ExchangeMarketTradeCashSettlementWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Trade Cash Settlement Workstep")
    ExecuteMarketTradeCashSettlementWorkstepResponse executeMarketTradeCashSettlementWorkstep(ExecuteMarketTradeCashSettlementWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Trade Cash Settlement Workstep")
    InitiateMarketTradeCashSettlementWorkstepResponse initiateMarketTradeCashSettlementWorkstep(InitiateMarketTradeCashSettlementWorkstepRequest req);

    @Description("Notify Market Trade Cash Settlement Workstep")
    NotifyMarketTradeCashSettlementWorkstepResponse notifyMarketTradeCashSettlementWorkstep(NotifyMarketTradeCashSettlementWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Trade Cash Settlement Workstep")
    RequestMarketTradeCashSettlementWorkstepResponse requestMarketTradeCashSettlementWorkstep(RequestMarketTradeCashSettlementWorkstepRequest req);

    @Description("Retrieve Market Trade Cash Settlement Workstep")
    RetrieveMarketTradeCashSettlementWorkstepResponse retrieveMarketTradeCashSettlementWorkstep(RetrieveMarketTradeCashSettlementWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Trade Cash Settlement Workstep")
    UpdateMarketTradeCashSettlementWorkstepResponse updateMarketTradeCashSettlementWorkstep(UpdateMarketTradeCashSettlementWorkstepRequest req);
}