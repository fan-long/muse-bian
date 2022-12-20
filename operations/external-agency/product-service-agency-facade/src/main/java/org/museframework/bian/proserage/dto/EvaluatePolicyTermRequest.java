package org.museframework.bian.proserage.dto;

public class EvaluatePolicyTermRequest {
    private String productserviceagencyid;

    private String policytermid;

    private org.museframework.bian.proserage.dto.bq.PolicyTerm policyTerm;

    public void setProductserviceagencyid(String productserviceagencyid) {
        this.productserviceagencyid = productserviceagencyid;
    }

    public String getProductserviceagencyid() {
        return productserviceagencyid;
    }

    public void setPolicytermid(String policytermid) {
        this.policytermid = policytermid;
    }

    public String getPolicytermid() {
        return policytermid;
    }

    public void setPolicyTerm(org.museframework.bian.proserage.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.proserage.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}