package org.museframework.bian.conandsupagr.dto;

public class RequestLegalTermRequest {
    private String contractorandsupplieragreementid;

    private String legaltermid;

    private org.museframework.bian.conandsupagr.dto.bq.LegalTerm legalTerm;

    public void setContractorandsupplieragreementid(String contractorandsupplieragreementid) {
        this.contractorandsupplieragreementid = contractorandsupplieragreementid;
    }

    public String getContractorandsupplieragreementid() {
        return contractorandsupplieragreementid;
    }

    public void setLegaltermid(String legaltermid) {
        this.legaltermid = legaltermid;
    }

    public String getLegaltermid() {
        return legaltermid;
    }

    public void setLegalTerm(org.museframework.bian.conandsupagr.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.conandsupagr.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}