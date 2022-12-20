package org.museframework.bian.customeragreement.dto;

public class RetrievePolicyTermsRequest {
    private String customeragreementid;

    private String policytermsid;

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
}