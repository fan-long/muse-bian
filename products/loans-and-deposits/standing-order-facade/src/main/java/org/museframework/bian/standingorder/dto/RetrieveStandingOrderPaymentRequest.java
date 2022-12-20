package org.museframework.bian.standingorder.dto;

public class RetrieveStandingOrderPaymentRequest {
    private String standingorderid;

    private String standingorderpaymentid;

    public void setStandingorderid(String standingorderid) {
        this.standingorderid = standingorderid;
    }

    public String getStandingorderid() {
        return standingorderid;
    }

    public void setStandingorderpaymentid(String standingorderpaymentid) {
        this.standingorderpaymentid = standingorderpaymentid;
    }

    public String getStandingorderpaymentid() {
        return standingorderpaymentid;
    }
}