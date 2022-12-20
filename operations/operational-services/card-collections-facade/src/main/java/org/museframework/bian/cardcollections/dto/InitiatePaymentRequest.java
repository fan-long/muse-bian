package org.museframework.bian.cardcollections.dto;

public class InitiatePaymentRequest {
    private String cardcollectionsid;

    private String paymentid;

    private org.museframework.bian.cardcollections.dto.bq.Payment payment;

    public void setCardcollectionsid(String cardcollectionsid) {
        this.cardcollectionsid = cardcollectionsid;
    }

    public String getCardcollectionsid() {
        return cardcollectionsid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPayment(org.museframework.bian.cardcollections.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.cardcollections.dto.bq.Payment getPayment() {
        return payment;
    }
}