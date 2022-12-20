package org.museframework.bian.dealerdesk;

import org.museframework.bian.dealerdesk.dto.ControlDealerDeskOperatingSessionRequest;
import org.museframework.bian.dealerdesk.dto.ControlDealerDeskOperatingSessionResponse;
import org.museframework.bian.dealerdesk.dto.ExchangeDealerDeskOperatingSessionRequest;
import org.museframework.bian.dealerdesk.dto.ExchangeDealerDeskOperatingSessionResponse;
import org.museframework.bian.dealerdesk.dto.ExecuteDealerDeskOperatingSessionRequest;
import org.museframework.bian.dealerdesk.dto.ExecuteDealerDeskOperatingSessionResponse;
import org.museframework.bian.dealerdesk.dto.InitiateDealerDeskOperatingSessionRequest;
import org.museframework.bian.dealerdesk.dto.InitiateDealerDeskOperatingSessionResponse;
import org.museframework.bian.dealerdesk.dto.NotifyDealerDeskOperatingSessionRequest;
import org.museframework.bian.dealerdesk.dto.NotifyDealerDeskOperatingSessionResponse;
import org.museframework.bian.dealerdesk.dto.RequestDealerDeskOperatingSessionRequest;
import org.museframework.bian.dealerdesk.dto.RequestDealerDeskOperatingSessionResponse;
import org.museframework.bian.dealerdesk.dto.RetrieveDealerDeskOperatingSessionRequest;
import org.museframework.bian.dealerdesk.dto.RetrieveDealerDeskOperatingSessionResponse;
import org.museframework.bian.dealerdesk.dto.UpdateDealerDeskOperatingSessionRequest;
import org.museframework.bian.dealerdesk.dto.UpdateDealerDeskOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Dealer Desk. ")
@GenericDomain(name="DealerDesk", group="DealerDeskOperatingSession")
public interface CrDealerDeskOperatingSession {
    @GenericDtxEndpoint
    @Description("Control Dealer Desk Operating Session")
    ControlDealerDeskOperatingSessionResponse controlDealerDeskOperatingSession(ControlDealerDeskOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Dealer Desk Operating Session")
    ExchangeDealerDeskOperatingSessionResponse exchangeDealerDeskOperatingSession(ExchangeDealerDeskOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Dealer Desk Operating Session")
    ExecuteDealerDeskOperatingSessionResponse executeDealerDeskOperatingSession(ExecuteDealerDeskOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Dealer Desk Operating Session")
    InitiateDealerDeskOperatingSessionResponse initiateDealerDeskOperatingSession(InitiateDealerDeskOperatingSessionRequest req);

    @Description("Notify Dealer Desk Operating Session")
    NotifyDealerDeskOperatingSessionResponse notifyDealerDeskOperatingSession(NotifyDealerDeskOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Dealer Desk Operating Session")
    RequestDealerDeskOperatingSessionResponse requestDealerDeskOperatingSession(RequestDealerDeskOperatingSessionRequest req);

    @Description("Retrieve Dealer Desk Operating Session")
    RetrieveDealerDeskOperatingSessionResponse retrieveDealerDeskOperatingSession(RetrieveDealerDeskOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update Dealer Desk Operating Session")
    UpdateDealerDeskOperatingSessionResponse updateDealerDeskOperatingSession(UpdateDealerDeskOperatingSessionRequest req);
}