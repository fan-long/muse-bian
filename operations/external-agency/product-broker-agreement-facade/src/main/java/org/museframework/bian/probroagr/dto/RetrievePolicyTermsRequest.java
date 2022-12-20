package org.museframework.bian.probroagr.dto;

public class RetrievePolicyTermsRequest {
    private String productbrokeragreementid;

    private String policytermsid;

    public void setProductbrokeragreementid(String productbrokeragreementid) {
        this.productbrokeragreementid = productbrokeragreementid;
    }

    public String getProductbrokeragreementid() {
        return productbrokeragreementid;
    }

    public void setPolicytermsid(String policytermsid) {
        this.policytermsid = policytermsid;
    }

    public String getPolicytermsid() {
        return policytermsid;
    }
}