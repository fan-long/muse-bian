package org.museframework.bian.cardcapture.dto;

public class RetrieveCreditChargeCardFinancialCaptureTransactionRequest {
    private String cardcaptureid;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }
}