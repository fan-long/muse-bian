package org.museframework.bian.salproagr.dto;

public class EvaluatePolicyTermsResponse {
    private org.museframework.bian.salproagr.dto.bq.PolicyTerms policyTerms;

    public void setPolicyTerms(org.museframework.bian.salproagr.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}