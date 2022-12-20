package org.museframework.bian.subcusagr.dto;

public class NotifyRegulatoryTermResponse {
    private org.museframework.bian.subcusagr.dto.bq.RegulatoryTerm regulatoryTerm;

    public void setRegulatoryTerm(org.museframework.bian.subcusagr.dto.bq.RegulatoryTerm regulatoryTerm) {
        this.regulatoryTerm = regulatoryTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.RegulatoryTerm getRegulatoryTerm() {
        return regulatoryTerm;
    }
}