package org.museframework.bian.traconmat.dto;

public class ExchangeTradeMatchingOperatingSessionResponse {
    private org.museframework.bian.traconmat.dto.cr.TradeMatchingOperatingSession tradeMatchingOperatingSession;

    public void setTradeMatchingOperatingSession(org.museframework.bian.traconmat.dto.cr.TradeMatchingOperatingSession tradeMatchingOperatingSession) {
        this.tradeMatchingOperatingSession = tradeMatchingOperatingSession;
    }

    public org.museframework.bian.traconmat.dto.cr.TradeMatchingOperatingSession getTradeMatchingOperatingSession() {
        return tradeMatchingOperatingSession;
    }
}