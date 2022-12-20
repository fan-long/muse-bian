package org.museframework.bian.directdebit.dto;

public class RetrievePaymentTrackingRequest {
    private String directdebitid;

    private String paymenttrackingid;

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
}