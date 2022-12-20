package org.museframework.bian.subcusagr.dto;

public class ExchangePolicyTermResponse {
    private org.museframework.bian.subcusagr.dto.bq.PolicyTerm policyTerm;

    public void setPolicyTerm(org.museframework.bian.subcusagr.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}