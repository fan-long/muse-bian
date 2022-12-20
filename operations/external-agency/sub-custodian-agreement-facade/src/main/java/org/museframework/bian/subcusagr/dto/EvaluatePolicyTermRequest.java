package org.museframework.bian.subcusagr.dto;

public class EvaluatePolicyTermRequest {
    private String subcustodianagreementid;

    private String policytermid;

    private org.museframework.bian.subcusagr.dto.bq.PolicyTerm policyTerm;

    public void setSubcustodianagreementid(String subcustodianagreementid) {
        this.subcustodianagreementid = subcustodianagreementid;
    }

    public String getSubcustodianagreementid() {
        return subcustodianagreementid;
    }

    public void setPolicytermid(String policytermid) {
        this.policytermid = policytermid;
    }

    public String getPolicytermid() {
        return policytermid;
    }

    public void setPolicyTerm(org.museframework.bian.subcusagr.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}