package org.museframework.bian.etradingworkbench;

import org.museframework.bian.etradingworkbench.dto.ExchangeMarketPriceAnalysisFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.ExchangeMarketPriceAnalysisFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.ExecuteMarketPriceAnalysisFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.ExecuteMarketPriceAnalysisFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.InitiateMarketPriceAnalysisFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.InitiateMarketPriceAnalysisFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.NotifyMarketPriceAnalysisFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.NotifyMarketPriceAnalysisFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.RequestMarketPriceAnalysisFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.RequestMarketPriceAnalysisFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.RetrieveMarketPriceAnalysisFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.RetrieveMarketPriceAnalysisFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.UpdateMarketPriceAnalysisFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.UpdateMarketPriceAnalysisFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function")
@GenericDomain(name="eTradingWorkbench", group="MarketPriceAnalysisFunction")
public interface BqMarketPriceAnalysisFunction {
    @GenericDtxEndpoint
    @Description("Exchange Market Price Analysis Function")
    ExchangeMarketPriceAnalysisFunctionResponse exchangeMarketPriceAnalysisFunction(ExchangeMarketPriceAnalysisFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Price Analysis Function")
    ExecuteMarketPriceAnalysisFunctionResponse executeMarketPriceAnalysisFunction(ExecuteMarketPriceAnalysisFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Price Analysis Function")
    InitiateMarketPriceAnalysisFunctionResponse initiateMarketPriceAnalysisFunction(InitiateMarketPriceAnalysisFunctionRequest req);

    @Description("Notify Market Price Analysis Function")
    NotifyMarketPriceAnalysisFunctionResponse notifyMarketPriceAnalysisFunction(NotifyMarketPriceAnalysisFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Price Analysis Function")
    RequestMarketPriceAnalysisFunctionResponse requestMarketPriceAnalysisFunction(RequestMarketPriceAnalysisFunctionRequest req);

    @Description("Retrieve Market Price Analysis Function")
    RetrieveMarketPriceAnalysisFunctionResponse retrieveMarketPriceAnalysisFunction(RetrieveMarketPriceAnalysisFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Price Analysis Function")
    UpdateMarketPriceAnalysisFunctionResponse updateMarketPriceAnalysisFunction(UpdateMarketPriceAnalysisFunctionRequest req);
}