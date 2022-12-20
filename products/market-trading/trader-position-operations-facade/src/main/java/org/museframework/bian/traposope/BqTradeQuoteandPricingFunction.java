package org.museframework.bian.traposope;

import org.museframework.bian.traposope.dto.ExchangeTradeQuoteandPricingFunctionRequest;
import org.museframework.bian.traposope.dto.ExchangeTradeQuoteandPricingFunctionResponse;
import org.museframework.bian.traposope.dto.ExecuteTradeQuoteandPricingFunctionRequest;
import org.museframework.bian.traposope.dto.ExecuteTradeQuoteandPricingFunctionResponse;
import org.museframework.bian.traposope.dto.InitiateTradeQuoteandPricingFunctionRequest;
import org.museframework.bian.traposope.dto.InitiateTradeQuoteandPricingFunctionResponse;
import org.museframework.bian.traposope.dto.NotifyTradeQuoteandPricingFunctionRequest;
import org.museframework.bian.traposope.dto.NotifyTradeQuoteandPricingFunctionResponse;
import org.museframework.bian.traposope.dto.RequestTradeQuoteandPricingFunctionRequest;
import org.museframework.bian.traposope.dto.RequestTradeQuoteandPricingFunctionResponse;
import org.museframework.bian.traposope.dto.RetrieveTradeQuoteandPricingFunctionRequest;
import org.museframework.bian.traposope.dto.RetrieveTradeQuoteandPricingFunctionResponse;
import org.museframework.bian.traposope.dto.UpdateTradeQuoteandPricingFunctionRequest;
import org.museframework.bian.traposope.dto.UpdateTradeQuoteandPricingFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function")
@GenericDomain(name="TraderPositionOperations", group="TradeQuoteandPricingFunction")
public interface BqTradeQuoteandPricingFunction {
    @GenericDtxEndpoint
    @Description("Exchange Trade Quote and Pricing Function")
    ExchangeTradeQuoteandPricingFunctionResponse exchangeTradeQuoteandPricingFunction(ExchangeTradeQuoteandPricingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trade Quote and Pricing Function")
    ExecuteTradeQuoteandPricingFunctionResponse executeTradeQuoteandPricingFunction(ExecuteTradeQuoteandPricingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trade Quote and Pricing Function")
    InitiateTradeQuoteandPricingFunctionResponse initiateTradeQuoteandPricingFunction(InitiateTradeQuoteandPricingFunctionRequest req);

    @Description("Notify Trade Quote and Pricing Function")
    NotifyTradeQuoteandPricingFunctionResponse notifyTradeQuoteandPricingFunction(NotifyTradeQuoteandPricingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Trade Quote and Pricing Function")
    RequestTradeQuoteandPricingFunctionResponse requestTradeQuoteandPricingFunction(RequestTradeQuoteandPricingFunctionRequest req);

    @Description("Retrieve Trade Quote and Pricing Function")
    RetrieveTradeQuoteandPricingFunctionResponse retrieveTradeQuoteandPricingFunction(RetrieveTradeQuoteandPricingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Trade Quote and Pricing Function")
    UpdateTradeQuoteandPricingFunctionResponse updateTradeQuoteandPricingFunction(UpdateTradeQuoteandPricingFunctionRequest req);
}