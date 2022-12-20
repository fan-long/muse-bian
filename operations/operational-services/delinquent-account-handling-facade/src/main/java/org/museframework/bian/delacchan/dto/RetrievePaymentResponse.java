package org.museframework.bian.delacchan.dto;

public class RetrievePaymentResponse {
    private org.museframework.bian.delacchan.dto.bq.Payment payment;

    public void setPayment(org.museframework.bian.delacchan.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.delacchan.dto.bq.Payment getPayment() {
        return payment;
    }
}