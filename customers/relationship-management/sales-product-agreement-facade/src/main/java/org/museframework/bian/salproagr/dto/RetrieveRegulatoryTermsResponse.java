package org.museframework.bian.salproagr.dto;

public class RetrieveRegulatoryTermsResponse {
    private org.museframework.bian.salproagr.dto.bq.RegulatoryTerms regulatoryTerms;

    public void setRegulatoryTerms(org.museframework.bian.salproagr.dto.bq.RegulatoryTerms regulatoryTerms) {
        this.regulatoryTerms = regulatoryTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.RegulatoryTerms getRegulatoryTerms() {
        return regulatoryTerms;
    }
}