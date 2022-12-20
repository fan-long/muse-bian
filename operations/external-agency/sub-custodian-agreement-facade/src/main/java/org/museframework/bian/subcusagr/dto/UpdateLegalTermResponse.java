package org.museframework.bian.subcusagr.dto;

public class UpdateLegalTermResponse {
    private org.museframework.bian.subcusagr.dto.bq.LegalTerm legalTerm;

    public void setLegalTerm(org.museframework.bian.subcusagr.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}