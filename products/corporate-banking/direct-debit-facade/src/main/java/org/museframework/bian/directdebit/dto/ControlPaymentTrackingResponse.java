package org.museframework.bian.directdebit.dto;

public class ControlPaymentTrackingResponse {
    private org.museframework.bian.directdebit.dto.bq.PaymentTracking paymentTracking;

    public void setPaymentTracking(org.museframework.bian.directdebit.dto.bq.PaymentTracking paymentTracking) {
        this.paymentTracking = paymentTracking;
    }

    public org.museframework.bian.directdebit.dto.bq.PaymentTracking getPaymentTracking() {
        return paymentTracking;
    }
}