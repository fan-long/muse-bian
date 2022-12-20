package org.museframework.bian.standingorder.dto;

public class RetrieveStandingOrderPaymentResponse {
    private org.museframework.bian.standingorder.dto.bq.StandingOrderPayment standingOrderPayment;

    public void setStandingOrderPayment(org.museframework.bian.standingorder.dto.bq.StandingOrderPayment standingOrderPayment) {
        this.standingOrderPayment = standingOrderPayment;
    }

    public org.museframework.bian.standingorder.dto.bq.StandingOrderPayment getStandingOrderPayment() {
        return standingOrderPayment;
    }
}