package org.museframework.bian.proserage.dto;

public class RequestRegulatoryTermResponse {
    private org.museframework.bian.proserage.dto.bq.RegulatoryTerm regulatoryTerm;

    public void setRegulatoryTerm(org.museframework.bian.proserage.dto.bq.RegulatoryTerm regulatoryTerm) {
        this.regulatoryTerm = regulatoryTerm;
    }

    public org.museframework.bian.proserage.dto.bq.RegulatoryTerm getRegulatoryTerm() {
        return regulatoryTerm;
    }
}