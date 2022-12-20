package org.museframework.bian.carfinset.dto;

public class UpdatePaymentRequest {
    private String cardfinancialsettlementid;

    private String paymentid;

    private org.museframework.bian.carfinset.dto.bq.Payment payment;

    public void setCardfinancialsettlementid(String cardfinancialsettlementid) {
        this.cardfinancialsettlementid = cardfinancialsettlementid;
    }

    public String getCardfinancialsettlementid() {
        return cardfinancialsettlementid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPayment(org.museframework.bian.carfinset.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.carfinset.dto.bq.Payment getPayment() {
        return payment;
    }
}