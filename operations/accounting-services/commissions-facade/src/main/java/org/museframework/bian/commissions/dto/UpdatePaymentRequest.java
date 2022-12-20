package org.museframework.bian.commissions.dto;

public class UpdatePaymentRequest {
    private String commissionsid;

    private String paymentid;

    private org.museframework.bian.commissions.dto.bq.Payment payment;

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

    public void setPayment(org.museframework.bian.commissions.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.commissions.dto.bq.Payment getPayment() {
        return payment;
    }
}