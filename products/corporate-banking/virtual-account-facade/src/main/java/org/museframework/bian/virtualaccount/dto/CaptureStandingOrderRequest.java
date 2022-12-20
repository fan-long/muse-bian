package org.museframework.bian.virtualaccount.dto;

public class CaptureStandingOrderRequest {
    private String virtualaccountid;

    private String standingorderid;

    private org.museframework.bian.virtualaccount.dto.bq.StandingOrder standingOrder;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setStandingorderid(String standingorderid) {
        this.standingorderid = standingorderid;
    }

    public String getStandingorderid() {
        return standingorderid;
    }

    public void setStandingOrder(org.museframework.bian.virtualaccount.dto.bq.StandingOrder standingOrder) {
        this.standingOrder = standingOrder;
    }

    public org.museframework.bian.virtualaccount.dto.bq.StandingOrder getStandingOrder() {
        return standingOrder;
    }
}