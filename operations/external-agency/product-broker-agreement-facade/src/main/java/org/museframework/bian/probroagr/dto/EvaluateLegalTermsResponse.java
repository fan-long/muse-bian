package org.museframework.bian.probroagr.dto;

public class EvaluateLegalTermsResponse {
    private org.museframework.bian.probroagr.dto.bq.LegalTerms legalTerms;

    public void setLegalTerms(org.museframework.bian.probroagr.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.probroagr.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}