package org.museframework.bian.cardcollections.dto;

public class RetrievePaymentResponse {
    private org.museframework.bian.cardcollections.dto.bq.Payment payment;

    public void setPayment(org.museframework.bian.cardcollections.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.cardcollections.dto.bq.Payment getPayment() {
        return payment;
    }
}