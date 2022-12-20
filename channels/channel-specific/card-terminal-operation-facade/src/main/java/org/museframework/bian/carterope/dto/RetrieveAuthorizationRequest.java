package org.museframework.bian.carterope.dto;

public class RetrieveAuthorizationRequest {
    private String cardterminaloperationid;

    private String authorizationid;

    public void setCardterminaloperationid(String cardterminaloperationid) {
        this.cardterminaloperationid = cardterminaloperationid;
    }

    public String getCardterminaloperationid() {
        return cardterminaloperationid;
    }

    public void setAuthorizationid(String authorizationid) {
        this.authorizationid = authorizationid;
    }

    public String getAuthorizationid() {
        return authorizationid;
    }
}