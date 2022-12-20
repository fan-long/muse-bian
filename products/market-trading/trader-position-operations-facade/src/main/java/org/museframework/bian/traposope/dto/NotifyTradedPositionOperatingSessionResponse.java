package org.museframework.bian.traposope.dto;

public class NotifyTradedPositionOperatingSessionResponse {
    private org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession tradedPositionOperatingSession;

    public void setTradedPositionOperatingSession(org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession tradedPositionOperatingSession) {
        this.tradedPositionOperatingSession = tradedPositionOperatingSession;
    }

    public org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession getTradedPositionOperatingSession() {
        return tradedPositionOperatingSession;
    }
}