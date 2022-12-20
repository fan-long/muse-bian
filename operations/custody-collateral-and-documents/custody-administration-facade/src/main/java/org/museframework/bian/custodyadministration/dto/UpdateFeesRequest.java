package org.museframework.bian.custodyadministration.dto;

public class UpdateFeesRequest {
    private String custodyadministrationid;

    private String feesid;

    private org.museframework.bian.custodyadministration.dto.bq.Fees fees;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }

    public void setFees(org.museframework.bian.custodyadministration.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.custodyadministration.dto.bq.Fees getFees() {
        return fees;
    }
}