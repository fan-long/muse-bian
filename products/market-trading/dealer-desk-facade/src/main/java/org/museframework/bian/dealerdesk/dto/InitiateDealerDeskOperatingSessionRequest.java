package org.museframework.bian.dealerdesk.dto;

public class InitiateDealerDeskOperatingSessionRequest {
    private org.museframework.bian.dealerdesk.dto.cr.DealerDeskOperatingSession dealerDeskOperatingSession;

    public void setDealerDeskOperatingSession(org.museframework.bian.dealerdesk.dto.cr.DealerDeskOperatingSession dealerDeskOperatingSession) {
        this.dealerDeskOperatingSession = dealerDeskOperatingSession;
    }

    public org.museframework.bian.dealerdesk.dto.cr.DealerDeskOperatingSession getDealerDeskOperatingSession() {
        return dealerDeskOperatingSession;
    }
}