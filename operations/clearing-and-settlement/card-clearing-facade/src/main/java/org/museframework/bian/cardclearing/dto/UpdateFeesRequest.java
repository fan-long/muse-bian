package org.museframework.bian.cardclearing.dto;

public class UpdateFeesRequest {
    private String cardclearingid;

    private String feesid;

    private org.museframework.bian.cardclearing.dto.bq.Fees fees;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }

    public void setFees(org.museframework.bian.cardclearing.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.cardclearing.dto.bq.Fees getFees() {
        return fees;
    }
}