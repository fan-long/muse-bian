package org.museframework.bian.creditcard.dto;

public class ExecuteFeesRequest {
    private String creditcardid;

    private String feesid;

    private org.museframework.bian.creditcard.dto.bq.Fees fees;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }

    public void setFees(org.museframework.bian.creditcard.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.creditcard.dto.bq.Fees getFees() {
        return fees;
    }
}