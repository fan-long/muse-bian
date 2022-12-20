package org.museframework.bian.infproope;

import org.museframework.bian.infproope.dto.ControlInformationFeedOperatingSessionRequest;
import org.museframework.bian.infproope.dto.ControlInformationFeedOperatingSessionResponse;
import org.museframework.bian.infproope.dto.ExchangeInformationFeedOperatingSessionRequest;
import org.museframework.bian.infproope.dto.ExchangeInformationFeedOperatingSessionResponse;
import org.museframework.bian.infproope.dto.ExecuteInformationFeedOperatingSessionRequest;
import org.museframework.bian.infproope.dto.ExecuteInformationFeedOperatingSessionResponse;
import org.museframework.bian.infproope.dto.InitiateInformationFeedOperatingSessionRequest;
import org.museframework.bian.infproope.dto.InitiateInformationFeedOperatingSessionResponse;
import org.museframework.bian.infproope.dto.NotifyInformationFeedOperatingSessionRequest;
import org.museframework.bian.infproope.dto.NotifyInformationFeedOperatingSessionResponse;
import org.museframework.bian.infproope.dto.RequestInformationFeedOperatingSessionRequest;
import org.museframework.bian.infproope.dto.RequestInformationFeedOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Information Provider Operation. ")
@GenericDomain(name="InformationProviderOperation", group="InformationFeedOperatingSession")
public interface CrInformationFeedOperatingSession {
    @GenericDtxEndpoint
    @Description("Control Information Feed Operating Session")
    ControlInformationFeedOperatingSessionResponse controlInformationFeedOperatingSession(ControlInformationFeedOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Information Feed Operating Session")
    ExchangeInformationFeedOperatingSessionResponse exchangeInformationFeedOperatingSession(ExchangeInformationFeedOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Information Feed Operating Session")
    ExecuteInformationFeedOperatingSessionResponse executeInformationFeedOperatingSession(ExecuteInformationFeedOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Information Feed Operating Session")
    InitiateInformationFeedOperatingSessionResponse initiateInformationFeedOperatingSession(InitiateInformationFeedOperatingSessionRequest req);

    @Description("Notify Information Feed Operating Session")
    NotifyInformationFeedOperatingSessionResponse notifyInformationFeedOperatingSession(NotifyInformationFeedOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Information Feed Operating Session")
    RequestInformationFeedOperatingSessionResponse requestInformationFeedOperatingSession(RequestInformationFeedOperatingSessionRequest req);
}