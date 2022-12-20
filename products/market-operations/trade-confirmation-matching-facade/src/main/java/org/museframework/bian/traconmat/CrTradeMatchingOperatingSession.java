package org.museframework.bian.traconmat;

import org.museframework.bian.traconmat.dto.ControlTradeMatchingOperatingSessionRequest;
import org.museframework.bian.traconmat.dto.ControlTradeMatchingOperatingSessionResponse;
import org.museframework.bian.traconmat.dto.ExchangeTradeMatchingOperatingSessionRequest;
import org.museframework.bian.traconmat.dto.ExchangeTradeMatchingOperatingSessionResponse;
import org.museframework.bian.traconmat.dto.ExecuteTradeMatchingOperatingSessionRequest;
import org.museframework.bian.traconmat.dto.ExecuteTradeMatchingOperatingSessionResponse;
import org.museframework.bian.traconmat.dto.InitiateTradeMatchingOperatingSessionRequest;
import org.museframework.bian.traconmat.dto.InitiateTradeMatchingOperatingSessionResponse;
import org.museframework.bian.traconmat.dto.NotifyTradeMatchingOperatingSessionRequest;
import org.museframework.bian.traconmat.dto.NotifyTradeMatchingOperatingSessionResponse;
import org.museframework.bian.traconmat.dto.RequestTradeMatchingOperatingSessionRequest;
import org.museframework.bian.traconmat.dto.RequestTradeMatchingOperatingSessionResponse;
import org.museframework.bian.traconmat.dto.RetrieveTradeMatchingOperatingSessionRequest;
import org.museframework.bian.traconmat.dto.RetrieveTradeMatchingOperatingSessionResponse;
import org.museframework.bian.traconmat.dto.UpdateTradeMatchingOperatingSessionRequest;
import org.museframework.bian.traconmat.dto.UpdateTradeMatchingOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Trade Confirmation Matching. ")
@GenericDomain(name="TradeConfirmationMatching", group="TradeMatchingOperatingSession")
public interface CrTradeMatchingOperatingSession {
    @GenericDtxEndpoint
    @Description("Control Trade Matching Operating Session")
    ControlTradeMatchingOperatingSessionResponse controlTradeMatchingOperatingSession(ControlTradeMatchingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Trade Matching Operating Session")
    ExchangeTradeMatchingOperatingSessionResponse exchangeTradeMatchingOperatingSession(ExchangeTradeMatchingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trade Matching Operating Session")
    ExecuteTradeMatchingOperatingSessionResponse executeTradeMatchingOperatingSession(ExecuteTradeMatchingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trade Matching Operating Session")
    InitiateTradeMatchingOperatingSessionResponse initiateTradeMatchingOperatingSession(InitiateTradeMatchingOperatingSessionRequest req);

    @Description("Notify Trade Matching Operating Session")
    NotifyTradeMatchingOperatingSessionResponse notifyTradeMatchingOperatingSession(NotifyTradeMatchingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Trade Matching Operating Session")
    RequestTradeMatchingOperatingSessionResponse requestTradeMatchingOperatingSession(RequestTradeMatchingOperatingSessionRequest req);

    @Description("Retrieve Trade Matching Operating Session")
    RetrieveTradeMatchingOperatingSessionResponse retrieveTradeMatchingOperatingSession(RetrieveTradeMatchingOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update Trade Matching Operating Session")
    UpdateTradeMatchingOperatingSessionResponse updateTradeMatchingOperatingSession(UpdateTradeMatchingOperatingSessionRequest req);
}