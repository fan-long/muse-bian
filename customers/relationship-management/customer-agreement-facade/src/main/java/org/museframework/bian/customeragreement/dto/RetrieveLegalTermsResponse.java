package org.museframework.bian.customeragreement.dto;

public class RetrieveLegalTermsResponse {
    private org.museframework.bian.customeragreement.dto.bq.LegalTerms legalTerms;

    public void setLegalTerms(org.museframework.bian.customeragreement.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}