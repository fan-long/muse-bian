package org.museframework.bian.leasing.dto;

public class UpdateFeesRequest {
    private String leasingid;

    private String feesid;

    private org.museframework.bian.leasing.dto.bq.Fees fees;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }

    public void setFees(org.museframework.bian.leasing.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.leasing.dto.bq.Fees getFees() {
        return fees;
    }
}