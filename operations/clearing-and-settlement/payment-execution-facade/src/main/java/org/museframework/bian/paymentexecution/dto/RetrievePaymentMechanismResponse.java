package org.museframework.bian.paymentexecution.dto;

public class RetrievePaymentMechanismResponse {
    private org.museframework.bian.paymentexecution.dto.bq.PaymentMechanism paymentMechanism;

    public void setPaymentMechanism(org.museframework.bian.paymentexecution.dto.bq.PaymentMechanism paymentMechanism) {
        this.paymentMechanism = paymentMechanism;
    }

    public org.museframework.bian.paymentexecution.dto.bq.PaymentMechanism getPaymentMechanism() {
        return paymentMechanism;
    }
}