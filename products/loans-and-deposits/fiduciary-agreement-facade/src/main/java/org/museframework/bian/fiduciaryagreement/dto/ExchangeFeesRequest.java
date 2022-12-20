package org.museframework.bian.fiduciaryagreement.dto;

public class ExchangeFeesRequest {
    private String fiduciaryagreementid;

    private String feesid;

    private org.museframework.bian.fiduciaryagreement.dto.bq.Fees fees;

    public void setFiduciaryagreementid(String fiduciaryagreementid) {
        this.fiduciaryagreementid = fiduciaryagreementid;
    }

    public String getFiduciaryagreementid() {
        return fiduciaryagreementid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }

    public void setFees(org.museframework.bian.fiduciaryagreement.dto.bq.Fees fees) {
        this.fees = fees;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.Fees getFees() {
        return fees;
    }
}