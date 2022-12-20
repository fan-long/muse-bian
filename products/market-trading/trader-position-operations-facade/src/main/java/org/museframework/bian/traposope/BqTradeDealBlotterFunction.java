package org.museframework.bian.traposope;

import org.museframework.bian.traposope.dto.ExchangeTradeDealBlotterFunctionRequest;
import org.museframework.bian.traposope.dto.ExchangeTradeDealBlotterFunctionResponse;
import org.museframework.bian.traposope.dto.ExecuteTradeDealBlotterFunctionRequest;
import org.museframework.bian.traposope.dto.ExecuteTradeDealBlotterFunctionResponse;
import org.museframework.bian.traposope.dto.InitiateTradeDealBlotterFunctionRequest;
import org.museframework.bian.traposope.dto.InitiateTradeDealBlotterFunctionResponse;
import org.museframework.bian.traposope.dto.NotifyTradeDealBlotterFunctionRequest;
import org.museframework.bian.traposope.dto.NotifyTradeDealBlotterFunctionResponse;
import org.museframework.bian.traposope.dto.RequestTradeDealBlotterFunctionRequest;
import org.museframework.bian.traposope.dto.RequestTradeDealBlotterFunctionResponse;
import org.museframework.bian.traposope.dto.RetrieveTradeDealBlotterFunctionRequest;
import org.museframework.bian.traposope.dto.RetrieveTradeDealBlotterFunctionResponse;
import org.museframework.bian.traposope.dto.UpdateTradeDealBlotterFunctionRequest;
import org.museframework.bian.traposope.dto.UpdateTradeDealBlotterFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function")
@GenericDomain(name="TraderPositionOperations", group="TradeDealBlotterFunction")
public interface BqTradeDealBlotterFunction {
    @GenericDtxEndpoint
    @Description("Exchange Trade Deal Blotter Function")
    ExchangeTradeDealBlotterFunctionResponse exchangeTradeDealBlotterFunction(ExchangeTradeDealBlotterFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trade Deal Blotter Function")
    ExecuteTradeDealBlotterFunctionResponse executeTradeDealBlotterFunction(ExecuteTradeDealBlotterFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trade Deal Blotter Function")
    InitiateTradeDealBlotterFunctionResponse initiateTradeDealBlotterFunction(InitiateTradeDealBlotterFunctionRequest req);

    @Description("Notify Trade Deal Blotter Function")
    NotifyTradeDealBlotterFunctionResponse notifyTradeDealBlotterFunction(NotifyTradeDealBlotterFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Trade Deal Blotter Function")
    RequestTradeDealBlotterFunctionResponse requestTradeDealBlotterFunction(RequestTradeDealBlotterFunctionRequest req);

    @Description("Retrieve Trade Deal Blotter Function")
    RetrieveTradeDealBlotterFunctionResponse retrieveTradeDealBlotterFunction(RetrieveTradeDealBlotterFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Trade Deal Blotter Function")
    UpdateTradeDealBlotterFunctionResponse updateTradeDealBlotterFunction(UpdateTradeDealBlotterFunctionRequest req);
}