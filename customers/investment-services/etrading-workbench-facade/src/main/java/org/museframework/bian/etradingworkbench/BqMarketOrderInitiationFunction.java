package org.museframework.bian.etradingworkbench;

import org.museframework.bian.etradingworkbench.dto.ExchangeMarketOrderInitiationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.ExchangeMarketOrderInitiationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.ExecuteMarketOrderInitiationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.ExecuteMarketOrderInitiationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.InitiateMarketOrderInitiationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.InitiateMarketOrderInitiationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.NotifyMarketOrderInitiationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.NotifyMarketOrderInitiationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.RequestMarketOrderInitiationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.RequestMarketOrderInitiationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.RetrieveMarketOrderInitiationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.RetrieveMarketOrderInitiationFunctionResponse;
import org.museframework.bian.etradingworkbench.dto.UpdateMarketOrderInitiationFunctionRequest;
import org.museframework.bian.etradingworkbench.dto.UpdateMarketOrderInitiationFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function")
@GenericDomain(name="eTradingWorkbench", group="MarketOrderInitiationFunction")
public interface BqMarketOrderInitiationFunction {
    @GenericDtxEndpoint
    @Description("Exchange Market Order Initiation Function")
    ExchangeMarketOrderInitiationFunctionResponse exchangeMarketOrderInitiationFunction(ExchangeMarketOrderInitiationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Market Order Initiation Function")
    ExecuteMarketOrderInitiationFunctionResponse executeMarketOrderInitiationFunction(ExecuteMarketOrderInitiationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Market Order Initiation Function")
    InitiateMarketOrderInitiationFunctionResponse initiateMarketOrderInitiationFunction(InitiateMarketOrderInitiationFunctionRequest req);

    @Description("Notify Market Order Initiation Function")
    NotifyMarketOrderInitiationFunctionResponse notifyMarketOrderInitiationFunction(NotifyMarketOrderInitiationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Market Order Initiation Function")
    RequestMarketOrderInitiationFunctionResponse requestMarketOrderInitiationFunction(RequestMarketOrderInitiationFunctionRequest req);

    @Description("Retrieve Market Order Initiation Function")
    RetrieveMarketOrderInitiationFunctionResponse retrieveMarketOrderInitiationFunction(RetrieveMarketOrderInitiationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Market Order Initiation Function")
    UpdateMarketOrderInitiationFunctionResponse updateMarketOrderInitiationFunction(UpdateMarketOrderInitiationFunctionRequest req);
}