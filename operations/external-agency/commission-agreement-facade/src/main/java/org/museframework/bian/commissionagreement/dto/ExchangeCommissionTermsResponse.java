package org.museframework.bian.commissionagreement.dto;

public class ExchangeCommissionTermsResponse {
    private org.museframework.bian.commissionagreement.dto.bq.CommissionTerms commissionTerms;

    public void setCommissionTerms(org.museframework.bian.commissionagreement.dto.bq.CommissionTerms commissionTerms) {
        this.commissionTerms = commissionTerms;
    }

    public org.museframework.bian.commissionagreement.dto.bq.CommissionTerms getCommissionTerms() {
        return commissionTerms;
    }
}