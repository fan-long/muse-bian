package org.museframework.bian.traposope.dto;

public class ExchangeTradedPositionOperatingSessionRequest {
    private String traderpositionoperationsid;

    private org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession tradedPositionOperatingSession;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradedPositionOperatingSession(org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession tradedPositionOperatingSession) {
        this.tradedPositionOperatingSession = tradedPositionOperatingSession;
    }

    public org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession getTradedPositionOperatingSession() {
        return tradedPositionOperatingSession;
    }
}