package org.museframework.bian.tradeclearing;

import org.museframework.bian.tradeclearing.dto.ExchangeMarketTradeConfirmationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.ExchangeMarketTradeConfirmationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.ExecuteMarketTradeConfirmationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.ExecuteMarketTradeConfirmationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.InitiateMarketTradeConfirmationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.InitiateMarketTradeConfirmationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.NotifyMarketTradeConfirmationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.NotifyMarketTradeConfirmationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.RequestMarketTradeConfirmationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.RequestMarketTradeConfirmationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.RetrieveMarketTradeConfirmationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.RetrieveMarketTradeConfirmationWorkstepResponse;
import org.museframework.bian.tradeclearing.dto.UpdateMarketTradeConfirmationWorkstepRequest;
import org.museframework.bian.tradeclearing.dto.UpdateMarketTradeConfirmationWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Market Trade Settlement Initiation Workstep in the context of executing the Market Trade Settlement Initiation Workstep")
@GenericDomain(name="TradeClearing", group="MarketTradeConfirmationWorkstep")
public interface BqMarketTradeConfirmationWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Market Trade Confirmation Workstep")
    ExchangeMarketTradeConfirmationWorkstepResponse exchangeMarketTradeConfirmationWorkstep(ExchangeMarketTradeConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Trade Confirmation Workstep")
    ExecuteMarketTradeConfirmationWorkstepResponse executeMarketTradeConfirmationWorkstep(ExecuteMarketTradeConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Trade Confirmation Workstep")
    InitiateMarketTradeConfirmationWorkstepResponse initiateMarketTradeConfirmationWorkstep(InitiateMarketTradeConfirmationWorkstepRequest req);

    @Description("Notify Market Trade Confirmation Workstep")
    NotifyMarketTradeConfirmationWorkstepResponse notifyMarketTradeConfirmationWorkstep(NotifyMarketTradeConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Trade Confirmation Workstep")
    RequestMarketTradeConfirmationWorkstepResponse requestMarketTradeConfirmationWorkstep(RequestMarketTradeConfirmationWorkstepRequest req);

    @Description("Retrieve Market Trade Confirmation Workstep")
    RetrieveMarketTradeConfirmationWorkstepResponse retrieveMarketTradeConfirmationWorkstep(RetrieveMarketTradeConfirmationWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Trade Confirmation Workstep")
    UpdateMarketTradeConfirmationWorkstepResponse updateMarketTradeConfirmationWorkstep(UpdateMarketTradeConfirmationWorkstepRequest req);
}