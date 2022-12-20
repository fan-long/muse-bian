package org.museframework.bian.cardcollections.dto;

public class RetrievePaymentTermsRequest {
    private String cardcollectionsid;

    private String paymenttermsid;

    public void setCardcollectionsid(String cardcollectionsid) {
        this.cardcollectionsid = cardcollectionsid;
    }

    public String getCardcollectionsid() {
        return cardcollectionsid;
    }

    public void setPaymenttermsid(String paymenttermsid) {
        this.paymenttermsid = paymenttermsid;
    }

    public String getPaymenttermsid() {
        return paymenttermsid;
    }
}