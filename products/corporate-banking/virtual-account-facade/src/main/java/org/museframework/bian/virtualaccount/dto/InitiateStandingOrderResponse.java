package org.museframework.bian.virtualaccount.dto;

public class InitiateStandingOrderResponse {
    private org.museframework.bian.virtualaccount.dto.bq.StandingOrder standingOrder;

    public void setStandingOrder(org.museframework.bian.virtualaccount.dto.bq.StandingOrder standingOrder) {
        this.standingOrder = standingOrder;
    }

    public org.museframework.bian.virtualaccount.dto.bq.StandingOrder getStandingOrder() {
        return standingOrder;
    }
}