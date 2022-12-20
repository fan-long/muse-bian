package org.museframework.bian.mortgageloan.dto;

public class UpdateFeesRequest {
    private String mortgageloanid;

    private String feesid;

    private org.museframework.bian.mortgageloan.dto.bq.Fees fees;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }

    public void setFees(org.museframework.bian.mortgageloan.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Fees getFees() {
        return fees;
    }
}