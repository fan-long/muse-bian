package org.museframework.bian.tradesettlement;

import org.museframework.bian.tradesettlement.dto.ExchangeMarketTradeSettlementConfirmationWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.ExchangeMarketTradeSettlementConfirmationWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.ExecuteMarketTradeSettlementConfirmationWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.ExecuteMarketTradeSettlementConfirmationWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.InitiateMarketTradeSettlementConfirmationWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.InitiateMarketTradeSettlementConfirmationWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.NotifyMarketTradeSettlementConfirmationWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.NotifyMarketTradeSettlementConfirmationWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.RequestMarketTradeSettlementConfirmationWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.RequestMarketTradeSettlementConfirmationWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.RetrieveMarketTradeSettlementConfirmationWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.RetrieveMarketTradeSettlementConfirmationWorkstepResponse;
import org.museframework.bian.tradesettlement.dto.UpdateMarketTradeSettlementConfirmationWorkstepRequest;
import org.museframework.bian.tradesettlement.dto.UpdateMarketTradeSettlementConfirmationWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Market Trade Cash Settlement Workstep in the context of executing the Market Trade Cash Settlement Workstep")
@GenericDomain(name="TradeSettlement", group="MarketTradeSettlementConfirmationWorkstep")
public interface BqMarketTradeSettlementConfirmationWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Market Trade Settlement Confirmation Workstep")
    ExchangeMarketTradeSettlementConfirmationWorkstepResponse exchangeMarketTradeSettlementConfirmationWorkstep(ExchangeMarketTradeSettlementConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Trade Settlement Confirmation Workstep")
    ExecuteMarketTradeSettlementConfirmationWorkstepResponse executeMarketTradeSettlementConfirmationWorkstep(ExecuteMarketTradeSettlementConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Trade Settlement Confirmation Workstep")
    InitiateMarketTradeSettlementConfirmationWorkstepResponse initiateMarketTradeSettlementConfirmationWorkstep(InitiateMarketTradeSettlementConfirmationWorkstepRequest req);

    @Description("Notify Market Trade Settlement Confirmation Workstep")
    NotifyMarketTradeSettlementConfirmationWorkstepResponse notifyMarketTradeSettlementConfirmationWorkstep(NotifyMarketTradeSettlementConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Trade Settlement Confirmation Workstep")
    RequestMarketTradeSettlementConfirmationWorkstepResponse requestMarketTradeSettlementConfirmationWorkstep(RequestMarketTradeSettlementConfirmationWorkstepRequest req);

    @Description("Retrieve Market Trade Settlement Confirmation Workstep")
    RetrieveMarketTradeSettlementConfirmationWorkstepResponse retrieveMarketTradeSettlementConfirmationWorkstep(RetrieveMarketTradeSettlementConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Trade Settlement Confirmation Workstep")
    UpdateMarketTradeSettlementConfirmationWorkstepResponse updateMarketTradeSettlementConfirmationWorkstep(UpdateMarketTradeSettlementConfirmationWorkstepRequest req);
}