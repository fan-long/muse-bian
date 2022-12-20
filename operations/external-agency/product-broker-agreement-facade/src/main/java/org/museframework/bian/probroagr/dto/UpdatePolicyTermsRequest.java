package org.museframework.bian.probroagr.dto;

public class UpdatePolicyTermsRequest {
    private String productbrokeragreementid;

    private String policytermsid;

    private org.museframework.bian.probroagr.dto.bq.PolicyTerms policyTerms;

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

    public void setPolicyTerms(org.museframework.bian.probroagr.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.probroagr.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}