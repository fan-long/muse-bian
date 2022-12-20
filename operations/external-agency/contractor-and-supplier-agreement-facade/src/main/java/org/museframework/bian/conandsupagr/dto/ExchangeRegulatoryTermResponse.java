package org.museframework.bian.conandsupagr.dto;

public class ExchangeRegulatoryTermResponse {
    private org.museframework.bian.conandsupagr.dto.bq.RegulatoryTerm regulatoryTerm;

    public void setRegulatoryTerm(org.museframework.bian.conandsupagr.dto.bq.RegulatoryTerm regulatoryTerm) {
        this.regulatoryTerm = regulatoryTerm;
    }

    public org.museframework.bian.conandsupagr.dto.bq.RegulatoryTerm getRegulatoryTerm() {
        return regulatoryTerm;
    }
}