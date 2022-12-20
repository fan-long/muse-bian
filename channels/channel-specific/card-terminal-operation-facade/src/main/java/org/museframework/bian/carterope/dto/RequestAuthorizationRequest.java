package org.museframework.bian.carterope.dto;

public class RequestAuthorizationRequest {
    private String cardterminaloperationid;

    private String authorizationid;

    private org.museframework.bian.carterope.dto.bq.Authorization authorization;

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

    public void setAuthorization(org.museframework.bian.carterope.dto.bq.Authorization authorization) {
        this.authorization = authorization;
    }

    public org.museframework.bian.carterope.dto.bq.Authorization getAuthorization() {
        return authorization;
    }
}