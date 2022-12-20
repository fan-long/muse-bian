package org.museframework.bian.commissionagreement.dto;

public class RequestCommissionTermsRequest {
    private String commissionagreementid;

    private String commissiontermsid;

    private org.museframework.bian.commissionagreement.dto.bq.CommissionTerms commissionTerms;

    public void setCommissionagreementid(String commissionagreementid) {
        this.commissionagreementid = commissionagreementid;
    }

    public String getCommissionagreementid() {
        return commissionagreementid;
    }

    public void setCommissiontermsid(String commissiontermsid) {
        this.commissiontermsid = commissiontermsid;
    }

    public String getCommissiontermsid() {
        return commissiontermsid;
    }

    public void setCommissionTerms(org.museframework.bian.commissionagreement.dto.bq.CommissionTerms commissionTerms) {
        this.commissionTerms = commissionTerms;
    }

    public org.museframework.bian.commissionagreement.dto.bq.CommissionTerms getCommissionTerms() {
        return commissionTerms;
    }
}