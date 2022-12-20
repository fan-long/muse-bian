package org.museframework.bian.programtrading;

import org.museframework.bian.programtrading.dto.ExchangeProgramTradeExecutionFunctionRequest;
import org.museframework.bian.programtrading.dto.ExchangeProgramTradeExecutionFunctionResponse;
import org.museframework.bian.programtrading.dto.ExecuteProgramTradeExecutionFunctionRequest;
import org.museframework.bian.programtrading.dto.ExecuteProgramTradeExecutionFunctionResponse;
import org.museframework.bian.programtrading.dto.InitiateProgramTradeExecutionFunctionRequest;
import org.museframework.bian.programtrading.dto.InitiateProgramTradeExecutionFunctionResponse;
import org.museframework.bian.programtrading.dto.NotifyProgramTradeExecutionFunctionRequest;
import org.museframework.bian.programtrading.dto.NotifyProgramTradeExecutionFunctionResponse;
import org.museframework.bian.programtrading.dto.RequestProgramTradeExecutionFunctionRequest;
import org.museframework.bian.programtrading.dto.RequestProgramTradeExecutionFunctionResponse;
import org.museframework.bian.programtrading.dto.RetrieveProgramTradeExecutionFunctionRequest;
import org.museframework.bian.programtrading.dto.RetrieveProgramTradeExecutionFunctionResponse;
import org.museframework.bian.programtrading.dto.UpdateProgramTradeExecutionFunctionRequest;
import org.museframework.bian.programtrading.dto.UpdateProgramTradeExecutionFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Program Traded Portfolio Maintenance Function for doing Program Traded Portfolio Maintenance Function")
@GenericDomain(name="ProgramTrading", group="ProgramTradeExecutionFunction")
public interface BqProgramTradeExecutionFunction {
    @GenericDtxEndpoint
    @Description("Exchange Program Trade Execution Function")
    ExchangeProgramTradeExecutionFunctionResponse exchangeProgramTradeExecutionFunction(ExchangeProgramTradeExecutionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Program Trade Execution Function")
    ExecuteProgramTradeExecutionFunctionResponse executeProgramTradeExecutionFunction(ExecuteProgramTradeExecutionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Program Trade Execution Function")
    InitiateProgramTradeExecutionFunctionResponse initiateProgramTradeExecutionFunction(InitiateProgramTradeExecutionFunctionRequest req);

    @Description("Notify Program Trade Execution Function")
    NotifyProgramTradeExecutionFunctionResponse notifyProgramTradeExecutionFunction(NotifyProgramTradeExecutionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Program Trade Execution Function")
    RequestProgramTradeExecutionFunctionResponse requestProgramTradeExecutionFunction(RequestProgramTradeExecutionFunctionRequest req);

    @Description("Retrieve Program Trade Execution Function")
    RetrieveProgramTradeExecutionFunctionResponse retrieveProgramTradeExecutionFunction(RetrieveProgramTradeExecutionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Program Trade Execution Function")
    UpdateProgramTradeExecutionFunctionResponse updateProgramTradeExecutionFunction(UpdateProgramTradeExecutionFunctionRequest req);
}