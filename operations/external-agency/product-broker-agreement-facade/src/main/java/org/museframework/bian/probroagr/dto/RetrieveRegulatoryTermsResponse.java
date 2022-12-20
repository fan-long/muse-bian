package org.museframework.bian.probroagr.dto;

public class RetrieveRegulatoryTermsResponse {
    private org.museframework.bian.probroagr.dto.bq.RegulatoryTerms regulatoryTerms;

    public void setRegulatoryTerms(org.museframework.bian.probroagr.dto.bq.RegulatoryTerms regulatoryTerms) {
        this.regulatoryTerms = regulatoryTerms;
    }

    public org.museframework.bian.probroagr.dto.bq.RegulatoryTerms getRegulatoryTerms() {
        return regulatoryTerms;
    }
}