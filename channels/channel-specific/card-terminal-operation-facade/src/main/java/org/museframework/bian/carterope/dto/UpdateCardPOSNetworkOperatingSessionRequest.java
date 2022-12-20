package org.museframework.bian.carterope.dto;

public class UpdateCardPOSNetworkOperatingSessionRequest {
    private String cardterminaloperationid;

    private org.museframework.bian.carterope.dto.cr.CardPOSNetworkOperatingSession cardPOSNetworkOperatingSession;

    public void setCardterminaloperationid(String cardterminaloperationid) {
        this.cardterminaloperationid = cardterminaloperationid;
    }

    public String getCardterminaloperationid() {
        return cardterminaloperationid;
    }

    public void setCardPOSNetworkOperatingSession(org.museframework.bian.carterope.dto.cr.CardPOSNetworkOperatingSession cardPOSNetworkOperatingSession) {
        this.cardPOSNetworkOperatingSession = cardPOSNetworkOperatingSession;
    }

    public org.museframework.bian.carterope.dto.cr.CardPOSNetworkOperatingSession getCardPOSNetworkOperatingSession() {
        return cardPOSNetworkOperatingSession;
    }
}