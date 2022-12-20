package org.museframework.bian.commissions.dto;

public class RetrievePaymentRequest {
    private String commissionsid;

    private String paymentid;

    public void setCommissionsid(String commissionsid) {
        this.commissionsid = commissionsid;
    }

    public String getCommissionsid() {
        return commissionsid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }
}