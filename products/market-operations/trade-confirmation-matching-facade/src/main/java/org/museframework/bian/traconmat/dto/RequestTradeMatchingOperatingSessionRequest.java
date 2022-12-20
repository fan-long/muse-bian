package org.museframework.bian.traconmat.dto;

public class RequestTradeMatchingOperatingSessionRequest {
    private String tradeconfirmationmatchingid;

    private org.museframework.bian.traconmat.dto.cr.TradeMatchingOperatingSession tradeMatchingOperatingSession;

    public void setTradeconfirmationmatchingid(String tradeconfirmationmatchingid) {
        this.tradeconfirmationmatchingid = tradeconfirmationmatchingid;
    }

    public String getTradeconfirmationmatchingid() {
        return tradeconfirmationmatchingid;
    }

    public void setTradeMatchingOperatingSession(org.museframework.bian.traconmat.dto.cr.TradeMatchingOperatingSession tradeMatchingOperatingSession) {
        this.tradeMatchingOperatingSession = tradeMatchingOperatingSession;
    }

    public org.museframework.bian.traconmat.dto.cr.TradeMatchingOperatingSession getTradeMatchingOperatingSession() {
        return tradeMatchingOperatingSession;
    }
}