package org.museframework.bian.salproagr.dto;

public class UpdateLegalTermsResponse {
    private org.museframework.bian.salproagr.dto.bq.LegalTerms legalTerms;

    public void setLegalTerms(org.museframework.bian.salproagr.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.salproagr.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}