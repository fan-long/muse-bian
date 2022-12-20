package org.museframework.bian.dealerdesk.dto;

public class ExecuteDealerDeskOperatingSessionRequest {
    private String dealerdeskid;

    private org.museframework.bian.dealerdesk.dto.cr.DealerDeskOperatingSession dealerDeskOperatingSession;

    public void setDealerdeskid(String dealerdeskid) {
        this.dealerdeskid = dealerdeskid;
    }

    public String getDealerdeskid() {
        return dealerdeskid;
    }

    public void setDealerDeskOperatingSession(org.museframework.bian.dealerdesk.dto.cr.DealerDeskOperatingSession dealerDeskOperatingSession) {
        this.dealerDeskOperatingSession = dealerDeskOperatingSession;
    }

    public org.museframework.bian.dealerdesk.dto.cr.DealerDeskOperatingSession getDealerDeskOperatingSession() {
        return dealerDeskOperatingSession;
    }
}