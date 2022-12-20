package org.museframework.bian.probroagr.dto;

public class EvaluatePolicyTermsResponse {
    private org.museframework.bian.probroagr.dto.bq.PolicyTerms policyTerms;

    public void setPolicyTerms(org.museframework.bian.probroagr.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.probroagr.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}