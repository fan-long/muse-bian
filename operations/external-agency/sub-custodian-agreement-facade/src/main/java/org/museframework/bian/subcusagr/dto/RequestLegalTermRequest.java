package org.museframework.bian.subcusagr.dto;

public class RequestLegalTermRequest {
    private String subcustodianagreementid;

    private String legaltermid;

    private org.museframework.bian.subcusagr.dto.bq.LegalTerm legalTerm;

    public void setSubcustodianagreementid(String subcustodianagreementid) {
        this.subcustodianagreementid = subcustodianagreementid;
    }

    public String getSubcustodianagreementid() {
        return subcustodianagreementid;
    }

    public void setLegaltermid(String legaltermid) {
        this.legaltermid = legaltermid;
    }

    public String getLegaltermid() {
        return legaltermid;
    }

    public void setLegalTerm(org.museframework.bian.subcusagr.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}