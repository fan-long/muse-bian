package org.museframework.bian.quotemanagement;

import org.museframework.bian.quotemanagement.dto.ExchangeMarketQuoteSelectionWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.ExchangeMarketQuoteSelectionWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.ExecuteMarketQuoteSelectionWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.ExecuteMarketQuoteSelectionWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.InitiateMarketQuoteSelectionWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.InitiateMarketQuoteSelectionWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.NotifyMarketQuoteSelectionWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.NotifyMarketQuoteSelectionWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.RequestMarketQuoteSelectionWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.RequestMarketQuoteSelectionWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.RetrieveMarketQuoteSelectionWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.RetrieveMarketQuoteSelectionWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.UpdateMarketQuoteSelectionWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.UpdateMarketQuoteSelectionWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Market Quote Request Workstep in the context of executing the Market Quote Request Workstep")
@GenericDomain(name="QuoteManagement", group="MarketQuoteSelectionWorkstep")
public interface BqMarketQuoteSelectionWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Market Quote Selection Workstep")
    ExchangeMarketQuoteSelectionWorkstepResponse exchangeMarketQuoteSelectionWorkstep(ExchangeMarketQuoteSelectionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Quote Selection Workstep")
    ExecuteMarketQuoteSelectionWorkstepResponse executeMarketQuoteSelectionWorkstep(ExecuteMarketQuoteSelectionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Quote Selection Workstep")
    InitiateMarketQuoteSelectionWorkstepResponse initiateMarketQuoteSelectionWorkstep(InitiateMarketQuoteSelectionWorkstepRequest req);

    @Description("Notify Market Quote Selection Workstep")
    NotifyMarketQuoteSelectionWorkstepResponse notifyMarketQuoteSelectionWorkstep(NotifyMarketQuoteSelectionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Quote Selection Workstep")
    RequestMarketQuoteSelectionWorkstepResponse requestMarketQuoteSelectionWorkstep(RequestMarketQuoteSelectionWorkstepRequest req);

    @Description("Retrieve Market Quote Selection Workstep")
    RetrieveMarketQuoteSelectionWorkstepResponse retrieveMarketQuoteSelectionWorkstep(RetrieveMarketQuoteSelectionWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Quote Selection Workstep")
    UpdateMarketQuoteSelectionWorkstepResponse updateMarketQuoteSelectionWorkstep(UpdateMarketQuoteSelectionWorkstepRequest req);
}