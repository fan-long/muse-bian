package org.museframework.bian.customeragreement.dto;

public class RetrievePolicyTermsResponse {
    private org.museframework.bian.customeragreement.dto.bq.PolicyTerms policyTerms;

    public void setPolicyTerms(org.museframework.bian.customeragreement.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}