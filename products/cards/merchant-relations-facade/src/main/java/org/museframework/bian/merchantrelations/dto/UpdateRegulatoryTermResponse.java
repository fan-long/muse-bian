package org.museframework.bian.merchantrelations.dto;

public class UpdateRegulatoryTermResponse {
    private org.museframework.bian.merchantrelations.dto.bq.RegulatoryTerm regulatoryTerm;

    public void setRegulatoryTerm(org.museframework.bian.merchantrelations.dto.bq.RegulatoryTerm regulatoryTerm) {
        this.regulatoryTerm = regulatoryTerm;
    }

    public org.museframework.bian.merchantrelations.dto.bq.RegulatoryTerm getRegulatoryTerm() {
        return regulatoryTerm;
    }
}