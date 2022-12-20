package org.museframework.bian.directdebit.dto;

public class ControlPaymentTrackingRequest {
    private String directdebitid;

    private String paymenttrackingid;

    private org.museframework.bian.directdebit.dto.bq.PaymentTracking paymentTracking;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setPaymenttrackingid(String paymenttrackingid) {
        this.paymenttrackingid = paymenttrackingid;
    }

    public String getPaymenttrackingid() {
        return paymenttrackingid;
    }

    public void setPaymentTracking(org.museframework.bian.directdebit.dto.bq.PaymentTracking paymentTracking) {
        this.paymentTracking = paymentTracking;
    }

    public org.museframework.bian.directdebit.dto.bq.PaymentTracking getPaymentTracking() {
        return paymentTracking;
    }
}