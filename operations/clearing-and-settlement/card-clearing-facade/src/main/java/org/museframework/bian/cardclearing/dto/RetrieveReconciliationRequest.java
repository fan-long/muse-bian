package org.museframework.bian.cardclearing.dto;

public class RetrieveReconciliationRequest {
    private String cardclearingid;

    private String reconciliationid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setReconciliationid(String reconciliationid) {
        this.reconciliationid = reconciliationid;
    }

    public String getReconciliationid() {
        return reconciliationid;
    }
}