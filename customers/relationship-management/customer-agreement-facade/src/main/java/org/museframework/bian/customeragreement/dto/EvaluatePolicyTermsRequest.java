package org.museframework.bian.customeragreement.dto;

public class EvaluatePolicyTermsRequest {
    private String customeragreementid;

    private String policytermsid;

    private org.museframework.bian.customeragreement.dto.bq.PolicyTerms policyTerms;

    public void setCustomeragreementid(String customeragreementid) {
        this.customeragreementid = customeragreementid;
    }

    public String getCustomeragreementid() {
        return customeragreementid;
    }

    public void setPolicytermsid(String policytermsid) {
        this.policytermsid = policytermsid;
    }

    public String getPolicytermsid() {
        return policytermsid;
    }

    public void setPolicyTerms(org.museframework.bian.customeragreement.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}