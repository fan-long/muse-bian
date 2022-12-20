package org.museframework.bian.commissionagreement.dto;

public class RetrieveCommissionTermsRequest {
    private String commissionagreementid;

    private String commissiontermsid;

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
}