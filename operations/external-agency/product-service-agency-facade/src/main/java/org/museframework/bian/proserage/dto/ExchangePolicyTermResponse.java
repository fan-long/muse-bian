package org.museframework.bian.proserage.dto;

public class ExchangePolicyTermResponse {
    private org.museframework.bian.proserage.dto.bq.PolicyTerm policyTerm;

    public void setPolicyTerm(org.museframework.bian.proserage.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.proserage.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}