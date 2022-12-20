package org.museframework.bian.traposope;

import org.museframework.bian.traposope.dto.ControlTradedPositionOperatingSessionRequest;
import org.museframework.bian.traposope.dto.ControlTradedPositionOperatingSessionResponse;
import org.museframework.bian.traposope.dto.ExchangeTradedPositionOperatingSessionRequest;
import org.museframework.bian.traposope.dto.ExchangeTradedPositionOperatingSessionResponse;
import org.museframework.bian.traposope.dto.ExecuteTradedPositionOperatingSessionRequest;
import org.museframework.bian.traposope.dto.ExecuteTradedPositionOperatingSessionResponse;
import org.museframework.bian.traposope.dto.InitiateTradedPositionOperatingSessionRequest;
import org.museframework.bian.traposope.dto.InitiateTradedPositionOperatingSessionResponse;
import org.museframework.bian.traposope.dto.NotifyTradedPositionOperatingSessionRequest;
import org.museframework.bian.traposope.dto.NotifyTradedPositionOperatingSessionResponse;
import org.museframework.bian.traposope.dto.RequestTradedPositionOperatingSessionRequest;
import org.museframework.bian.traposope.dto.RequestTradedPositionOperatingSessionResponse;
import org.museframework.bian.traposope.dto.RetrieveTradedPositionOperatingSessionRequest;
import org.museframework.bian.traposope.dto.RetrieveTradedPositionOperatingSessionResponse;
import org.museframework.bian.traposope.dto.UpdateTradedPositionOperatingSessionRequest;
import org.museframework.bian.traposope.dto.UpdateTradedPositionOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Trader Position Operations. ")
@GenericDomain(name="TraderPositionOperations", group="TradedPositionOperatingSession")
public interface CrTradedPositionOperatingSession {
    @GenericDtxEndpoint
    @Description("Control Traded Position Operating Session")
    ControlTradedPositionOperatingSessionResponse controlTradedPositionOperatingSession(ControlTradedPositionOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Traded Position Operating Session")
    ExchangeTradedPositionOperatingSessionResponse exchangeTradedPositionOperatingSession(ExchangeTradedPositionOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Traded Position Operating Session")
    ExecuteTradedPositionOperatingSessionResponse executeTradedPositionOperatingSession(ExecuteTradedPositionOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Traded Position Operating Session")
    InitiateTradedPositionOperatingSessionResponse initiateTradedPositionOperatingSession(InitiateTradedPositionOperatingSessionRequest req);

    @Description("Notify Traded Position Operating Session")
    NotifyTradedPositionOperatingSessionResponse notifyTradedPositionOperatingSession(NotifyTradedPositionOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Traded Position Operating Session")
    RequestTradedPositionOperatingSessionResponse requestTradedPositionOperatingSession(RequestTradedPositionOperatingSessionRequest req);

    @Description("Retrieve Traded Position Operating Session")
    RetrieveTradedPositionOperatingSessionResponse retrieveTradedPositionOperatingSession(RetrieveTradedPositionOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update Traded Position Operating Session")
    UpdateTradedPositionOperatingSessionResponse updateTradedPositionOperatingSession(UpdateTradedPositionOperatingSessionRequest req);
}