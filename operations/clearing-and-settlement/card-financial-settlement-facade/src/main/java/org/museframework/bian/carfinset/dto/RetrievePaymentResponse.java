package org.museframework.bian.carfinset.dto;

public class RetrievePaymentResponse {
    private org.museframework.bian.carfinset.dto.bq.Payment payment;

    public void setPayment(org.museframework.bian.carfinset.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.carfinset.dto.bq.Payment getPayment() {
        return payment;
    }
}