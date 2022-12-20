package org.museframework.bian.proserage.dto;

public class EvaluateLegalTermRequest {
    private String productserviceagencyid;

    private String legaltermid;

    private org.museframework.bian.proserage.dto.bq.LegalTerm legalTerm;

    public void setProductserviceagencyid(String productserviceagencyid) {
        this.productserviceagencyid = productserviceagencyid;
    }

    public String getProductserviceagencyid() {
        return productserviceagencyid;
    }

    public void setLegaltermid(String legaltermid) {
        this.legaltermid = legaltermid;
    }

    public String getLegaltermid() {
        return legaltermid;
    }

    public void setLegalTerm(org.museframework.bian.proserage.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.proserage.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}