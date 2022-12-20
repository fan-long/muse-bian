package org.museframework.bian.etradingworkbench;

import org.museframework.bian.etradingworkbench.dto.ExchangeMarketOrderQuotationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.ExchangeMarketOrderQuotationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.ExecuteMarketOrderQuotationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.ExecuteMarketOrderQuotationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.InitiateMarketOrderQuotationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.InitiateMarketOrderQuotationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.NotifyMarketOrderQuotationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.NotifyMarketOrderQuotationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.RequestMarketOrderQuotationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.RequestMarketOrderQuotationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.RetrieveMarketOrderQuotationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.RetrieveMarketOrderQuotationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.UpdateMarketOrderQuotationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.UpdateMarketOrderQuotationFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function")
@GenericDomain(name="eTradingWorkbench", group="MarketOrderQuotationFunction")
public interface BqMarketOrderQuotationFunction {
    @GenericDtxEndpoint
    @Description("Exchange Market Order Quotation Function")
    ExchangeMarketOrderQuotationFunctionResponse exchangeMarketOrderQuotationFunction(ExchangeMarketOrderQuotationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Order Quotation Function")
    ExecuteMarketOrderQuotationFunctionResponse executeMarketOrderQuotationFunction(ExecuteMarketOrderQuotationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Order Quotation Function")
    InitiateMarketOrderQuotationFunctionResponse initiateMarketOrderQuotationFunction(InitiateMarketOrderQuotationFunctionRequest req);

    @Description("Notify Market Order Quotation Function")
    NotifyMarketOrderQuotationFunctionResponse notifyMarketOrderQuotationFunction(NotifyMarketOrderQuotationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Order Quotation Function")
    RequestMarketOrderQuotationFunctionResponse requestMarketOrderQuotationFunction(RequestMarketOrderQuotationFunctionRequest req);

    @Description("Retrieve Market Order Quotation Function")
    RetrieveMarketOrderQuotationFunctionResponse retrieveMarketOrderQuotationFunction(RetrieveMarketOrderQuotationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Order Quotation Function")
    UpdateMarketOrderQuotationFunctionResponse updateMarketOrderQuotationFunction(UpdateMarketOrderQuotationFunctionRequest req);
}