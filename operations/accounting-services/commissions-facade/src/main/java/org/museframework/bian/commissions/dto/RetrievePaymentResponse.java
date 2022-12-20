package org.museframework.bian.commissions.dto;

public class RetrievePaymentResponse {
    private org.museframework.bian.commissions.dto.bq.Payment payment;

    public void setPayment(org.museframework.bian.commissions.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.commissions.dto.bq.Payment getPayment() {
        return payment;
    }
}