package org.museframework.bian.cardclearing.dto;

public class RetrieveRoutingRequest {
    private String cardclearingid;

    private String routingid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setRoutingid(String routingid) {
        this.routingid = routingid;
    }

    public String getRoutingid() {
        return routingid;
    }
}