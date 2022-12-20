package org.museframework.bian.customeragreement.dto;

public class RetrieveRegulatoryTermsResponse {
    private org.museframework.bian.customeragreement.dto.bq.RegulatoryTerms regulatoryTerms;

    public void setRegulatoryTerms(org.museframework.bian.customeragreement.dto.bq.RegulatoryTerms regulatoryTerms) {
        this.regulatoryTerms = regulatoryTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.RegulatoryTerms getRegulatoryTerms() {
        return regulatoryTerms;
    }
}