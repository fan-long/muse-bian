package org.museframework.bian.directdebit.dto;

public class ExecutePaymentInitiationResponse {
    private org.museframework.bian.directdebit.dto.bq.PaymentInitiation paymentInitiation;

    public void setPaymentInitiation(org.museframework.bian.directdebit.dto.bq.PaymentInitiation paymentInitiation) {
        this.paymentInitiation = paymentInitiation;
    }

    public org.museframework.bian.directdebit.dto.bq.PaymentInitiation getPaymentInitiation() {
        return paymentInitiation;
    }
}