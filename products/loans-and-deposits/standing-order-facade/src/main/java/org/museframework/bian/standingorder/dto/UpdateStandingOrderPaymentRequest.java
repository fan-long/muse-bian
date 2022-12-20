package org.museframework.bian.standingorder.dto;

public class UpdateStandingOrderPaymentRequest {
    private String standingorderid;

    private String standingorderpaymentid;

    private org.museframework.bian.standingorder.dto.bq.StandingOrderPayment standingOrderPayment;

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

    public void setStandingOrderPayment(org.museframework.bian.standingorder.dto.bq.StandingOrderPayment standingOrderPayment) {
        this.standingOrderPayment = standingOrderPayment;
    }

    public org.museframework.bian.standingorder.dto.bq.StandingOrderPayment getStandingOrderPayment() {
        return standingOrderPayment;
    }
}