package org.museframework.bian.conandsupagr.dto;

public class ExchangePolicyTermRequest {
    private String contractorandsupplieragreementid;

    private String policytermid;

    private org.museframework.bian.conandsupagr.dto.bq.PolicyTerm policyTerm;

    public void setContractorandsupplieragreementid(String contractorandsupplieragreementid) {
        this.contractorandsupplieragreementid = contractorandsupplieragreementid;
    }

    public String getContractorandsupplieragreementid() {
        return contractorandsupplieragreementid;
    }

    public void setPolicytermid(String policytermid) {
        this.policytermid = policytermid;
    }

    public String getPolicytermid() {
        return policytermid;
    }

    public void setPolicyTerm(org.museframework.bian.conandsupagr.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.conandsupagr.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}