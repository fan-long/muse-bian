package org.museframework.bian.quotemanagement;

import org.museframework.bian.quotemanagement.dto.ExchangeMarketQuoteRequestWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.ExchangeMarketQuoteRequestWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.ExecuteMarketQuoteRequestWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.ExecuteMarketQuoteRequestWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.InitiateMarketQuoteRequestWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.InitiateMarketQuoteRequestWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.NotifyMarketQuoteRequestWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.NotifyMarketQuoteRequestWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.RequestMarketQuoteRequestWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.RequestMarketQuoteRequestWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.RetrieveMarketQuoteRequestWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.RetrieveMarketQuoteRequestWorkstepResponse;
import org.museframework.bian.quotemanagement.dto.UpdateMarketQuoteRequestWorkstepRequest;
import org.museframework.bian.quotemanagement.dto.UpdateMarketQuoteRequestWorkstepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A course of action for doing Market Quote Request Workstep in the context of executing the Market Quote Request Workstep")
@GenericDomain(name="QuoteManagement", group="MarketQuoteRequestWorkstep")
public interface BqMarketQuoteRequestWorkstep {
    @GenericDtxEndpoint
    @Description("Exchange Market Quote Request Workstep")
    ExchangeMarketQuoteRequestWorkstepResponse exchangeMarketQuoteRequestWorkstep(ExchangeMarketQuoteRequestWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Quote Request Workstep")
    ExecuteMarketQuoteRequestWorkstepResponse executeMarketQuoteRequestWorkstep(ExecuteMarketQuoteRequestWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Quote Request Workstep")
    InitiateMarketQuoteRequestWorkstepResponse initiateMarketQuoteRequestWorkstep(InitiateMarketQuoteRequestWorkstepRequest req);

    @Description("Notify Market Quote Request Workstep")
    NotifyMarketQuoteRequestWorkstepResponse notifyMarketQuoteRequestWorkstep(NotifyMarketQuoteRequestWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Quote Request Workstep")
    RequestMarketQuoteRequestWorkstepResponse requestMarketQuoteRequestWorkstep(RequestMarketQuoteRequestWorkstepRequest req);

    @Description("Retrieve Market Quote Request Workstep")
    RetrieveMarketQuoteRequestWorkstepResponse retrieveMarketQuoteRequestWorkstep(RetrieveMarketQuoteRequestWorkstepRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Quote Request Workstep")
    UpdateMarketQuoteRequestWorkstepResponse updateMarketQuoteRequestWorkstep(UpdateMarketQuoteRequestWorkstepRequest req);
}