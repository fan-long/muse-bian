package org.museframework.bian.programtrading;

import org.museframework.bian.programtrading.dto.ControlProgramTradingOperatingSessionRequest;
import org.museframework.bian.programtrading.dto.ControlProgramTradingOperatingSessionResponse;
import org.museframework.bian.programtrading.dto.ExchangeProgramTradingOperatingSessionRequest;
import org.museframework.bian.programtrading.dto.ExchangeProgramTradingOperatingSessionResponse;
import org.museframework.bian.programtrading.dto.ExecuteProgramTradingOperatingSessionRequest;
import org.museframework.bian.programtrading.dto.ExecuteProgramTradingOperatingSessionResponse;
import org.museframework.bian.programtrading.dto.InitiateProgramTradingOperatingSessionRequest;
import org.museframework.bian.programtrading.dto.InitiateProgramTradingOperatingSessionResponse;
import org.museframework.bian.programtrading.dto.NotifyProgramTradingOperatingSessionRequest;
import org.museframework.bian.programtrading.dto.NotifyProgramTradingOperatingSessionResponse;
import org.museframework.bian.programtrading.dto.RequestProgramTradingOperatingSessionRequest;
import org.museframework.bian.programtrading.dto.RequestProgramTradingOperatingSessionResponse;
import org.museframework.bian.programtrading.dto.RetrieveProgramTradingOperatingSessionRequest;
import org.museframework.bian.programtrading.dto.RetrieveProgramTradingOperatingSessionResponse;
import org.museframework.bian.programtrading.dto.UpdateProgramTradingOperatingSessionRequest;
import org.museframework.bian.programtrading.dto.UpdateProgramTradingOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Program Trading. ")
@GenericDomain(name="ProgramTrading", group="ProgramTradingOperatingSession")
public interface CrProgramTradingOperatingSession {
    @GenericDtxEndpoint
    @Description("Control Program Trading Operating Session")
    ControlProgramTradingOperatingSessionResponse controlProgramTradingOperatingSession(ControlProgramTradingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Program Trading Operating Session")
    ExchangeProgramTradingOperatingSessionResponse exchangeProgramTradingOperatingSession(ExchangeProgramTradingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Program Trading Operating Session")
    ExecuteProgramTradingOperatingSessionResponse executeProgramTradingOperatingSession(ExecuteProgramTradingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Program Trading Operating Session")
    InitiateProgramTradingOperatingSessionResponse initiateProgramTradingOperatingSession(InitiateProgramTradingOperatingSessionRequest req);

    @Description("Notify Program Trading Operating Session")
    NotifyProgramTradingOperatingSessionResponse notifyProgramTradingOperatingSession(NotifyProgramTradingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Program Trading Operating Session")
    RequestProgramTradingOperatingSessionResponse requestProgramTradingOperatingSession(RequestProgramTradingOperatingSessionRequest req);

    @Description("Retrieve Program Trading Operating Session")
    RetrieveProgramTradingOperatingSessionResponse retrieveProgramTradingOperatingSession(RetrieveProgramTradingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update Program Trading Operating Session")
    UpdateProgramTradingOperatingSessionResponse updateProgramTradingOperatingSession(UpdateProgramTradingOperatingSessionRequest req);
}