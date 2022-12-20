package org.museframework.bian.traposope;

import org.museframework.bian.traposope.dto.ExchangeTradeCaptureandReportingFunctionRequest;
import org.museframework.bian.traposope.dto.ExchangeTradeCaptureandReportingFunctionResponse;
import org.museframework.bian.traposope.dto.ExecuteTradeCaptureandReportingFunctionRequest;
import org.museframework.bian.traposope.dto.ExecuteTradeCaptureandReportingFunctionResponse;
import org.museframework.bian.traposope.dto.InitiateTradeCaptureandReportingFunctionRequest;
import org.museframework.bian.traposope.dto.InitiateTradeCaptureandReportingFunctionResponse;
import org.museframework.bian.traposope.dto.NotifyTradeCaptureandReportingFunctionRequest;
import org.museframework.bian.traposope.dto.NotifyTradeCaptureandReportingFunctionResponse;
import org.museframework.bian.traposope.dto.RequestTradeCaptureandReportingFunctionRequest;
import org.museframework.bian.traposope.dto.RequestTradeCaptureandReportingFunctionResponse;
import org.museframework.bian.traposope.dto.RetrieveTradeCaptureandReportingFunctionRequest;
import org.museframework.bian.traposope.dto.RetrieveTradeCaptureandReportingFunctionResponse;
import org.museframework.bian.traposope.dto.UpdateTradeCaptureandReportingFunctionRequest;
import org.museframework.bian.traposope.dto.UpdateTradeCaptureandReportingFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function")
@GenericDomain(name="TraderPositionOperations", group="TradeCaptureandReportingFunction")
public interface BqTradeCaptureandReportingFunction {
    @GenericDtxEndpoint
    @Description("Exchange Trade Capture and Reporting Function")
    ExchangeTradeCaptureandReportingFunctionResponse exchangeTradeCaptureandReportingFunction(ExchangeTradeCaptureandReportingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trade Capture and Reporting Function")
    ExecuteTradeCaptureandReportingFunctionResponse executeTradeCaptureandReportingFunction(ExecuteTradeCaptureandReportingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trade Capture and Reporting Function")
    InitiateTradeCaptureandReportingFunctionResponse initiateTradeCaptureandReportingFunction(InitiateTradeCaptureandReportingFunctionRequest req);

    @Description("Notify Trade Capture and Reporting Function")
    NotifyTradeCaptureandReportingFunctionResponse notifyTradeCaptureandReportingFunction(NotifyTradeCaptureandReportingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Trade Capture and Reporting Function")
    RequestTradeCaptureandReportingFunctionResponse requestTradeCaptureandReportingFunction(RequestTradeCaptureandReportingFunctionRequest req);

    @Description("Retrieve Trade Capture and Reporting Function")
    RetrieveTradeCaptureandReportingFunctionResponse retrieveTradeCaptureandReportingFunction(RetrieveTradeCaptureandReportingFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Trade Capture and Reporting Function")
    UpdateTradeCaptureandReportingFunctionResponse updateTradeCaptureandReportingFunction(UpdateTradeCaptureandReportingFunctionRequest req);
}